package me.hellrevenger.generated.Map_NbtType
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>NbtType<T>.accept(arg0: DataInput, arg1: NbtScanner, arg2: NbtSizeTracker) where T: NbtElement = this.method_39877(arg0, arg1, arg2)
fun <T>NbtType<T>.doAccept(arg0: DataInput, arg1: NbtScanner, arg2: NbtSizeTracker) where T: NbtElement = this.method_39852(arg0, arg1, arg2)
fun <T>NbtType<T>.getCommandFeedbackName() where T: NbtElement = this.method_23261()
fun <T>NbtType<T>.read(arg0: DataInput, arg1: NbtSizeTracker) where T: NbtElement = this.method_23262(arg0, arg1)
fun <T>NbtType<T>.skip(arg0: DataInput, arg1: Int, arg2: NbtSizeTracker) where T: NbtElement = this.method_39854(arg0, arg1, arg2)
fun <T>NbtType<T>.isImmutable() where T: NbtElement = this.method_23263()
fun <T>NbtType<T>.getCrashReportName() where T: NbtElement = this.method_23259()
fun <T>KClass<NbtType<T>>.createInvalid(arg0: Int) where T: NbtElement = NbtType.method_23260(arg0)
fun <T>NbtType<T>.skip(arg0: DataInput, arg1: NbtSizeTracker) where T: NbtElement = this.method_39851(arg0, arg1)
