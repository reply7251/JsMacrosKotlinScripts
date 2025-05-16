package me.hellrevenger.generated.Map_CauldronBehavior
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CauldronBehaviorKt {
    /**
     * method_32207
     */
    fun fillCauldron(world: world_World?, pos: BlockPos?, player: PlayerEntity?, hand: Hand?, stack: ItemStack?, state: BlockState?, soundEvent: SoundEvent?) = CauldronBehavior.method_32207(world, pos, player, hand, stack, state, soundEvent)
    /**
     * method_32210
     */
    fun emptyCauldron(state: BlockState?, world: world_World?, pos: BlockPos?, player: PlayerEntity?, hand: Hand?, stack: ItemStack?, output: ItemStack?, fullPredicate: Predicate<BlockState>?, soundEvent: SoundEvent?) = CauldronBehavior.method_32210(state, world, pos, player, hand, stack, output, fullPredicate, soundEvent)
    /**
     * method_32212
     */
    fun registerBehavior() = CauldronBehavior.method_32212()
    /**
     * method_32206
     */
    fun createMap(name: String?) = CauldronBehavior.method_32206(name)
    /**
     * method_34850
     */
    fun registerBucketBehavior(behavior: Map<Item, CauldronBehavior>?) = CauldronBehavior.method_34850(behavior)
}