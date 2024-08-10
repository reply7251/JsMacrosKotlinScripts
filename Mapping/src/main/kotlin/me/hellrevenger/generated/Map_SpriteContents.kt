package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpriteContents

val SpriteContents.mipmapLevelsImages by alias(SpriteContents::field_40540)
fun SpriteContents.createAnimator() = this.method_45818()
fun SpriteContents.upload(arg0: Int, arg1: Int) = this.method_45809(arg0, arg1)
fun SpriteContents.isPixelTransparent(arg0: Int, arg1: Int, arg2: Int) = this.method_45810(arg0, arg1, arg2)
fun SpriteContents.getDistinctFrameCount() = this.method_45817()
fun SpriteContents.getFrameCount() = this.method_45819()
fun SpriteContents.generateMipmaps(arg0: Int) = this.method_45808(arg0)
