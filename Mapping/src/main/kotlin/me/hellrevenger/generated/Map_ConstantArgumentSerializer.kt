package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ConstantArgumentSerializer

fun <A, T>KClass<ConstantArgumentSerializer<A>>.of(arg0: Supplier<T>) where A: ArgumentType<*>, T: ArgumentType<*> = ConstantArgumentSerializer.method_41999<T>(arg0)
fun <A>ConstantArgumentSerializer<A>.fromPacket(arg0: PacketByteBuf) where A: ArgumentType<*> = this.method_42001(arg0)
fun <A, T>KClass<ConstantArgumentSerializer<A>>.of(arg0: Function<CommandRegistryAccess, T>) where A: ArgumentType<*>, T: ArgumentType<*> = ConstantArgumentSerializer.method_41998<T>(arg0)
fun <A>ConstantArgumentSerializer<A>.getArgumentTypeProperties(arg0: A) where A: ArgumentType<*> = this.method_42002(arg0)
