package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.HostileEntity

fun KClass<HostileEntity>.canSpawnInDark(arg0: EntityType<out HostileEntity>, arg1: ServerWorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = HostileEntity.method_20680(arg0, arg1, arg2, arg3, arg4)
fun KClass<HostileEntity>.canSpawnIgnoreLightLevel(arg0: EntityType<out HostileEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = HostileEntity.method_20681(arg0, arg1, arg2, arg3, arg4)
fun KClass<HostileEntity>.isSpawnDark(arg0: ServerWorldAccess, arg1: BlockPos, arg2: Random) = HostileEntity.method_20679(arg0, arg1, arg2)
fun HostileEntity.isAngryAt(arg0: PlayerEntity) = this.method_7076(arg0)
fun KClass<HostileEntity>.createHostileAttributes() = HostileEntity.method_26918()
