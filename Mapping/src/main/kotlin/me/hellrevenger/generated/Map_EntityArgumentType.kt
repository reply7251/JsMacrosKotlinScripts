package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityArgumentType

val EntityArgumentType.PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION by aliasStatic(EntityArgumentType::field_9861)
val EntityArgumentType.ENTITY_NOT_FOUND_EXCEPTION by aliasStatic(EntityArgumentType::field_9863)
val EntityArgumentType.PLAYER_NOT_FOUND_EXCEPTION by aliasStatic(EntityArgumentType::field_9856)
val EntityArgumentType.TOO_MANY_ENTITIES_EXCEPTION by aliasStatic(EntityArgumentType::field_9860)
val EntityArgumentType.NOT_ALLOWED_EXCEPTION by aliasStatic(EntityArgumentType::field_9862)
val EntityArgumentType.TOO_MANY_PLAYERS_EXCEPTION by aliasStatic(EntityArgumentType::field_9864)
fun KClass<EntityArgumentType>.getOptionalPlayers(arg0: CommandContext<ServerCommandSource>, arg1: String) = EntityArgumentType.method_9310(arg0, arg1)
fun KClass<EntityArgumentType>.entity() = EntityArgumentType.method_9309()
fun KClass<EntityArgumentType>.player() = EntityArgumentType.method_9305()
fun KClass<EntityArgumentType>.getPlayers(arg0: CommandContext<ServerCommandSource>, arg1: String) = EntityArgumentType.method_9312(arg0, arg1)
fun KClass<EntityArgumentType>.players() = EntityArgumentType.method_9308()
fun EntityArgumentType.parse(arg0: StringReader) = this.method_9318(arg0)
fun KClass<EntityArgumentType>.getPlayer(arg0: CommandContext<ServerCommandSource>, arg1: String) = EntityArgumentType.method_9315(arg0, arg1)
fun KClass<EntityArgumentType>.entities() = EntityArgumentType.method_9306()
fun KClass<EntityArgumentType>.getEntity(arg0: CommandContext<ServerCommandSource>, arg1: String) = EntityArgumentType.method_9313(arg0, arg1)
fun KClass<EntityArgumentType>.getEntities(arg0: CommandContext<ServerCommandSource>, arg1: String) = EntityArgumentType.method_9317(arg0, arg1)
fun KClass<EntityArgumentType>.getOptionalEntities(arg0: CommandContext<ServerCommandSource>, arg1: String) = EntityArgumentType.method_9307(arg0, arg1)
