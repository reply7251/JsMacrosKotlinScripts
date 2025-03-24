package me.hellrevenger.generated.Map_Item
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_49998
 */
val KClass<Item>.MAX_MAX_COUNT by aliasStatic(Item::field_49998)
/**
 * field_30887
 */
val KClass<Item>.DEFAULT_MAX_COUNT by aliasStatic(Item::field_30887)
/**
 * field_8001
 */
val KClass<Item>.BASE_ATTACK_SPEED_MODIFIER_ID by aliasStatic(Item::field_8001)
/**
 * field_8003
 */
val KClass<Item>.BLOCK_ITEMS by aliasStatic(Item::field_8003)
/**
 * field_8006
 */
val KClass<Item>.BASE_ATTACK_DAMAGE_MODIFIER_ID by aliasStatic(Item::field_8006)
/**
 * field_30889
 */
val KClass<Item>.ITEM_BAR_STEPS by aliasStatic(Item::field_30889)
/**
 * method_33261
 */
fun Item.onItemEntityDestroyed(arg0: ItemEntity) = this.method_33261(arg0)
/**
 * method_7884
 */
fun Item.useOnBlock(arg0: ItemUsageContext) = this.method_7884(arg0)
/**
 * method_7885
 */
fun Item.canMine(arg0: BlockState, arg1: world_World, arg2: BlockPos, arg3: PlayerEntity) = this.method_7885(arg0, arg1, arg2, arg3)
/**
 * method_31566
 */
fun Item.onClicked(arg0: ItemStack, arg1: ItemStack, arg2: Slot, arg3: ClickType, arg4: PlayerEntity, arg5: StackReference) = this.method_31566(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_58404
 */
fun Item.getMiningSpeed(arg0: ItemStack, arg1: BlockState) = this.method_58404(arg0, arg1)
/**
 * method_31565
 */
fun Item.onStackClicked(arg0: ItemStack, arg1: Slot, arg2: ClickType, arg3: PlayerEntity) = this.method_31565(arg0, arg1, arg2, arg3)
/**
 * method_7853
 */
fun Item.getUseAction(arg0: ItemStack) = this.method_7853(arg0)
/**
 * method_31571
 */
fun Item.getItemBarColor(arg0: ItemStack) = this.method_31571(arg0)
/**
 * method_31567
 */
fun Item.isItemBarVisible(arg0: ItemStack) = this.method_31567(arg0)
/**
 * method_7836
 */
fun Item.use(arg0: world_World, arg1: PlayerEntity, arg2: Hand) = this.method_7836(arg0, arg1, arg2)
/**
 * method_7861
 */
fun Item.finishUsing(arg0: ItemStack, arg1: world_World, arg2: LivingEntity) = this.method_7861(arg0, arg1, arg2)
/**
 * method_7881
 */
fun Item.getMaxUseTime(arg0: ItemStack, arg1: LivingEntity) = this.method_7881(arg0, arg1)
/**
 * method_7858
 */
fun Item.getRecipeRemainder() = this.method_7858()
/**
 * method_54465
 */
fun Item.onCraftByPlayer(arg0: ItemStack, arg1: world_World, arg2: PlayerEntity) = this.method_54465(arg0, arg1, arg2)
/**
 * method_7851
 */
fun Item.appendTooltip(arg0: ItemStack, arg1: net.minecraft.class_1792.class_9635, arg2: MutableList<Text>, arg3: TooltipType) = this.method_7851(arg0, arg1, arg2, arg3)
/**
 * method_7854
 */
fun Item.getDefaultStack() = this.method_7854()
/**
 * method_40131
 */
fun Item.getRegistryEntry() = this.method_40131()
/**
 * method_7886
 */
fun Item.hasGlint(arg0: ItemStack) = this.method_7886(arg0)
/**
 * method_7847
 */
fun Item.useOnEntity(arg0: ItemStack, arg1: PlayerEntity, arg2: LivingEntity, arg3: Hand) = this.method_7847(arg0, arg1, arg2, arg3)
/**
 * method_7838
 */
fun Item.isUsedOnRelease(arg0: ItemStack) = this.method_7838(arg0)
/**
 * method_7882
 */
fun Item.getMaxCount() = this.method_7882()
/**
 * method_7873
 */
fun Item.postHit(arg0: ItemStack, arg1: LivingEntity, arg2: LivingEntity) = this.method_7873(arg0, arg1, arg2)
/**
 * method_7880
 */
fun KClass<Item>.getRawId(arg0: Item) = Item.method_7880(arg0)
/**
 * method_58405
 */
fun Item.isCorrectForDrops(arg0: ItemStack, arg1: BlockState) = this.method_58405(arg0, arg1)
/**
 * method_59978
 */
fun Item.postDamageEntity(arg0: ItemStack, arg1: LivingEntity, arg2: LivingEntity) = this.method_59978(arg0, arg1, arg2)
/**
 * method_65353
 */
fun Item.shouldShowOperatorBlockWarnings(arg0: ItemStack, arg1: PlayerEntity) = this.method_65353(arg0, arg1)
/**
 * method_7867
 */
fun KClass<Item>.fromBlock(arg0: Block) = Item.method_7867(arg0)
/**
 * method_64193
 */
fun Item.getDamageSource(arg0: LivingEntity) = this.method_64193(arg0)
/**
 * method_32346
 */
fun Item.getTooltipData(arg0: ItemStack) = this.method_32346(arg0)
/**
 * method_57336
 */
fun Item.getBreakSound() = this.method_57336()
/**
 * method_7840
 */
fun Item.onStoppedUsing(arg0: ItemStack, arg1: world_World, arg2: LivingEntity, arg3: Int) = this.method_7840(arg0, arg1, arg2, arg3)
/**
 * method_31568
 */
fun Item.canBeNested() = this.method_31568()
/**
 * method_7875
 */
fun KClass<Item>.byRawId(arg0: Int) = Item.method_7875(arg0)
/**
 * method_7888
 */
fun Item.inventoryTick(arg0: ItemStack, arg1: world_World, arg2: Entity, arg3: Int, arg4: Boolean) = this.method_7888(arg0, arg1, arg2, arg3, arg4)
/**
 * method_31569
 */
fun Item.getItemBarStep(arg0: ItemStack) = this.method_31569(arg0)
/**
 * method_7852
 */
fun Item.usageTick(arg0: world_World, arg1: LivingEntity, arg2: ItemStack, arg3: Int) = this.method_7852(arg0, arg1, arg2, arg3)
/**
 * method_7843
 */
fun Item.onCraft(arg0: ItemStack, arg1: world_World) = this.method_7843(arg0, arg1)
/**
 * method_7864
 */
fun Item.getName(arg0: ItemStack) = this.method_7864(arg0)
/**
 * method_7860
 */
fun Item.postProcessComponents(arg0: ItemStack) = this.method_7860(arg0)
/**
 * method_58403
 */
fun Item.getBonusAttackDamage(arg0: Entity, arg1: Float, arg2: DamageSource) = this.method_58403(arg0, arg1, arg2)
/**
 * method_7876
 */
fun Item.getTranslationKey() = this.method_7876()
/**
 * method_7879
 */
fun Item.postMine(arg0: ItemStack, arg1: world_World, arg2: BlockState, arg3: BlockPos, arg4: LivingEntity) = this.method_7879(arg0, arg1, arg2, arg3, arg4)
/**
 * method_57347
 */
fun Item.getComponents() = this.method_57347()
/**
 * method_63680
 */
fun Item.getName() = this.method_63680()
