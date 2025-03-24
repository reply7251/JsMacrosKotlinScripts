package me.hellrevenger.generated.Map_PacketByteBuf
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_33287
 */
val KClass<PacketByteBuf>.MAX_READ_NBT_SIZE by aliasStatic(PacketByteBuf::field_33287)
/**
 * field_33283
 */
val KClass<PacketByteBuf>.DEFAULT_MAX_STRING_LENGTH by aliasStatic(PacketByteBuf::field_33283)
/**
 * field_33284
 */
val KClass<PacketByteBuf>.MAX_TEXT_LENGTH by aliasStatic(PacketByteBuf::field_33284)
/**
 * method_52950
 */
fun PacketByteBuf.getBytes(arg0: Int, arg1: ByteBuffer) = this.method_52950(arg0, arg1)
/**
 * method_33557
 */
fun PacketByteBuf.writeBitSet(arg0: BitSet) = this.method_33557(arg0)
/**
 * method_52953
 */
fun PacketByteBuf.getBytes(arg0: Int, arg1: ByteArray, arg2: Int, arg3: Int) = this.method_52953(arg0, arg1, arg2, arg3)
/**
 * method_52968
 */
fun PacketByteBuf.setBytes(arg0: Int, arg1: ByteBuf) = this.method_52968(arg0, arg1)
/**
 * method_52949
 */
fun PacketByteBuf.getBytes(arg0: Int, arg1: OutputStream, arg2: Int) = this.method_52949(arg0, arg1, arg2)
/**
 * method_10807
 */
fun PacketByteBuf.writeBlockPos(arg0: BlockPos) = this.method_10807(arg0)
/**
 * method_52977
 */
fun PacketByteBuf.writeBytes(arg0: ByteBuf, arg1: Int, arg2: Int) = this.method_52977(arg0, arg1, arg2)
/**
 * method_56339
 */
fun KClass<PacketByteBuf>.writeVector3f(arg0: ByteBuf, arg1: Vector3f) = PacketByteBuf.method_56339(arg0, arg1)
/**
 * method_62787
 */
fun KClass<PacketByteBuf>.readSyncId(arg0: ByteBuf) = PacketByteBuf.method_62787(arg0)
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
fun PacketByteBuf.readLongArray(arg0: LongArray, arg1: Int) = this.method_10809(arg0, arg1)
/**
 * method_17813
 */
fun PacketByteBuf.writeBlockHitResult(arg0: BlockHitResult) = this.method_17813(arg0)
/**
 * method_56341
 */
fun KClass<PacketByteBuf>.writeNbt(arg0: ByteBuf, arg1: NbtElement) = PacketByteBuf.method_56341(arg0, arg1)
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
 * method_52952
 */
fun PacketByteBuf.getBytes(arg0: Int, arg1: ByteArray) = this.method_52952(arg0, arg1)
/**
 * method_53001
 */
fun PacketByteBuf.writeMediumLE(arg0: Int) = this.method_53001(arg0)
/**
 * method_49068
 */
fun PacketByteBuf.writeVector3f(arg0: Vector3f) = this.method_49068(arg0)
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
fun <T>PacketByteBuf.readOptional(arg0: PacketDecoder<in PacketByteBuf, T>) = this.method_37436<T>(arg0)
/**
 * method_52991
 */
fun PacketByteBuf.setIntLE(arg0: Int, arg1: Int) = this.method_52991(arg0, arg1)
/**
 * method_52976
 */
fun PacketByteBuf.writeBytes(arg0: ByteBuf, arg1: Int) = this.method_52976(arg0, arg1)
/**
 * method_30616
 */
fun PacketByteBuf.readNbt(arg0: NbtSizeTracker) = this.method_30616(arg0)
/**
 * method_53004
 */
fun PacketByteBuf.writeChar(arg0: Int) = this.method_53004(arg0)
/**
 * method_46252
 */
fun PacketByteBuf.writeBitSet(arg0: BitSet, arg1: Int) = this.method_46252(arg0, arg1)
/**
 * method_34069
 */
fun <K, V, M>PacketByteBuf.readMap(arg0: IntFunction<M>, arg1: PacketDecoder<in PacketByteBuf, K>, arg2: PacketDecoder<in PacketByteBuf, V>) where M: Map<K, V> = this.method_34069<K, V, M>(arg0, arg1, arg2)
/**
 * method_52954
 */
fun <T>PacketByteBuf.decode(arg0: DynamicOps<NbtElement>, arg1: Codec<T>) = this.method_52954<T>(arg0, arg1)
/**
 * method_10802
 */
fun PacketByteBuf.readDate() = this.method_10802()
/**
 * method_36131
 */
fun PacketByteBuf.writeChunkSectionPos(arg0: ChunkSectionPos) = this.method_36131(arg0)
/**
 * method_52962
 */
fun <T>PacketByteBuf.decode(arg0: IntFunction<T>) = this.method_52962<T>(arg0)
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
 * method_10798
 */
fun PacketByteBuf.readNbt() = this.method_10798()
/**
 * method_52997
 */
fun PacketByteBuf.writeByte(arg0: Int) = this.method_52997(arg0)
/**
 * method_56892
 */
fun <T, B>KClass<PacketByteBuf>.writeNullable(arg0: B, arg1: T, arg2: PacketEncoder<in B, T>) where B: ByteBuf = PacketByteBuf.method_56892<T, B>(arg0, arg1, arg2)
/**
 * method_52990
 */
fun PacketByteBuf.writerIndex(arg0: Int) = this.method_52990(arg0)
/**
 * method_64263
 */
fun KClass<PacketByteBuf>.writeChunkPos(arg0: ByteBuf, arg1: ChunkPos) = PacketByteBuf.method_64263(arg0, arg1)
/**
 * method_34059
 */
fun PacketByteBuf.readIntList() = this.method_34059()
/**
 * method_52989
 */
fun PacketByteBuf.setInt(arg0: Int, arg1: Int) = this.method_52989(arg0, arg1)
/**
 * method_56343
 */
fun KClass<PacketByteBuf>.readQuaternionf(arg0: ByteBuf) = PacketByteBuf.method_56343(arg0)
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
fun PacketByteBuf.writeString(arg0: String, arg1: Int) = this.method_10788(arg0, arg1)
/**
 * method_10795
 */
fun PacketByteBuf.readByteArray() = this.method_10795()
/**
 * method_44112
 */
fun <T>PacketByteBuf.readRegistryKey(arg0: RegistryKey<out Registry<T>>) = this.method_44112<T>(arg0)
/**
 * method_52966
 */
fun PacketByteBuf.setByte(arg0: Int, arg1: Int) = this.method_52966(arg0, arg1)
/**
 * method_52970
 */
fun PacketByteBuf.setBytes(arg0: Int, arg1: ByteBuf, arg2: Int, arg3: Int) = this.method_52970(arg0, arg1, arg2, arg3)
/**
 * method_52972
 */
fun PacketByteBuf.setBytes(arg0: Int, arg1: ByteArray) = this.method_52972(arg0, arg1)
/**
 * method_29172
 */
fun <T>PacketByteBuf.encode(arg0: DynamicOps<NbtElement>, arg1: Codec<T>, arg2: T) = this.method_29172<T>(arg0, arg1, arg2)
/**
 * method_34062
 */
fun <T>PacketByteBuf.writeCollection(arg0: Collection<T>, arg1: PacketEncoder<in PacketByteBuf, T>) = this.method_34062<T>(arg0, arg1)
/**
 * method_56337
 */
fun KClass<PacketByteBuf>.writeUuid(arg0: ByteBuf, arg1: UUID) = PacketByteBuf.method_56337(arg0, arg1)
/**
 * method_52980
 */
fun PacketByteBuf.writeBytes(arg0: ByteArray, arg1: Int, arg2: Int) = this.method_52980(arg0, arg1, arg2)
/**
 * method_52955
 */
fun PacketByteBuf.writeVec3d(arg0: Vec3d) = this.method_52955(arg0)
/**
 * method_44117
 */
fun PacketByteBuf.readGlobalPos() = this.method_44117()
/**
 * method_56344
 */
fun KClass<PacketByteBuf>.readUuid(arg0: ByteBuf) = PacketByteBuf.method_56344(arg0)
/**
 * method_56345
 */
fun KClass<PacketByteBuf>.readNbt(arg0: ByteBuf) = PacketByteBuf.method_56345(arg0)
/**
 * method_52939
 */
fun PacketByteBuf.touch() = this.method_52939()
/**
 * method_34060
 */
fun PacketByteBuf.writeIntList(arg0: IntList) = this.method_34060(arg0)
/**
 * method_52992
 */
fun PacketByteBuf.ensureWritable(arg0: Int) = this.method_52992(arg0)
/**
 * method_56336
 */
fun KClass<PacketByteBuf>.writeBlockPos(arg0: ByteBuf, arg1: BlockPos) = PacketByteBuf.method_56336(arg0, arg1)
/**
 * method_53000
 */
fun PacketByteBuf.writeMedium(arg0: Int) = this.method_53000(arg0)
/**
 * method_34068
 */
fun <T, C>PacketByteBuf.readCollection(arg0: IntFunction<C>, arg1: PacketDecoder<in PacketByteBuf, T>) where C: Collection<T> = this.method_34068<T, C>(arg0, arg1)
/**
 * method_62783
 */
fun KClass<PacketByteBuf>.writeVec3d(arg0: ByteBuf, arg1: Vec3d) = PacketByteBuf.method_62783(arg0, arg1)
/**
 * method_10790
 */
fun PacketByteBuf.readUuid() = this.method_10790()
/**
 * method_52956
 */
fun PacketByteBuf.readBytes(arg0: ByteBuf) = this.method_52956(arg0)
/**
 * method_52948
 */
fun PacketByteBuf.getBytes(arg0: Int, arg1: ByteBuf, arg2: Int, arg3: Int) = this.method_52948(arg0, arg1, arg2, arg3)
/**
 * method_10814
 */
fun PacketByteBuf.writeString(arg0: String) = this.method_10814(arg0)
/**
 * method_10817
 */
fun PacketByteBuf.writeEnumConstant(arg0: Enum<*>) = this.method_10817(arg0)
/**
 * method_10813
 */
fun PacketByteBuf.writeByteArray(arg0: ByteArray) = this.method_10813(arg0)
/**
 * method_52944
 */
fun PacketByteBuf.setIndex(arg0: Int, arg1: Int) = this.method_52944(arg0, arg1)
/**
 * method_52979
 */
fun PacketByteBuf.readBytes(arg0: ByteArray) = this.method_52979(arg0)
/**
 * method_56893
 */
fun <T, B>KClass<PacketByteBuf>.readNullable(arg0: B, arg1: PacketDecoder<in B, T>) where B: ByteBuf = PacketByteBuf.method_56893<T, B>(arg0, arg1)
/**
 * method_44113
 */
fun PacketByteBuf.writeGlobalPos(arg0: GlobalPos) = this.method_44113(arg0)
/**
 * method_52967
 */
fun PacketByteBuf.setLongLE(arg0: Int, arg1: Long) = this.method_52967(arg0, arg1)
/**
 * method_62785
 */
fun KClass<PacketByteBuf>.readVec3d(arg0: ByteBuf) = PacketByteBuf.method_62785(arg0)
/**
 * method_52947
 */
fun PacketByteBuf.getBytes(arg0: Int, arg1: ByteBuf, arg2: Int) = this.method_52947(arg0, arg1, arg2)
/**
 * method_34065
 */
fun PacketByteBuf.forEachInCollection(arg0: Consumer<PacketByteBuf>) = this.method_34065(arg0)
/**
 * method_52996
 */
fun PacketByteBuf.readVec3d() = this.method_52996()
/**
 * method_37453
 */
fun <T>KClass<PacketByteBuf>.getMaxValidator(arg0: IntFunction<T>, arg1: Int) = PacketByteBuf.method_37453<T>(arg0, arg1)
/**
 * method_52985
 */
fun PacketByteBuf.setMedium(arg0: Int, arg1: Int) = this.method_52985(arg0, arg1)
/**
 * method_37435
 */
fun <T>PacketByteBuf.writeOptional(arg0: Optional<T>, arg1: PacketEncoder<in PacketByteBuf, T>) = this.method_37435<T>(arg0, arg1)
/**
 * method_52942
 */
fun PacketByteBuf.setDouble(arg0: Int, arg1: Double) = this.method_52942(arg0, arg1)
/**
 * method_44114
 */
fun PacketByteBuf.writePublicKey(arg0: PublicKey) = this.method_44114(arg0)
/**
 * method_49394
 */
fun <T>PacketByteBuf.decodeAsJson(arg0: Codec<T>) = this.method_49394<T>(arg0)
/**
 * method_34066
 */
fun <T>PacketByteBuf.readList(arg0: PacketDecoder<in PacketByteBuf, T>) = this.method_34066<T>(arg0)
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
fun PacketByteBuf.writeIdentifier(arg0: Identifier) = this.method_10812(arg0)
/**
 * method_19772
 */
fun PacketByteBuf.readString() = this.method_19772()
/**
 * method_56890
 */
fun KClass<PacketByteBuf>.readByteArray(arg0: ByteBuf) = PacketByteBuf.method_56890(arg0)
/**
 * method_10792
 */
fun PacketByteBuf.readVarLong() = this.method_10792()
/**
 * method_43827
 */
fun <T>PacketByteBuf.readNullable(arg0: PacketDecoder<in PacketByteBuf, T>) = this.method_43827<T>(arg0)
/**
 * method_10787
 */
fun PacketByteBuf.readIntArray() = this.method_10787()
/**
 * method_52957
 */
fun PacketByteBuf.readBytes(arg0: ByteBuf, arg1: Int) = this.method_52957(arg0, arg1)
/**
 * method_56894
 */
fun KClass<PacketByteBuf>.writeByteArray(arg0: ByteBuf, arg1: ByteArray) = PacketByteBuf.method_56894(arg0, arg1)
/**
 * method_52935
 */
fun PacketByteBuf.resetWriterIndex() = this.method_52935()
/**
 * method_36130
 */
fun PacketByteBuf.writeChunkPos(arg0: ChunkPos) = this.method_36130(arg0)
/**
 * method_64264
 */
fun KClass<PacketByteBuf>.readChunkPos(arg0: ByteBuf) = PacketByteBuf.method_64264(arg0)
/**
 * method_52969
 */
fun PacketByteBuf.setBytes(arg0: Int, arg1: ByteBuf, arg2: Int) = this.method_52969(arg0, arg1, arg2)
/**
 * method_36133
 */
fun PacketByteBuf.readChunkPos() = this.method_36133()
/**
 * method_52961
 */
fun PacketByteBuf.readBytes(arg0: ByteBuffer) = this.method_52961(arg0)
/**
 * method_46254
 */
fun PacketByteBuf.readBitSet(arg0: Int) = this.method_46254(arg0)
/**
 * method_52987
 */
fun PacketByteBuf.setMediumLE(arg0: Int, arg1: Int) = this.method_52987(arg0, arg1)
/**
 * method_10818
 */
fun <T>PacketByteBuf.readEnumConstant(arg0: Class<T>) where T: Enum<T> = this.method_10818<T>(arg0)
/**
 * method_52965
 */
fun PacketByteBuf.readBytes(arg0: ByteArray, arg1: Int, arg2: Int) = this.method_52965(arg0, arg1, arg2)
/**
 * method_56340
 */
fun KClass<PacketByteBuf>.readNbt(arg0: ByteBuf, arg1: NbtSizeTracker) = PacketByteBuf.method_56340(arg0, arg1)
/**
 * method_10789
 */
fun PacketByteBuf.writeLongArray(arg0: LongArray) = this.method_10789(arg0)
/**
 * method_10804
 */
fun PacketByteBuf.writeVarInt(arg0: Int) = this.method_10804(arg0)
/**
 * method_29171
 */
fun <T>PacketByteBuf.decode(arg0: DynamicOps<NbtElement>, arg1: Codec<T>, arg2: NbtSizeTracker) = this.method_29171<T>(arg0, arg1, arg2)
/**
 * method_49395
 */
fun <T>PacketByteBuf.encodeAsJson(arg0: Codec<T>, arg1: T) = this.method_49395<T>(arg0, arg1)
/**
 * method_52936
 */
fun PacketByteBuf.discardReadBytes() = this.method_52936()
/**
 * method_10806
 */
fun PacketByteBuf.writeIntArray(arg0: IntArray) = this.method_10806(arg0)
/**
 * method_52943
 */
fun PacketByteBuf.setFloat(arg0: Int, arg1: Float) = this.method_52943(arg0, arg1)
/**
 * method_10796
 */
fun PacketByteBuf.writeDate(arg0: Date) = this.method_10796(arg0)
/**
 * method_10801
 */
fun PacketByteBuf.readLongArray(arg0: LongArray) = this.method_10801(arg0)
/**
 * method_62784
 */
fun KClass<PacketByteBuf>.writeSyncId(arg0: ByteBuf, arg1: Int) = PacketByteBuf.method_62784(arg0, arg1)
/**
 * method_52951
 */
fun PacketByteBuf.setBoolean(arg0: Int, arg1: Boolean) = this.method_52951(arg0, arg1)
/**
 * method_52937
 */
fun PacketByteBuf.discardSomeReadBytes() = this.method_52937()
/**
 * method_52975
 */
fun PacketByteBuf.writeBytes(arg0: ByteBuf) = this.method_52975(arg0)
/**
 * method_52973
 */
fun PacketByteBuf.setBytes(arg0: Int, arg1: ByteArray, arg2: Int, arg3: Int) = this.method_52973(arg0, arg1, arg2, arg3)
/**
 * method_49067
 */
fun PacketByteBuf.writeQuaternionf(arg0: Quaternionf) = this.method_49067(arg0)
/**
 * method_10794
 */
fun PacketByteBuf.writeNbt(arg0: NbtElement) = this.method_10794(arg0)
/**
 * method_52981
 */
fun PacketByteBuf.setShort(arg0: Int, arg1: Int) = this.method_52981(arg0, arg1)
/**
 * method_52993
 */
fun PacketByteBuf.setChar(arg0: Int, arg1: Int) = this.method_52993(arg0, arg1)
/**
 * method_62788
 */
fun PacketByteBuf.readSyncId() = this.method_62788()
/**
 * method_52941
 */
fun PacketByteBuf.writeFloat(arg0: Float) = this.method_52941(arg0)
/**
 * method_34063
 */
fun <K, V>PacketByteBuf.writeMap(arg0: Map<K, V>, arg1: PacketEncoder<in PacketByteBuf, K>, arg2: PacketEncoder<in PacketByteBuf, V>) = this.method_34063<K, V>(arg0, arg1, arg2)
/**
 * method_52986
 */
fun PacketByteBuf.capacity(arg0: Int) = this.method_52986(arg0)
/**
 * method_52960
 */
fun PacketByteBuf.touch(arg0: Object) = this.method_52960(arg0)
/**
 * method_52998
 */
fun PacketByteBuf.writeShort(arg0: Int) = this.method_52998(arg0)
/**
 * method_10797
 */
fun PacketByteBuf.writeUuid(arg0: UUID) = this.method_10797(arg0)
/**
 * method_46253
 */
fun <E>PacketByteBuf.writeEnumSet(arg0: EnumSet<E>, arg1: Class<E>) where E: Enum<E> = this.method_46253<E>(arg0, arg1)
/**
 * method_52931
 */
fun PacketByteBuf.clear() = this.method_52931()
/**
 * method_49069
 */
fun PacketByteBuf.readVector3f() = this.method_49069()
/**
 * method_10799
 */
fun PacketByteBuf.readIntArray(arg0: Int) = this.method_10799(arg0)
/**
 * method_10800
 */
fun PacketByteBuf.readString(arg0: Int) = this.method_10800(arg0)
/**
 * method_53005
 */
fun PacketByteBuf.writeZero(arg0: Int) = this.method_53005(arg0)
/**
 * method_34067
 */
fun <K, V>PacketByteBuf.readMap(arg0: PacketDecoder<in PacketByteBuf, K>, arg1: PacketDecoder<in PacketByteBuf, V>) = this.method_34067<K, V>(arg0, arg1)
/**
 * method_10791
 */
fun PacketByteBuf.writeVarLong(arg0: Long) = this.method_10791(arg0)
/**
 * method_33134
 */
fun PacketByteBuf.readLongArray() = this.method_33134()
/**
 * method_52974
 */
fun PacketByteBuf.writeLong(arg0: Long) = this.method_52974(arg0)
/**
 * method_52999
 */
fun PacketByteBuf.writeShortLE(arg0: Int) = this.method_52999(arg0)
/**
 * method_52963
 */
fun <T>PacketByteBuf.encode(arg0: ToIntFunction<T>, arg1: T) = this.method_52963<T>(arg0, arg1)
/**
 * method_44116
 */
fun PacketByteBuf.writeRegistryKey(arg0: RegistryKey<*>) = this.method_44116(arg0)
/**
 * method_52932
 */
fun PacketByteBuf.markReaderIndex() = this.method_52932()
/**
 * method_52946
 */
fun PacketByteBuf.getBytes(arg0: Int, arg1: ByteBuf) = this.method_52946(arg0, arg1)
/**
 * method_52959
 */
fun PacketByteBuf.readBytes(arg0: OutputStream, arg1: Int) = this.method_52959(arg0, arg1)
/**
 * method_56335
 */
fun KClass<PacketByteBuf>.readBlockPos(arg0: ByteBuf) = PacketByteBuf.method_56335(arg0)
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
fun <E>PacketByteBuf.readEnumSet(arg0: Class<E>) where E: Enum<E> = this.method_46251<E>(arg0)
/**
 * method_43826
 */
fun <T>PacketByteBuf.writeNullable(arg0: T, arg1: PacketEncoder<in PacketByteBuf, T>) = this.method_43826<T>(arg0, arg1)
/**
 * method_62786
 */
fun PacketByteBuf.writeSyncId(arg0: Int) = this.method_62786(arg0)
/**
 * method_53006
 */
fun <T>PacketByteBuf.readRegistryRefKey() = this.method_53006<T>()
/**
 * method_52988
 */
fun PacketByteBuf.readerIndex(arg0: Int) = this.method_52988(arg0)
/**
 * method_52978
 */
fun PacketByteBuf.writeBytes(arg0: ByteBuffer) = this.method_52978(arg0)
/**
 * method_56891
 */
fun KClass<PacketByteBuf>.readByteArray(arg0: ByteBuf, arg1: Int) = PacketByteBuf.method_56891(arg0, arg1)
/**
 * method_56338
 */
fun KClass<PacketByteBuf>.writeQuaternionf(arg0: ByteBuf, arg1: Quaternionf) = PacketByteBuf.method_56338(arg0, arg1)
/**
 * method_52933
 */
fun PacketByteBuf.resetReaderIndex() = this.method_52933()
/**
 * method_52983
 */
fun PacketByteBuf.writeBytes(arg0: ByteArray) = this.method_52983(arg0)
/**
 * method_10811
 */
fun PacketByteBuf.readBlockPos() = this.method_10811()
/**
 * method_10803
 */
fun PacketByteBuf.readByteArray(arg0: Int) = this.method_10803(arg0)
/**
 * method_52984
 */
fun PacketByteBuf.setShortLE(arg0: Int, arg1: Int) = this.method_52984(arg0, arg1)
/**
 * method_53007
 */
fun PacketByteBuf.retain(arg0: Int) = this.method_53007(arg0)
/**
 * method_52971
 */
fun PacketByteBuf.setBytes(arg0: Int, arg1: ByteBuffer) = this.method_52971(arg0, arg1)
/**
 * method_52958
 */
fun PacketByteBuf.readBytes(arg0: ByteBuf, arg1: Int, arg2: Int) = this.method_52958(arg0, arg1, arg2)
/**
 * method_56342
 */
fun KClass<PacketByteBuf>.readVector3f(arg0: ByteBuf) = PacketByteBuf.method_56342(arg0)
/**
 * method_44115
 */
fun PacketByteBuf.writeInstant(arg0: Instant) = this.method_44115(arg0)
