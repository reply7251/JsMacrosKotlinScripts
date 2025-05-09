package me.hellrevenger.generated.Map_collection_Pool
import kotlin.reflect.*
import me.hellrevenger.generated.*
object collection_PoolKt {
    /**
     * method_34991
     */
    fun <E>createCodec(entryCodec: Codec<E>) where E: Weighted = collection_Pool.method_34991<E>(entryCodec)
    /**
     * method_34988
     */
    fun <E>of(entries: MutableList<E>) where E: Weighted = collection_Pool.method_34988<E>(entries)
    /**
     * method_34990
     */
    fun <E>empty() where E: Weighted = collection_Pool.method_34990<E>()
    /**
     * method_34989
     */
    fun <E>of(entries: Array<E>) where E: Weighted = collection_Pool.method_34989<E>(*entries)
}