package me.hellrevenger.generated.Map_ItemStack
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ItemStackKt {
    /**
     * field_8037
     */
    val EMPTY by aliasStatic(ItemStack::field_8037)
    /**
     * method_57355
     */
    fun hashCode(stack: ItemStack) = ItemStack.method_57355(stack)
    /**
     * method_31577
     */
    fun areItemsAndComponentsEqual(stack: ItemStack, otherStack: ItemStack) = ItemStack.method_31577(stack, otherStack)
    /**
     * method_57362
     */
    fun stacksEqual(left: MutableList<ItemStack>, right: MutableList<ItemStack>) = ItemStack.method_57362(left, right)
    /**
     * method_57360
     */
    fun fromNbt(registries: net.minecraft.class_7225.class_7874, nbt: NbtElement) = ItemStack.method_57360(registries, nbt)
    /**
     * method_59693
     */
    fun createExtraValidatingPacketCodec(basePacketCodec: PacketCodec<RegistryByteBuf, ItemStack>) = ItemStack.method_59693(basePacketCodec)
    /**
     * method_57361
     */
    fun listHashCode(stacks: MutableList<ItemStack>) = ItemStack.method_57361(stacks)
    /**
     * method_56702
     */
    fun createOptionalCodec(fieldName: String) = ItemStack.method_56702(fieldName)
    /**
     * method_59691
     */
    fun validateComponents(components: ComponentMap) = ItemStack.method_59691(components)
    /**
     * method_7984
     */
    fun areItemsEqual(left: ItemStack, right: ItemStack) = ItemStack.method_7984(left, right)
    /**
     * method_57359
     */
    fun fromNbtOrEmpty(registries: net.minecraft.class_7225.class_7874, nbt: NbtCompound) = ItemStack.method_57359(registries, nbt)
    /**
     * method_7973
     */
    fun areEqual(left: ItemStack, right: ItemStack) = ItemStack.method_7973(left, right)
}