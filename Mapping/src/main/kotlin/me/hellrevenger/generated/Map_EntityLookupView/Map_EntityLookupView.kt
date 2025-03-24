package me.hellrevenger.generated.Map_EntityLookupView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_64392
 */
fun <T>EntityLookupView.getTargets(arg0: Class<T>, arg1: TargetPredicate, arg2: LivingEntity, arg3: Box) where T: LivingEntity = this.method_64392<T>(arg0, arg1, arg2, arg3)
/**
 * method_64390
 */
fun EntityLookupView.getPlayers(arg0: TargetPredicate, arg1: LivingEntity, arg2: Box) = this.method_64390(arg0, arg1, arg2)
/**
 * method_64391
 */
fun <T>EntityLookupView.getClosestEntity(arg0: Class<out T>, arg1: TargetPredicate, arg2: LivingEntity, arg3: Double, arg4: Double, arg5: Double, arg6: Box) where T: LivingEntity = this.method_64391<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_8410
 */
fun EntityLookupView.toServerWorld() = this.method_8410()
/**
 * method_64387
 */
fun EntityLookupView.getClosestPlayer(arg0: TargetPredicate, arg1: Double, arg2: Double, arg3: Double) = this.method_64387(arg0, arg1, arg2, arg3)
/**
 * method_64393
 */
fun <T>EntityLookupView.getClosestEntity(arg0: MutableList<out T>, arg1: TargetPredicate, arg2: LivingEntity, arg3: Double, arg4: Double, arg5: Double) where T: LivingEntity = this.method_64393<T>(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_64388
 */
fun EntityLookupView.getClosestPlayer(arg0: TargetPredicate, arg1: LivingEntity) = this.method_64388(arg0, arg1)
/**
 * method_64389
 */
fun EntityLookupView.getClosestPlayer(arg0: TargetPredicate, arg1: LivingEntity, arg2: Double, arg3: Double, arg4: Double) = this.method_64389(arg0, arg1, arg2, arg3, arg4)
