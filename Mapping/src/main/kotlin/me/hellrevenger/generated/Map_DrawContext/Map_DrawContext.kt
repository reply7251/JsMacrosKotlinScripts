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
fun DrawContext.drawHoverEvent(textRenderer: TextRenderer?, style: Style?, x: Int, y: Int) = this.method_51441(textRenderer, style, x, y)
/**
 * method_51739
 */
fun DrawContext.fill(layer: RenderLayer?, x1: Int, y1: Int, x2: Int, y2: Int, color: Int) = this.method_51739(layer, x1, y1, x2, y2, color)
/**
 * method_51738
 */
fun DrawContext.drawHorizontalLine(layer: RenderLayer?, x1: Int, x2: Int, y: Int, color: Int) = this.method_51738(layer, x1, x2, y, color)
/**
 * method_51437
 */
fun DrawContext.drawTooltip(textRenderer: TextRenderer?, text: MutableList<Text>?, data: Optional<TooltipData>?, x: Int, y: Int, texture: Identifier?) = this.method_51437(textRenderer, text, data, x, y, texture)
/**
 * method_25302
 */
fun DrawContext.drawTexture(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Identifier?, x: Int, y: Int, u: Float, v: Float, width: Int, height: Int, regionWith: Int, regionHeight: Int, textureWidth: Int, textureHeight: Int) = this.method_25302(renderLayers, sprite, x, y, u, v, width, height, regionWith, regionHeight, textureWidth, textureHeight)
/**
 * method_51737
 */
fun DrawContext.fill(x1: Int, y1: Int, x2: Int, y2: Int, z: Int, color: Int) = this.method_51737(x1, y1, x2, y2, z, color)
/**
 * method_51423
 */
fun DrawContext.drawItem(entity: LivingEntity?, stack: ItemStack?, x: Int, y: Int, seed: Int) = this.method_51423(entity, stack, x, y, seed)
/**
 * method_57709
 */
fun DrawContext.fillWithLayer(layer: RenderLayer?, startX: Int, startY: Int, endX: Int, endY: Int, z: Int) = this.method_57709(layer, startX, startY, endX, endY, z)
/**
 * method_55231
 */
fun DrawContext.drawItemWithoutEntity(stack: ItemStack?, x: Int, y: Int, seed: Int) = this.method_55231(stack, x, y, seed)
/**
 * method_51431
 */
fun DrawContext.drawStackOverlay(textRenderer: TextRenderer?, stack: ItemStack?, x: Int, y: Int) = this.method_51431(textRenderer, stack, x, y)
/**
 * method_51430
 */
fun DrawContext.drawText(textRenderer: TextRenderer?, text: OrderedText?, x: Int, y: Int, color: Int, shadow: Boolean) = this.method_51430(textRenderer, text, x, y, color, shadow)
/**
 * method_27535
 */
fun DrawContext.drawTextWithShadow(textRenderer: TextRenderer?, text: Text?, x: Int, y: Int, color: Int) = this.method_27535(textRenderer, text, x, y, color)
/**
 * method_52710
 */
fun DrawContext.drawSpriteStretched(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Sprite?, x: Int, y: Int, width: Int, height: Int, color: Int) = this.method_52710(renderLayers, sprite, x, y, width, height, color)
/**
 * method_51429
 */
fun DrawContext.drawItem(stack: ItemStack?, x: Int, y: Int, seed: Int, z: Int) = this.method_51429(stack, x, y, seed, z)
/**
 * method_64236
 */
fun DrawContext.drawOrderedTooltip(textRenderer: TextRenderer?, text: MutableList<out OrderedText>?, x: Int, y: Int, texture: Identifier?) = this.method_64236(textRenderer, text, x, y, texture)
/**
 * method_25292
 */
fun DrawContext.drawHorizontalLine(x1: Int, x2: Int, y: Int, color: Int) = this.method_25292(x1, x2, y, color)
/**
 * method_51427
 */
fun DrawContext.drawItem(item: ItemStack?, x: Int, y: Int) = this.method_51427(item, x, y)
/**
 * method_51440
 */
fun DrawContext.drawWrappedText(textRenderer: TextRenderer?, text: StringVisitable?, x: Int, y: Int, width: Int, color: Int, shadow: Boolean) = this.method_51440(textRenderer, text, x, y, width, color, shadow)
/**
 * method_52709
 */
fun DrawContext.drawSpriteStretched(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Sprite?, x: Int, y: Int, width: Int, height: Int) = this.method_52709(renderLayers, sprite, x, y, width, height)
/**
 * method_25303
 */
fun DrawContext.drawTextWithShadow(textRenderer: TextRenderer?, text: String?, x: Int, y: Int, color: Int) = this.method_25303(textRenderer, text, x, y, color)
/**
 * method_51447
 */
fun DrawContext.drawOrderedTooltip(textRenderer: TextRenderer?, text: MutableList<out OrderedText>?, x: Int, y: Int) = this.method_51447(textRenderer, text, x, y)
/**
 * method_65179
 */
fun DrawContext.drawWrappedTextWithShadow(textRenderer: TextRenderer?, text: StringVisitable?, x: Int, y: Int, width: Int, color: Int) = this.method_65179(textRenderer, text, x, y, width, color)
/**
 * method_25290
 */
fun DrawContext.drawTexture(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Identifier?, x: Int, y: Int, u: Float, v: Float, width: Int, height: Int, textureWidth: Int, textureHeight: Int) = this.method_25290(renderLayers, sprite, x, y, u, v, width, height, textureWidth, textureHeight)
/**
 * method_25300
 */
fun DrawContext.drawCenteredTextWithShadow(textRenderer: TextRenderer?, text: String?, centerX: Int, y: Int, color: Int) = this.method_25300(textRenderer, text, centerX, y, color)
/**
 * method_64235
 */
fun DrawContext.drawTooltip(textRenderer: TextRenderer?, text: Text?, x: Int, y: Int, texture: Identifier?) = this.method_64235(textRenderer, text, x, y, texture)
/**
 * method_51742
 */
fun DrawContext.drawVerticalLine(layer: RenderLayer?, x: Int, y1: Int, y2: Int, color: Int) = this.method_51742(layer, x, y1, y2, color)
/**
 * method_51448
 */
fun DrawContext.getMatrices() = this.method_51448()
/**
 * method_60649
 */
fun DrawContext.drawTextWithBackground(textRenderer: TextRenderer?, text: Text?, x: Int, y: Int, width: Int, color: Int) = this.method_60649(textRenderer, text, x, y, width, color)
/**
 * method_58135
 */
fun DrawContext.scissorContains(x: Int, y: Int) = this.method_58135(x, y)
/**
 * method_51433
 */
fun DrawContext.drawText(textRenderer: TextRenderer?, text: String?, x: Int, y: Int, color: Int, shadow: Boolean) = this.method_51433(textRenderer, text, x, y, color, shadow)
/**
 * method_51421
 */
fun DrawContext.getScaledWindowWidth() = this.method_51421()
/**
 * method_51434
 */
fun DrawContext.drawTooltip(textRenderer: TextRenderer?, text: MutableList<Text>?, x: Int, y: Int) = this.method_51434(textRenderer, text, x, y)
/**
 * method_33284
 */
fun DrawContext.fillGradient(startX: Int, startY: Int, endX: Int, endY: Int, z: Int, colorStart: Int, colorEnd: Int) = this.method_33284(startX, startY, endX, endY, z, colorStart, colorEnd)
/**
 * method_44380
 */
fun DrawContext.disableScissor() = this.method_44380()
/**
 * method_51740
 */
fun DrawContext.fillGradient(layer: RenderLayer?, startX: Int, startY: Int, endX: Int, endY: Int, colorStart: Int, colorEnd: Int, z: Int) = this.method_51740(layer, startX, startY, endX, endY, colorStart, colorEnd, z)
/**
 * method_35719
 */
fun DrawContext.drawCenteredTextWithShadow(textRenderer: TextRenderer?, text: OrderedText?, centerX: Int, y: Int, color: Int) = this.method_35719(textRenderer, text, centerX, y, color)
/**
 * method_25293
 */
fun DrawContext.drawTexture(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Identifier?, x: Int, y: Int, u: Float, v: Float, width: Int, height: Int, regionWidth: Int, regionHeight: Int, textureWidth: Int, textureHeight: Int, color: Int) = this.method_25293(renderLayers, sprite, x, y, u, v, width, height, regionWidth, regionHeight, textureWidth, textureHeight, color)
/**
 * method_49601
 */
fun DrawContext.drawBorder(x: Int, y: Int, width: Int, height: Int, color: Int) = this.method_49601(x, y, width, height, color)
/**
 * method_52706
 */
fun DrawContext.drawGuiTexture(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Identifier?, x: Int, y: Int, width: Int, height: Int) = this.method_52706(renderLayers, sprite, x, y, width, height)
/**
 * method_51445
 */
fun DrawContext.drawItemWithoutEntity(stack: ItemStack?, x: Int, y: Int) = this.method_51445(stack, x, y)
/**
 * method_25296
 */
fun DrawContext.fillGradient(startX: Int, startY: Int, endX: Int, endY: Int, colorStart: Int, colorEnd: Int) = this.method_25296(startX, startY, endX, endY, colorStart, colorEnd)
/**
 * method_52708
 */
fun DrawContext.drawGuiTexture(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Identifier?, textureWidth: Int, textureHeight: Int, u: Int, v: Int, x: Int, y: Int, width: Int, height: Int) = this.method_52708(renderLayers, sprite, textureWidth, textureHeight, u, v, x, y, width, height)
/**
 * method_25301
 */
fun DrawContext.drawVerticalLine(x: Int, y1: Int, y2: Int, color: Int) = this.method_25301(x, y1, y2, color)
/**
 * method_35720
 */
fun DrawContext.drawTextWithShadow(textRenderer: TextRenderer?, text: OrderedText?, x: Int, y: Int, color: Int) = this.method_35720(textRenderer, text, x, y, color)
/**
 * method_25294
 */
fun DrawContext.fill(x1: Int, y1: Int, x2: Int, y2: Int, color: Int) = this.method_25294(x1, y1, x2, y2, color)
/**
 * method_64037
 */
fun DrawContext.drawTooltip(textRenderer: TextRenderer?, text: MutableList<Text>?, x: Int, y: Int, texture: Identifier?) = this.method_64037(textRenderer, text, x, y, texture)
/**
 * method_51428
 */
fun DrawContext.drawItem(stack: ItemStack?, x: Int, y: Int, seed: Int) = this.method_51428(stack, x, y, seed)
/**
 * method_51438
 */
fun DrawContext.drawTooltip(textRenderer: TextRenderer?, text: Text?, x: Int, y: Int) = this.method_51438(textRenderer, text, x, y)
/**
 * method_64038
 */
fun DrawContext.drawTooltip(textRenderer: TextRenderer?, text: MutableList<Text>?, data: Optional<TooltipData>?, x: Int, y: Int) = this.method_64038(textRenderer, text, data, x, y)
/**
 * method_51432
 */
fun DrawContext.drawStackOverlay(textRenderer: TextRenderer?, stack: ItemStack?, x: Int, y: Int, stackCountText: String?) = this.method_51432(textRenderer, stack, x, y, stackCountText)
/**
 * method_51446
 */
fun DrawContext.drawItemTooltip(textRenderer: TextRenderer?, stack: ItemStack?, x: Int, y: Int) = this.method_51446(textRenderer, stack, x, y)
/**
 * method_48196
 */
fun DrawContext.fill(layer: RenderLayer?, x1: Int, y1: Int, x2: Int, y2: Int, z: Int, color: Int) = this.method_48196(layer, x1, y1, x2, y2, z, color)
/**
 * method_51452
 */
fun DrawContext.draw() = this.method_51452()
/**
 * method_25291
 */
fun DrawContext.drawTexture(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Identifier?, x: Int, y: Int, u: Float, v: Float, width: Int, height: Int, textureWidth: Int, textureHeight: Int, color: Int) = this.method_25291(renderLayers, sprite, x, y, u, v, width, height, textureWidth, textureHeight, color)
/**
 * method_64039
 */
fun DrawContext.draw(drawer: Consumer<VertexConsumerProvider>?) = this.method_64039(drawer)
/**
 * method_51436
 */
fun DrawContext.drawTooltip(textRenderer: TextRenderer?, text: MutableList<OrderedText>?, positioner: TooltipPositioner?, x: Int, y: Int) = this.method_51436(textRenderer, text, positioner, x, y)
/**
 * method_27534
 */
fun DrawContext.drawCenteredTextWithShadow(textRenderer: TextRenderer?, text: Text?, centerX: Int, y: Int, color: Int) = this.method_27534(textRenderer, text, centerX, y, color)
/**
 * method_52707
 */
fun DrawContext.drawGuiTexture(renderLayers: function_Function<Identifier, RenderLayer>?, sprite: Identifier?, x: Int, y: Int, width: Int, height: Int, color: Int) = this.method_52707(renderLayers, sprite, x, y, width, height, color)
/**
 * method_51439
 */
fun DrawContext.drawText(textRenderer: TextRenderer?, text: Text?, x: Int, y: Int, color: Int, shadow: Boolean) = this.method_51439(textRenderer, text, x, y, color, shadow)
