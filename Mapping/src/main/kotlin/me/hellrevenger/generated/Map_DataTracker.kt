package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DataTracker

fun DataTracker.getChangedEntries() = this.method_46357()
fun DataTracker.isDirty() = this.method_12786()
fun DataTracker.writeUpdatedEntries(arg0: List<net.minecraft.class_2945.class_7834<*>>) = this.method_12779(arg0)
fun <T>DataTracker.get(arg0: TrackedData<T>) = this.method_12789<T>(arg0)
fun DataTracker.getDirtyEntries() = this.method_12781()
fun <T>DataTracker.set(arg0: TrackedData<T>, arg1: T) = this.method_12778<T>(arg0, arg1)
fun <T>KClass<DataTracker>.registerData(arg0: Class<out DataTracked>, arg1: TrackedDataHandler<T>) = DataTracker.method_12791<T>(arg0, arg1)
fun <T>DataTracker.set(arg0: TrackedData<T>, arg1: T, arg2: Boolean) = this.method_49743<T>(arg0, arg1, arg2)
