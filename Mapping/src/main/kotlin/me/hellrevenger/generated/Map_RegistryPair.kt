package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryPair

fun <T>RegistryPair<T>.entry() = this.comp_2831()
fun <T>KClass<RegistryPair<T>>.createPacketCodec(arg0: RegistryKey<Registry<T>>, arg1: PacketCodec<RegistryByteBuf, RegistryEntry<T>>) = RegistryPair.method_60737<T>(arg0, arg1)
fun <T>RegistryPair<T>.getEntry(arg0: net.minecraft.class_7225.class_7874) = this.method_60739(arg0)
fun <T>RegistryPair<T>.getValue(arg0: Registry<T>) = this.method_60740(arg0)
fun <T>KClass<RegistryPair<T>>.create(arg0: Either<RegistryEntry<T>, RegistryKey<T>>) = RegistryPair.method_60738<T>(arg0)
fun <T>RegistryPair<T>.asEither() = this.method_60734()
fun <T>KClass<RegistryPair<T>>.createCodec(arg0: RegistryKey<Registry<T>>, arg1: Codec<RegistryEntry<T>>) = RegistryPair.method_60736<T>(arg0, arg1)
fun <T>RegistryPair<T>.key() = this.comp_2832()
