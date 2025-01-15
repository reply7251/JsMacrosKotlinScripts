package me.hellrevenger.generated.Map_realms_Request
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>realms_Request<T>.prerelease(arg0: Boolean) where T: realms_Request<T> = this.method_54362(arg0)
fun <T>KClass<realms_Request<T>>.post(arg0: String, arg1: String, arg2: Int, arg3: Int) where T: realms_Request<T> = realms_Request.method_21043(arg0, arg1, arg2, arg3)
fun <T>KClass<realms_Request<T>>.put(arg0: String, arg1: String) where T: realms_Request<T> = realms_Request.method_21053(arg0, arg1)
fun <T>KClass<realms_Request<T>>.post(arg0: String, arg1: String) where T: realms_Request<T> = realms_Request.method_21049(arg0, arg1)
fun <T>KClass<realms_Request<T>>.getHeader(arg0: HttpURLConnection, arg1: String) where T: realms_Request<T> = realms_Request.method_21045(arg0, arg1)
fun <T>realms_Request<T>.getRetryAfterHeader() where T: realms_Request<T> = this.method_21038()
fun <T>KClass<realms_Request<T>>.getRetryAfterHeader(arg0: HttpURLConnection) where T: realms_Request<T> = realms_Request.method_21044(arg0)
fun <T>KClass<realms_Request<T>>.put(arg0: String, arg1: String, arg2: Int, arg3: Int) where T: realms_Request<T> = realms_Request.method_21050(arg0, arg1, arg2, arg3)
fun <T>KClass<realms_Request<T>>.cookie(arg0: HttpURLConnection, arg1: String, arg2: String) where T: realms_Request<T> = realms_Request.method_21046(arg0, arg1, arg2)
fun <T>KClass<realms_Request<T>>.get(arg0: String) where T: realms_Request<T> = realms_Request.method_21040(arg0)
fun <T>realms_Request<T>.cookie(arg0: String, arg1: String) where T: realms_Request<T> = this.method_21042(arg0, arg1)
fun <T>KClass<realms_Request<T>>.get(arg0: String, arg1: Int, arg2: Int) where T: realms_Request<T> = realms_Request.method_21041(arg0, arg1, arg2)
fun <T>realms_Request<T>.text() where T: realms_Request<T> = this.method_21051()
fun <T>realms_Request<T>.responseCode() where T: realms_Request<T> = this.method_21047()
fun <T>realms_Request<T>.getHeader(arg0: String) where T: realms_Request<T> = this.method_21052(arg0)
fun <T>KClass<realms_Request<T>>.delete(arg0: String) where T: realms_Request<T> = realms_Request.method_21048(arg0)
