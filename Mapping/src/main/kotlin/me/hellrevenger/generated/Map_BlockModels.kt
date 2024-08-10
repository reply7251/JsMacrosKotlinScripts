package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockModels

fun KClass<BlockModels>.getModelId(arg0: BlockState) = BlockModels.method_3340(arg0)
fun BlockModels.getModel(arg0: BlockState) = this.method_3335(arg0)
fun BlockModels.setModels(arg0: Map<BlockState, BakedModel>) = this.method_45784(arg0)
fun KClass<BlockModels>.propertyMapToString(arg0: Map<property_Property<*>, Comparable<*>>) = BlockModels.method_3338(arg0)
fun BlockModels.getModelParticleSprite(arg0: BlockState) = this.method_3339(arg0)
fun KClass<BlockModels>.getModelId(arg0: Identifier, arg1: BlockState) = BlockModels.method_3336(arg0, arg1)
