package me.hellrevenger.generated.Map_EntityTrackingSection
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31764
 */
fun <T>EntityTrackingSection<T>.add(entity: T) where T: EntityLike = this.method_31764(entity)
/**
 * method_31767
 */
fun <T>EntityTrackingSection<T>.remove(entity: T) where T: EntityLike = this.method_31767(entity)
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
fun <T>EntityTrackingSection<T>.forEach(box: Box, consumer: LazyIterationConsumer<T>) where T: EntityLike = this.method_31765(box, consumer)
/**
 * method_31768
 */
fun <T>EntityTrackingSection<T>.getStatus() where T: EntityLike = this.method_31768()
/**
 * method_31763
 */
fun <T>EntityTrackingSection<T>.swapStatus(status: EntityTrackingStatus) where T: EntityLike = this.method_31763(status)
/**
 * method_31761
 */
fun <T>EntityTrackingSection<T>.isEmpty() where T: EntityLike = this.method_31761()
