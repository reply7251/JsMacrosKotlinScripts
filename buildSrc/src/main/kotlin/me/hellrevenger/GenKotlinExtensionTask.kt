package me.hellrevenger

import net.fabricmc.mappingio.FlatMappingVisitor
import net.fabricmc.mappingio.MappingReader
import net.fabricmc.mappingio.adapter.FlatAsRegularMappingVisitor
import net.fabricmc.mappingio.adapter.MappingDstNsReorder
import net.fabricmc.mappingio.adapter.MappingSourceNsSwitch
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.InputFile
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader

import me.hellrevenger.asm.IMappingAccessor
import me.hellrevenger.asm.Jar
import me.hellrevenger.asm.RemapClassVisitor
import me.hellrevenger.asm.Remapper
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.objectweb.asm.ClassReader


public abstract class GenKotlinExtensionTask : DefaultTask() {
    @get:InputFile
    lateinit var sourceJar: File
    @get:InputFile
    lateinit var mappingFile: File

    @get:Input
    lateinit var fromNamespace: String

    @get:Input
    lateinit var toNamespace: String

    @get:Input
    lateinit var extensionName: String

    @get:OutputDirectory
    lateinit var outputDirectory: File

    @TaskAction
    fun genMapping() {
        val remapper = Remapper()
        MappingReader.read(BufferedReader(InputStreamReader(FileInputStream(mappingFile))),
            MappingSourceNsSwitch(MappingDstNsReorder(
                FlatAsRegularMappingVisitor(MyMappingVisitor(remapper)), toNamespace
            ), fromNamespace))


        val inJar = Jar(sourceJar)
        inJar.classes.forEach {
            val classReader = ClassReader(inJar.getFileData(it))
            val visitor = RemapClassVisitor(outputDirectory, extensionName, remapper)

            classReader.accept(visitor, ClassReader.SKIP_FRAMES)
        }
    }
}

class MyMappingVisitor(val next: IMappingAccessor) : FlatMappingVisitor {

    override fun visitClass(src: String?, dsts: Array<out String?>): Boolean {
        if(!(nullOrEqual(src, dsts[0]))) {
            val dst = dsts[0]
        }
        return true
    }

    override fun visitField(
        srcClassName: String?,
        srcName: String?,
        srcDesc: String?,
        dstClassNames: Array<out String?>,
        dstNames: Array<out String?>,
        dstDesc: Array<out String?>
    ): Boolean {
        if(!nullOrEqual(srcName, dstNames[0])) {
            next.accessField(IMappingAccessor.Member(srcClassName, srcName, srcDesc), dstNames[0]!!)
        }
        return false
    }

    override fun visitMethod(
        srcClassName: String?,
        srcName: String?,
        srcDesc: String?,
        dstClassNames: Array<out String?>?,
        dstNames: Array<out String?>,
        dstDesc: Array<out String?>?
    ): Boolean {
        if(!nullOrEqual(srcName, dstNames[0])) {
            next.accessMethod(IMappingAccessor.Member(srcClassName, srcName!!, srcDesc), dstNames[0]!!)
        }
        return true
    }

    override fun visitMethodArg(
        srcClsName: String?,
        srcMethodName: String?,
        srcMethodDesc: String?,
        argPosition: Int,
        lvIndex: Int,
        srcArgName: String?,
        dstClsNames: Array<out String?>?,
        dstMethodNames: Array<out String?>?,
        dstMethodDescs: Array<out String?>?,
        dstArgNames: Array<out String>
    ): Boolean {
        if(!nullOrEqual(srcArgName, dstArgNames[0])) {
            next.accessMethodArg(IMappingAccessor.Member(srcClsName, srcMethodName!!, srcMethodDesc), lvIndex, dstArgNames[0])
        }
        return false
    }

    override fun visitMethodVar(
        p0: String?,
        p1: String?,
        p2: String?,
        p3: Int,
        p4: Int,
        p5: Int,
        p6: Int,
        p7: String?,
        p8: Array<out String?>?,
        p9: Array<out String?>?,
        p10: Array<out String?>?,
        p11: Array<out String>?
    ): Boolean {
        return false
    }

    override fun visitFieldComment(
        p0: String?,
        p1: String?,
        p2: String?,
        p3: Array<out String?>?,
        p4: Array<out String?>?,
        p5: Array<out String?>?,
        p6: String?
    ) { }

    override fun visitNamespaces(p0: String?, p1: MutableList<String>?) { }

    override fun visitClassComment(p0: String?, p1: Array<out String?>?, p2: String?) { }

    override fun visitMethodComment(
        p0: String?,
        p1: String?,
        p2: String?,
        p3: Array<out String?>?,
        p4: Array<out String?>?,
        p5: Array<out String?>?,
        p6: String?
    ) { }

    override fun visitMethodArgComment(
        p0: String?,
        p1: String?,
        p2: String?,
        p3: Int,
        p4: Int,
        p5: String?,
        p6: Array<out String?>?,
        p7: Array<out String?>?,
        p8: Array<out String?>?,
        p9: Array<out String?>?,
        p10: String?
    ) { }

    override fun visitMethodVarComment(
        p0: String?,
        p1: String?,
        p2: String?,
        p3: Int,
        p4: Int,
        p5: Int,
        p6: Int,
        p7: String?,
        p8: Array<out String?>?,
        p9: Array<out String?>?,
        p10: Array<out String?>?,
        p11: Array<out String?>?,
        p12: String?
    ) { }

    fun nullOrEqual(a1: Any?, a2: Any?) = a1 == null || a2 == null || a1 == a2
}