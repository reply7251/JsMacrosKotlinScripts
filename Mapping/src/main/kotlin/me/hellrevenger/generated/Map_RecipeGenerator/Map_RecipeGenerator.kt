package me.hellrevenger.generated.Map_RecipeGenerator
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_32811
 */
fun RecipeGenerator.offerCutCopperRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_32811(arg0, arg1, arg2)
/**
 * method_36232
 */
fun <T>RecipeGenerator.offerMultipleOptions(arg0: RecipeSerializer<T>, arg1: net.minecraft.class_1874.class_3958<T>, arg2: MutableList<ItemConvertible>, arg3: RecipeCategory, arg4: ItemConvertible, arg5: Float, arg6: Int, arg7: String, arg8: String) where T: AbstractCookingRecipe = this.method_36232<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
/**
 * method_36449
 */
fun RecipeGenerator.offerReversibleCompactingRecipesWithReverseRecipeGroup(arg0: RecipeCategory, arg1: ItemConvertible, arg2: RecipeCategory, arg3: ItemConvertible, arg4: String, arg5: String) = this.method_36449(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_62744
 */
fun RecipeGenerator.offerDyeablesRecipes(arg0: MutableList<Item>, arg1: MutableList<Item>, arg2: Item, arg3: String, arg4: RecipeCategory) = this.method_62744(arg0, arg1, arg2, arg3, arg4)
/**
 * method_17585
 */
fun <T>RecipeGenerator.generateCookingRecipes(arg0: String, arg1: RecipeSerializer<T>, arg2: net.minecraft.class_1874.class_3958<T>, arg3: Int) where T: AbstractCookingRecipe = this.method_17585<T>(arg0, arg1, arg2, arg3)
/**
 * method_32808
 */
fun RecipeGenerator.createStairsRecipe(arg0: ItemConvertible, arg1: Ingredient) = this.method_32808(arg0, arg1)
/**
 * method_24478
 */
fun RecipeGenerator.offerBoatRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24478(arg0, arg1)
/**
 * method_62749
 */
fun RecipeGenerator.createShapeless(arg0: RecipeCategory, arg1: ItemConvertible) = this.method_62749(arg0, arg1)
/**
 * method_33546
 */
fun RecipeGenerator.createFenceRecipe(arg0: ItemConvertible, arg1: Ingredient) = this.method_33546(arg0, arg1)
/**
 * method_32810
 */
fun RecipeGenerator.offerPolishedStoneRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_32810(arg0, arg1, arg2)
/**
 * method_47522
 */
fun RecipeGenerator.offerCompactingRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_47522(arg0, arg1, arg2)
/**
 * method_36450
 */
fun KClass<RecipeGenerator>.getRecipeName(arg0: ItemConvertible) = RecipeGenerator.method_36450(arg0)
/**
 * method_62743
 */
fun RecipeGenerator.offerSuspiciousStewRecipe(arg0: Item, arg1: SuspiciousStewIngredient) = this.method_62743(arg0, arg1)
/**
 * method_24475
 */
fun RecipeGenerator.offerPlanksRecipe2(arg0: ItemConvertible, arg1: TagKey<Item>, arg2: Int) = this.method_24475(arg0, arg1, arg2)
/**
 * method_10420
 */
fun RecipeGenerator.conditionsFromTag(arg0: TagKey<Item>) = this.method_10420(arg0)
/**
 * method_24476
 */
fun RecipeGenerator.offerBarkBlockRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24476(arg0, arg1)
/**
 * method_32805
 */
fun RecipeGenerator.createChiseledBlockRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Ingredient) = this.method_32805(arg0, arg1, arg2)
/**
 * method_36547
 */
fun RecipeGenerator.createCutCopperRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Ingredient) = this.method_36547(arg0, arg1, arg2)
/**
 * method_24885
 */
fun RecipeGenerator.offerCarpetRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24885(arg0, arg1)
/**
 * method_34854
 */
fun RecipeGenerator.offerWaxingRecipes(arg0: FeatureSet) = this.method_34854(arg0)
/**
 * method_33714
 */
fun KClass<RecipeGenerator>.convertBetween(arg0: ItemConvertible, arg1: ItemConvertible) = RecipeGenerator.method_33714(arg0, arg1)
/**
 * method_62748
 */
fun RecipeGenerator.ingredientFromTag(arg0: TagKey<Item>) = this.method_62748(arg0)
/**
 * method_33717
 */
fun RecipeGenerator.offerStonecuttingRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_33717(arg0, arg1, arg2)
/**
 * method_32804
 */
fun RecipeGenerator.createSlabRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Ingredient) = this.method_32804(arg0, arg1, arg2)
/**
 * method_36451
 */
fun KClass<RecipeGenerator>.getSmeltingItemPath(arg0: ItemConvertible) = RecipeGenerator.method_36451(arg0)
/**
 * method_24891
 */
fun RecipeGenerator.offerStainedGlassPaneRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24891(arg0, arg1)
/**
 * method_51890
 */
fun RecipeGenerator.offerDyeableRecipes(arg0: MutableList<Item>, arg1: MutableList<Item>, arg2: String) = this.method_51890(arg0, arg1, arg2)
/**
 * method_35914
 */
fun RecipeGenerator.conditionsFromItem(arg0: net.minecraft.class_2096.class_2100, arg1: ItemConvertible) = this.method_35914(arg0, arg1)
/**
 * method_46207
 */
fun RecipeGenerator.generateFamilies(arg0: FeatureSet) = this.method_46207(arg0)
/**
 * method_33535
 */
fun RecipeGenerator.generateFamily(arg0: BlockFamily, arg1: FeatureSet) = this.method_33535(arg0, arg1)
/**
 * method_33537
 */
fun RecipeGenerator.createCondensingRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Ingredient) = this.method_33537(arg0, arg1, arg2)
/**
 * method_10419
 */
fun RecipeGenerator.generate() = this.method_10419()
/**
 * method_62747
 */
fun RecipeGenerator.createShaped(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Int) = this.method_62747(arg0, arg1, arg2)
/**
 * method_32807
 */
fun KClass<RecipeGenerator>.hasItem(arg0: ItemConvertible) = RecipeGenerator.method_32807(arg0)
/**
 * method_33548
 */
fun RecipeGenerator.createFenceGateRecipe(arg0: ItemConvertible, arg1: Ingredient) = this.method_33548(arg0, arg1)
/**
 * method_36234
 */
fun RecipeGenerator.offerBlasting(arg0: MutableList<ItemConvertible>, arg1: RecipeCategory, arg2: ItemConvertible, arg3: Float, arg4: Int, arg5: String) = this.method_36234(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_33533
 */
fun RecipeGenerator.getVariantRecipeInput(arg0: BlockFamily, arg1: net.minecraft.class_5794.class_5796) = this.method_33533(arg0, arg1)
/**
 * method_10426
 */
fun RecipeGenerator.conditionsFromItem(arg0: ItemConvertible) = this.method_10426(arg0)
/**
 * method_36325
 */
fun RecipeGenerator.offerReversibleCompactingRecipes(arg0: RecipeCategory, arg1: ItemConvertible, arg2: RecipeCategory, arg3: ItemConvertible) = this.method_36325(arg0, arg1, arg2, arg3)
/**
 * method_10423
 */
fun KClass<RecipeGenerator>.conditionsFromItemPredicates(arg0: Array<ItemPredicate>) = RecipeGenerator.method_10423(*arg0)
/**
 * method_36452
 */
fun KClass<RecipeGenerator>.getBlastingItemPath(arg0: ItemConvertible) = RecipeGenerator.method_36452(arg0)
/**
 * method_32812
 */
fun RecipeGenerator.offerChiseledBlockRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_32812(arg0, arg1, arg2)
/**
 * method_24890
 */
fun RecipeGenerator.offerStainedGlassDyeingRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24890(arg0, arg1)
/**
 * method_32809
 */
fun RecipeGenerator.offerWallRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_32809(arg0, arg1, arg2)
/**
 * method_33716
 */
fun KClass<RecipeGenerator>.getItemPath(arg0: ItemConvertible) = RecipeGenerator.method_33716(arg0)
/**
 * method_24887
 */
fun RecipeGenerator.offerBedRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24887(arg0, arg1)
/**
 * method_29728
 */
fun RecipeGenerator.offerNetheriteUpgradeRecipe(arg0: Item, arg1: RecipeCategory, arg2: Item) = this.method_29728(arg0, arg1, arg2)
/**
 * method_36233
 */
fun RecipeGenerator.offerSmelting(arg0: MutableList<ItemConvertible>, arg1: RecipeCategory, arg2: ItemConvertible, arg3: Float, arg4: Int, arg5: String) = this.method_36233(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_32806
 */
fun RecipeGenerator.createPressurePlateRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Ingredient) = this.method_32806(arg0, arg1, arg2)
/**
 * method_54830
 */
fun RecipeGenerator.offerBulbRecipe(arg0: Block, arg1: Block) = this.method_54830(arg0, arg1)
/**
 * method_36445
 */
fun RecipeGenerator.offerShapelessRecipe(arg0: ItemConvertible, arg1: ItemConvertible, arg2: String, arg3: Int) = this.method_36445(arg0, arg1, arg2, arg3)
/**
 * method_24893
 */
fun RecipeGenerator.offerTerracottaDyeingRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24893(arg0, arg1)
/**
 * method_48533
 */
fun RecipeGenerator.offerSmithingTemplateCopyingRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_48533(arg0, arg1)
/**
 * method_54829
 */
fun RecipeGenerator.offerGrateRecipe(arg0: Block, arg1: Block) = this.method_54829(arg0, arg1)
/**
 * method_33542
 */
fun RecipeGenerator.createButtonRecipe(arg0: ItemConvertible, arg1: Ingredient) = this.method_33542(arg0, arg1)
/**
 * method_36444
 */
fun RecipeGenerator.offerSingleOutputShapelessRecipe(arg0: ItemConvertible, arg1: ItemConvertible, arg2: String) = this.method_36444(arg0, arg1, arg2)
/**
 * method_48530
 */
fun RecipeGenerator.offerSmithingTrimRecipe(arg0: Item, arg1: RegistryKey<Recipe<*>>) = this.method_48530(arg0, arg1)
/**
 * method_33531
 */
fun RecipeGenerator.getWallRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Ingredient) = this.method_33531(arg0, arg1, arg2)
/**
 * method_53499
 */
fun KClass<RecipeGenerator>.conditionsFromPredicates(arg0: Array<net.minecraft.class_2073.class_2074>) = RecipeGenerator.method_53499(*arg0)
/**
 * method_32814
 */
fun RecipeGenerator.offerSlabRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_32814(arg0, arg1, arg2)
/**
 * method_46212
 */
fun RecipeGenerator.offerMosaicRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_46212(arg0, arg1, arg2)
/**
 * method_62750
 */
fun RecipeGenerator.createShapeless(arg0: RecipeCategory, arg1: ItemConvertible, arg2: Int) = this.method_62750(arg0, arg1, arg2)
/**
 * method_33715
 */
fun RecipeGenerator.offerStonecuttingRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible, arg3: Int) = this.method_33715(arg0, arg1, arg2, arg3)
/**
 * method_24892
 */
fun RecipeGenerator.offerStainedGlassPaneDyeingRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24892(arg0, arg1)
/**
 * method_60922
 */
fun RecipeGenerator.offerSmithingTemplateCopyingRecipe(arg0: ItemConvertible, arg1: Ingredient) = this.method_60922(arg0, arg1)
/**
 * method_36446
 */
fun RecipeGenerator.offerReversibleCompactingRecipesWithCompactingRecipeGroup(arg0: RecipeCategory, arg1: ItemConvertible, arg2: RecipeCategory, arg3: ItemConvertible, arg4: String, arg5: String) = this.method_36446(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_33553
 */
fun RecipeGenerator.createTrapdoorRecipe(arg0: ItemConvertible, arg1: Ingredient) = this.method_33553(arg0, arg1)
/**
 * method_24889
 */
fun RecipeGenerator.offerBannerRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24889(arg0, arg1)
/**
 * method_32233
 */
fun RecipeGenerator.offerCandleDyeingRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_32233(arg0, arg1)
/**
 * method_34662
 */
fun RecipeGenerator.offerCrackingRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_34662(arg0, arg1)
/**
 * method_46208
 */
fun RecipeGenerator.offerHangingSignRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_46208(arg0, arg1)
/**
 * method_33544
 */
fun RecipeGenerator.createDoorRecipe(arg0: ItemConvertible, arg1: Ingredient) = this.method_33544(arg0, arg1)
/**
 * method_46209
 */
fun RecipeGenerator.offer2x2CompactingRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible) = this.method_46209(arg0, arg1, arg2)
/**
 * method_47521
 */
fun RecipeGenerator.offerCompactingRecipe(arg0: RecipeCategory, arg1: ItemConvertible, arg2: ItemConvertible, arg3: String) = this.method_47521(arg0, arg1, arg2, arg3)
/**
 * method_36448
 */
fun <T>RecipeGenerator.offerFoodCookingRecipe(arg0: String, arg1: RecipeSerializer<T>, arg2: net.minecraft.class_1874.class_3958<T>, arg3: Int, arg4: ItemConvertible, arg5: ItemConvertible, arg6: Float) where T: AbstractCookingRecipe = this.method_36448<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_62746
 */
fun RecipeGenerator.createShaped(arg0: RecipeCategory, arg1: ItemConvertible) = this.method_62746(arg0, arg1)
/**
 * method_36447
 */
fun RecipeGenerator.offerReversibleCompactingRecipes(arg0: RecipeCategory, arg1: ItemConvertible, arg2: RecipeCategory, arg3: ItemConvertible, arg4: String, arg5: String, arg6: String, arg7: String) = this.method_36447(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
/**
 * method_42754
 */
fun RecipeGenerator.offerChestBoatRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_42754(arg0, arg1)
/**
 * method_24477
 */
fun RecipeGenerator.offerPlanksRecipe(arg0: ItemConvertible, arg1: TagKey<Item>, arg2: Int) = this.method_24477(arg0, arg1, arg2)
/**
 * method_24894
 */
fun RecipeGenerator.offerConcretePowderDyeingRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_24894(arg0, arg1)
/**
 * method_10422
 */
fun KClass<RecipeGenerator>.requireEnteringFluid(arg0: Block) = RecipeGenerator.method_10422(arg0)
/**
 * method_32813
 */
fun RecipeGenerator.offerPressurePlateRecipe(arg0: ItemConvertible, arg1: ItemConvertible) = this.method_32813(arg0, arg1)
/**
 * method_33555
 */
fun RecipeGenerator.createSignRecipe(arg0: ItemConvertible, arg1: Ingredient) = this.method_33555(arg0, arg1)
/**
 * method_62745
 */
fun RecipeGenerator.createShapeless(arg0: RecipeCategory, arg1: ItemStack) = this.method_62745(arg0, arg1)
