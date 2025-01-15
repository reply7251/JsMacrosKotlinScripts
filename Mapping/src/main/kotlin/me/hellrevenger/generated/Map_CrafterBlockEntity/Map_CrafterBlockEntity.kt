package me.hellrevenger.generated.Map_CrafterBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<CrafterBlockEntity>.GRID_HEIGHT by aliasStatic(CrafterBlockEntity::field_46810)
val KClass<CrafterBlockEntity>.SLOT_DISABLED by aliasStatic(CrafterBlockEntity::field_46812)
val KClass<CrafterBlockEntity>.GRID_SIZE by aliasStatic(CrafterBlockEntity::field_46811)
val KClass<CrafterBlockEntity>.TRIGGERED_PROPERTY by aliasStatic(CrafterBlockEntity::field_46814)
val KClass<CrafterBlockEntity>.SLOT_ENABLED by aliasStatic(CrafterBlockEntity::field_46813)
val KClass<CrafterBlockEntity>.PROPERTIES_COUNT by aliasStatic(CrafterBlockEntity::field_46815)
val KClass<CrafterBlockEntity>.GRID_WIDTH by aliasStatic(CrafterBlockEntity::field_46809)
fun CrafterBlockEntity.setTriggered(arg0: Boolean) = this.method_54482(arg0)
fun KClass<CrafterBlockEntity>.tickCrafting(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: CrafterBlockEntity) = CrafterBlockEntity.method_54481(arg0, arg1, arg2, arg3)
fun CrafterBlockEntity.getComparatorOutput() = this.method_54489()
fun CrafterBlockEntity.setSlotEnabled(arg0: Int, arg1: Boolean) = this.method_54480(arg0, arg1)
fun CrafterBlockEntity.setCraftingTicksRemaining(arg0: Int) = this.method_54484(arg0)
fun CrafterBlockEntity.isSlotDisabled(arg0: Int) = this.method_54483(arg0)
fun CrafterBlockEntity.getHeldStacks() = this.method_11282()
fun CrafterBlockEntity.isTriggered() = this.method_54488()
