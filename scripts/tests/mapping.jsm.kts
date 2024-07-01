import xyz.wagyourtail.jsmacros.core.classes.Mappings


val mapper = Reflection.loadMappingHelper("https://maven.fabricmc.net/net/fabricmc/yarn/1.21-rc1%2Bbuild.1/yarn-1.21-rc1%2Bbuild.1-v2.jar")

val mc = Client.minecraft as net.minecraft.client.MinecraftClient



fun <T> remap(o : T): Mappings.MappedClass<T>? {
    val clazz = o!!::class.java
    return mapper.remapClass(o)
}
