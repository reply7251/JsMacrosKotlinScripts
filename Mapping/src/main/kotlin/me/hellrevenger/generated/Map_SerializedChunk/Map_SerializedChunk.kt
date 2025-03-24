package me.hellrevenger.generated.Map_SerializedChunk
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_37664
 */
val KClass<SerializedChunk>.BLOCK_LIGHT_KEY by aliasStatic(SerializedChunk::field_37664)
/**
 * field_37662
 */
val KClass<SerializedChunk>.IS_LIGHT_ON_KEY by aliasStatic(SerializedChunk::field_37662)
/**
 * field_37660
 */
val KClass<SerializedChunk>.Z_POS_KEY by aliasStatic(SerializedChunk::field_37660)
/**
 * field_37663
 */
val KClass<SerializedChunk>.SECTIONS_KEY by aliasStatic(SerializedChunk::field_37663)
/**
 * field_37661
 */
val KClass<SerializedChunk>.HEIGHTMAPS_KEY by aliasStatic(SerializedChunk::field_37661)
/**
 * field_37665
 */
val KClass<SerializedChunk>.SKY_LIGHT_KEY by aliasStatic(SerializedChunk::field_37665)
/**
 * field_37659
 */
val KClass<SerializedChunk>.X_POS_KEY by aliasStatic(SerializedChunk::field_37659)
/**
 * method_61793
 */
fun KClass<SerializedChunk>.fromChunk(arg0: ServerWorld, arg1: Chunk) = SerializedChunk.method_61793(arg0, arg1)
/**
 * method_61794
 */
fun KClass<SerializedChunk>.fromNbt(arg0: HeightLimitView, arg1: DynamicRegistryManager, arg2: NbtCompound) = SerializedChunk.method_61794(arg0, arg1, arg2)
/**
 * method_12377
 */
fun KClass<SerializedChunk>.getChunkType(arg0: NbtCompound) = SerializedChunk.method_12377(arg0)
/**
 * method_12410
 */
fun SerializedChunk.serialize() = this.method_12410()
/**
 * method_12395
 */
fun SerializedChunk.convert(arg0: ServerWorld, arg1: PointOfInterestStorage, arg2: StorageKey, arg3: ChunkPos) = this.method_12395(arg0, arg1, arg2, arg3)
/**
 * comp_2949
 */
fun SerializedChunk.inhabitedTime() = this.comp_2949()
/**
 * comp_2948
 */
fun SerializedChunk.lastUpdateTime() = this.comp_2948()
/**
 * comp_2947
 */
fun SerializedChunk.minSectionY() = this.comp_2947()
/**
 * comp_2953
 */
fun SerializedChunk.upgradeData() = this.comp_2953()
/**
 * comp_2957
 */
fun SerializedChunk.postProcessingSections() = this.comp_2957()
/**
 * comp_2950
 */
fun SerializedChunk.chunkStatus() = this.comp_2950()
/**
 * comp_2962
 */
fun SerializedChunk.structureData() = this.comp_2962()
/**
 * comp_2954
 */
fun SerializedChunk.carvingMask() = this.comp_2954()
/**
 * comp_2946
 */
fun SerializedChunk.chunkPos() = this.comp_2946()
/**
 * comp_2945
 */
fun SerializedChunk.biomeRegistry() = this.comp_2945()
/**
 * comp_2951
 */
fun SerializedChunk.blendingData() = this.comp_2951()
/**
 * comp_2956
 */
fun SerializedChunk.packedTicks() = this.comp_2956()
/**
 * comp_2959
 */
fun SerializedChunk.sectionData() = this.comp_2959()
/**
 * comp_2955
 */
fun SerializedChunk.heightmaps() = this.comp_2955()
/**
 * comp_2952
 */
fun SerializedChunk.belowZeroRetrogen() = this.comp_2952()
/**
 * comp_2958
 */
fun SerializedChunk.lightCorrect() = this.comp_2958()
/**
 * comp_2961
 */
fun SerializedChunk.blockEntities() = this.comp_2961()
/**
 * comp_2960
 */
fun SerializedChunk.entities() = this.comp_2960()
