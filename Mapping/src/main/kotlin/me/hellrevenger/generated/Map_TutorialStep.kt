package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TutorialStep

val KClass<TutorialStep>.PUNCH_TREE by aliasEnum(TutorialStep::class, "field_5649")
val KClass<TutorialStep>.FIND_TREE by aliasEnum(TutorialStep::class, "field_5648")
val KClass<TutorialStep>.NONE by aliasEnum(TutorialStep::class, "field_5653")
val KClass<TutorialStep>.OPEN_INVENTORY by aliasEnum(TutorialStep::class, "field_5652")
val KClass<TutorialStep>.CRAFT_PLANKS by aliasEnum(TutorialStep::class, "field_5655")
val KClass<TutorialStep>.MOVEMENT by aliasEnum(TutorialStep::class, "field_5650")
fun KClass<TutorialStep>.byName(arg0: String) = TutorialStep.method_4919(arg0)
fun TutorialStep.getName() = this.method_4920()
fun TutorialStep.createHandler(arg0: TutorialManager) = this.method_4918(arg0)
