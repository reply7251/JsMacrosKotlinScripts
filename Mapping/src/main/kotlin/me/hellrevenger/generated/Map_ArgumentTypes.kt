package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ArgumentTypes

fun <A>KClass<ArgumentTypes>.get(arg0: A) where A: ArgumentType<*> = ArgumentTypes.method_41983<A>(arg0)
fun KClass<ArgumentTypes>.has(arg0: Class<*>) = ArgumentTypes.method_41984(arg0)
fun KClass<ArgumentTypes>.register(arg0: Registry<ArgumentSerializer<*, *>>) = ArgumentTypes.method_10015(arg0)
fun <A>KClass<ArgumentTypes>.getArgumentTypeProperties(arg0: A) where A: ArgumentType<*> = ArgumentTypes.method_41985<A>(arg0)
