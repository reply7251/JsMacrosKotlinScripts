package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SkullBlockEntity

val SkullBlockEntity.EXECUTOR by aliasStatic(SkullBlockEntity::field_45147)
fun KClass<SkullBlockEntity>.setServices(arg0: ApiServices, arg1: Executor) = SkullBlockEntity.method_39765(arg0, arg1)
fun KClass<SkullBlockEntity>.tick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: SkullBlockEntity) = SkullBlockEntity.method_47589(arg0, arg1, arg2, arg3)
fun SkullBlockEntity.setOwner(arg0: ProfileComponent) = this.method_11333(arg0)
fun SkullBlockEntity.toUpdatePacket() = this.method_38250()
fun KClass<SkullBlockEntity>.fetchProfileByName(arg0: String) = SkullBlockEntity.method_52580(arg0)
fun KClass<SkullBlockEntity>.fetchProfileByUuid(arg0: UUID) = SkullBlockEntity.method_59539(arg0)
fun KClass<SkullBlockEntity>.clearServices() = SkullBlockEntity.method_39766()
