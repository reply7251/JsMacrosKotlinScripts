package me.hellrevenger.generated.Map_ConstantArgumentSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41999
 */
fun <A, T>KClass<ConstantArgumentSerializer<A>>.of(arg0: Supplier<T>) where A: ArgumentType<*>, T: ArgumentType<*> = ConstantArgumentSerializer.method_41999<T>(arg0)
/**
 * method_42001
 */
fun <A>ConstantArgumentSerializer<A>.fromPacket(arg0: PacketByteBuf) where A: ArgumentType<*> = this.method_42001(arg0)
/**
 * method_41998
 */
fun <A, T>KClass<ConstantArgumentSerializer<A>>.of(arg0: function_Function<CommandRegistryAccess, T>) where A: ArgumentType<*>, T: ArgumentType<*> = ConstantArgumentSerializer.method_41998<T>(arg0)
/**
 * method_42002
 */
fun <A>ConstantArgumentSerializer<A>.getArgumentTypeProperties(arg0: A) where A: ArgumentType<*> = this.method_42002(arg0)
