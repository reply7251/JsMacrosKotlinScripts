package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StringVisitable

fun <T>StringVisitable.visit(arg0: net.minecraft.class_5348.class_5245<T>) = this.method_27657<T>(arg0)
fun <T>StringVisitable.visit(arg0: net.minecraft.class_5348.class_5246<T>, arg1: Style) = this.method_27658<T>(arg0, arg1)
fun KClass<StringVisitable>.styled(arg0: String, arg1: Style) = StringVisitable.method_29431(arg0, arg1)
fun KClass<StringVisitable>.concat(arg0: Array<StringVisitable>) = StringVisitable.method_29433(*arg0)
fun KClass<StringVisitable>.concat(arg0: MutableList<out StringVisitable>) = StringVisitable.method_29432(arg0)
fun KClass<StringVisitable>.plain(arg0: String) = StringVisitable.method_29430(arg0)
