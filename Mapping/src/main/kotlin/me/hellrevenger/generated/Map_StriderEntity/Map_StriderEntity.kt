package me.hellrevenger.generated.Map_StriderEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<StriderEntity>.createStriderAttributes() = StriderEntity.method_26924()
fun StriderEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_26343(arg0, arg1)
fun KClass<StriderEntity>.canSpawn(arg0: EntityType<StriderEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = StriderEntity.method_26344(arg0, arg1, arg2, arg3, arg4)
fun StriderEntity.isCold() = this.method_26348()
fun StriderEntity.setCold(arg0: Boolean) = this.method_26349(arg0)
