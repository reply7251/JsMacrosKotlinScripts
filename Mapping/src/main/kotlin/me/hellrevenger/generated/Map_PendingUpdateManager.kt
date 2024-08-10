package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PendingUpdateManager

fun PendingUpdateManager.hasPendingUpdate(arg0: BlockPos, arg1: BlockState) = this.method_41940(arg0, arg1)
fun PendingUpdateManager.processPendingUpdates(arg0: Int, arg1: ClientWorld) = this.method_41938(arg0, arg1)
fun PendingUpdateManager.addPendingUpdate(arg0: BlockPos, arg1: BlockState, arg2: ClientPlayerEntity) = this.method_41941(arg0, arg1, arg2)
fun PendingUpdateManager.incrementSequence() = this.method_41937()
fun PendingUpdateManager.hasPendingSequence() = this.method_41943()
