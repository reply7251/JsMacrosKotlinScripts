package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Tick

val <T>Tick<T>.HASH_STRATEGY by aliasStatic({Tick.field_35542})
fun <T>KClass<Tick<T>>.orderedTickToNbt(arg0: OrderedTick<T>, arg1: Function<T, String>, arg2: Long) = Tick.method_39401<T>(arg0, arg1, arg2)
fun <T>KClass<Tick<T>>.tick(arg0: NbtList, arg1: Function<String, Optional<T>>, arg2: ChunkPos, arg3: Consumer<Tick<T>>) = Tick.method_39406<T>(arg0, arg1, arg2, arg3)
fun <T>KClass<Tick<T>>.create(arg0: T, arg1: BlockPos) = Tick.method_39402<T>(arg0, arg1)
fun <T>Tick<T>.createOrderedTick(arg0: Long, arg1: Long) = this.method_39400(arg0, arg1)
fun <T>KClass<Tick<T>>.fromNbt(arg0: NbtCompound, arg1: Function<String, Optional<T>>) = Tick.method_40559<T>(arg0, arg1)
fun <T>Tick<T>.toNbt(arg0: Function<T, String>) = this.method_39404(arg0)
fun <T>Tick<T>.type() = this.comp_248()
fun <T>Tick<T>.delay() = this.comp_250()
fun <T>Tick<T>.pos() = this.comp_249()
fun <T>Tick<T>.priority() = this.comp_251()
