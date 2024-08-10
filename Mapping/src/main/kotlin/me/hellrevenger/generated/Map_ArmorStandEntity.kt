package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ArmorStandEntity

val ArmorStandEntity.ARMOR_STAND_FLAGS by aliasStatic(ArmorStandEntity::field_7107)
val ArmorStandEntity.TRACKER_HEAD_ROTATION by aliasStatic(ArmorStandEntity::field_7123)
val ArmorStandEntity.TRACKER_LEFT_LEG_ROTATION by aliasStatic(ArmorStandEntity::field_7127)
val ArmorStandEntity.invisible by alias(ArmorStandEntity::field_7111)
val ArmorStandEntity.SMALL_FLAG by aliasStatic(ArmorStandEntity::field_30452)
val ArmorStandEntity.MARKER_FLAG by aliasStatic(ArmorStandEntity::field_30444)
val ArmorStandEntity.TRACKER_LEFT_ARM_ROTATION by aliasStatic(ArmorStandEntity::field_7116)
val ArmorStandEntity.SHOW_ARMS_FLAG by aliasStatic(ArmorStandEntity::field_30453)
val ArmorStandEntity.lastHitTime by alias(ArmorStandEntity::field_7112)
val ArmorStandEntity.TRACKER_RIGHT_LEG_ROTATION by aliasStatic(ArmorStandEntity::field_7125)
val ArmorStandEntity.TRACKER_RIGHT_ARM_ROTATION by aliasStatic(ArmorStandEntity::field_7105)
val ArmorStandEntity.HIDE_BASE_PLATE_FLAG by aliasStatic(ArmorStandEntity::field_30442)
val ArmorStandEntity.TRACKER_BODY_ROTATION by aliasStatic(ArmorStandEntity::field_7122)
fun ArmorStandEntity.shouldShowArms() = this.method_6929()
fun KClass<ArmorStandEntity>.createArmorStandAttributes() = ArmorStandEntity.method_55745()
fun ArmorStandEntity.setLeftLegRotation(arg0: EulerAngle) = this.method_6909(arg0)
fun ArmorStandEntity.setRightArmRotation(arg0: EulerAngle) = this.method_6925(arg0)
fun ArmorStandEntity.shouldHideBasePlate() = this.method_6901()
fun ArmorStandEntity.setShowArms(arg0: Boolean) = this.method_6913(arg0)
fun ArmorStandEntity.setRightLegRotation(arg0: EulerAngle) = this.method_6926(arg0)
fun ArmorStandEntity.isMarker() = this.method_6912()
fun ArmorStandEntity.setLeftArmRotation(arg0: EulerAngle) = this.method_6910(arg0)
fun ArmorStandEntity.setHeadRotation(arg0: EulerAngle) = this.method_6919(arg0)
fun ArmorStandEntity.setBodyRotation(arg0: EulerAngle) = this.method_6927(arg0)
fun ArmorStandEntity.setHideBasePlate(arg0: Boolean) = this.method_6907(arg0)
fun ArmorStandEntity.isSmall() = this.method_6914()
