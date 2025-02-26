package me.hellrevenger.mixins
import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.implementation.MethodDelegation
import net.bytebuddy.matcher.ElementMatchers

object MixinCompilier {
    fun mixin() {
        val clazz = Class.forName("org.jetbrains.kotlin.scripting.compiler.plugin.impl.ScriptJvmCompilerImplsKt")

        RuntimeMixin.setIntercept(clazz, ElementMatchers.named("doCompileWithK2"), MethodDelegation.withDefaultConfiguration().filter(ElementMatchers.named("doCompile")).to(clazz))
        RuntimeMixin.doMixin(clazz)
    }
}