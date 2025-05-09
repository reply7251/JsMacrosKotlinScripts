package me.hellrevenger.generated.Map_NbtType
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_39877
 */
fun <T>NbtType<T>.accept(input: DataInput, visitor: NbtScanner, tracker: NbtSizeTracker) where T: NbtElement = this.method_39877(input, visitor, tracker)
/**
 * method_39852
 */
fun <T>NbtType<T>.doAccept(input: DataInput, visitor: NbtScanner, tracker: NbtSizeTracker) where T: NbtElement = this.method_39852(input, visitor, tracker)
/**
 * method_23261
 */
fun <T>NbtType<T>.getCommandFeedbackName() where T: NbtElement = this.method_23261()
/**
 * method_23262
 */
fun <T>NbtType<T>.read(input: DataInput, tracker: NbtSizeTracker) where T: NbtElement = this.method_23262(input, tracker)
/**
 * method_39854
 */
fun <T>NbtType<T>.skip(input: DataInput, count: Int, tracker: NbtSizeTracker) where T: NbtElement = this.method_39854(input, count, tracker)
/**
 * method_23263
 */
fun <T>NbtType<T>.isImmutable() where T: NbtElement = this.method_23263()
/**
 * method_23259
 */
fun <T>NbtType<T>.getCrashReportName() where T: NbtElement = this.method_23259()
/**
 * method_39851
 */
fun <T>NbtType<T>.skip(input: DataInput, tracker: NbtSizeTracker) where T: NbtElement = this.method_39851(input, tracker)
