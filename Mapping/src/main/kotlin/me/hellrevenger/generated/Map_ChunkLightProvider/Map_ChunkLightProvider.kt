package me.hellrevenger.generated.Map_ChunkLightProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <M, S>KClass<ChunkLightProvider<M, S>>.getOpaqueShape(arg0: BlockView, arg1: BlockPos, arg2: BlockState, arg3: Direction) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = ChunkLightProvider.method_51562(arg0, arg1, arg2, arg3)
fun <M, S>ChunkLightProvider<M, S>.getStatus(arg0: Long) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = this.method_51568(arg0)
fun <M, S>ChunkLightProvider<M, S>.setRetainColumn(arg0: ChunkPos, arg1: Boolean) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = this.method_20599(arg0, arg1)
fun <M, S>ChunkLightProvider<M, S>.enqueueSectionData(arg0: Long, arg1: ChunkNibbleArray) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = this.method_15515(arg0, arg1)
fun <M, S>KClass<ChunkLightProvider<M, S>>.needsLightUpdate(arg0: BlockView, arg1: BlockPos, arg2: BlockState, arg3: BlockState) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = ChunkLightProvider.method_51561(arg0, arg1, arg2, arg3)
fun <M, S>ChunkLightProvider<M, S>.displaySectionLevel(arg0: Long) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = this.method_22875(arg0)
fun <M, S>KClass<ChunkLightProvider<M, S>>.getRealisticOpacity(arg0: BlockView, arg1: BlockState, arg2: BlockPos, arg3: BlockState, arg4: BlockPos, arg5: Direction, arg6: Int) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = ChunkLightProvider.method_20049(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
