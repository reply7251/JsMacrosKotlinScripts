package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LanServerPinger

val LanServerPinger.PING_ADDRESS by aliasStatic(LanServerPinger::field_33016)
val LanServerPinger.PING_PORT by aliasStatic(LanServerPinger::field_33017)
fun KClass<LanServerPinger>.parseAnnouncementMotd(arg0: String) = LanServerPinger.method_4819(arg0)
fun KClass<LanServerPinger>.createAnnouncement(arg0: String, arg1: String) = LanServerPinger.method_4818(arg0, arg1)
fun KClass<LanServerPinger>.parseAnnouncementAddressPort(arg0: String) = LanServerPinger.method_4820(arg0)
