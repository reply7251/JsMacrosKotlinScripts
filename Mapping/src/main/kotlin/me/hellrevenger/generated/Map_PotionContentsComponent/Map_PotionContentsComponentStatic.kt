package me.hellrevenger.generated.Map_PotionContentsComponent
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PotionContentsComponentKt {
    /**
     * field_49277
     */
    val EFFECTLESS_COLOR by aliasStatic(PotionContentsComponent::field_49277)
    /**
     * field_49274
     */
    val DEFAULT by aliasStatic(PotionContentsComponent::field_49274)
    /**
     * method_58111
     */
    fun mixColors(effects: Iterable<StatusEffectInstance>?) = PotionContentsComponent.method_58111(effects)
    /**
     * method_8065
     */
    fun buildTooltip(effects: Iterable<StatusEffectInstance>?, textConsumer: Consumer<Text>?, durationMultiplier: Float, tickRate: Float) = PotionContentsComponent.method_8065(effects, textConsumer, durationMultiplier, tickRate)
    /**
     * method_57400
     */
    fun createStack(item: Item?, potion: RegistryEntry<Potion>?) = PotionContentsComponent.method_57400(item, potion)
}