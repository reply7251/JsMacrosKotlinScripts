package me.hellrevenger.generated.Map_ServerEntityManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31828
 */
fun <T>ServerEntityManager<T>.loadEntities(arg0: Stream<T>) where T: EntityLike = this.method_31828(arg0)
/**
 * method_37252
 */
fun <T>ServerEntityManager<T>.isLoaded(arg0: Long) where T: EntityLike = this.method_37252(arg0)
/**
 * method_31826
 */
fun <T>ServerEntityManager<T>.dump(arg0: Writer) where T: EntityLike = this.method_31826(arg0)
/**
 * method_40021
 */
fun <T>ServerEntityManager<T>.shouldTick(arg0: ChunkPos) where T: EntityLike = this.method_40021(arg0)
/**
 * method_54490
 */
fun <T>ServerEntityManager<T>.getIndexSize() where T: EntityLike = this.method_54490()
/**
 * method_31816
 */
fun <T>ServerEntityManager<T>.updateTrackingStatus(arg0: ChunkPos, arg1: EntityTrackingStatus) where T: EntityLike = this.method_31816(arg0, arg1)
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
fun <T>ServerEntityManager<T>.addEntity(arg0: T) where T: EntityLike = this.method_31818(arg0)
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
 * method_31815
 */
fun <T>ServerEntityManager<T>.updateTrackingStatus(arg0: ChunkPos, arg1: ChunkLevelType) where T: EntityLike = this.method_31815(arg0, arg1)
/**
 * method_31835
 */
fun <T>ServerEntityManager<T>.addEntities(arg0: Stream<T>) where T: EntityLike = this.method_31835(arg0)
/**
 * method_31827
 */
fun <T>ServerEntityManager<T>.has(arg0: UUID) where T: EntityLike = this.method_31827(arg0)
/**
 * method_40022
 */
fun <T>ServerEntityManager<T>.shouldTick(arg0: BlockPos) where T: EntityLike = this.method_40022(arg0)
