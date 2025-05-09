package me.hellrevenger.generated.Map_PendingUpdateManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41940
 */
fun PendingUpdateManager.hasPendingUpdate(pos: BlockPos, state: BlockState) = this.method_41940(pos, state)
/**
 * method_41938
 */
fun PendingUpdateManager.processPendingUpdates(maxProcessableSequence: Int, world: ClientWorld) = this.method_41938(maxProcessableSequence, world)
/**
 * method_41941
 */
fun PendingUpdateManager.addPendingUpdate(pos: BlockPos, state: BlockState, player: ClientPlayerEntity) = this.method_41941(pos, state, player)
/**
 * method_41937
 */
fun PendingUpdateManager.incrementSequence() = this.method_41937()
/**
 * method_41942
 */
fun PendingUpdateManager.getSequence() = this.method_41942()
/**
 * method_41943
 */
fun PendingUpdateManager.hasPendingSequence() = this.method_41943()
