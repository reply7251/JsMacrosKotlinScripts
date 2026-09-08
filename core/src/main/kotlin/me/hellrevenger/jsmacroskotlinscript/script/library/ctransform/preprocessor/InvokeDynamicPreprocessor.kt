package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import com.google.common.collect.MapMaker
import me.hellrevenger.jsmacroskotlinscript.JsMacrosKotlinScript
import me.hellrevenger.jsmacroskotlinscript.script.library.api.ScriptHolder
import me.hellrevenger.jsmacroskotlinscript.script.library.api.slash
import net.lenni0451.classtransform.utils.Types
import org.objectweb.asm.Handle
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.InvokeDynamicInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.VarInsnNode
import java.lang.invoke.CallSite
import java.lang.invoke.ConstantCallSite
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

class InvokeDynamicPreprocessor : ForEachMethodPreprocessor() {
    var owner: String? = null

    val requiredClasses = mutableSetOf<String>()

    var currentClass = ""

    override fun process(node: ClassNode) {
        currentClass = node.name
        super.process(node)
    }

    override fun process(method: MethodNode) {
        val owner = owner ?: return

        removeThis(method)

        var success = true
        while (success) {
            success = false

            for(inst in method.instructions) {
                if (inst !is MethodInsnNode) continue
                if (!inst.owner.contains(owner)) continue
                // Transformer itself (@CShadow)
                if (inst.owner.contains(currentClass)) continue

                val toRemove: MutableList<AbstractInsnNode> = mutableListOf(inst)

                val invokeDynamic = if (inst.opcode == Opcodes.INVOKESPECIAL && inst.name == "<init>") {
                    if (inst.previous.opcode != Opcodes.DUP || inst.previous.previous.opcode != Opcodes.NEW) continue
                    toRemove.add(inst.previous)
                    toRemove.add(inst.previous.previous)
                    val newDesc = Types.methodDescriptor(
                        Types.T_Object,
                        *Types.argumentTypes(inst.desc).filter { it.internalName != owner }.map { it.replaceOwnerWithAny() }.toTypedArray()
                    )


                    InvokeDynamicInsnNode(
                        "invoke",
                        newDesc,
                        Bootstrap.handleConstructor,
                        inst.owner,
                        inst.desc
                    )
                } else if (inst.opcode == Opcodes.INVOKEVIRTUAL) {
                    if (inst.owner == owner) {
                        val newDesc = Types.methodDescriptor(
                            Types.returnType(inst.desc).replaceOwnerWithAny(),
                            *Types.argumentTypes(inst.desc).map { it.replaceOwnerWithAny() }.toTypedArray()
                        )

                        InvokeDynamicInsnNode(
                            inst.name,
                            newDesc,
                            Bootstrap.handle,
                            owner,
                            inst.desc,
                            1
                        )
                    } else {
                        requiredClasses.add(inst.owner)
                        val newDesc = Types.methodDescriptor(
                            Types.returnType(inst.desc).replaceOwnerWithAny(),
                            Types.T_Object, // caller in stack
                            *Types.argumentTypes(inst.desc).map { it.replaceOwnerWithAny() }.toTypedArray()
                        )
                        InvokeDynamicInsnNode(
                            inst.name,
                            newDesc,
                            Bootstrap.handle,
                            inst.owner,
                            inst.desc,
                            0
                        )
                    }
                } else continue

                method.instructions.insertBefore(inst, invokeDynamic)
                toRemove.forEach(method.instructions::remove)
                success = true
            }
        }
    }

    private fun Type.replaceOwnerWithAny(): Type {
        if (this.internalName.contains(owner!!)) {
            return Types.T_Object
        }
        return this
    }

    fun removeThis(method: MethodNode) {
        var success = true
        while (success) {
            success = false

            for(inst in method.instructions) {
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

                // only providedProperties are field access
                if (fieldInst.next.opcode == Opcodes.GETFIELD) {
                    val fieldInst2 = fieldInst.next as FieldInsnNode

                    method.instructions.insertBefore(fieldInst, InvokeDynamicInsnNode(
                        fieldInst2.name,
                        "()" + fieldInst2.desc,
                        Bootstrap.handleField,
                        owner
                    ))
                    method.instructions.remove(fieldInst.next)

                }

                method.instructions.remove(varInst)
                method.instructions.remove(fieldInst)

                success = true
            }
        }
    }

}

object Bootstrap {
    val name = this::class.java.name.slash()

    val handle = Handle(
        Opcodes.H_INVOKESTATIC,
        name,
        "bootstrap",
        $$"(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/invoke/CallSite;",
        false
    )

    val handleConstructor = Handle(
        Opcodes.H_INVOKESTATIC,
        name,
        "bootstrapConstructor",
        $$"(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/invoke/CallSite;",
        false
    )

    val handleField = Handle(
        Opcodes.H_INVOKESTATIC,
        name,
        "bootstrapField",
        $$"(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;)Ljava/lang/invoke/CallSite;",
        false
    )

    val callSites = MapMaker().weakValues().makeMap<String, CallSite>()

    @JvmStatic
    fun bootstrap(lookup: MethodHandles.Lookup, name: String, methodType: MethodType, owner: String, desc: String, flag: Int): CallSite {
        val key = "$owner|$name|$desc|$flag"
        callSites[key]?.let { return it }

        val instance = ScriptHolder.get(owner)!!
        val klass = if (flag > 0) instance::class.java else instance as Class<*>

        val argumentTypes = Types.argumentTypes(desc)
        val method = try {
            klass.getDeclaredMethod(name, *methodType.parameterArray())
        } catch (e: NoSuchMethodException) {
            klass.declaredMethods.find { it.name == name && Types.argumentTypes(it).contentEquals(argumentTypes) }
        }

        if (method == null) {
            JsMacrosKotlinScript.LOG.error("Could not find method $name($desc)")
            throw NoSuchMethodException("$name($desc)")
        }
        method.trySetAccessible()

        val handle = lookup.unreflect(method).let {
            if (flag > 0) {
                it.bindTo(instance)
            } else {
                it
            }
        }.asType(methodType)
        return ConstantCallSite(handle).apply {
            callSites[key] = this
        }
    }

    @JvmStatic
    fun bootstrapConstructor(lookup: MethodHandles.Lookup, name: String, methodType: MethodType, owner: String, desc: String): CallSite {
        val key = owner
        callSites[key]?.let { return it }

        val instance = ScriptHolder.get(owner.substringBefore("$"))!!
        val klass = ScriptHolder.get(owner)!! as Class<*>

        val constructor = try {
            klass.getDeclaredConstructor(*methodType.parameterArray())
        } catch (e: NoSuchMethodException) {
            klass.declaredConstructors.find { Type.getConstructorDescriptor(it) == desc}
        }
        if (constructor == null) {
            JsMacrosKotlinScript.LOG.error("Could not find constructor $owner($desc)")
            throw NoSuchMethodException("$owner($desc)")
        }
        constructor.trySetAccessible()

        val handle = lookup.unreflectConstructor(constructor).bindTo(instance).asType(methodType)
        return ConstantCallSite(handle).apply {
            callSites[key] = this
        }
    }

    @JvmStatic
    fun bootstrapField(lookup: MethodHandles.Lookup, name: String, methodType: MethodType, owner: String): CallSite {
        val key = "$owner|$name"
        callSites[key]?.let { return it }
        val instance = ScriptHolder.get(owner)!!
        val field = instance::class.java.getDeclaredField(name)
        field.trySetAccessible()

        val handle = lookup.unreflectGetter(field).bindTo(instance)
        return ConstantCallSite(handle).apply {
            callSites[key] = this
        }
    }
}