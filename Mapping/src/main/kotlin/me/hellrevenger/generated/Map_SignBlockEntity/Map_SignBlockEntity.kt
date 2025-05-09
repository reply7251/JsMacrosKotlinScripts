package me.hellrevenger.generated.Map_SignBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_49836
 */
fun SignBlockEntity.tryChangeText(player: PlayerEntity, front: Boolean, messages: MutableList<FilteredMessage>) = this.method_49836(player, front, messages)
/**
 * method_49853
 */
fun SignBlockEntity.getFrontText() = this.method_49853()
/**
 * method_54303
 */
fun SignBlockEntity.getInteractionFailSound() = this.method_54303()
/**
 * method_49843
 */
fun SignBlockEntity.getText(front: Boolean) = this.method_49843(front)
/**
 * method_50010
 */
fun SignBlockEntity.canRunCommandClickEvent(front: Boolean, player: PlayerEntity) = this.method_50010(front, player)
/**
 * method_45470
 */
fun SignBlockEntity.getMaxTextWidth() = this.method_45470()
/**
 * method_11305
 */
fun SignBlockEntity.getEditor() = this.method_11305()
/**
 * method_49841
 */
fun SignBlockEntity.changeText(textChanger: UnaryOperator<SignText>, front: Boolean) = this.method_49841(textChanger, front)
/**
 * method_49834
 */
fun SignBlockEntity.isPlayerFacingFront(player: PlayerEntity) = this.method_49834(player)
/**
 * method_50007
 */
fun SignBlockEntity.runCommandClickEvent(player: PlayerEntity, world: world_World, pos: BlockPos, front: Boolean) = this.method_50007(player, world, pos, front)
/**
 * method_49854
 */
fun SignBlockEntity.getBackText() = this.method_49854()
/**
 * method_49840
 */
fun SignBlockEntity.setText(text: SignText, front: Boolean) = this.method_49840(text, front)
/**
 * method_38249
 */
fun SignBlockEntity.toUpdatePacket() = this.method_38249()
/**
 * method_45469
 */
fun SignBlockEntity.getTextLineHeight() = this.method_45469()
/**
 * method_49849
 */
fun SignBlockEntity.setWaxed(waxed: Boolean) = this.method_49849(waxed)
/**
 * method_11306
 */
fun SignBlockEntity.setEditor(editor: UUID) = this.method_11306(editor)
/**
 * method_49847
 */
fun SignBlockEntity.isPlayerTooFarToEdit(uuid: UUID) = this.method_49847(uuid)
/**
 * method_49855
 */
fun SignBlockEntity.isWaxed() = this.method_49855()
