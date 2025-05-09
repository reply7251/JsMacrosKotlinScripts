package me.hellrevenger.generated.Map_SpawnEggItem
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_24793
 */
fun SpawnEggItem.spawnBaby(user: PlayerEntity, entity: MobEntity, entityType: EntityType<out MobEntity>, world: ServerWorld, pos: Vec3d, stack: ItemStack) = this.method_24793(user, entity, entityType, world, pos, stack)
/**
 * method_8018
 */
fun SpawnEggItem.isOfSameEntityType(registries: net.minecraft.class_7225.class_7874, stack: ItemStack, type: EntityType<*>) = this.method_8018(registries, stack, type)
/**
 * method_8015
 */
fun SpawnEggItem.getEntityType(registries: net.minecraft.class_7225.class_7874, stack: ItemStack) = this.method_8015(registries, stack)
