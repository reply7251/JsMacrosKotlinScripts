package me.hellrevenger.generated.Map_WardenEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

var WardenEntity.diggingAnimationState by alias(WardenEntity::field_38136)
var WardenEntity.roaringAnimationState by alias(WardenEntity::field_38168)
var WardenEntity.attackingAnimationState by alias(WardenEntity::field_38137)
var WardenEntity.sniffingAnimationState by alias(WardenEntity::field_38169)
var WardenEntity.emergingAnimationState by alias(WardenEntity::field_38135)
var WardenEntity.chargingSonicBoomAnimationState by alias(WardenEntity::field_38859)
fun WardenEntity.getPrimeSuspect() = this.method_42215()
fun WardenEntity.getAnger() = this.method_42222()
fun WardenEntity.increaseAngerAt(arg0: Entity, arg1: Int, arg2: Boolean) = this.method_42212(arg0, arg1, arg2)
fun WardenEntity.getAngerManager() = this.method_42216()
fun WardenEntity.removeSuspect(arg0: Entity) = this.method_42211(arg0)
fun WardenEntity.getHeartPitch(arg0: Float) = this.method_42202(arg0)
fun WardenEntity.increaseAngerAt(arg0: Entity) = this.method_42213(arg0)
fun KClass<WardenEntity>.addDarknessToClosePlayers(arg0: ServerWorld, arg1: Vec3d, arg2: Entity, arg3: Int) = WardenEntity.method_42204(arg0, arg1, arg2, arg3)
fun WardenEntity.getAngriness() = this.method_42214()
fun WardenEntity.updateAttackTarget(arg0: LivingEntity) = this.method_43274(arg0)
fun KClass<WardenEntity>.addAttributes() = WardenEntity.method_42221()
fun WardenEntity.getTendrilPitch(arg0: Float) = this.method_42223(arg0)
fun WardenEntity.isValidTarget(arg0: Entity) = this.method_42206(arg0)
