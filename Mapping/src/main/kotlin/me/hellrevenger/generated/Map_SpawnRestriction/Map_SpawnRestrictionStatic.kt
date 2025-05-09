package me.hellrevenger.generated.Map_SpawnRestriction
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SpawnRestrictionKt {
    /**
     * method_56558
     */
    fun isSpawnPosAllowed(type: EntityType<*>, world: WorldView, pos: BlockPos) = SpawnRestriction.method_56558(type, world, pos)
    /**
     * method_6160
     */
    fun getHeightmapType(type: EntityType<*>) = SpawnRestriction.method_6160(type)
    /**
     * method_20638
     */
    fun <T>canSpawn(type: EntityType<T>, world: ServerWorldAccess, spawnReason: SpawnReason, pos: BlockPos, random: Random) where T: Entity = SpawnRestriction.method_20638<T>(type, world, spawnReason, pos, random)
    /**
     * method_20637
     */
    fun <T>register(type: EntityType<T>, location: SpawnLocation, heightmapType: net.minecraft.class_2902.class_2903, predicate: net.minecraft.class_1317.class_4306<T>) where T: MobEntity = SpawnRestriction.method_20637<T>(type, location, heightmapType, predicate)
    /**
     * method_6159
     */
    fun getLocation(type: EntityType<*>) = SpawnRestriction.method_6159(type)
}