package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerActivity

var PlayerActivity.joinTime by alias(PlayerActivity::field_32112)
var PlayerActivity.leaveTime by alias(PlayerActivity::field_32113)
var PlayerActivity.profileUuid by alias(PlayerActivity::field_32111)
fun KClass<PlayerActivity>.parse(arg0: JsonObject) = PlayerActivity.method_35686(arg0)
