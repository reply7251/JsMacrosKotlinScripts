package me.hellrevenger.generated.Map_PacketListener
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun PacketListener.accepts(arg0: Packet<*>) = this.method_52413(arg0)
fun PacketListener.addCustomCrashReportInfo(arg0: CrashReport, arg1: CrashReportSection) = this.method_55597(arg0, arg1)
fun PacketListener.fillCrashReport(arg0: CrashReport) = this.method_55622(arg0)
fun PacketListener.onDisconnected(arg0: DisconnectionInfo) = this.method_10839(arg0)
fun PacketListener.getPhase() = this.method_52280()
fun PacketListener.isConnectionOpen() = this.method_48106()
fun PacketListener.getSide() = this.method_52895()
fun PacketListener.createDisconnectionInfo(arg0: Text, arg1: Throwable) = this.method_60881(arg0, arg1)
