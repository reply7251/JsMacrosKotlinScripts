package me.hellrevenger.generated.Map_DecoratedPotBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_46662
 */
var DecoratedPotBlockEntity.lastWobbleType by alias(DecoratedPotBlockEntity::field_46662)
/**
 * field_46659
 */
val KClass<DecoratedPotBlockEntity>.ITEM_NBT_KEY by aliasStatic(DecoratedPotBlockEntity::field_46659)
/**
 * field_42782
 */
val KClass<DecoratedPotBlockEntity>.SHERDS_NBT_KEY by aliasStatic(DecoratedPotBlockEntity::field_42782)
/**
 * field_46661
 */
var DecoratedPotBlockEntity.lastWobbleTime by alias(DecoratedPotBlockEntity::field_46661)
/**
 * method_51511
 */
fun DecoratedPotBlockEntity.getSherds() = this.method_51511()
/**
 * method_49200
 */
fun DecoratedPotBlockEntity.toUpdatePacket() = this.method_49200()
/**
 * method_52578
 */
fun DecoratedPotBlockEntity.asStack() = this.method_52578()
/**
 * method_54301
 */
fun DecoratedPotBlockEntity.wobble(arg0: net.minecraft.class_8172.class_8837) = this.method_54301(arg0)
/**
 * method_49204
 */
fun DecoratedPotBlockEntity.getHorizontalFacing() = this.method_49204()
/**
 * method_52577
 */
fun KClass<DecoratedPotBlockEntity>.getStackWith(arg0: Sherds) = DecoratedPotBlockEntity.method_52577(arg0)
/**
 * method_49196
 */
fun DecoratedPotBlockEntity.readFrom(arg0: ItemStack) = this.method_49196(arg0)
