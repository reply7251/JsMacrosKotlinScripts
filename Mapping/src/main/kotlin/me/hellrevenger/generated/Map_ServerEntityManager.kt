package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ServerEntityManager

fun <T>ServerEntityManager<T>.loadEntities(arg0: Stream<T>) where T: EntityLike = this.method_31828(arg0)
fun <T>ServerEntityManager<T>.isLoaded(arg0: Long) where T: EntityLike = this.method_37252(arg0)
fun <T>ServerEntityManager<T>.dump(arg0: Writer) where T: EntityLike = this.method_31826(arg0)
fun <T>ServerEntityManager<T>.shouldTick(arg0: ChunkPos) where T: EntityLike = this.method_40021(arg0)
fun <T>ServerEntityManager<T>.getIndexSize() where T: EntityLike = this.method_54490()
fun <T>ServerEntityManager<T>.updateTrackingStatus(arg0: ChunkPos, arg1: EntityTrackingStatus) where T: EntityLike = this.method_31816(arg0, arg1)
fun <T>ServerEntityManager<T>.flush() where T: EntityLike = this.method_31836()
fun <T>ServerEntityManager<T>.addEntity(arg0: T) where T: EntityLike = this.method_31818(arg0)
fun <T>ServerEntityManager<T>.save() where T: EntityLike = this.method_31829()
fun <T>ServerEntityManager<T>.tick() where T: EntityLike = this.method_31809()
fun <T>ServerEntityManager<T>.getDebugString() where T: EntityLike = this.method_31845()
fun <T>ServerEntityManager<T>.updateTrackingStatus(arg0: ChunkPos, arg1: ChunkLevelType) where T: EntityLike = this.method_31815(arg0, arg1)
fun <T>ServerEntityManager<T>.addEntities(arg0: Stream<T>) where T: EntityLike = this.method_31835(arg0)
fun <T>ServerEntityManager<T>.has(arg0: UUID) where T: EntityLike = this.method_31827(arg0)
fun <T>ServerEntityManager<T>.shouldTick(arg0: BlockPos) where T: EntityLike = this.method_40022(arg0)
