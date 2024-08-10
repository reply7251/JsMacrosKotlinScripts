package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockBufferBuilderPool

fun BlockBufferBuilderPool.hasNoAvailableBuilder() = this.method_54645()
fun KClass<BlockBufferBuilderPool>.allocate(arg0: Int) = BlockBufferBuilderPool.method_54643(arg0)
fun BlockBufferBuilderPool.release(arg0: BlockBufferAllocatorStorage) = this.method_54644(arg0)
fun BlockBufferBuilderPool.acquire() = this.method_54642()
