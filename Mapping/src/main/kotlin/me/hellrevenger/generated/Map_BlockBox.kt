package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockBox

fun BlockBox.getDimensions() = this.method_14659()
fun BlockBox.move(arg0: Int, arg1: Int, arg2: Int) = this.method_14661(arg0, arg1, arg2)
fun BlockBox.contains(arg0: Int, arg1: Int, arg2: Int) = this.method_47593(arg0, arg1, arg2)
fun BlockBox.intersectsXZ(arg0: Int, arg1: Int, arg2: Int, arg3: Int) = this.method_14669(arg0, arg1, arg2, arg3)
fun BlockBox.streamChunkPos() = this.method_54883()
fun BlockBox.getBlockCountZ() = this.method_14663()
fun BlockBox.expand(arg0: Int) = this.method_35410(arg0)
fun BlockBox.intersects(arg0: BlockBox) = this.method_14657(arg0)
fun BlockBox.forEachVertex(arg0: Consumer<BlockPos>) = this.method_34391(arg0)
fun KClass<BlockBox>.infinite() = BlockBox.method_14665()
fun KClass<BlockBox>.create(arg0: Vec3i, arg1: Vec3i) = BlockBox.method_34390(arg0, arg1)
fun BlockBox.getBlockCountX() = this.method_35414()
fun BlockBox.offset(arg0: Int, arg1: Int, arg2: Int) = this.method_19311(arg0, arg1, arg2)
fun BlockBox.encompass(arg0: BlockPos) = this.method_34389(arg0)
fun BlockBox.expand(arg0: Int, arg1: Int, arg2: Int) = this.method_59718(arg0, arg1, arg2)
fun BlockBox.contains(arg0: Vec3i) = this.method_14662(arg0)
fun BlockBox.move(arg0: Vec3i) = this.method_29299(arg0)
fun BlockBox.getBlockCountY() = this.method_14660()
fun KClass<BlockBox>.rotated(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int, arg7: Int, arg8: Int, arg9: Direction) = BlockBox.method_14667(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun KClass<BlockBox>.encompassPositions(arg0: Iterable<BlockPos>) = BlockBox.method_35411(arg0)
fun KClass<BlockBox>.encompass(arg0: Iterable<BlockBox>) = BlockBox.method_35413(arg0)
fun BlockBox.encompass(arg0: BlockBox) = this.method_35412(arg0)
fun BlockBox.getCenter() = this.method_22874()
