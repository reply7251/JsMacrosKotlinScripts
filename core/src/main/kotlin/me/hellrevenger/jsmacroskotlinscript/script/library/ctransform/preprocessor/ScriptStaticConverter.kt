package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import me.hellrevenger.jsmacroskotlinscript.script.library.api.ScriptHolder
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.IRequireScriptHolderSetter
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.ScriptStatic
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.generateScriptInstanceGetter
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.getAnnotationName
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.removeThisForStaticMethod
import net.lenni0451.classtransform.annotations.injection.CModifyExpressionValue
import net.lenni0451.classtransform.transformer.IAnnotationHandlerPreprocessor
import net.lenni0451.classtransform.transformer.impl.CModifyExpressionValueAnnotationHandler
import net.lenni0451.classtransform.transformer.impl.CRedirectAnnotationHandler
import net.lenni0451.classtransform.transformer.impl.CWrapConditionAnnotationHandler
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LdcInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TypeInsnNode
import org.objectweb.asm.tree.VarInsnNode
import java.lang.reflect.Modifier
import kotlin.collections.iterator

class ScriptStaticConverter(val requireScriptHolderSetter: IRequireScriptHolderSetter) : ForEachMethodPreprocessor() {
    companion object {
        val SCRIPT_STATIC_NAME = getAnnotationName(ScriptStatic::class)
    }
    var processAll = false
    var currentClass = ""
    var companionName = $$"$Companion"
    val fieldsToStatic = mutableSetOf<String>()

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

            super.process(node)
        }
    }

    override fun process(method: MethodNode) {
        if (Modifier.isStatic(method.access)) return
        if (!processAll && !method.invisibleAnnotations.hasScriptStatic()) return
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
            for (inst in method.instructions) {
                if (inst !is MethodInsnNode) continue
                if (inst.owner == currentClass && (inst.opcode == Opcodes.INVOKEVIRTUAL || (inst.opcode == Opcodes.INVOKESPECIAL && inst.name != "<init>"))) {
                    inst.opcode = Opcodes.INVOKESTATIC
                    success = true
                    break
                }
                if (inst.owner == companionName && inst.opcode == Opcodes.INVOKESTATIC) {
                    inst.owner = currentClass
                    inst.name = inst.name.removePrefix("access$")
                    if (inst.desc.startsWith("(L$companionName;")) {
                        inst.desc = "(" + inst.desc.substringAfter("(L$companionName;")

                        success = true
                        break
                    }
                }
            }
        }
    }

    fun convertStaticFieldCalls(method: MethodNode) {
        var success = true
        while (success) {
            success = false
            for (inst in method.instructions) {
                if (inst is FieldInsnNode && inst.owner == currentClass) {
                    if (inst.opcode == Opcodes.GETFIELD) {
                        inst.opcode = Opcodes.GETSTATIC
                    } else if (inst.opcode == Opcodes.PUTFIELD) {
                        inst.opcode = Opcodes.PUTSTATIC
                    } else continue
                    success = true
                    break
                }

            }
        }
    }

    private fun List<AnnotationNode>?.hasScriptStatic() = this?.any { it.desc == SCRIPT_STATIC_NAME } == true
}