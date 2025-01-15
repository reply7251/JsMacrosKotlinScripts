package me.hellrevenger.generated.Map_PositionSourceType
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>PositionSourceType<T>.getPacketCodec() where T: PositionSource = this.method_56123()
fun <T>PositionSourceType<T>.getCodec() where T: PositionSource = this.method_32957()
fun <T, S>KClass<PositionSourceType<T>>.register(arg0: String, arg1: S) where T: PositionSource, S: PositionSourceType<T> = PositionSourceType.method_32959<S, T>(arg0, arg1)
