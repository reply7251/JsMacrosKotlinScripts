package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerActivity

val PlayerActivity.joinTime by alias(PlayerActivity::field_32112)
val PlayerActivity.leaveTime by alias(PlayerActivity::field_32113)
val PlayerActivity.profileUuid by alias(PlayerActivity::field_32111)
fun KClass<PlayerActivity>.parse(arg0: JsonObject) = PlayerActivity.method_35686(arg0)
