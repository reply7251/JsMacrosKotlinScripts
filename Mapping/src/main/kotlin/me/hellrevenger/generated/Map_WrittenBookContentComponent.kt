package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WrittenBookContentComponent

val WrittenBookContentComponent.PAGE_CODEC by aliasStatic(WrittenBookContentComponent::field_49383)
val WrittenBookContentComponent.PAGES_CODEC by aliasStatic(WrittenBookContentComponent::field_49384)
val WrittenBookContentComponent.PACKET_CODEC by aliasStatic(WrittenBookContentComponent::field_49382)
val WrittenBookContentComponent.MAX_SERIALIZED_PAGE_LENGTH by aliasStatic(WrittenBookContentComponent::field_49375)
val WrittenBookContentComponent.UNCOPIABLE_GENERATION by aliasStatic(WrittenBookContentComponent::field_49380)
val WrittenBookContentComponent.MAX_TITLE_LENGTH by aliasStatic(WrittenBookContentComponent::field_49378)
val WrittenBookContentComponent.DEFAULT by aliasStatic(WrittenBookContentComponent::field_49829)
val WrittenBookContentComponent.MAX_GENERATION by aliasStatic(WrittenBookContentComponent::field_49379)
fun WrittenBookContentComponent.copy() = this.method_57519()
fun WrittenBookContentComponent.asResolved() = this.method_57527()
fun WrittenBookContentComponent.withPages(arg0: List<RawFilteredPair<Text>>) = this.method_58188(arg0)
fun KClass<WrittenBookContentComponent>.createPagesCodec(arg0: Codec<Text>) = WrittenBookContentComponent.method_58436(arg0)
fun WrittenBookContentComponent.resolve(arg0: ServerCommandSource, arg1: PlayerEntity) = this.method_57521(arg0, arg1)
fun WrittenBookContentComponent.author() = this.comp_2420()
fun WrittenBookContentComponent.generation() = this.comp_2421()
fun WrittenBookContentComponent.resolved() = this.comp_2423()
fun WrittenBookContentComponent.title() = this.comp_2419()
