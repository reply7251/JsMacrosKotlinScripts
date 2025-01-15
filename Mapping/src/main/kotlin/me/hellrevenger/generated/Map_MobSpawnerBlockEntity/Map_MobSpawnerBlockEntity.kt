package me.hellrevenger.generated.Map_MobSpawnerBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<MobSpawnerBlockEntity>.serverTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: MobSpawnerBlockEntity) = MobSpawnerBlockEntity.method_31697(arg0, arg1, arg2, arg3)
fun KClass<MobSpawnerBlockEntity>.clientTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: MobSpawnerBlockEntity) = MobSpawnerBlockEntity.method_31696(arg0, arg1, arg2, arg3)
fun MobSpawnerBlockEntity.toUpdatePacket() = this.method_38251()
fun MobSpawnerBlockEntity.getLogic() = this.method_11390()
