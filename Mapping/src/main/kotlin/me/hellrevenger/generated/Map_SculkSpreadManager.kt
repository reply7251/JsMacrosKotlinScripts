package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SculkSpreadManager

val SculkSpreadManager.MAX_CHARGE by aliasStatic(SculkSpreadManager::field_37610)
fun SculkSpreadManager.isWorldGen() = this.method_41492()
fun KClass<SculkSpreadManager>.create() = SculkSpreadManager.method_41478()
fun SculkSpreadManager.readNbt(arg0: NbtCompound) = this.method_41483(arg0)
fun SculkSpreadManager.spread(arg0: BlockPos, arg1: Int) = this.method_41482(arg0, arg1)
fun SculkSpreadManager.writeNbt(arg0: NbtCompound) = this.method_41486(arg0)
fun SculkSpreadManager.clearCursors() = this.method_41494()
fun SculkSpreadManager.tick(arg0: WorldAccess, arg1: BlockPos, arg2: Random, arg3: Boolean) = this.method_41479(arg0, arg1, arg2, arg3)
fun KClass<SculkSpreadManager>.createWorldGen() = SculkSpreadManager.method_41485()
