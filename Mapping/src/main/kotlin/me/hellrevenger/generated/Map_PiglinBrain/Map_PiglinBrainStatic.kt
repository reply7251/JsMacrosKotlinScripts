package me.hellrevenger.generated.Map_PiglinBrain
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PiglinBrainKt {
    /**
     * field_23826
     */
    val BARTERING_ITEM by aliasStatic(PiglinBrain::field_23826)
    /**
     * method_30091
     */
    fun getCurrentActivitySound(piglin: PiglinEntity) = PiglinBrain.method_30091(piglin)
    /**
     * method_63665
     */
    fun isWearingPiglinSafeArmor(entity: LivingEntity) = PiglinBrain.method_63665(entity)
    /**
     * method_29534
     */
    fun isZombified(entityType: EntityType<*>) = PiglinBrain.method_29534(entityType)
    /**
     * method_29536
     */
    fun getAvoiding(piglin: PiglinEntity) = PiglinBrain.method_29536(piglin)
    /**
     * method_24739
     */
    fun isGoldHoldingPlayer(target: LivingEntity) = PiglinBrain.method_24739(target)
    /**
     * method_24728
     */
    fun playerInteract(world: ServerWorld, piglin: PiglinEntity, player: PlayerEntity, hand: Hand) = PiglinBrain.method_24728(world, piglin, player, hand)
    /**
     * method_29947
     */
    fun getNearestDetectedPlayer(piglin: AbstractPiglinEntity) = PiglinBrain.method_29947(piglin)
    /**
     * method_24733
     */
    fun onGuardedBlockInteracted(world: ServerWorld, player: PlayerEntity, blockOpen: Boolean) = PiglinBrain.method_24733(world, player, blockOpen)
}