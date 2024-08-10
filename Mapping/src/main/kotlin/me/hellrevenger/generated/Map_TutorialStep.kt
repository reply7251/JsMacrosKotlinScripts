package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TutorialStep

val TutorialStep.PUNCH_TREE by aliasEnum(TutorialStep::class, "field_5649")
val TutorialStep.FIND_TREE by aliasEnum(TutorialStep::class, "field_5648")
val TutorialStep.NONE by aliasEnum(TutorialStep::class, "field_5653")
val TutorialStep.OPEN_INVENTORY by aliasEnum(TutorialStep::class, "field_5652")
val TutorialStep.CRAFT_PLANKS by aliasEnum(TutorialStep::class, "field_5655")
val TutorialStep.MOVEMENT by aliasEnum(TutorialStep::class, "field_5650")
fun KClass<TutorialStep>.byName(arg0: String) = TutorialStep.method_4919(arg0)
fun TutorialStep.createHandler(arg0: TutorialManager) = this.method_4918(arg0)
