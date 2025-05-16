package me.hellrevenger.generated.Map_NbtHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NbtHelperKt {
    /**
     * field_33224
     */
    val DATA_KEY by aliasStatic(NbtHelper::field_33224)
    /**
     * method_10687
     */
    fun matches(standard: NbtElement?, subject: NbtElement?, ignoreListOrder: Boolean) = NbtHelper.method_10687(standard, subject, ignoreListOrder)
    /**
     * method_36118
     */
    fun toFormattedString(nbt: NbtElement?) = NbtHelper.method_36118(nbt)
    /**
     * method_36117
     */
    fun toFormattedString(nbt: NbtElement?, withArrayContents: Boolean) = NbtHelper.method_36117(nbt, withArrayContents)
    /**
     * method_10691
     */
    fun toBlockPos(nbt: NbtCompound?, key: String?) = NbtHelper.method_10691(nbt, key)
    /**
     * method_32260
     */
    fun fromNbtProviderString(string: String?) = NbtHelper.method_32260(string)
    /**
     * method_48310
     */
    fun putDataVersion(nbt: NbtCompound?) = NbtHelper.method_48310(nbt)
    /**
     * method_10686
     */
    fun fromBlockState(state: BlockState?) = NbtHelper.method_10686(state)
    /**
     * method_48309
     */
    fun getDataVersion(nbt: NbtCompound?, fallback: Int) = NbtHelper.method_48309(nbt, fallback)
    /**
     * method_10681
     */
    fun toBlockState(blockLookup: RegistryEntryLookup<Block>?, nbt: NbtCompound?) = NbtHelper.method_10681(blockLookup, nbt)
    /**
     * method_10692
     */
    fun fromBlockPos(pos: BlockPos?) = NbtHelper.method_10692(pos)
    /**
     * method_25929
     */
    fun fromUuid(uuid: UUID?) = NbtHelper.method_25929(uuid)
    /**
     * method_48308
     */
    fun putDataVersion(nbt: NbtCompound?, dataVersion: Int) = NbtHelper.method_48308(nbt, dataVersion)
    /**
     * method_25930
     */
    fun toUuid(element: NbtElement?) = NbtHelper.method_25930(element)
    /**
     * method_32270
     */
    fun toPrettyPrintedText(element: NbtElement?) = NbtHelper.method_32270(element)
    /**
     * method_36115
     */
    fun fromFluidState(state: FluidState?) = NbtHelper.method_36115(state)
    /**
     * method_32271
     */
    fun toNbtProviderString(compound: NbtCompound?) = NbtHelper.method_32271(compound)
    /**
     * method_36116
     */
    fun appendFormattedString(stringBuilder: StringBuilder?, nbt: NbtElement?, depth: Int, withArrayContents: Boolean) = NbtHelper.method_36116(stringBuilder, nbt, depth, withArrayContents)
}