package me.hellrevenger.generated.Map_Leashable
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_60967
 */
fun Leashable.readLeashDataFromNbt(nbt: NbtCompound) = this.method_60967(nbt)
/**
 * method_65895
 */
fun Leashable.onLeashRemoved() = this.method_65895()
/**
 * method_60962
 */
fun Leashable.writeLeashDataToNbt(nbt: NbtCompound, leashData: net.minecraft.class_9817.class_9818) = this.method_60962(nbt, leashData)
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
fun Leashable.beforeLeashTick(leashHolder: Entity, distance: Float) = this.method_60956(leashHolder, distance)
/**
 * method_60960
 */
fun Leashable.setLeashData(leashData: net.minecraft.class_9817.class_9818) = this.method_60960(leashData)
/**
 * method_5931
 */
fun Leashable.canBeLeashed() = this.method_5931()
/**
 * method_60968
 */
fun Leashable.setUnresolvedLeashHolderId(unresolvedLeashHolderId: Int) = this.method_60968(unresolvedLeashHolderId)
/**
 * method_60955
 */
fun Leashable.getLeashData() = this.method_60955()
/**
 * method_60964
 */
fun Leashable.attachLeash(leashHolder: Entity, sendPacket: Boolean) = this.method_60964(leashHolder, sendPacket)
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
fun Leashable.applyLeashElasticity(leashHolder: Entity, distance: Float) = this.method_61162(leashHolder, distance)
/**
 * method_60963
 */
fun Leashable.onShortLeashTick(entity: Entity) = this.method_60963(entity)
/**
 * method_5932
 */
fun Leashable.detachLeash() = this.method_5932()
