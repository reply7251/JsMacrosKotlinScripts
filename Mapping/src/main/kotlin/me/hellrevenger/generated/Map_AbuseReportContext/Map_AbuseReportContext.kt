package me.hellrevenger.generated.Map_AbuseReportContext
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<AbuseReportContext>.create(arg0: ReporterEnvironment, arg1: UserApiService) = AbuseReportContext.method_44599(arg0, arg1)
fun AbuseReportContext.hasDraft() = this.method_46556()
fun AbuseReportContext.tryShowDraftScreen(arg0: MinecraftClient, arg1: Screen, arg2: Runnable, arg3: Boolean) = this.method_46552(arg0, arg1, arg2, arg3)
fun AbuseReportContext.getSender() = this.method_46550()
fun AbuseReportContext.draftPlayerUuidEquals(arg0: UUID) = this.method_46554(arg0)
fun AbuseReportContext.environmentEquals(arg0: ReporterEnvironment) = this.method_44598(arg0)
fun AbuseReportContext.setDraft(arg0: AbuseReport) = this.method_46553(arg0)
fun AbuseReportContext.getChatLog() = this.method_46555()
