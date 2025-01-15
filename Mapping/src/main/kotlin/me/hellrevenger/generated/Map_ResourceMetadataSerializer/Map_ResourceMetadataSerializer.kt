package me.hellrevenger.generated.Map_ResourceMetadataSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>KClass<ResourceMetadataSerializer<T>>.fromCodec(arg0: String, arg1: Codec<T>) = ResourceMetadataSerializer.method_45252<T>(arg0, arg1)
fun <T>ResourceMetadataSerializer<T>.toJson(arg0: T) = this.method_45251(arg0)
