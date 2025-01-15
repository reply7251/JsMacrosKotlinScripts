package me.hellrevenger.generated.Map_SpawnSettings
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<SpawnSettings>.INSTANCE by aliasStatic(SpawnSettings::field_26646)
var SpawnSettings.spawnCosts by alias(SpawnSettings::field_26406)
var SpawnSettings.spawners by alias(SpawnSettings::field_26405)
val KClass<SpawnSettings>.EMPTY_ENTRY_POOL by aliasStatic(SpawnSettings::field_30982)
var SpawnSettings.creatureSpawnProbability by alias(SpawnSettings::field_26404)
fun SpawnSettings.getSpawnDensity(arg0: EntityType<*>) = this.method_31003(arg0)
fun SpawnSettings.getSpawnEntries(arg0: SpawnGroup) = this.method_31004(arg0)
