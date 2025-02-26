package me.hellrevenger.generated.Map_LevelStorage
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_44950
 */
val KClass<LevelStorage>.ALLOWED_SYMLINKS_FILE_NAME by aliasStatic(LevelStorage::field_44950)
/**
 * method_27002
 */
fun LevelStorage.createSessionWithoutSymlinkCheck(arg0: String) = this.method_27002(arg0)
/**
 * method_52235
 */
fun KClass<LevelStorage>.createSymlinkFinder(arg0: file_Path) = LevelStorage.method_52235(arg0)
/**
 * method_29580
 */
fun KClass<LevelStorage>.parseDataPackSettings(arg0: Dynamic<*>) = LevelStorage.method_29580(arg0)
/**
 * method_52236
 */
fun LevelStorage.createSession(arg0: String) = this.method_52236(arg0)
/**
 * method_240
 */
fun LevelStorage.isLevelNameValid(arg0: String) = this.method_240(arg0)
/**
 * method_230
 */
fun LevelStorage.levelExists(arg0: String) = this.method_230(arg0)
/**
 * method_35504
 */
fun LevelStorage.getFormatName() = this.method_35504()
/**
 * method_236
 */
fun LevelStorage.getBackupsDirectory() = this.method_236()
/**
 * method_43417
 */
fun LevelStorage.loadSummaries(arg0: net.minecraft.class_32.class_7410) = this.method_43417(arg0)
/**
 * method_54523
 */
fun KClass<LevelStorage>.parseSaveProperties(arg0: Dynamic<*>, arg1: DataConfiguration, arg2: Registry<DimensionOptions>, arg3: net.minecraft.class_5455.class_6890) = LevelStorage.method_54523(arg0, arg1, arg2, arg3)
/**
 * method_52238
 */
fun LevelStorage.resolve(arg0: String) = this.method_52238(arg0)
/**
 * method_19636
 */
fun LevelStorage.getSavesDirectory() = this.method_19636()
/**
 * method_235
 */
fun LevelStorage.getLevelList() = this.method_235()
/**
 * method_54522
 */
fun KClass<LevelStorage>.parseDataPacks(arg0: Dynamic<*>, arg1: ResourcePackManager, arg2: Boolean) = LevelStorage.method_54522(arg0, arg1, arg2)
/**
 * method_52237
 */
fun LevelStorage.getSymlinkFinder() = this.method_52237()
/**
 * method_26999
 */
fun KClass<LevelStorage>.create(arg0: file_Path) = LevelStorage.method_26999(arg0)
