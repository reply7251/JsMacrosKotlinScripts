package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Window

fun Window.shouldClose() = this.method_22093()
fun Window.setFramerateLimit(arg0: Int) = this.method_15999(arg0)
fun Window.setFramebufferWidth(arg0: Int) = this.method_35642(arg0)
fun Window.isFullscreen() = this.method_4498()
fun Window.setVideoMode(arg0: Optional<VideoMode>) = this.method_4505(arg0)
fun KClass<Window>.acceptError(arg0: BiConsumer<Int, String>) = Window.method_4492(arg0)
fun Window.getX() = this.method_4499()
fun Window.toggleFullscreen() = this.method_4500()
fun Window.swapBuffers() = this.method_15998()
fun Window.setPhase(arg0: String) = this.method_4474(arg0)
fun Window.applyVideoMode() = this.method_4475()
fun Window.getMonitor() = this.method_20831()
fun Window.setIcon(arg0: ResourcePack, arg1: Icons) = this.method_4491(arg0, arg1)
fun KClass<Window>.getGlfwPlatform() = Window.method_60793()
fun Window.setWindowedSize(arg0: Int, arg1: Int) = this.method_36813(arg0, arg1)
fun Window.logOnGlError() = this.method_4513()
fun Window.setTitle(arg0: String) = this.method_24286(arg0)
fun Window.logGlError(arg0: Int, arg1: Long) = this.method_4482(arg0, arg1)
fun Window.getRefreshRate() = this.method_22092()
fun Window.getY() = this.method_4477()
fun Window.setScaleFactor(arg0: Double) = this.method_15997(arg0)
fun Window.setRawMouseMotion(arg0: Boolean) = this.method_21668(arg0)
fun Window.setFramebufferHeight(arg0: Int) = this.method_35643(arg0)
fun Window.calculateScaleFactor(arg0: Int, arg1: Boolean) = this.method_4476(arg0, arg1)
fun Window.setVsync(arg0: Boolean) = this.method_4497(arg0)
