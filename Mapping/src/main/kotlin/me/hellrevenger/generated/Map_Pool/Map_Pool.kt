package me.hellrevenger.generated.Map_Pool
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_34991
 */
fun <E>KClass<Pool<E>>.createCodec(arg0: Codec<E>) where E: Weighted = Pool.method_34991<E>(arg0)
/**
 * method_34992
 */
fun <E>Pool<E>.getOrEmpty(arg0: Random) where E: Weighted = this.method_34992(arg0)
/**
 * method_34988
 */
fun <E>KClass<Pool<E>>.of(arg0: MutableList<E>) where E: Weighted = Pool.method_34988<E>(arg0)
/**
 * method_34993
 */
fun <E>Pool<E>.isEmpty() where E: Weighted = this.method_34993()
/**
 * method_34994
 */
fun <E>Pool<E>.getEntries() where E: Weighted = this.method_34994()
/**
 * method_34990
 */
fun <E>KClass<Pool<E>>.empty() where E: Weighted = Pool.method_34990<E>()
/**
 * method_34989
 */
fun <E>KClass<Pool<E>>.of(arg0: Array<E>) where E: Weighted = Pool.method_34989<E>(*arg0)
