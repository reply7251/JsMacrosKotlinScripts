package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.UpgradeData

val KClass<UpgradeData>.NO_UPGRADE_DATA by aliasStatic(UpgradeData::field_12950)
fun UpgradeData.toNbt() = this.method_12350()
fun UpgradeData.isDone() = this.method_12349()
fun UpgradeData.upgrade(arg0: WorldChunk) = this.method_12356(arg0)
