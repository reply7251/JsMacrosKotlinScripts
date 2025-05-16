package me.hellrevenger.generated.Map_DataTracker
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_46357
 */
fun DataTracker.getChangedEntries() = this.method_46357()
/**
 * method_12786
 */
fun DataTracker.isDirty() = this.method_12786()
/**
 * method_12779
 */
fun DataTracker.writeUpdatedEntries(entries: MutableList<net.minecraft.class_2945.class_7834<*>>?) = this.method_12779(entries)
/**
 * method_12789
 */
fun <T>DataTracker.get(data: TrackedData<T>?) = this.method_12789<T>(data)
/**
 * method_12781
 */
fun DataTracker.getDirtyEntries() = this.method_12781()
/**
 * method_12778
 */
fun <T>DataTracker.set(key: TrackedData<T>?, value: T) = this.method_12778<T>(key, value)
/**
 * method_49743
 */
fun <T>DataTracker.set(key: TrackedData<T>?, value: T, force: Boolean) = this.method_49743<T>(key, value, force)
