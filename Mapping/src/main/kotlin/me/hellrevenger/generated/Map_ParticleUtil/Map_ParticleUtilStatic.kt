package me.hellrevenger.generated.Map_ParticleUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ParticleUtilKt {
    /**
     * method_49099
     */
    fun spawnParticle(world: world_World, pos: BlockPos, random: Random, effect: ParticleEffect) = ParticleUtil.method_49099(world, pos, random, effect)
    /**
     * method_34682
     */
    fun spawnParticle(world: world_World, pos: BlockPos, effect: ParticleEffect, count: IntProvider) = ParticleUtil.method_34682(world, pos, effect, count)
    /**
     * method_34683
     */
    fun spawnParticle(axis: net.minecraft.class_2350.class_2351, world: world_World, pos: BlockPos, variance: Double, arg4: ParticleEffect, effect: UniformIntProvider) = ParticleUtil.method_34683(axis, world, pos, variance, arg4, effect)
    /**
     * method_55636
     */
    fun spawnParticlesAround(world: WorldAccess, pos: BlockPos, count: Int, effect: ParticleEffect) = ParticleUtil.method_55636(world, pos, count, effect)
    /**
     * method_55635
     */
    fun spawnParticlesAround(world: WorldAccess, pos: BlockPos, count: Int, horizontalOffset: Double, arg4: Double, verticalOffset: Boolean, arg6: ParticleEffect) = ParticleUtil.method_55635(world, pos, count, horizontalOffset, arg4, verticalOffset, arg6)
    /**
     * method_34681
     */
    fun spawnParticle(world: world_World, pos: BlockPos, direction: Direction, effect: ParticleEffect, velocity: Vec3d, offsetMultiplier: Double) = ParticleUtil.method_34681(world, pos, direction, effect, velocity, offsetMultiplier)
    /**
     * method_41305
     */
    fun spawnParticles(world: world_World, pos: BlockPos, effect: ParticleEffect, count: IntProvider, direction: Direction, velocity: Supplier<Vec3d>, offsetMultiplier: Double) = ParticleUtil.method_41305(world, pos, effect, count, direction, velocity, offsetMultiplier)
    /**
     * method_58595
     */
    fun spawnSmashAttackParticles(world: WorldAccess, pos: BlockPos, count: Int) = ParticleUtil.method_58595(world, pos, count)
}