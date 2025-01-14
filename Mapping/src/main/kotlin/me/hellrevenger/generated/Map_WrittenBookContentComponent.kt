package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WrittenBookContentComponent

val KClass<WrittenBookContentComponent>.MAX_SERIALIZED_PAGE_LENGTH by aliasStatic(WrittenBookContentComponent::field_49375)
val KClass<WrittenBookContentComponent>.UNCOPIABLE_GENERATION by aliasStatic(WrittenBookContentComponent::field_49380)
val KClass<WrittenBookContentComponent>.MAX_TITLE_LENGTH by aliasStatic(WrittenBookContentComponent::field_49378)
val KClass<WrittenBookContentComponent>.DEFAULT by aliasStatic(WrittenBookContentComponent::field_49829)
val KClass<WrittenBookContentComponent>.MAX_GENERATION by aliasStatic(WrittenBookContentComponent::field_49379)
fun WrittenBookContentComponent.copy() = this.method_57519()
fun WrittenBookContentComponent.asResolved() = this.method_57527()
fun WrittenBookContentComponent.getPages(arg0: Boolean) = this.method_57525(arg0)
fun WrittenBookContentComponent.withPages(arg0: MutableList<RawFilteredPair<Text>>) = this.method_58188(arg0)
fun KClass<WrittenBookContentComponent>.createPagesCodec(arg0: Codec<Text>) = WrittenBookContentComponent.method_58436(arg0)
fun WrittenBookContentComponent.resolve(arg0: ServerCommandSource, arg1: PlayerEntity) = this.method_57521(arg0, arg1)
fun WrittenBookContentComponent.author() = this.comp_2420()
fun WrittenBookContentComponent.generation() = this.comp_2421()
fun WrittenBookContentComponent.resolved() = this.comp_2423()
fun WrittenBookContentComponent.title() = this.comp_2419()
