package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FindPointOfInterestTask

val FindPointOfInterestTask.POI_SORTING_RADIUS by aliasStatic(FindPointOfInterestTask::field_30098)
fun KClass<FindPointOfInterestTask>.findPathToPoi(arg0: MobEntity, arg1: Set<util_Pair<RegistryEntry<PointOfInterestType>, BlockPos>>) = FindPointOfInterestTask.method_43965(arg0, arg1)
fun KClass<FindPointOfInterestTask>.create(arg0: Predicate<RegistryEntry<PointOfInterestType>>, arg1: MemoryModuleType<GlobalPos>, arg2: MemoryModuleType<GlobalPos>, arg3: Boolean, arg4: Optional<Byte>) = FindPointOfInterestTask.method_46883(arg0, arg1, arg2, arg3, arg4)
fun KClass<FindPointOfInterestTask>.create(arg0: Predicate<RegistryEntry<PointOfInterestType>>, arg1: MemoryModuleType<GlobalPos>, arg2: Boolean, arg3: Optional<Byte>) = FindPointOfInterestTask.method_46884(arg0, arg1, arg2, arg3)
