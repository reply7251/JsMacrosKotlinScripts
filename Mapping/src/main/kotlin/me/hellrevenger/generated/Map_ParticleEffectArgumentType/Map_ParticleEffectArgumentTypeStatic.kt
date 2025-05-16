package me.hellrevenger.generated.Map_ParticleEffectArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ParticleEffectArgumentTypeKt {
    /**
     * field_9936
     */
    val UNKNOWN_PARTICLE_EXCEPTION by aliasStatic(ParticleEffectArgumentType::field_9936)
    /**
     * field_51438
     */
    val INVALID_OPTIONS_EXCEPTION by aliasStatic(ParticleEffectArgumentType::field_51438)
    /**
     * method_9418
     */
    fun readParameters(reader: StringReader?, registries: net.minecraft.class_7225.class_7874?) = ParticleEffectArgumentType.method_9418(reader, registries)
    /**
     * method_9417
     */
    fun particleEffect(registryAccess: CommandRegistryAccess?) = ParticleEffectArgumentType.method_9417(registryAccess)
    /**
     * method_9421
     */
    fun getParticle(context: CommandContext<ServerCommandSource>?, name: String?) = ParticleEffectArgumentType.method_9421(context, name)
}