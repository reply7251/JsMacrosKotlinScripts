package me.hellrevenger.generated.Map_SizeUnit
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SizeUnitKt {
    /**
     * field_20202
     */
    val MB by aliasEnum(SizeUnit::class, "field_20202")
    /**
     * field_20201
     */
    val KB by aliasEnum(SizeUnit::class, "field_20201")
    /**
     * field_20200
     */
    val B by aliasEnum(SizeUnit::class, "field_20200")
    /**
     * field_20203
     */
    val GB by aliasEnum(SizeUnit::class, "field_20203")
    /**
     * method_25028
     */
    fun convertToUnit(bytes: Long, arg1: SizeUnit?) = SizeUnit.method_25028(bytes, arg1)
    /**
     * method_25029
     */
    fun getUserFriendlyString(bytes: Long) = SizeUnit.method_25029(bytes)
    /**
     * method_25027
     */
    fun getLargestUnit(bytes: Long) = SizeUnit.method_25027(bytes)
    /**
     * method_25030
     */
    fun humanReadableSize(bytes: Long, arg1: SizeUnit?) = SizeUnit.method_25030(bytes, arg1)
}