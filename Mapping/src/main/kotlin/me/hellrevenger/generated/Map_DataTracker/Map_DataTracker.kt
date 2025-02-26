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
fun DataTracker.writeUpdatedEntries(arg0: MutableList<net.minecraft.class_2945.class_7834<*>>) = this.method_12779(arg0)
/**
 * method_12789
 */
fun <T>DataTracker.get(arg0: TrackedData<T>) = this.method_12789<T>(arg0)
/**
 * method_12781
 */
fun DataTracker.getDirtyEntries() = this.method_12781()
/**
 * method_12778
 */
fun <T>DataTracker.set(arg0: TrackedData<T>, arg1: T) = this.method_12778<T>(arg0, arg1)
/**
 * method_12791
 */
fun <T>KClass<DataTracker>.registerData(arg0: Class<out DataTracked>, arg1: TrackedDataHandler<T>) = DataTracker.method_12791<T>(arg0, arg1)
/**
 * method_49743
 */
fun <T>DataTracker.set(arg0: TrackedData<T>, arg1: T, arg2: Boolean) = this.method_49743<T>(arg0, arg1, arg2)
