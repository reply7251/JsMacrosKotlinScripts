package me.hellrevenger.generated.Map_ArgumentHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ArgumentHelperKt {
    /**
     * method_41986
     */
    fun hasMinFlag(flags: Byte) = ArgumentHelper.method_41986(flags)
    /**
     * method_41995
     */
    fun hasMaxFlag(flags: Byte) = ArgumentHelper.method_41995(flags)
    /**
     * method_41990
     */
    fun <S>toJson(dispatcher: CommandDispatcher<S>, rootNode: CommandNode<S>) = ArgumentHelper.method_41990<S>(dispatcher, rootNode)
    /**
     * method_41994
     */
    fun getMinMaxFlag(hasMin: Boolean, hasMax: Boolean) = ArgumentHelper.method_41994(hasMin, hasMax)
    /**
     * method_41991
     */
    fun <T>collectUsedArgumentTypes(rootNode: CommandNode<T>) = ArgumentHelper.method_41991<T>(rootNode)
}