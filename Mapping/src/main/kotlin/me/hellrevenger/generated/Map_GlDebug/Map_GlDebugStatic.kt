package me.hellrevenger.generated.Map_GlDebug
import kotlin.reflect.*
import me.hellrevenger.generated.*
object GlDebugKt {
    /**
     * method_4227
     */
    fun enableDebug(verbosity: Int, sync: Boolean) = GlDebug.method_4227(verbosity, sync)
    /**
     * method_36479
     */
    fun isDebugMessageEnabled() = GlDebug.method_36479()
    /**
     * method_36478
     */
    fun collectDebugMessages() = GlDebug.method_36478()
    /**
     * method_4222
     */
    fun getSource(opcode: Int) = GlDebug.method_4222(opcode)
    /**
     * method_4226
     */
    fun getSeverity(opcode: Int) = GlDebug.method_4226(opcode)
    /**
     * method_4228
     */
    fun getType(opcode: Int) = GlDebug.method_4228(opcode)
}