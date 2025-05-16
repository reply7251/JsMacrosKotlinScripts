package me.hellrevenger.generated.Map_realms_Request
import kotlin.reflect.*
import me.hellrevenger.generated.*
object realms_RequestKt {
    /**
     * method_21043
     */
    fun <T>post(uri: String?, content: String?, connectTimeoutMillis: Int, readTimeoutMillis: Int) where T: realms_Request<T> = realms_Request.method_21043(uri, content, connectTimeoutMillis, readTimeoutMillis)
    /**
     * method_21053
     */
    fun <T>put(url: String?, content: String?) where T: realms_Request<T> = realms_Request.method_21053(url, content)
    /**
     * method_21049
     */
    fun <T>post(uri: String?, content: String?) where T: realms_Request<T> = realms_Request.method_21049(uri, content)
    /**
     * method_21045
     */
    fun <T>getHeader(connection: HttpURLConnection?, header: String?) where T: realms_Request<T> = realms_Request.method_21045(connection, header)
    /**
     * method_21044
     */
    fun <T>getRetryAfterHeader(connection: HttpURLConnection?) where T: realms_Request<T> = realms_Request.method_21044(connection)
    /**
     * method_21050
     */
    fun <T>put(url: String?, content: String?, connectTimeoutMillis: Int, readTimeoutMillis: Int) where T: realms_Request<T> = realms_Request.method_21050(url, content, connectTimeoutMillis, readTimeoutMillis)
    /**
     * method_21046
     */
    fun <T>cookie(connection: HttpURLConnection?, key: String?, value: String?) where T: realms_Request<T> = realms_Request.method_21046(connection, key, value)
    /**
     * method_21040
     */
    fun <T>get(url: String?) where T: realms_Request<T> = realms_Request.method_21040(url)
    /**
     * method_21041
     */
    fun <T>get(url: String?, connectTimeoutMillis: Int, readTimeoutMillis: Int) where T: realms_Request<T> = realms_Request.method_21041(url, connectTimeoutMillis, readTimeoutMillis)
    /**
     * method_21048
     */
    fun <T>delete(url: String?) where T: realms_Request<T> = realms_Request.method_21048(url)
}