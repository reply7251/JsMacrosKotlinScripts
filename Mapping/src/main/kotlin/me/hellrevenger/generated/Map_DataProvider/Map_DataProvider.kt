package me.hellrevenger.generated.Map_DataProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_64108
 */
fun <T>KClass<DataProvider>.writeCodecToPath(arg0: DataWriter, arg1: Codec<T>, arg2: T, arg3: file_Path) = DataProvider.method_64108<T>(arg0, arg1, arg2, arg3)
/**
 * method_64110
 */
fun <T>KClass<DataProvider>.writeAllToPath(arg0: DataWriter, arg1: Codec<T>, arg2: net.minecraft.class_7784.class_7489, arg3: Map<Identifier, T>) = DataProvider.method_64110<T>(arg0, arg1, arg2, arg3)
/**
 * method_65772
 */
fun <T, E>KClass<DataProvider>.writeAllToPath(arg0: DataWriter, arg1: function_Function<E, JsonElement>, arg2: function_Function<T, file_Path>, arg3: Map<T, E>) = DataProvider.method_65772<T, E>(arg0, arg1, arg2, arg3)
/**
 * method_10321
 */
fun DataProvider.getName() = this.method_10321()
/**
 * method_65771
 */
fun <T, E>KClass<DataProvider>.writeAllToPath(arg0: DataWriter, arg1: Codec<E>, arg2: function_Function<T, file_Path>, arg3: Map<T, E>) = DataProvider.method_65771<T, E>(arg0, arg1, arg2, arg3)
/**
 * method_10319
 */
fun DataProvider.run(arg0: DataWriter) = this.method_10319(arg0)
/**
 * method_10320
 */
fun KClass<DataProvider>.writeToPath(arg0: DataWriter, arg1: JsonElement, arg2: file_Path) = DataProvider.method_10320(arg0, arg1, arg2)
/**
 * method_53496
 */
fun <T>KClass<DataProvider>.writeCodecToPath(arg0: DataWriter, arg1: net.minecraft.class_7225.class_7874, arg2: Codec<T>, arg3: T, arg4: file_Path) = DataProvider.method_53496<T>(arg0, arg1, arg2, arg3, arg4)
