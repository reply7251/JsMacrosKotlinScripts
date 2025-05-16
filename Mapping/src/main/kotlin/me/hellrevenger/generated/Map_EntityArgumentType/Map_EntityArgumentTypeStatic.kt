package me.hellrevenger.generated.Map_EntityArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object EntityArgumentTypeKt {
    /**
     * field_9861
     */
    val PLAYER_SELECTOR_HAS_ENTITIES_EXCEPTION by aliasStatic(EntityArgumentType::field_9861)
    /**
     * field_9863
     */
    val ENTITY_NOT_FOUND_EXCEPTION by aliasStatic(EntityArgumentType::field_9863)
    /**
     * field_9856
     */
    val PLAYER_NOT_FOUND_EXCEPTION by aliasStatic(EntityArgumentType::field_9856)
    /**
     * field_9860
     */
    val TOO_MANY_ENTITIES_EXCEPTION by aliasStatic(EntityArgumentType::field_9860)
    /**
     * field_9862
     */
    val NOT_ALLOWED_EXCEPTION by aliasStatic(EntityArgumentType::field_9862)
    /**
     * field_9864
     */
    val TOO_MANY_PLAYERS_EXCEPTION by aliasStatic(EntityArgumentType::field_9864)
    /**
     * method_9310
     */
    fun getOptionalPlayers(context: CommandContext<ServerCommandSource>?, name: String?) = EntityArgumentType.method_9310(context, name)
    /**
     * method_9309
     */
    fun entity() = EntityArgumentType.method_9309()
    /**
     * method_9305
     */
    fun player() = EntityArgumentType.method_9305()
    /**
     * method_9312
     */
    fun getPlayers(context: CommandContext<ServerCommandSource>?, name: String?) = EntityArgumentType.method_9312(context, name)
    /**
     * method_9308
     */
    fun players() = EntityArgumentType.method_9308()
    /**
     * method_9315
     */
    fun getPlayer(context: CommandContext<ServerCommandSource>?, name: String?) = EntityArgumentType.method_9315(context, name)
    /**
     * method_9306
     */
    fun entities() = EntityArgumentType.method_9306()
    /**
     * method_9313
     */
    fun getEntity(context: CommandContext<ServerCommandSource>?, name: String?) = EntityArgumentType.method_9313(context, name)
    /**
     * method_9317
     */
    fun getEntities(context: CommandContext<ServerCommandSource>?, name: String?) = EntityArgumentType.method_9317(context, name)
    /**
     * method_9307
     */
    fun getOptionalEntities(context: CommandContext<ServerCommandSource>?, name: String?) = EntityArgumentType.method_9307(context, name)
}