package me.hellrevenger.generated.Map_PacketByteBuf
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_52950
 */
fun PacketByteBuf.getBytes(arg0: Int, arg1: ByteBuffer) = this.method_52950(arg0, arg1)
/**
 * method_33557
 */
fun PacketByteBuf.writeBitSet(bitSet: BitSet) = this.method_33557(bitSet)
/**
 * method_52968
 */
fun PacketByteBuf.setBytes(arg0: Int, arg1: ByteBuf) = this.method_52968(arg0, arg1)
/**
 * method_10807
 */
fun PacketByteBuf.writeBlockPos(pos: BlockPos) = this.method_10807(pos)
/**
 * method_52977
 */
fun PacketByteBuf.writeBytes(arg0: ByteBuf, arg1: Int, arg2: Int) = this.method_52977(arg0, arg1, arg2)
/**
 * method_44119
 */
fun PacketByteBuf.readPublicKey() = this.method_44119()
/**
 * method_53002
 */
fun PacketByteBuf.writeInt(arg0: Int) = this.method_53002(arg0)
/**
 * method_10809
 */
fun PacketByteBuf.readLongArray(toArray: LongArray, maxSize: Int) = this.method_10809(toArray, maxSize)
/**
 * method_17813
 */
fun PacketByteBuf.writeBlockHitResult(hitResult: BlockHitResult) = this.method_17813(hitResult)
/**
 * method_52994
 */
fun PacketByteBuf.skipBytes(arg0: Int) = this.method_52994(arg0)
/**
 * method_52940
 */
fun PacketByteBuf.writeDouble(arg0: Double) = this.method_52940(arg0)
/**
 * method_10816
 */
fun PacketByteBuf.readVarInt() = this.method_10816()
/**
 * method_53001
 */
fun PacketByteBuf.writeMediumLE(arg0: Int) = this.method_53001(arg0)
/**
 * method_52945
 */
fun PacketByteBuf.setLong(arg0: Int, arg1: Long) = this.method_52945(arg0, arg1)
/**
 * method_52982
 */
fun PacketByteBuf.writeLongLE(arg0: Long) = this.method_52982(arg0)
/**
 * method_37436
 */
fun <T>PacketByteBuf.readOptional(reader: PacketDecoder<in PacketByteBuf, T>) = this.method_37436<T>(reader)
/**
 * method_52991
 */
fun PacketByteBuf.setIntLE(arg0: Int, arg1: Int) = this.method_52991(arg0, arg1)
/**
 * method_30616
 */
fun PacketByteBuf.readNbt(sizeTracker: NbtSizeTracker) = this.method_30616(sizeTracker)
/**
 * method_53004
 */
fun PacketByteBuf.writeChar(arg0: Int) = this.method_53004(arg0)
/**
 * method_34069
 */
fun <K, V, M>PacketByteBuf.readMap(mapFactory: IntFunction<M>, keyReader: PacketDecoder<in PacketByteBuf, K>, valueReader: PacketDecoder<in PacketByteBuf, V>) where M: Map<K, V> = this.method_34069<K, V, M>(mapFactory, keyReader, valueReader)
/**
 * method_52954
 */
fun <T>PacketByteBuf.decode(ops: DynamicOps<NbtElement>, codec: Codec<T>) = this.method_52954<T>(ops, codec)
/**
 * method_10802
 */
fun PacketByteBuf.readDate() = this.method_10802()
/**
 * method_36131
 */
fun PacketByteBuf.writeChunkSectionPos(pos: ChunkSectionPos) = this.method_36131(pos)
/**
 * method_49070
 */
fun PacketByteBuf.readQuaternionf() = this.method_49070()
/**
 * method_53003
 */
fun PacketByteBuf.writeIntLE(arg0: Int) = this.method_53003(arg0)
/**
 * method_44118
 */
fun PacketByteBuf.readInstant() = this.method_44118()
/**
 * method_52997
 */
fun PacketByteBuf.writeByte(arg0: Int) = this.method_52997(arg0)
/**
 * method_52990
 */
fun PacketByteBuf.writerIndex(arg0: Int) = this.method_52990(arg0)
/**
 * method_34059
 */
fun PacketByteBuf.readIntList() = this.method_34059()
/**
 * method_52989
 */
fun PacketByteBuf.setInt(arg0: Int, arg1: Int) = this.method_52989(arg0, arg1)
/**
 * method_52938
 */
fun PacketByteBuf.retain() = this.method_52938()
/**
 * method_19456
 */
fun PacketByteBuf.readChunkSectionPos() = this.method_19456()
/**
 * method_10788
 */
fun PacketByteBuf.writeString(string: String, maxLength: Int) = this.method_10788(string, maxLength)
/**
 * method_10795
 */
fun PacketByteBuf.readByteArray() = this.method_10795()
/**
 * method_44112
 */
fun <T>PacketByteBuf.readRegistryKey(registryRef: RegistryKey<out Registry<T>>) = this.method_44112<T>(registryRef)
/**
 * method_52966
 */
fun PacketByteBuf.setByte(arg0: Int, arg1: Int) = this.method_52966(arg0, arg1)
/**
 * method_29172
 */
fun <T>PacketByteBuf.encode(ops: DynamicOps<NbtElement>, codec: Codec<T>, value: T) = this.method_29172<T>(ops, codec, value)
/**
 * method_34062
 */
fun <T>PacketByteBuf.writeCollection(collection: Collection<T>, writer: PacketEncoder<in PacketByteBuf, T>) = this.method_34062<T>(collection, writer)
/**
 * method_52955
 */
fun PacketByteBuf.writeVec3d(vec: Vec3d) = this.method_52955(vec)
/**
 * method_44117
 */
fun PacketByteBuf.readGlobalPos() = this.method_44117()
/**
 * method_52939
 */
fun PacketByteBuf.touch() = this.method_52939()
/**
 * method_34060
 */
fun PacketByteBuf.writeIntList(list: IntList) = this.method_34060(list)
/**
 * method_52992
 */
fun PacketByteBuf.ensureWritable(arg0: Int) = this.method_52992(arg0)
/**
 * method_53000
 */
fun PacketByteBuf.writeMedium(arg0: Int) = this.method_53000(arg0)
/**
 * method_34068
 */
fun <T, C>PacketByteBuf.readCollection(collectionFactory: IntFunction<C>, reader: PacketDecoder<in PacketByteBuf, T>) where C: Collection<T> = this.method_34068<T, C>(collectionFactory, reader)
/**
 * method_52956
 */
fun PacketByteBuf.readBytes(arg0: ByteBuf) = this.method_52956(arg0)
/**
 * method_10817
 */
fun PacketByteBuf.writeEnumConstant(instance: Enum<*>) = this.method_10817(instance)
/**
 * method_10813
 */
fun PacketByteBuf.writeByteArray(array: ByteArray) = this.method_10813(array)
/**
 * method_52944
 */
fun PacketByteBuf.setIndex(arg0: Int, arg1: Int) = this.method_52944(arg0, arg1)
/**
 * method_44113
 */
fun PacketByteBuf.writeGlobalPos(pos: GlobalPos) = this.method_44113(pos)
/**
 * method_52967
 */
fun PacketByteBuf.setLongLE(arg0: Int, arg1: Long) = this.method_52967(arg0, arg1)
/**
 * method_34065
 */
fun PacketByteBuf.forEachInCollection(consumer: Consumer<PacketByteBuf>) = this.method_34065(consumer)
/**
 * method_52985
 */
fun PacketByteBuf.setMedium(arg0: Int, arg1: Int) = this.method_52985(arg0, arg1)
/**
 * method_37435
 */
fun <T>PacketByteBuf.writeOptional(value: Optional<T>, writer: PacketEncoder<in PacketByteBuf, T>) = this.method_37435<T>(value, writer)
/**
 * method_52942
 */
fun PacketByteBuf.setDouble(arg0: Int, arg1: Double) = this.method_52942(arg0, arg1)
/**
 * method_44114
 */
fun PacketByteBuf.writePublicKey(publicKey: PublicKey) = this.method_44114(publicKey)
/**
 * method_49394
 */
fun <T>PacketByteBuf.decodeAsJson(codec: Codec<T>) = this.method_49394<T>(codec)
/**
 * method_34066
 */
fun <T>PacketByteBuf.readList(reader: PacketDecoder<in PacketByteBuf, T>) = this.method_34066<T>(reader)
/**
 * method_52934
 */
fun PacketByteBuf.markWriterIndex() = this.method_52934()
/**
 * method_33558
 */
fun PacketByteBuf.readBitSet() = this.method_33558()
/**
 * method_10810
 */
fun PacketByteBuf.readIdentifier() = this.method_10810()
/**
 * method_10812
 */
fun PacketByteBuf.writeIdentifier(id: Identifier) = this.method_10812(id)
/**
 * method_19772
 */
fun PacketByteBuf.readString() = this.method_19772()
/**
 * method_10792
 */
fun PacketByteBuf.readVarLong() = this.method_10792()
/**
 * method_10787
 */
fun PacketByteBuf.readIntArray() = this.method_10787()
/**
 * method_52935
 */
fun PacketByteBuf.resetWriterIndex() = this.method_52935()
/**
 * method_52987
 */
fun PacketByteBuf.setMediumLE(arg0: Int, arg1: Int) = this.method_52987(arg0, arg1)
/**
 * method_10818
 */
fun <T>PacketByteBuf.readEnumConstant(enumClass: Class<T>) where T: Enum<T> = this.method_10818<T>(enumClass)
/**
 * method_10789
 */
fun PacketByteBuf.writeLongArray(array: LongArray) = this.method_10789(array)
/**
 * method_10804
 */
fun PacketByteBuf.writeVarInt(value: Int) = this.method_10804(value)
/**
 * method_49395
 */
fun <T>PacketByteBuf.encodeAsJson(codec: Codec<T>, value: T) = this.method_49395<T>(codec, value)
/**
 * method_52936
 */
fun PacketByteBuf.discardReadBytes() = this.method_52936()
/**
 * method_10806
 */
fun PacketByteBuf.writeIntArray(array: IntArray) = this.method_10806(array)
/**
 * method_52943
 */
fun PacketByteBuf.setFloat(arg0: Int, arg1: Float) = this.method_52943(arg0, arg1)
/**
 * method_10796
 */
fun PacketByteBuf.writeDate(date: Date) = this.method_10796(date)
/**
 * method_52951
 */
fun PacketByteBuf.setBoolean(arg0: Int, arg1: Boolean) = this.method_52951(arg0, arg1)
/**
 * method_52937
 */
fun PacketByteBuf.discardSomeReadBytes() = this.method_52937()
/**
 * method_49067
 */
fun PacketByteBuf.writeQuaternionf(quaternionf: Quaternionf) = this.method_49067(quaternionf)
/**
 * method_52981
 */
fun PacketByteBuf.setShort(arg0: Int, arg1: Int) = this.method_52981(arg0, arg1)
/**
 * method_52993
 */
fun PacketByteBuf.setChar(arg0: Int, arg1: Int) = this.method_52993(arg0, arg1)
/**
 * method_52941
 */
fun PacketByteBuf.writeFloat(arg0: Float) = this.method_52941(arg0)
/**
 * method_34063
 */
fun <K, V>PacketByteBuf.writeMap(map: Map<K, V>, keyWriter: PacketEncoder<in PacketByteBuf, K>, valueWriter: PacketEncoder<in PacketByteBuf, V>) = this.method_34063<K, V>(map, keyWriter, valueWriter)
/**
 * method_52986
 */
fun PacketByteBuf.capacity(arg0: Int) = this.method_52986(arg0)
/**
 * method_52998
 */
fun PacketByteBuf.writeShort(arg0: Int) = this.method_52998(arg0)
/**
 * method_46253
 */
fun <E>PacketByteBuf.writeEnumSet(enumSet: EnumSet<E>, type: Class<E>) where E: Enum<E> = this.method_46253<E>(enumSet, type)
/**
 * method_52931
 */
fun PacketByteBuf.clear() = this.method_52931()
/**
 * method_49069
 */
fun PacketByteBuf.readVector3f() = this.method_49069()
/**
 * method_53005
 */
fun PacketByteBuf.writeZero(arg0: Int) = this.method_53005(arg0)
/**
 * method_10791
 */
fun PacketByteBuf.writeVarLong(value: Long) = this.method_10791(value)
/**
 * method_52974
 */
fun PacketByteBuf.writeLong(arg0: Long) = this.method_52974(arg0)
/**
 * method_52999
 */
fun PacketByteBuf.writeShortLE(arg0: Int) = this.method_52999(arg0)
/**
 * method_44116
 */
fun PacketByteBuf.writeRegistryKey(key: RegistryKey<*>) = this.method_44116(key)
/**
 * method_52932
 */
fun PacketByteBuf.markReaderIndex() = this.method_52932()
/**
 * method_17814
 */
fun PacketByteBuf.readBlockHitResult() = this.method_17814()
/**
 * method_52964
 */
fun PacketByteBuf.writeBoolean(arg0: Boolean) = this.method_52964(arg0)
/**
 * method_52995
 */
fun PacketByteBuf.setZero(arg0: Int, arg1: Int) = this.method_52995(arg0, arg1)
/**
 * method_46251
 */
fun <E>PacketByteBuf.readEnumSet(type: Class<E>) where E: Enum<E> = this.method_46251<E>(type)
/**
 * method_53006
 */
fun <T>PacketByteBuf.readRegistryRefKey() = this.method_53006<T>()
/**
 * method_52988
 */
fun PacketByteBuf.readerIndex(arg0: Int) = this.method_52988(arg0)
/**
 * method_52933
 */
fun PacketByteBuf.resetReaderIndex() = this.method_52933()
/**
 * method_52984
 */
fun PacketByteBuf.setShortLE(arg0: Int, arg1: Int) = this.method_52984(arg0, arg1)
/**
 * method_44115
 */
fun PacketByteBuf.writeInstant(instant: Instant) = this.method_44115(instant)
