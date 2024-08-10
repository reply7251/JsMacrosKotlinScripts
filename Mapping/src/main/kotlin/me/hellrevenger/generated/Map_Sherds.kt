package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Sherds

val Sherds.PACKET_CODEC by aliasStatic(Sherds::field_49415)
val Sherds.DEFAULT by aliasStatic(Sherds::field_44707)
fun Sherds.stream() = this.method_51512()
fun Sherds.toNbt(arg0: NbtCompound) = this.method_51513(arg0)
fun KClass<Sherds>.fromNbt(arg0: NbtCompound) = Sherds.method_51516(arg0)
fun Sherds.back() = this.comp_1487()
fun Sherds.left() = this.comp_1488()
fun Sherds.right() = this.comp_1489()
fun Sherds.front() = this.comp_1490()
