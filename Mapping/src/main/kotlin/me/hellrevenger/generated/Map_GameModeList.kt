package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GameModeList

val GameModeList.ALL by aliasStatic(GameModeList::field_52012)
val GameModeList.SURVIVAL_LIKE by aliasStatic(GameModeList::field_52013)
fun KClass<GameModeList>.of(arg0: Array<GameMode>) = GameModeList.method_60724(*arg0)
fun GameModeList.gameModes() = this.comp_2829()
fun GameModeList.contains(arg0: GameMode) = this.method_60723(arg0)
