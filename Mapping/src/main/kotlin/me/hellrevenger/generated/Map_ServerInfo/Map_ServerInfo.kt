package me.hellrevenger.generated.Map_ServerInfo
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_3752
 */
var ServerInfo.name by alias(ServerInfo::field_3752)
/**
 * field_3758
 */
var ServerInfo.ping by alias(ServerInfo::field_3758)
/**
 * field_3756
 */
var ServerInfo.protocolVersion by alias(ServerInfo::field_3756)
/**
 * field_3753
 */
var ServerInfo.playerCountLabel by alias(ServerInfo::field_3753)
/**
 * field_3757
 */
var ServerInfo.label by alias(ServerInfo::field_3757)
/**
 * field_3761
 */
var ServerInfo.address by alias(ServerInfo::field_3761)
/**
 * field_3762
 */
var ServerInfo.playerListSummary by alias(ServerInfo::field_3762)
/**
 * field_41861
 */
var ServerInfo.players by alias(ServerInfo::field_41861)
/**
 * field_3760
 */
var ServerInfo.version by alias(ServerInfo::field_3760)
/**
 * method_55825
 */
fun ServerInfo.getStatus() = this.method_55825()
/**
 * method_55616
 */
fun ServerInfo.getServerType() = this.method_55616()
/**
 * method_44292
 */
fun ServerInfo.copyFrom(arg0: ServerInfo) = this.method_44292(arg0)
/**
 * method_52811
 */
fun ServerInfo.isRealm() = this.method_52811()
/**
 * method_2995
 */
fun ServerInfo.setResourcePackPolicy(arg0: net.minecraft.class_642.class_643) = this.method_2995(arg0)
/**
 * method_55824
 */
fun ServerInfo.setStatus(arg0: net.minecraft.class_642.class_9083) = this.method_55824(arg0)
/**
 * method_2992
 */
fun ServerInfo.toNbt() = this.method_2992()
/**
 * method_2994
 */
fun ServerInfo.isLocal() = this.method_2994()
/**
 * method_2993
 */
fun KClass<ServerInfo>.fromNbt(arg0: NbtCompound) = ServerInfo.method_2993(arg0)
/**
 * method_2996
 */
fun ServerInfo.copyWithSettingsFrom(arg0: ServerInfo) = this.method_2996(arg0)
/**
 * method_49305
 */
fun ServerInfo.setFavicon(arg0: ByteArray) = this.method_49305(arg0)
/**
 * method_49306
 */
fun ServerInfo.getFavicon() = this.method_49306()
/**
 * method_53885
 */
fun KClass<ServerInfo>.validateFavicon(arg0: ByteArray) = ServerInfo.method_53885(arg0)
/**
 * method_2990
 */
fun ServerInfo.getResourcePackPolicy() = this.method_2990()
