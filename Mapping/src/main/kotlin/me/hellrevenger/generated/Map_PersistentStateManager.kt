package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PersistentStateManager

fun PersistentStateManager.readNbt(arg0: String, arg1: DataFixTypes, arg2: Int) = this.method_17923(arg0, arg1, arg2)
fun <T>PersistentStateManager.get(arg0: net.minecraft.class_18.class_8645<T>, arg1: String) where T: PersistentState = this.method_20786<T>(arg0, arg1)
fun PersistentStateManager.save() = this.method_125()
fun PersistentStateManager.set(arg0: String, arg1: PersistentState) = this.method_123(arg0, arg1)
fun <T>PersistentStateManager.getOrCreate(arg0: net.minecraft.class_18.class_8645<T>, arg1: String) where T: PersistentState = this.method_17924<T>(arg0, arg1)
