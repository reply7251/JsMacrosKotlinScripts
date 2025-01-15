package me.hellrevenger.generated.Map_LichenGrower
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<LichenGrower>.GROW_TYPES by aliasStatic(LichenGrower::field_37595)
fun LichenGrower.grow(arg0: BlockState, arg1: WorldAccess, arg2: BlockPos, arg3: Boolean) = this.method_41452(arg0, arg1, arg2, arg3)
fun LichenGrower.grow(arg0: BlockState, arg1: WorldAccess, arg2: BlockPos, arg3: Random) = this.method_41450(arg0, arg1, arg2, arg3)
fun LichenGrower.grow(arg0: BlockState, arg1: WorldAccess, arg2: BlockPos, arg3: Direction, arg4: Direction, arg5: Boolean) = this.method_41446(arg0, arg1, arg2, arg3, arg4, arg5)
fun LichenGrower.getGrowPos(arg0: BlockState, arg1: BlockView, arg2: BlockPos, arg3: Direction, arg4: Direction, arg5: net.minecraft.class_7118.class_7122) = this.method_41445(arg0, arg1, arg2, arg3, arg4, arg5)
fun LichenGrower.place(arg0: WorldAccess, arg1: net.minecraft.class_7118.class_7121, arg2: Boolean) = this.method_41441(arg0, arg1, arg2)
fun LichenGrower.grow(arg0: BlockState, arg1: WorldAccess, arg2: BlockPos, arg3: Direction, arg4: Random, arg5: Boolean) = this.method_41447(arg0, arg1, arg2, arg3, arg4, arg5)
fun LichenGrower.canGrow(arg0: BlockState, arg1: BlockView, arg2: BlockPos, arg3: Direction) = this.method_41443(arg0, arg1, arg2, arg3)
