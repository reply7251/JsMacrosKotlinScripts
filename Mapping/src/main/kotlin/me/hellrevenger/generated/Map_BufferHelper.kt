package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BufferHelper

val BufferHelper.HEX_CHARS_LOOKUP by aliasStatic(BufferHelper::field_14398)
fun KClass<BufferHelper>.getIntLE(arg0: ByteArray, arg1: Int, arg2: Int) = BufferHelper.method_14696(arg0, arg1, arg2)
fun KClass<BufferHelper>.getIntBE(arg0: ByteArray, arg1: Int, arg2: Int) = BufferHelper.method_14698(arg0, arg1, arg2)
fun KClass<BufferHelper>.getString(arg0: ByteArray, arg1: Int, arg2: Int) = BufferHelper.method_14697(arg0, arg1, arg2)
fun KClass<BufferHelper>.getIntLE(arg0: ByteArray, arg1: Int) = BufferHelper.method_14695(arg0, arg1)
fun KClass<BufferHelper>.toHex(arg0: Byte) = BufferHelper.method_14699(arg0)
