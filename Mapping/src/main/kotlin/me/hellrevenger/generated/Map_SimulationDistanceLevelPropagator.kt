package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SimulationDistanceLevelPropagator

fun SimulationDistanceLevelPropagator.getLevel(arg0: ChunkPos) = this.method_38640(arg0)
fun <T>SimulationDistanceLevelPropagator.remove(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_38642<T>(arg0, arg1, arg2, arg3)
fun SimulationDistanceLevelPropagator.remove(arg0: Long, arg1: ChunkTicket<*>) = this.method_38641(arg0, arg1)
fun SimulationDistanceLevelPropagator.updatePlayerTickets(arg0: Int) = this.method_38636(arg0)
fun SimulationDistanceLevelPropagator.getTickingTicket(arg0: Long) = this.method_38643(arg0)
fun <T>SimulationDistanceLevelPropagator.add(arg0: ChunkTicketType<T>, arg1: ChunkPos, arg2: Int, arg3: T) = this.method_38638<T>(arg0, arg1, arg2, arg3)
fun SimulationDistanceLevelPropagator.updateLevels() = this.method_38635()
fun SimulationDistanceLevelPropagator.add(arg0: Long, arg1: ChunkTicket<*>) = this.method_38637(arg0, arg1)
