package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CampfireBlockEntity

fun KClass<CampfireBlockEntity>.litServerTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: CampfireBlockEntity) = CampfireBlockEntity.method_31666(arg0, arg1, arg2, arg3)
fun KClass<CampfireBlockEntity>.clientTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: CampfireBlockEntity) = CampfireBlockEntity.method_31668(arg0, arg1, arg2, arg3)
fun KClass<CampfireBlockEntity>.unlitServerTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: CampfireBlockEntity) = CampfireBlockEntity.method_31667(arg0, arg1, arg2, arg3)
fun CampfireBlockEntity.toUpdatePacket() = this.method_38245()
fun CampfireBlockEntity.getRecipeFor(arg0: ItemStack) = this.method_17502(arg0)
fun CampfireBlockEntity.addItem(arg0: LivingEntity, arg1: ItemStack, arg2: Int) = this.method_17503(arg0, arg1, arg2)
fun CampfireBlockEntity.spawnItemsBeingCooked() = this.method_17506()
