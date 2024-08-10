package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PathUtil

fun KClass<PathUtil>.createDirectories(arg0: file_Path) = PathUtil.method_47525(arg0)
fun KClass<PathUtil>.getPosixFullPath(arg0: String) = PathUtil.method_34675(arg0)
fun KClass<PathUtil>.normalizeToPosix(arg0: String) = PathUtil.method_34676(arg0)
fun KClass<PathUtil>.getPath(arg0: file_Path, arg1: List<String>) = PathUtil.method_46344(arg0, arg1)
fun KClass<PathUtil>.isNormal(arg0: file_Path) = PathUtil.method_20200(arg0)
fun KClass<PathUtil>.getResourcePath(arg0: file_Path, arg1: String, arg2: String) = PathUtil.method_20202(arg0, arg1, arg2)
fun KClass<PathUtil>.isAllowedName(arg0: file_Path) = PathUtil.method_20201(arg0)
fun KClass<PathUtil>.validatePath(arg0: Array<String>) = PathUtil.method_46345(*arg0)
fun KClass<PathUtil>.getNextUniqueName(arg0: file_Path, arg1: String, arg2: String) = PathUtil.method_19773(arg0, arg1, arg2)
fun KClass<PathUtil>.isFileNameValid(arg0: String) = PathUtil.method_46347(arg0)
fun KClass<PathUtil>.split(arg0: String) = PathUtil.method_46346(arg0)
fun KClass<PathUtil>.replaceInvalidChars(arg0: String) = PathUtil.method_61105(arg0)
