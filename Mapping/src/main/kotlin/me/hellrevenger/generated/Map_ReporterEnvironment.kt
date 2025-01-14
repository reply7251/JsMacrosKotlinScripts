package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ReporterEnvironment

fun KClass<ReporterEnvironment>.ofThirdPartyServer(arg0: String) = ReporterEnvironment.method_44589(arg0)
fun KClass<ReporterEnvironment>.ofServer(arg0: net.minecraft.class_7569.class_7570) = ReporterEnvironment.method_44588(arg0)
fun KClass<ReporterEnvironment>.ofRealm(arg0: RealmsServer) = ReporterEnvironment.method_44587(arg0)
fun KClass<ReporterEnvironment>.ofIntegratedServer() = ReporterEnvironment.method_44586()
fun ReporterEnvironment.toClientInfo() = this.method_44590()
fun ReporterEnvironment.toRealmInfo() = this.method_44592()
fun ReporterEnvironment.toThirdPartyServerInfo() = this.method_44591()
fun ReporterEnvironment.server() = this.comp_881()
fun ReporterEnvironment.clientVersion() = this.comp_880()
