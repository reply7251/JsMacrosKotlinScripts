package me.hellrevenger.mixins

import com.google.gson.JsonObject
import me.hellrevenger.SharedLibraries
import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.implementation.MethodDelegation
import net.bytebuddy.matcher.ElementMatchers
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.config.ConfigManager
import xyz.wagyourtail.jsmacros.core.config.Option

class MixinCompiler {
    companion object {
        val clazz = Class.forName("org.jetbrains.kotlin.scripting.compiler.plugin.impl.ScriptJvmCompilerImplsKt")
        val matcher = ElementMatchers.named<MethodDescription>("doCompileWithK2")
        val delegate = MethodDelegation.withDefaultConfiguration().filter(ElementMatchers.named("doCompile")).to(clazz)
        var config: ConfigManager? = null

        fun mixin(runner: Core<*, *>) {
            config = runner.config
            runner.config.addOptions("MixinCompiler", MixinCompiler::class.java)
            runner.config.loadConfig()
            runner.config.getOptions(MixinCompiler::class.java).let {
                if(!it.K2Enabled) {
                    it.onDisabled()
                }
            }
        }

        fun isK2Enabled() = config?.getOptions(MixinCompiler::class.java)?.K2Enabled ?: true
    }

    @Transient
    var wasEnabled = true

    @JvmField
    @Option(translationKey = "K2", group = ["jsmacros.settings.general"], setter = "setEnabled")
    var K2Enabled = true

    @JvmName("setEnabled")
    fun setEnabled(enabled: Boolean) {
        val flag = K2Enabled != enabled
        wasEnabled = K2Enabled
        K2Enabled = enabled
        if(flag) {
            SharedLibraries.Chat.log("K2 enabled: $K2Enabled")
            if(K2Enabled) {
                onEnabled()
            } else {
                onDisabled()
            }
        }
    }

    fun onEnabled() {
        RuntimeMixin.removeIntercept(clazz, matcher)
        RuntimeMixin.doMixin(clazz)
    }

    fun onDisabled() {
        RuntimeMixin.setIntercept(clazz, matcher, delegate)
        RuntimeMixin.doMixin(clazz)
    }
}
