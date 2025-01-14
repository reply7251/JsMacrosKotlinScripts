package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RealmsServer

var RealmsServer.state by alias(RealmsServer::field_22603)
var RealmsServer.id by alias(RealmsServer::field_22599)
var RealmsServer.owner by alias(RealmsServer::field_22604)
var RealmsServer.remoteSubscriptionId by alias(RealmsServer::field_22600)
var RealmsServer.compatibility by alias(RealmsServer::field_46695)
var RealmsServer.players by alias(RealmsServer::field_22606)
var RealmsServer.expiredTrial by alias(RealmsServer::field_22609)
var RealmsServer.minigameImage by alias(RealmsServer::field_22615)
var RealmsServer.minigameId by alias(RealmsServer::field_22614)
var RealmsServer.daysLeft by alias(RealmsServer::field_22610)
var RealmsServer.parentWorldName by alias(RealmsServer::field_46693)
var RealmsServer.description by alias(RealmsServer::field_22602)
var RealmsServer.activeVersion by alias(RealmsServer::field_46694)
var RealmsServer.worldType by alias(RealmsServer::field_22611)
var RealmsServer.parentWorldId by alias(RealmsServer::field_46692)
var RealmsServer.ownerUUID by alias(RealmsServer::field_22605)
var RealmsServer.minigameName by alias(RealmsServer::field_22613)
var RealmsServer.name by alias(RealmsServer::field_22601)
var RealmsServer.activeSlot by alias(RealmsServer::field_22612)
var RealmsServer.slots by alias(RealmsServer::field_22607)
var RealmsServer.expired by alias(RealmsServer::field_22608)
fun RealmsServer.cloneSlots(arg0: Map<Int, RealmsWorldOptions>) = this.method_25061(arg0)
fun KClass<RealmsServer>.parse(arg0: String) = RealmsServer.method_25066(arg0)
fun RealmsServer.isCompatible() = this.method_54363()
fun RealmsServer.clone() = this.method_25067()
fun RealmsServer.hasParentWorld() = this.method_54367()
fun RealmsServer.isMinigame() = this.method_60315()
fun RealmsServer.getWorldName(arg0: Int) = this.method_25054(arg0)
fun RealmsServer.needsUpgrade() = this.method_54364()
fun KClass<RealmsServer>.parse(arg0: JsonObject) = RealmsServer.method_25056(arg0)
fun RealmsServer.createServerInfo(arg0: String) = this.method_31403(arg0)
fun RealmsServer.needsDowngrade() = this.method_54365()
