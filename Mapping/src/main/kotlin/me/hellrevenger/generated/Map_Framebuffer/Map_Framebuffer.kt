package me.hellrevenger.generated.Map_Framebuffer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_1482
 */
var Framebuffer.textureWidth by alias(Framebuffer::field_1482)
/**
 * field_1480
 */
var Framebuffer.viewportWidth by alias(Framebuffer::field_1480)
/**
 * field_1476
 */
var Framebuffer.fbo by alias(Framebuffer::field_1476)
/**
 * field_1478
 */
val Framebuffer.useDepthAttachment by alias(Framebuffer::field_1478)
/**
 * field_1483
 */
var Framebuffer.texFilter by alias(Framebuffer::field_1483)
/**
 * field_1481
 */
var Framebuffer.textureHeight by alias(Framebuffer::field_1481)
/**
 * field_1477
 */
var Framebuffer.viewportHeight by alias(Framebuffer::field_1477)
/**
 * method_29329
 */
fun Framebuffer.copyDepthFrom(framebuffer: Framebuffer?) = this.method_29329(framebuffer)
/**
 * method_30277
 */
fun Framebuffer.getColorAttachment() = this.method_30277()
/**
 * method_1237
 */
fun Framebuffer.draw(width: Int, height: Int) = this.method_1237(width, height)
/**
 * method_1233
 */
fun Framebuffer.drawInternal(width: Int, height: Int) = this.method_1233(width, height)
/**
 * method_1235
 */
fun Framebuffer.beginWrite(setViewport: Boolean) = this.method_1235(setViewport)
/**
 * method_1231
 */
fun Framebuffer.initFbo(width: Int, height: Int) = this.method_1231(width, height)
/**
 * method_1239
 */
fun Framebuffer.checkFramebufferStatus() = this.method_1239()
/**
 * method_30278
 */
fun Framebuffer.getDepthAttachment() = this.method_30278()
/**
 * method_1236
 */
fun Framebuffer.setClearColor(r: Float, g: Float, b: Float, a: Float) = this.method_1236(r, g, b, a)
/**
 * method_1234
 */
fun Framebuffer.resize(width: Int, height: Int) = this.method_1234(width, height)
/**
 * method_1240
 */
fun Framebuffer.endWrite() = this.method_1240()
/**
 * method_1242
 */
fun Framebuffer.endRead() = this.method_1242()
/**
 * method_1230
 */
fun Framebuffer.clear() = this.method_1230()
/**
 * method_1238
 */
fun Framebuffer.delete() = this.method_1238()
/**
 * method_35610
 */
fun Framebuffer.beginRead() = this.method_35610()
