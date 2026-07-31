package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform

import me.hellrevenger.jsmacroskotlinscript.script.library.api.ScriptHolder
import net.lenni0451.classtransform.annotations.CShadow
import net.lenni0451.classtransform.annotations.CSlice
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.annotations.injection.CModifyExpressionValue
import net.lenni0451.classtransform.annotations.injection.CRedirect
import net.lenni0451.classtransform.annotations.injection.CWrapCondition
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.IincInsnNode
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LdcInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.TypeInsnNode
import org.objectweb.asm.tree.VarInsnNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.Frame
import org.objectweb.asm.tree.analysis.SourceInterpreter
import org.objectweb.asm.tree.analysis.SourceValue
import java.lang.annotation.RetentionPolicy
import kotlin.reflect.KClass



val C_ANNOTATION_PREFIX = "Lnet/lenni0451/classtransform/annotations/injection/C"

val C_TRANSFORMER_NAME = getAnnotationName(CTransformer::class)

val C_INJECT_NAME = getAnnotationName(CInject::class)
val C_MODIFY_EXPRESSION_VALUE_NAME = getAnnotationName(CModifyExpressionValue::class)
val C_REDIRECT_NAME = getAnnotationName(CRedirect::class)
val C_WRAP_CONDITION_NAME = getAnnotationName(CWrapCondition::class)

val C_SLICE_NAME = getAnnotationName(CSlice::class)
val C_TARGET_NAME = getAnnotationName(CTarget::class)

val C_SHADOW_NAME = getAnnotationName(CShadow::class)

class KnownIllegalStateException(message: String) : IllegalStateException(message)

/**
 * Remove `final` flag from parameter
 */
@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class RemoveFinal

@Retention(AnnotationRetention.BINARY)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.FIELD)
annotation class ScriptStatic

interface IRequireScriptHolderSetter {
    fun setRequireScriptHolder()
}


fun getAnnotationName(annotation: KClass<*>) = "L" + annotation.java.name.replace(".","/") + ";"

fun removeThisForStaticMethod(currentClass: String, method: MethodNode) {
    method.localVariables?.toList()?.forEach  { localVariableNode ->
        localVariableNode.index -= 1
        if (localVariableNode.index < 0 || localVariableNode.name == "this") {
            method.localVariables.remove(localVariableNode)
        }
    }
    for(inst in method.instructions.iterator()) {
        if (inst is VarInsnNode) {
            inst.`var` = inst.`var` - 1
            if (inst.`var` < 0) throw IllegalArgumentException("$currentClass.${method.name} is accessing this")
        }
        if (inst is IincInsnNode) {
            inst.`var` = inst.`var` - 1
            if (inst.`var` < 0) throw IllegalArgumentException("$currentClass.${method.name} is accessing this") // i think this will never happen
        }
    }
}

fun generateScriptInstanceGetter(methodNode: MethodNode, requireScriptHolderSetter: IRequireScriptHolderSetter) {
    var success = true
    while (success) {
        success = false
        for(inst in methodNode.instructions.iterator()) {
            if (inst.opcode != Opcodes.ALOAD) {
                continue
            }

            val varInst = inst as VarInsnNode
            if (varInst.`var` != 0 || varInst.next.opcode != Opcodes.GETFIELD) {
                continue
            }
            val fieldInst = varInst.next as FieldInsnNode
            if (fieldInst.name != "this$0") {
                continue
            }
            val il = InsnList()

            il.add(LdcInsnNode(fieldInst.desc.substring(1, fieldInst.desc.length - 1)))
            il.add(
                MethodInsnNode(
                    Opcodes.INVOKESTATIC,
                    ScriptHolder::class.java.name.replace(".", "/"),
                    "get",
                    "(Ljava/lang/String;)Ljava/lang/Object;"
                )
            )
            il.add(TypeInsnNode(Opcodes.CHECKCAST, fieldInst.desc.substring(1, fieldInst.desc.length - 1)))

            val extraRemove = if (fieldInst.next.opcode == Opcodes.GETFIELD) {
                val fieldInst2 = fieldInst.next as FieldInsnNode
                il.add(LdcInsnNode(fieldInst2.name))
                il.add(
                    MethodInsnNode(
                        Opcodes.INVOKESTATIC,
                        "me.hellrevenger.jsmacroskotlinscript.script.library.api.KtReflect".replace(
                            ".",
                            "/"
                        ) + "Kt",
                        "_getPrivateValue",
                        "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"
                    )
                )
                il.add(TypeInsnNode(Opcodes.CHECKCAST, fieldInst2.desc.substring(1, fieldInst2.desc.length - 1)))
                fieldInst2
            } else {
                null
            }

            methodNode.instructions.insertBefore(varInst, il)
            methodNode.instructions.remove(varInst)
            methodNode.instructions.remove(fieldInst)
            extraRemove?.let { methodNode.instructions.remove(it) }
            success = true
            requireScriptHolderSetter.setRequireScriptHolder()
            break
        }
    }
}

fun MethodNode.forEach(owner: String, block: (AbstractInsnNode, Frame<SourceValue>) -> Boolean) {
    val analyzer = Analyzer(SourceInterpreter())
    analyzer.analyze(owner, this)
    var i = -1
    for(frame in analyzer.frames) {
        i++
        if (frame == null) continue
        if(!block(instructions.get(i), frame)) break
    }
}

fun ClassNode.copy() = ClassNode().apply { this@copy.accept(this) }