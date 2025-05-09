package me.hellrevenger.generated.Map_Uuids
import kotlin.reflect.*
import me.hellrevenger.generated.*
object UuidsKt {
    /**
     * field_39211
     */
    val BYTE_ARRAY_SIZE by aliasStatic(Uuids::field_39211)
    /**
     * method_26276
     */
    fun toUuid(array: IntArray) = Uuids.method_26276(array)
    /**
     * method_26275
     */
    fun toIntArray(uuid: UUID) = Uuids.method_26275(uuid)
    /**
     * method_43344
     */
    fun getOfflinePlayerUuid(nickname: String) = Uuids.method_43344(nickname)
    /**
     * method_54140
     */
    fun getOfflinePlayerProfile(nickname: String) = Uuids.method_54140(nickname)
    /**
     * method_44827
     */
    fun toByteArray(uuid: UUID) = Uuids.method_44827(uuid)
}