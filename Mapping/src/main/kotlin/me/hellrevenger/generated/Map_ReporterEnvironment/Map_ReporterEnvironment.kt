package me.hellrevenger.generated.Map_ReporterEnvironment
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<ReporterEnvironment>.ofThirdPartyServer(arg0: String) = ReporterEnvironment.method_44589(arg0)
fun KClass<ReporterEnvironment>.ofServer(arg0: net.minecraft.class_7569.class_7570) = ReporterEnvironment.method_44588(arg0)
fun KClass<ReporterEnvironment>.ofRealm(arg0: RealmsServer) = ReporterEnvironment.method_44587(arg0)
fun KClass<ReporterEnvironment>.ofIntegratedServer() = ReporterEnvironment.method_44586()
fun ReporterEnvironment.toClientInfo() = this.method_44590()
fun ReporterEnvironment.toRealmInfo() = this.method_44592()
fun ReporterEnvironment.toThirdPartyServerInfo() = this.method_44591()
fun ReporterEnvironment.server() = this.comp_881()
fun ReporterEnvironment.clientVersion() = this.comp_880()
