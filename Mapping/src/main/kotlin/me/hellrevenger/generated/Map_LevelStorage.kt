package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LevelStorage

val LevelStorage.ALLOWED_SYMLINKS_FILE_NAME by aliasStatic(LevelStorage::field_44950)
fun LevelStorage.createSessionWithoutSymlinkCheck(arg0: String) = this.method_27002(arg0)
fun KClass<LevelStorage>.createSymlinkFinder(arg0: file_Path) = LevelStorage.method_52235(arg0)
fun KClass<LevelStorage>.parseDataPackSettings(arg0: Dynamic<*>) = LevelStorage.method_29580(arg0)
fun LevelStorage.createSession(arg0: String) = this.method_52236(arg0)
fun LevelStorage.isLevelNameValid(arg0: String) = this.method_240(arg0)
fun LevelStorage.levelExists(arg0: String) = this.method_230(arg0)
fun LevelStorage.getFormatName() = this.method_35504()
fun LevelStorage.loadSummaries(arg0: net.minecraft.class_32.class_7410) = this.method_43417(arg0)
fun KClass<LevelStorage>.parseSaveProperties(arg0: Dynamic<*>, arg1: DataConfiguration, arg2: Registry<DimensionOptions>, arg3: net.minecraft.class_5455.class_6890) = LevelStorage.method_54523(arg0, arg1, arg2, arg3)
fun LevelStorage.resolve(arg0: String) = this.method_52238(arg0)
fun LevelStorage.getLevelList() = this.method_235()
fun KClass<LevelStorage>.parseDataPacks(arg0: Dynamic<*>, arg1: ResourcePackManager, arg2: Boolean) = LevelStorage.method_54522(arg0, arg1, arg2)
fun KClass<LevelStorage>.create(arg0: file_Path) = LevelStorage.method_26999(arg0)
