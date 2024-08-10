package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CommandManager

fun KClass<CommandManager>.getCommandValidator(arg0: net.minecraft.class_2170.class_2171) = CommandManager.method_9238(arg0)
fun KClass<CommandManager>.literal(arg0: String) = CommandManager.method_9247(arg0)
fun <S>KClass<CommandManager>.withCommandSource(arg0: brigadier_ParseResults<S>, arg1: UnaryOperator<S>) = CommandManager.method_45018<S>(arg0, arg1)
fun KClass<CommandManager>.checkMissing() = CommandManager.method_30852()
fun CommandManager.executeWithPrefix(arg0: ServerCommandSource, arg1: String) = this.method_44252(arg0, arg1)
fun <S>KClass<CommandManager>.throwException(arg0: brigadier_ParseResults<S>) = CommandManager.method_54312<S>(arg0)
fun <T>KClass<CommandManager>.argument(arg0: String, arg1: ArgumentType<T>) = CommandManager.method_9244<T>(arg0, arg1)
fun CommandManager.execute(arg0: brigadier_ParseResults<ServerCommandSource>, arg1: String) = this.method_9249(arg0, arg1)
fun KClass<CommandManager>.callWithContext(arg0: ServerCommandSource, arg1: Consumer<CommandExecutionContext<ServerCommandSource>>) = CommandManager.method_54313(arg0, arg1)
fun CommandManager.sendCommandTree(arg0: ServerPlayerEntity) = this.method_9241(arg0)
fun KClass<CommandManager>.createRegistryAccess(arg0: net.minecraft.class_7225.class_7874) = CommandManager.method_46732(arg0)
fun <S>KClass<CommandManager>.getException(arg0: brigadier_ParseResults<S>) = CommandManager.method_23917<S>(arg0)
