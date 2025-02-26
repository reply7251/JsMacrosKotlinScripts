package me.hellrevenger.generated.Map_DebugRecorder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_32676
 */
val KClass<DebugRecorder>.MAX_DURATION_IN_SECONDS by aliasStatic(DebugRecorder::field_32676)
/**
 * method_35762
 */
fun KClass<DebugRecorder>.setGlobalDumpConsumer(arg0: Consumer<file_Path>) = DebugRecorder.method_35762(arg0)
/**
 * method_37191
 */
fun KClass<DebugRecorder>.of(arg0: SamplerSource, arg1: LongSupplier, arg2: Executor, arg3: RecordDumper, arg4: Consumer<ProfileResult>, arg5: Consumer<file_Path>) = DebugRecorder.method_37191(arg0, arg1, arg2, arg3, arg4, arg5)
