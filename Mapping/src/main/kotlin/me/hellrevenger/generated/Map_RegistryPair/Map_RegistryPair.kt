package me.hellrevenger.generated.Map_RegistryPair
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * comp_2831
 */
fun <T>RegistryPair<T>.entry() = this.comp_2831()
/**
 * method_60737
 */
fun <T>KClass<RegistryPair<T>>.createPacketCodec(arg0: RegistryKey<Registry<T>>, arg1: PacketCodec<RegistryByteBuf, RegistryEntry<T>>) = RegistryPair.method_60737<T>(arg0, arg1)
/**
 * method_60739
 */
fun <T>RegistryPair<T>.getEntry(arg0: net.minecraft.class_7225.class_7874) = this.method_60739(arg0)
/**
 * method_60740
 */
fun <T>RegistryPair<T>.getValue(arg0: Registry<T>) = this.method_60740(arg0)
/**
 * method_60738
 */
fun <T>KClass<RegistryPair<T>>.create(arg0: Either<RegistryEntry<T>, RegistryKey<T>>) = RegistryPair.method_60738<T>(arg0)
/**
 * method_60734
 */
fun <T>RegistryPair<T>.asEither() = this.method_60734()
/**
 * method_60736
 */
fun <T>KClass<RegistryPair<T>>.createCodec(arg0: RegistryKey<Registry<T>>, arg1: Codec<RegistryEntry<T>>) = RegistryPair.method_60736<T>(arg0, arg1)
/**
 * comp_2832
 */
fun <T>RegistryPair<T>.key() = this.comp_2832()
