package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ParticleEffectArgumentType

val ParticleEffectArgumentType.UNKNOWN_PARTICLE_EXCEPTION by aliasStatic(ParticleEffectArgumentType::field_9936)
val ParticleEffectArgumentType.INVALID_OPTIONS_EXCEPTION by aliasStatic(ParticleEffectArgumentType::field_51438)
fun KClass<ParticleEffectArgumentType>.readParameters(arg0: StringReader, arg1: net.minecraft.class_7225.class_7874) = ParticleEffectArgumentType.method_9418(arg0, arg1)
fun KClass<ParticleEffectArgumentType>.particleEffect(arg0: CommandRegistryAccess) = ParticleEffectArgumentType.method_9417(arg0)
fun ParticleEffectArgumentType.parse(arg0: StringReader) = this.method_9416(arg0)
fun KClass<ParticleEffectArgumentType>.getParticle(arg0: CommandContext<ServerCommandSource>, arg1: String) = ParticleEffectArgumentType.method_9421(arg0, arg1)
