package me.hellrevenger.generated.Map_NbtComponent
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NbtComponentKt {
    /**
     * field_49302
     */
    val DEFAULT by aliasStatic(NbtComponent::field_49302)
    /**
     * field_49304
     */
    val CODEC_WITH_ID by aliasStatic(NbtComponent::field_49304)
    /**
     * method_57454
     */
    fun createPredicate(type: ComponentType<NbtComponent>, nbt: NbtCompound) = NbtComponent.method_57454(type, nbt)
    /**
     * method_57452
     */
    fun set(type: ComponentType<NbtComponent>, stack: ItemStack, nbtSetter: Consumer<NbtCompound>) = NbtComponent.method_57452(type, stack, nbtSetter)
    /**
     * method_57453
     */
    fun set(type: ComponentType<NbtComponent>, stack: ItemStack, nbt: NbtCompound) = NbtComponent.method_57453(type, stack, nbt)
    /**
     * method_57456
     */
    fun of(nbt: NbtCompound) = NbtComponent.method_57456(nbt)
}