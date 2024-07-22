package me.hellrevenger

import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.classes.Mappings
import xyz.wagyourtail.jsmacros.core.classes.Mappings.ClassData
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.util.stream.Collectors

class MyMappings(mappingsource: String?) : Mappings(mappingsource) {
    override fun loadMappings() {
        val builder = StringBuilder()
        builder.append(BufferedReader(FileReader(File(mappingsource)))
                .lines().collect(Collectors.joining("\n")) as String)
        parseMappings(builder.toString())
    }
}

class GenMapping {
    fun genMap(name: String, classData: ClassData): String {
        val builder = StringBuilder()
        //builder.append(classData.name)
        // val <T> Collection<T>.length by alias(Collection<T>::size)
        //Class.forName(className.replace("/", "."))
        /*
        fun FPlayer.int2() = this.interactions()
        val ConfigManager.a by alias(ConfigManager::configFile)
        * */
        val className = name.replace("/",".")

        val clazz = try {
            Class.forName(className)
        } catch (e: ClassNotFoundException) {
            return builder.toString()
        }
        classData.fields.entries.forEach { (from, to) ->
            try {

                clazz.getField("to")
                builder.append("val ").append(className).append(".").append(to)
                    .append(" by alias(").append(className).append("::").append(from).append(")\n")
            } catch (e: NoSuchFileException) {}

        }
        return builder.toString()
    }

    fun genPrefix() {
        """
            import kotlin.properties.ReadOnlyProperty
            import kotlin.properties.ReadWriteProperty
            import kotlin.reflect.KProperty1
            fun <R, T> alias(alias: KProperty1<R, T>) = ReadOnlyProperty<R, T> { thisRef, _ -> alias.get(thisRef) }
        """.trimIndent()
    }
}

fun main() {
    val mapping = MyMappings("scripts/libs/jars/mappings-yarn.tiny")
    val name = "net/minecraft/class_9199"
    //val name = "net/minecraft/class_1802"
    val classData = mapping.mappings[name] ?: return
    println(name)
    println(GenMapping().genMap(name, classData))
}