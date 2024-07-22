package me.hellrevenger

import java.io.File
import java.io.PrintWriter


val importPrefix = "import "
val valPrefix = "val "
val funPrefix = "fun "

val defaultImports = setOf(
    "alias", "aliasEnum", "aliasStatic", "kotlin.reflect.*"
)

val packagePath = "me/hellrevenger/generated"

/*
fun <T>LongRunningSampleStatistics<T>.fastestSample() where T: LongRunningSample = this.comp_54()
fun <T>KClass<LongRunningSampleStatistics<T>>.fromSamples(arg0: List<T>) where T: LongRunningSample = LongRunningSampleStatistics.method_38060<T>(arg0)
val GameOptions.pauseOnLostFocus by alias(GameOptions::field_1837)
val RecipeBookGroup.SMOKER_SEARCH by aliasEnum(RecipeBookGroup::class, "field_17113")
val <P>FeatureSizeType<P>.TWO_LAYERS_FEATURE_SIZE where P: FeatureSize by aliasStatic({FeatureSizeType.field_24147})
val StyledNumberFormat.YELLOW by aliasStatic(StyledNumberFormat::field_47568)

fun <T, B>NetworkStateBuilder<T, B>.build(arg0: Function<ByteBuf, B>) where T: PacketListener, B: ByteBuf = this.method_56449(arg0)
fun <T, B>KClass<NetworkStateBuilder<T, B>>.s2c(arg0: NetworkPhase, arg1: Consumer<NetworkStateBuilder<T, B>>) where T: PacketListener, T: ClientPacketListener, B: ByteBuf = NetworkStateBuilder.method_56455<T, B>(arg0, arg1)
fun <T, B>KClass<NetworkStateBuilder<T, B>>.c2s(arg0: NetworkPhase, arg1: Consumer<NetworkStateBuilder<T, B>>) where T: PacketListener, T: ServerPacketListener, B: ByteBuf = NetworkStateBuilder.method_56451<T, B>(arg0, arg1)
fun <T, P, B>NetworkStateBuilder<T, B>.add(arg0: PacketType<P>, arg1: PacketCodec<in B, P>) where T: PacketListener, P: Packet<in T>, B: ByteBuf = this.method_56454<P>(arg0, arg1)
fun <P, B, T, D>NetworkStateBuilder<T, B>.addBundle(arg0: PacketType<P>, arg1: Function<Iterable<Packet<in T>>, P>, arg2: D) where P: BundlePacket<in T>, B: ByteBuf, T: PacketListener, D: BundleSplitterPacket<in T> = this.method_56453<P, D>(arg0, arg1, arg2)
fun <T, B>NetworkStateBuilder<T, B>.buildFactory() where T: PacketListener, B: ByteBuf = this.method_56447()
fun <L, T, B>SideValidatingDispatchingCodecBuilder<B, L>.add(arg0: PacketType<T>, arg1: PacketCodec<in B, T>) where L: PacketListener, T: Packet<in L>, B: ByteBuf = this.method_56446<T>(arg0, arg1)
fun <L, B>SideValidatingDispatchingCodecBuilder<B, L>.build() where L: PacketListener, B: ByteBuf = this.method_56445()
*/

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

fun writeToFile(file: File, imports: Iterable<String>, members: Iterable<String>) {
    val writer = file.writer()

    writer.append("package " + packagePath.replace("/", ".") + "\n\n")
    defaultImports.forEach {
        writer.append("import ").append(it).append("\n")
    }
    imports.forEach {
        writer.append("import ").append(it).append("\n")
    }
    writer.append("\n")
    members.forEach {
        writer.append(it).append("\n")
    }
    writer.flush()
    writer.close()
}

fun splitFile(source: File, targetFolder: File) {
    //val targetFiles = hashSetOf<File>()
    val imports = hashSetOf<String>()
    //val importsForFile = hashMapOf<File, String>()
    //val membersForFile = hashMapOf<File, String>()

    val currentImports = hashSetOf<String>()
    val currentMembers = arrayListOf<String>()
    var lastAccessClass = ""
    var currentFile = targetFolder //File(targetFolder, "Generated$counter")
    //counter++


    source.forEachLine {
        if(it.startsWith(importPrefix)) {
            val path = it.substring(importPrefix.length).trim()
            if(path !in defaultImports) {
                imports.add(path)
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
                    currentImports.add(type)
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
                    currentImports.add(type)
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
}

fun main() {
    val sources = File("./generated")
    val targets = File("./ScriptDefs/src/main/kotlin/$packagePath")
    //val targets = File("./generated2")
    /*
    for (i in 4..6) {
        splitFile(File(sources, "Generated$i.kt"), targets)
    }
     */
    /*
    * */
    sources.listFiles()?.forEach {
        if(it.name.endsWith(".kt"))
            splitFile(it, targets)
    }
}