package me.hellrevenger.generated.Map_SpriteIdentifier
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<SpriteIdentifier>.COMPARATOR by aliasStatic(SpriteIdentifier::field_40566)
fun SpriteIdentifier.getTextureId() = this.method_24147()
fun SpriteIdentifier.getSprite() = this.method_24148()
fun SpriteIdentifier.getAtlasId() = this.method_24144()
fun SpriteIdentifier.getVertexConsumer(arg0: VertexConsumerProvider, arg1: java.util.function.Function<Identifier, RenderLayer>) = this.method_24145(arg0, arg1)
fun SpriteIdentifier.getVertexConsumer(arg0: VertexConsumerProvider, arg1: java.util.function.Function<Identifier, RenderLayer>, arg2: Boolean) = this.method_30001(arg0, arg1, arg2)
fun SpriteIdentifier.getRenderLayer(arg0: java.util.function.Function<Identifier, RenderLayer>) = this.method_24146(arg0)
