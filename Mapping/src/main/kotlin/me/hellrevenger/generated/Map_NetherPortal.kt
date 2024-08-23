package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NetherPortal

val KClass<NetherPortal>.MAX_WIDTH by aliasStatic(NetherPortal::field_31823)
val KClass<NetherPortal>.MAX_HEIGHT by aliasStatic(NetherPortal::field_31824)
fun KClass<NetherPortal>.getOrEmpty(arg0: WorldAccess, arg1: BlockPos, arg2: Predicate<NetherPortal>, arg3: net.minecraft.class_2350.class_2351) = NetherPortal.method_30486(arg0, arg1, arg2, arg3)
fun NetherPortal.isValid() = this.method_10360()
fun NetherPortal.wasAlreadyValid() = this.method_10362()
fun KClass<NetherPortal>.findOpenPosition(arg0: Vec3d, arg1: ServerWorld, arg2: Entity, arg3: EntityDimensions) = NetherPortal.method_47382(arg0, arg1, arg2, arg3)
fun KClass<NetherPortal>.entityPosInPortal(arg0: net.minecraft.class_5459.class_5460, arg1: net.minecraft.class_2350.class_2351, arg2: Vec3d, arg3: EntityDimensions) = NetherPortal.method_30494(arg0, arg1, arg2, arg3)
fun KClass<NetherPortal>.getNewPortal(arg0: WorldAccess, arg1: BlockPos, arg2: net.minecraft.class_2350.class_2351) = NetherPortal.method_30485(arg0, arg1, arg2)
fun NetherPortal.createPortal() = this.method_10363()
