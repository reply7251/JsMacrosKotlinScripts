package me.hellrevenger.generated.Map_TrialSpawnerLogic
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TrialSpawnerLogicKt {
    /**
     * field_50178
     */
    val OMINOUS_CONFIG_NBT_KEY by aliasStatic(TrialSpawnerLogic::field_50178)
    /**
     * field_50177
     */
    val NORMAL_CONFIG_NBT_KEY by aliasStatic(TrialSpawnerLogic::field_50177)
    /**
     * method_55166
     */
    fun addMobSpawnParticles(world: world_World, pos: BlockPos, random: Random, particle: SimpleParticleType) = TrialSpawnerLogic.method_55166(world, pos, random, particle)
    /**
     * method_58701
     */
    fun addTrialOmenParticles(world: world_World, pos: BlockPos, random: Random) = TrialSpawnerLogic.method_58701(world, pos, random)
    /**
     * method_55167
     */
    fun addDetectionParticles(world: world_World, pos: BlockPos, random: Random, playerCount: Int, particle: ParticleEffect) = TrialSpawnerLogic.method_55167(world, pos, random, playerCount, particle)
    /**
     * method_55173
     */
    fun addEjectItemParticles(world: world_World, pos: BlockPos, random: Random) = TrialSpawnerLogic.method_55173(world, pos, random)
}