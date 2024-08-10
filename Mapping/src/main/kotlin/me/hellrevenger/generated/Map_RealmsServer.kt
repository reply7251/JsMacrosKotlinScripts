package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RealmsServer

val RealmsServer.state by alias(RealmsServer::field_22603)
val RealmsServer.id by alias(RealmsServer::field_22599)
val RealmsServer.owner by alias(RealmsServer::field_22604)
val RealmsServer.remoteSubscriptionId by alias(RealmsServer::field_22600)
val RealmsServer.compatibility by alias(RealmsServer::field_46695)
val RealmsServer.players by alias(RealmsServer::field_22606)
val RealmsServer.expiredTrial by alias(RealmsServer::field_22609)
val RealmsServer.minigameImage by alias(RealmsServer::field_22615)
val RealmsServer.minigameId by alias(RealmsServer::field_22614)
val RealmsServer.daysLeft by alias(RealmsServer::field_22610)
val RealmsServer.parentWorldName by alias(RealmsServer::field_46693)
val RealmsServer.description by alias(RealmsServer::field_22602)
val RealmsServer.activeVersion by alias(RealmsServer::field_46694)
val RealmsServer.worldType by alias(RealmsServer::field_22611)
val RealmsServer.parentWorldId by alias(RealmsServer::field_46692)
val RealmsServer.ownerUUID by alias(RealmsServer::field_22605)
val RealmsServer.minigameName by alias(RealmsServer::field_22613)
val RealmsServer.name by alias(RealmsServer::field_22601)
val RealmsServer.activeSlot by alias(RealmsServer::field_22612)
val RealmsServer.slots by alias(RealmsServer::field_22607)
val RealmsServer.expired by alias(RealmsServer::field_22608)
fun RealmsServer.cloneSlots(arg0: Map<Int, RealmsWorldOptions>) = this.method_25061(arg0)
fun KClass<RealmsServer>.parse(arg0: String) = RealmsServer.method_25066(arg0)
fun RealmsServer.isCompatible() = this.method_54363()
fun RealmsServer.clone() = this.method_25067()
fun RealmsServer.hasParentWorld() = this.method_54367()
fun RealmsServer.isMinigame() = this.method_60315()
fun RealmsServer.getWorldName(arg0: Int) = this.method_25054(arg0)
fun RealmsServer.needsUpgrade() = this.method_54364()
fun KClass<RealmsServer>.parse(arg0: JsonObject) = RealmsServer.method_25056(arg0)
fun RealmsServer.setName(arg0: String) = this.method_25060(arg0)
fun RealmsServer.createServerInfo(arg0: String) = this.method_31403(arg0)
fun RealmsServer.setDescription(arg0: String) = this.method_25064(arg0)
fun RealmsServer.needsDowngrade() = this.method_54365()
