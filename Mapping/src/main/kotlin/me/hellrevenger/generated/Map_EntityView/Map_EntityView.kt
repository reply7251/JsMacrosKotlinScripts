package me.hellrevenger.generated.Map_EntityView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_8333
 */
fun EntityView.getOtherEntities(except: Entity, box: Box, predicate: Predicate<in Entity>) = this.method_8333(except, box, predicate)
/**
 * method_18456
 */
fun EntityView.getPlayers() = this.method_18456()
/**
 * method_18470
 */
fun EntityView.getPlayerByUuid(uuid: UUID) = this.method_18470(uuid)
/**
 * method_18023
 */
fun <T>EntityView.getEntitiesByType(filter: TypeFilter<Entity, T>, box: Box, predicate: Predicate<in T>) where T: Entity = this.method_18023<T>(filter, box, predicate)
/**
 * method_20743
 */
fun EntityView.getEntityCollisions(entity: Entity, box: Box) = this.method_20743(entity, box)
/**
 * method_8390
 */
fun <T>EntityView.getEntitiesByClass(entityClass: Class<T>, box: Box, predicate: Predicate<in T>) where T: Entity = this.method_8390<T>(entityClass, box, predicate)
/**
 * method_18467
 */
fun <T>EntityView.getNonSpectatingEntities(entityClass: Class<T>, box: Box) where T: Entity = this.method_18467<T>(entityClass, box)
/**
 * method_18460
 */
fun EntityView.getClosestPlayer(entity: Entity, maxDistance: Double) = this.method_18460(entity, maxDistance)
/**
 * method_18458
 */
fun EntityView.isPlayerInRange(x: Double, arg1: Double, y: Double, arg3: Double) = this.method_18458(x, arg1, y, arg3)
/**
 * method_8335
 */
fun EntityView.getOtherEntities(except: Entity, box: Box) = this.method_8335(except, box)
/**
 * method_8604
 */
fun EntityView.getClosestPlayer(x: Double, arg1: Double, y: Double, arg3: Double, z: Predicate<Entity>) = this.method_8604(x, arg1, y, arg3, z)
/**
 * method_8611
 */
fun EntityView.doesNotIntersectEntities(except: Entity, shape: VoxelShape) = this.method_8611(except, shape)
/**
 * method_18459
 */
fun EntityView.getClosestPlayer(x: Double, arg1: Double, y: Double, arg3: Double, z: Boolean) = this.method_18459(x, arg1, y, arg3, z)
