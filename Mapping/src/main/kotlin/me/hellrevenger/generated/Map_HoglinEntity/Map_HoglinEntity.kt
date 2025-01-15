package me.hellrevenger.generated.Map_HoglinEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<HoglinEntity>.createHoglinAttributes() = HoglinEntity.method_26943()
fun KClass<HoglinEntity>.canSpawn(arg0: EntityType<HoglinEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = HoglinEntity.method_24349(arg0, arg1, arg2, arg3, arg4)
fun HoglinEntity.canBeHunted() = this.method_26945()
fun HoglinEntity.canConvert() = this.method_26944()
fun HoglinEntity.setImmuneToZombification(arg0: Boolean) = this.method_26948(arg0)
fun HoglinEntity.isAdult() = this.method_24658()
