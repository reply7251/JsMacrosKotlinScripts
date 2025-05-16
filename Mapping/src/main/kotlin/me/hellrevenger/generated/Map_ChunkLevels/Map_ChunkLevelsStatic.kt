package me.hellrevenger.generated.Map_ChunkLevels
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ChunkLevelsKt {
    /**
     * field_44849
     */
    val INACCESSIBLE by aliasStatic(ChunkLevels::field_44849)
    /**
     * field_51859
     */
    val FULL_GENERATION_REQUIRED_LEVEL by aliasStatic(ChunkLevels::field_51859)
    /**
     * method_51829
     */
    fun getLevelFromStatus(status: ChunkStatus?) = ChunkLevels.method_51829(status)
    /**
     * method_51831
     */
    fun shouldTickEntities(level: Int) = ChunkLevels.method_51831(level)
    /**
     * method_51832
     */
    fun shouldTickBlocks(level: Int) = ChunkLevels.method_51832(level)
    /**
     * method_51833
     */
    fun isAccessible(level: Int) = ChunkLevels.method_51833(level)
    /**
     * method_51828
     */
    fun getLevelFromType(type: ChunkLevelType?) = ChunkLevels.method_51828(type)
    /**
     * method_60437
     */
    fun getStatusForAdditionalLevel(additionalLevel: Int, emptyStatus: ChunkStatus?) = ChunkLevels.method_60437(additionalLevel, emptyStatus)
    /**
     * method_60438
     */
    fun getStatusForAdditionalLevel(level: Int) = ChunkLevels.method_60438(level)
    /**
     * method_51827
     */
    fun getStatus(level: Int) = ChunkLevels.method_51827(level)
    /**
     * method_51830
     */
    fun getType(level: Int) = ChunkLevels.method_51830(level)
}