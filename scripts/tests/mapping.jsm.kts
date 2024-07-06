import kotlinx.coroutines.runBlocking
import xyz.wagyourtail.jsmacros.core.classes.Mappings
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import java.io.File
import kotlin.concurrent.thread
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.toScriptSource
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

/*
val mapper = Reflection.loadMappingHelper("https://maven.fabricmc.net/net/fabricmc/yarn/1.21-rc1%2Bbuild.1/yarn-1.21-rc1%2Bbuild.1-v2.jar")

val mc = Client.minecraft as net.minecraft.client.MinecraftClient



fun <T> remap(o : T): Mappings.MappedClass<T>? {
    val clazz = o!!::class.java
    return mapper.remapClass(o)
}
*/

val source = context.ctx.file!!.toScriptSource()
//Chat.log(source.text)
val host = context.ctx.context as BasicJvmScriptingHost
