package me.hellrevenger.generated.Map_BedBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<BedBlock>.PART by aliasStatic(BedBlock::field_9967)
val KClass<BedBlock>.OCCUPIED by aliasStatic(BedBlock::field_9968)
fun BedBlock.getColor() = this.method_9487()
fun KClass<BedBlock>.getBedPart(arg0: BlockState) = BedBlock.method_24164(arg0)
fun KClass<BedBlock>.getDirection(arg0: BlockView, arg1: BlockPos) = BedBlock.method_18476(arg0, arg1)
fun KClass<BedBlock>.isBedWorking(arg0: world_World) = BedBlock.method_27352(arg0)
fun KClass<BedBlock>.getOppositePartDirection(arg0: BlockState) = BedBlock.method_24163(arg0)
fun KClass<BedBlock>.findWakeUpPosition(arg0: EntityType<*>, arg1: CollisionView, arg2: BlockPos, arg3: Direction, arg4: Float) = BedBlock.method_9484(arg0, arg1, arg2, arg3, arg4)
