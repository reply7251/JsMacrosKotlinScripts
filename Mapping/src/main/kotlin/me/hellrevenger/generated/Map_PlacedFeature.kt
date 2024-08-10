package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlacedFeature

val PlacedFeature.LIST_CODEC by aliasStatic(PlacedFeature::field_35731)
val PlacedFeature.REGISTRY_CODEC by aliasStatic(PlacedFeature::field_35730)
val PlacedFeature.LISTS_CODEC by aliasStatic(PlacedFeature::field_36416)
fun PlacedFeature.generateUnregistered(arg0: StructureWorldAccess, arg1: ChunkGenerator, arg2: Random, arg3: BlockPos) = this.method_39644(arg0, arg1, arg2, arg3)
fun PlacedFeature.generate(arg0: StructureWorldAccess, arg1: ChunkGenerator, arg2: Random, arg3: BlockPos) = this.method_39650(arg0, arg1, arg2, arg3)
fun PlacedFeature.feature() = this.comp_334()
fun PlacedFeature.placementModifiers() = this.comp_335()
fun PlacedFeature.getDecoratedFeatures() = this.method_39643()
