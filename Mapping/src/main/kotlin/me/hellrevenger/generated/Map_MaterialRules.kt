package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MaterialRules

val KClass<MaterialRules>.STONE_DEPTH_FLOOR by aliasStatic(MaterialRules::field_35222)
val KClass<MaterialRules>.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6 by aliasStatic(MaterialRules::field_36341)
val KClass<MaterialRules>.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_30 by aliasStatic(MaterialRules::field_36342)
val KClass<MaterialRules>.STONE_DEPTH_CEILING by aliasStatic(MaterialRules::field_35494)
val KClass<MaterialRules>.STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH by aliasStatic(MaterialRules::field_35224)
val KClass<MaterialRules>.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH by aliasStatic(MaterialRules::field_35223)
fun KClass<MaterialRules>.waterWithStoneDepth(arg0: Int, arg1: Int) = MaterialRules.method_39057(arg0, arg1)
fun KClass<MaterialRules>.biome(arg0: Array<RegistryKey<Biome>>) = MaterialRules.method_39055(*arg0)
fun KClass<MaterialRules>.stoneDepth(arg0: Int, arg1: Boolean, arg2: Int, arg3: VerticalSurfaceType) = MaterialRules.method_40023(arg0, arg1, arg2, arg3)
fun KClass<MaterialRules>.sequence(arg0: Array<net.minecraft.class_6686.class_6708>) = MaterialRules.method_39050(*arg0)
fun KClass<MaterialRules>.aboveYWithStoneDepth(arg0: YOffset, arg1: Int) = MaterialRules.method_39058(arg0, arg1)
fun KClass<MaterialRules>.water(arg0: Int, arg1: Int) = MaterialRules.method_39046(arg0, arg1)
fun KClass<MaterialRules>.aboveY(arg0: YOffset, arg1: Int) = MaterialRules.method_39051(arg0, arg1)
fun KClass<MaterialRules>.temperature() = MaterialRules.method_39059()
fun KClass<MaterialRules>.condition(arg0: net.minecraft.class_6686.class_6693, arg1: net.minecraft.class_6686.class_6708) = MaterialRules.method_39049(arg0, arg1)
fun KClass<MaterialRules>.noiseThreshold(arg0: RegistryKey<net.minecraft.class_5216.class_5487>, arg1: Double) = MaterialRules.method_39052(arg0, arg1)
fun KClass<MaterialRules>.noiseThreshold(arg0: RegistryKey<net.minecraft.class_5216.class_5487>, arg1: Double, arg2: Double) = MaterialRules.method_39053(arg0, arg1, arg2)
fun KClass<MaterialRules>.not(arg0: net.minecraft.class_6686.class_6693) = MaterialRules.method_39048(arg0)
fun KClass<MaterialRules>.hole() = MaterialRules.method_39056()
fun KClass<MaterialRules>.verticalGradient(arg0: String, arg1: YOffset, arg2: YOffset) = MaterialRules.method_39472(arg0, arg1, arg2)
fun KClass<MaterialRules>.block(arg0: BlockState) = MaterialRules.method_39047(arg0)
fun KClass<MaterialRules>.steepSlope() = MaterialRules.method_39045()
fun KClass<MaterialRules>.surface() = MaterialRules.method_39473()
fun KClass<MaterialRules>.stoneDepth(arg0: Int, arg1: Boolean, arg2: VerticalSurfaceType) = MaterialRules.method_39549(arg0, arg1, arg2)
fun KClass<MaterialRules>.terracottaBands() = MaterialRules.method_39060()
