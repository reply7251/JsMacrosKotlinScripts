package me.hellrevenger.generated.Map_Brain
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_18890
 */
fun <E>Brain<E>.setCoreActivities(coreActivities: Set<Activity>) where E: LivingEntity = this.method_18890(coreActivities)
/**
 * method_18871
 */
fun <E>Brain<E>.refreshActivities(timeOfDay: Long, arg1: Long) where E: LivingEntity = this.method_18871(timeOfDay, arg1)
/**
 * method_18882
 */
fun <E>Brain<E>.setTaskList(activity: Activity, begin: Int, list: ImmutableList<out Task<in E>>) where E: LivingEntity = this.method_18882(activity, begin, list)
/**
 * method_18884
 */
fun <E>Brain<E>.setSchedule(schedule: Schedule) where E: LivingEntity = this.method_18884(schedule)
/**
 * method_18896
 */
fun <E>Brain<E>.hasMemoryModule(type: MemoryModuleType<*>) where E: LivingEntity = this.method_18896(type)
/**
 * method_24536
 */
fun <E>Brain<E>.resetPossibleActivities() where E: LivingEntity = this.method_24536()
/**
 * method_18878
 */
fun <E, U>Brain<E>.remember(type: MemoryModuleType<U>, value: U) where E: LivingEntity = this.method_18878<U>(type, value)
/**
 * method_18894
 */
fun <E>Brain<E>.getSchedule() where E: LivingEntity = this.method_18894()
/**
 * method_46873
 */
fun <E, U>Brain<E>.getOptionalMemory(type: MemoryModuleType<U>) where E: LivingEntity = this.method_46873<U>(type)
/**
 * method_35060
 */
fun <E>Brain<E>.clear() where E: LivingEntity = this.method_35060()
/**
 * method_24529
 */
fun <E>Brain<E>.setTaskList(activity: Activity, indexedTasks: ImmutableList<out util_Pair<Int, out Task<in E>>>, requiredMemories: Set<util_Pair<MemoryModuleType<*>, MemoryModuleState>>) where E: LivingEntity = this.method_24529(activity, indexedTasks, requiredMemories)
/**
 * method_18911
 */
fun <E>Brain<E>.copy() where E: LivingEntity = this.method_18911()
/**
 * method_35058
 */
fun <E>Brain<E>.getMemories() where E: LivingEntity = this.method_35058()
/**
 * method_36978
 */
fun <E, U>Brain<E>.getMemoryExpiry(type: MemoryModuleType<U>) where E: LivingEntity = this.method_36978<U>(type)
/**
 * method_18881
 */
fun <E>Brain<E>.setTaskList(activity: Activity, indexedTasks: ImmutableList<out util_Pair<Int, out Task<in E>>>) where E: LivingEntity = this.method_18881(activity, indexedTasks)
/**
 * method_18897
 */
fun <E>Brain<E>.setDefaultActivity(activity: Activity) where E: LivingEntity = this.method_18897(activity)
/**
 * method_24525
 */
fun <E, U>Brain<E>.remember(type: MemoryModuleType<U>, value: U, expiry: Long) where E: LivingEntity = this.method_24525<U>(type, value, expiry)
/**
 * method_24526
 */
fun <E>Brain<E>.doExclusively(activity: Activity) where E: LivingEntity = this.method_24526(activity)
/**
 * method_24527
 */
fun <E>Brain<E>.setTaskList(activity: Activity, begin: Int, tasks: ImmutableList<out Task<in E>>, memoryType: MemoryModuleType<*>) where E: LivingEntity = this.method_24527(activity, begin, tasks, memoryType)
/**
 * method_27074
 */
fun <E>Brain<E>.getRunningTasks() where E: LivingEntity = this.method_27074()
/**
 * method_29519
 */
fun <E, U>Brain<E>.hasMemoryModuleWithValue(type: MemoryModuleType<U>, value: U) where E: LivingEntity = this.method_29519<U>(type, value)
/**
 * method_19542
 */
fun <E>Brain<E>.tick(world: ServerWorld, entity: E) where E: LivingEntity = this.method_19542(world, entity)
/**
 * method_18904
 */
fun <E, U>Brain<E>.getOptionalRegisteredMemory(type: MemoryModuleType<U>) where E: LivingEntity = this.method_18904<U>(type)
/**
 * method_24531
 */
fun <E>Brain<E>.resetPossibleActivities(activities: MutableList<Activity>) where E: LivingEntity = this.method_24531(activities)
/**
 * method_18906
 */
fun <E>Brain<E>.hasActivity(activity: Activity) where E: LivingEntity = this.method_18906(activity)
/**
 * method_24530
 */
fun <E>Brain<E>.setTaskList(activity: Activity, indexedTasks: ImmutableList<out util_Pair<Int, out Task<in E>>>, requiredMemories: Set<util_Pair<MemoryModuleType<*>, MemoryModuleState>>, forgettingMemories: Set<MemoryModuleType<*>>) where E: LivingEntity = this.method_24530(activity, indexedTasks, requiredMemories, forgettingMemories)
/**
 * method_18875
 */
fun <E, U>Brain<E>.forget(type: MemoryModuleType<U>) where E: LivingEntity = this.method_18875<U>(type)
/**
 * method_35059
 */
fun <E>Brain<E>.getPossibleActivities() where E: LivingEntity = this.method_35059()
/**
 * method_18876
 */
fun <E>Brain<E>.isMemoryInState(type: MemoryModuleType<*>, state: MemoryModuleState) where E: LivingEntity = this.method_18876(type, state)
/**
 * method_18900
 */
fun <E>Brain<E>.stopAllTasks(world: ServerWorld, entity: E) where E: LivingEntity = this.method_18900(world, entity)
/**
 * method_28310
 */
fun <E, T>Brain<E>.encode(ops: DynamicOps<T>) where E: LivingEntity = this.method_28310<T>(ops)
/**
 * method_18879
 */
fun <E, U>Brain<E>.remember(type: MemoryModuleType<U>, value: Optional<out U>) where E: LivingEntity = this.method_18879<U>(type, value)
/**
 * method_49709
 */
fun <E>Brain<E>.forgetAll() where E: LivingEntity = this.method_49709()
/**
 * method_24538
 */
fun <E>Brain<E>.getFirstPossibleNonCoreActivity() where E: LivingEntity = this.method_24538()
