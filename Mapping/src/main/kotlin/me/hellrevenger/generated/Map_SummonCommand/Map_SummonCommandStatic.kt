package me.hellrevenger.generated.Map_SummonCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SummonCommandKt {
    /**
     * method_48758
     */
    fun summon(source: ServerCommandSource, entityType: net.minecraft.class_6880.class_6883<EntityType<*>>, pos: Vec3d, nbt: NbtCompound, initialize: Boolean) = SummonCommand.method_48758(source, entityType, pos, nbt, initialize)
    /**
     * method_13690
     */
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>, registryAccess: CommandRegistryAccess) = SummonCommand.method_13690(dispatcher, registryAccess)
}