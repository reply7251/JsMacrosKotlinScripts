package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PngMetadata

fun KClass<PngMetadata>.validate(arg0: ByteBuffer) = PngMetadata.method_54945(arg0)
fun KClass<PngMetadata>.fromStream(arg0: InputStream) = PngMetadata.method_53877(arg0)
fun KClass<PngMetadata>.fromBytes(arg0: ByteArray) = PngMetadata.method_53878(arg0)
fun PngMetadata.width() = this.comp_1965()
fun PngMetadata.height() = this.comp_1966()
