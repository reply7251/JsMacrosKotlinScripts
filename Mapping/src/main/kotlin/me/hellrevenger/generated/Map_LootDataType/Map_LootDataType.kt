package me.hellrevenger.generated.Map_LootDataType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val <T>KClass<LootDataType<T>>.LOOT_TABLES by aliasStatic({LootDataType.field_44498})
val <T>KClass<LootDataType<T>>.ITEM_MODIFIERS by aliasStatic({LootDataType.field_44497})
val <T>KClass<LootDataType<T>>.PREDICATES by aliasStatic({LootDataType.field_44496})
fun <T, V>LootDataType<T>.parse(arg0: Identifier, arg1: DynamicOps<V>, arg2: V) = this.method_51204<V>(arg0, arg1, arg2)
fun <T>LootDataType<T>.validate(arg0: LootTableReporter, arg1: RegistryKey<T>, arg2: T) = this.method_51209(arg0, arg1, arg2)
fun <T>KClass<LootDataType<T>>.stream() = LootDataType.method_51215()
fun <T>LootDataType<T>.validator() = this.comp_2522()
fun <T>LootDataType<T>.codec() = this.comp_2520()
fun <T>LootDataType<T>.registryKey() = this.comp_2519()
