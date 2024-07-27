package me.hellrevenger.asm

import java.io.File
import java.io.IOException
import java.util.jar.JarFile

class Jar : JarFile {
    var classesCache: MutableList<String>? = null

    constructor(name: String?) : super(name)

    constructor(file: File?) : super(file)

    val classes: List<String>
        get() {
            if (classesCache != null) {
                return classesCache!!
            }
            classesCache = ArrayList()

            val entries = this.entries()
            while (entries.hasMoreElements()) {
                val entry = entries.nextElement()
                if (!entry.isDirectory && entry.name.endsWith(".class") && !entry.name.contains("-")) {
                    classesCache!!.add(entry.name)
                }
            }
            return classesCache!!
        }

    val others: List<String>
        get() {
            val entries = this.entries()
            val classes = this.classes.toSet()
            val result = arrayListOf<String>()
            while (entries.hasMoreElements()) {
                val entry = entries.nextElement()
                if(entry.name in classes) continue

                result.add(entry.name)
            }
            return result
        }

    @Throws(IOException::class)
    fun getFileData(filename: String?): ByteArray {
        val inputStream = this.getInputStream(this.getJarEntry(filename))
        return inputStream.readAllBytes()
    }
}