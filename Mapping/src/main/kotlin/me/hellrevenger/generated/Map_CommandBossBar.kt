package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CommandBossBar

fun KClass<CommandBossBar>.fromNbt(arg0: NbtCompound, arg1: Identifier, arg2: net.minecraft.class_7225.class_7874) = CommandBossBar.method_12966(arg0, arg1, arg2)
fun CommandBossBar.toHoverableText() = this.method_12965()
fun CommandBossBar.addPlayer(arg0: UUID) = this.method_12964(arg0)
fun CommandBossBar.addPlayers(arg0: Collection<ServerPlayerEntity>) = this.method_12962(arg0)
fun CommandBossBar.toNbt(arg0: net.minecraft.class_7225.class_7874) = this.method_12963(arg0)
fun CommandBossBar.setMaxValue(arg0: Int) = this.method_12956(arg0)
fun CommandBossBar.setValue(arg0: Int) = this.method_12954(arg0)
fun CommandBossBar.onPlayerDisconnect(arg0: ServerPlayerEntity) = this.method_12961(arg0)
fun CommandBossBar.onPlayerConnect(arg0: ServerPlayerEntity) = this.method_12957(arg0)
