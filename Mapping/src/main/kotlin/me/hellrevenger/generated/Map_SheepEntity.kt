package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SheepEntity

fun SheepEntity.getColor() = this.method_6633()
fun SheepEntity.getHeadAngle(arg0: Float) = this.method_6641(arg0)
fun KClass<SheepEntity>.createSheepAttributes() = SheepEntity.method_26893()
fun SheepEntity.setColor(arg0: DyeColor) = this.method_6631(arg0)
fun SheepEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_6640(arg0, arg1)
fun SheepEntity.getNeckAngle(arg0: Float) = this.method_6628(arg0)
fun SheepEntity.setSheared(arg0: Boolean) = this.method_6635(arg0)
fun KClass<SheepEntity>.generateDefaultColor(arg0: Random) = SheepEntity.method_6632(arg0)
fun SheepEntity.isSheared() = this.method_6629()
fun KClass<SheepEntity>.getRgbColor(arg0: DyeColor) = SheepEntity.method_6634(arg0)
