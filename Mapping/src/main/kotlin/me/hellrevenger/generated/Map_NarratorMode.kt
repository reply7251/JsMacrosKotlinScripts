package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NarratorMode

val NarratorMode.ALL by aliasEnum(NarratorMode::class, "field_18177")
val NarratorMode.CHAT by aliasEnum(NarratorMode::class, "field_18178")
val NarratorMode.OFF by aliasEnum(NarratorMode::class, "field_18176")
val NarratorMode.SYSTEM by aliasEnum(NarratorMode::class, "field_18179")
fun NarratorMode.shouldNarrateChat() = this.method_44715()
fun NarratorMode.shouldNarrateSystem() = this.method_44716()
fun KClass<NarratorMode>.byId(arg0: Int) = NarratorMode.method_18510(arg0)
