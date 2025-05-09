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
fun GpuBuffer.copyFrom(buf: ByteBuffer, offset: Int) = this.method_64321(buf, offset)
/**
 * method_64318
 */
fun GpuBuffer.read() = this.method_64318()
/**
 * method_64319
 */
fun GpuBuffer.resize(newSize: Int) = this.method_64319(newSize)
/**
 * method_64322
 */
fun GpuBuffer.bind() = this.method_64322()
