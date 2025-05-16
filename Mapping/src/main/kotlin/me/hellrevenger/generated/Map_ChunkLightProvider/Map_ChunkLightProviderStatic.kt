package me.hellrevenger.generated.Map_ChunkLightProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ChunkLightProviderKt {
    /**
     * method_51562
     */
    fun <M, S>getOpaqueShape(state: BlockState?, direction: Direction?) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = ChunkLightProvider.method_51562(state, direction)
    /**
     * method_20049
     */
    fun <M, S>getRealisticOpacity(state1: BlockState?, state2: BlockState?, direction: Direction?, opacity2: Int) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = ChunkLightProvider.method_20049(state1, state2, direction, opacity2)
    /**
     * method_51561
     */
    fun <M, S>needsLightUpdate(oldState: BlockState?, newState: BlockState?) where M: ChunkToNibbleArrayMap<M>, S: LightStorage<M> = ChunkLightProvider.method_51561(oldState, newState)
}