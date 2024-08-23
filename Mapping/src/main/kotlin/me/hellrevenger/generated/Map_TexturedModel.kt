package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TexturedModel

val KClass<TexturedModel>.FLOWERBED_2 by aliasStatic(TexturedModel::field_42953)
val KClass<TexturedModel>.FLOWERBED_4 by aliasStatic(TexturedModel::field_42955)
val KClass<TexturedModel>.CUBE_COLUMN_HORIZONTAL by aliasStatic(TexturedModel::field_23039)
val KClass<TexturedModel>.PARTICLE by aliasStatic(TexturedModel::field_23047)
val KClass<TexturedModel>.SIDE_TOP_BOTTOM_WALL by aliasStatic(TexturedModel::field_23057)
val KClass<TexturedModel>.LEAVES by aliasStatic(TexturedModel::field_23049)
val KClass<TexturedModel>.CUBE_MIRRORED_ALL by aliasStatic(TexturedModel::field_23037)
val KClass<TexturedModel>.ORIENTABLE_WITH_BOTTOM by aliasStatic(TexturedModel::field_23043)
val KClass<TexturedModel>.TEMPLATE_GLAZED_TERRACOTTA by aliasStatic(TexturedModel::field_23045)
val KClass<TexturedModel>.END_FOR_TOP_CUBE_COLUMN by aliasStatic(TexturedModel::field_23055)
val KClass<TexturedModel>.CUBE_TOP by aliasStatic(TexturedModel::field_23041)
val KClass<TexturedModel>.TEMPLATE_HANGING_LANTERN by aliasStatic(TexturedModel::field_23051)
val KClass<TexturedModel>.FLOWERBED_3 by aliasStatic(TexturedModel::field_42954)
val KClass<TexturedModel>.SIDE_END_WALL by aliasStatic(TexturedModel::field_23959)
val KClass<TexturedModel>.FLOWERBED_1 by aliasStatic(TexturedModel::field_42952)
val KClass<TexturedModel>.CUBE_ALL by aliasStatic(TexturedModel::field_23036)
val KClass<TexturedModel>.CORAL_FAN by aliasStatic(TexturedModel::field_23046)
val KClass<TexturedModel>.CUBE_COLUMN by aliasStatic(TexturedModel::field_23038)
val KClass<TexturedModel>.TEMPLATE_ANVIL by aliasStatic(TexturedModel::field_23048)
val KClass<TexturedModel>.TEMPLATE_SEAGRASS by aliasStatic(TexturedModel::field_23054)
val KClass<TexturedModel>.ORIENTABLE by aliasStatic(TexturedModel::field_23042)
val KClass<TexturedModel>.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL by aliasStatic(TexturedModel::field_23056)
val KClass<TexturedModel>.CUBE_ALL_INNER_FACES by aliasStatic(TexturedModel::field_47502)
val KClass<TexturedModel>.CARPET by aliasStatic(TexturedModel::field_23044)
val KClass<TexturedModel>.TEMPLATE_LANTERN by aliasStatic(TexturedModel::field_23050)
val KClass<TexturedModel>.CUBE_BOTTOM_TOP by aliasStatic(TexturedModel::field_23040)
fun KClass<TexturedModel>.makeFactory(arg0: Function<Block, TextureMap>, arg1: Model) = TexturedModel.method_25918(arg0, arg1)
fun TexturedModel.getModel() = this.method_25914()
fun TexturedModel.upload(arg0: Block, arg1: BiConsumer<Identifier, Supplier<JsonElement>>) = this.method_25916(arg0, arg1)
fun TexturedModel.textures(arg0: Consumer<TextureMap>) = this.method_25917(arg0)
fun KClass<TexturedModel>.getCubeAll(arg0: Identifier) = TexturedModel.method_25920(arg0)
fun TexturedModel.upload(arg0: Block, arg1: String, arg2: BiConsumer<Identifier, Supplier<JsonElement>>) = this.method_25915(arg0, arg1, arg2)
fun TexturedModel.getTextures() = this.method_25921()
