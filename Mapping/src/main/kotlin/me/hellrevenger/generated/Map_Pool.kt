package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Pool

fun <E>KClass<Pool<E>>.createCodec(arg0: Codec<E>) where E: Weighted = Pool.method_34991<E>(arg0)
fun <E>Pool<E>.getOrEmpty(arg0: Random) where E: Weighted = this.method_34992(arg0)
fun <E>KClass<Pool<E>>.of(arg0: MutableList<E>) where E: Weighted = Pool.method_34988<E>(arg0)
fun <E>Pool<E>.isEmpty() where E: Weighted = this.method_34993()
fun <E>Pool<E>.getEntries() where E: Weighted = this.method_34994()
fun <E>KClass<Pool<E>>.empty() where E: Weighted = Pool.method_34990<E>()
fun <E>KClass<Pool<E>>.of(arg0: Array<E>) where E: Weighted = Pool.method_34989<E>(*arg0)
