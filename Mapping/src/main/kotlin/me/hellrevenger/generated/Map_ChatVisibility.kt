package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChatVisibility

val ChatVisibility.HIDDEN by aliasEnum(ChatVisibility::class, "field_7536")
val ChatVisibility.FULL by aliasEnum(ChatVisibility::class, "field_7538")
val ChatVisibility.SYSTEM by aliasEnum(ChatVisibility::class, "field_7539")
fun KClass<ChatVisibility>.byId(arg0: Int) = ChatVisibility.method_7360(arg0)
