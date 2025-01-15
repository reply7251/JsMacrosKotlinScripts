package me.hellrevenger.generated.Map_UuidArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<UuidArgumentType>.INVALID_UUID by aliasStatic(UuidArgumentType::field_24318)
fun KClass<UuidArgumentType>.getUuid(arg0: CommandContext<ServerCommandSource>, arg1: String) = UuidArgumentType.method_27645(arg0, arg1)
fun KClass<UuidArgumentType>.uuid() = UuidArgumentType.method_27643()
fun UuidArgumentType.parse(arg0: StringReader) = this.method_27644(arg0)
