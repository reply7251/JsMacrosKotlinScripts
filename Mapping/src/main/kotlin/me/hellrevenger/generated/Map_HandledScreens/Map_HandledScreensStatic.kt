package me.hellrevenger.generated.Map_HandledScreens
import kotlin.reflect.*
import me.hellrevenger.generated.*
object HandledScreensKt {
    /**
     * method_17541
     */
    fun <T>open(type: ScreenHandlerType<T>?, client: MinecraftClient?, id: Int, title: Text?) where T: ScreenHandler = HandledScreens.method_17541<T>(type, client, id, title)
    /**
     * method_17539
     */
    fun isMissingScreens() = HandledScreens.method_17539()
    /**
     * method_17542
     */
    fun <M, U>register(type: ScreenHandlerType<out M>?, provider: net.minecraft.class_3929.class_3930<M, U>?) where M: ScreenHandler, U: Screen, U: ScreenHandlerProvider<M> = HandledScreens.method_17542<M, U>(type, provider)
    /**
     * method_17540
     */
    fun <T>getProvider(type: ScreenHandlerType<T>?) where T: ScreenHandler = HandledScreens.method_17540<T>(type)
}