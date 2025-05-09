package me.hellrevenger.generated.Map_BufferHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BufferHelperKt {
    /**
     * field_14398
     */
    val HEX_CHARS_LOOKUP by aliasStatic(BufferHelper::field_14398)
    /**
     * method_14696
     */
    fun getIntLE(buf: ByteArray, start: Int, limit: Int) = BufferHelper.method_14696(buf, start, limit)
    /**
     * method_14698
     */
    fun getIntBE(buf: ByteArray, start: Int, limit: Int) = BufferHelper.method_14698(buf, start, limit)
    /**
     * method_14697
     */
    fun getString(buf: ByteArray, arg1: Int, arg2: Int) = BufferHelper.method_14697(buf, arg1, arg2)
    /**
     * method_14695
     */
    fun getIntLE(buf: ByteArray, start: Int) = BufferHelper.method_14695(buf, start)
    /**
     * method_14699
     */
    fun toHex(b: Byte) = BufferHelper.method_14699(b)
}