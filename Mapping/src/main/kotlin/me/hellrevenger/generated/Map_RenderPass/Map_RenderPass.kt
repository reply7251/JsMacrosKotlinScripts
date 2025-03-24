package me.hellrevenger.generated.Map_RenderPass
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_61933
 */
fun <T>RenderPass.transfer(arg0: Handle<T>) = this.method_61933<T>(arg0)
/**
 * method_61928
 */
fun <T>RenderPass.dependsOn(arg0: Handle<T>) = this.method_61928<T>(arg0)
/**
 * method_61930
 */
fun <T>RenderPass.addRequiredResource(arg0: String, arg1: ClosableFactory<T>) = this.method_61930<T>(arg0, arg1)
/**
 * method_61929
 */
fun RenderPass.setRenderer(arg0: Runnable) = this.method_61929(arg0)
/**
 * method_61927
 */
fun RenderPass.addRequired(arg0: RenderPass) = this.method_61927(arg0)
/**
 * method_61924
 */
fun RenderPass.markToBeVisited() = this.method_61924()
