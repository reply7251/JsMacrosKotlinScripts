package me.hellrevenger.generated.Map_ExecuteCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ExecuteCommandKt {
    /**
     * field_46642
     */
    val INSTANTIATION_FAILURE_EXCEPTION by aliasStatic(ExecuteCommand::field_46642)
    /**
     * method_13271
     */
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>, commandRegistryAccess: CommandRegistryAccess) = ExecuteCommand.method_13271(dispatcher, commandRegistryAccess)
    /**
     * method_54264
     */
    fun <T>enqueueExecutions(baseSource: T, sources: MutableList<T>, functionSourceGetter: function_Function<T, T>, predicate: IntPredicate, contextChain: ContextChain<T>, args: NbtCompound, control: ExecutionControl<T>, functionNamesGetter: net.minecraft.class_3050.class_8830<T, Collection<CommandFunction<T>>>, flags: ExecutionFlags) where T: AbstractServerCommandSource<T> = ExecuteCommand.method_54264<T>(baseSource, sources, functionSourceGetter, predicate, contextChain, args, control, functionNamesGetter, flags)
}