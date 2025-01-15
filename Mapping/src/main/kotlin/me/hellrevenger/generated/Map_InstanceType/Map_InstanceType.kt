package me.hellrevenger.generated.Map_InstanceType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<InstanceType>.SERVER by aliasEnum(InstanceType::class, "field_34413")
val KClass<InstanceType>.CLIENT by aliasEnum(InstanceType::class, "field_34412")
fun KClass<InstanceType>.get(arg0: MinecraftServer) = InstanceType.method_37987(arg0)
fun InstanceType.getName() = this.method_37986()
