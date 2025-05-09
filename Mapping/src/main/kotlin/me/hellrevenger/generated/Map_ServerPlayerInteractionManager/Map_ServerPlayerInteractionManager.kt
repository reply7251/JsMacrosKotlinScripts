package me.hellrevenger.generated.Map_ServerPlayerInteractionManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_14263
 */
fun ServerPlayerInteractionManager.processBlockBreakingAction(pos: BlockPos, action: net.minecraft.class_2846.class_2847, direction: Direction, worldHeight: Int, sequence: Int) = this.method_14263(pos, action, direction, worldHeight, sequence)
/**
 * method_30119
 */
fun ServerPlayerInteractionManager.getPreviousGameMode() = this.method_30119()
/**
 * method_14259
 */
fun ServerPlayerInteractionManager.setWorld(world: ServerWorld) = this.method_14259(world)
/**
 * method_21717
 */
fun ServerPlayerInteractionManager.finishMining(pos: BlockPos, sequence: Int, reason: String) = this.method_21717(pos, sequence, reason)
/**
 * method_14267
 */
fun ServerPlayerInteractionManager.isSurvivalLike() = this.method_14267()
/**
 * method_14256
 */
fun ServerPlayerInteractionManager.interactItem(player: ServerPlayerEntity, world: world_World, stack: ItemStack, hand: Hand) = this.method_14256(player, world, stack, hand)
/**
 * method_14262
 */
fun ServerPlayerInteractionManager.interactBlock(player: ServerPlayerEntity, world: world_World, stack: ItemStack, hand: Hand, hitResult: BlockHitResult) = this.method_14262(player, world, stack, hand, hitResult)
/**
 * method_14264
 */
fun ServerPlayerInteractionManager.update() = this.method_14264()
/**
 * method_14268
 */
fun ServerPlayerInteractionManager.isCreative() = this.method_14268()
/**
 * method_14257
 */
fun ServerPlayerInteractionManager.getGameMode() = this.method_14257()
/**
 * method_30118
 */
fun ServerPlayerInteractionManager.changeGameMode(gameMode: GameMode) = this.method_30118(gameMode)
/**
 * method_14266
 */
fun ServerPlayerInteractionManager.tryBreakBlock(pos: BlockPos) = this.method_14266(pos)
