package me.hellrevenger.generated.Map_GpuBuffer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_54350
 */
val GpuBuffer.handle by alias(GpuBuffer::field_54350)
/**
 * field_54351
 */
var GpuBuffer.size by alias(GpuBuffer::field_54351)
/**
 * method_64321
 */
fun GpuBuffer.copyFrom(arg0: ByteBuffer, arg1: Int) = this.method_64321(arg0, arg1)
/**
 * method_64318
 */
fun GpuBuffer.read() = this.method_64318()
/**
 * method_64319
 */
fun GpuBuffer.resize(arg0: Int) = this.method_64319(arg0)
/**
 * method_64322
 */
fun GpuBuffer.bind() = this.method_64322()
/**
 * method_64320
 */
fun GpuBuffer.read(arg0: Int, arg1: Int) = this.method_64320(arg0, arg1)
