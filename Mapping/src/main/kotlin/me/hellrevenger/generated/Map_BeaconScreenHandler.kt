package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BeaconScreenHandler

fun KClass<BeaconScreenHandler>.getStatusEffectForRawId(arg0: Int) = BeaconScreenHandler.method_53174(arg0)
fun BeaconScreenHandler.hasPayment() = this.method_17376()
fun KClass<BeaconScreenHandler>.getRawIdForStatusEffect(arg0: RegistryEntry<StatusEffect>) = BeaconScreenHandler.method_53173(arg0)
fun BeaconScreenHandler.getProperties() = this.method_17373()
fun BeaconScreenHandler.getPrimaryEffect() = this.method_17374()
fun BeaconScreenHandler.getSecondaryEffect() = this.method_17375()
fun BeaconScreenHandler.setEffects(arg0: Optional<RegistryEntry<StatusEffect>>, arg1: Optional<RegistryEntry<StatusEffect>>) = this.method_17372(arg0, arg1)
