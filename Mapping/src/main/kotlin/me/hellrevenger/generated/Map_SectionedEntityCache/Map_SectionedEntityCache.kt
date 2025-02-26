package me.hellrevenger.generated.Map_SectionedEntityCache
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31772
 */
fun <T>SectionedEntityCache<T>.getSections(arg0: Long) where T: EntityLike = this.method_31772(arg0)
/**
 * method_31785
 */
fun <T>SectionedEntityCache<T>.findTrackingSection(arg0: Long) where T: EntityLike = this.method_31785(arg0)
/**
 * method_31777
 */
fun <T>SectionedEntityCache<T>.forEachInBox(arg0: Box, arg1: LazyIterationConsumer<EntityTrackingSection<T>>) where T: EntityLike = this.method_31777(arg0, arg1)
/**
 * method_31781
 */
fun <T>SectionedEntityCache<T>.sectionCount() where T: EntityLike = this.method_31781()
/**
 * method_31786
 */
fun <T>SectionedEntityCache<T>.removeSection(arg0: Long) where T: EntityLike = this.method_31786(arg0)
/**
 * method_31770
 */
fun <T>SectionedEntityCache<T>.getChunkPositions() where T: EntityLike = this.method_31770()
/**
 * method_31773
 */
fun <T, U>SectionedEntityCache<T>.forEachIntersects(arg0: TypeFilter<T, U>, arg1: Box, arg2: LazyIterationConsumer<U>) where T: EntityLike, U: T = this.method_31773<U>(arg0, arg1, arg2)
/**
 * method_31783
 */
fun <T>SectionedEntityCache<T>.forEachIntersects(arg0: Box, arg1: LazyIterationConsumer<T>) where T: EntityLike = this.method_31783(arg0, arg1)
/**
 * method_31782
 */
fun <T>SectionedEntityCache<T>.getTrackingSections(arg0: Long) where T: EntityLike = this.method_31782(arg0)
/**
 * method_31784
 */
fun <T>SectionedEntityCache<T>.getTrackingSection(arg0: Long) where T: EntityLike = this.method_31784(arg0)
