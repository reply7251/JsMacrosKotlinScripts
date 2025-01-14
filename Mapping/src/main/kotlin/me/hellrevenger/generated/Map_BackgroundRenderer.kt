package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BackgroundRenderer

val KClass<BackgroundRenderer>.WATER_FOG_CHANGE_DURATION by aliasStatic(BackgroundRenderer::field_32684)
fun KClass<BackgroundRenderer>.render(arg0: Camera, arg1: Float, arg2: ClientWorld, arg3: Int, arg4: Float) = BackgroundRenderer.method_3210(arg0, arg1, arg2, arg3, arg4)
fun KClass<BackgroundRenderer>.applyFogColor() = BackgroundRenderer.method_3212()
fun KClass<BackgroundRenderer>.clearFog() = BackgroundRenderer.method_23792()
fun KClass<BackgroundRenderer>.applyFog(arg0: Camera, arg1: net.minecraft.class_758.class_4596, arg2: Float, arg3: Boolean, arg4: Float) = BackgroundRenderer.method_3211(arg0, arg1, arg2, arg3, arg4)
