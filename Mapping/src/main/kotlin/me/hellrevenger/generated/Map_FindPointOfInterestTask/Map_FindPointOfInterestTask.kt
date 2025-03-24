package me.hellrevenger.generated.Map_FindPointOfInterestTask
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30098
 */
val KClass<FindPointOfInterestTask>.POI_SORTING_RADIUS by aliasStatic(FindPointOfInterestTask::field_30098)
/**
 * method_43965
 */
fun KClass<FindPointOfInterestTask>.findPathToPoi(arg0: MobEntity, arg1: Set<util_Pair<RegistryEntry<PointOfInterestType>, BlockPos>>) = FindPointOfInterestTask.method_43965(arg0, arg1)
/**
 * method_65945
 */
fun KClass<FindPointOfInterestTask>.create(arg0: Predicate<RegistryEntry<PointOfInterestType>>, arg1: MemoryModuleType<GlobalPos>, arg2: Boolean, arg3: Optional<Byte>, arg4: BiPredicate<ServerWorld, BlockPos>) = FindPointOfInterestTask.method_65945(arg0, arg1, arg2, arg3, arg4)
/**
 * method_46883
 */
fun KClass<FindPointOfInterestTask>.create(arg0: Predicate<RegistryEntry<PointOfInterestType>>, arg1: MemoryModuleType<GlobalPos>, arg2: MemoryModuleType<GlobalPos>, arg3: Boolean, arg4: Optional<Byte>, arg5: BiPredicate<ServerWorld, BlockPos>) = FindPointOfInterestTask.method_46883(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_46884
 */
fun KClass<FindPointOfInterestTask>.create(arg0: Predicate<RegistryEntry<PointOfInterestType>>, arg1: MemoryModuleType<GlobalPos>, arg2: Boolean, arg3: Optional<Byte>) = FindPointOfInterestTask.method_46884(arg0, arg1, arg2, arg3)
