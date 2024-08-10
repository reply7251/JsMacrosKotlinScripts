package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FilledMapItem

fun KClass<FilledMapItem>.createMap(arg0: world_World, arg1: Int, arg2: Int, arg3: Byte, arg4: Boolean, arg5: Boolean) = FilledMapItem.method_8005(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<FilledMapItem>.copyMap(arg0: world_World, arg1: ItemStack) = FilledMapItem.method_17442(arg0, arg1)
fun KClass<FilledMapItem>.getMapState(arg0: ItemStack, arg1: world_World) = FilledMapItem.method_8001(arg0, arg1)
fun KClass<FilledMapItem>.getIdText(arg0: MapIdComponent) = FilledMapItem.method_53836(arg0)
fun KClass<FilledMapItem>.fillExplorationMap(arg0: ServerWorld, arg1: ItemStack) = FilledMapItem.method_8002(arg0, arg1)
fun KClass<FilledMapItem>.getMapState(arg0: MapIdComponent, arg1: world_World) = FilledMapItem.method_7997(arg0, arg1)
fun FilledMapItem.updateColors(arg0: world_World, arg1: Entity, arg2: MapState) = this.method_7998(arg0, arg1, arg2)
