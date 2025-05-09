package me.hellrevenger.generated.Map_RealmsPopups
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RealmsPopupsKt {
    /**
     * method_60316
     */
    fun createInfoPopup(parent: Screen, message: Text, onContinuePressed: Consumer<PopupScreen>) = RealmsPopups.method_60316(parent, message, onContinuePressed)
    /**
     * method_60318
     */
    fun createNonContinuableWarningPopup(parent: Screen, message: Text, onOkPressed: Consumer<PopupScreen>) = RealmsPopups.method_60318(parent, message, onOkPressed)
    /**
     * method_60317
     */
    fun createContinuableWarningPopup(parent: Screen, message: Text, onContinuePressed: Consumer<PopupScreen>) = RealmsPopups.method_60317(parent, message, onContinuePressed)
}