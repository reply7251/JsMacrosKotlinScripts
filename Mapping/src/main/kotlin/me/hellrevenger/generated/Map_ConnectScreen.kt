package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ConnectScreen

val KClass<ConnectScreen>.ABORTED_TEXT by aliasStatic(ConnectScreen::field_44970)
val KClass<ConnectScreen>.UNKNOWN_HOST_TEXT by aliasStatic(ConnectScreen::field_33736)
fun KClass<ConnectScreen>.connect(arg0: Screen, arg1: MinecraftClient, arg2: ServerAddress, arg3: ServerInfo, arg4: Boolean, arg5: CookieStorage) = ConnectScreen.method_36877(arg0, arg1, arg2, arg3, arg4, arg5)
