package me.hellrevenger.generated.Map_JsonUnbakedModel
import kotlin.reflect.*
import me.hellrevenger.generated.*

var JsonUnbakedModel.id by alias(JsonUnbakedModel::field_4252)
val KClass<JsonUnbakedModel>.PARTICLE_KEY by aliasStatic(JsonUnbakedModel::field_32792)
fun JsonUnbakedModel.getGuiLight() = this.method_24298()
fun JsonUnbakedModel.textureExists(arg0: String) = this.method_3432(arg0)
fun JsonUnbakedModel.getOverrides() = this.method_3434()
fun JsonUnbakedModel.resolveSprite(arg0: String) = this.method_24077(arg0)
fun KClass<JsonUnbakedModel>.deserialize(arg0: Reader) = JsonUnbakedModel.method_3437(arg0)
fun JsonUnbakedModel.needsResolution() = this.method_35789()
fun JsonUnbakedModel.getTransformations() = this.method_3443()
fun JsonUnbakedModel.getElements() = this.method_3433()
fun KClass<JsonUnbakedModel>.deserialize(arg0: String) = JsonUnbakedModel.method_3430(arg0)
fun JsonUnbakedModel.useAmbientOcclusion() = this.method_3444()
fun JsonUnbakedModel.bake(arg0: Baker, arg1: JsonUnbakedModel, arg2: java.util.function.Function<SpriteIdentifier, Sprite>, arg3: ModelBakeSettings, arg4: Boolean) = this.method_3446(arg0, arg1, arg2, arg3, arg4)
fun JsonUnbakedModel.getRootModel() = this.method_3431()
