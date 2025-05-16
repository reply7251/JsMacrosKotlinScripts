package me.hellrevenger.generated.Map_ScreenshotRecorder
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ScreenshotRecorderKt {
    /**
     * field_41337
     */
    val SCREENSHOTS_DIRECTORY by aliasStatic(ScreenshotRecorder::field_41337)
    /**
     * method_1663
     */
    fun takeScreenshot(framebuffer: Framebuffer?) = ScreenshotRecorder.method_1663(framebuffer)
    /**
     * method_1659
     */
    fun saveScreenshot(gameDirectory: File?, framebuffer: Framebuffer?, messageReceiver: Consumer<Text>?) = ScreenshotRecorder.method_1659(gameDirectory, framebuffer, messageReceiver)
    /**
     * method_22690
     */
    fun saveScreenshot(gameDirectory: File?, fileName: String?, framebuffer: Framebuffer?, messageReceiver: Consumer<Text>?) = ScreenshotRecorder.method_22690(gameDirectory, fileName, framebuffer, messageReceiver)
}