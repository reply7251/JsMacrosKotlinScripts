package me.hellrevenger.generated.Map_ShulkerBoxBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ShulkerBoxBlockEntity>.INVENTORY_SIZE by aliasStatic(ShulkerBoxBlockEntity::field_31356)
fun KClass<ShulkerBoxBlockEntity>.tick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: ShulkerBoxBlockEntity) = ShulkerBoxBlockEntity.method_31694(arg0, arg1, arg2, arg3)
fun ShulkerBoxBlockEntity.getAnimationStage() = this.method_11313()
fun ShulkerBoxBlockEntity.getAnimationProgress(arg0: Float) = this.method_11312(arg0)
fun ShulkerBoxBlockEntity.suffocates() = this.method_27093()
fun ShulkerBoxBlockEntity.getColor() = this.method_11320()
fun ShulkerBoxBlockEntity.readInventoryNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_11319(arg0, arg1)
fun ShulkerBoxBlockEntity.getBoundingBox(arg0: BlockState) = this.method_11314(arg0)
