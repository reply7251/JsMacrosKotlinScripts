package me.hellrevenger.generated.Map_ChunkHolder
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ChunkHolder>.UNLOADED_WORLD_CHUNK by aliasStatic(ChunkHolder::field_16427)
fun ChunkHolder.flushUpdates(arg0: WorldChunk) = this.method_14006(arg0)
fun ChunkHolder.combinePostProcessingFuture(arg0: CompletableFuture<*>) = this.method_53680(arg0)
fun ChunkHolder.getTickingFuture() = this.method_16145()
fun ChunkHolder.markForBlockUpdate(arg0: BlockPos) = this.method_14002(arg0)
fun ChunkHolder.getWorldChunk() = this.method_16144()
fun ChunkHolder.getPostProcessedChunk() = this.method_53682()
fun ChunkHolder.getSavingFuture() = this.method_14000()
fun ChunkHolder.getPostProcessingFuture() = this.method_53681()
fun ChunkHolder.markForLightUpdate(arg0: LightType, arg1: Int) = this.method_14012(arg0, arg1)
fun ChunkHolder.updateAccessibleStatus() = this.method_20385()
fun ChunkHolder.isSavable() = this.method_60436()
fun ChunkHolder.setLevel(arg0: Int) = this.method_15890(arg0)
fun ChunkHolder.getEntityTickingFuture() = this.method_14003()
fun ChunkHolder.isAccessible() = this.method_20384()
fun ChunkHolder.getAccessibleFuture() = this.method_20725()
