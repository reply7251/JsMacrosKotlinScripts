package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MultiNoiseBiomeSource

val MultiNoiseBiomeSource.CUSTOM_CODEC by aliasStatic(MultiNoiseBiomeSource::field_24718)
fun KClass<MultiNoiseBiomeSource>.create(arg0: net.minecraft.class_6544.class_6547<RegistryEntry<Biome>>) = MultiNoiseBiomeSource.method_49501(arg0)
fun KClass<MultiNoiseBiomeSource>.create(arg0: RegistryEntry<MultiNoiseBiomeSourceParameterList>) = MultiNoiseBiomeSource.method_49503(arg0)
fun MultiNoiseBiomeSource.getBiomeAtPoint(arg0: net.minecraft.class_6544.class_6553) = this.method_38167(arg0)
fun MultiNoiseBiomeSource.matchesInstance(arg0: RegistryKey<MultiNoiseBiomeSourceParameterList>) = this.method_38168(arg0)
