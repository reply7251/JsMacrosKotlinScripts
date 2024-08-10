package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractChunkHolder

val AbstractChunkHolder.UNLOADED_FUTURE by aliasStatic(AbstractChunkHolder::field_51867)
val AbstractChunkHolder.UNLOADED by aliasStatic(AbstractChunkHolder::field_51866)
fun AbstractChunkHolder.enumerateFutures() = this.method_60475()
fun AbstractChunkHolder.getLatest() = this.method_60471()
fun AbstractChunkHolder.incrementRefCount() = this.method_60468()
fun AbstractChunkHolder.getUncheckedOrNull(arg0: ChunkStatus) = this.method_60457(arg0)
fun AbstractChunkHolder.getOrNull(arg0: ChunkStatus) = this.method_60463(arg0)
fun AbstractChunkHolder.decrementRefCount() = this.method_60469()
fun AbstractChunkHolder.replaceWith(arg0: WrapperProtoChunk) = this.method_60456(arg0)
fun AbstractChunkHolder.getCompletedLevel() = this.method_17208()
fun AbstractChunkHolder.getActualStatus() = this.method_60472()
fun AbstractChunkHolder.getLevel() = this.method_14005()
fun AbstractChunkHolder.load(arg0: ChunkStatus, arg1: ServerChunkLoadingManager) = this.method_60458(arg0, arg1)
fun AbstractChunkHolder.getLevelType() = this.method_60474()
fun AbstractChunkHolder.getLatestStatus() = this.method_60476()
