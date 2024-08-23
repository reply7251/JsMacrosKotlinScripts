package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ConfiguredFeature

fun <FC, F>ConfiguredFeature<FC, F>.config() where FC: FeatureConfig, F: Feature<FC> = this.comp_333()
fun <FC, F>ConfiguredFeature<FC, F>.generate(arg0: StructureWorldAccess, arg1: ChunkGenerator, arg2: Random, arg3: BlockPos) where FC: FeatureConfig, F: Feature<FC> = this.method_12862(arg0, arg1, arg2, arg3)
fun <FC, F>ConfiguredFeature<FC, F>.getDecoratedFeatures() where FC: FeatureConfig, F: Feature<FC> = this.method_30648()
fun <FC, F>ConfiguredFeature<FC, F>.feature() where FC: FeatureConfig, F: Feature<FC> = this.comp_332()
