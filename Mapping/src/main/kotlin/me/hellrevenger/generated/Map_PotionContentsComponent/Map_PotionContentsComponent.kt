package me.hellrevenger.generated.Map_PotionContentsComponent
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_49277
 */
val KClass<PotionContentsComponent>.EFFECTLESS_COLOR by aliasStatic(PotionContentsComponent::field_49277)
/**
 * field_49274
 */
val KClass<PotionContentsComponent>.DEFAULT by aliasStatic(PotionContentsComponent::field_49274)
/**
 * method_57403
 */
fun PotionContentsComponent.with(arg0: RegistryEntry<Potion>) = this.method_57403(arg0)
/**
 * method_65361
 */
fun PotionContentsComponent.getColor(arg0: Int) = this.method_65361(arg0)
/**
 * method_64195
 */
fun PotionContentsComponent.getName(arg0: String) = this.method_64195(arg0)
/**
 * method_57398
 */
fun PotionContentsComponent.with(arg0: StatusEffectInstance) = this.method_57398(arg0)
/**
 * method_58111
 */
fun KClass<PotionContentsComponent>.mixColors(arg0: Iterable<StatusEffectInstance>) = PotionContentsComponent.method_58111(arg0)
/**
 * method_8065
 */
fun KClass<PotionContentsComponent>.buildTooltip(arg0: Iterable<StatusEffectInstance>, arg1: Consumer<Text>, arg2: Float, arg3: Float) = PotionContentsComponent.method_8065(arg0, arg1, arg2, arg3)
/**
 * method_57402
 */
fun PotionContentsComponent.forEachEffect(arg0: Consumer<StatusEffectInstance>) = this.method_57402(arg0)
/**
 * method_47372
 */
fun PotionContentsComponent.buildTooltip(arg0: Consumer<Text>, arg1: Float, arg2: Float) = this.method_47372(arg0, arg1, arg2)
/**
 * method_57397
 */
fun PotionContentsComponent.getEffects() = this.method_57397()
/**
 * method_57401
 */
fun PotionContentsComponent.matches(arg0: RegistryEntry<Potion>) = this.method_57401(arg0)
/**
 * method_8064
 */
fun PotionContentsComponent.getColor() = this.method_8064()
/**
 * method_57405
 */
fun PotionContentsComponent.hasEffects() = this.method_57405()
/**
 * method_57400
 */
fun KClass<PotionContentsComponent>.createStack(arg0: Item, arg1: RegistryEntry<Potion>) = PotionContentsComponent.method_57400(arg0, arg1)
/**
 * method_62839
 */
fun PotionContentsComponent.apply(arg0: LivingEntity) = this.method_62839(arg0)
/**
 * comp_3209
 */
fun PotionContentsComponent.customName() = this.comp_3209()
/**
 * comp_2380
 */
fun PotionContentsComponent.customEffects() = this.comp_2380()
/**
 * comp_2378
 */
fun PotionContentsComponent.potion() = this.comp_2378()
/**
 * comp_2379
 */
fun PotionContentsComponent.customColor() = this.comp_2379()
