package me.hellrevenger.generated.Map_DrawContext
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_44658
 */
val DrawContext.vertexConsumers by alias(DrawContext::field_44658)
/**
 * method_44379
 */
fun DrawContext.enableScissor(x1: Int, y1: Int, x2: Int, y2: Int) = this.method_44379(x1, y1, x2, y2)
/**
 * method_51443
 */
fun DrawContext.getScaledWindowHeight() = this.method_51443()
/**
 * method_51441
 */
fun DrawContext.drawHoverEvent(textRenderer: TextRenderer, style: Style, x: Int, y: Int) = this.method_51441(textRenderer, style, x, y)
/**
 * method_51739
 */
fun DrawContext.fill(layer: RenderLayer, x1: Int, y1: Int, x2: Int, y2: Int, color: Int) = this.method_51739(layer, x1, y1, x2, y2, color)
/**
 * method_51738
 */
fun DrawContext.drawHorizontalLine(layer: RenderLayer, x1: Int, x2: Int, y: Int, color: Int) = this.method_51738(layer, x1, x2, y, color)
/**
 * method_51437
 */
fun DrawContext.drawTooltip(textRenderer: TextRenderer, text: MutableList<Text>, data: Optional<TooltipData>, x: Int, y: Int, texture: Identifier) = this.method_51437(textRenderer, text, data, x, y, texture)
/**
 * method_25302
 */
fun DrawContext.drawTexture(renderLayers: function_Function<Identifier, RenderLayer>, sprite: Identifier, x: Int, y: Int, u: Float, v: Float, width: Int, height: Int, regionWith: Int, regionHeight: Int, textureWidth: Int, textureHeight: Int) = this.method_25302(renderLayers, sprite, x, y, u, v, width, height, regionWith, regionHeight, textureWidth, textureHeight)
/**
 * method_51423
 */
fun DrawContext.drawItem(entity: LivingEntity, stack: ItemStack, x: Int, y: Int, seed: Int) = this.method_51423(entity, stack, x, y, seed)
/**
 * method_57709
 */
fun DrawContext.fillWithLayer(layer: RenderLayer, startX: Int, startY: Int, endX: Int, endY: Int, z: Int) = this.method_57709(layer, startX, startY, endX, endY, z)
/**
 * method_55231
 */
fun DrawContext.drawItemWithoutEntity(stack: ItemStack, x: Int, y: Int, seed: Int) = this.method_55231(stack, x, y, seed)
/**
 * method_51431
 */
fun DrawContext.drawStackOverlay(textRenderer: TextRenderer, stack: ItemStack, x: Int, y: Int) = this.method_51431(textRenderer, stack, x, y)
/**
 * method_51430
 */
fun DrawContext.drawText(textRenderer: TextRenderer, text: OrderedText, x: Int, y: Int, color: Int, shadow: Boolean) = this.method_51430(textRenderer, text, x, y, color, shadow)
/**
 * method_27535
 */
fun DrawContext.drawTextWithShadow(textRenderer: TextRenderer, text: Text, x: Int, y: Int, color: Int) = this.method_27535(textRenderer, text, x, y, color)
/**
 * method_52710
 */
fun DrawContext.drawSpriteStretched(renderLayers: function_Function<Identifier, RenderLayer>, sprite: Sprite, x: Int, y: Int, width: Int, height: Int, color: Int) = this.method_52710(renderLayers, sprite, x, y, width, height, color)
/**
 * method_64236
 */
fun DrawContext.drawOrderedTooltip(textRenderer: TextRenderer, text: MutableList<out OrderedText>, x: Int, y: Int, texture: Identifier) = this.method_64236(textRenderer, text, x, y, texture)
/**
 * method_51440
 */
fun DrawContext.drawWrappedText(textRenderer: TextRenderer, text: StringVisitable, x: Int, y: Int, width: Int, color: Int, shadow: Boolean) = this.method_51440(textRenderer, text, x, y, width, color, shadow)
/**
 * method_65179
 */
fun DrawContext.drawWrappedTextWithShadow(textRenderer: TextRenderer, text: StringVisitable, x: Int, y: Int, width: Int, color: Int) = this.method_65179(textRenderer, text, x, y, width, color)
/**
 * method_25300
 */
fun DrawContext.drawCenteredTextWithShadow(textRenderer: TextRenderer, text: String, centerX: Int, y: Int, color: Int) = this.method_25300(textRenderer, text, centerX, y, color)
/**
 * method_51742
 */
fun DrawContext.drawVerticalLine(layer: RenderLayer, x: Int, y1: Int, y2: Int, color: Int) = this.method_51742(layer, x, y1, y2, color)
/**
 * method_51448
 */
fun DrawContext.getMatrices() = this.method_51448()
/**
 * method_60649
 */
fun DrawContext.drawTextWithBackground(textRenderer: TextRenderer, text: Text, x: Int, y: Int, width: Int, color: Int) = this.method_60649(textRenderer, text, x, y, width, color)
/**
 * method_58135
 */
fun DrawContext.scissorContains(x: Int, y: Int) = this.method_58135(x, y)
/**
 * method_51421
 */
fun DrawContext.getScaledWindowWidth() = this.method_51421()
/**
 * method_33284
 */
fun DrawContext.fillGradient(startX: Int, startY: Int, endX: Int, endY: Int, z: Int, colorStart: Int, colorEnd: Int) = this.method_33284(startX, startY, endX, endY, z, colorStart, colorEnd)
/**
 * method_44380
 */
fun DrawContext.disableScissor() = this.method_44380()
/**
 * method_49601
 */
fun DrawContext.drawBorder(x: Int, y: Int, width: Int, height: Int, color: Int) = this.method_49601(x, y, width, height, color)
/**
 * method_52706
 */
fun DrawContext.drawGuiTexture(renderLayers: function_Function<Identifier, RenderLayer>, sprite: Identifier, x: Int, y: Int, width: Int, height: Int) = this.method_52706(renderLayers, sprite, x, y, width, height)
/**
 * method_51446
 */
fun DrawContext.drawItemTooltip(textRenderer: TextRenderer, stack: ItemStack, x: Int, y: Int) = this.method_51446(textRenderer, stack, x, y)
/**
 * method_51452
 */
fun DrawContext.draw() = this.method_51452()
