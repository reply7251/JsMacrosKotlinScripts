package me.hellrevenger.generated.Map_SpawnEggItem
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun SpawnEggItem.spawnBaby(arg0: PlayerEntity, arg1: MobEntity, arg2: EntityType<out MobEntity>, arg3: ServerWorld, arg4: Vec3d, arg5: ItemStack) = this.method_24793(arg0, arg1, arg2, arg3, arg4, arg5)
fun SpawnEggItem.isOfSameEntityType(arg0: ItemStack, arg1: EntityType<*>) = this.method_8018(arg0, arg1)
fun SpawnEggItem.getColor(arg0: Int) = this.method_8016(arg0)
fun KClass<SpawnEggItem>.forEntity(arg0: EntityType<*>) = SpawnEggItem.method_8019(arg0)
fun SpawnEggItem.getEntityType(arg0: ItemStack) = this.method_8015(arg0)
fun KClass<SpawnEggItem>.getAll() = SpawnEggItem.method_8017()
