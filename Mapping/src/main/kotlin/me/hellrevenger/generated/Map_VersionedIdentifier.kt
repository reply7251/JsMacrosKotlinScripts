package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VersionedIdentifier

val VersionedIdentifier.PACKET_CODEC by aliasStatic(VersionedIdentifier::field_49035)
val VersionedIdentifier.DEFAULT_NAMESPACE by aliasStatic(VersionedIdentifier::field_49036)
fun KClass<VersionedIdentifier>.createVanilla(arg0: String) = VersionedIdentifier.method_56932(arg0)
fun VersionedIdentifier.isVanilla() = this.method_56931()
fun VersionedIdentifier.version() = this.comp_2338()
fun VersionedIdentifier.id() = this.comp_2337()
fun VersionedIdentifier.namespace() = this.comp_2336()
