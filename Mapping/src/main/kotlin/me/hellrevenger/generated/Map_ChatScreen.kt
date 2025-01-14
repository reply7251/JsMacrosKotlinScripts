package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChatScreen

val KClass<ChatScreen>.SHIFT_SCROLL_AMOUNT by aliasStatic(ChatScreen::field_32237)
fun ChatScreen.sendMessage(arg0: String, arg1: Boolean) = this.method_44056(arg0, arg1)
fun ChatScreen.setChatFromHistory(arg0: Int) = this.method_2114(arg0)
fun ChatScreen.normalize(arg0: String) = this.method_44054(arg0)
