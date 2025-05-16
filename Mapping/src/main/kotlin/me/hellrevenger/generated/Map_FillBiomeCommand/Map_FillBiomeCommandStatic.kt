package me.hellrevenger.generated.Map_FillBiomeCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FillBiomeCommandKt {
    /**
     * field_41279
     */
    val UNLOADED_EXCEPTION by aliasStatic(FillBiomeCommand::field_41279)
    /**
     * method_55340
     */
    fun fillBiome(world: ServerWorld?, from: BlockPos?, to: BlockPos?, biome: RegistryEntry<Biome>?, filter: Predicate<RegistryEntry<Biome>>?, feedbackConsumer: Consumer<Supplier<Text>>?) = FillBiomeCommand.method_55340(world, from, to, biome, filter, feedbackConsumer)
    /**
     * method_47529
     */
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>?, commandRegistryAccess: CommandRegistryAccess?) = FillBiomeCommand.method_47529(dispatcher, commandRegistryAccess)
    /**
     * method_55339
     */
    fun fillBiome(world: ServerWorld?, from: BlockPos?, to: BlockPos?, biome: RegistryEntry<Biome>?) = FillBiomeCommand.method_55339(world, from, to, biome)
}