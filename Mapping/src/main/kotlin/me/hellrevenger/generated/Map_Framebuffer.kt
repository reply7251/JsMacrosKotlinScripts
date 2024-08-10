package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Framebuffer

val Framebuffer.textureWidth by alias(Framebuffer::field_1482)
val Framebuffer.viewportWidth by alias(Framebuffer::field_1480)
val Framebuffer.fbo by alias(Framebuffer::field_1476)
val Framebuffer.useDepthAttachment by alias(Framebuffer::field_1478)
val Framebuffer.texFilter by alias(Framebuffer::field_1483)
val Framebuffer.textureHeight by alias(Framebuffer::field_1481)
val Framebuffer.viewportHeight by alias(Framebuffer::field_1477)
fun Framebuffer.copyDepthFrom(arg0: Framebuffer) = this.method_29329(arg0)
fun Framebuffer.draw(arg0: Int, arg1: Int) = this.method_1237(arg0, arg1)
fun Framebuffer.beginWrite(arg0: Boolean) = this.method_1235(arg0)
fun Framebuffer.checkFramebufferStatus() = this.method_1239()
fun Framebuffer.resize(arg0: Int, arg1: Int, arg2: Boolean) = this.method_1234(arg0, arg1, arg2)
fun Framebuffer.setClearColor(arg0: Float, arg1: Float, arg2: Float, arg3: Float) = this.method_1236(arg0, arg1, arg2, arg3)
fun Framebuffer.clear(arg0: Boolean) = this.method_1230(arg0)
fun Framebuffer.endWrite() = this.method_1240()
fun Framebuffer.endRead() = this.method_1242()
fun Framebuffer.setTexFilter(arg0: Int) = this.method_58226(arg0)
fun Framebuffer.initFbo(arg0: Int, arg1: Int, arg2: Boolean) = this.method_1231(arg0, arg1, arg2)
fun Framebuffer.draw(arg0: Int, arg1: Int, arg2: Boolean) = this.method_22594(arg0, arg1, arg2)
fun Framebuffer.delete() = this.method_1238()
fun Framebuffer.beginRead() = this.method_35610()
