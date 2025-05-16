package me.hellrevenger.generated.Map_LegacyQueries
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LegacyQueriesKt {
    /**
     * field_44992
     */
    val HEADER by aliasStatic(LegacyQueries::field_44992)
    /**
     * field_44994
     */
    val QUERY_PACKET_ID by aliasStatic(LegacyQueries::field_44994)
    /**
     * field_44993
     */
    val PING_HOST by aliasStatic(LegacyQueries::field_44993)
    /**
     * field_44996
     */
    val BUFFER_SIZE by aliasStatic(LegacyQueries::field_44996)
    /**
     * field_44997
     */
    val PROTOCOL_VERSION by aliasStatic(LegacyQueries::field_44997)
    /**
     * method_52377
     */
    fun read(buf: ByteBuf?) = LegacyQueries.method_52377(buf)
    /**
     * method_52378
     */
    fun write(buf: ByteBuf?, string: String?) = LegacyQueries.method_52378(buf, string)
}