package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ReportType

val ReportType.MINECRAFT_CHUNK_IO_ERROR_REPORT by aliasStatic(ReportType::field_52284)
val ReportType.MINECRAFT_PROFILER_RESULTS by aliasStatic(ReportType::field_52182)
val ReportType.MINECRAFT_CRASH_REPORT by aliasStatic(ReportType::field_52181)
val ReportType.MINECRAFT_NETWORK_PROTOCOL_ERROR_REPORT by aliasStatic(ReportType::field_52184)
val ReportType.MINECRAFT_TEST_REPORT by aliasStatic(ReportType::field_52183)
fun ReportType.chooseNugget() = this.method_60927()
fun ReportType.addHeaderAndNugget(arg0: StringBuilder, arg1: List<String>) = this.method_60928(arg0, arg1)
fun ReportType.nuggets() = this.comp_2857()
fun ReportType.header() = this.comp_2856()
