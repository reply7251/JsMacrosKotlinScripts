package me.hellrevenger.generated.Map_PacketBundleHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PacketBundleHandlerKt {
    /**
     * method_48325
     */
    fun <T, P>create(id: PacketType<P>?, bundleFunction: function_Function<Iterable<Packet<in T>>, P>?, splitter: BundleSplitterPacket<in T>?) where T: PacketListener, P: BundlePacket<in T> = PacketBundleHandler.method_48325<T, P>(id, bundleFunction, splitter)
}