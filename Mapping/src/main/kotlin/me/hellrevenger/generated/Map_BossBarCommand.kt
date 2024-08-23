package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BossBarCommand

val KClass<BossBarCommand>.SUGGESTION_PROVIDER by aliasStatic(BossBarCommand::field_13482)
fun KClass<BossBarCommand>.getBossBar(arg0: CommandContext<ServerCommandSource>) = BossBarCommand.method_13054(arg0)
fun KClass<BossBarCommand>.register(arg0: CommandDispatcher<ServerCommandSource>, arg1: CommandRegistryAccess) = BossBarCommand.method_13053(arg0, arg1)
