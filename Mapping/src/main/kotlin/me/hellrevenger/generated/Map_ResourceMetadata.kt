package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ResourceMetadata

fun KClass<ResourceMetadata>.create(arg0: InputStream) = ResourceMetadata.method_43042(arg0)
fun <T>ResourceMetadata.decode(arg0: ResourceMetadataReader<T>) = this.method_43041<T>(arg0)
fun ResourceMetadata.copy(arg0: Collection<ResourceMetadataReader<*>>) = this.method_52446(arg0)
