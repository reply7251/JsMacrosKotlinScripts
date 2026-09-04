package me.hellrevenger.jsmacroskotlinscript.script.library.api

object ScriptHolder {
    val name = this::class.java.name.slash()

    private val scripts = mutableMapOf<String, Any>()

    fun put(name: String, value: Any) {
        scripts[name] = value
    }

    fun put(value: Any) {
        put(value::class.java.name, value)
    }

    fun remove(name: String) {
        scripts.remove(name)
    }

    fun remove(value: Any) {
        remove(value::class.java.name)
    }

    @JvmStatic
    fun get(id: String): Any? {
        return scripts[id]
    }
}