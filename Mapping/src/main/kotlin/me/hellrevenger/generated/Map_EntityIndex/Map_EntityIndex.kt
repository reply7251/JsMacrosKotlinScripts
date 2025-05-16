package me.hellrevenger.generated.Map_EntityIndex
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31753
 */
fun <T>EntityIndex<T>.add(entity: T) where T: EntityLike = this.method_31753(entity)
/**
 * method_31755
 */
fun <T>EntityIndex<T>.get(uuid: UUID?) where T: EntityLike = this.method_31755(uuid)
/**
 * method_31756
 */
fun <T>EntityIndex<T>.size() where T: EntityLike = this.method_31756()
/**
 * method_31754
 */
fun <T, U>EntityIndex<T>.forEach(filter: TypeFilter<T, U>?, consumer: LazyIterationConsumer<U>?) where T: EntityLike, U: T = this.method_31754<U>(filter, consumer)
/**
 * method_31757
 */
fun <T>EntityIndex<T>.remove(entity: T) where T: EntityLike = this.method_31757(entity)
/**
 * method_31751
 */
fun <T>EntityIndex<T>.iterate() where T: EntityLike = this.method_31751()
/**
 * method_31752
 */
fun <T>EntityIndex<T>.get(id: Int) where T: EntityLike = this.method_31752(id)
