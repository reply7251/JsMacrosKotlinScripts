package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GameEventDispatcher

fun GameEventDispatcher.isEmpty() = this.method_32942()
fun GameEventDispatcher.dispatch(arg0: RegistryEntry<GameEvent>, arg1: Vec3d, arg2: net.minecraft.class_5712.class_7397, arg3: net.minecraft.class_5713.class_7721) = this.method_32943(arg0, arg1, arg2, arg3)
fun GameEventDispatcher.addListener(arg0: GameEventListener) = this.method_32944(arg0)
fun GameEventDispatcher.removeListener(arg0: GameEventListener) = this.method_32945(arg0)
