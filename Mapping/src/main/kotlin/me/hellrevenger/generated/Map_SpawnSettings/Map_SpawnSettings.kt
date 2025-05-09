package me.hellrevenger.generated.Map_SpawnSettings
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_26406
 */
var SpawnSettings.spawnCosts by alias(SpawnSettings::field_26406)
/**
 * field_26405
 */
var SpawnSettings.spawners by alias(SpawnSettings::field_26405)
/**
 * field_26404
 */
var SpawnSettings.creatureSpawnProbability by alias(SpawnSettings::field_26404)
/**
 * method_31003
 */
fun SpawnSettings.getSpawnDensity(entityType: EntityType<*>) = this.method_31003(entityType)
/**
 * method_31004
 */
fun SpawnSettings.getSpawnEntries(spawnGroup: SpawnGroup) = this.method_31004(spawnGroup)
