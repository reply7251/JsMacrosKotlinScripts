package me.hellrevenger.generated.Map_SpawnEggItem
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_24793
 */
fun SpawnEggItem.spawnBaby(arg0: PlayerEntity, arg1: MobEntity, arg2: EntityType<out MobEntity>, arg3: ServerWorld, arg4: Vec3d, arg5: ItemStack) = this.method_24793(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_8018
 */
fun SpawnEggItem.isOfSameEntityType(arg0: net.minecraft.class_7225.class_7874, arg1: ItemStack, arg2: EntityType<*>) = this.method_8018(arg0, arg1, arg2)
/**
 * method_8015
 */
fun SpawnEggItem.getEntityType(arg0: net.minecraft.class_7225.class_7874, arg1: ItemStack) = this.method_8015(arg0, arg1)
/**
 * method_8019
 */
fun KClass<SpawnEggItem>.forEntity(arg0: EntityType<*>) = SpawnEggItem.method_8019(arg0)
/**
 * method_8017
 */
fun KClass<SpawnEggItem>.getAll() = SpawnEggItem.method_8017()
