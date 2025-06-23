package me.hellrevenger.mixins

import me.hellrevenger.library.api.RuntimeMixin
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
@CTransformer(name = ["net.fabricmc.loader.impl.launch.knot.KnotClassLoader"])
class MixinKnotClassLoader {
    @CInline
    @CInject(method = ["findLoadedClassFwd"], target = [CTarget("RETURN")], cancellable = true)
    fun findLoadedClassFwd(name: String?, cir: InjectionCallback?) {
        if(cir == null || name == null || cir.returnValue != null) return
        val contains = java.lang.String::class.java.getMethod("contains", java.lang.CharSequence::class.java)
        val startsWith = java.lang.String::class.java.getMethod("startsWith", java.lang.String::class.java)
        if(!contains.invoke(name, "_jsm$").equals(true) && !startsWith.invoke(name, "kotlin.").equals(true)) return
        val stackTrace = Thread.currentThread().stackTrace
        if(stackTrace.size < 6) return
        val loaderName = stackTrace[5].classLoaderName
        if(loaderName == null || !loaderName.equals("knot")) return

        val field = MixinAgent::class.java.getDeclaredField("instrumentation")
        if(field.trySetAccessible()) {
            val inst = field.get(null) as? Instrumentation
            if(inst != null) {
                val classes = inst.allLoadedClasses
                var i = classes.size
                while (i-- > 0) {
                    val clazz = classes[i]
                    if(clazz.name.equals(name)) {
                        cir.returnValue = clazz
                        cir.isCancelled = true
                        return
                    }
                }
            }
        }
    }
}

object Deprecated {
    val deprecatedClassLoaders = hashSetOf<ClassLoader>()
}

class MixinClassLoader {
    companion object {
        var manager = RuntimeMixin.createTransformManager()

        fun setEnabled(enabled: Boolean) {
            RuntimeMixin.removeTransformManager(manager)
            if(enabled) {
                manager = RuntimeMixin.createTransformManager()
                manager.addTransformer(MixinKnotClassLoader::class.java.name)
                manager.hookInstrumentation(instrumentation)
            }
        }
    }
}