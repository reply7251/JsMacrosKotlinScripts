package me.hellrevenger.generated.Map_NbtHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<NbtHelper>.DATA_KEY by aliasStatic(NbtHelper::field_33224)
fun KClass<NbtHelper>.matches(arg0: NbtElement, arg1: NbtElement, arg2: Boolean) = NbtHelper.method_10687(arg0, arg1, arg2)
fun KClass<NbtHelper>.toFormattedString(arg0: NbtElement) = NbtHelper.method_36118(arg0)
fun KClass<NbtHelper>.toFormattedString(arg0: NbtElement, arg1: Boolean) = NbtHelper.method_36117(arg0, arg1)
fun KClass<NbtHelper>.toBlockPos(arg0: NbtCompound, arg1: String) = NbtHelper.method_10691(arg0, arg1)
fun KClass<NbtHelper>.fromNbtProviderString(arg0: String) = NbtHelper.method_32260(arg0)
fun KClass<NbtHelper>.putDataVersion(arg0: NbtCompound) = NbtHelper.method_48310(arg0)
fun KClass<NbtHelper>.fromBlockState(arg0: BlockState) = NbtHelper.method_10686(arg0)
fun KClass<NbtHelper>.getDataVersion(arg0: NbtCompound, arg1: Int) = NbtHelper.method_48309(arg0, arg1)
fun KClass<NbtHelper>.toBlockState(arg0: RegistryEntryLookup<Block>, arg1: NbtCompound) = NbtHelper.method_10681(arg0, arg1)
fun KClass<NbtHelper>.fromBlockPos(arg0: BlockPos) = NbtHelper.method_10692(arg0)
fun KClass<NbtHelper>.fromUuid(arg0: UUID) = NbtHelper.method_25929(arg0)
fun KClass<NbtHelper>.putDataVersion(arg0: NbtCompound, arg1: Int) = NbtHelper.method_48308(arg0, arg1)
fun KClass<NbtHelper>.toUuid(arg0: NbtElement) = NbtHelper.method_25930(arg0)
fun KClass<NbtHelper>.toPrettyPrintedText(arg0: NbtElement) = NbtHelper.method_32270(arg0)
fun KClass<NbtHelper>.fromFluidState(arg0: FluidState) = NbtHelper.method_36115(arg0)
fun KClass<NbtHelper>.toNbtProviderString(arg0: NbtCompound) = NbtHelper.method_32271(arg0)
fun KClass<NbtHelper>.appendFormattedString(arg0: StringBuilder, arg1: NbtElement, arg2: Int, arg3: Boolean) = NbtHelper.method_36116(arg0, arg1, arg2, arg3)
