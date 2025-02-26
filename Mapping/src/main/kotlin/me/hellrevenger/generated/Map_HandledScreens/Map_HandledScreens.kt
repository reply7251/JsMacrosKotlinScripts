package me.hellrevenger.generated.Map_HandledScreens
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_17541
 */
fun <T>KClass<HandledScreens>.open(arg0: ScreenHandlerType<T>, arg1: MinecraftClient, arg2: Int, arg3: Text) where T: ScreenHandler = HandledScreens.method_17541<T>(arg0, arg1, arg2, arg3)
/**
 * method_17539
 */
fun KClass<HandledScreens>.isMissingScreens() = HandledScreens.method_17539()
/**
 * method_17542
 */
fun <M, U>KClass<HandledScreens>.register(arg0: ScreenHandlerType<out M>, arg1: net.minecraft.class_3929.class_3930<M, U>) where M: ScreenHandler, U: Screen, U: ScreenHandlerProvider<M> = HandledScreens.method_17542<M, U>(arg0, arg1)
/**
 * method_17540
 */
fun <T>KClass<HandledScreens>.getProvider(arg0: ScreenHandlerType<T>) where T: ScreenHandler = HandledScreens.method_17540<T>(arg0)
