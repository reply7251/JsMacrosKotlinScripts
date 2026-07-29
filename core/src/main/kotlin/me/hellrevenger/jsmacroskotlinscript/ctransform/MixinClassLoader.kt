package me.hellrevenger.jsmacroskotlinscript.ctransform

import me.hellrevenger.jsmacroskotlinscript.script.language.CompilerSetting
import me.hellrevenger.jsmacroskotlinscript.script.library.api.CTargetType
import me.hellrevenger.jsmacroskotlinscript.script.library.api.RuntimeMixin
import me.hellrevenger.jsmacroskotlinscript.script.library.api.forceLoadTo
import me.hellrevenger.jsmacroskotlinscript.script.library.api.instrumentation
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.TransformerManager
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.annotations.injection.CRedirect
import org.jetbrains.kotlin.io.vavr.Function1
import org.jetbrains.kotlin.name.FqName
import kotlin.script.experimental.api.SourceCode

@CReplaceCallback
@CTransformer(name = ["net.fabricmc.loader.impl.launch.knot.KnotClassDelegate"])
class MixinKnotClassDelegate {
    @CInline
    @CInject(method = ["tryLoadClass"], target = [CTarget("HEAD")], cancellable = true)
    fun loadClass(name: String, allowFromParent: Boolean, cir: InjectionCallback) {
        if (name.equals("me.hellrevenger.jsmacroskotlinscript.ctransform.MixinClassLoaderCallback")) {
            cir.returnValue = this.javaClass.classLoader.loadClass(name)
        }
    }
}

@CReplaceCallback
@CTransformer(name = ["net.fabricmc.loader.impl.launch.knot.KnotClassLoader"])
class MixinKnotClassLoader {

    @CInline
    @CInject(method = ["findLoadedClassFwd"], target = [CTarget("RETURN")], cancellable = true)
    fun findLoadedClassFwd(name: String, cir: InjectionCallback) {
        if(cir.returnValue != null) return
        cir.returnValue = MixinClassLoaderCallback.forceLoadedClasses[name]
        if (cir.returnValue != null)
            println("force loading $name")
    }
}

@CReplaceCallback
@CTransformer(name = ["org.jetbrains.kotlin.scripting.compiler.plugin.impl.JvmCompilationUtilKt"])
object MixinJvmCompilationUtilKt {
    @CInline
    @CRedirect(method = ["makeCompiledScript"], target = CTarget(CTargetType.SIMPLE_INVOKE, "invoke", ordinal = 0))
    @JvmStatic
    fun makeCompiledScript(function: Any, script: Any): Any {
        println(script)
        return FqName((script as SourceCode).name!!.replace(".", "_"))
    }
}

class MixinClassLoader {
    companion object {
        fun init(manager: TransformerManager) {
            if (!CompilerSetting.shouldPatchClassloader()) {
                return
            }
            val classloader = this::class.java.classLoader
            val className = "me.hellrevenger.jsmacroskotlinscript.ctransform.MixinClassLoaderCallback"
            classloader.getResourceAsStream(className.replace(".", "/") + ".class")?.use { stream ->
                println("force loading MixinClassLoaderCallback to ${classloader.javaClass.classLoader}")
                forceLoadTo(
                    className,
                    stream.readBytes(),
                    classloader.javaClass.classLoader
                )
                classloader.javaClass.classLoader.loadClass(className)
            }
            manager.addTransformer(MixinKnotClassLoader::class.java.name)
            manager.addTransformer(MixinKnotClassDelegate::class.java.name)
        }
    }
}

object MixinClassLoaderCallback {
    val forceLoadedClasses = hashMapOf<String, Class<*>>()
}