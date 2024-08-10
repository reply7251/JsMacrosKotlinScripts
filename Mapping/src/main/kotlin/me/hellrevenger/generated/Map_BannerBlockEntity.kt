package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BannerBlockEntity

val BannerBlockEntity.MAX_PATTERN_COUNT by aliasStatic(BannerBlockEntity::field_31296)
fun BannerBlockEntity.toUpdatePacket() = this.method_16886()
fun BannerBlockEntity.readFrom(arg0: ItemStack, arg1: DyeColor) = this.method_10913(arg0, arg1)
fun BannerBlockEntity.getPickStack() = this.method_10907()
fun BannerBlockEntity.getColorForState() = this.method_10908()
