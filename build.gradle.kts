

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "me.hellrevenger"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(gradleApi())
}

tasks.register("splitGenerated") {
    onlyIf { false }

    doLast {
        splitMain()
    }
}

tasks.test {
    useJUnitPlatform()
}

fun splitMain() {
    val packagePath = "me/hellrevenger/generated"
    val packagePathDot = packagePath.replace("/", ".")

    val source = File("./generated/Generated.kt")
    val targetFolder = File("./ScriptDefs/src/main/kotlin/$packagePath")

    val valPrefix = "val "
    val funPrefix = "fun "
    val typealiasPrefix = "typealias "

    val defaultImports = setOf(
        "$packagePathDot.alias",
        "$packagePathDot.aliasEnum",
        "$packagePathDot.aliasStatic",
        "kotlin.reflect.*"
    )


    val funRegex = "fun (?:<[\\w\\s,]+>)?([\\w.]+)(?:<[\\w\\s,]+>)?\\.(\\w+)\\(([\\w:<*>\\s,.]*)\\)( where (?:(?:, )?(?:in|out )?\\w+: [\\s\\w<*>.,]+)+)? = (\\w+)\\.([.\\w]+)(?:<[\\w\\s,<>]+>)?\\([\\w,\\s*]*\\)".toRegex()
    val staticFunRegex = "fun (?:<[\\w\\s,]+>)?KClass<([\\w.]+)(?:<[\\w\\s,]+>)?>\\.(\\w+)\\(([\\w:<*>\\s,.]*)\\)( where (?:(?:, )?(?:in|out )?\\w+: [\\s\\w<*>.,]+)+)? = (\\w+)\\.([.\\w]+)(?:<[\\w\\s,]+>)?\\([\\w\\s,*]*\\)".toRegex()

    val aliasRegex = "val (?:<[\\w\\s,]+>)?([\\w.]+)(?:<[\\w\\s,]+>)?\\.(\\w+)( where (?:(?:, )?(?:in|out )?\\w+: [\\s\\w<*>.,]+)+)? by alias\\(([\\w.]+)(?:<[\\w\\s,]+>)?::(\\w+)\\)".toRegex()
    val aliasStaticRegex = "val (?:<[\\w\\s,]+>)?([\\w.]+)(?:<[\\w\\s,]+>)?\\.(\\w+)( where (?:(?:, )?(?:in|out )?\\w+: [\\s\\w<*>.,]+)+)? by aliasStatic\\(([\\w.]+)::(\\w+)\\)".toRegex()
    val aliasStaticRegex2 = "val (?:<[\\w\\s,]+>)?([\\w.]+)(?:<[\\w\\s,]+>)?\\.(\\w+)( where (?:(?:, )?(?:in|out )?\\w+: [\\s\\w<*>.,]+)+)? by aliasStatic\\(\\{(\\w+).(\\w+)}\\)".toRegex()
    val aliasEnumRegex = "val (?:<[\\w\\s,]+>)?([\\w.]+)(?:<[\\w\\s,]+>)?\\.(\\w+)( where (?:(?:, )?(?:in|out )?\\w+: [\\s\\w<*>.,]+)+)? by aliasEnum\\(([\\w.]+)::class, \"(\\w+)\"\\)".toRegex()

    fun splitArgs(string: String) =
        if(string.isNotEmpty())
            ("$string, arg-").substring(string.indexOf(":")+1).split(":").map {
                it.substring(0, it.lastIndexOf(", "))
            }
        else listOf()

    fun splitWhere(string: String): List<String> {
        val types = string.split(":").drop(1).toMutableList()
        if(types.size == 1) return listOf(types[0])
        for(i in 0..types.size-2) {
            types[i] = types[i].substring(0, types[i].lastIndexOf(","))
        }
        return types
    }

    fun splitType(string: String) =
        string.split("[< >,]+".toRegex())

    fun writeToFile(file: File, imports: Iterable<String>, members: List<String>) {
        if(members.size > 1024) {
            val parent = file.parentFile
            arrayOf(file to members.subList(0, members.size / 2),
                File(parent, file.nameWithoutExtension + "_2.kt") to members.subList(members.size / 2, members.size))
        } else {
            arrayOf(file to members)
        }.forEach { (f2, member2) ->
            val writer = f2.writer()

            writer.append("package $packagePathDot\n\n")
            defaultImports.forEach {
                writer.append("import ").append(it).append("\n")
            }
            imports.forEach {
                writer.append("import ").append(packagePathDot).append(".").append(it).append("\n")
            }
            writer.append("\n")
            member2.forEach {
                writer.append(it).append("\n")
            }
            writer.flush()
            writer.close()
        }

    }

    fun splitFile(source: File, targetFolder: File) {
        //val targetFiles = hashSetOf<File>()
        val imports = hashSetOf<String>()
        val aliases = hashSetOf<String>()
        //val importsForFile = hashMapOf<File, String>()
        //val membersForFile = hashMapOf<File, String>()

        val currentImports = hashSetOf<String>()
        val currentMembers = arrayListOf<String>()
        var lastAccessClass = ""
        var currentFile: File  //File(targetFolder, "Generated$counter")
        //counter++

        source.forEachLine {
            if(it.startsWith(typealiasPrefix)) {
                val path = it.substring(typealiasPrefix.length).split(" = ")[0].split("<")[0]
                if(path !in defaultImports) {
                    if("." !in path) {
                        imports.add(path)
                        aliases.add(it)
                    }
                }
                return@forEachLine
            }
            var match: MatchResult?

            if (it.startsWith(valPrefix)) {
                // 1 == 4 = type
                // 2 = yarn
                // 3 = where
                // 5 = int
                val (type, where) = if("aliasStatic" in it) {
                    match = aliasStaticRegex2.matchEntire(it) ?: aliasStaticRegex.matchEntire(it)
                    if(match != null) {
                        match.groupValues[1] to match.groupValues[3]
                    } else {
                        println("error on static val: $it")
                        null to null
                    }
                } else if("aliasEnum" in it) {
                    match = aliasEnumRegex.matchEntire(it)
                    if(match != null) {
                        match.groupValues[1] to match.groupValues[3]
                    } else {
                        println("error on enum val: $it")
                        null to null
                    }
                } else {
                    match = aliasRegex.matchEntire(it)
                    if(match != null) {
                        match.groupValues[1] to match.groupValues[3]
                    } else {
                        println("error on normal val: $it")
                        null to null
                    }
                }
                if(type != null) {
                    if (type != lastAccessClass) {
                        if(lastAccessClass.isNotEmpty()) {
                            currentFile = File(targetFolder, "Map_${lastAccessClass}.kt")
                            writeToFile(currentFile, currentImports, currentMembers)
                        }
                        lastAccessClass = type
                        currentImports.clear()
                        currentMembers.clear()
                        if("." !in type) currentImports.add(type)
                    }
                    if(!where.isNullOrEmpty()) {
                        splitWhere(where.substring(" where ".length))
                            .flatMap { splitType(it) }
                            .forEach {
                                if(it in imports) currentImports.add(it)
                            }
                    }
                    currentMembers.add(it)
                }
            } else if (it.startsWith(funPrefix)) {

                // 1 == 5 = type, 5 == this when not static
                // 2 = yarn
                // 3 = arg
                // 4 = where
                // 6 = int
                val (type, args, where) = if("KClass" in it) {
                    match = staticFunRegex.matchEntire(it)
                    if(match != null) {
                        Triple(match.groupValues[1], match.groupValues[3], match.groupValues[4])
                    } else {
                        println("error on static fun: $it")
                        Triple(null, null, null)
                    }
                } else {
                    match = funRegex.matchEntire(it)
                    if(match != null) {
                        Triple(match.groupValues[1], match.groupValues[3], match.groupValues[4])
                    } else {
                        println("error on normal fun: $it")
                        Triple(null, null, null)
                    }
                }
                if(type != null) {
                    if (type != lastAccessClass) {
                        if(lastAccessClass.isNotEmpty()) {
                            currentFile = File(targetFolder, "Map_${lastAccessClass}.kt")
                            writeToFile(currentFile, currentImports, currentMembers)
                        }
                        lastAccessClass = type
                        currentImports.clear()
                        currentMembers.clear()
                        if("." !in type) currentImports.add(type)
                    }
                    if(!where.isNullOrEmpty()) {
                        splitWhere(where.substring(" where ".length))
                            .flatMap { splitType(it) }.forEach {
                                if(it in imports) currentImports.add(it)
                            }
                    }
                    if(!args.isNullOrEmpty()) {
                        splitArgs(args).flatMap { splitType(it) }.forEach {
                            if(it in imports) currentImports.add(it)
                        }
                    }

                    currentMembers.add(it)
                }
            }
        }

        currentFile = File(targetFolder, "Map_${lastAccessClass}.kt")
        writeToFile(currentFile, currentImports, currentMembers)

        currentFile = File(targetFolder, "Generated.kt")
        val writer = currentFile.writer()
        writer.append("package $packagePathDot\n\n")
        writer.append("""
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
            
            
            """.trimIndent())

        aliases.forEach {
            writer.append(it).append("\n")
        }
        writer.flush()
        writer.close()
    }
    splitFile(source, targetFolder)
}
