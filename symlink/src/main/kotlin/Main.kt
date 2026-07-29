package me.hellrevenger

import java.io.File
import java.nio.charset.Charset
import java.nio.file.Files

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    if (!com.sun.security.auth.module.NTSystem().groupIDs.contains("S-1-5-32-544")) {
        throw IllegalStateException("No Permission")
    }
    val projectFolder = args[0]
    val jsMacrosFolder = findJsMacrosConfigFolder(File("").absoluteFile)

    val scriptsFolder = File(projectFolder, "scripts")
    val macrosFolder = File(jsMacrosFolder, "Macros")


    val kotlinFolder = File(macrosFolder, "kotlin")
    println("prepare to link $scriptsFolder -> $kotlinFolder")

    Files.deleteIfExists(kotlinFolder.toPath())
    val process = Runtime.getRuntime().exec(arrayOf(
        "cmd", "/c", "mklink", "/D", "\"${kotlinFolder.absolutePath}\"", "\"${scriptsFolder.absolutePath}\""
    ))
    process.inputReader().forEachLine {
        println(it)
    }
    process.errorReader().forEachLine {
        error(it)
    }
}

fun findJsMacrosConfigFolder(configFolder: File) : File {
    val identifier = "jsMacros"
    if (configFolder.name != identifier) {
        if (configFolder.parent == identifier) {
            return configFolder.parentFile
        }
        println(configFolder.name)
        println(configFolder.exists())
        if (!configFolder.isDirectory) throw IllegalArgumentException("${configFolder.absolutePath} is not a directory")
        val config = File(configFolder, "config")
        val jsMacros = if (config.exists()) {
            File(config, identifier)
        } else {
            File(configFolder, identifier)
        }
        if (jsMacros.exists()) {
            return jsMacros
        }
    } else {
        return configFolder
    }
    throw IllegalArgumentException("cannot find jsMacros folder in ${configFolder.absolutePath}")
}