package me.hellrevenger.generated.Map_BlockHitResult
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun BlockHitResult.withBlockPos(arg0: BlockPos) = this.method_29328(arg0)
fun BlockHitResult.withSide(arg0: Direction) = this.method_17779(arg0)
fun BlockHitResult.getSide() = this.method_17780()
fun BlockHitResult.getBlockPos() = this.method_17777()
fun KClass<BlockHitResult>.createMissed(arg0: Vec3d, arg1: Direction, arg2: BlockPos) = BlockHitResult.method_17778(arg0, arg1, arg2)
fun BlockHitResult.isInsideBlock() = this.method_17781()
