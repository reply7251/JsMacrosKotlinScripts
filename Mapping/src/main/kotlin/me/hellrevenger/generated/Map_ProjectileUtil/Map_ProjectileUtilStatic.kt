package me.hellrevenger.generated.Map_ProjectileUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ProjectileUtilKt {
    /**
     * method_49998
     */
    fun getCollision(entity: Entity, predicate: Predicate<Entity>, range: Double) = ProjectileUtil.method_49998(entity, predicate, range)
    /**
     * method_7484
     */
    fun setRotationFromVelocity(entity: Entity, delta: Float) = ProjectileUtil.method_7484(entity, delta)
    /**
     * method_18077
     */
    fun getEntityCollision(world: world_World, entity: Entity, min: Vec3d, max: Vec3d, box: Box, predicate: Predicate<Entity>) = ProjectileUtil.method_18077(world, entity, min, max, box, predicate)
    /**
     * method_37226
     */
    fun getEntityCollision(world: world_World, entity: Entity, min: Vec3d, max: Vec3d, box: Box, predicate: Predicate<Entity>, margin: Float) = ProjectileUtil.method_37226(world, entity, min, max, box, predicate, margin)
    /**
     * method_49997
     */
    fun getCollision(entity: Entity, predicate: Predicate<Entity>) = ProjectileUtil.method_49997(entity, predicate)
    /**
     * method_55054
     */
    fun getCollision(entity: Entity, predicate: Predicate<Entity>, raycastShapeType: net.minecraft.class_3959.class_3960) = ProjectileUtil.method_55054(entity, predicate, raycastShapeType)
    /**
     * method_18812
     */
    fun getHandPossiblyHolding(entity: LivingEntity, item: Item) = ProjectileUtil.method_18812(entity, item)
    /**
     * method_18075
     */
    fun raycast(entity: Entity, min: Vec3d, max: Vec3d, box: Box, predicate: Predicate<Entity>, maxDistance: Double) = ProjectileUtil.method_18075(entity, min, max, box, predicate, maxDistance)
    /**
     * method_18813
     */
    fun createArrowProjectile(entity: LivingEntity, stack: ItemStack, damageModifier: Float, bow: ItemStack) = ProjectileUtil.method_18813(entity, stack, damageModifier, bow)
}