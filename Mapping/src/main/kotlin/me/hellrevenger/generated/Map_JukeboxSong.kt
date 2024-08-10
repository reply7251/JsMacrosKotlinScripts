package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.JukeboxSong

val JukeboxSong.ENTRY_PACKET_CODEC by aliasStatic(JukeboxSong::field_52030)
val JukeboxSong.PACKET_CODEC by aliasStatic(JukeboxSong::field_52028)
val JukeboxSong.ENTRY_CODEC by aliasStatic(JukeboxSong::field_52029)
fun JukeboxSong.shouldStopPlaying(arg0: Long) = this.method_60751(arg0)
fun KClass<JukeboxSong>.getSongEntryFromStack(arg0: net.minecraft.class_7225.class_7874, arg1: ItemStack) = JukeboxSong.method_60753(arg0, arg1)
fun JukeboxSong.getLengthInTicks() = this.method_60750()
fun JukeboxSong.description() = this.comp_2836()
fun JukeboxSong.soundEvent() = this.comp_2835()
fun JukeboxSong.lengthInSeconds() = this.comp_2837()
fun JukeboxSong.comparatorOutput() = this.comp_2838()
