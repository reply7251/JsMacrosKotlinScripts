package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkCompressionFormat

val KClass<ChunkCompressionFormat>.DEFLATE by aliasStatic(ChunkCompressionFormat::field_20443)
val KClass<ChunkCompressionFormat>.DEFAULT_FORMAT by aliasStatic(ChunkCompressionFormat::field_48754)
val KClass<ChunkCompressionFormat>.GZIP by aliasStatic(ChunkCompressionFormat::field_20442)
val KClass<ChunkCompressionFormat>.CUSTOM by aliasStatic(ChunkCompressionFormat::field_48916)
val KClass<ChunkCompressionFormat>.UNCOMPRESSED by aliasStatic(ChunkCompressionFormat::field_20444)
val KClass<ChunkCompressionFormat>.LZ4 by aliasStatic(ChunkCompressionFormat::field_48753)
fun KClass<ChunkCompressionFormat>.exists(arg0: Int) = ChunkCompressionFormat.method_21887(arg0)
fun ChunkCompressionFormat.wrap(arg0: InputStream) = this.method_21885(arg0)
fun KClass<ChunkCompressionFormat>.getCurrentFormat() = ChunkCompressionFormat.method_56567()
fun ChunkCompressionFormat.wrap(arg0: OutputStream) = this.method_21886(arg0)
fun KClass<ChunkCompressionFormat>.get(arg0: Int) = ChunkCompressionFormat.method_21883(arg0)
fun KClass<ChunkCompressionFormat>.setCurrentFormat(arg0: String) = ChunkCompressionFormat.method_56568(arg0)
fun ChunkCompressionFormat.getId() = this.method_21882()
