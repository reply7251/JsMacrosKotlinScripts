package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockEntityRendererFactories

fun <T>KClass<BlockEntityRendererFactories>.register(arg0: BlockEntityType<out T>, arg1: BlockEntityRendererFactory<T>) where T: BlockEntity = BlockEntityRendererFactories.method_32144<T>(arg0, arg1)
fun KClass<BlockEntityRendererFactories>.reload(arg0: net.minecraft.class_5614.class_5615) = BlockEntityRendererFactories.method_32146(arg0)
