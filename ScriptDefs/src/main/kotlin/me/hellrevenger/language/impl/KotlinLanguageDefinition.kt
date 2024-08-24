package me.hellrevenger.language.impl

import me.hellrevenger.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.config.ScriptTrigger
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.extensions.Extension
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.library.BaseLibrary
import java.io.File
import java.net.URLClassLoader
import kotlin.collections.HashMap
import kotlin.collections.Map
import kotlin.collections.MutableMap
import kotlin.collections.Set
import kotlin.collections.flatMap
import kotlin.collections.hashMapOf
import kotlin.collections.isNullOrEmpty
import kotlin.collections.map
import kotlin.collections.mapOf
import kotlin.collections.mapValues
import kotlin.collections.plus
import kotlin.collections.remove
import kotlin.collections.set
import kotlin.collections.toMap
import kotlin.collections.toSet
import kotlin.collections.toTypedArray
import kotlin.reflect.KClass
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.*
import kotlin.script.experimental.jvm.*
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

fun noop() {
    //println("noop: " + MinecraftClient.method_1551().player)
}

class KotlinLanguageDefinition(extension: Extension?, runner: Core<*, *>?)
    : BaseLanguage<BasicJvmScriptingHost, KotlinScriptContext>(extension, runner) {

    var libraries: Map<String, BaseLibrary>? = null

    override fun retrieveLibs(context: KotlinScriptContext?): MutableMap<String, BaseLibrary> {
        val result = super.retrieveLibs(context)
        if(libraries == null) {
            libraries = result.toMap()
        }
        return result
    }

    fun internalExec(ctx: EventContainer<KotlinScriptContext>, event: BaseEvent?, callback: (BasicJvmScriptingHost, ScriptCompilationConfiguration, ScriptEvaluationConfiguration) -> Unit) {
        val vars = mapOf(
            "event" to event,
            "file" to ctx.ctx.file,
            "context" to ctx
        )

        val libs = retrieveLibs(ctx.ctx)

        val cl = SubClassLoader(FWrapper::class.java.classLoader)

        val compConf = object : ScriptCompilationConfiguration({
            jvm {
                // Extract the whole classpath from context classloader and use it as dependencies
                dependenciesFromCurrentContext(wholeClasspath = true)
            }

            dependencies.append(JvmDependencyFromClassLoader { KotlinLanguageDefinition::class.java.classLoader })
            dependencies.append(JvmDependencyFromClassLoader { cl })
            dependencies.append(subLibraries.getClassLoaders().map { cl -> JvmDependencyFromClassLoader { cl } })

            providedProperties.replaceOnlyDefault(mapOf(
                "event" to KotlinType(if (event == null) BaseEvent::class else event::class, isNullable = true),
                "file" to KotlinType(File::class, isNullable = true),
                "context" to KotlinType(EventContainer::class)
            ) + libs.mapValues { KotlinType(it.value::class) } + mapOf(
                "SubLibraries" to KotlinType(SubLibraries::class),
            ) + subLibraries.getLibraryTypes())

        }) {}
        val execConf = object : ScriptEvaluationConfiguration({

            providedProperties(vars + libs + mapOf(
                "SubLibraries" to subLibraries
            ) + subLibraries.getLibraryInstances())
        }) {}

        var conf: ScriptingHostConfiguration? = null
        conf = conf.withDefaultsFrom(defaultJvmScriptingHostConfiguration).with {
            getScriptingClass.put(object : GetScriptingClassByClassLoader {
                var setClassLoader: ClassLoader? = null
                override fun invoke(
                    classType: KotlinType,
                    contextClassLoader: ClassLoader?,
                    hostConfiguration: ScriptingHostConfiguration
                ): KClass<*> {
                    val fromClass = classType.fromClass
                    if (fromClass != null) {
                        if (fromClass.java.classLoader == null) return fromClass // root classloader
                        val actualClassLoadersChain = generateSequence(contextClassLoader) { it.parent }
                        if (actualClassLoadersChain.any { it == fromClass.java.classLoader }) return fromClass
                    }
                    val newDeps = hostConfiguration[configurationDependencies]
                    if(setClassLoader == null) {
                        val classpath = newDeps?.flatMap { dependency ->
                            when (dependency) {
                                is JvmDependency -> dependency.classpath.map { it.toURI().toURL() }
                                else -> throw IllegalArgumentException("unknown dependency type $dependency")
                            }
                        }
                        setClassLoader =
                            if (classpath.isNullOrEmpty()) SubClassLoader(contextClassLoader!!)
                            else SubClassLoader(URLClassLoader(classpath.toTypedArray(), contextClassLoader))
                    }

                    return try {
                        (setClassLoader ?: ClassLoader.getSystemClassLoader()).loadClass(classType.typeName).kotlin
                    } catch (e: Throwable) {
                        throw IllegalArgumentException("SubKotlin: unable to load class ${classType.typeName}", e)
                    }
                }

                override fun invoke(
                    classType: KotlinType,
                    contextClass: KClass<*>,
                    hostConfiguration: ScriptingHostConfiguration
                ) = invoke(classType, contextClass.java.classLoader, hostConfiguration)
            })
        }

        val host = BasicJvmScriptingHost(conf)
        ctx.ctx.context = host

        callback(ctx.ctx.context, compConf, execConf)
    }

    override fun exec(ctx: EventContainer<KotlinScriptContext>, p1: ScriptTrigger, event: BaseEvent) {
        internalExec(ctx, event) { host, compConf, evalConf ->
            val ret = host.eval(ctx.ctx.file!!.toScriptSource(), compConf, evalConf)
            ret.onFailure {
                throw KotlinCompileException(it)
            }

            val retOrThrow = ret.valueOrThrow().returnValue
            if (retOrThrow is ResultValue.Error) {
                throw KotlinRuntimeException(retOrThrow.error, ctx.ctx.file)
            }
        }
    }

    override fun exec(ctx: EventContainer<KotlinScriptContext>, lang: String, script: String, event: BaseEvent) {
        internalExec(ctx, event) { host, compConf, evalConf ->
            val ret = host.eval(script.toScriptSource(), compConf, evalConf)
            ret.onFailure {
                throw KotlinCompileException(it)
            }

            val retOrThrow = ret.valueOrThrow().returnValue
            if (retOrThrow is ResultValue.Error) {
                throw KotlinRuntimeException(retOrThrow.error, ctx.ctx.file)
            }
        }
    }

    override fun createContext(p0: BaseEvent?, p1: File?): KotlinScriptContext {
        return KotlinScriptContext(p0, p1)
    }

    class KotlinCompileException(val resultWithDiagnostics: ResultWithDiagnostics<*>) : Exception()
    class KotlinRuntimeException(val error: Throwable, val file: File?) : Exception(error)
}



class SubLibraries {
    val libraries: HashMap<String, Class<*>> = hashMapOf()
    val librarySupplier : HashMap<String, () -> Any> = hashMapOf()
    val libraryNames: HashMap<String, Class<*>> = hashMapOf()
    fun <T : Any> addLibrary(name: String, clazz: Class<T>, provider: () -> T): Class<*>? {
        libraryNames[clazz.typeName] = clazz
        librarySupplier[name] = provider
        return libraries.put(name, clazz)
    }

    fun removeLibrary(name: String): Class<*>? {
        librarySupplier.remove(name)
        return libraryNames.remove(libraries.remove(name)?.typeName)
    }

    fun getLibraryTypes(): Map<String, KotlinType> {
        return libraries.mapValues { KotlinType(it.value.kotlin) }
    }

    fun getLibraryInstances(): Map<String, Any?> {
        return librarySupplier.mapValues { it.value.invoke() }
    }

    fun getClassLoaders(): Set<ClassLoader> {
        return libraries.values.map { it.classLoader }.toSet()
    }
}

class SubClassLoader(parent: ClassLoader) : ClassLoader(parent) {
    override fun loadClass(name: String): Class<*> {
        try {
            return parent.loadClass(name)
        } catch (e: ClassNotFoundException) {

            val clazz = subLibraries.libraryNames[name]
            if(clazz != null) return clazz;
            throw e;
        }
    }
}

val subLibraries = SubLibraries()