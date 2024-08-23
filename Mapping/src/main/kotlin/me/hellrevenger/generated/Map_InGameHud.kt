package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.InGameHud

var InGameHud.vignetteDarkness by alias(InGameHud::field_2013)
fun InGameHud.clearTitle() = this.method_34003()
fun InGameHud.renderAutosaveIndicator(arg0: DrawContext, arg1: RenderTickCounter) = this.method_39192(arg0, arg1)
fun InGameHud.setRecordPlayingOverlay(arg0: Text) = this.method_1732(arg0)
fun InGameHud.clear() = this.method_1747()
fun InGameHud.getTextRenderer() = this.method_1756()
fun InGameHud.getSpectatorHud() = this.method_1739()
fun InGameHud.setDefaultTitleFade() = this.method_1742()
fun InGameHud.render(arg0: DrawContext, arg1: RenderTickCounter) = this.method_1753(arg0, arg1)
fun InGameHud.setTitleTicks(arg0: Int, arg1: Int, arg2: Int) = this.method_34001(arg0, arg1, arg2)
fun InGameHud.setTitle(arg0: Text) = this.method_34004(arg0)
fun InGameHud.getTicks() = this.method_1738()
fun InGameHud.shouldShowChatDisabledScreen() = this.method_44353()
fun InGameHud.getChatHud() = this.method_1743()
fun InGameHud.tick(arg0: Boolean) = this.method_39191(arg0)
fun InGameHud.setCanShowChatDisabledScreen(arg0: Boolean) = this.method_44354(arg0)
fun InGameHud.setOverlayMessage(arg0: Text, arg1: Boolean) = this.method_1758(arg0, arg1)
fun InGameHud.setSubtitle(arg0: Text) = this.method_34002(arg0)
fun InGameHud.getDebugHud() = this.method_53531()
fun InGameHud.resetDebugHudChunk() = this.method_1745()
fun InGameHud.getBossBarHud() = this.method_1740()
fun InGameHud.getPlayerListHud() = this.method_1750()
