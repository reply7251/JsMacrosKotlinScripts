package me.hellrevenger.generated.Map_MessageListener
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <Msg>MessageListener<Msg>.getName() = this.method_16898()
fun <Msg>MessageListener<Msg>.send(arg0: Msg) = this.method_16901(arg0)
fun <Msg>KClass<MessageListener<Msg>>.create(arg0: String, arg1: Consumer<Msg>) = MessageListener.method_17344<Msg>(arg0, arg1)
fun <Msg, Source>MessageListener<Msg>.ask(arg0: java.util.function.Function<in MessageListener<Source>, out Msg>) = this.method_17345<Source>(arg0)
fun <Msg, Source>MessageListener<Msg>.askFallible(arg0: java.util.function.Function<in MessageListener<Either<Source, Exception>>, out Msg>) = this.method_27918<Source>(arg0)
