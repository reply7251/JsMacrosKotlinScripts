package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Backup

val Backup.size by alias(Backup::field_22571)
val Backup.lastModifiedDate by alias(Backup::field_22570)
val Backup.metadata by alias(Backup::field_22572)
val Backup.changeList by alias(Backup::field_22573)
val Backup.backupId by alias(Backup::field_22569)
fun Backup.setUploadedVersion(arg0: Boolean) = this.method_25035(arg0)
fun Backup.isUploadedVersion() = this.method_25032()
fun KClass<Backup>.parse(arg0: JsonElement) = Backup.method_25033(arg0)
