
import java.io.*
import java.lang.reflect.*
import java.net.URL
import java.nio.charset.StandardCharsets
import java.util.regex.Pattern
import java.util.stream.Collectors
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream
import kotlin.concurrent.thread

class Mappings(val path: String) {
    val mappings = mutableMapOf<String, ClassData>()
    val methodParts = Pattern.compile("\\((.*?)\\)(.+)");
    val sig = Pattern.compile("L(.+?);");

    init {
        loadMappings()
    }

    fun loadMappings() {
        val builder = java.lang.StringBuilder()
        if (path.endsWith(".tiny")) {
            if (path.startsWith("http")) {
                builder.append(
                    BufferedReader(InputStreamReader(URL(path).openStream(), StandardCharsets.UTF_8)).lines()
                        .collect(
                            Collectors.joining("\n")
                        )
                )
            } else {
                builder.append(
                    BufferedReader(
                        FileReader(
                            context.runner.config.macroFolder.toPath().resolve(path).toFile()
                        )
                    ).lines().collect(
                        Collectors.joining("\n")
                    )
                )
            }
        }
        parseMappings(builder.toString())
    }

    fun parseMappings(rawMappings: String) {
        var currentClass: ClassData? = null
        var currentMethod: MethodData? = null
        rawMappings.split("\n").forEach { line ->
            try {
                val parts = line.split("\\s+".toRegex());
                if (parts[0] == "c") {
                    currentClass = ClassData(parts[2])
                    currentMethod = null
                    mappings[parts[1]] = currentClass!!
                } else {
                    when(parts[1]) {
                        "m" -> {
                            assert(currentClass != null)
                            currentMethod = MethodData(parts[4]) { remapSig(parts[2], mappings) }
                            currentClass!!.methods[parts[3] + parts[2]] = currentMethod!!
                        }
                        "f" -> {
                            assert(currentClass != null)
                            currentMethod = null
                            currentClass!!.fields[parts[3]] = parts[4]
                        }
                        "p" -> {
                            currentMethod?.args?.set(parts[2].toInt(), parts[3])
                        }
                    }
                }
            }catch (ignored: IndexOutOfBoundsException) {
            }
        }
    }

    fun remapSig(sign: String, mapping: Map<String, ClassData>): String {
        var sign = sign
        val matcher = methodParts.matcher(sign)
        if(!matcher.find())
            throw RuntimeException(String.format("method signature \"%s\" invalid", sign));
        val cfinder = sig.matcher(sign)
        var  offset = 0
        while (cfinder.find()) {
            var cls = cfinder.group(1)
            mapping.get(cls)?.name?.let {
                cls = it
            }
            sign = sign.substring(0, cfinder.start(1) + offset) + cls + sign.substring(cfinder.end(1) + offset)
            offset += cls.length - cfinder.group(1).length
        }
        return sign
    }
}

class ClassData(val name: String) {
    val methods = mutableMapOf<String, MethodData>()
    val fields = mutableMapOf<String, String>()

}

val kotlinKeywords = setOf("object", "fun", "val", "var")

class MethodData(val name: String, val sig: () -> String) {
    override fun toString() = name + sig()

    val args = mutableMapOf<Int, String>()
    val hasError by lazy { args.values.toSet().size != args.size }

    fun getArgNameWithSize(i: Int, size: Int): String? {
        val result = try {
            if(hasError){
                null
            } else if(args.keys.max() >= size && args.keys.min() > 0) {
                args[i+1]
            } else {
                args[i]
            }
        } catch (_: NoSuchElementException) {
            null
        }
        if(result in kotlinKeywords) return null
        return result
    }
}

class GenMapping(val folder: File) {
    val fromAlias = hashMapOf<String, String>()
    val toAlias = hashMapOf<String, String>()
    val aliasUsage = hashSetOf<String>()
    val kotlinArrays = mapOf(*listOf("Int", "Long", "Byte", "Double", "Float", "Boolean", "Char", "Short").map { "Array<$it>" to it+"Array" }.toTypedArray())
    val blackListMethods = setOf<String>(
        "method_41996", "method_41997", //ConstantArgumentSerializer. writeJson writePacket
        "method_59807", // PacketListener.onPacketException
        "method_11762", // BlockStatePredicate.with
    )
    val blackListStaticMethods = hashSetOf<String>(
    )
    val blackListDeobfMethods = setOf<String>(
        "collectEntitiesByType"
        //"getGenerationSettings", "getSpawnSettings"
    )
    val blackListClasses = setOf<String>(
    )

    val blackListDeobfClasses = setOf(
        "BeforeBatch",
        "AfterBatch",
        "GameTest",

        "LocalTimeProperty", // ibm TimeZone

        "VertexConsumerProvider",
        "TestContext",
        "DisplayEntityRenderer",
        "InputSlotFiller",
    )

    val blackListPackages = setOf(
        "com.mojang",
        "net.minecraft.util.profiling.jfr.event"
    )

    val finalFields = setOf(
        "field_26393" // Biome.weather
    )

    fun getGenerics(type: Type, includingBounds: Boolean = false): List<String> {
        if(type is ParameterizedType) {
            return type.actualTypeArguments.map { getGenerics(it, includingBounds) }.flatten()
        } else if (type is TypeVariable<*>) {
            if(type.bounds.isEmpty() || !includingBounds)
                return listOf(type.typeName)
            val bounds = type.bounds.joinToString { type.typeName + ": " + getNameFromType(it) }
            if(bounds == type.typeName + ": Object")
                return listOf(type.typeName)
            return listOf(type.typeName + ": " + bounds )
        } else if (type is WildcardType) {
            return getGenerics((type.lowerBounds + type.upperBounds)[0], includingBounds)
        }
        return listOf()
    }

    fun getGenericsFromMethod(method: Method, includingBounds: Boolean = false): Set<String> {
        val generics = method.typeParameters.map { getGenerics(it, includingBounds) }.flatten().toSet()

        return generics
    }

    fun getTypeNameFromParameter(param: java.lang.reflect.Parameter): String {
        if(param.parameterizedType is Class<*>) {
            val params = (param.parameterizedType as Class<*>).typeParameters
            if(params.isNotEmpty()) {
                return getNameFromType(param.parameterizedType) + "<*>"
            }
        }
        return getNameFromType(param.parameterizedType)
    }

    fun getNameFromType(type: Type): String {
        if(type is ParameterizedType) {
            var owner: ParameterizedType = type
            val owners = arrayListOf(owner)
            while (owner.ownerType != null) {
                if (owner.ownerType !is ParameterizedType) {
                    break
                }
                owner = owner.ownerType as ParameterizedType
                owners.add(owner)
            }
            if(owners.size > 1) {
                owner = owners.removeAt(owners.size-1)

                var counter = owner.actualTypeArguments.size
                var result = getNameFromType(owner)
                while (owners.isNotEmpty()) {
                    owner = owners.removeAt(owners.size-1)
                    result += "." + (owner.rawType as Class<*>).simpleName
                }
                return result
            }

            return getNameFromType(type.rawType) + "<" + type.actualTypeArguments.joinToString {
                val generic = getNameFromType(it)
                if(generic == "Object") return@joinToString "*"
                return@joinToString generic
            } + ">"
        } else if (type is Class<*>) {
            return getNameFromClass(type)
        } else if (type is WildcardType) {
            val generic = getNameFromType((type.lowerBounds + type.upperBounds)[0])
            if(generic == "Object") return "*"
            return if(type.lowerBounds.isEmpty()) "out $generic" else "in $generic"
        } else if (type is GenericArrayType) {
            return "Array<" + getNameFromType(type.genericComponentType) + ">"
        }
        return type.typeName
    }

    fun mapArray(arrayType: String) = kotlinArrays[arrayType] ?: arrayType

    fun getNameFromClass(clazz: Class<*>): String {
        if(clazz.isArray) {
            return mapArray("Array<" + getNameFromClass(clazz.componentType) + ">")
        }

        val type = if (clazz.isAnonymousClass) clazz.superclass else clazz
        val alias = if(type.isHidden) "Any" else getTypeAlias(type.name, true)
        return alias
    }

    fun getTypeAlias(name: String, addUsage: Boolean = true): String {
        var className = name.replace("/",".")

        val result = toAlias[className]
        if(result != null) {
            if(addUsage)
                aliasUsage.add(result)
            return result
        }
        if(className.matches(".+class_\\d+".toRegex())) return className.replace("$", ".")
        if(className.matches(".+\\$\\d+$".toRegex())) return "Any"
        className = className.replace("$", ".")

        val split = className.split(".")
        var index = split.size-1
        var simpleName = split[index--]
        while (fromAlias.containsKey(simpleName) && index > -1) {
            simpleName = split[index--] + "_" + simpleName
        }
        simpleName = simpleName.replace("$","__")
        fromAlias[simpleName] = className
        toAlias[className] = simpleName
        if(addUsage)
            aliasUsage.add(simpleName)
        return simpleName
    }

    fun genTypeAliases(mappings: Mappings) {
        mappings.mappings.entries.forEach { (name, classData) ->
            var name2 = name.replace("/", ".")
            if(name2.matches(".+\\$\\d+$".toRegex())) return@forEach
            if(toAlias.containsKey(name2)) return@forEach
            name2 = name2.replace("$", ".")
            val className = classData.name.replace("/",".")
            if(className.matches(".+class_\\d+".toRegex())) return@forEach
            val split = className.split(".")
            var index = split.size-1
            var simpleName = split[index--]
            while (fromAlias.containsKey(simpleName)) {
                simpleName = split[index--] + "_" + simpleName
            }
            simpleName = simpleName.replace("$","__")
            fromAlias[simpleName] = name2
            toAlias[name2] = simpleName
        }
    }

    fun genMap(name: String, classData: ClassData): String {
        val builder = StringBuilder()
        val className = name.replace("/",".")

        val clazz = try {
            Class.forName(className,false, GenMapping::class.java.classLoader)
        } catch (e: ClassNotFoundException) {
            return builder.toString()
        }

        if(className in blackListClasses ||
            blackListDeobfClasses.any { classData.name.endsWith(it) } ||
            blackListPackages.any { classData.name.replace("/", ".").startsWith(it) } ||
            classData.name.matches(".+class_\\d+".toRegex()))
            return builder.toString()

        if(clazz.isAnnotation || clazz.isHidden || !Modifier.isPublic(clazz.modifiers)
            || Modifier.isProtected(clazz.modifiers) || Modifier.isPrivate(clazz.modifiers))
            return builder.toString()
        if(className.matches(".+class_\\d+(\\${'$'}class_\\d+)+".toRegex())) return builder.toString()

        val aliasName = getTypeAlias(className)

        if(aliasName == "Any") return builder.toString()
        if(aliasName.matches(".+PackageInfo\\d+".toRegex())) return builder.toString()


        val classGenerics = if(clazz.isInterface) mutableMapOf()
        else mutableMapOf(*getGenerics(clazz.genericSuperclass).map { it.split(":")[0] to it }.toTypedArray())


        if(clazz.typeParameters.isNotEmpty()) {
            clazz.typeParameters.map { getGenerics(it, true) }.flatten().forEach {
                val key = it.split(":")[0]
                if(!classGenerics.containsKey(key)) classGenerics[key] = it
                else if (key != it) {
                    val original = classGenerics[key]!!
                    if(original != it && original.split("<")[0] != it.split("<")[0])
                        classGenerics[key] += (if(original != key) "," else "") + it.substring(key.length + 1)
                }
            }
        }

        val staticBuilder = StringBuilder()
        var staticMemberCount = 0
        var staticSplitCount = 0

        var memberCount = 0
        var splitCount = 0

        val fields = hashMapOf<String, Boolean>()
        val methods = hashSetOf<String>()

        var simpleClassGenerics = classGenerics.keys.joinToString()
        var wildcardClassGenerics = ""
        if(simpleClassGenerics.isNotEmpty()) {
            simpleClassGenerics = "<$simpleClassGenerics>"
            wildcardClassGenerics = "<" + classGenerics.keys.joinToString { "*" } + ">"
        }

        if(!clazz.isInterface) {
            classData.fields.entries.forEach { (from, to) ->
                try {
                    val field = clazz.getField(from)

                    if(!Modifier.isPublic(field.modifiers)
                        || Modifier.isProtected(field.modifiers) || Modifier.isPrivate(field.modifiers))
                        return@forEach

                    if((to == "CODEC" || to.endsWith("_CODEC")) && Modifier.isStatic(field.modifiers) && !field.isEnumConstant) return@forEach

                    val isStatic = Modifier.isStatic(field.modifiers)

                    val (targetBuilder, indent) = if(isStatic) staticBuilder to 4 else builder to 0

                    val byAlias = if(isStatic)
                        if(field.isEnumConstant)
                            " by aliasEnum("
                        else
                            " by aliasStatic("
                    else
                        " by alias("

                    val (writable, accessor) = if(field.isEnumConstant)
                        false to "$aliasName$simpleClassGenerics::class, \"$from\""
                    else if (Modifier.isStatic(field.modifiers) && simpleClassGenerics.isNotEmpty())
                        false to "{$aliasName.$from}"
                    else
                        !(isStatic || Modifier.isFinal(field.modifiers) || Modifier.isTransient(field.modifiers) ||
                                Modifier.isVolatile(field.modifiers) || finalFields.contains(from)) to "$aliasName$wildcardClassGenerics::$from"

                    fields[to] = writable

                    var bounds = classGenerics.map {
                        if (it.value.length > it.key.length + 1)
                            it.value.substring(it.key.length + 1).trim()
                        else ""
                    }.filter { it.isNotEmpty() }.joinToString { it }
                    if(bounds.isNotEmpty()) bounds = " where $bounds"


                    targetBuilder.append(comment(from, indent)).append("\n").append(" ".repeat(indent))
                    if(writable)
                        targetBuilder.append("var ")
                    else
                        targetBuilder.append("val ")
                    if(isStatic) {
                        targetBuilder.append(to).append(byAlias).append(accessor).append(")\n")
                    } else {
                        targetBuilder.append(simpleClassGenerics).append(aliasName)
                            .append(simpleClassGenerics).append(".").append(to)
                            .append(bounds).append(byAlias).append(accessor).append(")\n")
                    }

                    if(isStatic) {
                        if(++staticMemberCount > 511) {
                            genStaticMappingKt(aliasName, targetBuilder.toString(), ++staticSplitCount)
                            targetBuilder.clear()
                            staticMemberCount = 0
                        }
                    } else {
                        if(++memberCount > 511) {
                            genMappedKt(aliasName, targetBuilder.toString(), ++splitCount)
                            targetBuilder.clear()
                            memberCount = 0
                        }
                    }

                } catch (_: NoSuchFieldException) {}
            }
        }

        classData.methods.entries.forEach { (from, to) ->
            try {
                val methodName = from.split("(")[0]
                if(methodName == to.name) return@forEach
                if(methodName in blackListMethods || to.name in blackListMethods) return@forEach
                val method = clazz.methods.first { return@first it.name == methodName }
                if(method.declaringClass != clazz) return@forEach
                if(!Modifier.isPublic(method.modifiers)) return@forEach
                if(Modifier.isPrivate(method.modifiers) || Modifier.isProtected(method.modifiers)) return@forEach
                if(to.name.startsWith("set") && to.name.length > 4 && fields[to.name[3].lowercase() + to.name.substring(4)] == true) {
                    return@forEach
                }
                if(to.name.startsWith("get") && to.name.length > 4 && (to.name[3].lowercase() + to.name.substring(4)) in fields) {
                    return@forEach
                }
                if(to.name in blackListDeobfMethods || to.name in methods) return@forEach

                val isStatic = Modifier.isStatic(method.modifiers)
                if(isStatic) {
                    if(to.name in blackListStaticMethods) return@forEach
                }
                methods.add(to.name)

                val host = if (isStatic) " = ${aliasName}." else " = this."
                val genericWithBounds = classGenerics.toMutableMap()

                getGenericsFromMethod(method, true).forEach {
                    val key = it.split(":")[0]
                    if(!genericWithBounds.containsKey(key)) genericWithBounds[key] = it
                    else if (key != it) {
                        var original = genericWithBounds[key]!!
                        if(original.startsWith("$key ") || original.startsWith("$key:")) original = original.substring(key.length+1)
                        val bound = it.substring(key.length+1)
                        if(original.trim() != bound.trim()  && original.split("<")[0] != bound.split("<")[0]) {
                            genericWithBounds[key] += (if(original != key) "," else "") + bound
                        }
                    }
                }

                var simpleAllGenerics = genericWithBounds.keys.joinToString { it }
                if(simpleAllGenerics.isNotEmpty()) simpleAllGenerics = "<$simpleAllGenerics>"
                var callingGenerics = getGenericsFromMethod(method).joinToString { it }
                if(callingGenerics.isNotEmpty()) callingGenerics = "<$callingGenerics>"

                var bounds = genericWithBounds.map {
                    if (it.value.length > it.key.length+1)
                        it.value.substring(it.key.length+1).trim()
                    else ""
                }.filter { it.isNotEmpty() }.joinToString { it }
                if(bounds.isNotEmpty()) bounds = " where $bounds"

                val (targetBuilder, indent) = if(isStatic) staticBuilder to 4 else builder to 0


                targetBuilder.append(comment(methodName, indent)).append("\n").append(" ".repeat(indent))
                targetBuilder.append("fun ").append(simpleAllGenerics)
                if(isStatic) {
                } else {
                    targetBuilder.append(aliasName).append(simpleClassGenerics).append(".")
                }
                targetBuilder.append(to.name).append("(")

                val argSize = method.parameterCount

                targetBuilder.append(method.parameters.mapIndexedNotNull { index, parameter ->
                    (to.getArgNameWithSize(index, argSize) ?: parameter.name.replace("\\$+".toRegex(), "arg")) + ": " + getTypeNameFromParameter(parameter)
                }.joinToString()).append(")").append(bounds)



                targetBuilder.append(host).append(methodName)
                    .append(callingGenerics).append("(")
                    .append(method.parameters.mapIndexedNotNull { index, parameter ->
                        (if (parameter.isVarArgs) "*" else "") + (to.getArgNameWithSize(index, argSize) ?: parameter.name.replace("\\$+".toRegex(), "arg"))
                    }.joinToString()).append(")\n")
                if(isStatic) {
                    if(++staticMemberCount > 511) {
                        genStaticMappingKt(aliasName, targetBuilder.toString(), ++staticSplitCount)
                        targetBuilder.clear()
                        staticMemberCount = 0
                    }
                } else {
                    if(++memberCount > 511) {
                        genMappedKt(aliasName, targetBuilder.toString(), ++splitCount)
                        targetBuilder.clear()
                        memberCount = 0
                    }
                }
            } catch (_: NoSuchMethodException) {
            } catch (_: NoSuchElementException) {}
        }
        if(staticBuilder.isNotBlank()) {
            genStaticMappingKt(aliasName, staticBuilder.toString(), if(staticSplitCount == 0) -1 else ++staticSplitCount)
        }
        if(builder.isBlank()) return ""
        genMappedKt(aliasName, builder.toString(), if(splitCount == 0) -1 else ++splitCount)

        return builder.toString()
    }

    fun genStaticMappingKt(className: String, content: String, split: Int = -1) {
        val builder = StringBuilder()
        val fileName = "Map_$className"
        val splitPostfix = if(split == -1) "" else "_$split"
        builder.append("package $packageName.").append(fileName).append("\n")
        builder.append("import kotlin.reflect.*\n")
        builder.append("import $packageName.*\n")
        builder.append("object $className").append("Kt$splitPostfix {\n")
        builder.append(content)
        builder.append("}")
        val parent = File(folder, fileName)
        parent.mkdirs()

        val writer = BufferedWriter(FileWriter(File(parent, fileName + "Static" + splitPostfix + ".kt")))
        writer.write(builder.toString())
        writer.close()
    }

    fun genMappedKt(className: String, content: String, split: Int = -1) {
        val builder = StringBuilder()
        val fileName = "Map_$className"
        builder.append("package $packageName.").append(fileName).append("\n")
        builder.append("import kotlin.reflect.*\n")
        builder.append("import $packageName.*\n")
        builder.append(content)
        val parent = File(folder, fileName)
        parent.mkdirs()

        val writer = BufferedWriter(FileWriter(File(parent, (if(split == -1) fileName else (fileName + "_$split")) + ".kt")))
        writer.write(builder.toString())
        writer.close()
    }

    fun comment(text: String, indent: Int = 0): String {
        return """
            /**
             * $text
             */
        """.trimIndent().prependIndent(" ".repeat(indent))
    }

    val packageName = "me.hellrevenger.generated"

    fun genPrefix() =
        """
            package $packageName
            
            import kotlin.properties.ReadOnlyProperty
            import kotlin.reflect.*

            fun <R, T> alias(alias: KProperty1<R, T>) = ReadOnlyProperty<R, T> { thisRef, _ -> alias.get(thisRef) }
            fun <R, T> alias(alias: KMutableProperty1<R, T>) = MyReadWriteProperty(alias)
            fun <T> aliasStatic(alias: KProperty0<T>) = ReadOnlyStaticProperty(alias)
            fun <T> aliasStatic(alias: () -> T) = ReadOnlyStaticProperty(alias)
            fun <T> aliasStatic(alias: KMutableProperty0<T>) = ReadOnlyStaticProperty(alias)
            fun <T: Any> aliasEnum(type: KClass<T>, name: kotlin.String) = EnumProperty(type, name)

            class ReadOnlyStaticProperty<T>(val getter: () -> T) {
                constructor(alias: KProperty0<T>): this(alias as () -> T)

                operator fun <Self> getValue(thisRef: Self, prop: KProperty<*>): T = getter.invoke()
            }
            
            class EnumProperty<T : Any>(val type: KClass<T>, val name: kotlin.String) {
                private val ordinal: Int
                init {
                    val enums = type.java.enumConstants as kotlin.Array<kotlin.Enum<*>>
                    ordinal = enums.first { it.name == name}.ordinal
                }
                operator fun <Self> getValue(thisRef: Self, prop: KProperty<*>): T {
                    return type.java.enumConstants[ordinal]
                }
            }

            class ReadWriteStaticProperty<T>(val alias: KMutableProperty0<T>) {
                operator fun <Self> getValue(thisRef: Self, prop: KProperty<*>): T = alias.get()

                operator fun <Self> setValue(thisRef: Self, property: KProperty<*>, value: T) {
                    alias.set(value)
                }
            }

            class MyReadWriteProperty<R, T>(val alias: KMutableProperty1<R, T>) {
                operator fun getValue(thisRef: R, property: KProperty<*>): T = alias.get(thisRef)

                operator fun setValue(thisRef: R, property: KProperty<*>, value: T) {
                    (alias as? KMutableProperty1<R, T>)?.set(thisRef, value)
                }
            }
            
        """.trimIndent()

    fun tryGetClass(fullName: String): Class<*>? {
        try {
            return Class.forName(fullName,false, GenMapping::class.java.classLoader)
        } catch (e: ClassNotFoundException) {
            if("." in fullName) {
                val lastIndex = fullName.lastIndexOf(".")
                val pre = fullName.substring(0, lastIndex)
                val post = fullName.substring(lastIndex+1)
                return tryGetClass("$pre$$post")
            }
            return null
        }
    }

    fun getGenericsForClass(fullName: String): String {
        val clazz = tryGetClass(fullName) ?: return ""
        val generics = clazz.typeParameters.map { getGenerics(it) }.flatten().toMutableSet()

        if(generics.isEmpty()) return ""
        return generics.joinToString(prefix = "<", postfix = ">") { it }
    }

    fun genTypeAliases() =
        fromAlias.filter { aliasUsage.contains(it.key) }
            .map { (simpleName, fullName) ->
                if(simpleName == fullName) return@map ""
                val generics = getGenericsForClass(fullName)
                return@map "${comment(fullName)}\ntypealias $simpleName$generics = $fullName$generics"
            }.joinToString("\n")

    fun genKotlinType(java: String, kotlin: String) {

        var name2 = java.replace("/", ".")

        name2 = name2.replace("$", ".")
        val className = kotlin.replace("/",".")
        val split = className.split(".")
        var index = split.size-1
        var simpleName = split[index--]
        while (fromAlias.containsKey(simpleName)) {
            if(index < 0) return
            simpleName = split[index--] + "_" + simpleName
        }
        simpleName = simpleName.replace("$","__")
        fromAlias[simpleName] = name2
        toAlias[name2] = simpleName
    }

    fun genKotlinTypes() {
        genKotlinType("Boolean", "Boolean")
        genKotlinType("Byte", "Byte")
        genKotlinType("Int", "Int")
        genKotlinType("Long", "Long")
        genKotlinType("Float", "Float")
        genKotlinType("Double", "Double")
        genKotlinType("Short", "Short")

        genKotlinType("Unit", "Unit")
        genKotlinType("Function", "Function")
        fromAlias["EnumProperty"] = "EnumProperty"
        listOf("Time", "World", "Client", "World", "Utils", "KeyBind", "Reflection", "Request", "EnumProperty").forEach {
            genKotlinType(it, it)
        }
        listOf(
            "java.lang.Boolean",
            "java.lang.Byte",
            "java.lang.Long",
            "java.lang.Float",
            "java.lang.Double",
            "java.lang.Short",
            "java.lang.Iterable",
            "java.lang.Comparable",
            "java.lang.Enum",
            "java.util.Set",
            "java.util.Map",
            "java.lang.String",
            "java.lang.CharSequence",
            "java.lang.Number",
            "java.lang.Throwable",
            "java.util.Collection",
            "java.util.Iterator"
        ).forEach {
            toAlias[it] = it.replace("java.lang.", "").replace("java.util.", "")
        }
        toAlias["java.util.List"] = "MutableList"
        toAlias["java.lang.Integer"] = "Int"
        toAlias["java.lang.Character"] = "Char"
        listOf(
            "Int",
            "Char",
            "Byte",
            "Long",
            "Float",
            "Double",
            "Short",
            "Boolean"
        ).forEach { toAlias[it.lowercase()] = it }
    }
}

fun main() {
    val parentFile = file!!.parentFile
    val parent = parentFile.absolutePath
    val macro = JsMacros.config.macroFolder.absolutePath
    Chat.log("parent: $parent")
    Chat.log("macro: $macro")
    val pathToTiny = "." + parent.substring(macro.length) + "/jars/mappings.tiny"
    Chat.log("sub: $pathToTiny")

    val mapping = Mappings(pathToTiny)
    val root = File(parentFile, "generated")
    root.mkdirs()

    val writer = BufferedWriter(FileWriter(File(root, "Generated.kt")))
    val genMapping = GenMapping(root)
    writer.append(genMapping.genPrefix())
    genMapping.genKotlinTypes()
    genMapping.genTypeAliases(mapping)
    mapping.mappings.forEach { (name, classData) ->
        Chat.actionbar("working on $name")
        genMapping.genMap(name, classData)
    }
    writer.append(genMapping.genTypeAliases())
    writer.close()
    Chat.log("saved")
}


thread {
    main()
}