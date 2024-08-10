package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EndGatewayBlockEntity

fun EndGatewayBlockEntity.getOrCreateExitPortalPos(arg0: ServerWorld, arg1: BlockPos) = this.method_60787(arg0, arg1)
fun EndGatewayBlockEntity.getCooldownBeamHeight(arg0: Float) = this.method_11412(arg0)
fun EndGatewayBlockEntity.getDrawnSidesCount() = this.method_11415()
fun KClass<EndGatewayBlockEntity>.serverTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: EndGatewayBlockEntity) = EndGatewayBlockEntity.method_31702(arg0, arg1, arg2, arg3)
fun EndGatewayBlockEntity.needsCooldownBeforeTeleporting() = this.method_11421()
fun KClass<EndGatewayBlockEntity>.clientTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: EndGatewayBlockEntity) = EndGatewayBlockEntity.method_31700(arg0, arg1, arg2, arg3)
fun EndGatewayBlockEntity.getRecentlyGeneratedBeamHeight(arg0: Float) = this.method_11417(arg0)
fun EndGatewayBlockEntity.isRecentlyGenerated() = this.method_11420()
fun EndGatewayBlockEntity.toUpdatePacket() = this.method_38253()
fun KClass<EndGatewayBlockEntity>.startTeleportCooldown(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: EndGatewayBlockEntity) = EndGatewayBlockEntity.method_11411(arg0, arg1, arg2, arg3)
fun EndGatewayBlockEntity.setExitPortalPos(arg0: BlockPos, arg1: Boolean) = this.method_11418(arg0, arg1)
