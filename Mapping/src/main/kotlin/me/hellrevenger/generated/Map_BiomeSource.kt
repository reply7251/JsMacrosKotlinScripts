package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BiomeSource

fun BiomeSource.locateBiome(arg0: BlockPos, arg1: Int, arg2: Int, arg3: Int, arg4: Predicate<RegistryEntry<Biome>>, arg5: net.minecraft.class_6544.class_6552, arg6: WorldView) = this.method_42310(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun BiomeSource.locateBiome(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Predicate<RegistryEntry<Biome>>, arg5: Random, arg6: net.minecraft.class_6544.class_6552) = this.method_8762(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun BiomeSource.addDebugInfo(arg0: List<String>, arg1: BlockPos, arg2: net.minecraft.class_6544.class_6552) = this.method_38114(arg0, arg1, arg2)
fun BiomeSource.locateBiome(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: Int, arg5: Predicate<RegistryEntry<Biome>>, arg6: Random, arg7: Boolean, arg8: net.minecraft.class_6544.class_6552) = this.method_24385(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
fun BiomeSource.getBiomesInArea(arg0: Int, arg1: Int, arg2: Int, arg3: Int, arg4: net.minecraft.class_6544.class_6552) = this.method_8763(arg0, arg1, arg2, arg3, arg4)
