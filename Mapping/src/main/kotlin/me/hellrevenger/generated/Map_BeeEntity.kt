package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BeeEntity

val KClass<BeeEntity>.FLOWER_POS_KEY by aliasStatic(BeeEntity::field_30279)
val KClass<BeeEntity>.CROPS_GROWN_SINCE_POLLINATION_KEY by aliasStatic(BeeEntity::field_30272)
val KClass<BeeEntity>.HIVE_POS_KEY by aliasStatic(BeeEntity::field_30280)
val KClass<BeeEntity>.TICKS_SINCE_POLLINATION_KEY by aliasStatic(BeeEntity::field_30276)
val KClass<BeeEntity>.CANNOT_ENTER_HIVE_TICKS_KEY by aliasStatic(BeeEntity::field_30273)
val KClass<BeeEntity>.HAS_STUNG_KEY by aliasStatic(BeeEntity::field_30277)
val KClass<BeeEntity>.HAS_NECTAR_KEY by aliasStatic(BeeEntity::field_30278)
fun BeeEntity.setFlowerPos(arg0: BlockPos) = this.method_21797(arg0)
fun BeeEntity.hasHive() = this.method_21791()
fun BeeEntity.setHivePos(arg0: BlockPos) = this.method_57301(arg0)
fun BeeEntity.resetPollinationTicks() = this.method_21780()
fun BeeEntity.hasNectar() = this.method_21784()
fun BeeEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_21771(arg0, arg1)
fun BeeEntity.onHoneyDelivered() = this.method_21788()
fun BeeEntity.getFlowerPos() = this.method_21778()
fun BeeEntity.hasStung() = this.method_21785()
fun BeeEntity.getGoalSelector() = this.method_35163()
fun BeeEntity.setCannotEnterHiveTicks(arg0: Int) = this.method_21807(arg0)
fun KClass<BeeEntity>.createBeeAttributes() = BeeEntity.method_26880()
fun BeeEntity.getPossibleHives() = this.method_35162()
fun BeeEntity.getBodyPitch(arg0: Float) = this.method_21811(arg0)
fun BeeEntity.getMoveGoalTicks() = this.method_35161()
fun BeeEntity.getHivePos() = this.method_23884()
fun BeeEntity.hasFlower() = this.method_21779()
