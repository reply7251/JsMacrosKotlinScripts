package me.hellrevenger.generated.Map_CommandManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CommandManagerKt {
    /**
     * method_9238
     */
    fun getCommandValidator(parser: net.minecraft.class_2170.class_2171) = CommandManager.method_9238(parser)
    /**
     * method_9247
     */
    fun literal(literal: String) = CommandManager.method_9247(literal)
    /**
     * method_45018
     */
    fun <S>withCommandSource(parseResults: brigadier_ParseResults<S>, sourceMapper: UnaryOperator<S>) = CommandManager.method_45018<S>(parseResults, sourceMapper)
    /**
     * method_30852
     */
    fun checkMissing() = CommandManager.method_30852()
    /**
     * method_54312
     */
    fun <S>throwException(parse: brigadier_ParseResults<S>) = CommandManager.method_54312<S>(parse)
    /**
     * method_9244
     */
    fun <T>argument(name: String, type: ArgumentType<T>) = CommandManager.method_9244<T>(name, type)
    /**
     * method_54313
     */
    fun callWithContext(commandSource: ServerCommandSource, callback: Consumer<CommandExecutionContext<ServerCommandSource>>) = CommandManager.method_54313(commandSource, callback)
    /**
     * method_46732
     */
    fun createRegistryAccess(registries: net.minecraft.class_7225.class_7874) = CommandManager.method_46732(registries)
    /**
     * method_23917
     */
    fun <S>getException(parse: brigadier_ParseResults<S>) = CommandManager.method_23917<S>(parse)
}