package me.hellrevenger.generated.Map_HostileEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_20680
 */
fun KClass<HostileEntity>.canSpawnInDark(arg0: EntityType<out HostileEntity>, arg1: ServerWorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = HostileEntity.method_20680(arg0, arg1, arg2, arg3, arg4)
/**
 * method_20681
 */
fun KClass<HostileEntity>.canSpawnIgnoreLightLevel(arg0: EntityType<out HostileEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = HostileEntity.method_20681(arg0, arg1, arg2, arg3, arg4)
/**
 * method_20679
 */
fun KClass<HostileEntity>.isSpawnDark(arg0: ServerWorldAccess, arg1: BlockPos, arg2: Random) = HostileEntity.method_20679(arg0, arg1, arg2)
/**
 * method_7076
 */
fun HostileEntity.isAngryAt(arg0: PlayerEntity) = this.method_7076(arg0)
/**
 * method_26918
 */
fun KClass<HostileEntity>.createHostileAttributes() = HostileEntity.method_26918()
