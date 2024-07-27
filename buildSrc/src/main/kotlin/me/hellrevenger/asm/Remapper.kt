package me.hellrevenger.asm

import java.io.File

class Remapper : IMappingAccessor {
    val classMap = hashMapOf<String, String>()
    val methodMap = hashMapOf<String, String>()
    val fieldMap = hashMapOf<String, String>()
    val methodArgMap = hashMapOf<String, String>()

    val aliases = hashMapOf<String, String>()
    val reverseAliases = hashMapOf<String, String>()

    fun getSimpleClassName(name: String): String {
        var name2 = name.replace("/", ".")
        if(name2.matches(".+\\$\\d+$".toRegex())) return name2
        if(name2 in aliases) return aliases[name2]!!
        name2 = name2.replace("$", ".")
        val className = classMap[name] ?: return name2
        if(className.matches(".+class_\\d+".toRegex())) return name2
        val split = className.split(".")
        var index = split.size-1
        var simpleName = split[index--]
        while (simpleName in reverseAliases) {
            if(index < 0) return name2
            simpleName = split[index--] + "_" + simpleName
        }
        simpleName = simpleName.replace("$","__")
        reverseAliases[simpleName] = name2
        aliases[name2] = simpleName
        return simpleName
    }

    override fun accessClass(src: String?, dst: String?) {
        if(src == null || dst == null) return
        classMap[src] = dst
    }

    override fun accessField(src: IMappingAccessor.Member, dst: String?) {
        if(src.owner == null || src.name == null || src.desc == null || dst == null) return
        fieldMap[src.owner + "/" + src.name + src.desc] = dst
    }

    override fun accessMethod(src: IMappingAccessor.Member, dst: String?) {
        if(src.owner == null || src.name == null || src.desc == null || dst == null) return
        methodMap[src.owner + "/" + src.name] = dst
    }

    override fun accessMethodArg(src: IMappingAccessor.Member, index: Int, dst: String?) {
        if(src.owner == null || src.name == null || src.desc == null || dst == null) return
        methodArgMap[src.owner + "/" + src.name + index] = dst
    }
}