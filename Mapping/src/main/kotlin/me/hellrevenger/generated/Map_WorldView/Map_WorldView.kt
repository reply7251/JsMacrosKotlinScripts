package me.hellrevenger.generated.Map_WorldView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_33597
 */
fun WorldView.isRegionLoaded(minX: Int, minZ: Int, maxX: Int, maxZ: Int) = this.method_33597(minX, minZ, maxX, maxZ)
/**
 * method_22346
 */
fun WorldView.getLightLevel(pos: BlockPos, ambientDarkness: Int) = this.method_22346(pos, ambientDarkness)
/**
 * method_8597
 */
fun WorldView.getDimension() = this.method_8597()
/**
 * method_22345
 */
fun WorldView.containsFluid(box: Box) = this.method_22345(box)
/**
 * method_22349
 */
fun WorldView.getBrightness(pos: BlockPos) = this.method_22349(pos)
/**
 * method_8615
 */
fun WorldView.getSeaLevel() = this.method_8615()
/**
 * method_22342
 */
fun WorldView.getChunk(chunkX: Int, chunkZ: Int, status: ChunkStatus) = this.method_22342(chunkX, chunkZ, status)
/**
 * method_42309
 */
fun WorldView.getPhototaxisFavor(pos: BlockPos) = this.method_42309(pos)
/**
 * method_23753
 */
fun WorldView.getBiome(pos: BlockPos) = this.method_23753(pos)
/**
 * method_8594
 */
fun WorldView.getAmbientDarkness() = this.method_8594()
/**
 * method_22347
 */
fun WorldView.isAir(pos: BlockPos) = this.method_22347(pos)
/**
 * method_22385
 */
fun WorldView.getBiomeAccess() = this.method_22385()
/**
 * method_22351
 */
fun WorldView.isWater(pos: BlockPos) = this.method_22351(pos)
/**
 * method_45162
 */
fun WorldView.getEnabledFeatures() = this.method_45162()
/**
 * method_45448
 */
fun <T>WorldView.createCommandRegistryWrapper(registryRef: RegistryKey<out Registry<out T>>) = this.method_45448<T>(registryRef)
/**
 * method_8393
 */
fun WorldView.isChunkLoaded(chunkX: Int, chunkZ: Int) = this.method_8393(chunkX, chunkZ)
/**
 * method_33598
 */
fun WorldView.isPosLoaded(x: Int, z: Int) = this.method_33598(x, z)
/**
 * method_8624
 */
fun WorldView.getTopY(heightmap: net.minecraft.class_2902.class_2903, x: Int, z: Int) = this.method_8624(heightmap, x, z)
/**
 * method_22348
 */
fun WorldView.isSkyVisibleAllowingSea(pos: BlockPos) = this.method_22348(pos)
/**
 * method_8608
 */
fun WorldView.isClient() = this.method_8608()
/**
 * method_22387
 */
fun WorldView.getGeneratorStoredBiome(biomeX: Int, biomeY: Int, biomeZ: Int) = this.method_22387(biomeX, biomeY, biomeZ)
/**
 * method_8598
 */
fun WorldView.getTopPosition(heightmap: net.minecraft.class_2902.class_2903, pos: BlockPos) = this.method_8598(heightmap, pos)
/**
 * method_30349
 */
fun WorldView.getRegistryManager() = this.method_30349()
/**
 * method_29556
 */
fun WorldView.getStatesInBoxIfLoaded(box: Box) = this.method_29556(box)
