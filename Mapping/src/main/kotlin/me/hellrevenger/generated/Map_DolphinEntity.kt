package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DolphinEntity

val KClass<DolphinEntity>.CAN_TAKE by aliasStatic(DolphinEntity::field_6748)
val KClass<DolphinEntity>.MAX_AIR by aliasStatic(DolphinEntity::field_30326)
fun DolphinEntity.getTreasurePos() = this.method_6494()
fun DolphinEntity.hasFish() = this.method_6487()
fun DolphinEntity.setTreasurePos(arg0: BlockPos) = this.method_6493(arg0)
fun DolphinEntity.getMoistness() = this.method_6491()
fun KClass<DolphinEntity>.createDolphinAttributes() = DolphinEntity.method_26884()
fun DolphinEntity.setMoistness(arg0: Int) = this.method_6489(arg0)
fun DolphinEntity.setHasFish(arg0: Boolean) = this.method_6486(arg0)
