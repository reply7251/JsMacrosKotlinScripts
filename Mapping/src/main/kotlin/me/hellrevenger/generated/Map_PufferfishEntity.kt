package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PufferfishEntity

val KClass<PufferfishEntity>.NOT_PUFFED by aliasStatic(PufferfishEntity::field_30353)
val KClass<PufferfishEntity>.SEMI_PUFFED by aliasStatic(PufferfishEntity::field_30354)
val KClass<PufferfishEntity>.FULLY_PUFFED by aliasStatic(PufferfishEntity::field_30355)
fun PufferfishEntity.setPuffState(arg0: Int) = this.method_6596(arg0)
fun PufferfishEntity.getPuffState() = this.method_6594()
