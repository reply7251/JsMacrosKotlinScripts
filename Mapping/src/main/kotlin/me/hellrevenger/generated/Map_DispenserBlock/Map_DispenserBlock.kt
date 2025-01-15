package me.hellrevenger.generated.Map_DispenserBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<DispenserBlock>.FACING by aliasStatic(DispenserBlock::field_10918)
val KClass<DispenserBlock>.BEHAVIORS by aliasStatic(DispenserBlock::field_10919)
val KClass<DispenserBlock>.TRIGGERED by aliasStatic(DispenserBlock::field_10920)
fun KClass<DispenserBlock>.registerProjectileBehavior(arg0: ItemConvertible) = DispenserBlock.method_58681(arg0)
fun KClass<DispenserBlock>.getOutputLocation(arg0: BlockPointer, arg1: Double, arg2: Vec3d) = DispenserBlock.method_10010(arg0, arg1, arg2)
fun KClass<DispenserBlock>.registerBehavior(arg0: ItemConvertible, arg1: DispenserBehavior) = DispenserBlock.method_10009(arg0, arg1)
fun KClass<DispenserBlock>.getOutputLocation(arg0: BlockPointer) = DispenserBlock.method_58682(arg0)
