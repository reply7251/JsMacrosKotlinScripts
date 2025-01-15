package me.hellrevenger.generated.Map_TargetPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<TargetPredicate>.DEFAULT by aliasStatic(TargetPredicate::field_18092)
fun TargetPredicate.copy() = this.method_33335()
fun TargetPredicate.setBaseMaxDistance(arg0: Double) = this.method_18418(arg0)
fun TargetPredicate.setPredicate(arg0: Predicate<LivingEntity>) = this.method_18420(arg0)
fun TargetPredicate.ignoreDistanceScalingFactor() = this.method_18424()
fun TargetPredicate.test(arg0: LivingEntity, arg1: LivingEntity) = this.method_18419(arg0, arg1)
fun KClass<TargetPredicate>.createAttackable() = TargetPredicate.method_36625()
fun TargetPredicate.ignoreVisibility() = this.method_36627()
fun KClass<TargetPredicate>.createNonAttackable() = TargetPredicate.method_36626()
