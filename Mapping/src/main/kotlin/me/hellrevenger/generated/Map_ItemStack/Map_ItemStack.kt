package me.hellrevenger.generated.Map_ItemStack
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_8031
 */
var ItemStack.count by alias(ItemStack::field_8031)
/**
 * method_65359
 */
fun ItemStack.getImmutableComponents() = this.method_65359()
/**
 * method_57373
 */
fun ItemStack.canBreak(pos: CachedBlockPosition?) = this.method_57373(pos)
/**
 * method_7982
 */
fun ItemStack.onCraftByPlayer(world: world_World?, player: PlayerEntity?, amount: Int) = this.method_7982(world, player, amount)
/**
 * method_57008
 */
fun ItemStack.decrementUnlessCreative(amount: Int, entity: LivingEntity?) = this.method_57008(amount, entity)
/**
 * method_27319
 */
fun ItemStack.getHolder() = this.method_27319()
/**
 * method_57357
 */
fun ItemStack.canPlaceOn(pos: CachedBlockPosition?) = this.method_57357(pos)
/**
 * method_7972
 */
fun ItemStack.copy() = this.method_7972()
/**
 * method_7964
 */
fun ItemStack.getName() = this.method_7964()
/**
 * method_7970
 */
fun ItemStack.damage(amount: Int, entity: LivingEntity?, slot: EquipmentSlot?) = this.method_7970(amount, entity, slot)
/**
 * method_7912
 */
fun ItemStack.setBobbingAnimationTime(bobbingAnimationTime: Int) = this.method_7912(bobbingAnimationTime)
/**
 * method_54466
 */
fun ItemStack.onCraftByCrafter(world: world_World?) = this.method_54466(world)
/**
 * method_45435
 */
fun ItemStack.isItemEnabled(enabledFeatures: FeatureSet?) = this.method_45435(enabledFeatures)
/**
 * method_57354
 */
fun ItemStack.applyAttributeModifiers(slot: EquipmentSlot?, attributeModifierConsumer: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>?) = this.method_57354(slot, attributeModifierConsumer)
/**
 * method_7979
 */
fun ItemStack.postHit(target: LivingEntity?, user: LivingEntity?) = this.method_7979(target, user)
/**
 * method_57376
 */
fun ItemStack.toNbt(registries: net.minecraft.class_7225.class_7874?, prefix: NbtElement?) = this.method_57376(registries, prefix)
/**
 * method_31580
 */
fun ItemStack.getItemBarColor() = this.method_31580()
/**
 * method_7961
 */
fun ItemStack.isInFrame() = this.method_7961()
/**
 * method_58657
 */
fun ItemStack.getEnchantments() = this.method_58657()
/**
 * method_7945
 */
fun ItemStack.getFrame() = this.method_7945()
/**
 * method_7956
 */
fun ItemStack.damage(amount: Int, world: ServerWorld?, player: ServerPlayerEntity?, breakCallback: Consumer<Item>?) = this.method_7956(amount, world, player, breakCallback)
/**
 * method_57351
 */
fun ItemStack.getBreakSound() = this.method_57351()
/**
 * method_40133
 */
fun ItemStack.streamTags() = this.method_40133()
/**
 * method_61657
 */
fun ItemStack.shouldBreak() = this.method_61657()
/**
 * method_7960
 */
fun ItemStack.isEmpty() = this.method_7960()
/**
 * method_65130
 */
fun ItemStack.getCustomName() = this.method_65130()
/**
 * method_31573
 */
fun ItemStack.isIn(tag: TagKey<Item>?) = this.method_31573(tag)
/**
 * method_57367
 */
fun <T, U>ItemStack.apply(type: ComponentType<T>?, defaultValue: T, change: U, applier: BiFunction<T, U, T>?) = this.method_57367<T, U>(type, defaultValue, change, applier)
/**
 * method_7978
 */
fun ItemStack.addEnchantment(enchantment: RegistryEntry<Enchantment>?, level: Int) = this.method_7978(enchantment, level)
/**
 * method_7974
 */
fun ItemStack.setDamage(damage: Int) = this.method_7974(damage)
/**
 * method_58408
 */
fun ItemStack.capCount(maxCount: Int) = this.method_58408(maxCount)
/**
 * method_7920
 */
fun ItemStack.useOnEntity(user: PlayerEntity?, entity: LivingEntity?, hand: Hand?) = this.method_7920(user, entity, hand)
/**
 * method_7942
 */
fun ItemStack.hasEnchantments() = this.method_7942()
/**
 * method_63692
 */
fun ItemStack.willBreakNextUse() = this.method_63692()
/**
 * method_61653
 */
fun ItemStack.damage(amount: Int, player: PlayerEntity?) = this.method_61653(amount, player)
/**
 * method_7914
 */
fun ItemStack.getMaxCount() = this.method_7914()
/**
 * method_57365
 */
fun ItemStack.applyComponentsFrom(components: ComponentMap?) = this.method_57365(components)
/**
 * method_7934
 */
fun ItemStack.decrement(amount: Int) = this.method_7934(amount)
/**
 * method_7954
 */
fun ItemStack.toHoverableText() = this.method_7954()
/**
 * method_57368
 */
fun <T>ItemStack.apply(type: ComponentType<T>?, defaultValue: T, applier: UnaryOperator<T>?) = this.method_57368<T>(type, defaultValue, applier)
/**
 * method_63015
 */
fun ItemStack.getFormattedName() = this.method_63015()
/**
 * method_41407
 */
fun ItemStack.itemMatches(predicate: Predicate<RegistryEntry<Item>>?) = this.method_41407(predicate)
/**
 * method_7935
 */
fun ItemStack.getMaxUseTime(user: LivingEntity?) = this.method_7935(user)
/**
 * method_32347
 */
fun ItemStack.getTooltipData() = this.method_32347()
/**
 * method_63693
 */
fun ItemStack.getItemName() = this.method_63693()
/**
 * method_61655
 */
fun ItemStack.canRepairWith(ingredient: ItemStack?) = this.method_61655(ingredient)
/**
 * method_7910
 */
fun ItemStack.finishUsing(world: world_World?, user: LivingEntity?) = this.method_7910(world, user)
/**
 * method_7976
 */
fun ItemStack.getUseAction() = this.method_7976()
/**
 * method_7971
 */
fun ItemStack.split(amount: Int) = this.method_7971(amount)
/**
 * method_41409
 */
fun ItemStack.getRegistryEntry() = this.method_41409()
/**
 * method_7967
 */
fun ItemStack.isUsedOnRelease() = this.method_7967()
/**
 * method_65797
 */
fun ItemStack.hasChangedComponent(type: ComponentType<*>?) = this.method_65797(type)
/**
 * method_60617
 */
fun ItemStack.applyAttributeModifier(slot: AttributeModifierSlot?, attributeModifierConsumer: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>?) = this.method_60617(slot, attributeModifierConsumer)
/**
 * method_31575
 */
fun ItemStack.onStackClicked(slot: Slot?, clickType: ClickType?, player: PlayerEntity?) = this.method_31575(slot, clickType, player)
/**
 * method_41406
 */
fun ItemStack.itemMatches(itemEntry: RegistryEntry<Item>?) = this.method_41406(itemEntry)
/**
 * method_57358
 */
fun ItemStack.toNbt(registries: net.minecraft.class_7225.class_7874?) = this.method_57358(registries)
/**
 * method_57380
 */
fun ItemStack.getComponentChanges() = this.method_57380()
/**
 * method_31578
 */
fun ItemStack.isItemBarVisible() = this.method_31578()
/**
 * method_7936
 */
fun ItemStack.getMaxDamage() = this.method_7936()
/**
 * method_58407
 */
fun ItemStack.takesDamageFrom(source: DamageSource?) = this.method_58407(source)
/**
 * method_58658
 */
fun ItemStack.getDefaultComponents() = this.method_58658()
/**
 * method_51164
 */
fun ItemStack.copyAndEmpty() = this.method_51164()
/**
 * method_31579
 */
fun ItemStack.getItemBarStep() = this.method_31579()
/**
 * method_31574
 */
fun ItemStack.isOf(item: Item?) = this.method_31574(item)
/**
 * method_33262
 */
fun ItemStack.onItemEntityDestroyed(entity: ItemEntity?) = this.method_33262(entity)
/**
 * method_57379
 */
fun <T>ItemStack.set(type: ComponentType<in T>?, value: T) = this.method_57379<T>(type, value)
/**
 * method_7950
 */
fun ItemStack.getTooltip(context: net.minecraft.class_1792.class_9635?, player: PlayerEntity?, type: TooltipType?) = this.method_7950(context, player, type)
/**
 * method_7951
 */
fun ItemStack.isSuitableFor(state: BlockState?) = this.method_7951(state)
/**
 * method_7924
 */
fun ItemStack.getMiningSpeedMultiplier(state: BlockState?) = this.method_7924(state)
/**
 * method_59692
 */
fun ItemStack.applyChanges(changes: ComponentChanges?) = this.method_59692(changes)
/**
 * method_57366
 */
fun ItemStack.applyUnvalidatedChanges(changes: ComponentChanges?) = this.method_57366(changes)
/**
 * method_7949
 */
fun ItemStack.usageTick(world: world_World?, user: LivingEntity?, remainingUseTicks: Int) = this.method_7949(world, user, remainingUseTicks)
/**
 * method_7933
 */
fun ItemStack.increment(amount: Int) = this.method_7933(amount)
/**
 * method_27320
 */
fun ItemStack.setHolder(holder: Entity?) = this.method_27320(holder)
/**
 * method_53187
 */
fun ItemStack.isIn(registryEntryList: RegistryEntryList<Item>?) = this.method_53187(registryEntryList)
/**
 * method_7965
 */
fun ItemStack.getBobbingAnimationTime() = this.method_7965()
/**
 * method_7958
 */
fun ItemStack.hasGlint() = this.method_7958()
/**
 * method_7981
 */
fun ItemStack.useOnBlock(context: ItemUsageContext?) = this.method_7981(context)
/**
 * method_7952
 */
fun ItemStack.postMine(world: world_World?, state: BlockState?, pos: BlockPos?, miner: PlayerEntity?) = this.method_7952(world, state, pos, miner)
/**
 * method_7932
 */
fun ItemStack.getRarity() = this.method_7932()
/**
 * method_7930
 */
fun ItemStack.onStoppedUsing(world: world_World?, user: LivingEntity?, remainingUseTicks: Int) = this.method_7930(world, user, remainingUseTicks)
/**
 * method_7986
 */
fun ItemStack.isDamaged() = this.method_7986()
/**
 * method_60503
 */
fun ItemStack.withItem(item: ItemConvertible?) = this.method_60503(item)
/**
 * method_7909
 */
fun ItemStack.getItem() = this.method_7909()
/**
 * method_7946
 */
fun ItemStack.isStackable() = this.method_7946()
/**
 * method_60504
 */
fun ItemStack.splitUnlessCreative(amount: Int, entity: LivingEntity?) = this.method_60504(amount, entity)
/**
 * method_57381
 */
fun <T>ItemStack.remove(type: ComponentType<out T>?) = this.method_57381<T>(type)
/**
 * method_46651
 */
fun ItemStack.copyWithCount(count: Int) = this.method_46651(count)
/**
 * method_31576
 */
fun ItemStack.onClicked(stack: ItemStack?, slot: Slot?, clickType: ClickType?, player: PlayerEntity?, cursorStackReference: StackReference?) = this.method_31576(stack, slot, clickType, player, cursorStackReference)
/**
 * method_7913
 */
fun ItemStack.use(world: world_World?, user: PlayerEntity?, hand: Hand?) = this.method_7913(world, user, hand)
/**
 * method_7963
 */
fun ItemStack.isDamageable() = this.method_7963()
/**
 * method_59979
 */
fun ItemStack.postDamageEntity(target: LivingEntity?, user: LivingEntity?) = this.method_59979(target, user)
/**
 * method_57375
 */
fun ItemStack.toNbtAllowEmpty(registries: net.minecraft.class_7225.class_7874?) = this.method_57375(registries)
/**
 * method_60986
 */
fun ItemStack.damage(amount: Int, itemAfterBreaking: ItemConvertible?, entity: LivingEntity?, slot: EquipmentSlot?) = this.method_60986(amount, itemAfterBreaking, entity, slot)
/**
 * method_7923
 */
fun ItemStack.isEnchantable() = this.method_7923()
/**
 * method_7917
 */
fun ItemStack.inventoryTick(world: world_World?, entity: Entity?, slot: Int, selected: Boolean) = this.method_7917(world, entity, slot, selected)
/**
 * method_7919
 */
fun ItemStack.getDamage() = this.method_7919()
/**
 * method_56701
 */
fun ItemStack.copyComponentsToNewStack(item: ItemConvertible?, count: Int) = this.method_56701(item, count)
