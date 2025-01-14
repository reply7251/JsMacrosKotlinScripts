package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PacketBundleHandler

fun PacketBundleHandler.forEachPacket(arg0: Packet<*>, arg1: Consumer<Packet<*>>) = this.method_48327(arg0, arg1)
fun <T, P>KClass<PacketBundleHandler>.create(arg0: PacketType<P>, arg1: Function<Iterable<Packet<in T>>, P>, arg2: BundleSplitterPacket<in T>) where T: PacketListener, P: BundlePacket<in T> = PacketBundleHandler.method_48325<T, P>(arg0, arg1, arg2)
fun PacketBundleHandler.createBundler(arg0: Packet<*>) = this.method_48326(arg0)
