package me.hellrevenger.jsmacroskotlinscript

import me.hellrevenger.jsmacroskotlinscript.ctransform.MixinClassLoader
import me.hellrevenger.jsmacroskotlinscript.script.library.api.instrumentation
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class JsMacrosKotlinScript : ModInitializer {
    companion object {
        val LOG: Logger = LoggerFactory.getLogger(JsMacrosKotlinScript::class.java)
    }

    override fun onInitialize() {

        // for reflection
        instrumentation.redefineModule(
            ClassLoader::class.java.module,
            setOf(),
            mapOf(),
            mapOf("java.lang" to setOf(this::class.java.module)),
            setOf(),
            mapOf()
        )
    }
}
