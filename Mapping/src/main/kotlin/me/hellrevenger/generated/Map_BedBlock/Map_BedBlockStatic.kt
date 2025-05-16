package me.hellrevenger.generated.Map_BedBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BedBlockKt {
    /**
     * field_9967
     */
    val PART by aliasStatic(BedBlock::field_9967)
    /**
     * field_9968
     */
    val OCCUPIED by aliasStatic(BedBlock::field_9968)
    /**
     * method_24164
     */
    fun getBedPart(state: BlockState?) = BedBlock.method_24164(state)
    /**
     * method_18476
     */
    fun getDirection(world: BlockView?, pos: BlockPos?) = BedBlock.method_18476(world, pos)
    /**
     * method_27352
     */
    fun isBedWorking(world: world_World?) = BedBlock.method_27352(world)
    /**
     * method_24163
     */
    fun getOppositePartDirection(state: BlockState?) = BedBlock.method_24163(state)
    /**
     * method_9484
     */
    fun findWakeUpPosition(type: EntityType<*>?, world: CollisionView?, pos: BlockPos?, bedDirection: Direction?, spawnAngle: Float) = BedBlock.method_9484(type, world, pos, bedDirection, spawnAngle)
}