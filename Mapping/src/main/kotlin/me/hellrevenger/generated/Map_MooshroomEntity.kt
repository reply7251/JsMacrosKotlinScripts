package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MooshroomEntity

fun MooshroomEntity.getVariant() = this.method_47847()
fun MooshroomEntity.setVariant(arg0: net.minecraft.class_1438.class_4053) = this.method_47846(arg0)
fun KClass<MooshroomEntity>.canSpawn(arg0: EntityType<MooshroomEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = MooshroomEntity.method_20665(arg0, arg1, arg2, arg3, arg4)
fun MooshroomEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_6495(arg0, arg1)
