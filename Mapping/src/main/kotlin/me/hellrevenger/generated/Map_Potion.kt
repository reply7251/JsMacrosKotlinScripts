package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Potion

val Potion.PACKET_CODEC by aliasStatic(Potion::field_51948)
fun Potion.hasInstantEffect() = this.method_8050()
fun KClass<Potion>.finishTranslationKey(arg0: Optional<RegistryEntry<Potion>>, arg1: String) = Potion.method_8051(arg0, arg1)
fun Potion.requires(arg0: Array<FeatureFlag>) = this.method_58671(*arg0)
