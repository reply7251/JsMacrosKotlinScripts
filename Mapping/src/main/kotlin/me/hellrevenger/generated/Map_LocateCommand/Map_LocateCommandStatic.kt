package me.hellrevenger.generated.Map_LocateCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LocateCommandKt {
    /**
     * method_24499
     */
    fun sendCoordinates(source: ServerCommandSource, structure: net.minecraft.class_7066.class_7068<*>, currentPos: BlockPos, result: util_Pair<BlockPos, out RegistryEntry<*>>, successMessage: String, includeY: Boolean, timeTaken: Duration) = LocateCommand.method_24499(source, structure, currentPos, result, successMessage, includeY, timeTaken)
    /**
     * method_13443
     */
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>, registryAccess: CommandRegistryAccess) = LocateCommand.method_13443(dispatcher, registryAccess)
    /**
     * method_45148
     */
    fun sendCoordinates(source: ServerCommandSource, predicate: net.minecraft.class_7737.class_7741<*>, currentPos: BlockPos, result: util_Pair<BlockPos, out RegistryEntry<*>>, successMessage: String, includeY: Boolean, timeTaken: Duration) = LocateCommand.method_45148(source, predicate, currentPos, result, successMessage, includeY, timeTaken)
}