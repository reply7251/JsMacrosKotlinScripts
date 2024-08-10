package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.InstanceType

val InstanceType.SERVER by aliasEnum(InstanceType::class, "field_34413")
val InstanceType.CLIENT by aliasEnum(InstanceType::class, "field_34412")
fun KClass<InstanceType>.get(arg0: MinecraftServer) = InstanceType.method_37987(arg0)
