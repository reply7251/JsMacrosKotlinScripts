package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RabbitEntity

val RabbitEntity.ESCAPE_DANGER_SPEED by aliasStatic(RabbitEntity::field_30359)
val RabbitEntity.MELEE_ATTACK_SPEED by aliasStatic(RabbitEntity::field_30360)
fun RabbitEntity.setVariant(arg0: net.minecraft.class_1463.class_7990) = this.method_47853(arg0)
fun RabbitEntity.startJump() = this.method_6618()
fun KClass<RabbitEntity>.createRabbitAttributes() = RabbitEntity.method_26892()
fun RabbitEntity.getJumpProgress(arg0: Float) = this.method_6605(arg0)
fun RabbitEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_6620(arg0, arg1)
fun RabbitEntity.setSpeed(arg0: Double) = this.method_6606(arg0)
fun RabbitEntity.getVariant() = this.method_47855()
fun KClass<RabbitEntity>.canSpawn(arg0: EntityType<RabbitEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = RabbitEntity.method_20669(arg0, arg1, arg2, arg3, arg4)
