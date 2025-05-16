package me.hellrevenger.generated.Map_Item
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_33261
 */
fun Item.onItemEntityDestroyed(entity: ItemEntity?) = this.method_33261(entity)
/**
 * method_7884
 */
fun Item.useOnBlock(context: ItemUsageContext?) = this.method_7884(context)
/**
 * method_7885
 */
fun Item.canMine(state: BlockState?, world: world_World?, pos: BlockPos?, miner: PlayerEntity?) = this.method_7885(state, world, pos, miner)
/**
 * method_31566
 */
fun Item.onClicked(stack: ItemStack?, otherStack: ItemStack?, slot: Slot?, clickType: ClickType?, player: PlayerEntity?, cursorStackReference: StackReference?) = this.method_31566(stack, otherStack, slot, clickType, player, cursorStackReference)
/**
 * method_58404
 */
fun Item.getMiningSpeed(stack: ItemStack?, state: BlockState?) = this.method_58404(stack, state)
/**
 * method_31565
 */
fun Item.onStackClicked(stack: ItemStack?, slot: Slot?, clickType: ClickType?, player: PlayerEntity?) = this.method_31565(stack, slot, clickType, player)
/**
 * method_7853
 */
fun Item.getUseAction(stack: ItemStack?) = this.method_7853(stack)
/**
 * method_31571
 */
fun Item.getItemBarColor(stack: ItemStack?) = this.method_31571(stack)
/**
 * method_31567
 */
fun Item.isItemBarVisible(stack: ItemStack?) = this.method_31567(stack)
/**
 * method_7836
 */
fun Item.use(world: world_World?, user: PlayerEntity?, hand: Hand?) = this.method_7836(world, user, hand)
/**
 * method_7861
 */
fun Item.finishUsing(stack: ItemStack?, world: world_World?, user: LivingEntity?) = this.method_7861(stack, world, user)
/**
 * method_7881
 */
fun Item.getMaxUseTime(stack: ItemStack?, user: LivingEntity?) = this.method_7881(stack, user)
/**
 * method_7858
 */
fun Item.getRecipeRemainder() = this.method_7858()
/**
 * method_54465
 */
fun Item.onCraftByPlayer(stack: ItemStack?, world: world_World?, player: PlayerEntity?) = this.method_54465(stack, world, player)
/**
 * method_7851
 */
fun Item.appendTooltip(stack: ItemStack?, context: net.minecraft.class_1792.class_9635?, tooltip: MutableList<Text>?, type: TooltipType?) = this.method_7851(stack, context, tooltip, type)
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
fun Item.hasGlint(stack: ItemStack?) = this.method_7886(stack)
/**
 * method_7847
 */
fun Item.useOnEntity(stack: ItemStack?, user: PlayerEntity?, entity: LivingEntity?, hand: Hand?) = this.method_7847(stack, user, entity, hand)
/**
 * method_7838
 */
fun Item.isUsedOnRelease(stack: ItemStack?) = this.method_7838(stack)
/**
 * method_7882
 */
fun Item.getMaxCount() = this.method_7882()
/**
 * method_7873
 */
fun Item.postHit(stack: ItemStack?, target: LivingEntity?, attacker: LivingEntity?) = this.method_7873(stack, target, attacker)
/**
 * method_58405
 */
fun Item.isCorrectForDrops(stack: ItemStack?, state: BlockState?) = this.method_58405(stack, state)
/**
 * method_59978
 */
fun Item.postDamageEntity(stack: ItemStack?, target: LivingEntity?, attacker: LivingEntity?) = this.method_59978(stack, target, attacker)
/**
 * method_65353
 */
fun Item.shouldShowOperatorBlockWarnings(stack: ItemStack?, player: PlayerEntity?) = this.method_65353(stack, player)
/**
 * method_64193
 */
fun Item.getDamageSource(user: LivingEntity?) = this.method_64193(user)
/**
 * method_32346
 */
fun Item.getTooltipData(stack: ItemStack?) = this.method_32346(stack)
/**
 * method_57336
 */
fun Item.getBreakSound() = this.method_57336()
/**
 * method_7840
 */
fun Item.onStoppedUsing(stack: ItemStack?, world: world_World?, user: LivingEntity?, remainingUseTicks: Int) = this.method_7840(stack, world, user, remainingUseTicks)
/**
 * method_31568
 */
fun Item.canBeNested() = this.method_31568()
/**
 * method_7888
 */
fun Item.inventoryTick(stack: ItemStack?, world: world_World?, entity: Entity?, slot: Int, selected: Boolean) = this.method_7888(stack, world, entity, slot, selected)
/**
 * method_31569
 */
fun Item.getItemBarStep(stack: ItemStack?) = this.method_31569(stack)
/**
 * method_7852
 */
fun Item.usageTick(world: world_World?, user: LivingEntity?, stack: ItemStack?, remainingUseTicks: Int) = this.method_7852(world, user, stack, remainingUseTicks)
/**
 * method_7843
 */
fun Item.onCraft(stack: ItemStack?, world: world_World?) = this.method_7843(stack, world)
/**
 * method_7864
 */
fun Item.getName(stack: ItemStack?) = this.method_7864(stack)
/**
 * method_7860
 */
fun Item.postProcessComponents(stack: ItemStack?) = this.method_7860(stack)
/**
 * method_58403
 */
fun Item.getBonusAttackDamage(target: Entity?, baseAttackDamage: Float, damageSource: DamageSource?) = this.method_58403(target, baseAttackDamage, damageSource)
/**
 * method_7876
 */
fun Item.getTranslationKey() = this.method_7876()
/**
 * method_7879
 */
fun Item.postMine(stack: ItemStack?, world: world_World?, state: BlockState?, pos: BlockPos?, miner: LivingEntity?) = this.method_7879(stack, world, state, pos, miner)
/**
 * method_57347
 */
fun Item.getComponents() = this.method_57347()
/**
 * method_63680
 */
fun Item.getName() = this.method_63680()
