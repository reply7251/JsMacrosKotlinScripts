package me.hellrevenger.generated.Map_DataTracker
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DataTrackerKt {
    /**
     * method_12791
     */
    fun <T>registerData(entityClass: Class<out DataTracked>, dataHandler: TrackedDataHandler<T>) = DataTracker.method_12791<T>(entityClass, dataHandler)
}