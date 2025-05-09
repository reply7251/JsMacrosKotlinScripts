package me.hellrevenger.generated.Map_StateManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StateManagerKt {
    /**
     * method_30040
     */
    fun <O, S, T>addFieldToMapCodec(mapCodec: MapCodec<S>, defaultStateGetter: Supplier<S>, key: String, property: property_Property<T>) where S: State<O, S>, T: Comparable<T> = StateManager.method_30040<S, T>(mapCodec, defaultStateGetter, key, property)
}