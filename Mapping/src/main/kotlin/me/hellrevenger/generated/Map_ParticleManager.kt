package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ParticleManager

fun ParticleManager.addParticle(arg0: ParticleEffect, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double) = this.method_3056(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun ParticleManager.addEmitter(arg0: Entity, arg1: ParticleEffect, arg2: Int) = this.method_3051(arg0, arg1, arg2)
fun ParticleManager.addParticle(arg0: Particle) = this.method_3058(arg0)
fun ParticleManager.addEmitter(arg0: Entity, arg1: ParticleEffect) = this.method_3061(arg0, arg1)
fun ParticleManager.clearAtlas() = this.method_18829()
fun ParticleManager.addBlockBreakParticles(arg0: BlockPos, arg1: BlockState) = this.method_3046(arg0, arg1)
fun ParticleManager.tick() = this.method_3057()
fun ParticleManager.setWorld(arg0: ClientWorld) = this.method_3045(arg0)
fun ParticleManager.addBlockBreakingParticles(arg0: BlockPos, arg1: Direction) = this.method_3054(arg0, arg1)
fun ParticleManager.getDebugString() = this.method_3052()
fun ParticleManager.renderParticles(arg0: LightmapTextureManager, arg1: Camera, arg2: Float) = this.method_3049(arg0, arg1, arg2)
