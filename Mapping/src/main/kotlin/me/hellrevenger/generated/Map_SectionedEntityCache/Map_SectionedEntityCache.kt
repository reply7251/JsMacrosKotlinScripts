package me.hellrevenger.generated.Map_SectionedEntityCache
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31772
 */
fun <T>SectionedEntityCache<T>.getSections(chunkPos: Long) where T: EntityLike = this.method_31772(chunkPos)
/**
 * method_31785
 */
fun <T>SectionedEntityCache<T>.findTrackingSection(sectionPos: Long) where T: EntityLike = this.method_31785(sectionPos)
/**
 * method_31777
 */
fun <T>SectionedEntityCache<T>.forEachInBox(box: Box?, consumer: LazyIterationConsumer<EntityTrackingSection<T>>?) where T: EntityLike = this.method_31777(box, consumer)
/**
 * method_31781
 */
fun <T>SectionedEntityCache<T>.sectionCount() where T: EntityLike = this.method_31781()
/**
 * method_31786
 */
fun <T>SectionedEntityCache<T>.removeSection(sectionPos: Long) where T: EntityLike = this.method_31786(sectionPos)
/**
 * method_31770
 */
fun <T>SectionedEntityCache<T>.getChunkPositions() where T: EntityLike = this.method_31770()
/**
 * method_31773
 */
fun <T, U>SectionedEntityCache<T>.forEachIntersects(filter: TypeFilter<T, U>?, box: Box?, consumer: LazyIterationConsumer<U>?) where T: EntityLike, U: T = this.method_31773<U>(filter, box, consumer)
/**
 * method_31783
 */
fun <T>SectionedEntityCache<T>.forEachIntersects(box: Box?, consumer: LazyIterationConsumer<T>?) where T: EntityLike = this.method_31783(box, consumer)
/**
 * method_31782
 */
fun <T>SectionedEntityCache<T>.getTrackingSections(chunkPos: Long) where T: EntityLike = this.method_31782(chunkPos)
/**
 * method_31784
 */
fun <T>SectionedEntityCache<T>.getTrackingSection(sectionPos: Long) where T: EntityLike = this.method_31784(sectionPos)
