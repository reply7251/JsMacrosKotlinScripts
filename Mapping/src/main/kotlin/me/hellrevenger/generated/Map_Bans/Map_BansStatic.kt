package me.hellrevenger.generated.Map_Bans
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BansKt {
    /**
     * field_46009
     */
    val NAME_TITLE by aliasStatic(Bans::field_46009)
    /**
     * method_53556
     */
    fun createUsernameBanScreen(username: String, onClose: Runnable) = Bans.method_53556(username, onClose)
    /**
     * method_44652
     */
    fun createBanScreen(callback: BooleanConsumer, banDetails: BanDetails) = Bans.method_44652(callback, banDetails)
    /**
     * method_53554
     */
    fun createSkinBanScreen(onClose: Runnable) = Bans.method_53554(onClose)
}