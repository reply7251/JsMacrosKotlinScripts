package me.hellrevenger.generated.Map_MathHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MathHelperKt {
    /**
     * field_15724
     */
    val SQUARE_ROOT_OF_TWO by aliasStatic(MathHelper::field_15724)
    /**
     * field_29848
     */
    val DEGREES_PER_RADIAN by aliasStatic(MathHelper::field_29848)
    /**
     * field_29849
     */
    val EPSILON by aliasStatic(MathHelper::field_29849)
    /**
     * field_29846
     */
    val TAU by aliasStatic(MathHelper::field_29846)
    /**
     * field_46244
     */
    val Z_AXIS by aliasStatic(MathHelper::field_46244)
    /**
     * field_29847
     */
    val RADIANS_PER_DEGREE by aliasStatic(MathHelper::field_29847)
    /**
     * field_46242
     */
    val Y_AXIS by aliasStatic(MathHelper::field_46242)
    /**
     * field_29844
     */
    val PI by aliasStatic(MathHelper::field_29844)
    /**
     * field_46243
     */
    val X_AXIS by aliasStatic(MathHelper::field_46243)
    /**
     * field_29845
     */
    val HALF_PI by aliasStatic(MathHelper::field_29845)
    /**
     * method_15370
     */
    fun getLerpProgress(value: Double, arg1: Double, start: Double) = MathHelper.method_15370(value, arg1, start)
    /**
     * method_27285
     */
    fun square(n: Float) = MathHelper.method_27285(n)
    /**
     * method_15340
     */
    fun clamp(value: Int, min: Int, max: Int) = MathHelper.method_15340(value, min, max)
    /**
     * method_16437
     */
    fun lerp2(deltaX: Double, arg1: Double, deltaY: Double, arg3: Double, x0y0: Double, arg5: Double) = MathHelper.method_16437(deltaX, arg1, deltaY, arg3, x0y0, arg5)
    /**
     * method_15395
     */
    fun nextInt(random: Random, min: Int, max: Int) = MathHelper.method_15395(random, min, max)
    /**
     * method_48117
     */
    fun isMultipleOf(a: Int, b: Int) = MathHelper.method_48117(a, b)
    /**
     * method_15360
     */
    fun binarySearch(min: Int, max: Int, predicate: IntPredicate) = MathHelper.method_15360(min, max, predicate)
    /**
     * method_15389
     */
    fun hashCode(vec: Vec3i) = MathHelper.method_15389(vec)
    /**
     * method_24504
     */
    fun wrap(value: Float, maxDeviation: Float) = MathHelper.method_24504(value, maxDeviation)
    /**
     * method_15393
     */
    fun wrapDegrees(degrees: Float) = MathHelper.method_15393(degrees)
    /**
     * method_32854
     */
    fun clampedMap(value: Double, arg1: Double, oldStart: Double, arg3: Double, oldEnd: Double) = MathHelper.method_32854(value, arg1, oldStart, arg3, oldEnd)
    /**
     * method_16438
     */
    fun lerp3(deltaX: Double, arg1: Double, deltaY: Double, arg3: Double, deltaZ: Double, arg5: Double, x0y0z0: Double, arg7: Double, x1y0z0: Double, arg9: Double, x0y1z0: Double) = MathHelper.method_16438(deltaX, arg1, deltaY, arg3, deltaZ, arg5, x0y0z0, arg7, x1y0z0, arg9, x0y1z0)
    /**
     * method_41303
     */
    fun catmullRom(delta: Float, p0: Float, p1: Float, p2: Float, p3: Float) = MathHelper.method_41303(delta, p0, p1, p2, p3)
    /**
     * method_53948
     */
    fun rotateAround(axis: Vector3f, rotation: Quaternionf, result: Quaternionf) = MathHelper.method_53948(axis, rotation, result)
    /**
     * method_15367
     */
    fun floorMod(dividend: Double, arg1: Double) = MathHelper.method_15367(dividend, arg1)
    /**
     * method_17822
     */
    fun sign(value: Double) = MathHelper.method_17822(value)
    /**
     * method_38961
     */
    fun roundDownToMultiple(a: Double, arg1: Int) = MathHelper.method_38961(a, arg1)
    /**
     * method_62994
     */
    fun unpackDegrees(packedDegrees: Byte) = MathHelper.method_62994(packedDegrees)
    /**
     * method_20390
     */
    fun approximatelyEquals(a: Double, arg1: Double) = MathHelper.method_20390(a, arg1)
    /**
     * method_15356
     */
    fun angleBetween(first: Float, second: Float) = MathHelper.method_15356(first, second)
    /**
     * method_34956
     */
    fun perlinFadeDerivative(value: Double) = MathHelper.method_34956(value)
    /**
     * method_60677
     */
    fun magnitude(a: Float, b: Float, c: Float) = MathHelper.method_60677(a, b, c)
    /**
     * method_41190
     */
    fun squaredMagnitude(a: Double, arg1: Double, b: Double) = MathHelper.method_41190(a, arg1, b)
    /**
     * method_15375
     */
    fun floor(value: Float) = MathHelper.method_15375(value)
    /**
     * method_28139
     */
    fun roundUpToMultiple(value: Int, divisor: Int) = MathHelper.method_28139(value, divisor)
    /**
     * method_15388
     */
    fun stepUnwrappedAngleTowards(from: Float, to: Float, step: Float) = MathHelper.method_15388(from, to, step)
    /**
     * method_15348
     */
    fun stepTowards(from: Float, to: Float, step: Float) = MathHelper.method_15348(from, to, step)
    /**
     * method_52468
     */
    fun lerpAngleDegrees(delta: Double, arg1: Double, start: Double) = MathHelper.method_52468(delta, arg1, start)
    /**
     * method_15343
     */
    fun parseInt(string: String, fallback: Int) = MathHelper.method_15343(string, fallback)
    /**
     * method_15349
     */
    fun atan2(y: Double, arg1: Double) = MathHelper.method_15349(y, arg1)
    /**
     * method_61345
     */
    fun lerpAngleRadians(delta: Float, start: Float, end: Float) = MathHelper.method_61345(delta, start, end)
    /**
     * method_15374
     */
    fun sin(value: Float) = MathHelper.method_15374(value)
    /**
     * method_15394
     */
    fun randomUuid() = MathHelper.method_15394()
    /**
     * method_41189
     */
    fun squaredHypot(a: Double, arg1: Double) = MathHelper.method_41189(a, arg1)
    /**
     * method_15339
     */
    fun smallestEncompassingPowerOfTwo(value: Int) = MathHelper.method_15339(value)
    /**
     * method_42120
     */
    fun stream(seed: Int, lowerBound: Int, upperBound: Int) = MathHelper.method_42120(seed, lowerBound, upperBound)
    /**
     * method_48119
     */
    fun inverseSqrt(x: Float) = MathHelper.method_48119(x)
    /**
     * method_15362
     */
    fun cos(value: Float) = MathHelper.method_15362(value)
    /**
     * method_15386
     */
    fun ceil(value: Float) = MathHelper.method_15386(value)
    /**
     * method_22450
     */
    fun fractionalPart(value: Float) = MathHelper.method_22450(value)
    /**
     * method_33722
     */
    fun map(value: Double, arg1: Double, oldStart: Double, arg3: Double, oldEnd: Double) = MathHelper.method_33722(value, arg1, oldStart, arg3, oldEnd)
    /**
     * method_15390
     */
    fun clampedLerp(start: Double, arg1: Double, end: Double) = MathHelper.method_15390(start, arg1, end)
    /**
     * method_32751
     */
    fun nextBetween(random: Random, min: Int, max: Int) = MathHelper.method_32751(random, min, max)
    /**
     * method_15354
     */
    fun idealHash(value: Int) = MathHelper.method_15354(value)
    /**
     * method_15342
     */
    fun ceilLog2(value: Int) = MathHelper.method_15342(value)
    /**
     * method_15366
     */
    fun nextDouble(random: Random, min: Double, arg2: Double) = MathHelper.method_15366(random, min, arg2)
    /**
     * method_61342
     */
    fun lerp(delta: Double, arg1: Vec3d, start: Vec3d) = MathHelper.method_61342(delta, arg1, start)
    /**
     * method_15344
     */
    fun nextFloat(random: Random, min: Float, max: Float) = MathHelper.method_15344(random, min, max)
    /**
     * method_59515
     */
    fun multiplyFraction(fraction: Fraction, multiplier: Int) = MathHelper.method_59515(fraction, multiplier)
    /**
     * method_38788
     */
    fun ceilDiv(a: Int, b: Int) = MathHelper.method_38788(a, b)
    /**
     * method_61346
     */
    fun easeInOutSine(value: Float) = MathHelper.method_61346(value)
    /**
     * method_15382
     */
    fun abs(value: Int) = MathHelper.method_15382(value)
    /**
     * method_60599
     */
    fun hsvToArgb(hue: Float, saturation: Float, value: Float, alpha: Int) = MathHelper.method_60599(hue, saturation, value, alpha)
    /**
     * method_20306
     */
    fun clampAngle(value: Float, mean: Float, delta: Float) = MathHelper.method_20306(value, mean, delta)
    /**
     * method_15352
     */
    fun isPowerOfTwo(value: Int) = MathHelper.method_15352(value)
    /**
     * method_62995
     */
    fun packDegrees(degrees: Float) = MathHelper.method_62995(degrees)
    /**
     * method_15391
     */
    fun absMax(a: Double, arg1: Double) = MathHelper.method_15391(a, arg1)
    /**
     * method_32855
     */
    fun nextGaussian(random: Random, mean: Float, deviation: Float) = MathHelper.method_32855(random, mean, deviation)
    /**
     * method_15381
     */
    fun subtractAngles(start: Float, end: Float) = MathHelper.method_15381(start, end)
    /**
     * method_16435
     */
    fun perlinFade(value: Double) = MathHelper.method_16435(value)
    /**
     * method_48116
     */
    fun floorDiv(dividend: Int, divisor: Int) = MathHelper.method_48116(dividend, divisor)
    /**
     * method_15345
     */
    fun fastInverseSqrt(x: Double) = MathHelper.method_15345(x)
    /**
     * method_15355
     */
    fun sqrt(value: Float) = MathHelper.method_15355(value)
    /**
     * method_23278
     */
    fun fastInverseCbrt(x: Float) = MathHelper.method_23278(x)
    /**
     * method_53063
     */
    fun lerpPositive(delta: Float, start: Int, end: Int) = MathHelper.method_53063(delta, start, end)
    /**
     * method_15351
     */
    fun floorLog2(value: Int) = MathHelper.method_15351(value)
    /**
     * method_15369
     */
    fun hsvToRgb(hue: Float, saturation: Float, value: Float) = MathHelper.method_15369(hue, saturation, value)
    /**
     * method_61344
     */
    fun hypot(a: Float, b: Float) = MathHelper.method_61344(a, b)
    /**
     * method_15372
     */
    fun lfloor(value: Double) = MathHelper.method_15372(value)
}