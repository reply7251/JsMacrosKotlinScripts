package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityGameEventHandler

fun <T>EntityGameEventHandler<T>.onEntitySetPos(arg0: ServerWorld) where T: GameEventListener = this.method_32952(arg0)
fun <T>EntityGameEventHandler<T>.onEntitySetPosCallback(arg0: ServerWorld) where T: GameEventListener = this.method_42335(arg0)
fun <T>EntityGameEventHandler<T>.onEntityRemoval(arg0: ServerWorld) where T: GameEventListener = this.method_32949(arg0)
fun <T>EntityGameEventHandler<T>.getListener() where T: GameEventListener = this.method_43152()
