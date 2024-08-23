package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RaiderPredicate

val KClass<RaiderPredicate>.CAPTAIN_WITHOUT_RAID by aliasStatic(RaiderPredicate::field_50163)
fun RaiderPredicate.hasRaid() = this.comp_2549()
fun RaiderPredicate.isCaptain() = this.comp_2550()
