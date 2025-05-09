package me.hellrevenger.generated.Map_StatHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_15023
 */
fun StatHandler.setStat(player: PlayerEntity, stat: Stat<*>, value: Int) = this.method_15023(player, stat, value)
/**
 * method_15025
 */
fun StatHandler.getStat(stat: Stat<*>) = this.method_15025(stat)
/**
 * method_15024
 */
fun <T>StatHandler.getStat(type: StatType<T>, stat: T) = this.method_15024<T>(type, stat)
/**
 * method_15022
 */
fun StatHandler.increaseStat(player: PlayerEntity, stat: Stat<*>, value: Int) = this.method_15022(player, stat, value)
