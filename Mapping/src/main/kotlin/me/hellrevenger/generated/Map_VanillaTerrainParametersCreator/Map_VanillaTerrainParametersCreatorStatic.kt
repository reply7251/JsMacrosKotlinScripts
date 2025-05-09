package me.hellrevenger.generated.Map_VanillaTerrainParametersCreator
import kotlin.reflect.*
import me.hellrevenger.generated.*
object VanillaTerrainParametersCreatorKt {
    /**
     * method_42056
     */
    fun <C, I>createOffsetSpline(continents: I, erosion: I, ridgesFolded: I, amplified: Boolean) where I: ToFloatFunction<C> = VanillaTerrainParametersCreator.method_42056<C, I>(continents, erosion, ridgesFolded, amplified)
    /**
     * method_42051
     */
    fun <C, I>createContinentalOffsetSpline(erosion: I, ridgesFolded: I, continentalness: Float, arg3: Float, arg4: Float, arg5: Float, arg6: Float, arg7: Float, arg8: Boolean, arg9: Boolean, amplifier: ToFloatFunction<Float>) where I: ToFloatFunction<C> = VanillaTerrainParametersCreator.method_42051<C, I>(erosion, ridgesFolded, continentalness, arg3, arg4, arg5, arg6, arg7, arg8, arg9, amplifier)
    /**
     * method_42058
     */
    fun <C, I>createJaggednessSpline(continents: I, erosion: I, ridges: I, ridgesFolded: I, amplified: Boolean) where I: ToFloatFunction<C> = VanillaTerrainParametersCreator.method_42058<C, I>(continents, erosion, ridges, ridgesFolded, amplified)
    /**
     * method_42055
     */
    fun <C, I>createFactorSpline(continents: I, erosion: I, ridges: I, ridgesFolded: I, amplified: Boolean) where I: ToFloatFunction<C> = VanillaTerrainParametersCreator.method_42055<C, I>(continents, erosion, ridges, ridgesFolded, amplified)
}