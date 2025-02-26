package me.hellrevenger.generated.Map_SpawnSettings
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_26646
 */
val KClass<SpawnSettings>.INSTANCE by aliasStatic(SpawnSettings::field_26646)
/**
 * field_26406
 */
var SpawnSettings.spawnCosts by alias(SpawnSettings::field_26406)
/**
 * field_26405
 */
var SpawnSettings.spawners by alias(SpawnSettings::field_26405)
/**
 * field_30982
 */
val KClass<SpawnSettings>.EMPTY_ENTRY_POOL by aliasStatic(SpawnSettings::field_30982)
/**
 * field_26404
 */
var SpawnSettings.creatureSpawnProbability by alias(SpawnSettings::field_26404)
/**
 * method_31003
 */
fun SpawnSettings.getSpawnDensity(arg0: EntityType<*>) = this.method_31003(arg0)
/**
 * method_31004
 */
fun SpawnSettings.getSpawnEntries(arg0: SpawnGroup) = this.method_31004(arg0)
