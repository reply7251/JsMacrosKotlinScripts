package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VehicleInventory

fun VehicleInventory.open(arg0: PlayerEntity) = this.method_42284(arg0)
fun VehicleInventory.setLootTable(arg0: RegistryKey<LootTable>) = this.method_42275(arg0)
fun VehicleInventory.getPos() = this.method_19538()
fun VehicleInventory.setLootTableSeed(arg0: Long) = this.method_42274(arg0)
fun VehicleInventory.getInventory() = this.method_42278()
fun VehicleInventory.generateInventoryLoot(arg0: PlayerEntity) = this.method_42291(arg0)
fun VehicleInventory.getBoundingBox() = this.method_5829()
fun VehicleInventory.getLootTableSeed() = this.method_42277()
fun VehicleInventory.canPlayerAccess(arg0: PlayerEntity) = this.method_42294(arg0)
fun VehicleInventory.getLootTable() = this.method_42276()
fun VehicleInventory.onBroken(arg0: DamageSource, arg1: world_World, arg2: Entity) = this.method_42283(arg0, arg1, arg2)
fun VehicleInventory.removeInventoryStack(arg0: Int) = this.method_42289(arg0)
fun VehicleInventory.isRemoved() = this.method_31481()
fun VehicleInventory.readInventoryFromNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_42285(arg0, arg1)
fun VehicleInventory.getWorld() = this.method_37908()
fun VehicleInventory.writeInventoryToNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_42288(arg0, arg1)
fun VehicleInventory.isInventoryEmpty() = this.method_42295()
fun VehicleInventory.removeInventoryStack(arg0: Int, arg1: Int) = this.method_42286(arg0, arg1)
fun VehicleInventory.getInventoryStackReference(arg0: Int) = this.method_42292(arg0)
fun VehicleInventory.clearInventory() = this.method_42293()
fun VehicleInventory.resetInventory() = this.method_42273()
fun VehicleInventory.setInventoryStack(arg0: Int, arg1: ItemStack) = this.method_42287(arg0, arg1)
fun VehicleInventory.getInventoryStack(arg0: Int) = this.method_42290(arg0)
