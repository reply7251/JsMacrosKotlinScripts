package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ComponentPredicate

val KClass<ComponentPredicate>.EMPTY by aliasStatic(ComponentPredicate::field_49597)
fun KClass<ComponentPredicate>.builder() = ComponentPredicate.method_57862()
fun KClass<ComponentPredicate>.of(arg0: ComponentMap) = ComponentPredicate.method_57865(arg0)
fun ComponentPredicate.isEmpty() = this.method_57867()
fun ComponentPredicate.test(arg0: ComponentHolder) = this.method_57864(arg0)
fun ComponentPredicate.test(arg0: ComponentMap) = this.method_57868(arg0)
fun ComponentPredicate.toChanges() = this.method_57870()
