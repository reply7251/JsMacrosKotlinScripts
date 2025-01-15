package me.hellrevenger.generated.Map_SculkShriekerWarningManager
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<SculkShriekerWarningManager>.MAX_WARNING_LEVEL by aliasStatic(SculkShriekerWarningManager::field_38184)
fun SculkShriekerWarningManager.setWarningLevel(arg0: Int) = this.method_42248(arg0)
fun SculkShriekerWarningManager.reset() = this.method_42258()
fun KClass<SculkShriekerWarningManager>.warnNearbyPlayers(arg0: ServerWorld, arg1: BlockPos, arg2: ServerPlayerEntity) = SculkShriekerWarningManager.method_42250(arg0, arg1, arg2)
fun SculkShriekerWarningManager.getWarningLevel() = this.method_42267()
fun SculkShriekerWarningManager.tick() = this.method_42247()
