package me.hellrevenger.generated.Map_DebugRecorder
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DebugRecorderKt {
    /**
     * field_32676
     */
    val MAX_DURATION_IN_SECONDS by aliasStatic(DebugRecorder::field_32676)
    /**
     * method_35762
     */
    fun setGlobalDumpConsumer(consumer: Consumer<file_Path>) = DebugRecorder.method_35762(consumer)
    /**
     * method_37191
     */
    fun of(source: SamplerSource, timeGetter: LongSupplier, dumpExecutor: Executor, dumper: RecordDumper, resultConsumer: Consumer<ProfileResult>, dumpConsumer: Consumer<file_Path>) = DebugRecorder.method_37191(source, timeGetter, dumpExecutor, dumper, resultConsumer, dumpConsumer)
}