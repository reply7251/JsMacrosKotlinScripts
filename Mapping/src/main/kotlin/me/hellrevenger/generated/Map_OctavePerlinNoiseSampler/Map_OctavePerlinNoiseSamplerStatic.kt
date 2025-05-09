package me.hellrevenger.generated.Map_OctavePerlinNoiseSampler
import kotlin.reflect.*
import me.hellrevenger.generated.*
object OctavePerlinNoiseSamplerKt {
    /**
     * method_16452
     */
    fun maintainPrecision(value: Double) = OctavePerlinNoiseSampler.method_16452(value)
    /**
     * method_39127
     */
    fun create(random: Random, octaves: MutableList<Int>) = OctavePerlinNoiseSampler.method_39127(random, octaves)
    /**
     * method_30847
     */
    fun create(random: Random, offset: Int, amplitudes: DoubleList) = OctavePerlinNoiseSampler.method_30847(random, offset, amplitudes)
    /**
     * method_35480
     */
    fun create(random: Random, offset: Int, firstAmplitude: Double, arg3: DoubleArray) = OctavePerlinNoiseSampler.method_35480(random, offset, firstAmplitude, *arg3)
    /**
     * method_39128
     */
    fun create(random: Random, octaves: IntStream) = OctavePerlinNoiseSampler.method_39128(random, octaves)
    /**
     * method_39126
     */
    fun createLegacy(random: Random, offset: Int, amplitudes: DoubleList) = OctavePerlinNoiseSampler.method_39126(random, offset, amplitudes)
    /**
     * method_39187
     */
    fun createLegacy(random: Random, octaves: IntStream) = OctavePerlinNoiseSampler.method_39187(random, octaves)
}