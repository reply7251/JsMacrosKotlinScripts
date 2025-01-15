package me.hellrevenger.generated.Map_TextureManager
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<TextureManager>.MISSING_IDENTIFIER by aliasStatic(TextureManager::field_5285)
fun TextureManager.loadTextureAsync(arg0: Identifier, arg1: Executor) = this.method_18168(arg0, arg1)
fun TextureManager.bindTexture(arg0: Identifier) = this.method_22813(arg0)
fun TextureManager.destroyTexture(arg0: Identifier) = this.method_4615(arg0)
fun TextureManager.getTexture(arg0: Identifier) = this.method_4619(arg0)
fun TextureManager.dumpDynamicTextures(arg0: file_Path) = this.method_49715(arg0)
fun TextureManager.registerTexture(arg0: Identifier, arg1: AbstractTexture) = this.method_4616(arg0, arg1)
fun TextureManager.getOrDefault(arg0: Identifier, arg1: AbstractTexture) = this.method_34590(arg0, arg1)
fun TextureManager.registerDynamicTexture(arg0: String, arg1: NativeImageBackedTexture) = this.method_4617(arg0, arg1)
