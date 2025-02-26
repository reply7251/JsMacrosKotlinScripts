package me.hellrevenger.generated.Map_ServerCommandSource
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_9824
 */
val KClass<ServerCommandSource>.REQUIRES_PLAYER_EXCEPTION by aliasStatic(ServerCommandSource::field_9824)
/**
 * field_9827
 */
val KClass<ServerCommandSource>.REQUIRES_ENTITY_EXCEPTION by aliasStatic(ServerCommandSource::field_9827)
/**
 * method_9207
 */
fun ServerCommandSource.getPlayerOrThrow() = this.method_9207()
/**
 * method_9232
 */
fun ServerCommandSource.withEntity(arg0: Entity) = this.method_9232(arg0)
/**
 * method_9227
 */
fun ServerCommandSource.withWorld(arg0: ServerWorld) = this.method_9227(arg0)
/**
 * method_9216
 */
fun ServerCommandSource.withRotation(arg0: Vec2f) = this.method_9216(arg0)
/**
 * method_9208
 */
fun ServerCommandSource.withPosition(arg0: Vec3d) = this.method_9208(arg0)
/**
 * method_45068
 */
fun ServerCommandSource.sendMessage(arg0: Text) = this.method_45068(arg0)
/**
 * method_9223
 */
fun ServerCommandSource.getDisplayName() = this.method_9223()
/**
 * method_9210
 */
fun ServerCommandSource.getRotation() = this.method_9210()
/**
 * method_36321
 */
fun ServerCommandSource.withOutput(arg0: CommandOutput) = this.method_36321(arg0)
/**
 * method_9226
 */
fun ServerCommandSource.sendFeedback(arg0: Supplier<Text>, arg1: Boolean) = this.method_9226(arg0, arg1)
/**
 * method_9209
 */
fun ServerCommandSource.mergeReturnValueConsumers(arg0: ReturnValueConsumer, arg1: BinaryOperator<ReturnValueConsumer>) = this.method_9209(arg0, arg1)
/**
 * method_9217
 */
fun ServerCommandSource.withSilent() = this.method_9217()
/**
 * method_43737
 */
fun ServerCommandSource.isExecutedByPlayer() = this.method_43737()
/**
 * method_43735
 */
fun ServerCommandSource.withSignedArguments(arg0: SignedCommandArguments, arg1: FutureQueue) = this.method_43735(arg0, arg1)
/**
 * method_9218
 */
fun ServerCommandSource.withEntityAnchor(arg0: net.minecraft.class_2183.class_2184) = this.method_9218(arg0)
/**
 * method_9229
 */
fun ServerCommandSource.getEntityOrThrow() = this.method_9229()
/**
 * method_44023
 */
fun ServerCommandSource.getPlayer() = this.method_44023()
/**
 * method_9206
 */
fun ServerCommandSource.withLevel(arg0: Int) = this.method_9206(arg0)
/**
 * method_45067
 */
fun ServerCommandSource.shouldFilterText(arg0: ServerPlayerEntity) = this.method_45067(arg0)
/**
 * method_9230
 */
fun ServerCommandSource.withMaxLevel(arg0: Int) = this.method_9230(arg0)
/**
 * method_9220
 */
fun ServerCommandSource.withLookingAt(arg0: Entity, arg1: net.minecraft.class_2183.class_2184) = this.method_9220(arg0, arg1)
/**
 * method_9225
 */
fun ServerCommandSource.getWorld() = this.method_9225()
/**
 * method_9231
 */
fun ServerCommandSource.withReturnValueConsumer(arg0: ReturnValueConsumer) = this.method_9231(arg0)
/**
 * method_44909
 */
fun ServerCommandSource.getMessageChainTaskQueue() = this.method_44909()
/**
 * method_9214
 */
fun ServerCommandSource.getName() = this.method_9214()
/**
 * method_9228
 */
fun ServerCommandSource.getEntity() = this.method_9228()
/**
 * method_9211
 */
fun ServerCommandSource.getServer() = this.method_9211()
/**
 * method_9213
 */
fun ServerCommandSource.sendError(arg0: Text) = this.method_9213(arg0)
/**
 * method_9222
 */
fun ServerCommandSource.getPosition() = this.method_9222()
/**
 * method_43738
 */
fun ServerCommandSource.getSignedArguments() = this.method_43738()
/**
 * method_44749
 */
fun ServerCommandSource.sendChatMessage(arg0: SentMessage, arg1: Boolean, arg2: net.minecraft.class_2556.class_7602) = this.method_44749(arg0, arg1, arg2)
/**
 * method_9221
 */
fun ServerCommandSource.withLookingAt(arg0: Vec3d) = this.method_9221(arg0)
/**
 * method_9219
 */
fun ServerCommandSource.getEntityAnchor() = this.method_9219()
