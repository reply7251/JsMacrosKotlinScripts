package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BrushableBlockEntity

fun BrushableBlockEntity.generateItem(arg0: PlayerEntity) = this.method_49217(arg0)
fun BrushableBlockEntity.setLootTable(arg0: RegistryKey<LootTable>, arg1: Long) = this.method_49216(arg0, arg1)
fun BrushableBlockEntity.toUpdatePacket() = this.method_49221()
fun BrushableBlockEntity.brush(arg0: Long, arg1: PlayerEntity, arg2: Direction) = this.method_49215(arg0, arg1, arg2)
fun BrushableBlockEntity.scheduledTick() = this.method_49219()
