package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TutorialManager

fun TutorialManager.add(arg0: TutorialToast, arg1: Int) = this.method_31365(arg0, arg1)
fun TutorialManager.onSlotUpdate(arg0: ItemStack) = this.method_4906(arg0)
fun TutorialManager.tick(arg0: ClientWorld, arg1: HitResult) = this.method_4911(arg0, arg1)
fun TutorialManager.onBlockBreaking(arg0: ClientWorld, arg1: BlockPos, arg2: BlockState, arg3: Float) = this.method_4907(arg0, arg1, arg2, arg3)
fun KClass<TutorialManager>.keyToText(arg0: String) = TutorialManager.method_4913(arg0)
fun TutorialManager.onMovement(arg0: Input) = this.method_4909(arg0)
fun TutorialManager.onUpdateMouse(arg0: Double, arg1: Double) = this.method_4908(arg0, arg1)
fun TutorialManager.onPickupSlotClick(arg0: ItemStack, arg1: ItemStack, arg2: ClickType) = this.method_33704(arg0, arg1, arg2)
fun TutorialManager.remove(arg0: TutorialToast) = this.method_31364(arg0)
fun TutorialManager.setStep(arg0: TutorialStep) = this.method_4910(arg0)
fun TutorialManager.isInSurvival() = this.method_4905()
fun TutorialManager.onInventoryOpened() = this.method_4912()
fun TutorialManager.destroyHandler() = this.method_4915()
fun TutorialManager.tick() = this.method_4917()
fun TutorialManager.createHandler() = this.method_4916()
