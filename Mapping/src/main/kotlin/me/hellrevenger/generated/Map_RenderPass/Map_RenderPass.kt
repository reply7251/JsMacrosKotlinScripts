package me.hellrevenger.generated.Map_RenderPass
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_61933
 */
fun <T>RenderPass.transfer(handle: Handle<T>) = this.method_61933<T>(handle)
/**
 * method_61928
 */
fun <T>RenderPass.dependsOn(handle: Handle<T>) = this.method_61928<T>(handle)
/**
 * method_61930
 */
fun <T>RenderPass.addRequiredResource(name: String, factory: ClosableFactory<T>) = this.method_61930<T>(name, factory)
/**
 * method_61929
 */
fun RenderPass.setRenderer(renderer: Runnable) = this.method_61929(renderer)
/**
 * method_61927
 */
fun RenderPass.addRequired(pass: RenderPass) = this.method_61927(pass)
/**
 * method_61924
 */
fun RenderPass.markToBeVisited() = this.method_61924()
