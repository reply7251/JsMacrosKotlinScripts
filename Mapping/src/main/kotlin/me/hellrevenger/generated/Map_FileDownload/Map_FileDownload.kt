package me.hellrevenger.generated.Map_FileDownload
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun FileDownload.isFinished() = this.method_20957()
fun FileDownload.isError() = this.method_20961()
fun FileDownload.isExtracting() = this.method_20964()
fun KClass<FileDownload>.findAvailableFolderName(arg0: String) = FileDownload.method_20960(arg0)
fun FileDownload.contentLength(arg0: String) = this.method_20955(arg0)
fun FileDownload.downloadWorld(arg0: WorldDownload, arg1: String, arg2: net.minecraft.class_4392.class_4393, arg3: LevelStorage) = this.method_22100(arg0, arg1, arg2, arg3)
fun FileDownload.cancel() = this.method_20948()
