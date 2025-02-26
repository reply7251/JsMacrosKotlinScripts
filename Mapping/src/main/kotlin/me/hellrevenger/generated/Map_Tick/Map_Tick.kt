package me.hellrevenger.generated.Map_Tick
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_35542
 */
val <T>KClass<Tick<T>>.HASH_STRATEGY by aliasStatic({Tick.field_35542})
/**
 * method_39401
 */
fun <T>KClass<Tick<T>>.orderedTickToNbt(arg0: OrderedTick<T>, arg1: function_Function<T, String>, arg2: Long) = Tick.method_39401<T>(arg0, arg1, arg2)
/**
 * method_39406
 */
fun <T>KClass<Tick<T>>.tick(arg0: NbtList, arg1: function_Function<String, Optional<T>>, arg2: ChunkPos, arg3: Consumer<Tick<T>>) = Tick.method_39406<T>(arg0, arg1, arg2, arg3)
/**
 * method_39402
 */
fun <T>KClass<Tick<T>>.create(arg0: T, arg1: BlockPos) = Tick.method_39402<T>(arg0, arg1)
/**
 * method_39400
 */
fun <T>Tick<T>.createOrderedTick(arg0: Long, arg1: Long) = this.method_39400(arg0, arg1)
/**
 * method_40559
 */
fun <T>KClass<Tick<T>>.fromNbt(arg0: NbtCompound, arg1: function_Function<String, Optional<T>>) = Tick.method_40559<T>(arg0, arg1)
/**
 * method_39404
 */
fun <T>Tick<T>.toNbt(arg0: function_Function<T, String>) = this.method_39404(arg0)
/**
 * comp_248
 */
fun <T>Tick<T>.type() = this.comp_248()
/**
 * comp_250
 */
fun <T>Tick<T>.delay() = this.comp_250()
/**
 * comp_249
 */
fun <T>Tick<T>.pos() = this.comp_249()
/**
 * comp_251
 */
fun <T>Tick<T>.priority() = this.comp_251()
