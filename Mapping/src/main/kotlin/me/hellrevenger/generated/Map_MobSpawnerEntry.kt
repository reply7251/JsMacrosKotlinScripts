package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MobSpawnerEntry

val KClass<MobSpawnerEntry>.ENTITY_KEY by aliasStatic(MobSpawnerEntry::field_40893)
fun MobSpawnerEntry.entity() = this.comp_64()
fun MobSpawnerEntry.getCustomSpawnRules() = this.method_38097()
fun MobSpawnerEntry.getNbt() = this.method_38093()
fun MobSpawnerEntry.getEquipment() = this.method_59717()
fun MobSpawnerEntry.customSpawnRules() = this.comp_65()
fun MobSpawnerEntry.equipment() = this.comp_2648()
