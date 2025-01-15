package me.hellrevenger.generated.Map_PlayerInteractEntityC2SPacket
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<PlayerInteractEntityC2SPacket>.interactAt(arg0: Entity, arg1: Boolean, arg2: Hand, arg3: Vec3d) = PlayerInteractEntityC2SPacket.method_34208(arg0, arg1, arg2, arg3)
fun KClass<PlayerInteractEntityC2SPacket>.interact(arg0: Entity, arg1: Boolean, arg2: Hand) = PlayerInteractEntityC2SPacket.method_34207(arg0, arg1, arg2)
fun KClass<PlayerInteractEntityC2SPacket>.attack(arg0: Entity, arg1: Boolean) = PlayerInteractEntityC2SPacket.method_34206(arg0, arg1)
fun PlayerInteractEntityC2SPacket.getEntity(arg0: ServerWorld) = this.method_12248(arg0)
fun PlayerInteractEntityC2SPacket.apply(arg0: ServerPlayPacketListener) = this.method_12251(arg0)
fun PlayerInteractEntityC2SPacket.isPlayerSneaking() = this.method_30007()
fun PlayerInteractEntityC2SPacket.handle(arg0: net.minecraft.class_2824.class_5908) = this.method_34209(arg0)
