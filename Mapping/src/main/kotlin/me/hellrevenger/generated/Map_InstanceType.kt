package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.InstanceType

val KClass<InstanceType>.SERVER by aliasEnum(InstanceType::class, "field_34413")
val KClass<InstanceType>.CLIENT by aliasEnum(InstanceType::class, "field_34412")
fun KClass<InstanceType>.get(arg0: MinecraftServer) = InstanceType.method_37987(arg0)
fun InstanceType.getName() = this.method_37986()
