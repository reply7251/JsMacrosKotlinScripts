package me.hellrevenger.generated.Map_LanServerPinger
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LanServerPingerKt {
    /**
     * field_33016
     */
    val PING_ADDRESS by aliasStatic(LanServerPinger::field_33016)
    /**
     * field_33017
     */
    val PING_PORT by aliasStatic(LanServerPinger::field_33017)
    /**
     * method_4819
     */
    fun parseAnnouncementMotd(announcement: String?) = LanServerPinger.method_4819(announcement)
    /**
     * method_4818
     */
    fun createAnnouncement(motd: String?, addressPort: String?) = LanServerPinger.method_4818(motd, addressPort)
    /**
     * method_4820
     */
    fun parseAnnouncementAddressPort(announcement: String?) = LanServerPinger.method_4820(announcement)
}