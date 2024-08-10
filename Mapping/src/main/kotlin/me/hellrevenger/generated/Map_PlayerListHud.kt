package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerListHud

val PlayerListHud.MAX_ROWS by aliasStatic(PlayerListHud::field_32205)
fun PlayerListHud.getPlayerName(arg0: PlayerListEntry) = this.method_1918(arg0)
fun PlayerListHud.render(arg0: DrawContext, arg1: Int, arg2: Scoreboard, arg3: ScoreboardObjective) = this.method_1919(arg0, arg1, arg2, arg3)
fun PlayerListHud.setHeader(arg0: Text) = this.method_1925(arg0)
fun PlayerListHud.setVisible(arg0: Boolean) = this.method_1921(arg0)
fun PlayerListHud.clear() = this.method_1920()
fun PlayerListHud.setFooter(arg0: Text) = this.method_1924(arg0)
