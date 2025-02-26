package me.hellrevenger.generated.Map_EntityTrackingSection
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31764
 */
fun <T>EntityTrackingSection<T>.add(arg0: T) where T: EntityLike = this.method_31764(arg0)
/**
 * method_31767
 */
fun <T>EntityTrackingSection<T>.remove(arg0: T) where T: EntityLike = this.method_31767(arg0)
/**
 * method_31766
 */
fun <T>EntityTrackingSection<T>.stream() where T: EntityLike = this.method_31766()
/**
 * method_31769
 */
fun <T>EntityTrackingSection<T>.size() where T: EntityLike = this.method_31769()
/**
 * method_31765
 */
fun <T>EntityTrackingSection<T>.forEach(arg0: Box, arg1: LazyIterationConsumer<T>) where T: EntityLike = this.method_31765(arg0, arg1)
/**
 * method_31768
 */
fun <T>EntityTrackingSection<T>.getStatus() where T: EntityLike = this.method_31768()
/**
 * method_31763
 */
fun <T>EntityTrackingSection<T>.swapStatus(arg0: EntityTrackingStatus) where T: EntityLike = this.method_31763(arg0)
/**
 * method_31761
 */
fun <T>EntityTrackingSection<T>.isEmpty() where T: EntityLike = this.method_31761()
/**
 * method_31762
 */
fun <T, U>EntityTrackingSection<T>.forEach(arg0: TypeFilter<T, U>, arg1: Box, arg2: LazyIterationConsumer<in U>) where T: EntityLike, U: T = this.method_31762<U>(arg0, arg1, arg2)
