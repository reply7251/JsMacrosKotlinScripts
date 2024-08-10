package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TexturedModel

val TexturedModel.FLOWERBED_2 by aliasStatic(TexturedModel::field_42953)
val TexturedModel.FLOWERBED_4 by aliasStatic(TexturedModel::field_42955)
val TexturedModel.CUBE_COLUMN_HORIZONTAL by aliasStatic(TexturedModel::field_23039)
val TexturedModel.PARTICLE by aliasStatic(TexturedModel::field_23047)
val TexturedModel.SIDE_TOP_BOTTOM_WALL by aliasStatic(TexturedModel::field_23057)
val TexturedModel.LEAVES by aliasStatic(TexturedModel::field_23049)
val TexturedModel.CUBE_MIRRORED_ALL by aliasStatic(TexturedModel::field_23037)
val TexturedModel.ORIENTABLE_WITH_BOTTOM by aliasStatic(TexturedModel::field_23043)
val TexturedModel.TEMPLATE_GLAZED_TERRACOTTA by aliasStatic(TexturedModel::field_23045)
val TexturedModel.END_FOR_TOP_CUBE_COLUMN by aliasStatic(TexturedModel::field_23055)
val TexturedModel.CUBE_TOP by aliasStatic(TexturedModel::field_23041)
val TexturedModel.TEMPLATE_HANGING_LANTERN by aliasStatic(TexturedModel::field_23051)
val TexturedModel.FLOWERBED_3 by aliasStatic(TexturedModel::field_42954)
val TexturedModel.SIDE_END_WALL by aliasStatic(TexturedModel::field_23959)
val TexturedModel.FLOWERBED_1 by aliasStatic(TexturedModel::field_42952)
val TexturedModel.CUBE_ALL by aliasStatic(TexturedModel::field_23036)
val TexturedModel.CORAL_FAN by aliasStatic(TexturedModel::field_23046)
val TexturedModel.CUBE_COLUMN by aliasStatic(TexturedModel::field_23038)
val TexturedModel.TEMPLATE_ANVIL by aliasStatic(TexturedModel::field_23048)
val TexturedModel.TEMPLATE_SEAGRASS by aliasStatic(TexturedModel::field_23054)
val TexturedModel.ORIENTABLE by aliasStatic(TexturedModel::field_23042)
val TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL by aliasStatic(TexturedModel::field_23056)
val TexturedModel.CUBE_ALL_INNER_FACES by aliasStatic(TexturedModel::field_47502)
val TexturedModel.CARPET by aliasStatic(TexturedModel::field_23044)
val TexturedModel.TEMPLATE_LANTERN by aliasStatic(TexturedModel::field_23050)
val TexturedModel.CUBE_BOTTOM_TOP by aliasStatic(TexturedModel::field_23040)
fun KClass<TexturedModel>.makeFactory(arg0: Function<Block, TextureMap>, arg1: Model) = TexturedModel.method_25918(arg0, arg1)
fun TexturedModel.upload(arg0: Block, arg1: BiConsumer<Identifier, Supplier<JsonElement>>) = this.method_25916(arg0, arg1)
fun TexturedModel.textures(arg0: Consumer<TextureMap>) = this.method_25917(arg0)
fun KClass<TexturedModel>.getCubeAll(arg0: Identifier) = TexturedModel.method_25920(arg0)
fun TexturedModel.upload(arg0: Block, arg1: String, arg2: BiConsumer<Identifier, Supplier<JsonElement>>) = this.method_25915(arg0, arg1, arg2)
