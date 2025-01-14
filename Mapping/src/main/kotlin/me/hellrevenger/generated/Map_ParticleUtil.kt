package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ParticleUtil

fun KClass<ParticleUtil>.spawnParticle(arg0: world_World, arg1: BlockPos, arg2: Random, arg3: ParticleEffect) = ParticleUtil.method_49099(arg0, arg1, arg2, arg3)
fun KClass<ParticleUtil>.spawnParticle(arg0: world_World, arg1: BlockPos, arg2: ParticleEffect, arg3: IntProvider) = ParticleUtil.method_34682(arg0, arg1, arg2, arg3)
fun KClass<ParticleUtil>.spawnParticle(arg0: net.minecraft.class_2350.class_2351, arg1: world_World, arg2: BlockPos, arg3: Double, arg4: ParticleEffect, arg5: UniformIntProvider) = ParticleUtil.method_34683(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<ParticleUtil>.spawnParticlesAround(arg0: WorldAccess, arg1: BlockPos, arg2: Int, arg3: ParticleEffect) = ParticleUtil.method_55636(arg0, arg1, arg2, arg3)
fun KClass<ParticleUtil>.spawnParticlesAround(arg0: WorldAccess, arg1: BlockPos, arg2: Int, arg3: Double, arg4: Double, arg5: Boolean, arg6: ParticleEffect) = ParticleUtil.method_55635(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun KClass<ParticleUtil>.spawnParticle(arg0: world_World, arg1: BlockPos, arg2: Direction, arg3: ParticleEffect, arg4: Vec3d, arg5: Double) = ParticleUtil.method_34681(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<ParticleUtil>.spawnParticles(arg0: world_World, arg1: BlockPos, arg2: ParticleEffect, arg3: IntProvider, arg4: Direction, arg5: Supplier<Vec3d>, arg6: Double) = ParticleUtil.method_41305(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun KClass<ParticleUtil>.spawnSmashAttackParticles(arg0: WorldAccess, arg1: BlockPos, arg2: Int) = ParticleUtil.method_58595(arg0, arg1, arg2)
