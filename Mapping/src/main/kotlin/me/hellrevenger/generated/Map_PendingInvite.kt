package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PendingInvite

var PendingInvite.invitationId by alias(PendingInvite::field_22580)
var PendingInvite.worldName by alias(PendingInvite::field_22581)
var PendingInvite.worldOwnerName by alias(PendingInvite::field_22582)
var PendingInvite.worldOwnerUuid by alias(PendingInvite::field_22583)
var PendingInvite.date by alias(PendingInvite::field_22584)
fun KClass<PendingInvite>.parse(arg0: JsonObject) = PendingInvite.method_25040(arg0)
