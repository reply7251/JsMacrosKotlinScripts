package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ProjectileUtil

fun KClass<ProjectileUtil>.getCollision(arg0: Entity, arg1: Predicate<Entity>, arg2: Double) = ProjectileUtil.method_49998(arg0, arg1, arg2)
fun KClass<ProjectileUtil>.setRotationFromVelocity(arg0: Entity, arg1: Float) = ProjectileUtil.method_7484(arg0, arg1)
fun KClass<ProjectileUtil>.getEntityCollision(arg0: world_World, arg1: Entity, arg2: Vec3d, arg3: Vec3d, arg4: Box, arg5: Predicate<Entity>) = ProjectileUtil.method_18077(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<ProjectileUtil>.getEntityCollision(arg0: world_World, arg1: Entity, arg2: Vec3d, arg3: Vec3d, arg4: Box, arg5: Predicate<Entity>, arg6: Float) = ProjectileUtil.method_37226(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun KClass<ProjectileUtil>.getCollision(arg0: Entity, arg1: Predicate<Entity>) = ProjectileUtil.method_49997(arg0, arg1)
fun KClass<ProjectileUtil>.getCollision(arg0: Entity, arg1: Predicate<Entity>, arg2: net.minecraft.class_3959.class_3960) = ProjectileUtil.method_55054(arg0, arg1, arg2)
fun KClass<ProjectileUtil>.getHandPossiblyHolding(arg0: LivingEntity, arg1: Item) = ProjectileUtil.method_18812(arg0, arg1)
fun KClass<ProjectileUtil>.raycast(arg0: Entity, arg1: Vec3d, arg2: Vec3d, arg3: Box, arg4: Predicate<Entity>, arg5: Double) = ProjectileUtil.method_18075(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<ProjectileUtil>.createArrowProjectile(arg0: LivingEntity, arg1: ItemStack, arg2: Float, arg3: ItemStack) = ProjectileUtil.method_18813(arg0, arg1, arg2, arg3)
