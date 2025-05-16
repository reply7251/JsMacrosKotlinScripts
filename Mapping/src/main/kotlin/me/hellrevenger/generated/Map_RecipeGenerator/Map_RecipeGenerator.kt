package me.hellrevenger.generated.Map_RecipeGenerator
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_32811
 */
fun RecipeGenerator.offerCutCopperRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_32811(category, output, input)
/**
 * method_36232
 */
fun <T>RecipeGenerator.offerMultipleOptions(serializer: RecipeSerializer<T>?, recipeFactory: net.minecraft.class_1874.class_3958<T>?, inputs: MutableList<ItemConvertible>?, category: RecipeCategory?, output: ItemConvertible?, experience: Float, cookingTime: Int, group: String?, suffix: String?) where T: AbstractCookingRecipe = this.method_36232<T>(serializer, recipeFactory, inputs, category, output, experience, cookingTime, group, suffix)
/**
 * method_36449
 */
fun RecipeGenerator.offerReversibleCompactingRecipesWithReverseRecipeGroup(reverseCategory: RecipeCategory?, baseItem: ItemConvertible?, compactingCategory: RecipeCategory?, compactItem: ItemConvertible?, reverseId: String?, reverseGroup: String?) = this.method_36449(reverseCategory, baseItem, compactingCategory, compactItem, reverseId, reverseGroup)
/**
 * method_62744
 */
fun RecipeGenerator.offerDyeablesRecipes(dyes: MutableList<Item>?, dyeables: MutableList<Item>?, undyed: Item?, group: String?, category: RecipeCategory?) = this.method_62744(dyes, dyeables, undyed, group, category)
/**
 * method_17585
 */
fun <T>RecipeGenerator.generateCookingRecipes(cooker: String?, serializer: RecipeSerializer<T>?, recipeFactory: net.minecraft.class_1874.class_3958<T>?, cookingTime: Int) where T: AbstractCookingRecipe = this.method_17585<T>(cooker, serializer, recipeFactory, cookingTime)
/**
 * method_32808
 */
fun RecipeGenerator.createStairsRecipe(output: ItemConvertible?, input: Ingredient?) = this.method_32808(output, input)
/**
 * method_24478
 */
fun RecipeGenerator.offerBoatRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_24478(output, input)
/**
 * method_62749
 */
fun RecipeGenerator.createShapeless(category: RecipeCategory?, output: ItemConvertible?) = this.method_62749(category, output)
/**
 * method_33546
 */
fun RecipeGenerator.createFenceRecipe(output: ItemConvertible?, input: Ingredient?) = this.method_33546(output, input)
/**
 * method_32810
 */
fun RecipeGenerator.offerPolishedStoneRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_32810(category, output, input)
/**
 * method_47522
 */
fun RecipeGenerator.offerCompactingRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_47522(category, output, input)
/**
 * method_62743
 */
fun RecipeGenerator.offerSuspiciousStewRecipe(input: Item?, stewIngredient: SuspiciousStewIngredient?) = this.method_62743(input, stewIngredient)
/**
 * method_24475
 */
fun RecipeGenerator.offerPlanksRecipe2(output: ItemConvertible?, logTag: TagKey<Item>?, count: Int) = this.method_24475(output, logTag, count)
/**
 * method_10420
 */
fun RecipeGenerator.conditionsFromTag(tag: TagKey<Item>?) = this.method_10420(tag)
/**
 * method_24476
 */
fun RecipeGenerator.offerBarkBlockRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_24476(output, input)
/**
 * method_32805
 */
fun RecipeGenerator.createChiseledBlockRecipe(category: RecipeCategory?, output: ItemConvertible?, input: Ingredient?) = this.method_32805(category, output, input)
/**
 * method_36547
 */
fun RecipeGenerator.createCutCopperRecipe(category: RecipeCategory?, output: ItemConvertible?, input: Ingredient?) = this.method_36547(category, output, input)
/**
 * method_24885
 */
fun RecipeGenerator.offerCarpetRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_24885(output, input)
/**
 * method_34854
 */
fun RecipeGenerator.offerWaxingRecipes(enabledFeatures: FeatureSet?) = this.method_34854(enabledFeatures)
/**
 * method_62748
 */
fun RecipeGenerator.ingredientFromTag(tag: TagKey<Item>?) = this.method_62748(tag)
/**
 * method_33717
 */
fun RecipeGenerator.offerStonecuttingRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_33717(category, output, input)
/**
 * method_32804
 */
fun RecipeGenerator.createSlabRecipe(category: RecipeCategory?, output: ItemConvertible?, input: Ingredient?) = this.method_32804(category, output, input)
/**
 * method_24891
 */
fun RecipeGenerator.offerStainedGlassPaneRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_24891(output, input)
/**
 * method_51890
 */
fun RecipeGenerator.offerDyeableRecipes(dyes: MutableList<Item>?, dyeables: MutableList<Item>?, group: String?) = this.method_51890(dyes, dyeables, group)
/**
 * method_35914
 */
fun RecipeGenerator.conditionsFromItem(count: net.minecraft.class_2096.class_2100?, item: ItemConvertible?) = this.method_35914(count, item)
/**
 * method_46207
 */
fun RecipeGenerator.generateFamilies(enabledFeatures: FeatureSet?) = this.method_46207(enabledFeatures)
/**
 * method_33535
 */
fun RecipeGenerator.generateFamily(family: BlockFamily?, enabledFeatures: FeatureSet?) = this.method_33535(family, enabledFeatures)
/**
 * method_33537
 */
fun RecipeGenerator.createCondensingRecipe(category: RecipeCategory?, output: ItemConvertible?, input: Ingredient?) = this.method_33537(category, output, input)
/**
 * method_10419
 */
fun RecipeGenerator.generate() = this.method_10419()
/**
 * method_62747
 */
fun RecipeGenerator.createShaped(category: RecipeCategory?, output: ItemConvertible?, count: Int) = this.method_62747(category, output, count)
/**
 * method_33548
 */
fun RecipeGenerator.createFenceGateRecipe(output: ItemConvertible?, input: Ingredient?) = this.method_33548(output, input)
/**
 * method_36234
 */
fun RecipeGenerator.offerBlasting(inputs: MutableList<ItemConvertible>?, category: RecipeCategory?, output: ItemConvertible?, experience: Float, cookingTime: Int, group: String?) = this.method_36234(inputs, category, output, experience, cookingTime, group)
/**
 * method_33533
 */
fun RecipeGenerator.getVariantRecipeInput(family: BlockFamily?, variant: net.minecraft.class_5794.class_5796?) = this.method_33533(family, variant)
/**
 * method_10426
 */
fun RecipeGenerator.conditionsFromItem(item: ItemConvertible?) = this.method_10426(item)
/**
 * method_36325
 */
fun RecipeGenerator.offerReversibleCompactingRecipes(reverseCategory: RecipeCategory?, baseItem: ItemConvertible?, compactingCategory: RecipeCategory?, compactItem: ItemConvertible?) = this.method_36325(reverseCategory, baseItem, compactingCategory, compactItem)
/**
 * method_32812
 */
fun RecipeGenerator.offerChiseledBlockRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_32812(category, output, input)
/**
 * method_24890
 */
fun RecipeGenerator.offerStainedGlassDyeingRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_24890(output, input)
/**
 * method_32809
 */
fun RecipeGenerator.offerWallRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_32809(category, output, input)
/**
 * method_24887
 */
fun RecipeGenerator.offerBedRecipe(output: ItemConvertible?, inputWool: ItemConvertible?) = this.method_24887(output, inputWool)
/**
 * method_29728
 */
fun RecipeGenerator.offerNetheriteUpgradeRecipe(input: Item?, category: RecipeCategory?, result: Item?) = this.method_29728(input, category, result)
/**
 * method_36233
 */
fun RecipeGenerator.offerSmelting(inputs: MutableList<ItemConvertible>?, category: RecipeCategory?, output: ItemConvertible?, experience: Float, cookingTime: Int, group: String?) = this.method_36233(inputs, category, output, experience, cookingTime, group)
/**
 * method_32806
 */
fun RecipeGenerator.createPressurePlateRecipe(category: RecipeCategory?, output: ItemConvertible?, input: Ingredient?) = this.method_32806(category, output, input)
/**
 * method_54830
 */
fun RecipeGenerator.offerBulbRecipe(output: Block?, input: Block?) = this.method_54830(output, input)
/**
 * method_36445
 */
fun RecipeGenerator.offerShapelessRecipe(output: ItemConvertible?, input: ItemConvertible?, group: String?, outputCount: Int) = this.method_36445(output, input, group, outputCount)
/**
 * method_24893
 */
fun RecipeGenerator.offerTerracottaDyeingRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_24893(output, input)
/**
 * method_48533
 */
fun RecipeGenerator.offerSmithingTemplateCopyingRecipe(template: ItemConvertible?, resource: ItemConvertible?) = this.method_48533(template, resource)
/**
 * method_54829
 */
fun RecipeGenerator.offerGrateRecipe(output: Block?, input: Block?) = this.method_54829(output, input)
/**
 * method_33542
 */
fun RecipeGenerator.createButtonRecipe(output: ItemConvertible?, input: Ingredient?) = this.method_33542(output, input)
/**
 * method_36444
 */
fun RecipeGenerator.offerSingleOutputShapelessRecipe(output: ItemConvertible?, input: ItemConvertible?, group: String?) = this.method_36444(output, input, group)
/**
 * method_48530
 */
fun RecipeGenerator.offerSmithingTrimRecipe(arg0: Item?, input: RegistryKey<Recipe<*>>?) = this.method_48530(arg0, input)
/**
 * method_33531
 */
fun RecipeGenerator.getWallRecipe(category: RecipeCategory?, output: ItemConvertible?, input: Ingredient?) = this.method_33531(category, output, input)
/**
 * method_32814
 */
fun RecipeGenerator.offerSlabRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_32814(category, output, input)
/**
 * method_46212
 */
fun RecipeGenerator.offerMosaicRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_46212(category, output, input)
/**
 * method_62750
 */
fun RecipeGenerator.createShapeless(category: RecipeCategory?, output: ItemConvertible?, count: Int) = this.method_62750(category, output, count)
/**
 * method_33715
 */
fun RecipeGenerator.offerStonecuttingRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?, count: Int) = this.method_33715(category, output, input, count)
/**
 * method_24892
 */
fun RecipeGenerator.offerStainedGlassPaneDyeingRecipe(output: ItemConvertible?, inputDye: ItemConvertible?) = this.method_24892(output, inputDye)
/**
 * method_60922
 */
fun RecipeGenerator.offerSmithingTemplateCopyingRecipe(template: ItemConvertible?, resource: Ingredient?) = this.method_60922(template, resource)
/**
 * method_36446
 */
fun RecipeGenerator.offerReversibleCompactingRecipesWithCompactingRecipeGroup(reverseCategory: RecipeCategory?, baseItem: ItemConvertible?, compactingCategory: RecipeCategory?, compactItem: ItemConvertible?, compactingId: String?, compactingGroup: String?) = this.method_36446(reverseCategory, baseItem, compactingCategory, compactItem, compactingId, compactingGroup)
/**
 * method_33553
 */
fun RecipeGenerator.createTrapdoorRecipe(output: ItemConvertible?, input: Ingredient?) = this.method_33553(output, input)
/**
 * method_24889
 */
fun RecipeGenerator.offerBannerRecipe(output: ItemConvertible?, inputWool: ItemConvertible?) = this.method_24889(output, inputWool)
/**
 * method_32233
 */
fun RecipeGenerator.offerCandleDyeingRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_32233(output, input)
/**
 * method_34662
 */
fun RecipeGenerator.offerCrackingRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_34662(output, input)
/**
 * method_46208
 */
fun RecipeGenerator.offerHangingSignRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_46208(output, input)
/**
 * method_33544
 */
fun RecipeGenerator.createDoorRecipe(output: ItemConvertible?, input: Ingredient?) = this.method_33544(output, input)
/**
 * method_46209
 */
fun RecipeGenerator.offer2x2CompactingRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?) = this.method_46209(category, output, input)
/**
 * method_47521
 */
fun RecipeGenerator.offerCompactingRecipe(category: RecipeCategory?, output: ItemConvertible?, input: ItemConvertible?, criterionName: String?) = this.method_47521(category, output, input, criterionName)
/**
 * method_36448
 */
fun <T>RecipeGenerator.offerFoodCookingRecipe(cooker: String?, serializer: RecipeSerializer<T>?, recipeFactory: net.minecraft.class_1874.class_3958<T>?, cookingTime: Int, input: ItemConvertible?, output: ItemConvertible?, experience: Float) where T: AbstractCookingRecipe = this.method_36448<T>(cooker, serializer, recipeFactory, cookingTime, input, output, experience)
/**
 * method_62746
 */
fun RecipeGenerator.createShaped(category: RecipeCategory?, output: ItemConvertible?) = this.method_62746(category, output)
/**
 * method_36447
 */
fun RecipeGenerator.offerReversibleCompactingRecipes(reverseCategory: RecipeCategory?, baseItem: ItemConvertible?, compactingCategory: RecipeCategory?, compactItem: ItemConvertible?, compactingId: String?, compactingGroup: String?, reverseId: String?, reverseGroup: String?) = this.method_36447(reverseCategory, baseItem, compactingCategory, compactItem, compactingId, compactingGroup, reverseId, reverseGroup)
/**
 * method_42754
 */
fun RecipeGenerator.offerChestBoatRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_42754(output, input)
/**
 * method_24477
 */
fun RecipeGenerator.offerPlanksRecipe(output: ItemConvertible?, logTag: TagKey<Item>?, count: Int) = this.method_24477(output, logTag, count)
/**
 * method_24894
 */
fun RecipeGenerator.offerConcretePowderDyeingRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_24894(output, input)
/**
 * method_32813
 */
fun RecipeGenerator.offerPressurePlateRecipe(output: ItemConvertible?, input: ItemConvertible?) = this.method_32813(output, input)
/**
 * method_33555
 */
fun RecipeGenerator.createSignRecipe(output: ItemConvertible?, input: Ingredient?) = this.method_33555(output, input)
/**
 * method_62745
 */
fun RecipeGenerator.createShapeless(category: RecipeCategory?, output: ItemStack?) = this.method_62745(category, output)
