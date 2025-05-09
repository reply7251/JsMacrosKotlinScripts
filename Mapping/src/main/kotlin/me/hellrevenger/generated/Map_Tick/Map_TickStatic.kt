package me.hellrevenger.generated.Map_Tick
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TickKt {
    /**
     * field_35542
     */
    val HASH_STRATEGY by aliasStatic({Tick.field_35542})
    /**
     * method_39402
     */
    fun <T>create(type: T, pos: BlockPos) = Tick.method_39402<T>(type, pos)
    /**
     * method_39406
     */
    fun <T>tick(tickList: NbtList, nameToTypeFunction: function_Function<String, Optional<T>>, pos: ChunkPos) = Tick.method_39406<T>(tickList, nameToTypeFunction, pos)
    /**
     * method_40559
     */
    fun <T>fromNbt(nbt: NbtCompound, nameToType: function_Function<String, Optional<T>>) = Tick.method_40559<T>(nbt, nameToType)
}