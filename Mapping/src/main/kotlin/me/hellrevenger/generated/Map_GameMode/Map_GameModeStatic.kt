package me.hellrevenger.generated.Map_GameMode
import kotlin.reflect.*
import me.hellrevenger.generated.*
object GameModeKt {
    /**
     * field_28045
     */
    val DEFAULT by aliasStatic(GameMode::field_28045)
    /**
     * field_9220
     */
    val CREATIVE by aliasEnum(GameMode::class, "field_9220")
    /**
     * field_9219
     */
    val SPECTATOR by aliasEnum(GameMode::class, "field_9219")
    /**
     * field_9215
     */
    val SURVIVAL by aliasEnum(GameMode::class, "field_9215")
    /**
     * field_9216
     */
    val ADVENTURE by aliasEnum(GameMode::class, "field_9216")
    /**
     * method_8378
     */
    fun byName(name: String?, defaultMode: GameMode?) = GameMode.method_8378(name, defaultMode)
    /**
     * method_32762
     */
    fun getOrNull(id: Int) = GameMode.method_32762(id)
    /**
     * method_64760
     */
    fun isValid(id: Int) = GameMode.method_64760(id)
    /**
     * method_8384
     */
    fun byId(id: Int) = GameMode.method_8384(id)
    /**
     * method_8385
     */
    fun byName(name: String?) = GameMode.method_8385(name)
    /**
     * method_32761
     */
    fun getId(gameMode: GameMode?) = GameMode.method_32761(gameMode)
}