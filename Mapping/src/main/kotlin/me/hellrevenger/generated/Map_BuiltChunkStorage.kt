package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BuiltChunkStorage

var BuiltChunkStorage.chunks by alias(BuiltChunkStorage::field_4150)
fun BuiltChunkStorage.getWorld() = this.method_52840()
fun BuiltChunkStorage.getViewDistance() = this.method_52839()
fun BuiltChunkStorage.clear() = this.method_3327()
fun BuiltChunkStorage.scheduleRebuild(arg0: Int, arg1: Int, arg2: Int, arg3: Boolean) = this.method_16040(arg0, arg1, arg2, arg3)
fun BuiltChunkStorage.updateCameraPosition(arg0: Double, arg1: Double) = this.method_3330(arg0, arg1)
