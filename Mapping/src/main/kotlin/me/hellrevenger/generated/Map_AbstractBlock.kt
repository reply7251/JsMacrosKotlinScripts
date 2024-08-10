package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractBlock

val AbstractBlock.DIRECTIONS by aliasStatic(AbstractBlock::field_23157)
val AbstractBlock.settings by alias(AbstractBlock::field_23155)
fun AbstractBlock.asItem() = this.method_8389()
fun AbstractBlock.getDefaultMapColor() = this.method_26403()
fun AbstractBlock.getHardness() = this.method_36555()
fun <B>KClass<AbstractBlock>.createCodec(arg0: Function<net.minecraft.class_4970.class_2251, B>) where B: Block = AbstractBlock.method_54094<B>(arg0)
