package me.hellrevenger.generated.Map_NetworkUtils
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NetworkUtilsKt {
    /**
     * method_15302
     */
    fun findLocalPort() = NetworkUtils.method_15302()
    /**
     * method_55496
     */
    fun download(path: file_Path?, url: URL?, headers: Map<String, String>?, hashFunction: HashFunction?, hashCode: HashCode?, maxBytes: Int, proxy: Proxy?, listener: net.minecraft.class_3521.class_9034?) = NetworkUtils.method_55496(path, url, headers, hashFunction, hashCode, maxBytes, proxy, listener)
    /**
     * method_46872
     */
    fun isPortAvailable(port: Int) = NetworkUtils.method_46872(port)
}