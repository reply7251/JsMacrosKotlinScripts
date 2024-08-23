package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ClientEntityManager

fun <T>ClientEntityManager<T>.stopTicking(arg0: ChunkPos) where T: EntityLike = this.method_31875(arg0)
fun <T>ClientEntityManager<T>.startTicking(arg0: ChunkPos) where T: EntityLike = this.method_31869(arg0)
fun <T>ClientEntityManager<T>.getDebugString() where T: EntityLike = this.method_31879()
fun <T>ClientEntityManager<T>.getLookup() where T: EntityLike = this.method_31866()
fun <T>ClientEntityManager<T>.addEntity(arg0: T) where T: EntityLike = this.method_31870(arg0)
fun <T>ClientEntityManager<T>.getEntityCount() where T: EntityLike = this.method_31874()
