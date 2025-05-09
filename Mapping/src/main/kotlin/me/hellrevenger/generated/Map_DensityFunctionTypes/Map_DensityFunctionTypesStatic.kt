package me.hellrevenger.generated.Map_DensityFunctionTypes
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DensityFunctionTypesKt {
    /**
     * method_40508
     */
    fun max(a: DensityFunction, b: DensityFunction) = DensityFunctionTypes.method_40508(a, b)
    /**
     * method_40501
     */
    fun shiftA(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>) = DensityFunctionTypes.method_40501(noiseParameters)
    /**
     * method_40510
     */
    fun cacheAllInCell(inputFunction: DensityFunction) = DensityFunctionTypes.method_40510(inputFunction)
    /**
     * method_40500
     */
    fun mul(a: DensityFunction, b: DensityFunction) = DensityFunctionTypes.method_40500(a, b)
    /**
     * method_40485
     */
    fun rangeChoice(input: DensityFunction, minInclusive: Double, arg2: Double, maxExclusive: DensityFunction, arg4: DensityFunction) = DensityFunctionTypes.method_40485(input, minInclusive, arg2, maxExclusive, arg4)
    /**
     * method_40506
     */
    fun shiftB(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>) = DensityFunctionTypes.method_40506(noiseParameters)
    /**
     * method_40505
     */
    fun min(a: DensityFunction, b: DensityFunction) = DensityFunctionTypes.method_40505(a, b)
    /**
     * method_40502
     */
    fun noise(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>, scaleXz: Double, arg2: Double) = DensityFunctionTypes.method_40502(noiseParameters, scaleXz, arg2)
    /**
     * method_40493
     */
    fun noise(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>) = DensityFunctionTypes.method_40493(noiseParameters)
    /**
     * method_40507
     */
    fun cacheOnce(inputFunction: DensityFunction) = DensityFunctionTypes.method_40507(inputFunction)
    /**
     * method_40491
     */
    fun weirdScaledSampler(input: DensityFunction, parameters: RegistryEntry<net.minecraft.class_5216.class_5487>, mapper: net.minecraft.class_6916.class_6944.class_7048) = DensityFunctionTypes.method_40491(input, parameters, mapper)
    /**
     * method_40498
     */
    fun blendAlpha() = DensityFunctionTypes.method_40498()
    /**
     * method_42359
     */
    fun lerp(delta: DensityFunction, start: Double, arg2: DensityFunction) = DensityFunctionTypes.method_42359(delta, start, arg2)
    /**
     * method_40503
     */
    fun blendOffset() = DensityFunctionTypes.method_40503()
    /**
     * method_40483
     */
    fun interpolated(inputFunction: DensityFunction) = DensityFunctionTypes.method_40483(inputFunction)
    /**
     * method_41066
     */
    fun registerAndGetDefault(registry: Registry<MapCodec<out DensityFunction>>) = DensityFunctionTypes.method_41066(registry)
    /**
     * method_40499
     */
    fun flatCache(inputFunction: DensityFunction) = DensityFunctionTypes.method_40499(inputFunction)
    /**
     * method_40512
     */
    fun blendDensity(input: DensityFunction) = DensityFunctionTypes.method_40512(input)
    /**
     * method_40504
     */
    fun cache2d(inputFunction: DensityFunction) = DensityFunctionTypes.method_40504(inputFunction)
    /**
     * method_40495
     */
    fun noiseInRange(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>, min: Double, arg2: Double) = DensityFunctionTypes.method_40495(noiseParameters, min, arg2)
    /**
     * method_40479
     */
    fun zero() = DensityFunctionTypes.method_40479()
    /**
     * method_40482
     */
    fun endIslands(seed: Long) = DensityFunctionTypes.method_40482(seed)
    /**
     * method_40487
     */
    fun shiftedNoise(shiftX: DensityFunction, shiftZ: DensityFunction, xzScale: Double, arg3: RegistryEntry<net.minecraft.class_5216.class_5487>) = DensityFunctionTypes.method_40487(shiftX, shiftZ, xzScale, arg3)
    /**
     * method_40488
     */
    fun lerp(delta: DensityFunction, start: DensityFunction, end: DensityFunction) = DensityFunctionTypes.method_40488(delta, start, end)
    /**
     * method_40494
     */
    fun noise(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>, scaleY: Double) = DensityFunctionTypes.method_40494(noiseParameters, scaleY)
    /**
     * method_41528
     */
    fun spline(spline: Spline<net.minecraft.class_6916.class_7076.class_7136, net.minecraft.class_6916.class_7076.class_7135>) = DensityFunctionTypes.method_41528(spline)
    /**
     * method_40481
     */
    fun yClampedGradient(fromY: Int, toY: Int, fromValue: Double, arg3: Double) = DensityFunctionTypes.method_40481(fromY, toY, fromValue, arg3)
    /**
     * method_40490
     */
    fun unary(input: DensityFunction, type: net.minecraft.class_6916.class_6925.class_6926) = DensityFunctionTypes.method_40490(input, type)
    /**
     * method_40480
     */
    fun constant(density: Double) = DensityFunctionTypes.method_40480(density)
    /**
     * method_40486
     */
    fun add(a: DensityFunction, b: DensityFunction) = DensityFunctionTypes.method_40486(a, b)
    /**
     * method_40496
     */
    fun noiseInRange(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>, scaleXz: Double, arg2: Double, scaleY: Double, arg4: Double) = DensityFunctionTypes.method_40496(noiseParameters, scaleXz, arg2, scaleY, arg4)
    /**
     * method_40497
     */
    fun noiseInRange(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>, scaleY: Double, arg2: Double, min: Double) = DensityFunctionTypes.method_40497(noiseParameters, scaleY, arg2, min)
    /**
     * method_40509
     */
    fun shift(noiseParameters: RegistryEntry<net.minecraft.class_5216.class_5487>) = DensityFunctionTypes.method_40509(noiseParameters)
}