package me.hellrevenger.generated.Map_Leashable
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_60967
 */
fun Leashable.readLeashDataFromNbt(arg0: NbtCompound) = this.method_60967(arg0)
/**
 * method_65895
 */
fun Leashable.onLeashRemoved() = this.method_65895()
/**
 * method_60962
 */
fun Leashable.writeLeashDataToNbt(arg0: NbtCompound, arg1: net.minecraft.class_9817.class_9818) = this.method_60962(arg0, arg1)
/**
 * method_60970
 */
fun Leashable.breakLongLeash() = this.method_60970()
/**
 * method_60954
 */
fun Leashable.mightBeLeashed() = this.method_60954()
/**
 * method_60952
 */
fun Leashable.getLeashHolder() = this.method_60952()
/**
 * method_60956
 */
fun Leashable.beforeLeashTick(arg0: Entity, arg1: Float) = this.method_60956(arg0, arg1)
/**
 * method_60960
 */
fun Leashable.setLeashData(arg0: net.minecraft.class_9817.class_9818) = this.method_60960(arg0)
/**
 * method_5931
 */
fun Leashable.canBeLeashed() = this.method_5931()
/**
 * method_60968
 */
fun Leashable.setUnresolvedLeashHolderId(arg0: Int) = this.method_60968(arg0)
/**
 * method_60955
 */
fun Leashable.getLeashData() = this.method_60955()
/**
 * method_60964
 */
fun Leashable.attachLeash(arg0: Entity, arg1: Boolean) = this.method_60964(arg0, arg1)
/**
 * method_60969
 */
fun Leashable.canLeashAttachTo() = this.method_60969()
/**
 * method_65894
 */
fun Leashable.detachLeashWithoutDrop() = this.method_65894()
/**
 * method_60953
 */
fun Leashable.isLeashed() = this.method_60953()
/**
 * method_61162
 */
fun Leashable.applyLeashElasticity(arg0: Entity, arg1: Float) = this.method_61162(arg0, arg1)
/**
 * method_60963
 */
fun Leashable.onShortLeashTick(arg0: Entity) = this.method_60963(arg0)
/**
 * method_5932
 */
fun Leashable.detachLeash() = this.method_5932()
/**
 * method_60965
 */
fun <E>KClass<Leashable>.tickLeash(arg0: ServerWorld, arg1: E) where E: Entity, E: Leashable = Leashable.method_60965<E>(arg0, arg1)
