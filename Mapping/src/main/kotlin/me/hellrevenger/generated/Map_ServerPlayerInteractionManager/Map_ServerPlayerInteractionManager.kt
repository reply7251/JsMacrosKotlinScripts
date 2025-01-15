package me.hellrevenger.generated.Map_ServerPlayerInteractionManager
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun ServerPlayerInteractionManager.processBlockBreakingAction(arg0: BlockPos, arg1: net.minecraft.class_2846.class_2847, arg2: Direction, arg3: Int, arg4: Int) = this.method_14263(arg0, arg1, arg2, arg3, arg4)
fun ServerPlayerInteractionManager.getPreviousGameMode() = this.method_30119()
fun ServerPlayerInteractionManager.setWorld(arg0: ServerWorld) = this.method_14259(arg0)
fun ServerPlayerInteractionManager.finishMining(arg0: BlockPos, arg1: Int, arg2: String) = this.method_21717(arg0, arg1, arg2)
fun ServerPlayerInteractionManager.isSurvivalLike() = this.method_14267()
fun ServerPlayerInteractionManager.interactItem(arg0: ServerPlayerEntity, arg1: world_World, arg2: ItemStack, arg3: Hand) = this.method_14256(arg0, arg1, arg2, arg3)
fun ServerPlayerInteractionManager.interactBlock(arg0: ServerPlayerEntity, arg1: world_World, arg2: ItemStack, arg3: Hand, arg4: BlockHitResult) = this.method_14262(arg0, arg1, arg2, arg3, arg4)
fun ServerPlayerInteractionManager.update() = this.method_14264()
fun ServerPlayerInteractionManager.isCreative() = this.method_14268()
fun ServerPlayerInteractionManager.getGameMode() = this.method_14257()
fun ServerPlayerInteractionManager.changeGameMode(arg0: GameMode) = this.method_30118(arg0)
fun ServerPlayerInteractionManager.tryBreakBlock(arg0: BlockPos) = this.method_14266(arg0)
