package me.hellrevenger.jsmacroskotlinscript.script.library.api

object ScriptHolder {
    private val scripts = mutableMapOf<String, Any>()

    fun put(name: String, value: Any) {
        scripts[name] = value
    }

    fun put(value: Any) {
        put(value::class.java.name, value)
    }

    fun remove(value: Any) {
        scripts.remove(value::class.java.name)
    }

    @JvmStatic
    fun get(id: String): Any? {
        return scripts[id]
    }
}