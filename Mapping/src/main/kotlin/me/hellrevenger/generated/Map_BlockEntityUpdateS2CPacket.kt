package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockEntityUpdateS2CPacket

fun KClass<BlockEntityUpdateS2CPacket>.create(arg0: BlockEntity) = BlockEntityUpdateS2CPacket.method_38585(arg0)
fun KClass<BlockEntityUpdateS2CPacket>.create(arg0: BlockEntity, arg1: BiFunction<BlockEntity, DynamicRegistryManager, NbtCompound>) = BlockEntityUpdateS2CPacket.method_39026(arg0, arg1)
fun BlockEntityUpdateS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_11292(arg0)
