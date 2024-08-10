package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ServerDynamicRegistryType

val ServerDynamicRegistryType.DIMENSIONS by aliasEnum(ServerDynamicRegistryType::class, "field_39973")
val ServerDynamicRegistryType.RELOADABLE by aliasEnum(ServerDynamicRegistryType::class, "field_39974")
val ServerDynamicRegistryType.STATIC by aliasEnum(ServerDynamicRegistryType::class, "field_39971")
val ServerDynamicRegistryType.WORLDGEN by aliasEnum(ServerDynamicRegistryType::class, "field_39972")
fun KClass<ServerDynamicRegistryType>.createCombinedDynamicRegistries() = ServerDynamicRegistryType.method_45139()
