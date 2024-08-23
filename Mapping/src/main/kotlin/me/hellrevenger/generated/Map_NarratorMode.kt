package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NarratorMode

val KClass<NarratorMode>.ALL by aliasEnum(NarratorMode::class, "field_18177")
val KClass<NarratorMode>.CHAT by aliasEnum(NarratorMode::class, "field_18178")
val KClass<NarratorMode>.OFF by aliasEnum(NarratorMode::class, "field_18176")
val KClass<NarratorMode>.SYSTEM by aliasEnum(NarratorMode::class, "field_18179")
fun NarratorMode.getName() = this.method_18511()
fun NarratorMode.getId() = this.method_18509()
fun NarratorMode.shouldNarrateChat() = this.method_44715()
fun NarratorMode.shouldNarrateSystem() = this.method_44716()
fun KClass<NarratorMode>.byId(arg0: Int) = NarratorMode.method_18510(arg0)
