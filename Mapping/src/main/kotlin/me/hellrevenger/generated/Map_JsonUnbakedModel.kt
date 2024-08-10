package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.JsonUnbakedModel

val JsonUnbakedModel.id by alias(JsonUnbakedModel::field_4252)
val JsonUnbakedModel.GSON by aliasStatic(JsonUnbakedModel::field_4254)
val JsonUnbakedModel.PARTICLE_KEY by aliasStatic(JsonUnbakedModel::field_32792)
fun JsonUnbakedModel.textureExists(arg0: String) = this.method_3432(arg0)
fun JsonUnbakedModel.resolveSprite(arg0: String) = this.method_24077(arg0)
fun KClass<JsonUnbakedModel>.deserialize(arg0: Reader) = JsonUnbakedModel.method_3437(arg0)
fun JsonUnbakedModel.needsResolution() = this.method_35789()
fun KClass<JsonUnbakedModel>.deserialize(arg0: String) = JsonUnbakedModel.method_3430(arg0)
fun JsonUnbakedModel.useAmbientOcclusion() = this.method_3444()
fun JsonUnbakedModel.bake(arg0: Baker, arg1: JsonUnbakedModel, arg2: Function<SpriteIdentifier, Sprite>, arg3: ModelBakeSettings, arg4: Boolean) = this.method_3446(arg0, arg1, arg2, arg3, arg4)
fun JsonUnbakedModel.getRootModel() = this.method_3431()
