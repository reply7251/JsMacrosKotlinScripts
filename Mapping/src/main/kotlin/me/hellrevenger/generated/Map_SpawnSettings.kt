package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpawnSettings

val SpawnSettings.INSTANCE by aliasStatic(SpawnSettings::field_26646)
val SpawnSettings.spawnCosts by alias(SpawnSettings::field_26406)
val SpawnSettings.spawners by alias(SpawnSettings::field_26405)
val SpawnSettings.EMPTY_ENTRY_POOL by aliasStatic(SpawnSettings::field_30982)
val SpawnSettings.creatureSpawnProbability by alias(SpawnSettings::field_26404)
fun SpawnSettings.getSpawnDensity(arg0: EntityType<*>) = this.method_31003(arg0)
fun SpawnSettings.getSpawnEntries(arg0: SpawnGroup) = this.method_31004(arg0)
