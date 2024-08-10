package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ExecuteCommand

val ExecuteCommand.INSTANTIATION_FAILURE_EXCEPTION by aliasStatic(ExecuteCommand::field_46642)
fun KClass<ExecuteCommand>.register(arg0: CommandDispatcher<ServerCommandSource>, arg1: CommandRegistryAccess) = ExecuteCommand.method_13271(arg0, arg1)
fun <T>KClass<ExecuteCommand>.enqueueExecutions(arg0: T, arg1: List<T>, arg2: Function<T, T>, arg3: IntPredicate, arg4: ContextChain<T>, arg5: NbtCompound, arg6: ExecutionControl<T>, arg7: net.minecraft.class_3050.class_8830<T, Collection<CommandFunction<T>>>, arg8: ExecutionFlags) where T: AbstractServerCommandSource<T> = ExecuteCommand.method_54264<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
