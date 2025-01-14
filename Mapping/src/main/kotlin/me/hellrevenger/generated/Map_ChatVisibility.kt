package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChatVisibility

val KClass<ChatVisibility>.HIDDEN by aliasEnum(ChatVisibility::class, "field_7536")
val KClass<ChatVisibility>.FULL by aliasEnum(ChatVisibility::class, "field_7538")
val KClass<ChatVisibility>.SYSTEM by aliasEnum(ChatVisibility::class, "field_7539")
fun KClass<ChatVisibility>.byId(arg0: Int) = ChatVisibility.method_7360(arg0)
