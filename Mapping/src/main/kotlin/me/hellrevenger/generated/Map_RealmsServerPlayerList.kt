package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RealmsServerPlayerList

var RealmsServerPlayerList.serverIdToPlayers by alias(RealmsServerPlayerList::field_52121)
fun RealmsServerPlayerList.get(arg0: Long) = this.method_60863(arg0)
fun KClass<RealmsServerPlayerList>.parse(arg0: String) = RealmsServerPlayerList.method_25074(arg0)
