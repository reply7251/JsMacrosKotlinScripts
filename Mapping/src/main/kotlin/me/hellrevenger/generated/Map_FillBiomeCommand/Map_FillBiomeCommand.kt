package me.hellrevenger.generated.Map_FillBiomeCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_41279
 */
val KClass<FillBiomeCommand>.UNLOADED_EXCEPTION by aliasStatic(FillBiomeCommand::field_41279)
/**
 * method_55340
 */
fun KClass<FillBiomeCommand>.fillBiome(arg0: ServerWorld, arg1: BlockPos, arg2: BlockPos, arg3: RegistryEntry<Biome>, arg4: Predicate<RegistryEntry<Biome>>, arg5: Consumer<Supplier<Text>>) = FillBiomeCommand.method_55340(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_47529
 */
fun KClass<FillBiomeCommand>.register(arg0: CommandDispatcher<ServerCommandSource>, arg1: CommandRegistryAccess) = FillBiomeCommand.method_47529(arg0, arg1)
/**
 * method_55339
 */
fun KClass<FillBiomeCommand>.fillBiome(arg0: ServerWorld, arg1: BlockPos, arg2: BlockPos, arg3: RegistryEntry<Biome>) = FillBiomeCommand.method_55339(arg0, arg1, arg2, arg3)
