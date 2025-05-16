package me.hellrevenger.generated.Map_ArgumentTypes
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ArgumentTypesKt {
    /**
     * method_41983
     */
    fun <A>get(argumentType: A) where A: ArgumentType<*> = ArgumentTypes.method_41983<A>(argumentType)
    /**
     * method_41984
     */
    fun has(clazz: Class<*>?) = ArgumentTypes.method_41984(clazz)
    /**
     * method_10015
     */
    fun register(registry: Registry<ArgumentSerializer<*, *>>?) = ArgumentTypes.method_10015(registry)
    /**
     * method_41985
     */
    fun <A>getArgumentTypeProperties(argumentType: A) where A: ArgumentType<*> = ArgumentTypes.method_41985<A>(argumentType)
}