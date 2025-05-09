package me.hellrevenger.generated.Map_ServerEntityManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31828
 */
fun <T>ServerEntityManager<T>.loadEntities(entities: Stream<T>) where T: EntityLike = this.method_31828(entities)
/**
 * method_37252
 */
fun <T>ServerEntityManager<T>.isLoaded(chunkPos: Long) where T: EntityLike = this.method_37252(chunkPos)
/**
 * method_31826
 */
fun <T>ServerEntityManager<T>.dump(writer: Writer) where T: EntityLike = this.method_31826(writer)
/**
 * method_40021
 */
fun <T>ServerEntityManager<T>.shouldTick(pos: ChunkPos) where T: EntityLike = this.method_40021(pos)
/**
 * method_54490
 */
fun <T>ServerEntityManager<T>.getIndexSize() where T: EntityLike = this.method_54490()
/**
 * method_31816
 */
fun <T>ServerEntityManager<T>.updateTrackingStatus(chunkPos: ChunkPos, trackingStatus: EntityTrackingStatus) where T: EntityLike = this.method_31816(chunkPos, trackingStatus)
/**
 * method_31836
 */
fun <T>ServerEntityManager<T>.flush() where T: EntityLike = this.method_31836()
/**
 * method_31841
 */
fun <T>ServerEntityManager<T>.getLookup() where T: EntityLike = this.method_31841()
/**
 * method_31818
 */
fun <T>ServerEntityManager<T>.addEntity(entity: T) where T: EntityLike = this.method_31818(entity)
/**
 * method_31829
 */
fun <T>ServerEntityManager<T>.save() where T: EntityLike = this.method_31829()
/**
 * method_31809
 */
fun <T>ServerEntityManager<T>.tick() where T: EntityLike = this.method_31809()
/**
 * method_31845
 */
fun <T>ServerEntityManager<T>.getDebugString() where T: EntityLike = this.method_31845()
/**
 * method_31835
 */
fun <T>ServerEntityManager<T>.addEntities(entities: Stream<T>) where T: EntityLike = this.method_31835(entities)
/**
 * method_31827
 */
fun <T>ServerEntityManager<T>.has(uuid: UUID) where T: EntityLike = this.method_31827(uuid)
