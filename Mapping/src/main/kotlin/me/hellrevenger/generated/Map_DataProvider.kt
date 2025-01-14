package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DataProvider

fun DataProvider.run(arg0: DataWriter) = this.method_10319(arg0)
fun KClass<DataProvider>.writeToPath(arg0: DataWriter, arg1: JsonElement, arg2: file_Path) = DataProvider.method_10320(arg0, arg1, arg2)
fun <T>KClass<DataProvider>.writeCodecToPath(arg0: DataWriter, arg1: net.minecraft.class_7225.class_7874, arg2: Codec<T>, arg3: T, arg4: file_Path) = DataProvider.method_53496<T>(arg0, arg1, arg2, arg3, arg4)
fun DataProvider.getName() = this.method_10321()
