package me.hellrevenger.generated.Map_JukeboxManager
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<JukeboxManager>.TICKS_PER_SECOND by aliasStatic(JukeboxManager::field_52032)
fun JukeboxManager.setValues(arg0: RegistryEntry<JukeboxSong>, arg1: Long) = this.method_60758(arg0, arg1)
fun JukeboxManager.isPlaying() = this.method_60754()
fun JukeboxManager.getTicksSinceSongStarted() = this.method_60761()
fun JukeboxManager.stopPlaying(arg0: WorldAccess, arg1: BlockState) = this.method_60755(arg0, arg1)
fun JukeboxManager.getSong() = this.method_60759()
fun JukeboxManager.startPlaying(arg0: WorldAccess, arg1: RegistryEntry<JukeboxSong>) = this.method_60757(arg0, arg1)
fun JukeboxManager.tick(arg0: WorldAccess, arg1: BlockState) = this.method_60760(arg0, arg1)
