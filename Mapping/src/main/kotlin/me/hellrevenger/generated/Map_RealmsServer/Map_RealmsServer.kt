package me.hellrevenger.generated.Map_RealmsServer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_22603
 */
var RealmsServer.state by alias(RealmsServer::field_22603)
/**
 * field_22599
 */
var RealmsServer.id by alias(RealmsServer::field_22599)
/**
 * field_22604
 */
var RealmsServer.owner by alias(RealmsServer::field_22604)
/**
 * field_22600
 */
var RealmsServer.remoteSubscriptionId by alias(RealmsServer::field_22600)
/**
 * field_46695
 */
var RealmsServer.compatibility by alias(RealmsServer::field_46695)
/**
 * field_22606
 */
var RealmsServer.players by alias(RealmsServer::field_22606)
/**
 * field_22609
 */
var RealmsServer.expiredTrial by alias(RealmsServer::field_22609)
/**
 * field_22615
 */
var RealmsServer.minigameImage by alias(RealmsServer::field_22615)
/**
 * field_54808
 */
var RealmsServer.gameMode by alias(RealmsServer::field_54808)
/**
 * field_22614
 */
var RealmsServer.minigameId by alias(RealmsServer::field_22614)
/**
 * field_22610
 */
var RealmsServer.daysLeft by alias(RealmsServer::field_22610)
/**
 * field_46693
 */
var RealmsServer.parentWorldName by alias(RealmsServer::field_46693)
/**
 * field_54807
 */
var RealmsServer.hardcore by alias(RealmsServer::field_54807)
/**
 * field_22602
 */
var RealmsServer.description by alias(RealmsServer::field_22602)
/**
 * field_46694
 */
var RealmsServer.activeVersion by alias(RealmsServer::field_46694)
/**
 * field_22611
 */
var RealmsServer.worldType by alias(RealmsServer::field_22611)
/**
 * field_46692
 */
var RealmsServer.parentWorldId by alias(RealmsServer::field_46692)
/**
 * field_22605
 */
var RealmsServer.ownerUUID by alias(RealmsServer::field_22605)
/**
 * field_22613
 */
var RealmsServer.minigameName by alias(RealmsServer::field_22613)
/**
 * field_22601
 */
var RealmsServer.name by alias(RealmsServer::field_22601)
/**
 * field_22612
 */
var RealmsServer.activeSlot by alias(RealmsServer::field_22612)
/**
 * field_22607
 */
var RealmsServer.slots by alias(RealmsServer::field_22607)
/**
 * field_22608
 */
var RealmsServer.expired by alias(RealmsServer::field_22608)
/**
 * method_25061
 */
fun RealmsServer.cloneSlots(slots: Map<Int, RealmsWorldOptions>) = this.method_25061(slots)
/**
 * method_54363
 */
fun RealmsServer.isCompatible() = this.method_54363()
/**
 * method_25067
 */
fun RealmsServer.clone() = this.method_25067()
/**
 * method_54367
 */
fun RealmsServer.isPrerelease() = this.method_54367()
/**
 * method_60315
 */
fun RealmsServer.isMinigame() = this.method_60315()
/**
 * method_25054
 */
fun RealmsServer.getWorldName(slotId: Int) = this.method_25054(slotId)
/**
 * method_54364
 */
fun RealmsServer.needsUpgrade() = this.method_54364()
/**
 * method_31403
 */
fun RealmsServer.createServerInfo(address: String) = this.method_31403(address)
/**
 * method_54365
 */
fun RealmsServer.needsDowngrade() = this.method_54365()
