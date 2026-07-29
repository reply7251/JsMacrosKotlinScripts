package me.hellrevenger.jsmacroskotlinscript.ctransform

import me.hellrevenger.jsmacroskotlinscript.script.library.api.RuntimeMixin
import me.hellrevenger.jsmacroskotlinscript.script.library.api.instrumentation

object MixinMain {
    fun process() {
        val manager = RuntimeMixin.createTransformManager()
        MixinClassLoader.init(manager)
        manager.hookInstrumentation(instrumentation)
    }
}