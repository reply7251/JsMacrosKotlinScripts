package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NbtOps

val NbtOps.INSTANCE by aliasStatic(NbtOps::field_11560)
fun NbtOps.createByte(arg0: Byte) = this.method_10640(arg0)
fun NbtOps.getIntStream(arg0: NbtElement) = this.method_10651(arg0)
fun NbtOps.mergeToMap(arg0: NbtElement, arg1: MapLike<NbtElement>) = this.method_29154(arg0, arg1)
fun NbtOps.createMap(arg0: Stream<util_Pair<NbtElement, NbtElement>>) = this.method_10655(arg0)
fun NbtOps.getMap(arg0: NbtElement) = this.method_29163(arg0)
fun NbtOps.mergeToMap(arg0: NbtElement, arg1: NbtElement, arg2: NbtElement) = this.method_29157(arg0, arg1, arg2)
fun NbtOps.createLongList(arg0: LongStream) = this.method_10643(arg0)
fun NbtOps.mergeToList(arg0: NbtElement, arg1: NbtElement) = this.method_29156(arg0, arg1)
fun NbtOps.getStream(arg0: NbtElement) = this.method_10664(arg0)
fun NbtOps.createShort(arg0: Short) = this.method_10635(arg0)
fun NbtOps.mergeToMap(arg0: NbtElement, arg1: Map<NbtElement, NbtElement>) = this.method_59877(arg0, arg1)
fun NbtOps.remove(arg0: NbtElement, arg1: String) = this.method_10648(arg0, arg1)
fun NbtOps.getList(arg0: NbtElement) = this.method_29164(arg0)
fun NbtOps.createByteList(arg0: ByteBuffer) = this.method_10657(arg0)
fun NbtOps.getStringValue(arg0: NbtElement) = this.method_10656(arg0)
fun NbtOps.createInt(arg0: Int) = this.method_10661(arg0)
fun NbtOps.createDouble(arg0: Double) = this.method_10652(arg0)
fun NbtOps.createFloat(arg0: Float) = this.method_10662(arg0)
fun NbtOps.createList(arg0: Stream<NbtElement>) = this.method_10665(arg0)
fun NbtOps.createBoolean(arg0: Boolean) = this.method_23253(arg0)
fun NbtOps.createString(arg0: String) = this.method_10639(arg0)
fun NbtOps.mergeToList(arg0: NbtElement, arg1: List<NbtElement>) = this.method_29155(arg0, arg1)
fun NbtOps.empty() = this.method_10668()
fun NbtOps.getNumberValue(arg0: NbtElement) = this.method_10645(arg0)
fun NbtOps.getLongStream(arg0: NbtElement) = this.method_10637(arg0)
fun NbtOps.getMapValues(arg0: NbtElement) = this.method_10669(arg0)
fun NbtOps.createIntList(arg0: IntStream) = this.method_10663(arg0)
fun NbtOps.createNumeric(arg0: Number) = this.method_10660(arg0)
fun <U>NbtOps.convertTo(arg0: DynamicOps<U>, arg1: NbtElement) = this.method_29146<U>(arg0, arg1)
fun NbtOps.getMapEntries(arg0: NbtElement) = this.method_29162(arg0)
fun NbtOps.getByteBuffer(arg0: NbtElement) = this.method_10646(arg0)
fun NbtOps.createLong(arg0: Long) = this.method_10654(arg0)
