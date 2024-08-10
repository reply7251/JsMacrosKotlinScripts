package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Stat

val <T>Stat<T>.PACKET_CODEC by aliasStatic({Stat.field_48280})
fun <T>Stat<T>.format(arg0: Int) = this.method_14953(arg0)
fun <T>KClass<Stat<T>>.getName(arg0: StatType<T>, arg1: T) = Stat.method_14950<T>(arg0, arg1)
