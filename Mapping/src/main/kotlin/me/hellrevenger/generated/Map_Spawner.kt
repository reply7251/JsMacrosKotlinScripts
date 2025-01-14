package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Spawner

fun KClass<Spawner>.appendSpawnDataToTooltip(arg0: ItemStack, arg1: MutableList<Text>, arg2: String) = Spawner.method_55121(arg0, arg1, arg2)
fun KClass<Spawner>.getSpawnedEntityText(arg0: ItemStack, arg1: String) = Spawner.method_55120(arg0, arg1)
fun Spawner.setEntityType(arg0: EntityType<*>, arg1: Random) = this.method_46408(arg0, arg1)
