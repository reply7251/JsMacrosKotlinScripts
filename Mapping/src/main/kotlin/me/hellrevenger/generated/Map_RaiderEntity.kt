package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RaiderEntity

fun RaiderEntity.setAbleToJoinRaid(arg0: Boolean) = this.method_16480(arg0)
fun RaiderEntity.setOutOfRaidCounter(arg0: Int) = this.method_16835(arg0)
fun RaiderEntity.setWave(arg0: Int) = this.method_16477(arg0)
fun RaiderEntity.getCelebratingSound() = this.method_20033()
fun RaiderEntity.setRaid(arg0: Raid) = this.method_16476(arg0)
fun RaiderEntity.setCelebrating(arg0: Boolean) = this.method_20036(arg0)
fun RaiderEntity.isCelebrating() = this.method_20034()
fun RaiderEntity.hasRaid() = this.method_58647()
fun RaiderEntity.hasActiveRaid() = this.method_16482()
fun RaiderEntity.isCaptain() = this.method_58646()
fun RaiderEntity.canJoinRaid() = this.method_16481()
fun RaiderEntity.addBonusForWave(arg0: ServerWorld, arg1: Int, arg2: Boolean) = this.method_16484(arg0, arg1, arg2)
