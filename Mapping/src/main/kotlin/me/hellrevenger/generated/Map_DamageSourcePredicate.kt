package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DamageSourcePredicate

fun DamageSourcePredicate.test(arg0: ServerPlayerEntity, arg1: DamageSource) = this.method_8847(arg0, arg1)
fun DamageSourcePredicate.test(arg0: ServerWorld, arg1: Vec3d, arg2: DamageSource) = this.method_8845(arg0, arg1, arg2)
fun DamageSourcePredicate.isDirect() = this.comp_2793()
fun DamageSourcePredicate.directEntity() = this.comp_1741()
fun DamageSourcePredicate.sourceEntity() = this.comp_1742()
fun DamageSourcePredicate.tags() = this.comp_1740()
