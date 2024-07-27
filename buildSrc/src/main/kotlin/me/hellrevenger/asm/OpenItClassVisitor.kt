package me.hellrevenger.asm

import org.objectweb.asm.*
import java.lang.reflect.Modifier

class OpenItClassVisitor(parentVisitor: ClassVisitor? = null) : ClassVisitor(Opcodes.ASM9, parentVisitor) {
    private fun makePublic(access: Int) =
        if (Modifier.isPrivate(access)) access
        else Modifier.PUBLIC or (access and Modifier.PROTECTED.inv())

    override fun visit(
        version: Int,
        access: Int,
        name: String?,
        signature: String?,
        superName: String?,
        interfaces: Array<out String>?
    ) {
        super.visit(version, makePublic(access), name, signature, superName, interfaces)
    }

    override fun visitMethod(
        access: Int,
        name: String?,
        descriptor: String?,
        signature: String?,
        exceptions: Array<out String>?
    ): MethodVisitor {
        return super.visitMethod(makePublic(access), name, descriptor, signature, exceptions)
    }

    override fun visitField(
        access: Int,
        name: String?,
        descriptor: String?,
        signature: String?,
        value: Any?
    ): FieldVisitor {
        return super.visitField(makePublic(access), name, descriptor, signature, value)
    }

    override fun visitInnerClass(name: String?, outerName: String?, innerName: String?, access: Int) {
        super.visitInnerClass(name, outerName, innerName, makePublic(access))
    }

    override fun visitModule(name: String?, access: Int, version: String?): ModuleVisitor {
        return super.visitModule(name, makePublic(access), version)
    }
}