package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SculkShriekerWarningManager

val SculkShriekerWarningManager.MAX_WARNING_LEVEL by aliasStatic(SculkShriekerWarningManager::field_38184)
fun SculkShriekerWarningManager.setWarningLevel(arg0: Int) = this.method_42248(arg0)
fun SculkShriekerWarningManager.reset() = this.method_42258()
fun KClass<SculkShriekerWarningManager>.warnNearbyPlayers(arg0: ServerWorld, arg1: BlockPos, arg2: ServerPlayerEntity) = SculkShriekerWarningManager.method_42250(arg0, arg1, arg2)
fun SculkShriekerWarningManager.tick() = this.method_42247()
