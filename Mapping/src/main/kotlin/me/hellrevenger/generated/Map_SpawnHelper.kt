package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpawnHelper

fun KClass<SpawnHelper>.shouldUseNetherFortressSpawns(arg0: BlockPos, arg1: ServerWorld, arg2: SpawnGroup, arg3: StructureAccessor) = SpawnHelper.method_38091(arg0, arg1, arg2, arg3)
fun KClass<SpawnHelper>.spawnEntitiesInChunk(arg0: SpawnGroup, arg1: ServerWorld, arg2: Chunk, arg3: BlockPos, arg4: net.minecraft.class_1948.class_5261, arg5: net.minecraft.class_1948.class_5259) = SpawnHelper.method_24930(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<SpawnHelper>.spawnEntitiesInChunk(arg0: SpawnGroup, arg1: ServerWorld, arg2: WorldChunk, arg3: net.minecraft.class_1948.class_5261, arg4: net.minecraft.class_1948.class_5259) = SpawnHelper.method_8663(arg0, arg1, arg2, arg3, arg4)
fun KClass<SpawnHelper>.spawn(arg0: ServerWorld, arg1: WorldChunk, arg2: net.minecraft.class_1948.class_5262, arg3: Boolean, arg4: Boolean, arg5: Boolean) = SpawnHelper.method_27821(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<SpawnHelper>.isClearForSpawn(arg0: BlockView, arg1: BlockPos, arg2: BlockState, arg3: FluidState, arg4: EntityType<*>) = SpawnHelper.method_8662(arg0, arg1, arg2, arg3, arg4)
fun KClass<SpawnHelper>.populateEntities(arg0: ServerWorldAccess, arg1: RegistryEntry<Biome>, arg2: ChunkPos, arg3: Random) = SpawnHelper.method_8661(arg0, arg1, arg2, arg3)
fun KClass<SpawnHelper>.setupSpawn(arg0: Int, arg1: Iterable<Entity>, arg2: net.minecraft.class_1948.class_5260, arg3: SpawnDensityCapper) = SpawnHelper.method_27815(arg0, arg1, arg2, arg3)
fun KClass<SpawnHelper>.spawnEntitiesInChunk(arg0: SpawnGroup, arg1: ServerWorld, arg2: BlockPos) = SpawnHelper.method_35240(arg0, arg1, arg2)
