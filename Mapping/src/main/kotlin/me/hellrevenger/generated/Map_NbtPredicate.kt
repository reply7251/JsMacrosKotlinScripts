package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NbtPredicate

val NbtPredicate.PACKET_CODEC by aliasStatic(NbtPredicate::field_49244)
fun NbtPredicate.test(arg0: NbtElement) = this.method_9077(arg0)
fun NbtPredicate.test(arg0: ItemStack) = this.method_9074(arg0)
fun NbtPredicate.nbt() = this.comp_1816()
fun KClass<NbtPredicate>.entityToNbt(arg0: Entity) = NbtPredicate.method_9076(arg0)
fun NbtPredicate.test(arg0: Entity) = this.method_9072(arg0)
