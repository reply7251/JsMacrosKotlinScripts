package me.hellrevenger.generated.Map_RaidManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RaidManagerKt {
    /**
     * method_77
     */
    fun fromNbt(world: ServerWorld, nbt: NbtCompound) = RaidManager.method_77(world, nbt)
    /**
     * method_16838
     */
    fun isValidRaiderFor(raider: RaiderEntity, raid: Raid) = RaidManager.method_16838(raider, raid)
    /**
     * method_16533
     */
    fun nameFor(dimensionTypeEntry: RegistryEntry<DimensionType>) = RaidManager.method_16533(dimensionTypeEntry)
    /**
     * method_52559
     */
    fun getPersistentStateType(world: ServerWorld) = RaidManager.method_52559(world)
}