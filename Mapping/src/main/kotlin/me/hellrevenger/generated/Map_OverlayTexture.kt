package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.OverlayTexture

val KClass<OverlayTexture>.DEFAULT_UV by aliasStatic(OverlayTexture::field_21444)
fun KClass<OverlayTexture>.getV(arg0: Boolean) = OverlayTexture.method_23212(arg0)
fun KClass<OverlayTexture>.getU(arg0: Float) = OverlayTexture.method_23210(arg0)
fun KClass<OverlayTexture>.getUv(arg0: Float, arg1: Boolean) = OverlayTexture.method_23624(arg0, arg1)
fun KClass<OverlayTexture>.packUv(arg0: Int, arg1: Int) = OverlayTexture.method_23625(arg0, arg1)
fun OverlayTexture.teardownOverlayColor() = this.method_23213()
fun OverlayTexture.setupOverlayColor() = this.method_23209()
