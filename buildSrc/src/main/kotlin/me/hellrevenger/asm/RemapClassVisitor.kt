package me.hellrevenger.asm


import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.signature.SignatureReader
import org.objectweb.asm.signature.SignatureVisitor
import java.io.File

class RemapClassVisitor(
    val outputDirectory: File,
    val extensionName: String,
    val remapper: Remapper) : ClassVisitor(Opcodes.ASM9) {

    override fun visit(
        version: Int,
        access: Int,
        name: String,
        signature: String?,
        superName: String?,
        interfaces: Array<out String>?
    ) {
        remapper.getSimpleClassName(name)
        SignatureReader(signature)
        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitMethod(
        access: Int,
        name: String?,
        descriptor: String?,
        signature: String?,
        exceptions: Array<out String>?
    ): MethodVisitor {
        return super.visitMethod(access, name, descriptor, signature, exceptions)
    }

    override fun visitField(
        access: Int,
        name: String?,
        descriptor: String?,
        signature: String?,
        value: Any?
    ): FieldVisitor {
        return super.visitField(access, name, descriptor, signature, value)
    }
}

class ClassInstance

class MethodInstance

class RemapMethodVisitor : MethodVisitor(Opcodes.ASM9) {
    override fun visitParameter(name: String?, access: Int) {
        super.visitParameter(name, access)
    }
}

class MySignatureVisitor : SignatureVisitor(Opcodes.ASM9) {
    val visits = arrayListOf<VisitType>()
    val signs = arrayListOf<String>()

    val classGenerics = arrayListOf<String>()
    val methodGenerics = arrayListOf<String>()
    val boundGenerics = arrayListOf<String>()

    val parameters = arrayListOf<String>()
    var returnType = ""

    var hasFormals = false

    override fun visitFormalTypeParameter(name: String) {
        // bind generic
        hasFormals = true
        visits.add(VisitType.Bind)
        signs.add(name)
        super.visitFormalTypeParameter(name)
    }

    override fun visitClassBound(): SignatureVisitor {
        visits.add(VisitType.ClassBound)
        pop()
        return super.visitClassBound()
    }

    override fun visitInterfaceBound(): SignatureVisitor {
        visits.add(VisitType.InterfaceBound)
        pop()
        return super.visitInterfaceBound()
    }

    override fun visitSuperclass(): SignatureVisitor {
        endFormals()
        visits.add(VisitType.Superclass)
        return super.visitSuperclass()
    }

    override fun visitInterface(): SignatureVisitor {
        visits.add(VisitType.Interface)
        return super.visitInterface()
    }

    override fun visitEnd() {
        visits.add(VisitType.End)
        pop()
        super.visitEnd()
    }

    override fun visitBaseType(descriptor: Char) {
        signs.add(baseTypes[descriptor]!!)
        pop()
        super.visitBaseType(descriptor)
    }

    override fun visitInnerClassType(name: String) {
        signs.add(name)
        pop()
        super.visitInnerClassType(name)
    }

    override fun visitClassType(name: String) {
        signs.add(name)
        pop()
        super.visitClassType(name)
    }

    // class with generic *
    override fun visitTypeArgument() {
        visits.add(VisitType.TypeArgument)
        signs.add("*")
        pop()
        super.visitTypeArgument()
    }

    // class with generic +-=
    override fun visitTypeArgument(wildcard: Char): SignatureVisitor {
        visits.add(VisitType.TypeArgument)
        val sign = when (wildcard) {
            '-' -> "in "
            '+' -> "out "
            '=' -> ""
            else -> ""
        }
        signs.add(sign)
        return super.visitTypeArgument(wildcard)
    }

    // generic
    override fun visitTypeVariable(name: String) {
        signs.add(name)
        pop()
        super.visitTypeVariable(name)
    }

    override fun visitArrayType(): SignatureVisitor {
        visits.add(VisitType.Array)
        return super.visitArrayType()
    }

    override fun visitParameterType(): SignatureVisitor {
        endFormals()
        visits.add(VisitType.Parameter)
        return super.visitParameterType()
    }

    override fun visitReturnType(): SignatureVisitor {
        endFormals()
        visits.add(VisitType.ReturnType)
        return super.visitReturnType()
    }

    private fun endFormals() {
        if(hasFormals) {
            hasFormals = false
            pop()
        }
    }

    fun pop() {
        val sign = signs.removeAt(signs.size-1)
        when(visits.removeAt(visits.size - 1)) {
            VisitType.Array -> {
                if(sign in baseTypes.values) {
                    signs.add("${sign}Array")
                } else {
                    signs.add("Array<$sign>")
                }
                pop()
            }
            VisitType.Bind -> {
                while (signs.isNotEmpty()) {
                    boundGenerics.add(signs.removeAt(0).substring(1))
                }
            }
            VisitType.ClassBound -> {
                signs.add("S$sign")
            }
            VisitType.InterfaceBound -> {
                signs.add("I$sign")
            }
            VisitType.TypeArgument -> {
                val bound = signs.removeAt(signs.size-1)
                signs.add("$bound $sign")
            }
            VisitType.Interface, VisitType.Superclass -> {

            }
            VisitType.Parameter -> {
                parameters.add(sign)
            }
            VisitType.ReturnType -> {
                returnType = sign
            }
            VisitType.ExceptionType -> {
            }
            VisitType.End -> {
                val generics = arrayListOf<String>()
                signs.add(sign)
                while (visits.last() == VisitType.TypeArgument) {
                    pop()
                    generics.add(signs.removeAt(signs.size - 1))
                }
                signs.add("<${generics.joinToString()}>")
                pop()
            }
        }
    }
}

enum class VisitType {
    Bind,
    ClassBound,
    InterfaceBound,
    Superclass,
    Interface,
    Parameter,
    ReturnType,
    ExceptionType,

    Array,
    TypeArgument,
    End,
}

val baseTypes = mapOf(
    'B' to "Byte",
    'C' to "Char",
    'D' to "Double",
    'F' to "Float",
    'I' to "Int",
    'J' to "Long",
    'S' to "Short",
    'V' to "Void",
    'Z' to "Boolean",
)