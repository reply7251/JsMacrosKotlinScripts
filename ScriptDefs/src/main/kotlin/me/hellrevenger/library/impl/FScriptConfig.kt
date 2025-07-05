package me.hellrevenger.library.impl

import com.google.gson.GsonBuilder
import me.hellrevenger.language.impl.IClosableContext
import me.hellrevenger.language.impl.KotlinLanguageDefinition
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary
import java.io.File

class ExtensionConfig(val folder: File, val fileName: String) {
    var builder = GsonBuilder().setPrettyPrinting()
    var gson = builder.create()
    val configFile = File(folder, fileName)
    private var hasRead = false
    private var obj: Any? = null

    fun setConfigObject(obj: Any? = null) {
        this.obj = obj
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> getConfigObject(type: Class<T>, default: (() -> T)? = null): T? {
        if(obj == null && !hasRead && configFile.exists()) {
            obj = gson.fromJson(configFile.reader(), type)
        }
        if(obj == null && default != null) obj = default()
        return obj as? T
    }

    fun save() {
        if (obj != null) {
            if(!configFile.exists()) {
                folder.mkdirs()
                configFile.createNewFile()
            }
            configFile.writeText(gson.toJson(obj))
        } else if(configFile.exists()) {
            configFile.delete()
        }
    }
}

@Library(value = "ScriptConfig", languages = [KotlinLanguageDefinition::class])
class FScriptConfig(context: BaseScriptContext<*>) : PerExecLibrary(context) {
    var builder = GsonBuilder().setPrettyPrinting()
    var gson = builder.create()
    private var hasRead = false
    private var obj: Any? = null
    val folder = File(ctx.containedFolder, "config")
    val configFile = File(folder, (context.file?.nameWithoutExtension ?: "unknown") + ".json")

    init {
        (context as? IClosableContext)?.onContextClosed { save() }
    }

    fun setConfigObject(obj: Any? = null) {
        this.obj = obj
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> getConfigObject(type: Class<T>, default: (() -> T)? = null): T? {
        if(obj == null && !hasRead && configFile.exists()) {
            obj = gson.fromJson(configFile.reader(), type)
        }
        if(obj == null && default != null) obj = default()
        return obj as? T
    }

    fun save() {
        if (obj != null) {
            if(!configFile.exists()) {
                folder.mkdirs()
                configFile.createNewFile()
            }
            configFile.writeText(gson.toJson(obj))
        } else if(configFile.exists()) {
            configFile.delete()
        }
    }
}