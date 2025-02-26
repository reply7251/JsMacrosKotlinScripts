package me.hellrevenger.generated.Map_AbstractFurnaceBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_31292
 */
val KClass<AbstractFurnaceBlockEntity>.COOK_TIME_TOTAL_PROPERTY_INDEX by aliasStatic(AbstractFurnaceBlockEntity::field_31292)
/**
 * field_31290
 */
val KClass<AbstractFurnaceBlockEntity>.FUEL_TIME_PROPERTY_INDEX by aliasStatic(AbstractFurnaceBlockEntity::field_31290)
/**
 * field_31294
 */
val KClass<AbstractFurnaceBlockEntity>.DEFAULT_COOK_TIME by aliasStatic(AbstractFurnaceBlockEntity::field_31294)
/**
 * field_31291
 */
val KClass<AbstractFurnaceBlockEntity>.COOK_TIME_PROPERTY_INDEX by aliasStatic(AbstractFurnaceBlockEntity::field_31291)
/**
 * field_31293
 */
val KClass<AbstractFurnaceBlockEntity>.PROPERTY_COUNT by aliasStatic(AbstractFurnaceBlockEntity::field_31293)
/**
 * field_31289
 */
val KClass<AbstractFurnaceBlockEntity>.BURN_TIME_PROPERTY_INDEX by aliasStatic(AbstractFurnaceBlockEntity::field_31289)
/**
 * method_11194
 */
fun KClass<AbstractFurnaceBlockEntity>.addFuel(arg0: Map<Item, Int>, arg1: TagKey<Item>, arg2: Int) = AbstractFurnaceBlockEntity.method_11194(arg0, arg1, arg2)
/**
 * method_27354
 */
fun AbstractFurnaceBlockEntity.getRecipesUsedAndDropExperience(arg0: ServerWorld, arg1: Vec3d) = this.method_27354(arg0, arg1)
/**
 * method_11195
 */
fun KClass<AbstractFurnaceBlockEntity>.canUseAsFuel(arg0: ItemStack) = AbstractFurnaceBlockEntity.method_11195(arg0)
/**
 * method_56120
 */
fun KClass<AbstractFurnaceBlockEntity>.clearFuelTimes() = AbstractFurnaceBlockEntity.method_56120()
/**
 * method_11196
 */
fun KClass<AbstractFurnaceBlockEntity>.createFuelTimeMap() = AbstractFurnaceBlockEntity.method_11196()
/**
 * method_11202
 */
fun KClass<AbstractFurnaceBlockEntity>.addFuel(arg0: Map<Item, Int>, arg1: ItemConvertible, arg2: Int) = AbstractFurnaceBlockEntity.method_11202(arg0, arg1, arg2)
/**
 * method_31651
 */
fun KClass<AbstractFurnaceBlockEntity>.tick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: AbstractFurnaceBlockEntity) = AbstractFurnaceBlockEntity.method_31651(arg0, arg1, arg2, arg3)
/**
 * method_17763
 */
fun AbstractFurnaceBlockEntity.dropExperienceForRecipesUsed(arg0: ServerPlayerEntity) = this.method_17763(arg0)
