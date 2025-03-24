package me.hellrevenger.generated.Map_ItemStack
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_8031
 */
var ItemStack.count by alias(ItemStack::field_8031)
/**
 * field_8037
 */
val KClass<ItemStack>.EMPTY by aliasStatic(ItemStack::field_8037)
/**
 * method_65359
 */
fun ItemStack.getImmutableComponents() = this.method_65359()
/**
 * method_57373
 */
fun ItemStack.canBreak(arg0: CachedBlockPosition) = this.method_57373(arg0)
/**
 * method_7982
 */
fun ItemStack.onCraftByPlayer(arg0: world_World, arg1: PlayerEntity, arg2: Int) = this.method_7982(arg0, arg1, arg2)
/**
 * method_57008
 */
fun ItemStack.decrementUnlessCreative(arg0: Int, arg1: LivingEntity) = this.method_57008(arg0, arg1)
/**
 * method_27319
 */
fun ItemStack.getHolder() = this.method_27319()
/**
 * method_57357
 */
fun ItemStack.canPlaceOn(arg0: CachedBlockPosition) = this.method_57357(arg0)
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
fun ItemStack.damage(arg0: Int, arg1: LivingEntity, arg2: EquipmentSlot) = this.method_7970(arg0, arg1, arg2)
/**
 * method_57355
 */
fun KClass<ItemStack>.hashCode(arg0: ItemStack) = ItemStack.method_57355(arg0)
/**
 * method_7912
 */
fun ItemStack.setBobbingAnimationTime(arg0: Int) = this.method_7912(arg0)
/**
 * method_54466
 */
fun ItemStack.onCraftByCrafter(arg0: world_World) = this.method_54466(arg0)
/**
 * method_45435
 */
fun ItemStack.isItemEnabled(arg0: FeatureSet) = this.method_45435(arg0)
/**
 * method_31577
 */
fun KClass<ItemStack>.areItemsAndComponentsEqual(arg0: ItemStack, arg1: ItemStack) = ItemStack.method_31577(arg0, arg1)
/**
 * method_57354
 */
fun ItemStack.applyAttributeModifiers(arg0: EquipmentSlot, arg1: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>) = this.method_57354(arg0, arg1)
/**
 * method_7979
 */
fun ItemStack.postHit(arg0: LivingEntity, arg1: LivingEntity) = this.method_7979(arg0, arg1)
/**
 * method_57376
 */
fun ItemStack.toNbt(arg0: net.minecraft.class_7225.class_7874, arg1: NbtElement) = this.method_57376(arg0, arg1)
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
fun ItemStack.damage(arg0: Int, arg1: ServerWorld, arg2: ServerPlayerEntity, arg3: Consumer<Item>) = this.method_7956(arg0, arg1, arg2, arg3)
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
fun ItemStack.isIn(arg0: TagKey<Item>) = this.method_31573(arg0)
/**
 * method_57367
 */
fun <T, U>ItemStack.apply(arg0: ComponentType<T>, arg1: T, arg2: U, arg3: BiFunction<T, U, T>) = this.method_57367<T, U>(arg0, arg1, arg2, arg3)
/**
 * method_7978
 */
fun ItemStack.addEnchantment(arg0: RegistryEntry<Enchantment>, arg1: Int) = this.method_7978(arg0, arg1)
/**
 * method_57362
 */
fun KClass<ItemStack>.stacksEqual(arg0: MutableList<ItemStack>, arg1: MutableList<ItemStack>) = ItemStack.method_57362(arg0, arg1)
/**
 * method_7974
 */
fun ItemStack.setDamage(arg0: Int) = this.method_7974(arg0)
/**
 * method_58408
 */
fun ItemStack.capCount(arg0: Int) = this.method_58408(arg0)
/**
 * method_7920
 */
fun ItemStack.useOnEntity(arg0: PlayerEntity, arg1: LivingEntity, arg2: Hand) = this.method_7920(arg0, arg1, arg2)
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
fun ItemStack.damage(arg0: Int, arg1: PlayerEntity) = this.method_61653(arg0, arg1)
/**
 * method_7914
 */
fun ItemStack.getMaxCount() = this.method_7914()
/**
 * method_57365
 */
fun ItemStack.applyComponentsFrom(arg0: ComponentMap) = this.method_57365(arg0)
/**
 * method_7934
 */
fun ItemStack.decrement(arg0: Int) = this.method_7934(arg0)
/**
 * method_7954
 */
fun ItemStack.toHoverableText() = this.method_7954()
/**
 * method_57368
 */
fun <T>ItemStack.apply(arg0: ComponentType<T>, arg1: T, arg2: UnaryOperator<T>) = this.method_57368<T>(arg0, arg1, arg2)
/**
 * method_63015
 */
fun ItemStack.getFormattedName() = this.method_63015()
/**
 * method_41407
 */
fun ItemStack.itemMatches(arg0: Predicate<RegistryEntry<Item>>) = this.method_41407(arg0)
/**
 * method_57360
 */
fun KClass<ItemStack>.fromNbt(arg0: net.minecraft.class_7225.class_7874, arg1: NbtElement) = ItemStack.method_57360(arg0, arg1)
/**
 * method_7935
 */
fun ItemStack.getMaxUseTime(arg0: LivingEntity) = this.method_7935(arg0)
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
fun ItemStack.canRepairWith(arg0: ItemStack) = this.method_61655(arg0)
/**
 * method_7910
 */
fun ItemStack.finishUsing(arg0: world_World, arg1: LivingEntity) = this.method_7910(arg0, arg1)
/**
 * method_7976
 */
fun ItemStack.getUseAction() = this.method_7976()
/**
 * method_59693
 */
fun KClass<ItemStack>.createExtraValidatingPacketCodec(arg0: PacketCodec<RegistryByteBuf, ItemStack>) = ItemStack.method_59693(arg0)
/**
 * method_7971
 */
fun ItemStack.split(arg0: Int) = this.method_7971(arg0)
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
fun ItemStack.hasChangedComponent(arg0: ComponentType<*>) = this.method_65797(arg0)
/**
 * method_60617
 */
fun ItemStack.applyAttributeModifier(arg0: AttributeModifierSlot, arg1: BiConsumer<RegistryEntry<EntityAttribute>, EntityAttributeModifier>) = this.method_60617(arg0, arg1)
/**
 * method_31575
 */
fun ItemStack.onStackClicked(arg0: Slot, arg1: ClickType, arg2: PlayerEntity) = this.method_31575(arg0, arg1, arg2)
/**
 * method_41406
 */
fun ItemStack.itemMatches(arg0: RegistryEntry<Item>) = this.method_41406(arg0)
/**
 * method_57361
 */
fun KClass<ItemStack>.listHashCode(arg0: MutableList<ItemStack>) = ItemStack.method_57361(arg0)
/**
 * method_56702
 */
fun KClass<ItemStack>.createOptionalCodec(arg0: String) = ItemStack.method_56702(arg0)
/**
 * method_57358
 */
fun ItemStack.toNbt(arg0: net.minecraft.class_7225.class_7874) = this.method_57358(arg0)
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
fun ItemStack.takesDamageFrom(arg0: DamageSource) = this.method_58407(arg0)
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
fun ItemStack.isOf(arg0: Item) = this.method_31574(arg0)
/**
 * method_33262
 */
fun ItemStack.onItemEntityDestroyed(arg0: ItemEntity) = this.method_33262(arg0)
/**
 * method_57379
 */
fun <T>ItemStack.set(arg0: ComponentType<in T>, arg1: T) = this.method_57379<T>(arg0, arg1)
/**
 * method_7950
 */
fun ItemStack.getTooltip(arg0: net.minecraft.class_1792.class_9635, arg1: PlayerEntity, arg2: TooltipType) = this.method_7950(arg0, arg1, arg2)
/**
 * method_7951
 */
fun ItemStack.isSuitableFor(arg0: BlockState) = this.method_7951(arg0)
/**
 * method_7924
 */
fun ItemStack.getMiningSpeedMultiplier(arg0: BlockState) = this.method_7924(arg0)
/**
 * method_59692
 */
fun ItemStack.applyChanges(arg0: ComponentChanges) = this.method_59692(arg0)
/**
 * method_57366
 */
fun ItemStack.applyUnvalidatedChanges(arg0: ComponentChanges) = this.method_57366(arg0)
/**
 * method_7949
 */
fun ItemStack.usageTick(arg0: world_World, arg1: LivingEntity, arg2: Int) = this.method_7949(arg0, arg1, arg2)
/**
 * method_7933
 */
fun ItemStack.increment(arg0: Int) = this.method_7933(arg0)
/**
 * method_27320
 */
fun ItemStack.setHolder(arg0: Entity) = this.method_27320(arg0)
/**
 * method_53187
 */
fun ItemStack.isIn(arg0: RegistryEntryList<Item>) = this.method_53187(arg0)
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
fun ItemStack.useOnBlock(arg0: ItemUsageContext) = this.method_7981(arg0)
/**
 * method_7952
 */
fun ItemStack.postMine(arg0: world_World, arg1: BlockState, arg2: BlockPos, arg3: PlayerEntity) = this.method_7952(arg0, arg1, arg2, arg3)
/**
 * method_59691
 */
fun KClass<ItemStack>.validateComponents(arg0: ComponentMap) = ItemStack.method_59691(arg0)
/**
 * method_7932
 */
fun ItemStack.getRarity() = this.method_7932()
/**
 * method_7930
 */
fun ItemStack.onStoppedUsing(arg0: world_World, arg1: LivingEntity, arg2: Int) = this.method_7930(arg0, arg1, arg2)
/**
 * method_7986
 */
fun ItemStack.isDamaged() = this.method_7986()
/**
 * method_60503
 */
fun ItemStack.withItem(arg0: ItemConvertible) = this.method_60503(arg0)
/**
 * method_7909
 */
fun ItemStack.getItem() = this.method_7909()
/**
 * method_7946
 */
fun ItemStack.isStackable() = this.method_7946()
/**
 * method_7984
 */
fun KClass<ItemStack>.areItemsEqual(arg0: ItemStack, arg1: ItemStack) = ItemStack.method_7984(arg0, arg1)
/**
 * method_60504
 */
fun ItemStack.splitUnlessCreative(arg0: Int, arg1: LivingEntity) = this.method_60504(arg0, arg1)
/**
 * method_57381
 */
fun <T>ItemStack.remove(arg0: ComponentType<out T>) = this.method_57381<T>(arg0)
/**
 * method_46651
 */
fun ItemStack.copyWithCount(arg0: Int) = this.method_46651(arg0)
/**
 * method_31576
 */
fun ItemStack.onClicked(arg0: ItemStack, arg1: Slot, arg2: ClickType, arg3: PlayerEntity, arg4: StackReference) = this.method_31576(arg0, arg1, arg2, arg3, arg4)
/**
 * method_7913
 */
fun ItemStack.use(arg0: world_World, arg1: PlayerEntity, arg2: Hand) = this.method_7913(arg0, arg1, arg2)
/**
 * method_7963
 */
fun ItemStack.isDamageable() = this.method_7963()
/**
 * method_59979
 */
fun ItemStack.postDamageEntity(arg0: LivingEntity, arg1: LivingEntity) = this.method_59979(arg0, arg1)
/**
 * method_57375
 */
fun ItemStack.toNbtAllowEmpty(arg0: net.minecraft.class_7225.class_7874) = this.method_57375(arg0)
/**
 * method_60986
 */
fun ItemStack.damage(arg0: Int, arg1: ItemConvertible, arg2: LivingEntity, arg3: EquipmentSlot) = this.method_60986(arg0, arg1, arg2, arg3)
/**
 * method_7923
 */
fun ItemStack.isEnchantable() = this.method_7923()
/**
 * method_57359
 */
fun KClass<ItemStack>.fromNbtOrEmpty(arg0: net.minecraft.class_7225.class_7874, arg1: NbtCompound) = ItemStack.method_57359(arg0, arg1)
/**
 * method_7917
 */
fun ItemStack.inventoryTick(arg0: world_World, arg1: Entity, arg2: Int, arg3: Boolean) = this.method_7917(arg0, arg1, arg2, arg3)
/**
 * method_7919
 */
fun ItemStack.getDamage() = this.method_7919()
/**
 * method_7973
 */
fun KClass<ItemStack>.areEqual(arg0: ItemStack, arg1: ItemStack) = ItemStack.method_7973(arg0, arg1)
/**
 * method_56701
 */
fun ItemStack.copyComponentsToNewStack(arg0: ItemConvertible, arg1: Int) = this.method_56701(arg0, arg1)
