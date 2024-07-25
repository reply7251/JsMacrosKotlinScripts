import xyz.wagyourtail.jsmacros.core.classes.Mappings
import java.io.*
import java.lang.reflect.GenericArrayType
import java.lang.reflect.Method
import java.util.stream.Collectors
import java.lang.reflect.Modifier
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.lang.reflect.TypeVariable
import java.lang.reflect.WildcardType

class MyMappings(mappingsource: String?) : Mappings(mappingsource) {
    override fun loadMappings() {
        val builder = StringBuilder()
        builder.append(
            BufferedReader(FileReader(File(mappingsource)))
            .lines().collect(Collectors.joining("\n")) as String)
        parseMappings(builder.toString())
    }
}



class GenMapping {
    val fromAlias = hashMapOf<String, String>()
    val toAlias = hashMapOf<String, String>()
    val aliasUsage = hashSetOf<String>()
    val kotlinArrays = mapOf(*listOf("Int", "Long", "Byte", "Double", "Float", "Boolean", "Char", "Short").map { "Array<$it>" to it+"Array" }.toTypedArray())
    val blackListMethods = setOf<String>(
        "method_41996", "method_41997", //writeJson writePacket
        /*
        "method_30040",
        "method_42697", "method_59807", "method_11762",
        "method_47574", "method_47575",
        "method_52207", "method_22992",
        "method_47539", "method_47538",

         */
    )
    val blackListStaticMethods = hashSetOf<String>(
    )
    val blackListDeobfMethods = setOf<String>(
        //"getGenerationSettings", "getSpawnSettings"
    )
    val blackListClasses = setOf(
        "net.minecraft.class_4597", // VertexConsumerProvider
        "net.minecraft.class_6302", "net.minecraft.class_6300",
        "net.minecraft.class_6301"
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
        //method.typeParameters method.genericParameterTypes
        val generics = method.typeParameters.map { getGenerics(it, includingBounds) }.flatten().toSet()

        return generics
    }

    fun getTypeNameFromParameter(param: java.lang.reflect.Parameter): String {
        /*
        var generics = it.parameterizedType.parameterizedTypeArguments.joinToString {
            getNameFromType(it)
        }
        generics = if(generics == "") "" else "<$generics>"
        * */
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

    fun genMap(name: String, classData: Mappings.ClassData): String {
        val builder = StringBuilder()
        val className = name.replace("/",".")

        val clazz = try {
            Class.forName(className,false, GenMapping::class.java.classLoader)
        } catch (e: ClassNotFoundException) {
            return builder.toString()
        }

        if(className in blackListClasses) return builder.toString()

        if(clazz.isHidden || !Modifier.isPublic(clazz.modifiers)
            || Modifier.isProtected(clazz.modifiers) || Modifier.isPrivate(clazz.modifiers))
            return builder.toString()
        if(className.matches(".+class_\\d+(\\${'$'}class_\\d+)+".toRegex())) return builder.toString()

        val aliasName = getTypeAlias(className)

        if(aliasName == "Any") return builder.toString()
        if(aliasName.matches(".+PackageInfo\\d+".toRegex())) return builder.toString()

        val classGenerics = if(clazz.typeParameters.isEmpty()) {
            listOf()
        } else {
            clazz.typeParameters.map { getGenerics(it, true) }.flatten()
        } + getGenerics(clazz.genericSuperclass)


        var simpleClassGenerics = classGenerics.joinToString { it.split(":")[0] }
        if(simpleClassGenerics.isNotEmpty()) simpleClassGenerics = "<$simpleClassGenerics>"

        if(!clazz.isInterface) {
            classData.fields.entries.forEach { (from, to) ->
                try {
                    val field = clazz.getField(from)

                    if(!Modifier.isPublic(field.modifiers)
                        || Modifier.isProtected(field.modifiers) || Modifier.isPrivate(field.modifiers))
                        return@forEach

                    if(to == "CODEC" && Modifier.isStatic(field.modifiers) && !field.isEnumConstant) return@forEach

                    val byAlias = if(Modifier.isStatic(field.modifiers))
                        if(field.isEnumConstant)
                            " by aliasEnum("
                        else
                            " by aliasStatic("
                    else
                        " by alias("

                    val accessor = if(field.isEnumConstant)
                        "$aliasName$simpleClassGenerics::class, \"$from\""
                    else if (Modifier.isStatic(field.modifiers) && simpleClassGenerics.isNotEmpty())
                        "{$aliasName.$from}"
                    else
                        "$aliasName$simpleClassGenerics::$from"

                    val genericWithBounds = hashMapOf(*classGenerics.map { it.split(":")[0] to it }.toTypedArray())
                    var bounds = genericWithBounds.map {
                        if(it.value.length > it.key.length+1)
                            it.value.substring(it.key.length+1).trim()
                        else ""
                    }.filter { it.isNotEmpty() }.joinToString { it }
                    if(bounds.isNotEmpty()) bounds = " where $bounds"

                    builder.append("val ").append(simpleClassGenerics).append(aliasName).append(simpleClassGenerics)
                        .append(".").append(to)
                        .append(bounds).append(byAlias).append(accessor).append(")\n")

                } catch (_: NoSuchFieldException) {}
            }
        }

        classData.methods.entries.forEach { (from, to) ->
            try {
                val methodName = from.split("(")[0]
                if(methodName == to.name) return@forEach
                if(methodName in blackListMethods) return@forEach
                val method = clazz.methods.first { return@first it.name == methodName }
                if(!Modifier.isPublic(method.modifiers)) return@forEach
                if(Modifier.isPrivate(method.modifiers) || Modifier.isProtected(method.modifiers)) return@forEach
                if(to.name.startsWith("get") && to.name.length > 4 && (to.name[3].lowercase() + to.name.substring(4)) in classData.fields.values)
                    return@forEach
                if(to.name in blackListDeobfMethods) return@forEach

                val isStatic = Modifier.isStatic(method.modifiers)
                if(isStatic) {
                    if(to.name in blackListStaticMethods) return@forEach
                    //blackListStaticMethods.add(to.name)
                }
                val host = if (isStatic) " = ${aliasName}." else " = this."
                val genericWithBounds = hashMapOf(*classGenerics.map { it.split(":")[0] to it }.toTypedArray())
                getGenericsFromMethod(method, true).forEach {
                    val key = it.split(":")[0]
                    if(!genericWithBounds.containsKey(key)) genericWithBounds[key] = it
                    else if (key != it) {
                        val original = genericWithBounds[key]!!
                        if(original != it && original.split("<")[0] != it.split("<")[0])
                            genericWithBounds[key] += (if(original != key) "," else "") + it.substring(key.length + 1)
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

                builder.append("fun ").append(simpleAllGenerics)
                if(isStatic) {
                    builder.append("KClass<$aliasName$simpleClassGenerics>")
                } else {
                    builder.append(aliasName).append(simpleClassGenerics)
                }
                builder.append(".").append(to.name).append("(")

                builder.append(method.parameters.joinToString {
                    return@joinToString it.name.replace("\\$+".toRegex(), "arg") + ": " + getTypeNameFromParameter(it)
                }).append(")").append(bounds)
                builder.append(host).append(methodName)
                    .append(callingGenerics).append("(")
                    .append(method.parameters.joinToString {
                        (if (it.isVarArgs) "*" else "") + it.name.replace("\\$+".toRegex(), "arg")
                    }).append(")\n")
            } catch (_: NoSuchMethodException) {
            } catch (_: NoSuchElementException) {}
        }
        return builder.toString()
    }

    fun genPrefix() =
        """
            import kotlin.properties.ReadOnlyProperty
            import kotlin.properties.ReadWriteProperty
            import kotlin.reflect.*
            fun <R, T> alias(alias: KProperty1<R, T>) = ReadOnlyProperty<R, T> { thisRef, _ -> alias.get(thisRef) }
            fun <T> aliasStatic(alias: KProperty0<T>) = ReadOnlyStaticProperty(alias)
            fun <T> aliasStatic(alias: () -> T) = ReadOnlyStaticProperty(alias)
            fun <T: Any> aliasEnum(type: KClass<T>, name: kotlin.String) = EnumProperty(type, name)

            class ReadOnlyStaticProperty<T>(val getter: () -> T) {
                constructor(alias: KProperty0<T>): this(alias as () -> T)
            
                operator fun <Self> getValue(thisRef: Self, prop: KProperty<*>): T {
                    return getter.invoke()
                }
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
            
        """.trimIndent()

    fun getGenericsForClass(fullName: String): String {
        val clazz = try {
            Class.forName(fullName,false, GenMapping::class.java.classLoader)
        } catch (e: ClassNotFoundException) {
            return ""
        }
        val generics = clazz.typeParameters.map { getGenerics(it) }.flatten().toHashSet()
        /*
        if(clazz.genericSuperclass != null)
            generics.addAll(getGenerics(clazz.genericSuperclass))
        generics.addAll(clazz.genericInterfaces.map { getGenerics(it) }.flatten())
         */

        if(generics.isEmpty()) return ""
        return generics.joinToString(prefix = "<", postfix = ">") { it }
    }

    fun genTypeAliases() =
        fromAlias.filter { aliasUsage.contains(it.key) }
            .map { (simpleName, fullName) ->
                if(simpleName == fullName) return@map ""
                val generics = getGenericsForClass(fullName)
                return@map "typealias $simpleName$generics = $fullName$generics"
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
        //genKotlinType("CharSequence", "CharSequence")
        //genKotlinType("String", "String")
        genKotlinType("Boolean", "Boolean")
        genKotlinType("Byte", "Byte")
        genKotlinType("Int", "Int")
        genKotlinType("Long", "Long")
        genKotlinType("Float", "Float")
        genKotlinType("Double", "Double")
        genKotlinType("Short", "Short")
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
    val pathToTiny = "." + parent.substring(macro.length) + "/jars/mappings-yarn.tiny"
    Chat.log("sub: " + pathToTiny)

    val mapping = Reflection.loadMappingHelper(pathToTiny)

    val writer = BufferedWriter(FileWriter(File(parentFile, "Generated.kt")))
    val genMapping = GenMapping()
    writer.append(genMapping.genPrefix())
    genMapping.genKotlinTypes()
    genMapping.genTypeAliases(mapping)
    mapping.mappings.forEach { (name, classData) ->
        Chat.actionbar("working on $name")
        val out = genMapping.genMap(name, classData)
        writer.append(out)
        writer.flush()
    }
    writer.append(genMapping.genTypeAliases())
    writer.close()
    Chat.log("saved")
    //Chat.log(name)
    //Chat.log(GenMapping().genMap(name, classData))
}



main()