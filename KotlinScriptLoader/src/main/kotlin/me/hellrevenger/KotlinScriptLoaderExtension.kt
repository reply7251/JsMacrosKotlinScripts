package me.hellrevenger

import com.jsmacrosce.jsmacros.core.Core
import com.jsmacrosce.jsmacros.core.extensions.Extension
import com.jsmacrosce.jsmacros.core.extensions.LanguageExtension
import com.jsmacrosce.jsmacros.core.extensions.LibraryExtension
import java.io.IOException
import java.net.URL
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import java.util.*
import java.util.stream.Collectors


class KotlinScriptLoaderExtension : Extension {
    override fun getExtensionName() = "KotlinScriptLoader"

    lateinit var extPath: Path
    lateinit var classLoader: ClassLoader
    lateinit var addURLImpl: (URL) -> Unit

    override fun init(core: Core<*, *>) {
        extPath = core.config.configFolder.toPath().resolve("Extensions")
        classLoader = core::class.java.classLoader
        classLoader._getPrivateMethod("addUrlFwd", listOf(URL::class.java)).let { method ->
            method.trySetAccessible()
            addURLImpl = { url ->
                method.invoke(classLoader, url)
            }
        }

        extractKotlinScriptExtension(core)
    }

    fun extractKotlinScriptExtension(core: Core<*, *>) {
        println("loading kotlin script extension")
        val scriptDefUrl = this::class.java.getResource("/META-INF/ScriptDefs.jar")
            ?: throw RuntimeException("cannot find ScriptDefs.jar")
        extractAndAddURL(scriptDefUrl, "KotlinScriptTmp")

        val extensions = ServiceLoader.load(Extension::class.java, classLoader)
            .stream()
            .map(ServiceLoader.Provider<Extension>::get)
            .collect(Collectors.toSet<Extension>())

        for (extension in extensions) {
            try {
                val deps = extension.dependencies
                for (dep in deps) {
                    extractAndAddURL(dep, "KotlinScriptTmp/tmp")
                }
            } catch (e: Exception) {
                throw RuntimeException(e)
            }
        }
        Thread.currentThread().contextClassLoader = classLoader

        val libraryExtensions = core.extensions.allLibraryExtensions
        val languageExtensions = core.extensions.allLanguageExtensions
        for (extension in extensions) {
            try {
                extension.init(core)
                if (extension is LibraryExtension) {
                    libraryExtensions.add(extension)
                    for (lib in extension.libraries) {
                        core.libraryRegistry.addLibrary(lib)
                    }
                }
                if (extension is LanguageExtension) {
                    languageExtensions.add(extension)
                }
            } catch (e: Exception) {
                throw RuntimeException(e)
            }
        }
    }

    fun extractAndAddURL(lib: URL, folder: String) {
        println("extracting: $lib")
        val dependenciesPath = extPath.resolve(folder)
        try {
            Files.createDirectories(dependenciesPath)
        } catch (e: IOException) {
            throw java.lang.RuntimeException(e)
        }

        // copy resource to dependencies folder
        val path: Path = dependenciesPath.resolve(lib.path.substring(lib.path.lastIndexOf('/') + 1))
        try {
            lib.openStream().use { stream ->
                Files.write(
                    path,
                    stream.readAllBytes(),
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.CREATE
                )
                addURL(path.toUri().toURL())
            }
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    fun addURL(lib: URL) {
        addURLImpl(lib)
    }
}