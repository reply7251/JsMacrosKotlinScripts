package me.hellrevenger.generated.Map_NbtComponent
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_57445
 */
fun NbtComponent.applyToEntity(entity: Entity) = this.method_57445(entity)
/**
 * method_57450
 */
fun NbtComponent.contains(key: String) = this.method_57450(key)
/**
 * method_57449
 */
fun NbtComponent.applyToBlockEntity(blockEntity: BlockEntity, registries: net.minecraft.class_7225.class_7874) = this.method_57449(blockEntity, registries)
/**
 * method_57451
 */
fun NbtComponent.apply(nbtConsumer: Consumer<NbtCompound>) = this.method_57451(nbtConsumer)
/**
 * method_57447
 */
fun <T>NbtComponent.with(ops: DynamicOps<NbtElement>, encoder: MapEncoder<T>, value: T) = this.method_57447<T>(ops, encoder, value)
/**
 * method_57446
 */
fun <T>NbtComponent.get(decoder: MapDecoder<T>) = this.method_57446<T>(decoder)
/**
 * method_57444
 */
fun NbtComponent.getSize() = this.method_57444()
/**
 * method_65131
 */
fun NbtComponent.getId() = this.method_65131()
/**
 * method_57460
 */
fun NbtComponent.matches(nbt: NbtCompound) = this.method_57460(nbt)
/**
 * method_59980
 */
fun <T>NbtComponent.get(ops: DynamicOps<NbtElement>, decoder: MapDecoder<T>) = this.method_59980<T>(ops, decoder)
/**
 * method_57463
 */
fun NbtComponent.getNbt() = this.method_57463()
/**
 * method_65904
 */
fun <T>NbtComponent.getRegistryValueOfId(registries: net.minecraft.class_7225.class_7874, registryRef: RegistryKey<out Registry<T>>) = this.method_65904<T>(registries, registryRef)
/**
 * method_57458
 */
fun NbtComponent.isEmpty() = this.method_57458()
/**
 * method_57461
 */
fun NbtComponent.copyNbt() = this.method_57461()
