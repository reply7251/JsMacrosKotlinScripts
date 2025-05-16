package me.hellrevenger.generated.Map_SerializedChunk
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SerializedChunkKt {
    /**
     * field_37664
     */
    val BLOCK_LIGHT_KEY by aliasStatic(SerializedChunk::field_37664)
    /**
     * field_37662
     */
    val IS_LIGHT_ON_KEY by aliasStatic(SerializedChunk::field_37662)
    /**
     * field_37660
     */
    val Z_POS_KEY by aliasStatic(SerializedChunk::field_37660)
    /**
     * field_37663
     */
    val SECTIONS_KEY by aliasStatic(SerializedChunk::field_37663)
    /**
     * field_37661
     */
    val HEIGHTMAPS_KEY by aliasStatic(SerializedChunk::field_37661)
    /**
     * field_37665
     */
    val SKY_LIGHT_KEY by aliasStatic(SerializedChunk::field_37665)
    /**
     * field_37659
     */
    val X_POS_KEY by aliasStatic(SerializedChunk::field_37659)
    /**
     * method_61793
     */
    fun fromChunk(world: ServerWorld?, chunk: Chunk?) = SerializedChunk.method_61793(world, chunk)
    /**
     * method_61794
     */
    fun fromNbt(world: HeightLimitView?, registryManager: DynamicRegistryManager?, nbt: NbtCompound?) = SerializedChunk.method_61794(world, registryManager, nbt)
    /**
     * method_12377
     */
    fun getChunkType(nbt: NbtCompound?) = SerializedChunk.method_12377(nbt)
}