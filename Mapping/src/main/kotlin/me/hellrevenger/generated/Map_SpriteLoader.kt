package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpriteLoader

val SpriteLoader.METADATA_READERS by aliasStatic(SpriteLoader::field_45632)
fun SpriteLoader.load(arg0: ResourceManager, arg1: Identifier, arg2: Int, arg3: Executor) = this.method_52849(arg0, arg1, arg2, arg3)
fun SpriteLoader.load(arg0: ResourceManager, arg1: Identifier, arg2: Int, arg3: Executor, arg4: Collection<ResourceMetadataReader<*>>) = this.method_47661(arg0, arg1, arg2, arg3, arg4)
fun KClass<SpriteLoader>.fromAtlas(arg0: SpriteAtlasTexture) = SpriteLoader.method_45837(arg0)
fun SpriteLoader.stitch(arg0: List<SpriteContents>, arg1: Int, arg2: Executor) = this.method_47663(arg0, arg1, arg2)
fun KClass<SpriteLoader>.loadAll(arg0: SpriteOpener, arg1: List<Function<SpriteOpener, SpriteContents>>, arg2: Executor) = SpriteLoader.method_47664(arg0, arg1, arg2)
