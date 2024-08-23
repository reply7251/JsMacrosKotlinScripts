package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Structure

fun Structure.expandBoxIfShouldAdaptNoise(arg0: BlockBox) = this.method_41609(arg0)
fun Structure.getStructureSpawns() = this.method_41615()
fun Structure.getTerrainAdaptation() = this.method_42701()
fun Structure.createStructureStart(arg0: DynamicRegistryManager, arg1: ChunkGenerator, arg2: BiomeSource, arg3: NoiseConfig, arg4: StructureTemplateManager, arg5: Long, arg6: ChunkPos, arg7: Int, arg8: HeightLimitView, arg9: Predicate<RegistryEntry<Biome>>) = this.method_41614(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun <S>KClass<Structure>.createCodec(arg0: Function<net.minecraft.class_3195.class_7302, S>) where S: Structure = Structure.method_42699<S>(arg0)
fun Structure.getValidStructurePosition(arg0: net.minecraft.class_3195.class_7149) = this.method_47932(arg0)
fun Structure.getFeatureGenerationStep() = this.method_41616()
fun KClass<Structure>.getAverageCornerHeights(arg0: net.minecraft.class_3195.class_7149, arg1: Int, arg2: Int, arg3: Int, arg4: Int) = Structure.method_59863(arg0, arg1, arg2, arg3, arg4)
fun Structure.getType() = this.method_41618()
fun Structure.getValidBiomes() = this.method_41607()
fun <S>KClass<Structure>.configCodecBuilder(arg0: Instance<S>) where S: Structure = Structure.method_42697<S>(arg0)
fun Structure.postPlace(arg0: StructureWorldAccess, arg1: StructureAccessor, arg2: ChunkGenerator, arg3: Random, arg4: BlockBox, arg5: ChunkPos, arg6: StructurePiecesList) = this.method_38694(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
