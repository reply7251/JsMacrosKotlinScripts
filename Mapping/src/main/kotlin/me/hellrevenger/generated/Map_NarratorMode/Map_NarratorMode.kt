package me.hellrevenger.generated.Map_NarratorMode
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_18177
 */
val KClass<NarratorMode>.ALL by aliasEnum(NarratorMode::class, "field_18177")
/**
 * field_18178
 */
val KClass<NarratorMode>.CHAT by aliasEnum(NarratorMode::class, "field_18178")
/**
 * field_18176
 */
val KClass<NarratorMode>.OFF by aliasEnum(NarratorMode::class, "field_18176")
/**
 * field_18179
 */
val KClass<NarratorMode>.SYSTEM by aliasEnum(NarratorMode::class, "field_18179")
/**
 * method_18511
 */
fun NarratorMode.getName() = this.method_18511()
/**
 * method_18509
 */
fun NarratorMode.getId() = this.method_18509()
/**
 * method_44715
 */
fun NarratorMode.shouldNarrateChat() = this.method_44715()
/**
 * method_44716
 */
fun NarratorMode.shouldNarrateSystem() = this.method_44716()
/**
 * method_18510
 */
fun KClass<NarratorMode>.byId(arg0: Int) = NarratorMode.method_18510(arg0)
