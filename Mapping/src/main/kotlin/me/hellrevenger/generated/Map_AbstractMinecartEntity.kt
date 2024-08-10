package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractMinecartEntity

fun AbstractMinecartEntity.setCustomBlockOffset(arg0: Int) = this.method_7515(arg0)
fun AbstractMinecartEntity.getMinecartType() = this.method_7518()
fun AbstractMinecartEntity.setCustomBlock(arg0: BlockState) = this.method_7527(arg0)
fun AbstractMinecartEntity.onActivatorRail(arg0: Int, arg1: Int, arg2: Int, arg3: Boolean) = this.method_7506(arg0, arg1, arg2, arg3)
fun AbstractMinecartEntity.setCustomBlockPresent(arg0: Boolean) = this.method_7511(arg0)
fun KClass<AbstractMinecartEntity>.create(arg0: ServerWorld, arg1: Double, arg2: Double, arg3: Double, arg4: net.minecraft.class_1688.class_1689, arg5: ItemStack, arg6: PlayerEntity) = AbstractMinecartEntity.method_7523(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun AbstractMinecartEntity.snapPositionToRailWithOffset(arg0: Double, arg1: Double, arg2: Double, arg3: Double) = this.method_7505(arg0, arg1, arg2, arg3)
fun AbstractMinecartEntity.getDefaultContainedBlock() = this.method_7517()
fun AbstractMinecartEntity.getContainedBlock() = this.method_7519()
fun AbstractMinecartEntity.getDefaultBlockOffset() = this.method_7526()
fun AbstractMinecartEntity.getBlockOffset() = this.method_7514()
fun AbstractMinecartEntity.snapPositionToRail(arg0: Double, arg1: Double, arg2: Double) = this.method_7508(arg0, arg1, arg2)
fun AbstractMinecartEntity.hasCustomBlock() = this.method_7510()
