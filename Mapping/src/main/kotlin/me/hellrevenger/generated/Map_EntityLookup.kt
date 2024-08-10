package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityLookup

fun <T, U>EntityLookup<T>.forEachIntersects(arg0: TypeFilter<T, U>, arg1: Box, arg2: LazyIterationConsumer<U>) where T: EntityLike, U: T = this.method_31805<U>(arg0, arg1, arg2)
fun <T, U>EntityLookup<T>.forEach(arg0: TypeFilter<T, U>, arg1: LazyIterationConsumer<U>) where T: EntityLike, U: T = this.method_31806<U>(arg0, arg1)
fun <T>EntityLookup<T>.get(arg0: UUID) where T: EntityLike = this.method_31808(arg0)
fun <T>EntityLookup<T>.forEachIntersects(arg0: Box, arg1: Consumer<T>) where T: EntityLike = this.method_31807(arg0, arg1)
fun <T>EntityLookup<T>.get(arg0: Int) where T: EntityLike = this.method_31804(arg0)
fun <T>EntityLookup<T>.iterate() where T: EntityLike = this.method_31803()
