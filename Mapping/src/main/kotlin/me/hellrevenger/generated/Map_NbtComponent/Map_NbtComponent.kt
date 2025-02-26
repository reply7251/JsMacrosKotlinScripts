package me.hellrevenger.generated.Map_NbtComponent
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_49302
 */
val KClass<NbtComponent>.DEFAULT by aliasStatic(NbtComponent::field_49302)
/**
 * field_49304
 */
val KClass<NbtComponent>.CODEC_WITH_ID by aliasStatic(NbtComponent::field_49304)
/**
 * method_57454
 */
fun KClass<NbtComponent>.createPredicate(arg0: ComponentType<NbtComponent>, arg1: NbtCompound) = NbtComponent.method_57454(arg0, arg1)
/**
 * method_57445
 */
fun NbtComponent.applyToEntity(arg0: Entity) = this.method_57445(arg0)
/**
 * method_57450
 */
fun NbtComponent.contains(arg0: String) = this.method_57450(arg0)
/**
 * method_57449
 */
fun NbtComponent.applyToBlockEntity(arg0: BlockEntity, arg1: net.minecraft.class_7225.class_7874) = this.method_57449(arg0, arg1)
/**
 * method_57451
 */
fun NbtComponent.apply(arg0: Consumer<NbtCompound>) = this.method_57451(arg0)
/**
 * method_57447
 */
fun <T>NbtComponent.with(arg0: DynamicOps<NbtElement>, arg1: MapEncoder<T>, arg2: T) = this.method_57447<T>(arg0, arg1, arg2)
/**
 * method_57446
 */
fun <T>NbtComponent.get(arg0: MapDecoder<T>) = this.method_57446<T>(arg0)
/**
 * method_57444
 */
fun NbtComponent.getSize() = this.method_57444()
/**
 * method_57460
 */
fun NbtComponent.matches(arg0: NbtCompound) = this.method_57460(arg0)
/**
 * method_57452
 */
fun KClass<NbtComponent>.set(arg0: ComponentType<NbtComponent>, arg1: ItemStack, arg2: Consumer<NbtCompound>) = NbtComponent.method_57452(arg0, arg1, arg2)
/**
 * method_59980
 */
fun <T>NbtComponent.get(arg0: DynamicOps<NbtElement>, arg1: MapDecoder<T>) = this.method_59980<T>(arg0, arg1)
/**
 * method_57463
 */
fun NbtComponent.getNbt() = this.method_57463()
/**
 * method_57458
 */
fun NbtComponent.isEmpty() = this.method_57458()
/**
 * method_57453
 */
fun KClass<NbtComponent>.set(arg0: ComponentType<NbtComponent>, arg1: ItemStack, arg2: NbtCompound) = NbtComponent.method_57453(arg0, arg1, arg2)
/**
 * method_57456
 */
fun KClass<NbtComponent>.of(arg0: NbtCompound) = NbtComponent.method_57456(arg0)
/**
 * method_57461
 */
fun NbtComponent.copyNbt() = this.method_57461()
