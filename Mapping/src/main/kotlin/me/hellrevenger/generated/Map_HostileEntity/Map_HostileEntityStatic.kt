package me.hellrevenger.generated.Map_HostileEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object HostileEntityKt {
    /**
     * method_20680
     */
    fun canSpawnInDark(type: EntityType<out HostileEntity>?, world: ServerWorldAccess?, spawnReason: SpawnReason?, pos: BlockPos?, random: Random?) = HostileEntity.method_20680(type, world, spawnReason, pos, random)
    /**
     * method_20681
     */
    fun canSpawnIgnoreLightLevel(type: EntityType<out HostileEntity>?, world: WorldAccess?, spawnReason: SpawnReason?, pos: BlockPos?, random: Random?) = HostileEntity.method_20681(type, world, spawnReason, pos, random)
    /**
     * method_20679
     */
    fun isSpawnDark(world: ServerWorldAccess?, pos: BlockPos?, random: Random?) = HostileEntity.method_20679(world, pos, random)
    /**
     * method_26918
     */
    fun createHostileAttributes() = HostileEntity.method_26918()
}