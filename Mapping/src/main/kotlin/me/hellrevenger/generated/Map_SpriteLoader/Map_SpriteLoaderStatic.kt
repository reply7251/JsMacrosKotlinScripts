package me.hellrevenger.generated.Map_SpriteLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SpriteLoaderKt {
    /**
     * field_45632
     */
    val METADATA_SERIALIZERS by aliasStatic(SpriteLoader::field_45632)
    /**
     * method_45837
     */
    fun fromAtlas(atlasTexture: SpriteAtlasTexture) = SpriteLoader.method_45837(atlasTexture)
    /**
     * method_47664
     */
    fun loadAll(opener: SpriteOpener, sources: MutableList<function_Function<SpriteOpener, SpriteContents>>, executor: Executor) = SpriteLoader.method_47664(opener, sources, executor)
}