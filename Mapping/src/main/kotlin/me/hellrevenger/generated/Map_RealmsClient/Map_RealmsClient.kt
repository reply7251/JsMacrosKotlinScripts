package me.hellrevenger.generated.Map_RealmsClient
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_21016
 */
fun RealmsClient.backupsFor(worldId: Long) = this.method_21016(worldId)
/**
 * method_21004
 */
fun RealmsClient.invite(worldId: Long, arg1: String?) = this.method_21004(worldId, arg1)
/**
 * method_21025
 */
fun RealmsClient.subscriptionFor(worldId: Long) = this.method_21025(worldId)
/**
 * method_21022
 */
fun RealmsClient.close(worldId: Long) = this.method_21022(worldId)
/**
 * method_21031
 */
fun RealmsClient.agreeToTos() = this.method_21031()
/**
 * method_21030
 */
fun RealmsClient.pendingInvites() = this.method_21030()
/**
 * method_20994
 */
fun RealmsClient.uninvite(worldId: Long, arg1: UUID?) = this.method_20994(worldId, arg1)
/**
 * method_20999
 */
fun RealmsClient.acceptInvitation(invitationId: String?) = this.method_20999(invitationId)
/**
 * method_21019
 */
fun RealmsClient.open(worldId: Long) = this.method_21019(worldId)
/**
 * method_21006
 */
fun RealmsClient.rejectInvitation(invitationId: String?) = this.method_21006(invitationId)
/**
 * method_20996
 */
fun RealmsClient.initializeWorld(worldId: Long, arg1: String?, name: String?) = this.method_20996(worldId, arg1, name)
/**
 * method_21015
 */
fun RealmsClient.listWorlds() = this.method_21015()
/**
 * method_21003
 */
fun RealmsClient.download(worldId: Long, arg1: Int) = this.method_21003(worldId, arg1)
/**
 * method_21010
 */
fun RealmsClient.restoreWorld(worldId: Long, arg1: String?) = this.method_21010(worldId, arg1)
/**
 * method_52655
 */
fun RealmsClient.mcoEnabled() = this.method_52655()
/**
 * method_35684
 */
fun RealmsClient.getPlayerActivities(worldId: Long) = this.method_35684(worldId)
/**
 * method_20991
 */
fun RealmsClient.getOwnWorld(worldId: Long) = this.method_20991(worldId)
/**
 * method_21032
 */
fun RealmsClient.getNews() = this.method_21032()
/**
 * method_49570
 */
fun RealmsClient.dismissNotifications(notifications: MutableList<UUID>?) = this.method_49570(notifications)
/**
 * method_20993
 */
fun RealmsClient.updateSlot(worldId: Long, arg1: Int, slot: RealmsWorldOptions?) = this.method_20993(worldId, arg1, slot)
/**
 * method_21028
 */
fun RealmsClient.deleteWorld(worldId: Long) = this.method_21028(worldId)
/**
 * method_21023
 */
fun RealmsClient.resetWorldWithTemplate(worldId: Long, arg1: String?) = this.method_21023(worldId, arg1)
/**
 * method_21027
 */
fun RealmsClient.clientCompatible() = this.method_21027()
/**
 * method_21017
 */
fun RealmsClient.op(worldId: Long, arg1: UUID?) = this.method_21017(worldId, arg1)
/**
 * method_20997
 */
fun RealmsClient.sendPingResults(pingResult: PingResult?) = this.method_20997(pingResult)
/**
 * method_49572
 */
fun RealmsClient.listNotifications() = this.method_49572()
/**
 * method_54361
 */
fun RealmsClient.getPrereleaseEligibleServers() = this.method_54361()
/**
 * method_21018
 */
fun RealmsClient.getLiveStats() = this.method_21018()
/**
 * method_21033
 */
fun RealmsClient.trialAvailable() = this.method_21033()
/**
 * method_20992
 */
fun RealmsClient.switchSlot(worldId: Long, arg1: Int) = this.method_20992(worldId, arg1)
/**
 * method_21013
 */
fun RealmsClient.uninviteMyselfFrom(worldId: Long) = this.method_21013(worldId)
/**
 * method_21026
 */
fun RealmsClient.upload(worldId: Long) = this.method_21026(worldId)
/**
 * method_49569
 */
fun RealmsClient.markNotificationsAsSeen(notifications: MutableList<UUID>?) = this.method_49569(notifications)
/**
 * method_21014
 */
fun RealmsClient.putIntoMinigameMode(worldId: Long, arg1: String?) = this.method_21014(worldId, arg1)
/**
 * method_21009
 */
fun RealmsClient.join(worldId: Long) = this.method_21009(worldId)
/**
 * method_21020
 */
fun RealmsClient.deop(worldId: Long, arg1: UUID?) = this.method_21020(worldId, arg1)
/**
 * method_21005
 */
fun RealmsClient.update(worldId: Long, arg1: String?, name: String?) = this.method_21005(worldId, arg1, name)
/**
 * method_21029
 */
fun RealmsClient.pendingInvitesCount() = this.method_21029()
/**
 * method_20990
 */
fun RealmsClient.fetchWorldTemplates(page: Int, pageSize: Int, type: net.minecraft.class_4877.class_4321?) = this.method_20990(page, pageSize, type)
/**
 * method_54360
 */
fun RealmsClient.createPrereleaseServer(parentWorldId: Long) = this.method_54360(parentWorldId)
