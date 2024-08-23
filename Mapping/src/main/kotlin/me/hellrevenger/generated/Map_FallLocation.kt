package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FallLocation

val KClass<FallLocation>.WATER by aliasStatic(FallLocation::field_44930)
val KClass<FallLocation>.OTHER_CLIMBABLE by aliasStatic(FallLocation::field_44929)
val KClass<FallLocation>.SCAFFOLDING by aliasStatic(FallLocation::field_44928)
val KClass<FallLocation>.TWISTING_VINES by aliasStatic(FallLocation::field_44927)
val KClass<FallLocation>.WEEPING_VINES by aliasStatic(FallLocation::field_44926)
val KClass<FallLocation>.VINES by aliasStatic(FallLocation::field_44925)
val KClass<FallLocation>.LADDER by aliasStatic(FallLocation::field_44924)
val KClass<FallLocation>.GENERIC by aliasStatic(FallLocation::field_44923)
fun KClass<FallLocation>.fromEntity(arg0: LivingEntity) = FallLocation.method_52195(arg0)
fun KClass<FallLocation>.fromBlockState(arg0: BlockState) = FallLocation.method_52196(arg0)
fun FallLocation.getDeathMessageKey() = this.method_52194()
fun FallLocation.id() = this.comp_1539()
