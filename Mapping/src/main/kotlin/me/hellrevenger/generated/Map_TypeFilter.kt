package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TypeFilter

fun <T, B>TypeFilter<B, T>.getBaseClass() where T: B = this.method_31794()
fun <T, B>KClass<TypeFilter<B, T>>.instanceOf(arg0: Class<T>) where T: B = TypeFilter.method_31795<B, T>(arg0)
fun <T, B>TypeFilter<B, T>.downcast(arg0: B) where T: B = this.method_31796(arg0)
fun <T, B>KClass<TypeFilter<B, T>>.equals(arg0: Class<T>) where T: B = TypeFilter.method_55374<B, T>(arg0)
