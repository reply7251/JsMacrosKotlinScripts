package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SoundEngine

fun SoundEngine.close() = this.method_19664()
fun SoundEngine.release(arg0: Source) = this.method_19662(arg0)
fun SoundEngine.createSource(arg0: net.minecraft.class_4225.class_4105) = this.method_19663(arg0)
fun SoundEngine.getSoundDevices() = this.method_38502()
fun SoundEngine.updateDeviceSpecifier() = this.method_38723()
fun SoundEngine.init(arg0: String, arg1: Boolean) = this.method_19661(arg0, arg1)
fun SoundEngine.getDebugString() = this.method_20296()
fun KClass<SoundEngine>.findAvailableDeviceSpecifier() = SoundEngine.method_38500()
fun SoundEngine.getCurrentDeviceName() = this.method_38722()
fun SoundEngine.isDeviceUnavailable() = this.method_38724()
