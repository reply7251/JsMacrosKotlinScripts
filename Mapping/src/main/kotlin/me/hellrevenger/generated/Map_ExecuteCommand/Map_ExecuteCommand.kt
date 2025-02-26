package me.hellrevenger.generated.Map_ExecuteCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_46642
 */
val KClass<ExecuteCommand>.INSTANTIATION_FAILURE_EXCEPTION by aliasStatic(ExecuteCommand::field_46642)
/**
 * method_13271
 */
fun KClass<ExecuteCommand>.register(arg0: CommandDispatcher<ServerCommandSource>, arg1: CommandRegistryAccess) = ExecuteCommand.method_13271(arg0, arg1)
/**
 * method_54264
 */
fun <T>KClass<ExecuteCommand>.enqueueExecutions(arg0: T, arg1: MutableList<T>, arg2: function_Function<T, T>, arg3: IntPredicate, arg4: ContextChain<T>, arg5: NbtCompound, arg6: ExecutionControl<T>, arg7: net.minecraft.class_3050.class_8830<T, Collection<CommandFunction<T>>>, arg8: ExecutionFlags) where T: AbstractServerCommandSource<T> = ExecuteCommand.method_54264<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
