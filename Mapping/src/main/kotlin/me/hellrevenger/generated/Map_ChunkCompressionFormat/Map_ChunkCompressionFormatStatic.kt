package me.hellrevenger.generated.Map_ChunkCompressionFormat
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ChunkCompressionFormatKt {
    /**
     * field_20443
     */
    val DEFLATE by aliasStatic(ChunkCompressionFormat::field_20443)
    /**
     * field_48754
     */
    val DEFAULT_FORMAT by aliasStatic(ChunkCompressionFormat::field_48754)
    /**
     * field_20442
     */
    val GZIP by aliasStatic(ChunkCompressionFormat::field_20442)
    /**
     * field_48916
     */
    val CUSTOM by aliasStatic(ChunkCompressionFormat::field_48916)
    /**
     * field_20444
     */
    val UNCOMPRESSED by aliasStatic(ChunkCompressionFormat::field_20444)
    /**
     * field_48753
     */
    val LZ4 by aliasStatic(ChunkCompressionFormat::field_48753)
    /**
     * method_21887
     */
    fun exists(id: Int) = ChunkCompressionFormat.method_21887(id)
    /**
     * method_56567
     */
    fun getCurrentFormat() = ChunkCompressionFormat.method_56567()
    /**
     * method_21883
     */
    fun get(id: Int) = ChunkCompressionFormat.method_21883(id)
    /**
     * method_56568
     */
    fun setCurrentFormat(name: String?) = ChunkCompressionFormat.method_56568(name)
}