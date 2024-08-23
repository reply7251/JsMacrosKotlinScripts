package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VillagerType

val KClass<VillagerType>.BIOME_TO_TYPE by aliasStatic(VillagerType::field_17078)
val KClass<VillagerType>.TAIGA by aliasStatic(VillagerType::field_17077)
val KClass<VillagerType>.SWAMP by aliasStatic(VillagerType::field_17076)
val KClass<VillagerType>.SNOW by aliasStatic(VillagerType::field_17075)
val KClass<VillagerType>.SAVANNA by aliasStatic(VillagerType::field_17074)
val KClass<VillagerType>.PLAINS by aliasStatic(VillagerType::field_17073)
val KClass<VillagerType>.JUNGLE by aliasStatic(VillagerType::field_17072)
val KClass<VillagerType>.DESERT by aliasStatic(VillagerType::field_17071)
fun KClass<VillagerType>.forBiome(arg0: RegistryEntry<Biome>) = VillagerType.method_16930(arg0)
