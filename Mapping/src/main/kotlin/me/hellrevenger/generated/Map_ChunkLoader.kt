package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkLoader

val ChunkLoader.targetStatus by alias(ChunkLoader::field_51850)
fun ChunkLoader.markPendingDisposal() = this.method_60429()
fun ChunkLoader.run() = this.method_60424()
fun KClass<ChunkLoader>.create(arg0: ChunkLoadingManager, arg1: ChunkStatus, arg2: ChunkPos) = ChunkLoader.method_60426(arg0, arg1, arg2)
fun ChunkLoader.getHolder() = this.method_60431()
