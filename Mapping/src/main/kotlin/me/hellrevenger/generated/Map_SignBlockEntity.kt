package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SignBlockEntity

fun SignBlockEntity.tryChangeText(arg0: PlayerEntity, arg1: Boolean, arg2: MutableList<FilteredMessage>) = this.method_49836(arg0, arg1, arg2)
fun SignBlockEntity.getFrontText() = this.method_49853()
fun SignBlockEntity.getInteractionFailSound() = this.method_54303()
fun SignBlockEntity.getText(arg0: Boolean) = this.method_49843(arg0)
fun SignBlockEntity.canRunCommandClickEvent(arg0: Boolean, arg1: PlayerEntity) = this.method_50010(arg0, arg1)
fun SignBlockEntity.getMaxTextWidth() = this.method_45470()
fun SignBlockEntity.getEditor() = this.method_11305()
fun SignBlockEntity.changeText(arg0: UnaryOperator<SignText>, arg1: Boolean) = this.method_49841(arg0, arg1)
fun SignBlockEntity.isPlayerFacingFront(arg0: PlayerEntity) = this.method_49834(arg0)
fun SignBlockEntity.runCommandClickEvent(arg0: PlayerEntity, arg1: world_World, arg2: BlockPos, arg3: Boolean) = this.method_50007(arg0, arg1, arg2, arg3)
fun SignBlockEntity.getBackText() = this.method_49854()
fun SignBlockEntity.setText(arg0: SignText, arg1: Boolean) = this.method_49840(arg0, arg1)
fun SignBlockEntity.toUpdatePacket() = this.method_38249()
fun SignBlockEntity.getTextLineHeight() = this.method_45469()
fun SignBlockEntity.setWaxed(arg0: Boolean) = this.method_49849(arg0)
fun KClass<SignBlockEntity>.tick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: SignBlockEntity) = SignBlockEntity.method_49837(arg0, arg1, arg2, arg3)
fun SignBlockEntity.setEditor(arg0: UUID) = this.method_11306(arg0)
fun SignBlockEntity.isPlayerTooFarToEdit(arg0: UUID) = this.method_49847(arg0)
fun SignBlockEntity.isWaxed() = this.method_49855()
