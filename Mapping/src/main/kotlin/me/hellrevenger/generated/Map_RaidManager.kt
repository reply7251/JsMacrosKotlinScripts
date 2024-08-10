package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RaidManager

fun RaidManager.getRaid(arg0: Int) = this.method_16541(arg0)
fun RaidManager.tick() = this.method_16539()
fun KClass<RaidManager>.fromNbt(arg0: ServerWorld, arg1: NbtCompound) = RaidManager.method_77(arg0, arg1)
fun RaidManager.startRaid(arg0: ServerPlayerEntity, arg1: BlockPos) = this.method_16540(arg0, arg1)
fun RaidManager.getRaidAt(arg0: BlockPos, arg1: Int) = this.method_19209(arg0, arg1)
fun KClass<RaidManager>.isValidRaiderFor(arg0: RaiderEntity, arg1: Raid) = RaidManager.method_16838(arg0, arg1)
fun KClass<RaidManager>.nameFor(arg0: RegistryEntry<DimensionType>) = RaidManager.method_16533(arg0)
fun KClass<RaidManager>.getPersistentStateType(arg0: ServerWorld) = RaidManager.method_52559(arg0)
