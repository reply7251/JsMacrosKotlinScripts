package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WorldGenerationProgressListener

fun WorldGenerationProgressListener.start(arg0: ChunkPos) = this.method_17669(arg0)
fun WorldGenerationProgressListener.stop() = this.method_17671()
fun WorldGenerationProgressListener.start() = this.method_17675()
fun WorldGenerationProgressListener.setChunkStatus(arg0: ChunkPos, arg1: ChunkStatus) = this.method_17670(arg0, arg1)
fun KClass<WorldGenerationProgressListener>.getStartRegionSize(arg0: Int) = WorldGenerationProgressListener.method_56041(arg0)
