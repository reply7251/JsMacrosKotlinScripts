package me.hellrevenger.generated.Map_ClientPlayerInteractionManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_2912
 */
fun ClientPlayerInteractionManager.clickRecipe(syncId: Int, recipeId: NetworkRecipeId, craftAll: Boolean) = this.method_2912(syncId, recipeId, craftAll)
/**
 * method_29357
 */
fun ClientPlayerInteractionManager.createPlayer(world: ClientWorld, statHandler: StatHandler, recipeBook: ClientRecipeBook) = this.method_29357(world, statHandler, recipeBook)
/**
 * method_2899
 */
fun ClientPlayerInteractionManager.breakBlock(pos: BlockPos) = this.method_2899(pos)
/**
 * method_2916
 */
fun ClientPlayerInteractionManager.pickItemFromEntity(entity: Entity, includeData: Boolean) = this.method_2916(entity, includeData)
/**
 * method_2927
 */
fun ClientPlayerInteractionManager.tick() = this.method_2927()
/**
 * method_2906
 */
fun ClientPlayerInteractionManager.clickSlot(syncId: Int, slotId: Int, button: Int, actionType: SlotActionType, player: PlayerEntity) = this.method_2906(syncId, slotId, button, actionType, player)
/**
 * method_2923
 */
fun ClientPlayerInteractionManager.isBreakingBlock() = this.method_2923()
/**
 * method_51888
 */
fun ClientPlayerInteractionManager.getBlockBreakingProgress() = this.method_51888()
/**
 * method_2907
 */
fun ClientPlayerInteractionManager.setGameMode(gameMode: GameMode) = this.method_2907(gameMode)
/**
 * method_65193
 */
fun ClientPlayerInteractionManager.pickItemFromBlock(pos: BlockPos, includeData: Boolean) = this.method_65193(pos, includeData)
/**
 * method_28107
 */
fun ClientPlayerInteractionManager.getPreviousGameMode() = this.method_28107()
/**
 * method_2914
 */
fun ClientPlayerInteractionManager.hasCreativeInventory() = this.method_2914()
/**
 * method_32790
 */
fun ClientPlayerInteractionManager.setGameModes(gameMode: GameMode, previousGameMode: GameMode) = this.method_32790(gameMode, previousGameMode)
/**
 * method_2905
 */
fun ClientPlayerInteractionManager.interactEntity(player: PlayerEntity, entity: Entity, hand: Hand) = this.method_2905(player, entity, hand)
/**
 * method_2915
 */
fun ClientPlayerInteractionManager.dropCreativeStack(stack: ItemStack) = this.method_2915(stack)
/**
 * method_2919
 */
fun ClientPlayerInteractionManager.interactItem(player: PlayerEntity, hand: Hand) = this.method_2919(player, hand)
/**
 * method_2909
 */
fun ClientPlayerInteractionManager.clickCreativeStack(stack: ItemStack, slotId: Int) = this.method_2909(stack, slotId)
/**
 * method_2918
 */
fun ClientPlayerInteractionManager.attackEntity(player: PlayerEntity, target: Entity) = this.method_2918(player, target)
/**
 * method_2903
 */
fun ClientPlayerInteractionManager.copyAbilities(player: PlayerEntity) = this.method_2903(player)
/**
 * method_2900
 */
fun ClientPlayerInteractionManager.clickButton(syncId: Int, buttonId: Int) = this.method_2900(syncId, buttonId)
/**
 * method_2925
 */
fun ClientPlayerInteractionManager.cancelBlockBreaking() = this.method_2925()
/**
 * method_2896
 */
fun ClientPlayerInteractionManager.interactBlock(player: ClientPlayerEntity, hand: Hand, hitResult: BlockHitResult) = this.method_2896(player, hand, hitResult)
/**
 * method_2913
 */
fun ClientPlayerInteractionManager.hasExperienceBar() = this.method_2913()
/**
 * method_2902
 */
fun ClientPlayerInteractionManager.updateBlockBreakingProgress(pos: BlockPos, direction: Direction) = this.method_2902(pos, direction)
/**
 * method_2910
 */
fun ClientPlayerInteractionManager.attackBlock(pos: BlockPos, direction: Direction) = this.method_2910(pos, direction)
/**
 * method_2897
 */
fun ClientPlayerInteractionManager.stopUsingItem(player: PlayerEntity) = this.method_2897(player)
/**
 * method_41931
 */
fun ClientPlayerInteractionManager.sendSequencedPacket(world: ClientWorld, packetCreator: SequencedPacketCreator) = this.method_41931(world, packetCreator)
/**
 * method_2928
 */
fun ClientPlayerInteractionManager.isFlyingLocked() = this.method_2928()
/**
 * method_54634
 */
fun ClientPlayerInteractionManager.slotChangedState(slot: Int, screenHandlerId: Int, newState: Boolean) = this.method_54634(slot, screenHandlerId, newState)
/**
 * method_2908
 */
fun ClientPlayerInteractionManager.hasStatusBars() = this.method_2908()
/**
 * method_2917
 */
fun ClientPlayerInteractionManager.interactEntityAtLocation(player: PlayerEntity, entity: Entity, hitResult: EntityHitResult, hand: Hand) = this.method_2917(player, entity, hitResult, hand)
/**
 * method_2895
 */
fun ClientPlayerInteractionManager.hasRidingInventory() = this.method_2895()
/**
 * method_2920
 */
fun ClientPlayerInteractionManager.getCurrentGameMode() = this.method_2920()
/**
 * method_2924
 */
fun ClientPlayerInteractionManager.hasLimitedAttackSpeed() = this.method_2924()
