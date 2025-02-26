package me.hellrevenger.generated.Map_ScreenshotRecorder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_41337
 */
val KClass<ScreenshotRecorder>.SCREENSHOTS_DIRECTORY by aliasStatic(ScreenshotRecorder::field_41337)
/**
 * method_35712
 */
fun ScreenshotRecorder.finish() = this.method_35712()
/**
 * method_35710
 */
fun ScreenshotRecorder.writeToStream() = this.method_35710()
/**
 * method_1663
 */
fun KClass<ScreenshotRecorder>.takeScreenshot(arg0: Framebuffer) = ScreenshotRecorder.method_1663(arg0)
/**
 * method_1659
 */
fun KClass<ScreenshotRecorder>.saveScreenshot(arg0: File, arg1: Framebuffer, arg2: Consumer<Text>) = ScreenshotRecorder.method_1659(arg0, arg1, arg2)
/**
 * method_22690
 */
fun KClass<ScreenshotRecorder>.saveScreenshot(arg0: File, arg1: String, arg2: Framebuffer, arg3: Consumer<Text>) = ScreenshotRecorder.method_22690(arg0, arg1, arg2, arg3)
/**
 * method_35711
 */
fun ScreenshotRecorder.getIntoBuffer(arg0: ByteBuffer, arg1: Int, arg2: Int, arg3: Int, arg4: Int) = this.method_35711(arg0, arg1, arg2, arg3, arg4)
