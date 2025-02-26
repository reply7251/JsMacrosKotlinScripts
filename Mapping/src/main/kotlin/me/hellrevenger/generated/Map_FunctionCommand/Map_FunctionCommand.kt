package me.hellrevenger.generated.Map_FunctionCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_13662
 */
val KClass<FunctionCommand>.SUGGESTION_PROVIDER by aliasStatic(FunctionCommand::field_13662)
/**
 * field_46645
 */
val KClass<FunctionCommand>.INSTANTIATION_FAILURE_EXCEPTION by aliasStatic(FunctionCommand::field_46645)
/**
 * method_54272
 */
fun KClass<FunctionCommand>.createFunctionCommandSource(arg0: ServerCommandSource) = FunctionCommand.method_54272(arg0)
/**
 * method_54275
 */
fun <T>KClass<FunctionCommand>.enqueueAction(arg0: Collection<CommandFunction<T>>, arg1: NbtCompound, arg2: T, arg3: T, arg4: ExecutionControl<T>, arg5: net.minecraft.class_3062.class_8832<T>, arg6: ExecutionFlags) where T: AbstractServerCommandSource<T> = FunctionCommand.method_54275<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_13380
 */
fun KClass<FunctionCommand>.register(arg0: CommandDispatcher<ServerCommandSource>) = FunctionCommand.method_13380(arg0)
