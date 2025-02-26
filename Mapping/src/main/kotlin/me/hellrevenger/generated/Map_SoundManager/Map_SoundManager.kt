package me.hellrevenger.generated.Map_SoundManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_5592
 */
val KClass<SoundManager>.MISSING_SOUND by aliasStatic(SoundManager::field_5592)
/**
 * field_42935
 */
val KClass<SoundManager>.INTENTIONALLY_EMPTY_SOUND_SET by aliasStatic(SoundManager::field_42935)
/**
 * field_42936
 */
val KClass<SoundManager>.INTENTIONALLY_EMPTY_SOUND by aliasStatic(SoundManager::field_42936)
/**
 * field_52173
 */
val KClass<SoundManager>.EMPTY_ID by aliasStatic(SoundManager::field_52173)
/**
 * field_42934
 */
val KClass<SoundManager>.INTENTIONALLY_EMPTY_ID by aliasStatic(SoundManager::field_42934)
/**
 * method_4882
 */
fun SoundManager.close() = this.method_4882()
/**
 * method_4880
 */
fun SoundManager.resumeAll() = this.method_4880()
/**
 * method_38566
 */
fun SoundManager.reloadSounds() = this.method_38566()
/**
 * method_4870
 */
fun SoundManager.stop(arg0: SoundInstance) = this.method_4870(arg0)
/**
 * method_22140
 */
fun SoundManager.playNextTick(arg0: TickableSoundInstance) = this.method_22140(arg0)
/**
 * method_4865
 */
fun SoundManager.updateSoundVolume(arg0: SoundCategory, arg1: Float) = this.method_4865(arg0, arg1)
/**
 * method_4872
 */
fun SoundManager.play(arg0: SoundInstance, arg1: Int) = this.method_4872(arg0, arg1)
/**
 * method_4876
 */
fun SoundManager.updateListenerPosition(arg0: Camera) = this.method_4876(arg0)
/**
 * method_4878
 */
fun SoundManager.registerListener(arg0: SoundInstanceListener) = this.method_4878(arg0)
/**
 * method_4866
 */
fun SoundManager.unregisterListener(arg0: SoundInstanceListener) = this.method_4866(arg0)
/**
 * method_54649
 */
fun SoundManager.stopAbruptly() = this.method_54649()
/**
 * method_4873
 */
fun SoundManager.play(arg0: SoundInstance) = this.method_4873(arg0)
/**
 * method_4877
 */
fun SoundManager.isPlaying(arg0: SoundInstance) = this.method_4877(arg0)
/**
 * method_4881
 */
fun SoundManager.stopAll() = this.method_4881()
/**
 * method_4869
 */
fun SoundManager.get(arg0: Identifier) = this.method_4869(arg0)
/**
 * method_4864
 */
fun SoundManager.getKeys() = this.method_4864()
/**
 * method_55593
 */
fun SoundManager.getListenerTransform() = this.method_55593()
/**
 * method_38565
 */
fun SoundManager.getSoundDevices() = this.method_38565()
/**
 * method_20305
 */
fun SoundManager.getDebugString() = this.method_20305()
/**
 * method_4879
 */
fun SoundManager.pauseAll() = this.method_4879()
/**
 * method_18670
 */
fun SoundManager.tick(arg0: Boolean) = this.method_18670(arg0)
/**
 * method_4875
 */
fun SoundManager.stopSounds(arg0: Identifier, arg1: SoundCategory) = this.method_4875(arg0, arg1)
