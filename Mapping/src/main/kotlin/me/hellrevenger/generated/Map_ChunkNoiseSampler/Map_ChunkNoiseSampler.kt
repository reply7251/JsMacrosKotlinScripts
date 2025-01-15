package me.hellrevenger.generated.Map_ChunkNoiseSampler
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun ChunkNoiseSampler.stopInterpolation() = this.method_40537()
fun ChunkNoiseSampler.interpolateY(arg0: Int, arg1: Double) = this.method_38337(arg0, arg1)
fun ChunkNoiseSampler.interpolateX(arg0: Int, arg1: Double) = this.method_38349(arg0, arg1)
fun ChunkNoiseSampler.sampleEndDensity(arg0: Int) = this.method_38339(arg0)
fun KClass<ChunkNoiseSampler>.create(arg0: Chunk, arg1: NoiseConfig, arg2: net.minecraft.class_6916.class_7050, arg3: ChunkGeneratorSettings, arg4: net.minecraft.class_6350.class_6565, arg5: Blender) = ChunkNoiseSampler.method_39543(arg0, arg1, arg2, arg3, arg4, arg5)
fun ChunkNoiseSampler.swapBuffers() = this.method_38348()
fun ChunkNoiseSampler.estimateSurfaceHeight(arg0: Int, arg1: Int) = this.method_39900(arg0, arg1)
fun ChunkNoiseSampler.sampleStartDensity() = this.method_38336()
fun ChunkNoiseSampler.getAquiferSampler() = this.method_38354()
fun ChunkNoiseSampler.interpolateZ(arg0: Int, arg1: Double) = this.method_38355(arg0, arg1)
fun ChunkNoiseSampler.at(arg0: Int) = this.method_40534(arg0)
fun ChunkNoiseSampler.onSampledCellCorners(arg0: Int, arg1: Int) = this.method_38362(arg0, arg1)
