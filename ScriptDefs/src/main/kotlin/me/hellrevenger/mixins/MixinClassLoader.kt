package me.hellrevenger.mixins

import me.hellrevenger.library.api.RuntimeMixin
import me.hellrevenger.library.api.forceLoadTo
import me.hellrevenger.library.api.instrumentation
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import org.spongepowered.tools.agent.MixinAgent
import java.lang.instrument.Instrumentation

@CReplaceCallback
@CTransformer(name = ["net.fabricmc.loader.impl.launch.knot.KnotClassDelegate"])
class MixinKnotClassDelegate {
    @CInline
    @CInject(method = ["tryLoadClass"], target = [CTarget("HEAD")], cancellable = true)
    fun loadClass(name: String, allowFromParent: Boolean, cir: InjectionCallback) {
        if (name.equals("me.hellrevenger.mixins.MixinClassLoaderCallback")) {
            cir.returnValue = this.javaClass.classLoader.loadClass(name)
        }
    }
}

@CReplaceCallback
@CTransformer(name = ["net.fabricmc.loader.impl.launch.knot.KnotClassLoader"])
class MixinKnotClassLoader {

    @CInline
    @CInject(method = ["findLoadedClassFwd"], target = [CTarget("RETURN")], cancellable = true)
    fun findLoadedClassFwd2(name: String, cir: InjectionCallback) {
        if(cir.returnValue != null) return
        cir.returnValue = MixinClassLoaderCallback.forceLoadedClasses[name]
    }
}

class MixinClassLoader {
    companion object {
        var manager = RuntimeMixin.createTransformManager()

        init {
            val classloader = this::class.java.classLoader
            classloader.getResourceAsStream("me/hellrevenger/mixins/MixinClassLoaderCallback.class")?.use { stream ->
                println("force loading MixinClassLoaderCallback to ${classloader.javaClass.classLoader}")
                forceLoadTo(
                    "me.hellrevenger.mixins.MixinClassLoaderCallback",
                    stream.readBytes(),
                    classloader.javaClass.classLoader
                )
                classloader.javaClass.classLoader.loadClass("me.hellrevenger.mixins.MixinClassLoaderCallback")
            }
        }

        fun setEnabled(enabled: Boolean) {
            println("classloader setEnabled")
            RuntimeMixin.removeTransformManager(manager)
            if(enabled) {
                manager = RuntimeMixin.createTransformManager()
                manager.addTransformer(MixinKnotClassLoader::class.java.name)
                manager.addTransformer(MixinKnotClassDelegate::class.java.name)
                manager.hookInstrumentation(instrumentation)
            }
        }
    }
}

object MixinClassLoaderCallback {
    val forceLoadedClasses = hashMapOf<String, Class<*>>()
}