package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractFurnaceBlockEntity

val AbstractFurnaceBlockEntity.COOK_TIME_TOTAL_PROPERTY_INDEX by aliasStatic(AbstractFurnaceBlockEntity::field_31292)
val AbstractFurnaceBlockEntity.FUEL_TIME_PROPERTY_INDEX by aliasStatic(AbstractFurnaceBlockEntity::field_31290)
val AbstractFurnaceBlockEntity.DEFAULT_COOK_TIME by aliasStatic(AbstractFurnaceBlockEntity::field_31294)
val AbstractFurnaceBlockEntity.COOK_TIME_PROPERTY_INDEX by aliasStatic(AbstractFurnaceBlockEntity::field_31291)
val AbstractFurnaceBlockEntity.PROPERTY_COUNT by aliasStatic(AbstractFurnaceBlockEntity::field_31293)
val AbstractFurnaceBlockEntity.BURN_TIME_PROPERTY_INDEX by aliasStatic(AbstractFurnaceBlockEntity::field_31289)
fun KClass<AbstractFurnaceBlockEntity>.addFuel(arg0: Map<Item, Int>, arg1: TagKey<Item>, arg2: Int) = AbstractFurnaceBlockEntity.method_11194(arg0, arg1, arg2)
fun AbstractFurnaceBlockEntity.getRecipesUsedAndDropExperience(arg0: ServerWorld, arg1: Vec3d) = this.method_27354(arg0, arg1)
fun KClass<AbstractFurnaceBlockEntity>.canUseAsFuel(arg0: ItemStack) = AbstractFurnaceBlockEntity.method_11195(arg0)
fun KClass<AbstractFurnaceBlockEntity>.clearFuelTimes() = AbstractFurnaceBlockEntity.method_56120()
fun KClass<AbstractFurnaceBlockEntity>.createFuelTimeMap() = AbstractFurnaceBlockEntity.method_11196()
fun KClass<AbstractFurnaceBlockEntity>.addFuel(arg0: Map<Item, Int>, arg1: ItemConvertible, arg2: Int) = AbstractFurnaceBlockEntity.method_11202(arg0, arg1, arg2)
fun KClass<AbstractFurnaceBlockEntity>.tick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: AbstractFurnaceBlockEntity) = AbstractFurnaceBlockEntity.method_31651(arg0, arg1, arg2, arg3)
fun AbstractFurnaceBlockEntity.dropExperienceForRecipesUsed(arg0: ServerPlayerEntity) = this.method_17763(arg0)
