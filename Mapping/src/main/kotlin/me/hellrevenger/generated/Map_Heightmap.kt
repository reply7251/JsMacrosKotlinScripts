package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Heightmap

fun Heightmap.setTo(arg0: Chunk, arg1: net.minecraft.class_2902.class_2903, arg2: LongArray) = this.method_12600(arg0, arg1, arg2)
fun KClass<Heightmap>.populateHeightmaps(arg0: Chunk, arg1: Set<net.minecraft.class_2902.class_2903>) = Heightmap.method_16684(arg0, arg1)
fun Heightmap.get(arg0: Int, arg1: Int) = this.method_12603(arg0, arg1)
fun Heightmap.trackUpdate(arg0: Int, arg1: Int, arg2: Int, arg3: BlockState) = this.method_12597(arg0, arg1, arg2, arg3)
fun Heightmap.asLongArray() = this.method_12598()
