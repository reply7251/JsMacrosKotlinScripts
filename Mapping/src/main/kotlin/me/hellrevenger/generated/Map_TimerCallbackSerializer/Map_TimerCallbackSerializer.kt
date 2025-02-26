package me.hellrevenger.generated.Map_TimerCallbackSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_1306
 */
val <C>KClass<TimerCallbackSerializer<C>>.INSTANCE by aliasStatic({TimerCallbackSerializer.field_1306})
/**
 * method_973
 */
fun <C, T>TimerCallbackSerializer<C>.serialize(arg0: T) where T: TimerCallback<C> = this.method_973<T>(arg0)
/**
 * method_971
 */
fun <C>TimerCallbackSerializer<C>.registerSerializer(arg0: net.minecraft.class_234.class_235<C, *>) = this.method_971(arg0)
/**
 * method_972
 */
fun <C>TimerCallbackSerializer<C>.deserialize(arg0: NbtCompound) = this.method_972(arg0)
