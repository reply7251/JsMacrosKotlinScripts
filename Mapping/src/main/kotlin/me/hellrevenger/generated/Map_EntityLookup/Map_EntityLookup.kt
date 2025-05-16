package me.hellrevenger.generated.Map_EntityLookup
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31805
 */
fun <T, U>EntityLookup<T>.forEachIntersects(filter: TypeFilter<T, U>?, box: Box?, consumer: LazyIterationConsumer<U>?) where T: EntityLike, U: T = this.method_31805<U>(filter, box, consumer)
/**
 * method_31806
 */
fun <T, U>EntityLookup<T>.forEach(filter: TypeFilter<T, U>?, consumer: LazyIterationConsumer<U>?) where T: EntityLike, U: T = this.method_31806<U>(filter, consumer)
/**
 * method_31808
 */
fun <T>EntityLookup<T>.get(uuid: UUID?) where T: EntityLike = this.method_31808(uuid)
/**
 * method_31807
 */
fun <T>EntityLookup<T>.forEachIntersects(box: Box?, action: Consumer<T>?) where T: EntityLike = this.method_31807(box, action)
/**
 * method_31804
 */
fun <T>EntityLookup<T>.get(id: Int) where T: EntityLike = this.method_31804(id)
/**
 * method_31803
 */
fun <T>EntityLookup<T>.iterate() where T: EntityLike = this.method_31803()
