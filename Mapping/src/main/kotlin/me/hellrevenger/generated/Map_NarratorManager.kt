package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NarratorManager

val NarratorManager.EMPTY by aliasStatic(NarratorManager::field_18967)
fun NarratorManager.narrateChatMessage(arg0: Text) = this.method_44708(arg0)
fun NarratorManager.narrateSystemMessage(arg0: Text) = this.method_47976(arg0)
fun NarratorManager.clear() = this.method_1793()
fun NarratorManager.destroy() = this.method_20371()
fun NarratorManager.narrate(arg0: Text) = this.method_37015(arg0)
fun NarratorManager.narrate(arg0: String) = this.method_19788(arg0)
fun NarratorManager.onModeChange(arg0: NarratorMode) = this.method_1792(arg0)
fun NarratorManager.checkNarratorLibrary(arg0: Boolean) = this.method_52183(arg0)
fun NarratorManager.isActive() = this.method_1791()
