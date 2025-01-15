package me.hellrevenger.generated.Map_LegacyQueries
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<LegacyQueries>.HEADER by aliasStatic(LegacyQueries::field_44992)
val KClass<LegacyQueries>.QUERY_PACKET_ID by aliasStatic(LegacyQueries::field_44994)
val KClass<LegacyQueries>.PING_HOST by aliasStatic(LegacyQueries::field_44993)
val KClass<LegacyQueries>.BUFFER_SIZE by aliasStatic(LegacyQueries::field_44996)
val KClass<LegacyQueries>.PROTOCOL_VERSION by aliasStatic(LegacyQueries::field_44997)
fun KClass<LegacyQueries>.read(arg0: ByteBuf) = LegacyQueries.method_52377(arg0)
fun KClass<LegacyQueries>.write(arg0: ByteBuf, arg1: String) = LegacyQueries.method_52378(arg0, arg1)
