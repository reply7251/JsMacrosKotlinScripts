package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerAdvancementTracker

fun PlayerAdvancementTracker.clearCriteria() = this.method_12881()
fun PlayerAdvancementTracker.sendUpdate(arg0: ServerPlayerEntity) = this.method_12876(arg0)
fun PlayerAdvancementTracker.revokeCriterion(arg0: AdvancementEntry, arg1: String) = this.method_12883(arg0, arg1)
fun PlayerAdvancementTracker.getProgress(arg0: AdvancementEntry) = this.method_12882(arg0)
fun PlayerAdvancementTracker.reload(arg0: ServerAdvancementLoader) = this.method_12886(arg0)
fun PlayerAdvancementTracker.setDisplayTab(arg0: AdvancementEntry) = this.method_12888(arg0)
fun PlayerAdvancementTracker.save() = this.method_12890()
fun PlayerAdvancementTracker.grantCriterion(arg0: AdvancementEntry, arg1: String) = this.method_12878(arg0, arg1)
fun PlayerAdvancementTracker.setOwner(arg0: ServerPlayerEntity) = this.method_12875(arg0)
