package me.hellrevenger.generated.Map_EntityIndex
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31753
 */
fun <T>EntityIndex<T>.add(arg0: T) where T: EntityLike = this.method_31753(arg0)
/**
 * method_31755
 */
fun <T>EntityIndex<T>.get(arg0: UUID) where T: EntityLike = this.method_31755(arg0)
/**
 * method_31756
 */
fun <T>EntityIndex<T>.size() where T: EntityLike = this.method_31756()
/**
 * method_31754
 */
fun <T, U>EntityIndex<T>.forEach(arg0: TypeFilter<T, U>, arg1: LazyIterationConsumer<U>) where T: EntityLike, U: T = this.method_31754<U>(arg0, arg1)
/**
 * method_31757
 */
fun <T>EntityIndex<T>.remove(arg0: T) where T: EntityLike = this.method_31757(arg0)
/**
 * method_31751
 */
fun <T>EntityIndex<T>.iterate() where T: EntityLike = this.method_31751()
/**
 * method_31752
 */
fun <T>EntityIndex<T>.get(arg0: Int) where T: EntityLike = this.method_31752(arg0)
