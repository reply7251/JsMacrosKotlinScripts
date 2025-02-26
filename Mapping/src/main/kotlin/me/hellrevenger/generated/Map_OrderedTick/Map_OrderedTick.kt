package me.hellrevenger.generated.Map_OrderedTick
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_35551
 */
val <T>KClass<OrderedTick<T>>.HASH_STRATEGY by aliasStatic({OrderedTick.field_35551})
/**
 * field_35550
 */
val <T>KClass<OrderedTick<T>>.BASIC_COMPARATOR by aliasStatic({OrderedTick.field_35550})
/**
 * field_35549
 */
val <T>KClass<OrderedTick<T>>.TRIGGER_TICK_COMPARATOR by aliasStatic({OrderedTick.field_35549})
/**
 * method_39410
 */
fun <T>KClass<OrderedTick<T>>.create(arg0: T, arg1: BlockPos) = OrderedTick.method_39410<T>(arg0, arg1)
/**
 * comp_252
 */
fun <T>OrderedTick<T>.type() = this.comp_252()
/**
 * comp_253
 */
fun <T>OrderedTick<T>.pos() = this.comp_253()
/**
 * comp_254
 */
fun <T>OrderedTick<T>.triggerTick() = this.comp_254()
/**
 * comp_256
 */
fun <T>OrderedTick<T>.subTickOrder() = this.comp_256()
/**
 * comp_255
 */
fun <T>OrderedTick<T>.priority() = this.comp_255()
