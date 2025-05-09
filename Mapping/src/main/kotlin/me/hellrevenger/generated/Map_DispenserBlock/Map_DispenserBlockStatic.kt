package me.hellrevenger.generated.Map_DispenserBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DispenserBlockKt {
    /**
     * field_10918
     */
    val FACING by aliasStatic(DispenserBlock::field_10918)
    /**
     * field_10919
     */
    val BEHAVIORS by aliasStatic(DispenserBlock::field_10919)
    /**
     * field_10920
     */
    val TRIGGERED by aliasStatic(DispenserBlock::field_10920)
    /**
     * method_58681
     */
    fun registerProjectileBehavior(projectile: ItemConvertible) = DispenserBlock.method_58681(projectile)
    /**
     * method_10010
     */
    fun getOutputLocation(pointer: BlockPointer, facingOffset: Double, arg2: Vec3d) = DispenserBlock.method_10010(pointer, facingOffset, arg2)
    /**
     * method_10009
     */
    fun registerBehavior(provider: ItemConvertible, behavior: DispenserBehavior) = DispenserBlock.method_10009(provider, behavior)
}