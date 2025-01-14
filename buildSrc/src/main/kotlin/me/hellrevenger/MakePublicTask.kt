package me.hellrevenger

import me.hellrevenger.asm.Jar
import me.hellrevenger.asm.OpenItClassVisitor
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.objectweb.asm.*
import java.io.File
import java.io.FileOutputStream
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

public abstract class MakePublicTask : DefaultTask() {

    @get:InputFile
    lateinit var sourceJar: File

    @get:OutputFile
    lateinit var outputJar: File

    @TaskAction
    fun makePublic() {
        val inJar = Jar(sourceJar)
        val outFile = outputJar
        val outputStream = ZipOutputStream(FileOutputStream(outFile))

        inJar.classes.forEach {
            val classReader = ClassReader(inJar.getFileData(it))
            val classWriter = ClassWriter(0)
            val visitor = OpenItClassVisitor(classWriter)

            classReader.accept(visitor, ClassReader.SKIP_DEBUG)

            outputStream.putNextEntry(ZipEntry(it))
            outputStream.write(classWriter.toByteArray())
            outputStream.closeEntry()
        }
        inJar.others.forEach {
            outputStream.putNextEntry(ZipEntry(it))
            outputStream.write(inJar.getFileData(it))
            outputStream.closeEntry()
        }
        outputStream.close()
    }
}