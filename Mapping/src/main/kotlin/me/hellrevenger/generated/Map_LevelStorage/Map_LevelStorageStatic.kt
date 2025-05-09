package me.hellrevenger.generated.Map_LevelStorage
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LevelStorageKt {
    /**
     * field_44950
     */
    val ALLOWED_SYMLINKS_FILE_NAME by aliasStatic(LevelStorage::field_44950)
    /**
     * field_36348
     */
    val DATA_KEY by aliasStatic(LevelStorage::field_36348)
    /**
     * method_52235
     */
    fun createSymlinkFinder(allowedSymlinksFile: file_Path) = LevelStorage.method_52235(allowedSymlinksFile)
    /**
     * method_29580
     */
    fun parseDataPackSettings(dynamic: Dynamic<*>) = LevelStorage.method_29580(dynamic)
    /**
     * method_54523
     */
    fun parseSaveProperties(dynamic: Dynamic<*>, dataConfiguration: DataConfiguration, dimensionsRegistry: Registry<DimensionOptions>, registries: net.minecraft.class_7225.class_7874) = LevelStorage.method_54523(dynamic, dataConfiguration, dimensionsRegistry, registries)
    /**
     * method_54522
     */
    fun parseDataPacks(dynamic: Dynamic<*>, dataPackManager: ResourcePackManager, safeMode: Boolean) = LevelStorage.method_54522(dynamic, dataPackManager, safeMode)
    /**
     * method_26999
     */
    fun create(path: file_Path) = LevelStorage.method_26999(path)
}