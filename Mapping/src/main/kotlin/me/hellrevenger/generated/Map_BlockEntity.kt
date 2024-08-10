package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockEntity

fun BlockEntity.onSyncedBlockEvent(arg0: Int, arg1: Int) = this.method_11004(arg0, arg1)
fun BlockEntity.markDirty() = this.method_5431()
fun BlockEntity.setComponents(arg0: ComponentMap) = this.method_58684(arg0)
fun BlockEntity.readComponents(arg0: ItemStack) = this.method_58683(arg0)
fun BlockEntity.setWorld(arg0: world_World) = this.method_31662(arg0)
fun BlockEntity.createNbt(arg0: net.minecraft.class_7225.class_7874) = this.method_38244(arg0)
fun KClass<BlockEntity>.tryParseCustomName(arg0: String, arg1: net.minecraft.class_7225.class_7874) = BlockEntity.method_59894(arg0, arg1)
fun BlockEntity.setCachedState(arg0: BlockState) = this.method_31664(arg0)
fun KClass<BlockEntity>.writeIdToNbt(arg0: NbtCompound, arg1: BlockEntityType<*>) = BlockEntity.method_38238(arg0, arg1)
fun BlockEntity.markRemoved() = this.method_11012()
fun BlockEntity.populateCrashReport(arg0: CrashReportSection) = this.method_11003(arg0)
fun BlockEntity.removeFromCopiedStackNbt(arg0: NbtCompound) = this.method_57569(arg0)
fun BlockEntity.copyItemDataRequiresOperator() = this.method_11011()
fun BlockEntity.createComponentlessNbt(arg0: net.minecraft.class_7225.class_7874) = this.method_58692(arg0)
fun BlockEntity.isRemoved() = this.method_11015()
fun BlockEntity.cancelRemoval() = this.method_10996()
fun KClass<BlockEntity>.posFromNbt(arg0: NbtCompound) = BlockEntity.method_38239(arg0)
fun BlockEntity.createNbtWithIdentifyingData(arg0: net.minecraft.class_7225.class_7874) = this.method_38242(arg0)
fun BlockEntity.read(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_58690(arg0, arg1)
fun BlockEntity.createComponentlessNbtWithIdentifyingData(arg0: net.minecraft.class_7225.class_7874) = this.method_59535(arg0)
fun BlockEntity.hasWorld() = this.method_11002()
fun BlockEntity.toUpdatePacket() = this.method_38235()
fun BlockEntity.setStackNbt(arg0: ItemStack, arg1: net.minecraft.class_7225.class_7874) = this.method_38240(arg0, arg1)
fun BlockEntity.readComponents(arg0: ComponentMap, arg1: ComponentChanges) = this.method_58685(arg0, arg1)
fun KClass<BlockEntity>.createFromNbt(arg0: BlockPos, arg1: BlockState, arg2: NbtCompound, arg3: net.minecraft.class_7225.class_7874) = BlockEntity.method_11005(arg0, arg1, arg2, arg3)
fun BlockEntity.createNbtWithId(arg0: net.minecraft.class_7225.class_7874) = this.method_38243(arg0)
fun BlockEntity.createComponentMap() = this.method_57590()
fun BlockEntity.readComponentlessNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_58691(arg0, arg1)
fun BlockEntity.toInitialChunkDataNbt(arg0: net.minecraft.class_7225.class_7874) = this.method_16887(arg0)
