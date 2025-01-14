package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityIndex

fun <T>EntityIndex<T>.add(arg0: T) where T: EntityLike = this.method_31753(arg0)
fun <T>EntityIndex<T>.get(arg0: UUID) where T: EntityLike = this.method_31755(arg0)
fun <T>EntityIndex<T>.size() where T: EntityLike = this.method_31756()
fun <T, U>EntityIndex<T>.forEach(arg0: TypeFilter<T, U>, arg1: LazyIterationConsumer<U>) where T: EntityLike, U: T = this.method_31754<U>(arg0, arg1)
fun <T>EntityIndex<T>.remove(arg0: T) where T: EntityLike = this.method_31757(arg0)
fun <T>EntityIndex<T>.iterate() where T: EntityLike = this.method_31751()
fun <T>EntityIndex<T>.get(arg0: Int) where T: EntityLike = this.method_31752(arg0)
