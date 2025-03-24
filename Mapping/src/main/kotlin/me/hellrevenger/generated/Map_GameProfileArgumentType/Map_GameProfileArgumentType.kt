package me.hellrevenger.generated.Map_GameProfileArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_9869
 */
val KClass<GameProfileArgumentType>.UNKNOWN_PLAYER_EXCEPTION by aliasStatic(GameProfileArgumentType::field_9869)
/**
 * method_61180
 */
fun GameProfileArgumentType.parse(arg0: StringReader) = this.method_61180(arg0)
/**
 * method_9329
 */
fun KClass<GameProfileArgumentType>.gameProfile() = GameProfileArgumentType.method_9329()
/**
 * method_61181
 */
fun <S>GameProfileArgumentType.parse(arg0: StringReader, arg1: S) = this.method_61181<S>(arg0, arg1)
/**
 * method_9330
 */
fun KClass<GameProfileArgumentType>.getProfileArgument(arg0: CommandContext<ServerCommandSource>, arg1: String) = GameProfileArgumentType.method_9330(arg0, arg1)
