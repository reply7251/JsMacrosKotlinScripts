package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MobSpawnerLogic

val KClass<MobSpawnerLogic>.SPAWN_DATA_KEY by aliasStatic(MobSpawnerLogic::field_40877)
fun MobSpawnerLogic.sendStatus(arg0: world_World, arg1: BlockPos, arg2: Int) = this.method_8273(arg0, arg1, arg2)
fun MobSpawnerLogic.getRenderedEntity(arg0: world_World, arg1: BlockPos) = this.method_8283(arg0, arg1)
fun MobSpawnerLogic.getRotation() = this.method_8278()
fun MobSpawnerLogic.serverTick(arg0: ServerWorld, arg1: BlockPos) = this.method_31588(arg0, arg1)
fun MobSpawnerLogic.handleStatus(arg0: world_World, arg1: Int) = this.method_8275(arg0, arg1)
fun MobSpawnerLogic.writeNbt(arg0: NbtCompound) = this.method_8272(arg0)
fun MobSpawnerLogic.clientTick(arg0: world_World, arg1: BlockPos) = this.method_31589(arg0, arg1)
fun MobSpawnerLogic.setEntityId(arg0: EntityType<*>, arg1: world_World, arg2: Random, arg3: BlockPos) = this.method_8274(arg0, arg1, arg2, arg3)
fun MobSpawnerLogic.getLastRotation() = this.method_8279()
fun MobSpawnerLogic.readNbt(arg0: world_World, arg1: BlockPos, arg2: NbtCompound) = this.method_8280(arg0, arg1, arg2)
