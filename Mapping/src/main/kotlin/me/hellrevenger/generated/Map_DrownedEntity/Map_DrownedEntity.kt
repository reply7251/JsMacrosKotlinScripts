package me.hellrevenger.generated.Map_DrownedEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<DrownedEntity>.createDrownedAttributes() = DrownedEntity.method_55746()
fun DrownedEntity.canDrownedAttackTarget(arg0: LivingEntity) = this.method_7012(arg0)
fun KClass<DrownedEntity>.canSpawn(arg0: EntityType<DrownedEntity>, arg1: ServerWorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = DrownedEntity.method_20673(arg0, arg1, arg2, arg3, arg4)
fun DrownedEntity.setTargetingUnderwater(arg0: Boolean) = this.method_7013(arg0)
