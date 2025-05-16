package me.hellrevenger.generated.Map_RealmsMainScreen
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RealmsMainScreenKt {
    /**
     * field_54806
     */
    val HARDCORE_ICON_TEXTURE by aliasStatic(RealmsMainScreen::field_54806)
    /**
     * method_53792
     */
    fun resetPendingInvitesCount() = RealmsMainScreen.method_53792()
    /**
     * method_54562
     */
    fun getVersionText(version: String?, compatible: Boolean) = RealmsMainScreen.method_54562(version, compatible)
    /**
     * method_20853
     */
    fun play(serverData: RealmsServer?, parent: Screen?) = RealmsMainScreen.method_20853(serverData, parent)
    /**
     * method_64834
     */
    fun getGameModeText(id: Int, hardcore: Boolean) = RealmsMainScreen.method_64834(id, hardcore)
    /**
     * method_53793
     */
    fun resetServerList() = RealmsMainScreen.method_53793()
    /**
     * method_54561
     */
    fun getVersionText(version: String?, color: Int) = RealmsMainScreen.method_54561(version, color)
    /**
     * method_54327
     */
    fun play(server: RealmsServer?, parent: Screen?, needsPreparation: Boolean) = RealmsMainScreen.method_54327(server, parent, needsPreparation)
    /**
     * method_54330
     */
    fun isSnapshotRealmsEligible() = RealmsMainScreen.method_54330()
}