package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TickPriority

val TickPriority.VERY_LOW by aliasEnum(TickPriority::class, "field_9309")
val TickPriority.EXTREMELY_HIGH by aliasEnum(TickPriority::class, "field_9315")
val TickPriority.LOW by aliasEnum(TickPriority::class, "field_9316")
val TickPriority.VERY_HIGH by aliasEnum(TickPriority::class, "field_9313")
val TickPriority.NORMAL by aliasEnum(TickPriority::class, "field_9314")
val TickPriority.EXTREMELY_LOW by aliasEnum(TickPriority::class, "field_9311")
val TickPriority.HIGH by aliasEnum(TickPriority::class, "field_9310")
fun KClass<TickPriority>.byIndex(arg0: Int) = TickPriority.method_8680(arg0)
