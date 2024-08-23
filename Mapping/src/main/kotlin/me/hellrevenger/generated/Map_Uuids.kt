package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Uuids

val KClass<Uuids>.BYTE_ARRAY_SIZE by aliasStatic(Uuids::field_39211)
fun KClass<Uuids>.toUuid(arg0: IntArray) = Uuids.method_26276(arg0)
fun KClass<Uuids>.toIntArray(arg0: UUID) = Uuids.method_26275(arg0)
fun KClass<Uuids>.getOfflinePlayerUuid(arg0: String) = Uuids.method_43344(arg0)
fun KClass<Uuids>.getOfflinePlayerProfile(arg0: String) = Uuids.method_54140(arg0)
fun KClass<Uuids>.toByteArray(arg0: UUID) = Uuids.method_44827(arg0)
fun KClass<Uuids>.toUuid(arg0: Dynamic<*>) = Uuids.method_35848(arg0)
