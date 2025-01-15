package me.hellrevenger.generated.Map_TeleportTarget
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<TeleportTarget>.SEND_TRAVEL_THROUGH_PORTAL_PACKET by aliasStatic(TeleportTarget::field_52246)
val KClass<TeleportTarget>.ADD_PORTAL_CHUNK_TICKET by aliasStatic(TeleportTarget::field_52247)
val KClass<TeleportTarget>.NO_OP by aliasStatic(TeleportTarget::field_52245)
fun TeleportTarget.pitch() = this.comp_2824()
fun TeleportTarget.yaw() = this.comp_2823()
fun TeleportTarget.world() = this.comp_2820()
fun TeleportTarget.velocity() = this.comp_2822()
fun KClass<TeleportTarget>.missingSpawnBlock(arg0: ServerWorld, arg1: Entity, arg2: net.minecraft.class_5454.class_9823) = TeleportTarget.method_60635(arg0, arg1, arg2)
fun TeleportTarget.postDimensionTransition() = this.comp_2864()
fun TeleportTarget.pos() = this.comp_2821()
fun TeleportTarget.missingRespawnBlock() = this.comp_2825()
