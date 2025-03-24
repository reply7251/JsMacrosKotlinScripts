package me.hellrevenger.generated.Map_SoundSystem
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_34827
 */
val KClass<SoundSystem>.OPENAL_SOFT_ON by aliasStatic(SoundSystem::field_34827)
/**
 * field_33020
 */
val KClass<SoundSystem>.FOR_THE_DEBUG by aliasStatic(SoundSystem::field_33020)
/**
 * field_34828
 */
val KClass<SoundSystem>.OPENAL_SOFT_ON_LENGTH by aliasStatic(SoundSystem::field_34828)
/**
 * method_19761
 */
fun SoundSystem.pauseAll() = this.method_19761()
/**
 * method_19753
 */
fun SoundSystem.stop(arg0: SoundInstance) = this.method_19753(arg0)
/**
 * method_4838
 */
fun SoundSystem.stopSounds(arg0: Identifier, arg1: SoundCategory) = this.method_4838(arg0, arg1)
/**
 * method_4840
 */
fun SoundSystem.updateListenerPosition(arg0: Camera) = this.method_4840(arg0)
/**
 * method_55592
 */
fun SoundSystem.getListenerTransform() = this.method_55592()
/**
 * method_4856
 */
fun SoundSystem.stop() = this.method_4856()
/**
 * method_19762
 */
fun SoundSystem.resumeAll() = this.method_19762()
/**
 * method_65257
 */
fun SoundSystem.setVolume(arg0: SoundInstance, arg1: Float) = this.method_65257(arg0, arg1)
/**
 * method_4844
 */
fun SoundSystem.updateSoundVolume(arg0: SoundCategory, arg1: Float) = this.method_4844(arg0, arg1)
/**
 * method_4847
 */
fun SoundSystem.unregisterListener(arg0: SoundInstanceListener) = this.method_4847(arg0)
/**
 * method_4837
 */
fun SoundSystem.reloadSounds() = this.method_4837()
/**
 * method_4855
 */
fun SoundSystem.registerListener(arg0: SoundInstanceListener) = this.method_4855(arg0)
/**
 * method_4852
 */
fun SoundSystem.play(arg0: SoundInstance, arg1: Int) = this.method_4852(arg0, arg1)
/**
 * method_20304
 */
fun SoundSystem.getDebugString() = this.method_20304()
/**
 * method_38564
 */
fun SoundSystem.getSoundDevices() = this.method_38564()
/**
 * method_20185
 */
fun SoundSystem.tick(arg0: Boolean) = this.method_20185(arg0)
/**
 * method_4835
 */
fun SoundSystem.isPlaying(arg0: SoundInstance) = this.method_4835(arg0)
/**
 * method_4851
 */
fun SoundSystem.addPreloadedSound(arg0: Sound) = this.method_4851(arg0)
/**
 * method_54648
 */
fun SoundSystem.stopAbruptly() = this.method_54648()
/**
 * method_22139
 */
fun SoundSystem.playNextTick(arg0: TickableSoundInstance) = this.method_22139(arg0)
/**
 * method_4854
 */
fun SoundSystem.play(arg0: SoundInstance) = this.method_4854(arg0)
/**
 * method_4843
 */
fun SoundSystem.stopAll() = this.method_4843()
