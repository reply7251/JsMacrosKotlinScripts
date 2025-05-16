package me.hellrevenger.generated.Map_Block
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_9585
 */
fun Block.onBroken(world: WorldAccess?, pos: BlockPos?, state: BlockState?) = this.method_9585(world, pos, state)
/**
 * method_23349
 */
fun Block.getVelocityMultiplier() = this.method_23349()
/**
 * method_9520
 */
fun Block.getBlastResistance() = this.method_9520()
/**
 * method_9499
 */
fun Block.getSlipperiness() = this.method_9499()
/**
 * method_9533
 */
fun Block.shouldDropItemsOnExplosion(explosion: Explosion?) = this.method_9533(explosion)
/**
 * method_40142
 */
fun Block.getRegistryEntry() = this.method_40142()
/**
 * method_9586
 */
fun Block.onDestroyedByExplosion(world: ServerWorld?, pos: BlockPos?, explosion: Explosion?) = this.method_9586(world, pos, explosion)
/**
 * method_9595
 */
fun Block.getStateManager() = this.method_9595()
/**
 * method_9496
 */
fun Block.randomDisplayTick(state: BlockState?, world: world_World?, pos: BlockPos?, random: Random?) = this.method_9496(state, world, pos, random)
/**
 * method_9538
 */
fun Block.canMobSpawnInside(state: BlockState?) = this.method_9538(state)
/**
 * method_9564
 */
fun Block.getDefaultState() = this.method_9564()
/**
 * method_34725
 */
fun Block.getStateWithProperties(state: BlockState?) = this.method_34725(state)
/**
 * method_9591
 */
fun Block.onSteppedOn(world: world_World?, pos: BlockPos?, state: BlockState?, entity: Entity?) = this.method_9591(world, pos, state, entity)
/**
 * method_9568
 */
fun Block.appendTooltip(stack: ItemStack?, context: net.minecraft.class_1792.class_9635?, tooltip: MutableList<Text>?, options: TooltipType?) = this.method_9568(stack, context, tooltip, options)
/**
 * method_9567
 */
fun Block.onPlaced(world: world_World?, pos: BlockPos?, state: BlockState?, placer: LivingEntity?, itemStack: ItemStack?) = this.method_9567(world, pos, state, placer, itemStack)
/**
 * method_9504
 */
fun Block.precipitationTick(state: BlockState?, world: world_World?, pos: BlockPos?, precipitation: net.minecraft.class_1959.class_1963?) = this.method_9504(state, world, pos, precipitation)
/**
 * method_9554
 */
fun Block.onLandedUpon(world: world_World?, state: BlockState?, pos: BlockPos?, entity: Entity?, fallDistance: Float) = this.method_9554(world, state, pos, entity, fallDistance)
/**
 * method_9605
 */
fun Block.getPlacementState(ctx: ItemPlacementContext?) = this.method_9605(ctx)
/**
 * method_9502
 */
fun Block.onEntityLand(world: BlockView?, entity: Entity?) = this.method_9502(world, entity)
/**
 * method_9543
 */
fun Block.hasDynamicBounds() = this.method_9543()
/**
 * method_9518
 */
fun Block.getName() = this.method_9518()
/**
 * method_9556
 */
fun Block.afterBreak(world: world_World?, player: PlayerEntity?, pos: BlockPos?, state: BlockState?, blockEntity: BlockEntity?, tool: ItemStack?) = this.method_9556(world, player, pos, state, blockEntity, tool)
/**
 * method_23350
 */
fun Block.getJumpVelocityMultiplier() = this.method_23350()
/**
 * method_9576
 */
fun Block.onBreak(world: world_World?, pos: BlockPos?, state: BlockState?, player: PlayerEntity?) = this.method_9576(world, pos, state, player)
