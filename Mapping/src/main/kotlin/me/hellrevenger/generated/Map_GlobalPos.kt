package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GlobalPos

val GlobalPos.PACKET_CODEC by aliasStatic(GlobalPos::field_48451)
val GlobalPos.MAP_CODEC by aliasStatic(GlobalPos::field_49583)
fun KClass<GlobalPos>.create(arg0: RegistryKey<world_World>, arg1: BlockPos) = GlobalPos.method_19443(arg0, arg1)
fun GlobalPos.dimension() = this.comp_2207()
fun GlobalPos.pos() = this.comp_2208()
