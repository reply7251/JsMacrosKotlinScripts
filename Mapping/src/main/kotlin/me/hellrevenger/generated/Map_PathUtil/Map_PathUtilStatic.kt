package me.hellrevenger.generated.Map_PathUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PathUtilKt {
    /**
     * method_47525
     */
    fun createDirectories(path: file_Path?) = PathUtil.method_47525(path)
    /**
     * method_34675
     */
    fun getPosixFullPath(path: String?) = PathUtil.method_34675(path)
    /**
     * method_34676
     */
    fun normalizeToPosix(path: String?) = PathUtil.method_34676(path)
    /**
     * method_46344
     */
    fun getPath(root: file_Path?, paths: MutableList<String>?) = PathUtil.method_46344(root, paths)
    /**
     * method_20200
     */
    fun isNormal(path: file_Path?) = PathUtil.method_20200(path)
    /**
     * method_20202
     */
    fun getResourcePath(path: file_Path?, resourceName: String?, extension: String?) = PathUtil.method_20202(path, resourceName, extension)
    /**
     * method_20201
     */
    fun isAllowedName(path: file_Path?) = PathUtil.method_20201(path)
    /**
     * method_46345
     */
    fun validatePath(paths: Array<String>) = PathUtil.method_46345(*paths)
    /**
     * method_19773
     */
    fun getNextUniqueName(path: file_Path?, name: String?, extension: String?) = PathUtil.method_19773(path, name, extension)
    /**
     * method_46347
     */
    fun isFileNameValid(name: String?) = PathUtil.method_46347(name)
    /**
     * method_46346
     */
    fun split(path: String?) = PathUtil.method_46346(path)
    /**
     * method_61105
     */
    fun replaceInvalidChars(fileName: String?) = PathUtil.method_61105(fileName)
}