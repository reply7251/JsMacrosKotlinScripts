package me.hellrevenger.generated.Map_FindPointOfInterestTask
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FindPointOfInterestTaskKt {
    /**
     * field_30098
     */
    val POI_SORTING_RADIUS by aliasStatic(FindPointOfInterestTask::field_30098)
    /**
     * method_43965
     */
    fun findPathToPoi(entity: MobEntity, pois: Set<util_Pair<RegistryEntry<PointOfInterestType>, BlockPos>>) = FindPointOfInterestTask.method_43965(entity, pois)
    /**
     * method_65945
     */
    fun create(poiPredicate: Predicate<RegistryEntry<PointOfInterestType>>, poiPosModule: MemoryModuleType<GlobalPos>, onlyRunIfChild: Boolean, entityStatus: Optional<Byte>, worldPosBiPredicate: BiPredicate<ServerWorld, BlockPos>) = FindPointOfInterestTask.method_65945(poiPredicate, poiPosModule, onlyRunIfChild, entityStatus, worldPosBiPredicate)
}