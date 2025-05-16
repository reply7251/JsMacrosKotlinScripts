package me.hellrevenger.generated.Map_EntityLookupView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_64392
 */
fun <T>EntityLookupView.getTargets(clazz: Class<T>?, targetPredicate: TargetPredicate?, entity: LivingEntity?, box: Box?) where T: LivingEntity = this.method_64392<T>(clazz, targetPredicate, entity, box)
/**
 * method_64390
 */
fun EntityLookupView.getPlayers(targetPredicate: TargetPredicate?, entity: LivingEntity?, box: Box?) = this.method_64390(targetPredicate, entity, box)
/**
 * method_64391
 */
fun <T>EntityLookupView.getClosestEntity(clazz: Class<out T>?, targetPredicate: TargetPredicate?, entity: LivingEntity?, x: Double, arg4: Double, y: Double, arg6: Box?) where T: LivingEntity = this.method_64391<T>(clazz, targetPredicate, entity, x, arg4, y, arg6)
/**
 * method_8410
 */
fun EntityLookupView.toServerWorld() = this.method_8410()
/**
 * method_64387
 */
fun EntityLookupView.getClosestPlayer(targetPredicate: TargetPredicate?, x: Double, arg2: Double, y: Double) = this.method_64387(targetPredicate, x, arg2, y)
/**
 * method_64393
 */
fun <T>EntityLookupView.getClosestEntity(entities: MutableList<out T>?, targetPredicate: TargetPredicate?, entity: LivingEntity?, x: Double, arg4: Double, y: Double) where T: LivingEntity = this.method_64393<T>(entities, targetPredicate, entity, x, arg4, y)
/**
 * method_64388
 */
fun EntityLookupView.getClosestPlayer(targetPredicate: TargetPredicate?, entity: LivingEntity?) = this.method_64388(targetPredicate, entity)
/**
 * method_64389
 */
fun EntityLookupView.getClosestPlayer(targetPredicate: TargetPredicate?, entity: LivingEntity?, x: Double, arg3: Double, y: Double) = this.method_64389(targetPredicate, entity, x, arg3, y)
