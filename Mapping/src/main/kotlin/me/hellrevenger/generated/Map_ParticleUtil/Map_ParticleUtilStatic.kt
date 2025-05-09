package me.hellrevenger.generated.Map_ParticleUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ParticleUtilKt {
    /**
     * method_49099
     */
    fun spawnParticle(world: world_World, pos: BlockPos, random: Random, effect: ParticleEffect) = ParticleUtil.method_49099(world, pos, random, effect)
    /**
     * method_55636
     */
    fun spawnParticlesAround(world: WorldAccess, pos: BlockPos, count: Int, effect: ParticleEffect) = ParticleUtil.method_55636(world, pos, count, effect)
    /**
     * method_41305
     */
    fun spawnParticles(world: world_World, pos: BlockPos, effect: ParticleEffect, count: IntProvider, direction: Direction, velocity: Supplier<Vec3d>, offsetMultiplier: Double) = ParticleUtil.method_41305(world, pos, effect, count, direction, velocity, offsetMultiplier)
    /**
     * method_58595
     */
    fun spawnSmashAttackParticles(world: WorldAccess, pos: BlockPos, count: Int) = ParticleUtil.method_58595(world, pos, count)
}