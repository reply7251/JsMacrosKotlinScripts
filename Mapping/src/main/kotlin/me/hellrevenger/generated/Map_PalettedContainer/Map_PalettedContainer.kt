package me.hellrevenger.generated.Map_PalettedContainer
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>PalettedContainer<T>.lock() = this.method_12334()
fun <T>PalettedContainer<T>.copy() = this.method_39957()
fun <T>KClass<PalettedContainer<T>>.createReadableContainerCodec(arg0: IndexedIterable<T>, arg1: Codec<T>, arg2: net.minecraft.class_2841.class_6563, arg3: T) = PalettedContainer.method_44347<T>(arg0, arg1, arg2, arg3)
fun <T>PalettedContainer<T>.swapUnsafe(arg0: Int, arg1: Int, arg2: Int, arg3: T) = this.method_16678(arg0, arg1, arg2, arg3)
fun <T>KClass<PalettedContainer<T>>.createPalettedContainerCodec(arg0: IndexedIterable<T>, arg1: Codec<T>, arg2: net.minecraft.class_2841.class_6563, arg3: T) = PalettedContainer.method_44343<T>(arg0, arg1, arg2, arg3)
fun <T>PalettedContainer<T>.set(arg0: Int, arg1: Int, arg2: Int, arg3: T) = this.method_35321(arg0, arg1, arg2, arg3)
fun <T>PalettedContainer<T>.unlock() = this.method_12335()
fun <T>PalettedContainer<T>.readPacket(arg0: PacketByteBuf) = this.method_12326(arg0)
fun <T>PalettedContainer<T>.swap(arg0: Int, arg1: Int, arg2: Int, arg3: T) = this.method_12328(arg0, arg1, arg2, arg3)
