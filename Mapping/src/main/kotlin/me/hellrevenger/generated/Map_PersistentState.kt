package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PersistentState

fun PersistentState.setDirty(arg0: Boolean) = this.method_78(arg0)
fun PersistentState.markDirty() = this.method_80()
fun PersistentState.save(arg0: File, arg1: net.minecraft.class_7225.class_7874) = this.method_17919(arg0, arg1)
fun PersistentState.isDirty() = this.method_79()
fun PersistentState.writeNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_75(arg0, arg1)
