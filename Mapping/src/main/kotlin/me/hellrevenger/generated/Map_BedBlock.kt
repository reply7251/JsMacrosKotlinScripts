package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BedBlock

val BedBlock.PART by aliasStatic(BedBlock::field_9967)
val BedBlock.OCCUPIED by aliasStatic(BedBlock::field_9968)
fun KClass<BedBlock>.getBedPart(arg0: BlockState) = BedBlock.method_24164(arg0)
fun KClass<BedBlock>.getDirection(arg0: BlockView, arg1: BlockPos) = BedBlock.method_18476(arg0, arg1)
fun KClass<BedBlock>.isBedWorking(arg0: world_World) = BedBlock.method_27352(arg0)
fun KClass<BedBlock>.getOppositePartDirection(arg0: BlockState) = BedBlock.method_24163(arg0)
fun KClass<BedBlock>.findWakeUpPosition(arg0: EntityType<*>, arg1: CollisionView, arg2: BlockPos, arg3: Direction, arg4: Float) = BedBlock.method_9484(arg0, arg1, arg2, arg3, arg4)
