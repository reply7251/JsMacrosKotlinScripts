package me.hellrevenger.generated.Map_MinecraftClient
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MinecraftClientKt {
    /**
     * field_24211
     */
    val UNICODE_FONT_ID by aliasStatic(MinecraftClient::field_24211)
    /**
     * field_1749
     */
    val ALT_TEXT_RENDERER_ID by aliasStatic(MinecraftClient::field_1749)
    /**
     * field_1703
     */
    val IS_SYSTEM_MAC by aliasStatic(MinecraftClient::field_1703)
    /**
     * field_33735
     */
    val GL_ERROR_DIALOGUE by aliasStatic(MinecraftClient::field_33735)
    /**
     * field_1740
     */
    val DEFAULT_FONT_ID by aliasStatic(MinecraftClient::field_1740)
    /**
     * method_29611
     */
    fun isFabulousGraphicsOrBetter() = MinecraftClient.method_29611()
    /**
     * method_1565
     */
    fun printCrashReport(client: MinecraftClient?, runDirectory: File?, crashReport: CrashReport?) = MinecraftClient.method_1565(client, runDirectory, crashReport)
    /**
     * method_1588
     */
    fun isAmbientOcclusionEnabled() = MinecraftClient.method_1588()
    /**
     * method_22681
     */
    fun addSystemDetailsToCrashReport(client: MinecraftClient?, languageManager: LanguageManager?, version: String?, options: GameOptions?, report: CrashReport?) = MinecraftClient.method_22681(client, languageManager, version, options, report)
    /**
     * method_1551
     */
    fun getInstance() = MinecraftClient.method_1551()
    /**
     * method_24289
     */
    fun getModStatus() = MinecraftClient.method_24289()
    /**
     * method_61962
     */
    fun saveCrashReport(runDir: File?, crashReport: CrashReport?) = MinecraftClient.method_61962(runDir, crashReport)
    /**
     * method_54578
     */
    fun getLauncherBrand() = MinecraftClient.method_54578()
    /**
     * method_1498
     */
    fun isHudEnabled() = MinecraftClient.method_1498()
    /**
     * method_1517
     */
    fun isFancyGraphicsOrBetter() = MinecraftClient.method_1517()
}