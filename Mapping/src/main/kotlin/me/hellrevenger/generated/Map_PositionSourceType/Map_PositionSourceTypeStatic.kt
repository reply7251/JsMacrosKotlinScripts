package me.hellrevenger.generated.Map_PositionSourceType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PositionSourceTypeKt {
    /**
     * method_32959
     */
    fun <T, S>register(id: String, positionSourceType: S) where T: PositionSource, S: PositionSourceType<T> = PositionSourceType.method_32959<S, T>(id, positionSourceType)
}