package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpawnGroup

val SpawnGroup.CREATURE by aliasEnum(SpawnGroup::class, "field_6294")
val SpawnGroup.UNDERGROUND_WATER_CREATURE by aliasEnum(SpawnGroup::class, "field_30092")
val SpawnGroup.WATER_AMBIENT by aliasEnum(SpawnGroup::class, "field_24460")
val SpawnGroup.WATER_CREATURE by aliasEnum(SpawnGroup::class, "field_6300")
val SpawnGroup.AMBIENT by aliasEnum(SpawnGroup::class, "field_6303")
val SpawnGroup.MONSTER by aliasEnum(SpawnGroup::class, "field_6302")
val SpawnGroup.AXOLOTLS by aliasEnum(SpawnGroup::class, "field_34447")
val SpawnGroup.MISC by aliasEnum(SpawnGroup::class, "field_17715")
fun SpawnGroup.isRare() = this.method_6135()
fun SpawnGroup.isPeaceful() = this.method_6136()
