package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.preprocessor

import me.hellrevenger.jsmacroskotlinscript.script.library.api.CTargetType
import me.hellrevenger.jsmacroskotlinscript.script.library.api.getBytes
import me.hellrevenger.jsmacroskotlinscript.script.library.api.instrumentation
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.C_INJECT_NAME
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.C_MODIFY_EXPRESSION_VALUE_NAME
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.C_REDIRECT_NAME
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.C_TRANSFORMER_NAME
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.C_WRAP_CONDITION_NAME
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.copy
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.TransformerManager
import net.lenni0451.classtransform.annotations.CSlice
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.transformer.impl.CModifyExpressionValueAnnotationHandler
import net.lenni0451.classtransform.transformer.impl.CRedirectAnnotationHandler
import net.lenni0451.classtransform.transformer.impl.CWrapConditionAnnotationHandler
import net.lenni0451.classtransform.utils.ASMUtils
import net.lenni0451.classtransform.utils.Types
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import java.lang.reflect.Modifier

@Suppress("UNCHECKED_CAST")
class AnnotationChecker(val manager: TransformerManager) : ForEachMethodPreprocessor() {
    companion object {
        private val METHOD_DECLARATION_PATTERN = ASMUtils.METHOD_DECLARATION_PATTERN.toRegex()
        private val singleTargetAnnotations = setOf(C_MODIFY_EXPRESSION_VALUE_NAME, C_REDIRECT_NAME)
        private val multipleTargetsAnnotations = setOf(C_INJECT_NAME, C_WRAP_CONDITION_NAME)
        private val checkStaticAnnotations = setOf(C_INJECT_NAME, C_MODIFY_EXPRESSION_VALUE_NAME, C_WRAP_CONDITION_NAME)
        private val INJECTION_CALLBACK_TYPE = Types.type(InjectionCallback::class.java)
    }

    private val targetClasses = mutableSetOf<Class<*>>()

    private val targetClassMap = mutableMapOf<Class<*>, ClassNode>()

    private val foundMethods = mutableMapOf<ClassNode, List<MethodNode>>()
    private val foundInjectionTargets = mutableMapOf<MethodNode, List<AbstractInsnNode>>()

    private lateinit var transformerName: String
    private lateinit var transformerClass: ClassNode
    private lateinit var transformerMethod: MethodNode

    override fun process(node: ClassNode) {
        transformerClass = node.copy()

        transformerName = transformerClass.name
        targetClasses.clear()
        targetClassMap.clear()

        val annotations = transformerClass.invisibleAnnotations
        annotations?.find { it.desc == C_TRANSFORMER_NAME }?.let { annotation ->
            val classNames = mutableSetOf<String>()
            annotation.get<List<Type>>("value")?.let { types ->
                classNames.addAll(types.map { manager.mapper.mapClassName(it.className) })
            }
            annotation.get<List<String>>("name")?.let {
                classNames.addAll(it.map(manager.mapper::mapClassName))
            }
            for(clazz in instrumentation.allLoadedClasses) {
                if (clazz.name in classNames) {
                    targetClasses.add(clazz)
                }
            }
        }

        targetClasses.forEach { targetClass ->
            targetClassMap[targetClass] = ASMUtils.fromBytes(targetClass.getBytes())
        }

        super.process(transformerClass)
    }

    override fun process(method: MethodNode) {
        foundMethods.clear()
        foundInjectionTargets.clear()
        transformerMethod = method

        val annotations = method.invisibleAnnotations
        annotations?.find {
            it.desc.startsWith("Lnet/lenni0451/classtransform/annotations/injection/C")
        }?.let { annotation ->
            processMultipleTargetsAnnotation(method, annotation)
            processSingleTargetAnnotation(method, annotation)
        }
    }

    private fun processCTarget(methodNode: MethodNode, annotations: List<CTarget>, slice: CSlice?) {
        for (cTarget in annotations) { // CTarget
            val injectionTarget = manager.injectionTargets[cTarget.value] ?: throw IllegalArgumentException("$transformerName.${methodNode.name}: unknown CTarget: ${cTarget.value}")

            val targets = injectionTarget.getTargets(manager.injectionTargets, methodNode, cTarget, slice)
            foundInjectionTargets[methodNode] = targets

            if (targets.isNullOrEmpty() && !cTarget.optional) {
                val candidates = mutableSetOf<String>()
                val declaration = ASMUtils.splitMemberDeclaration(cTarget.target)
                when (cTarget.value) {
                    CTargetType.FIELD, CTargetType.GET_FIELD, CTargetType.PUT_FIELD -> {
                        val name = declaration?.name ?: cTarget.target
                        for (inst in methodNode.instructions.iterator()) {
                            if (inst !is FieldInsnNode || inst.name != name) continue
                            // owner=package/Class desc=LClass;
                            if (cTarget.value.isIn(CTargetType.FIELD, CTargetType.GET_FIELD)) {
                                if (inst.opcode.isIn(Opcodes.GETFIELD, Opcodes.GETSTATIC)) {
                                    candidates.add("${inst.owner}.${inst.name}:${inst.desc}")
                                }
                            }
                            if (cTarget.value.isIn(CTargetType.FIELD, CTargetType.PUT_FIELD)) {
                                if (inst.opcode.isIn(Opcodes.PUTFIELD, Opcodes.PUTSTATIC)) {
                                    candidates.add("${inst.owner}.${inst.name}:${inst.desc}")
                                }
                            }
                        }
                    }
                    CTargetType.INVOKE -> {
                        val name = declaration?.name ?: cTarget.target
                        // owner=package/Class desc=(LClass;)LClass;
                        for (inst in methodNode.instructions.iterator()) {
                            if (inst !is MethodInsnNode || inst.name != name) continue
                            candidates.add("${inst.owner}.${inst.name}${inst.desc}")
                        }
                    }
                }
                if (candidates.isNotEmpty()) {
                    throw IllegalArgumentException("$transformerName -> ${methodNode.name}: invalid CTarget: ${cTarget.target}, candidates: $candidates")
                }
            }
        }
    }

    private fun processCInject(transformerMethod: MethodNode, annotation: AnnotationNode) {
        if (annotation.desc != C_INJECT_NAME) return

        val cTargets = annotation.get<List<AnnotationNode>>("target")?.map { it.toCTarget() }
            ?: throw IllegalArgumentException("$transformerName.${transformerMethod.name}: CInject doesn't have target")

        processCAnnotationWithMethods(annotation, cTargets)
        for ((classNode, methods) in foundMethods) {
            for (method in methods) {
                if (Types.returnType(transformerMethod.desc) != Type.VOID_TYPE)
                    throw IllegalArgumentException("$transformerName.${transformerMethod.name} returns something")

                manager.coprocessors.preprocess(manager, classNode, method, transformerClass, transformerMethod)

                val paramTypes = Types.argumentTypes(method.desc)
                val transformerParamTypes = Types.argumentTypes(transformerMethod.desc)
                if (transformerParamTypes.isEmpty()) continue
                if (transformerParamTypes.size == 1 && ASMUtils.compareType(paramTypes[0], INJECTION_CALLBACK_TYPE)) continue
                if (ASMUtils.compareTypes(paramTypes, transformerParamTypes)) continue
                if (ASMUtils.compareTypes(paramTypes, transformerParamTypes, false, INJECTION_CALLBACK_TYPE)) continue
                if (ASMUtils.compareType(transformerParamTypes.last(), INJECTION_CALLBACK_TYPE)) {
                    throw illegalArgument(method, "has different param types and cannot match: ${transformerParamTypes.toList().dropLast(1).joinToString()} vs ${paramTypes.joinToString()}")
                }
                throw illegalArgument(method, "has different param types and cannot match: ${transformerParamTypes.joinToString()} vs ${paramTypes.joinToString()}")
            }
        }
    }
    private fun processMultipleTargetsAnnotation(transformerMethod: MethodNode, annotation: AnnotationNode) {
        if (annotation.desc !in multipleTargetsAnnotations) return

        val cTargets = annotation.get<List<AnnotationNode>>("target")?.map { it.toCTarget() }
            ?: throw IllegalArgumentException("$transformerName.${transformerMethod.name}: CInject doesn't have target")

        processCAnnotationWithMethods(annotation, cTargets)

        checkStatic(transformerMethod, annotation)

        processCInject(transformerMethod, annotation)
        processCWrapCondition(transformerMethod, annotation)
    }

    private fun processSingleTargetAnnotation(transformerMethod: MethodNode, annotation: AnnotationNode) {
        if (annotation.desc !in singleTargetAnnotations) return

        val cTarget = annotation.get<AnnotationNode>("target")?.toCTarget()
            ?: throw IllegalArgumentException("$transformerName: ${annotation.getName()} doesn't have target")

        processCAnnotationWithMethods(annotation, listOf(cTarget))

        checkStatic(transformerMethod, annotation)

        processCRedirect(transformerMethod, annotation)
        processCModifyExpressionValue(transformerMethod, annotation)
    }

    private fun processCAnnotationWithMethods(annotation: AnnotationNode, cTargets: List<CTarget>) {
        val annotationName = annotation.getName()
        val methodPatterns = annotation.get<List<String>>("method")
            ?: throw IllegalArgumentException("$transformerName: $annotationName doesn't have method")
        val cSlice = annotation.get<AnnotationNode>("slice")?.toCSlice()

        for (methodPattern in methodPatterns) {
            val patternMatcher = createMethodPatternMatcher(methodPattern)
            for (targetClass in targetClassMap.values) {
                val methods = patternMatcher(targetClass)
                if (methods.isEmpty()) {
                    val candidates = getCandidateMethodPatterns(targetClass, methodPattern)
                    if (candidates.isNotEmpty()) {
                        throw IllegalArgumentException("$transformerName: $annotationName cannot find method $methodPattern, candidates: $candidates")
                    }
                    throw IllegalArgumentException("$transformerName: $annotationName cannot find method $methodPattern")
                } else {
                    for (method in methods) {

                        processCTarget(method,cTargets, cSlice)
                    }
                    foundMethods[targetClass] = methods
                }
            }
        }
    }

    private fun processCRedirect(transformerMethod: MethodNode, annotation: AnnotationNode) {
        if (annotation.desc != C_REDIRECT_NAME) return
        for ((classNode, methods) in foundMethods) {
            for(method in methods) {
                val targets = foundInjectionTargets[method]
                    ?: throw InternalError("i don't know why but cannot found targets in $transformerName.${transformerMethod.name} -> ${method.name}")
                manager.coprocessors.preprocess(manager, classNode, method, transformerClass, transformerMethod)
                for (target in targets) {
                    if (target is MethodInsnNode) {
                        checkReturnType(method, transformerMethod)
                        checkParamTypes(method, transformerMethod, target)
                    } else if (target is FieldInsnNode) {
                        val returnType = Types.type(target.desc)
                        val transformerReturnType = Types.returnType(transformerMethod.desc)
                        if (!ASMUtils.compareType(returnType, transformerReturnType)) {
                            throw illegalArgument(method, "-> ${target.name} has different type and cannot match: $transformerReturnType vs $returnType")
                        }
                        val paramTypes = Types.argumentTypes(transformerMethod.desc)
                        if (target.opcode != Opcodes.GETSTATIC) {
                            val ownerType = arrayOf(Types.type(target.owner))
                            if (!ASMUtils.compareTypes(ownerType, paramTypes)) {
                                throw illegalArgument(method, "-> ${target.name} has different owner type and cannot match: ${paramTypes.joinToString()} vs ${ownerType.joinToString()}")
                            }
                        } else if (paramTypes.isNotEmpty()) {
                            throw illegalArgument(method, "shouldn't have params")
                        }
                    } else {
                        throw illegalArgument(method, "has wrong target")
                    }
                }
            }
        }
    }

    private fun processCModifyExpressionValue(transformerMethod: MethodNode, annotation: AnnotationNode) {
        if (annotation.desc != C_MODIFY_EXPRESSION_VALUE_NAME) return
        for ((classNode, methods) in foundMethods) {
            for (method in methods) {
                val targets = foundInjectionTargets[method]
                    ?: throw InternalError("i don't know why but cannot found targets in $transformerName.${transformerMethod.name} -> ${method.name}")
                manager.coprocessors.preprocess(manager, classNode, method, transformerClass, transformerMethod)
                for (target in targets) {
                    val returnType = if (target is MethodInsnNode) {
                        if (target.isConstructor()) {
                            Types.type(target.owner)
                        } else {
                            val type = Types.returnType(target.desc)
                            if (type == Type.VOID_TYPE) throw IllegalArgumentException("$transformerName.${transformerMethod.name} should return something")
                            type
                        }
                    } else if (target is FieldInsnNode) {
                        Types.type(target.desc)
                    } else {
                        throw illegalArgument(method, "has wrong target")
                    }
                    val transformerReturnType = Types.returnType(transformerMethod.desc)
                    val paramTypes = Types.argumentTypes(transformerMethod.desc)
                    if (paramTypes.size != 1) {
                        throw illegalArgument(method, "doesn't have 1 param")
                    }
                    if (!ASMUtils.compareType(returnType, paramTypes[0]))
                        throw illegalArgument(method, "param type doesn't match: ${paramTypes[0]} vs $returnType")
                    if (!ASMUtils.compareType(returnType, transformerReturnType))
                        throw illegalArgument(method, "return type doesn't match: $transformerReturnType vs $returnType")
                }
            }
        }

    }

    private fun processCWrapCondition(transformerMethod: MethodNode, annotation: AnnotationNode) {
        if (annotation.desc != C_WRAP_CONDITION_NAME) return
        for ((classNode, methods) in foundMethods) {
            for (method in methods) {
                val targets = foundInjectionTargets[method]
                    ?: throw InternalError("i don't know why but cannot found targets in $transformerName.${transformerMethod.name} -> ${method.name}")
                manager.coprocessors.preprocess(manager, classNode, method, transformerClass, transformerMethod)

                for (target in targets) {
                    if (target is MethodInsnNode) {
                        if (Types.returnType(target.desc) != Type.VOID_TYPE) {
                            throw illegalArgument(method, "CWrapCondition should apply on method return void")
                        }
                    } else if (target is FieldInsnNode) {
                        if (target.opcode != Opcodes.PUTFIELD && target.opcode != Opcodes.PUTSTATIC) {
                            throw illegalArgument(method, "CWrapCondition should apply on put field")
                        }
                    } else {
                        throw illegalArgument(method, "has wrong target")
                    }
                }
            }
        }
    }

    private fun checkStatic(transformerMethod: MethodNode, annotation: AnnotationNode) {
        if (annotation.desc !in checkStaticAnnotations) return

        val isTransformerMethodStatic = Modifier.isStatic(transformerMethod.access)
        for ((_, methods) in foundMethods) {
            for (method in methods) {
                if (Modifier.isStatic(method.access) != isTransformerMethodStatic) {
                    throw IllegalArgumentException("$transformerName.${transformerMethod.name}'s static flag is different to ${method.name}")
                }
            }
        }
    }

    private fun checkReturnType(method: MethodNode, transformerMethod: MethodNode): Boolean {
        val returnType = Types.returnType(method.desc)
        val transformerReturnType = Types.returnType(transformerMethod.desc)
        if (!ASMUtils.compareType(returnType, transformerReturnType)) {
            throw illegalArgument(method, "has different return type and cannot match: $transformerReturnType vs $returnType")
        }
        return returnType == transformerReturnType
    }

    private fun checkParamTypes(method: MethodNode, transformerMethod: MethodNode, methodInsnNode: MethodInsnNode) {
        val paramTypes = if (methodInsnNode.isConstructor() || methodInsnNode.opcode == Opcodes.INVOKESTATIC) {
            Types.argumentTypes(method.desc)
        } else {
            arrayOf(Types.type(methodInsnNode.owner)) + Types.argumentTypes(method.desc)
        }
        val transformerParamTypes = Types.argumentTypes(transformerMethod.desc)
        if (!ASMUtils.compareTypes(paramTypes, transformerParamTypes)) {
            throw illegalArgument(method, "has different param types and cannot match: ${transformerParamTypes.joinToString()} vs ${paramTypes.joinToString()}")
        }
    }

    private fun getCandidateMethodPatterns(classNode: ClassNode, methodPattern: String): List<String> {
        if (methodPattern.contains("(")) {
            val methodName = methodPattern.substringBefore("(")
            return classNode.methods.filter { it.name == methodName }.map { it.name + it.desc }
        }
        return listOf()
    }

    private fun getDeclaration(methodPattern: String) =
        if (methodPattern.matches(METHOD_DECLARATION_PATTERN))
            ASMUtils.splitMemberDeclaration(methodPattern)
        else null

    private fun createMethodPatternMatcher(methodPattern: String): (ClassNode) -> List<MethodNode> {
        var method = methodPattern
        var ownerCheck = ""
        if (method.matches(METHOD_DECLARATION_PATTERN)) {
            val declaration = ASMUtils.splitMemberDeclaration(method)
                ?: throw IllegalArgumentException("$transformerName: invalid method $method")

            ownerCheck = declaration.owner
            method = declaration.name + declaration.desc
        }

        return callback@ { classNode: ClassNode ->
            if (ownerCheck.isNotEmpty() && classNode.name == ownerCheck) {
                 listOf()
            } else {
                ASMUtils.getMethodsFromCombi(classNode, method)
            }
        }
    }
    
    private fun illegalArgument(method: MethodNode, message: String) =
        IllegalArgumentException("$transformerName.${transformerMethod.name} -> ${method.name} $message")


    private fun <T> AnnotationNode.get(key: String): T? {
        return findIndex(key)?.let { values[it] as? T }
    }

    private fun AnnotationNode.set(key: String, value: Any?) {
        findIndex(key)?.let { values[it] = value }
    }

    private fun AnnotationNode.findIndex(key: String): Int? {
        if (values == null) return null
        var i = 0
        while (i < values.size) {
            if (values[i] == key) {
                return i+1
            }
            i += 2
        }
        return null
    }

    private fun <T> T.isIn(vararg others: T) =
        others.any { this == it }

    private fun AnnotationNode.toCSlice() =
        CSlice(
            get<AnnotationNode>("from")?.toCTarget() ?: CTarget(""),
            get<AnnotationNode>("to")?.toCTarget() ?: CTarget(""),
        )

    private fun AnnotationNode.toCTarget() =
        CTarget(
            get<String>("value")!!,
            get("target") ?: "",
            get("shift") ?: CTarget.Shift.AFTER,
            get("ordinal") ?: -1,
            get("optional") ?: false,
        )

    private fun AnnotationNode.getName() = desc.split("/").last().removeSuffix(";")

    private fun MethodInsnNode.isConstructor() = opcode == Opcodes.INVOKESPECIAL && name == "<init>"
}