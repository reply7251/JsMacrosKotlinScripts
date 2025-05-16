package me.hellrevenger.generated.Map_PacketByteBuf
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PacketByteBufKt {
    /**
     * field_33287
     */
    val MAX_READ_NBT_SIZE by aliasStatic(PacketByteBuf::field_33287)
    /**
     * field_33283
     */
    val DEFAULT_MAX_STRING_LENGTH by aliasStatic(PacketByteBuf::field_33283)
    /**
     * field_33284
     */
    val MAX_TEXT_LENGTH by aliasStatic(PacketByteBuf::field_33284)
    /**
     * method_56339
     */
    fun writeVector3f(buf: ByteBuf?, vector: Vector3f?) = PacketByteBuf.method_56339(buf, vector)
    /**
     * method_62787
     */
    fun readSyncId(buf: ByteBuf?) = PacketByteBuf.method_62787(buf)
    /**
     * method_56341
     */
    fun writeNbt(buf: ByteBuf?, nbt: NbtElement?) = PacketByteBuf.method_56341(buf, nbt)
    /**
     * method_56892
     */
    fun <T, B>writeNullable(buf: B, value: T, writer: PacketEncoder<in B, T>?) where B: ByteBuf = PacketByteBuf.method_56892<T, B>(buf, value, writer)
    /**
     * method_64263
     */
    fun writeChunkPos(buf: ByteBuf?, pos: ChunkPos?) = PacketByteBuf.method_64263(buf, pos)
    /**
     * method_56343
     */
    fun readQuaternionf(buf: ByteBuf?) = PacketByteBuf.method_56343(buf)
    /**
     * method_56337
     */
    fun writeUuid(buf: ByteBuf?, uuid: UUID?) = PacketByteBuf.method_56337(buf, uuid)
    /**
     * method_56344
     */
    fun readUuid(buf: ByteBuf?) = PacketByteBuf.method_56344(buf)
    /**
     * method_56345
     */
    fun readNbt(buf: ByteBuf?) = PacketByteBuf.method_56345(buf)
    /**
     * method_56336
     */
    fun writeBlockPos(buf: ByteBuf?, pos: BlockPos?) = PacketByteBuf.method_56336(buf, pos)
    /**
     * method_62783
     */
    fun writeVec3d(buf: ByteBuf?, vec: Vec3d?) = PacketByteBuf.method_62783(buf, vec)
    /**
     * method_56893
     */
    fun <T, B>readNullable(buf: B, reader: PacketDecoder<in B, T>?) where B: ByteBuf = PacketByteBuf.method_56893<T, B>(buf, reader)
    /**
     * method_62785
     */
    fun readVec3d(buf: ByteBuf?) = PacketByteBuf.method_62785(buf)
    /**
     * method_37453
     */
    fun <T>getMaxValidator(applier: IntFunction<T>?, max: Int) = PacketByteBuf.method_37453<T>(applier, max)
    /**
     * method_56890
     */
    fun readByteArray(buf: ByteBuf?) = PacketByteBuf.method_56890(buf)
    /**
     * method_56894
     */
    fun writeByteArray(buf: ByteBuf?, array: ByteArray?) = PacketByteBuf.method_56894(buf, array)
    /**
     * method_64264
     */
    fun readChunkPos(buf: ByteBuf?) = PacketByteBuf.method_64264(buf)
    /**
     * method_56340
     */
    fun readNbt(buf: ByteBuf?, sizeTracker: NbtSizeTracker?) = PacketByteBuf.method_56340(buf, sizeTracker)
    /**
     * method_62784
     */
    fun writeSyncId(buf: ByteBuf?, syncId: Int) = PacketByteBuf.method_62784(buf, syncId)
    /**
     * method_56335
     */
    fun readBlockPos(buf: ByteBuf?) = PacketByteBuf.method_56335(buf)
    /**
     * method_56891
     */
    fun readByteArray(buf: ByteBuf?, maxSize: Int) = PacketByteBuf.method_56891(buf, maxSize)
    /**
     * method_56338
     */
    fun writeQuaternionf(buf: ByteBuf?, quaternion: Quaternionf?) = PacketByteBuf.method_56338(buf, quaternion)
    /**
     * method_56342
     */
    fun readVector3f(buf: ByteBuf?) = PacketByteBuf.method_56342(buf)
}