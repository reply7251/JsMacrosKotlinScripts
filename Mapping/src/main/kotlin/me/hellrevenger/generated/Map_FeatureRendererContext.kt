package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FeatureRendererContext

fun <T, M>FeatureRendererContext<T, M>.getModel() where T: Entity, M: EntityModel<T> = this.method_4038()
fun <T, M>FeatureRendererContext<T, M>.getTexture(arg0: T) where T: Entity, M: EntityModel<T> = this.method_3931(arg0)
