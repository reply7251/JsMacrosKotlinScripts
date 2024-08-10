package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MobSpawnerBlockEntity

fun KClass<MobSpawnerBlockEntity>.serverTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: MobSpawnerBlockEntity) = MobSpawnerBlockEntity.method_31697(arg0, arg1, arg2, arg3)
fun KClass<MobSpawnerBlockEntity>.clientTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: MobSpawnerBlockEntity) = MobSpawnerBlockEntity.method_31696(arg0, arg1, arg2, arg3)
fun MobSpawnerBlockEntity.toUpdatePacket() = this.method_38251()
