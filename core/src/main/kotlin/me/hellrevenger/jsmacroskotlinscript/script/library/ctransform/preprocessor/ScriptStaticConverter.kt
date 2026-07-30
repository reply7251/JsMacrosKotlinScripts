package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.IRequireScriptHolderSetter
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.ScriptStatic
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.forEach
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.generateScriptInstanceGetter
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.getAnnotationName
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.removeThisForStaticMethod
import net.lenni0451.classtransform.utils.Types
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import java.lang.reflect.Modifier

class ScriptStaticConverter(val requireScriptHolderSetter: IRequireScriptHolderSetter) : ForEachMethodPreprocessor() {
    companion object {
        val SCRIPT_STATIC_NAME = getAnnotationName(ScriptStatic::class)
    }
    var processAll = false
    var currentClass = ""
    var companionName = $$"$Companion"
    val fieldsToStatic = mutableSetOf<String>()
    val methodsToStatic = mutableSetOf<String>()

    override fun process(node: ClassNode) {
        currentClass = node.name
        companionName = $$"$$currentClass$Companion"
        if (!Modifier.isStatic(node.access)) {
            processAll = node.invisibleAnnotations.hasScriptStatic()
            if (processAll) {
                node.access = node.access or Modifier.STATIC
                processAll = true
            }

            node.fields.removeIf { it.name == "Companion" && Modifier.isStatic(it.access) }
            for (field in node.fields) {
                if (processAll || field.invisibleAnnotations.hasScriptStatic()) {
                    field.access = node.access or Modifier.STATIC
                    fieldsToStatic.add(field.name)
                }
            }
            for (method in node.methods) {
                if (processAll || method.invisibleAnnotations.hasScriptStatic()) {
                    methodsToStatic.add(method.name + method.desc)
                }
            }

            super.process(node)
        }
    }

    override fun process(method: MethodNode) {
        if (Modifier.isStatic(method.access)) return
        if (!processAll && !method.invisibleAnnotations.hasScriptStatic()) {
            convertStaticFieldCalls(method)
            convertStaticMethodCalls(method)
            return
        }
        method.access = method.access or Modifier.STATIC

        generateScriptInstanceGetter(method, requireScriptHolderSetter)

        convertStaticFieldCalls(method)
        convertStaticMethodCalls(method)
        removeCompanionCall(method)

        removeThisForStaticMethod(currentClass, method)
    }

    fun removeCompanionCall(method: MethodNode) {
        var success = true
        while (success) {
            success = false
            for (inst in method.instructions) {
                if (inst.opcode != Opcodes.GETSTATIC) continue
                val fieldInst = inst as FieldInsnNode
                if (fieldInst.owner == currentClass && fieldInst.name == "Companion") {
                    method.instructions.remove(inst)
                    success = true
                    break
                }
            }
        }
    }

    fun convertStaticMethodCalls(method: MethodNode) {
        var success = true
        while (success) {
            success = false

            method.forEach(currentClass) { inst, frame ->
                if (inst !is MethodInsnNode) return@forEach true
                if (inst.owner == currentClass
                    && (inst.opcode == Opcodes.INVOKEVIRTUAL || (inst.opcode == Opcodes.INVOKESPECIAL && inst.name != "<init>"))
                    && (inst.name + inst.desc) in methodsToStatic
                ) {
                    inst.opcode = Opcodes.INVOKESTATIC
                    success = true
                } else if (inst.owner == companionName && inst.opcode == Opcodes.INVOKESTATIC) {
                    inst.owner = currentClass
                    inst.name = inst.name.removePrefix("access$")
                    if (inst.desc.startsWith("(L$companionName;")) {
                        inst.desc = "(" + inst.desc.substringAfter("(L$companionName;")

                        success = true
                    }
                }
                if (success) {
                    val thisStack = frame.getStack(frame.stackSize - 1 - Types.argumentTypes(inst.desc).size)
                    for (inst2 in thisStack.insns) {
                        method.instructions.remove(inst2)
                    }
                }

                !success
            }
        }
    }

    fun convertStaticFieldCalls(method: MethodNode) {
        var success = true
        while (success) {
            success = false

            method.forEach(currentClass) { inst, frame ->
                if (inst is FieldInsnNode && inst.owner == currentClass && inst.name in fieldsToStatic) {
                    val thisStack = if (inst.opcode == Opcodes.GETFIELD) {
                        inst.opcode = Opcodes.GETSTATIC
                        frame.getStack(frame.stackSize - 1)
                    } else if (inst.opcode == Opcodes.PUTFIELD) {
                        inst.opcode = Opcodes.PUTSTATIC
                        frame.getStack(frame.stackSize - 2)
                    } else return@forEach true
                    for (inst2 in thisStack.insns) {
                        method.instructions.remove(inst2)
                    }
                    success = true
                    return@forEach false
                }
                true
            }
        }
    }

    private fun List<AnnotationNode>?.hasScriptStatic() = this?.any { it.desc == SCRIPT_STATIC_NAME } == true
}