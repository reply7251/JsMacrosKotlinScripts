package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ResourceType

val KClass<ResourceType>.CLIENT_RESOURCES by aliasEnum(ResourceType::class, "field_14188")
val KClass<ResourceType>.SERVER_DATA by aliasEnum(ResourceType::class, "field_14190")
fun ResourceType.getDirectory() = this.method_14413()
