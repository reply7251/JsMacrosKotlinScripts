package me.hellrevenger.generated.Map_Structure
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41609
 */
fun Structure.expandBoxIfShouldAdaptNoise(arg0: BlockBox) = this.method_41609(arg0)
/**
 * method_41615
 */
fun Structure.getStructureSpawns() = this.method_41615()
/**
 * method_42701
 */
fun Structure.getTerrainAdaptation() = this.method_42701()
/**
 * method_42699
 */
fun <S>KClass<Structure>.createCodec(arg0: function_Function<net.minecraft.class_3195.class_7302, S>) where S: Structure = Structure.method_42699<S>(arg0)
/**
 * method_47932
 */
fun Structure.getValidStructurePosition(arg0: net.minecraft.class_3195.class_7149) = this.method_47932(arg0)
/**
 * method_41616
 */
fun Structure.getFeatureGenerationStep() = this.method_41616()
/**
 * method_59863
 */
fun KClass<Structure>.getAverageCornerHeights(arg0: net.minecraft.class_3195.class_7149, arg1: Int, arg2: Int, arg3: Int, arg4: Int) = Structure.method_59863(arg0, arg1, arg2, arg3, arg4)
/**
 * method_41614
 */
fun Structure.createStructureStart(arg0: RegistryEntry<Structure>, arg1: RegistryKey<world_World>, arg2: DynamicRegistryManager, arg3: ChunkGenerator, arg4: BiomeSource, arg5: NoiseConfig, arg6: StructureTemplateManager, arg7: Long, arg8: ChunkPos, arg9: Int, arg10: HeightLimitView, arg11: Predicate<RegistryEntry<Biome>>) = this.method_41614(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11)
/**
 * method_41618
 */
fun Structure.getType() = this.method_41618()
/**
 * method_41607
 */
fun Structure.getValidBiomes() = this.method_41607()
/**
 * method_42697
 */
fun <S>KClass<Structure>.configCodecBuilder(arg0: Instance<S>) where S: Structure = Structure.method_42697<S>(arg0)
/**
 * method_38694
 */
fun Structure.postPlace(arg0: StructureWorldAccess, arg1: StructureAccessor, arg2: ChunkGenerator, arg3: Random, arg4: BlockBox, arg5: ChunkPos, arg6: StructurePiecesList) = this.method_38694(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
