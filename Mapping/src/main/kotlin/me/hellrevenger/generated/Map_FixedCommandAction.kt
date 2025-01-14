package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FixedCommandAction

fun <T>FixedCommandAction<T>.execute(arg0: T, arg1: CommandExecutionContext<T>, arg2: Frame) where T: AbstractServerCommandSource<T> = this.method_54416(arg0, arg1, arg2)
