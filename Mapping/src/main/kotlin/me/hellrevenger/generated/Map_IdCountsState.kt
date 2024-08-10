package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.IdCountsState

val IdCountsState.IDCOUNTS_KEY by aliasStatic(IdCountsState::field_31830)
fun KClass<IdCountsState>.getPersistentStateType() = IdCountsState.method_52610()
fun KClass<IdCountsState>.fromNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = IdCountsState.method_32360(arg0, arg1)
fun IdCountsState.increaseAndGetMapId() = this.method_17920()
