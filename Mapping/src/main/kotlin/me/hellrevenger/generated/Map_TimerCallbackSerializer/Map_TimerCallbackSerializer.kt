package me.hellrevenger.generated.Map_TimerCallbackSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_973
 */
fun <C, T>TimerCallbackSerializer<C>.serialize(callback: T) where T: TimerCallback<C> = this.method_973<T>(callback)
/**
 * method_971
 */
fun <C>TimerCallbackSerializer<C>.registerSerializer(serializer: net.minecraft.class_234.class_235<C, *>) = this.method_971(serializer)
/**
 * method_972
 */
fun <C>TimerCallbackSerializer<C>.deserialize(nbt: NbtCompound) = this.method_972(nbt)
