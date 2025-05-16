package me.hellrevenger.generated.Map_BlockEntityRendererFactories
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockEntityRendererFactoriesKt {
    /**
     * method_32144
     */
    fun <T>register(type: BlockEntityType<out T>?, factory: BlockEntityRendererFactory<T>?) where T: BlockEntity = BlockEntityRendererFactories.method_32144<T>(type, factory)
    /**
     * method_32146
     */
    fun reload(args: net.minecraft.class_5614.class_5615?) = BlockEntityRendererFactories.method_32146(args)
}