package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PendingInvite

val PendingInvite.invitationId by alias(PendingInvite::field_22580)
val PendingInvite.worldName by alias(PendingInvite::field_22581)
val PendingInvite.worldOwnerName by alias(PendingInvite::field_22582)
val PendingInvite.worldOwnerUuid by alias(PendingInvite::field_22583)
val PendingInvite.date by alias(PendingInvite::field_22584)
fun KClass<PendingInvite>.parse(arg0: JsonObject) = PendingInvite.method_25040(arg0)
