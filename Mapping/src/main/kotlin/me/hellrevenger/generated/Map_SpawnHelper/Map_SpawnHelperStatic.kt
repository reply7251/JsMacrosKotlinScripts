package me.hellrevenger.generated.Map_SpawnHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SpawnHelperKt {
    /**
     * method_38091
     */
    fun shouldUseNetherFortressSpawns(pos: BlockPos, world: ServerWorld, spawnGroup: SpawnGroup, structureAccessor: StructureAccessor) = SpawnHelper.method_38091(pos, world, spawnGroup, structureAccessor)
    /**
     * method_24930
     */
    fun spawnEntitiesInChunk(group: SpawnGroup, world: ServerWorld, chunk: Chunk, pos: BlockPos, checker: net.minecraft.class_1948.class_5261, runner: net.minecraft.class_1948.class_5259) = SpawnHelper.method_24930(group, world, chunk, pos, checker, runner)
    /**
     * method_61729
     */
    fun collectSpawnableGroups(info: net.minecraft.class_1948.class_5262, spawnAnimals: Boolean, spawnMonsters: Boolean, rare: Boolean) = SpawnHelper.method_61729(info, spawnAnimals, spawnMonsters, rare)
    /**
     * method_8662
     */
    fun isClearForSpawn(blockView: BlockView, pos: BlockPos, state: BlockState, fluidState: FluidState, entityType: EntityType<*>) = SpawnHelper.method_8662(blockView, pos, state, fluidState, entityType)
    /**
     * method_8661
     */
    fun populateEntities(world: ServerWorldAccess, biomeEntry: RegistryEntry<Biome>, chunkPos: ChunkPos, random: Random) = SpawnHelper.method_8661(world, biomeEntry, chunkPos, random)
    /**
     * method_27815
     */
    fun setupSpawn(spawningChunkCount: Int, entities: Iterable<Entity>, chunkSource: net.minecraft.class_1948.class_5260, densityCapper: SpawnDensityCapper) = SpawnHelper.method_27815(spawningChunkCount, entities, chunkSource, densityCapper)
    /**
     * method_27821
     */
    fun spawn(world: ServerWorld, chunk: WorldChunk, info: net.minecraft.class_1948.class_5262, spawnableGroups: MutableList<SpawnGroup>) = SpawnHelper.method_27821(world, chunk, info, spawnableGroups)
}