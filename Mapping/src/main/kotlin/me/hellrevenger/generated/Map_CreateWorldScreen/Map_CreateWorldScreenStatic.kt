package me.hellrevenger.generated.Map_CreateWorldScreen
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CreateWorldScreenKt {
    /**
     * field_49902
     */
    val TAB_HEADER_BACKGROUND_TEXTURE by aliasStatic(CreateWorldScreen::field_49902)
    /**
     * method_40212
     */
    fun create(client: MinecraftClient?, parent: Screen?, levelInfo: LevelInfo?, generatorOptionsHolder: GeneratorOptionsHolder?, dataPackTempDir: file_Path?) = CreateWorldScreen.method_40212(client, parent, levelInfo, generatorOptionsHolder, dataPackTempDir)
    /**
     * method_64368
     */
    fun show(client: MinecraftClient?, parent: Screen?, callback: CreateWorldCallback?) = CreateWorldScreen.method_64368(client, parent, callback)
    /**
     * method_31130
     */
    fun show(client: MinecraftClient?, parent: Screen?) = CreateWorldScreen.method_31130(client, parent)
    /**
     * method_64248
     */
    fun showTestWorld(client: MinecraftClient?, parent: Screen?) = CreateWorldScreen.method_64248(client, parent)
    /**
     * method_29685
     */
    fun copyDataPack(srcFolder: file_Path?, client: MinecraftClient?) = CreateWorldScreen.method_29685(srcFolder, client)
}