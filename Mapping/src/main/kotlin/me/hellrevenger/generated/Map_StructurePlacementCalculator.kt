package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StructurePlacementCalculator

fun StructurePlacementCalculator.getPlacementPositions(arg0: ConcentricRingsStructurePlacement) = this.method_46707(arg0)
fun StructurePlacementCalculator.getPlacements(arg0: RegistryEntry<Structure>) = this.method_46708(arg0)
fun KClass<StructurePlacementCalculator>.create(arg0: NoiseConfig, arg1: Long, arg2: BiomeSource, arg3: Stream<RegistryEntry<StructureSet>>) = StructurePlacementCalculator.method_46703(arg0, arg1, arg2, arg3)
fun StructurePlacementCalculator.tryCalculate() = this.method_46712()
fun KClass<StructurePlacementCalculator>.create(arg0: NoiseConfig, arg1: Long, arg2: BiomeSource, arg3: RegistryWrapper<StructureSet>) = StructurePlacementCalculator.method_46702(arg0, arg1, arg2, arg3)
fun StructurePlacementCalculator.canGenerate(arg0: RegistryEntry<StructureSet>, arg1: Int, arg2: Int, arg3: Int) = this.method_46709(arg0, arg1, arg2, arg3)
