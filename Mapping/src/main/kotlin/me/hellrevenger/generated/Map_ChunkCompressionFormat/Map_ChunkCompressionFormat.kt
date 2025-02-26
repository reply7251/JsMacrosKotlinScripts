package me.hellrevenger.generated.Map_ChunkCompressionFormat
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_20443
 */
val KClass<ChunkCompressionFormat>.DEFLATE by aliasStatic(ChunkCompressionFormat::field_20443)
/**
 * field_48754
 */
val KClass<ChunkCompressionFormat>.DEFAULT_FORMAT by aliasStatic(ChunkCompressionFormat::field_48754)
/**
 * field_20442
 */
val KClass<ChunkCompressionFormat>.GZIP by aliasStatic(ChunkCompressionFormat::field_20442)
/**
 * field_48916
 */
val KClass<ChunkCompressionFormat>.CUSTOM by aliasStatic(ChunkCompressionFormat::field_48916)
/**
 * field_20444
 */
val KClass<ChunkCompressionFormat>.UNCOMPRESSED by aliasStatic(ChunkCompressionFormat::field_20444)
/**
 * field_48753
 */
val KClass<ChunkCompressionFormat>.LZ4 by aliasStatic(ChunkCompressionFormat::field_48753)
/**
 * method_21887
 */
fun KClass<ChunkCompressionFormat>.exists(arg0: Int) = ChunkCompressionFormat.method_21887(arg0)
/**
 * method_21885
 */
fun ChunkCompressionFormat.wrap(arg0: InputStream) = this.method_21885(arg0)
/**
 * method_56567
 */
fun KClass<ChunkCompressionFormat>.getCurrentFormat() = ChunkCompressionFormat.method_56567()
/**
 * method_21886
 */
fun ChunkCompressionFormat.wrap(arg0: OutputStream) = this.method_21886(arg0)
/**
 * method_21883
 */
fun KClass<ChunkCompressionFormat>.get(arg0: Int) = ChunkCompressionFormat.method_21883(arg0)
/**
 * method_56568
 */
fun KClass<ChunkCompressionFormat>.setCurrentFormat(arg0: String) = ChunkCompressionFormat.method_56568(arg0)
/**
 * method_21882
 */
fun ChunkCompressionFormat.getId() = this.method_21882()
