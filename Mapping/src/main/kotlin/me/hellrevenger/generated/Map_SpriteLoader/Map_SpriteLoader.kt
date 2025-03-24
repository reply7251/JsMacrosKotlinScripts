package me.hellrevenger.generated.Map_SpriteLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_45632
 */
val KClass<SpriteLoader>.METADATA_SERIALIZERS by aliasStatic(SpriteLoader::field_45632)
/**
 * method_52849
 */
fun SpriteLoader.load(arg0: ResourceManager, arg1: Identifier, arg2: Int, arg3: Executor) = this.method_52849(arg0, arg1, arg2, arg3)
/**
 * method_47661
 */
fun SpriteLoader.load(arg0: ResourceManager, arg1: Identifier, arg2: Int, arg3: Executor, arg4: Collection<ResourceMetadataSerializer<*>>) = this.method_47661(arg0, arg1, arg2, arg3, arg4)
/**
 * method_45837
 */
fun KClass<SpriteLoader>.fromAtlas(arg0: SpriteAtlasTexture) = SpriteLoader.method_45837(arg0)
/**
 * method_47663
 */
fun SpriteLoader.stitch(arg0: MutableList<SpriteContents>, arg1: Int, arg2: Executor) = this.method_47663(arg0, arg1, arg2)
/**
 * method_47664
 */
fun KClass<SpriteLoader>.loadAll(arg0: SpriteOpener, arg1: MutableList<function_Function<SpriteOpener, SpriteContents>>, arg2: Executor) = SpriteLoader.method_47664(arg0, arg1, arg2)
