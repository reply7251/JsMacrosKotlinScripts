package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Bans

val Bans.NAME_TITLE by aliasStatic(Bans::field_46009)
fun KClass<Bans>.createUsernameBanScreen(arg0: String, arg1: Runnable) = Bans.method_53556(arg0, arg1)
fun KClass<Bans>.createBanScreen(arg0: BooleanConsumer, arg1: BanDetails) = Bans.method_44652(arg0, arg1)
fun KClass<Bans>.createSkinBanScreen(arg0: Runnable) = Bans.method_53554(arg0)
