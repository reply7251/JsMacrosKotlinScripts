package me.hellrevenger.generated.Map_ResourcePack
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_14408
 */
fun ResourcePack.findResources(type: ResourceType, namespace: String, prefix: String, consumer: net.minecraft.class_3262.class_7664) = this.method_14408(type, namespace, prefix, consumer)
/**
 * method_14410
 */
fun ResourcePack.openRoot(segments: Array<String>) = this.method_14410(*segments)
/**
 * method_14405
 */
fun ResourcePack.open(type: ResourceType, id: Identifier) = this.method_14405(type, id)
/**
 * method_14407
 */
fun <T>ResourcePack.parseMetadata(metadataSerializer: ResourceMetadataSerializer<T>) = this.method_14407<T>(metadataSerializer)
/**
 * method_56926
 */
fun ResourcePack.getInfo() = this.method_56926()
/**
 * method_14409
 */
fun ResourcePack.getId() = this.method_14409()
/**
 * method_56929
 */
fun ResourcePack.getKnownPackInfo() = this.method_56929()
/**
 * method_14406
 */
fun ResourcePack.getNamespaces(type: ResourceType) = this.method_14406(type)
