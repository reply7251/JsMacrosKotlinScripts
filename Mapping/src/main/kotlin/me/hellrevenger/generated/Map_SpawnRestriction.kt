package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpawnRestriction

fun KClass<SpawnRestriction>.isSpawnPosAllowed(arg0: EntityType<*>, arg1: WorldView, arg2: BlockPos) = SpawnRestriction.method_56558(arg0, arg1, arg2)
fun KClass<SpawnRestriction>.getHeightmapType(arg0: EntityType<*>) = SpawnRestriction.method_6160(arg0)
fun <T>KClass<SpawnRestriction>.canSpawn(arg0: EntityType<T>, arg1: ServerWorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) where T: Entity = SpawnRestriction.method_20638<T>(arg0, arg1, arg2, arg3, arg4)
fun <T>KClass<SpawnRestriction>.register(arg0: EntityType<T>, arg1: SpawnLocation, arg2: net.minecraft.class_2902.class_2903, arg3: net.minecraft.class_1317.class_4306<T>) where T: MobEntity = SpawnRestriction.method_20637<T>(arg0, arg1, arg2, arg3)
fun KClass<SpawnRestriction>.getLocation(arg0: EntityType<*>) = SpawnRestriction.method_6159(arg0)
