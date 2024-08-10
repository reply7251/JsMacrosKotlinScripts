package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TameableEntity

fun TameableEntity.isSitting() = this.method_24345()
fun TameableEntity.isInSittingPose() = this.method_6172()
fun TameableEntity.isOwner(arg0: LivingEntity) = this.method_6171(arg0)
fun TameableEntity.isTamed() = this.method_6181()
fun TameableEntity.setOwner(arg0: PlayerEntity) = this.method_6170(arg0)
fun TameableEntity.setSitting(arg0: Boolean) = this.method_24346(arg0)
fun TameableEntity.tryTeleportToOwner() = this.method_60713()
fun TameableEntity.setOwnerUuid(arg0: UUID) = this.method_6174(arg0)
fun TameableEntity.shouldTryTeleportToOwner() = this.method_60714()
fun TameableEntity.canAttackWithOwner(arg0: LivingEntity, arg1: LivingEntity) = this.method_6178(arg0, arg1)
fun TameableEntity.cannotFollowOwner() = this.method_60715()
fun TameableEntity.setTamed(arg0: Boolean, arg1: Boolean) = this.method_6173(arg0, arg1)
fun TameableEntity.setInSittingPose(arg0: Boolean) = this.method_6179(arg0)
