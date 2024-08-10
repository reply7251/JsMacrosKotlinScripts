package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GameProfileArgumentType

val GameProfileArgumentType.UNKNOWN_PLAYER_EXCEPTION by aliasStatic(GameProfileArgumentType::field_9869)
fun GameProfileArgumentType.parse(arg0: StringReader) = this.method_9331(arg0)
fun KClass<GameProfileArgumentType>.gameProfile() = GameProfileArgumentType.method_9329()
fun KClass<GameProfileArgumentType>.getProfileArgument(arg0: CommandContext<ServerCommandSource>, arg1: String) = GameProfileArgumentType.method_9330(arg0, arg1)
