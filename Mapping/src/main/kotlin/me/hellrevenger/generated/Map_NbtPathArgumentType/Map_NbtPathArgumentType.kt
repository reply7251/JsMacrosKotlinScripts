package me.hellrevenger.generated.Map_NbtPathArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<NbtPathArgumentType>.TOO_DEEP_EXCEPTION by aliasStatic(NbtPathArgumentType::field_41706)
val KClass<NbtPathArgumentType>.NOTHING_FOUND_EXCEPTION by aliasStatic(NbtPathArgumentType::field_9899)
val KClass<NbtPathArgumentType>.INVALID_PATH_NODE_EXCEPTION by aliasStatic(NbtPathArgumentType::field_9900)
fun KClass<NbtPathArgumentType>.getNbtPath(arg0: CommandContext<ServerCommandSource>, arg1: String) = NbtPathArgumentType.method_9358(arg0, arg1)
fun KClass<NbtPathArgumentType>.nbtPath() = NbtPathArgumentType.method_9360()
fun NbtPathArgumentType.parse(arg0: StringReader) = this.method_9362(arg0)
