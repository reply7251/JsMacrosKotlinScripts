package me.hellrevenger.generated.Map_EntityView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_8333
 */
fun EntityView.getOtherEntities(arg0: Entity, arg1: Box, arg2: Predicate<in Entity>) = this.method_8333(arg0, arg1, arg2)
/**
 * method_18456
 */
fun EntityView.getPlayers() = this.method_18456()
/**
 * method_18470
 */
fun EntityView.getPlayerByUuid(arg0: UUID) = this.method_18470(arg0)
/**
 * method_18023
 */
fun <T>EntityView.getEntitiesByType(arg0: TypeFilter<Entity, T>, arg1: Box, arg2: Predicate<in T>) where T: Entity = this.method_18023<T>(arg0, arg1, arg2)
/**
 * method_18464
 */
fun EntityView.getPlayers(arg0: TargetPredicate, arg1: LivingEntity, arg2: Box) = this.method_18464(arg0, arg1, arg2)
/**
 * method_20743
 */
fun EntityView.getEntityCollisions(arg0: Entity, arg1: Box) = this.method_20743(arg0, arg1)
/**
 * method_8390
 */
fun <T>EntityView.getEntitiesByClass(arg0: Class<T>, arg1: Box, arg2: Predicate<in T>) where T: Entity = this.method_8390<T>(arg0, arg1, arg2)
/**
 * method_18467
 */
fun <T>EntityView.getNonSpectatingEntities(arg0: Class<T>, arg1: Box) where T: Entity = this.method_18467<T>(arg0, arg1)
/**
 * method_18460
 */
fun EntityView.getClosestPlayer(arg0: Entity, arg1: Double) = this.method_18460(arg0, arg1)
/**
 * method_18458
 */
fun EntityView.isPlayerInRange(arg0: Double, arg1: Double, arg2: Double, arg3: Double) = this.method_18458(arg0, arg1, arg2, arg3)
/**
 * method_21726
 */
fun <T>EntityView.getClosestEntity(arg0: Class<out T>, arg1: TargetPredicate, arg2: LivingEntity, arg3: Double, arg4: Double, arg5: Double, arg6: Box) where T: LivingEntity = this.method_21726<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_8335
 */
fun EntityView.getOtherEntities(arg0: Entity, arg1: Box) = this.method_8335(arg0, arg1)
/**
 * method_8604
 */
fun EntityView.getClosestPlayer(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Predicate<Entity>) = this.method_8604(arg0, arg1, arg2, arg3, arg4)
/**
 * method_18468
 */
fun <T>EntityView.getClosestEntity(arg0: MutableList<out T>, arg1: TargetPredicate, arg2: LivingEntity, arg3: Double, arg4: Double, arg5: Double) where T: LivingEntity = this.method_18468<T>(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_18463
 */
fun EntityView.getClosestPlayer(arg0: TargetPredicate, arg1: LivingEntity, arg2: Double, arg3: Double, arg4: Double) = this.method_18463(arg0, arg1, arg2, arg3, arg4)
/**
 * method_18461
 */
fun EntityView.getClosestPlayer(arg0: TargetPredicate, arg1: Double, arg2: Double, arg3: Double) = this.method_18461(arg0, arg1, arg2, arg3)
/**
 * method_18466
 */
fun <T>EntityView.getTargets(arg0: Class<T>, arg1: TargetPredicate, arg2: LivingEntity, arg3: Box) where T: LivingEntity = this.method_18466<T>(arg0, arg1, arg2, arg3)
/**
 * method_8611
 */
fun EntityView.doesNotIntersectEntities(arg0: Entity, arg1: VoxelShape) = this.method_8611(arg0, arg1)
/**
 * method_18459
 */
fun EntityView.getClosestPlayer(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Boolean) = this.method_18459(arg0, arg1, arg2, arg3, arg4)
/**
 * method_18462
 */
fun EntityView.getClosestPlayer(arg0: TargetPredicate, arg1: LivingEntity) = this.method_18462(arg0, arg1)
