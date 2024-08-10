package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpectatorMenu

val SpectatorMenu.BLANK_COMMAND by aliasStatic(SpectatorMenu::field_3260)
fun SpectatorMenu.getCurrentState() = this.method_2772()
fun SpectatorMenu.getSelectedCommand() = this.method_2774()
fun SpectatorMenu.getCommand(arg0: Int) = this.method_2777(arg0)
fun SpectatorMenu.getCommands() = this.method_2770()
fun SpectatorMenu.selectElement(arg0: SpectatorMenuCommandGroup) = this.method_2778(arg0)
fun SpectatorMenu.useCommand(arg0: Int) = this.method_2771(arg0)
fun SpectatorMenu.close() = this.method_2779()
