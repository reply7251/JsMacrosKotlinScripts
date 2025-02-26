package me.hellrevenger.generated.Map_BeeEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30279
 */
val KClass<BeeEntity>.FLOWER_POS_KEY by aliasStatic(BeeEntity::field_30279)
/**
 * field_30272
 */
val KClass<BeeEntity>.CROPS_GROWN_SINCE_POLLINATION_KEY by aliasStatic(BeeEntity::field_30272)
/**
 * field_30280
 */
val KClass<BeeEntity>.HIVE_POS_KEY by aliasStatic(BeeEntity::field_30280)
/**
 * field_30276
 */
val KClass<BeeEntity>.TICKS_SINCE_POLLINATION_KEY by aliasStatic(BeeEntity::field_30276)
/**
 * field_30273
 */
val KClass<BeeEntity>.CANNOT_ENTER_HIVE_TICKS_KEY by aliasStatic(BeeEntity::field_30273)
/**
 * field_30277
 */
val KClass<BeeEntity>.HAS_STUNG_KEY by aliasStatic(BeeEntity::field_30277)
/**
 * field_30278
 */
val KClass<BeeEntity>.HAS_NECTAR_KEY by aliasStatic(BeeEntity::field_30278)
/**
 * method_21797
 */
fun BeeEntity.setFlowerPos(arg0: BlockPos) = this.method_21797(arg0)
/**
 * method_21791
 */
fun BeeEntity.hasHive() = this.method_21791()
/**
 * method_57301
 */
fun BeeEntity.setHivePos(arg0: BlockPos) = this.method_57301(arg0)
/**
 * method_21780
 */
fun BeeEntity.resetPollinationTicks() = this.method_21780()
/**
 * method_21784
 */
fun BeeEntity.hasNectar() = this.method_21784()
/**
 * method_21771
 */
fun BeeEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_21771(arg0, arg1)
/**
 * method_21788
 */
fun BeeEntity.onHoneyDelivered() = this.method_21788()
/**
 * method_21778
 */
fun BeeEntity.getFlowerPos() = this.method_21778()
/**
 * method_21785
 */
fun BeeEntity.hasStung() = this.method_21785()
/**
 * method_35163
 */
fun BeeEntity.getGoalSelector() = this.method_35163()
/**
 * method_21807
 */
fun BeeEntity.setCannotEnterHiveTicks(arg0: Int) = this.method_21807(arg0)
/**
 * method_26880
 */
fun KClass<BeeEntity>.createBeeAttributes() = BeeEntity.method_26880()
/**
 * method_35162
 */
fun BeeEntity.getPossibleHives() = this.method_35162()
/**
 * method_21811
 */
fun BeeEntity.getBodyPitch(arg0: Float) = this.method_21811(arg0)
/**
 * method_35161
 */
fun BeeEntity.getMoveGoalTicks() = this.method_35161()
/**
 * method_23884
 */
fun BeeEntity.getHivePos() = this.method_23884()
/**
 * method_21779
 */
fun BeeEntity.hasFlower() = this.method_21779()
