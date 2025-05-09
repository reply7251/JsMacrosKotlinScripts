package me.hellrevenger.generated.Map_HopperBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object HopperBlockEntityKt {
    /**
     * field_31341
     */
    val TRANSFER_COOLDOWN by aliasStatic(HopperBlockEntity::field_31341)
    /**
     * field_31342
     */
    val INVENTORY_SIZE by aliasStatic(HopperBlockEntity::field_31342)
    /**
     * method_31692
     */
    fun serverTick(world: world_World, pos: BlockPos, state: BlockState, blockEntity: HopperBlockEntity) = HopperBlockEntity.method_31692(world, pos, state, blockEntity)
    /**
     * method_11247
     */
    fun extract(inventory: Inventory, itemEntity: ItemEntity) = HopperBlockEntity.method_11247(inventory, itemEntity)
    /**
     * method_11260
     */
    fun transfer(from: Inventory, to: Inventory, stack: ItemStack, side: Direction) = HopperBlockEntity.method_11260(from, to, stack, side)
    /**
     * method_11236
     */
    fun onEntityCollided(world: world_World, pos: BlockPos, state: BlockState, entity: Entity, blockEntity: HopperBlockEntity) = HopperBlockEntity.method_11236(world, pos, state, entity, blockEntity)
    /**
     * method_11237
     */
    fun getInputItemEntities(world: world_World, hopper: Hopper) = HopperBlockEntity.method_11237(world, hopper)
    /**
     * method_11250
     */
    fun getInventoryAt(world: world_World, pos: BlockPos) = HopperBlockEntity.method_11250(world, pos)
    /**
     * method_11241
     */
    fun extract(world: world_World, hopper: Hopper) = HopperBlockEntity.method_11241(world, hopper)
}