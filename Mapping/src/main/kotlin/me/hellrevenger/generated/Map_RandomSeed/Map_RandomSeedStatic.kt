package me.hellrevenger.generated.Map_RandomSeed
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RandomSeedKt {
    /**
     * field_35133
     */
    val GOLDEN_RATIO_64 by aliasStatic(RandomSeed::field_35133)
    /**
     * field_35134
     */
    val SILVER_RATIO_64 by aliasStatic(RandomSeed::field_35134)
    /**
     * method_52180
     */
    fun createXoroshiroSeed(seed: String) = RandomSeed.method_52180(seed)
    /**
     * method_39001
     */
    fun getSeed() = RandomSeed.method_39001()
    /**
     * method_39003
     */
    fun createXoroshiroSeed(seed: Long) = RandomSeed.method_39003(seed)
    /**
     * method_52211
     */
    fun createUnmixedXoroshiroSeed(seed: Long) = RandomSeed.method_52211(seed)
    /**
     * method_39002
     */
    fun mixStafford13(seed: Long) = RandomSeed.method_39002(seed)
}