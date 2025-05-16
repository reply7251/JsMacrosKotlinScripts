package me.hellrevenger.generated.Map_NbtIo
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NbtIoKt {
    /**
     * method_30614
     */
    fun writeCompressed(nbt: NbtCompound?, path: file_Path?) = NbtIo.method_30614(nbt, path)
    /**
     * method_39855
     */
    fun scan(input: DataInput?, scanner: NbtScanner?, tracker: NbtSizeTracker?) = NbtIo.method_39855(input, scanner, tracker)
    /**
     * method_52893
     */
    fun writeForPacket(nbt: NbtElement?, output: io_DataOutput?) = NbtIo.method_52893(nbt, output)
    /**
     * method_10629
     */
    fun readCompressed(stream: InputStream?, tagSizeTracker: NbtSizeTracker?) = NbtIo.method_10629(stream, tagSizeTracker)
    /**
     * method_52894
     */
    fun read(input: DataInput?, tracker: NbtSizeTracker?) = NbtIo.method_52894(input, tracker)
    /**
     * method_10634
     */
    fun writeCompressed(nbt: NbtCompound?, stream: OutputStream?) = NbtIo.method_10634(nbt, stream)
    /**
     * method_10631
     */
    fun writeUnsafe(nbt: NbtElement?, output: io_DataOutput?) = NbtIo.method_10631(nbt, output)
    /**
     * method_40058
     */
    fun scanCompressed(stream: InputStream?, scanner: NbtScanner?, tracker: NbtSizeTracker?) = NbtIo.method_40058(stream, scanner, tracker)
    /**
     * method_30613
     */
    fun readCompressed(path: file_Path?, tagSizeTracker: NbtSizeTracker?) = NbtIo.method_30613(path, tagSizeTracker)
    /**
     * method_40057
     */
    fun scanCompressed(path: file_Path?, scanner: NbtScanner?, tracker: NbtSizeTracker?) = NbtIo.method_40057(path, scanner, tracker)
    /**
     * method_10628
     */
    fun writeCompound(nbt: NbtCompound?, output: io_DataOutput?) = NbtIo.method_10628(nbt, output)
    /**
     * method_10633
     */
    fun read(path: file_Path?) = NbtIo.method_10633(path)
    /**
     * method_10625
     */
    fun readCompound(input: DataInput?, tracker: NbtSizeTracker?) = NbtIo.method_10625(input, tracker)
    /**
     * method_55324
     */
    fun write(nbt: NbtElement?, output: io_DataOutput?) = NbtIo.method_55324(nbt, output)
    /**
     * method_10627
     */
    fun readCompound(input: DataInput?) = NbtIo.method_10627(input)
    /**
     * method_10630
     */
    fun write(nbt: NbtCompound?, path: file_Path?) = NbtIo.method_10630(nbt, path)
}