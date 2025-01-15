package me.hellrevenger.generated.Map_ArgumentHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<ArgumentHelper>.hasMinFlag(arg0: Byte) = ArgumentHelper.method_41986(arg0)
fun KClass<ArgumentHelper>.hasMaxFlag(arg0: Byte) = ArgumentHelper.method_41995(arg0)
fun <S>KClass<ArgumentHelper>.toJson(arg0: CommandDispatcher<S>, arg1: CommandNode<S>) = ArgumentHelper.method_41990<S>(arg0, arg1)
fun KClass<ArgumentHelper>.getMinMaxFlag(arg0: Boolean, arg1: Boolean) = ArgumentHelper.method_41994(arg0, arg1)
fun <T>KClass<ArgumentHelper>.collectUsedArgumentTypes(arg0: CommandNode<T>) = ArgumentHelper.method_41991<T>(arg0)
