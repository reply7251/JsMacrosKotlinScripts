package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ParsingRule

fun <S, T>KClass<ParsingRule<S, T>>.of(arg0: Term<S>, arg1: net.minecraft.class_9396.class_9397<S, T>) = ParsingRule.method_58320<S, T>(arg0, arg1)
fun <S, T>KClass<ParsingRule<S, T>>.of(arg0: Term<S>, arg1: net.minecraft.class_9396.class_9398<T>) = ParsingRule.method_58321<S, T>(arg0, arg1)
fun <S, T>ParsingRule<S, T>.parse(arg0: ParsingState<S>) = this.method_58318(arg0)
