package me.hellrevenger.generated.Map_CommandManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_9238
 */
fun KClass<CommandManager>.getCommandValidator(arg0: net.minecraft.class_2170.class_2171) = CommandManager.method_9238(arg0)
/**
 * method_9247
 */
fun KClass<CommandManager>.literal(arg0: String) = CommandManager.method_9247(arg0)
/**
 * method_9235
 */
fun CommandManager.getDispatcher() = this.method_9235()
/**
 * method_45018
 */
fun <S>KClass<CommandManager>.withCommandSource(arg0: brigadier_ParseResults<S>, arg1: UnaryOperator<S>) = CommandManager.method_45018<S>(arg0, arg1)
/**
 * method_30852
 */
fun KClass<CommandManager>.checkMissing() = CommandManager.method_30852()
/**
 * method_44252
 */
fun CommandManager.executeWithPrefix(arg0: ServerCommandSource, arg1: String) = this.method_44252(arg0, arg1)
/**
 * method_54312
 */
fun <S>KClass<CommandManager>.throwException(arg0: brigadier_ParseResults<S>) = CommandManager.method_54312<S>(arg0)
/**
 * method_9244
 */
fun <T>KClass<CommandManager>.argument(arg0: String, arg1: ArgumentType<T>) = CommandManager.method_9244<T>(arg0, arg1)
/**
 * method_9249
 */
fun CommandManager.execute(arg0: brigadier_ParseResults<ServerCommandSource>, arg1: String) = this.method_9249(arg0, arg1)
/**
 * method_54313
 */
fun KClass<CommandManager>.callWithContext(arg0: ServerCommandSource, arg1: Consumer<CommandExecutionContext<ServerCommandSource>>) = CommandManager.method_54313(arg0, arg1)
/**
 * method_9241
 */
fun CommandManager.sendCommandTree(arg0: ServerPlayerEntity) = this.method_9241(arg0)
/**
 * method_46732
 */
fun KClass<CommandManager>.createRegistryAccess(arg0: net.minecraft.class_7225.class_7874) = CommandManager.method_46732(arg0)
/**
 * method_23917
 */
fun <S>KClass<CommandManager>.getException(arg0: brigadier_ParseResults<S>) = CommandManager.method_23917<S>(arg0)
