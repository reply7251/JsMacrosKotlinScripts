package me.hellrevenger.generated.Map_TargetUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TargetUtilKt {
    /**
     * method_24558
     */
    fun isNewTargetTooFar(source: LivingEntity, target: LivingEntity, extraDistance: Double) = TargetUtil.method_24558(source, target, extraDistance)
    /**
     * method_42647
     */
    fun walkTowards(entity: LivingEntity, target: LookTarget, speed: Float, completionRange: Int) = TargetUtil.method_42647(entity, target, speed, completionRange)
    /**
     * method_19554
     */
    fun lookAt(entity: LivingEntity, target: LivingEntity) = TargetUtil.method_19554(entity, target)
    /**
     * method_19548
     */
    fun lookAtAndWalkTowardsEachOther(first: LivingEntity, second: LivingEntity, speed: Float, walkCompletionRange: Int) = TargetUtil.method_19548(first, second, speed, walkCompletionRange)
    /**
     * method_24562
     */
    fun getCloserEntity(source: LivingEntity, first: Optional<LivingEntity>, second: LivingEntity) = TargetUtil.method_24562(source, first, second)
    /**
     * method_41331
     */
    fun hasBreedTarget(entity: LivingEntity) = TargetUtil.method_41331(entity)
    /**
     * method_43392
     */
    fun give(entity: LivingEntity, stack: ItemStack, targetLocation: Vec3d, velocityFactor: Vec3d, yOffset: Float) = TargetUtil.method_43392(entity, stack, targetLocation, velocityFactor, yOffset)
    /**
     * method_19550
     */
    fun canSee(brain: Brain<*>, target: LivingEntity) = TargetUtil.method_19550(brain, target)
    /**
     * method_33193
     */
    fun find(entity: PathAwareEntity, horizontalRange: Int, verticalRange: Int) = TargetUtil.method_33193(entity, horizontalRange, verticalRange)
    /**
     * method_25940
     */
    fun isTargetWithinAttackRange(mob: MobEntity, target: LivingEntity, rangedWeaponReachReduction: Int) = TargetUtil.method_25940(mob, target, rangedWeaponReachReduction)
    /**
     * method_24560
     */
    fun getEntity(entity: LivingEntity, uuidMemoryModule: MemoryModuleType<UUID>) = TargetUtil.method_24560(entity, uuidMemoryModule)
    /**
     * method_20419
     */
    fun getPosClosestToOccupiedPointOfInterest(world: ServerWorld, center: ChunkSectionPos, radius: Int) = TargetUtil.method_20419(world, center, radius)
    /**
     * method_24565
     */
    fun isVisibleInMemory(source: LivingEntity, target: LivingEntity) = TargetUtil.method_24565(source, target)
}