package me.hellrevenger.generated.Map_MultiNoiseUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MultiNoiseUtilKt {
    /**
     * method_38116
     */
    fun createNoiseValuePoint(temperatureNoise: Float, humidityNoise: Float, continentalnessNoise: Float, erosionNoise: Float, depth: Float, weirdnessNoise: Float) = MultiNoiseUtil.method_38116(temperatureNoise, humidityNoise, continentalnessNoise, erosionNoise, depth, weirdnessNoise)
    /**
     * method_39164
     */
    fun findFittestPosition(noises: MutableList<net.minecraft.class_6544.class_4762>, sampler: net.minecraft.class_6544.class_6552) = MultiNoiseUtil.method_39164(noises, sampler)
    /**
     * method_40443
     */
    fun createEmptyMultiNoiseSampler() = MultiNoiseUtil.method_40443()
    /**
     * method_38665
     */
    fun toLong(value: Float) = MultiNoiseUtil.method_38665(value)
    /**
     * method_38117
     */
    fun createNoiseHypercube(temperature: Float, humidity: Float, continentalness: Float, erosion: Float, depth: Float, weirdness: Float, offset: Float) = MultiNoiseUtil.method_38117(temperature, humidity, continentalness, erosion, depth, weirdness, offset)
    /**
     * method_38118
     */
    fun createNoiseHypercube(temperature: net.minecraft.class_6544.class_6546, humidity: net.minecraft.class_6544.class_6546, continentalness: net.minecraft.class_6544.class_6546, erosion: net.minecraft.class_6544.class_6546, depth: net.minecraft.class_6544.class_6546, weirdness: net.minecraft.class_6544.class_6546, offset: Float) = MultiNoiseUtil.method_38118(temperature, humidity, continentalness, erosion, depth, weirdness, offset)
    /**
     * method_38666
     */
    fun toFloat(value: Long) = MultiNoiseUtil.method_38666(value)
}