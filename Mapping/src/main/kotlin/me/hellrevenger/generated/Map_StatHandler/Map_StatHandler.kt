package me.hellrevenger.generated.Map_StatHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun StatHandler.setStat(arg0: PlayerEntity, arg1: Stat<*>, arg2: Int) = this.method_15023(arg0, arg1, arg2)
fun StatHandler.getStat(arg0: Stat<*>) = this.method_15025(arg0)
fun <T>StatHandler.getStat(arg0: StatType<T>, arg1: T) = this.method_15024<T>(arg0, arg1)
fun StatHandler.increaseStat(arg0: PlayerEntity, arg1: Stat<*>, arg2: Int) = this.method_15022(arg0, arg1, arg2)
