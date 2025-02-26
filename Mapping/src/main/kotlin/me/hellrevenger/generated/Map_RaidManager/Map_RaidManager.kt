package me.hellrevenger.generated.Map_RaidManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_16541
 */
fun RaidManager.getRaid(arg0: Int) = this.method_16541(arg0)
/**
 * method_16539
 */
fun RaidManager.tick() = this.method_16539()
/**
 * method_77
 */
fun KClass<RaidManager>.fromNbt(arg0: ServerWorld, arg1: NbtCompound) = RaidManager.method_77(arg0, arg1)
/**
 * method_16540
 */
fun RaidManager.startRaid(arg0: ServerPlayerEntity, arg1: BlockPos) = this.method_16540(arg0, arg1)
/**
 * method_19209
 */
fun RaidManager.getRaidAt(arg0: BlockPos, arg1: Int) = this.method_19209(arg0, arg1)
/**
 * method_16838
 */
fun KClass<RaidManager>.isValidRaiderFor(arg0: RaiderEntity, arg1: Raid) = RaidManager.method_16838(arg0, arg1)
/**
 * method_16533
 */
fun KClass<RaidManager>.nameFor(arg0: RegistryEntry<DimensionType>) = RaidManager.method_16533(arg0)
/**
 * method_52559
 */
fun KClass<RaidManager>.getPersistentStateType(arg0: ServerWorld) = RaidManager.method_52559(arg0)
