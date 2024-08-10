package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ServerInfo

val ServerInfo.name by alias(ServerInfo::field_3752)
val ServerInfo.ping by alias(ServerInfo::field_3758)
val ServerInfo.protocolVersion by alias(ServerInfo::field_3756)
val ServerInfo.playerCountLabel by alias(ServerInfo::field_3753)
val ServerInfo.label by alias(ServerInfo::field_3757)
val ServerInfo.address by alias(ServerInfo::field_3761)
val ServerInfo.playerListSummary by alias(ServerInfo::field_3762)
val ServerInfo.players by alias(ServerInfo::field_41861)
val ServerInfo.version by alias(ServerInfo::field_3760)
fun ServerInfo.copyFrom(arg0: ServerInfo) = this.method_44292(arg0)
fun ServerInfo.isRealm() = this.method_52811()
fun ServerInfo.setResourcePackPolicy(arg0: net.minecraft.class_642.class_643) = this.method_2995(arg0)
fun ServerInfo.setStatus(arg0: net.minecraft.class_642.class_9083) = this.method_55824(arg0)
fun ServerInfo.toNbt() = this.method_2992()
fun ServerInfo.isLocal() = this.method_2994()
fun KClass<ServerInfo>.fromNbt(arg0: NbtCompound) = ServerInfo.method_2993(arg0)
fun ServerInfo.copyWithSettingsFrom(arg0: ServerInfo) = this.method_2996(arg0)
fun ServerInfo.setFavicon(arg0: ByteArray) = this.method_49305(arg0)
fun KClass<ServerInfo>.validateFavicon(arg0: ByteArray) = ServerInfo.method_53885(arg0)
