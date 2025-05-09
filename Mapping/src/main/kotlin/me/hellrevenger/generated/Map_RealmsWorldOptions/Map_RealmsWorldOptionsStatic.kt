package me.hellrevenger.generated.Map_RealmsWorldOptions
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RealmsWorldOptionsKt {
    /**
     * method_64352
     */
    fun create(gameMode: GameMode, difficulty: Difficulty, hardcore: Boolean, version: String, slotName: String) = RealmsWorldOptions.method_64352(gameMode, difficulty, hardcore, version, slotName)
    /**
     * method_25078
     */
    fun parse(json: JsonObject, settings: RealmsWorldSettings) = RealmsWorldOptions.method_25078(json, settings)
    /**
     * method_25076
     */
    fun getDefaults() = RealmsWorldOptions.method_25076()
    /**
     * method_25080
     */
    fun getEmptyDefaults() = RealmsWorldOptions.method_25080()
    /**
     * method_64353
     */
    fun create(levelInfo: LevelInfo, version: String) = RealmsWorldOptions.method_64353(levelInfo, version)
}