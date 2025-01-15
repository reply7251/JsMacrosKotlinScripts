package me.hellrevenger.generated.Map_BlockEntityProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun BlockEntityProvider.createBlockEntity(arg0: BlockPos, arg1: BlockState) = this.method_10123(arg0, arg1)
fun <T>BlockEntityProvider.getTicker(arg0: world_World, arg1: BlockState, arg2: BlockEntityType<T>) where T: BlockEntity = this.method_31645<T>(arg0, arg1, arg2)
fun <T>BlockEntityProvider.getGameEventListener(arg0: ServerWorld, arg1: T) where T: BlockEntity = this.method_32896<T>(arg0, arg1)
