package me.hellrevenger.generated.Map_VehicleInventory
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_42284
 */
fun VehicleInventory.open(player: PlayerEntity) = this.method_42284(player)
/**
 * method_42275
 */
fun VehicleInventory.setLootTable(lootTable: RegistryKey<LootTable>) = this.method_42275(lootTable)
/**
 * method_19538
 */
fun VehicleInventory.getPos() = this.method_19538()
/**
 * method_42274
 */
fun VehicleInventory.setLootTableSeed(lootTableSeed: Long) = this.method_42274(lootTableSeed)
/**
 * method_42278
 */
fun VehicleInventory.getInventory() = this.method_42278()
/**
 * method_42291
 */
fun VehicleInventory.generateInventoryLoot(player: PlayerEntity) = this.method_42291(player)
/**
 * method_5829
 */
fun VehicleInventory.getBoundingBox() = this.method_5829()
/**
 * method_42277
 */
fun VehicleInventory.getLootTableSeed() = this.method_42277()
/**
 * method_42294
 */
fun VehicleInventory.canPlayerAccess(player: PlayerEntity) = this.method_42294(player)
/**
 * method_42276
 */
fun VehicleInventory.getLootTable() = this.method_42276()
/**
 * method_42289
 */
fun VehicleInventory.removeInventoryStack(slot: Int) = this.method_42289(slot)
/**
 * method_42283
 */
fun VehicleInventory.onBroken(source: DamageSource, world: ServerWorld, vehicle: Entity) = this.method_42283(source, world, vehicle)
/**
 * method_31481
 */
fun VehicleInventory.isRemoved() = this.method_31481()
/**
 * method_42285
 */
fun VehicleInventory.readInventoryFromNbt(nbt: NbtCompound, registries: net.minecraft.class_7225.class_7874) = this.method_42285(nbt, registries)
/**
 * method_37908
 */
fun VehicleInventory.getWorld() = this.method_37908()
/**
 * method_42288
 */
fun VehicleInventory.writeInventoryToNbt(nbt: NbtCompound, registries: net.minecraft.class_7225.class_7874) = this.method_42288(nbt, registries)
/**
 * method_42295
 */
fun VehicleInventory.isInventoryEmpty() = this.method_42295()
/**
 * method_42286
 */
fun VehicleInventory.removeInventoryStack(slot: Int, amount: Int) = this.method_42286(slot, amount)
/**
 * method_42292
 */
fun VehicleInventory.getInventoryStackReference(slot: Int) = this.method_42292(slot)
/**
 * method_42293
 */
fun VehicleInventory.clearInventory() = this.method_42293()
/**
 * method_42273
 */
fun VehicleInventory.resetInventory() = this.method_42273()
/**
 * method_42287
 */
fun VehicleInventory.setInventoryStack(slot: Int, stack: ItemStack) = this.method_42287(slot, stack)
/**
 * method_42290
 */
fun VehicleInventory.getInventoryStack(slot: Int) = this.method_42290(slot)
