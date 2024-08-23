package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TridentEntityRenderer

val KClass<TridentEntityRenderer>.TEXTURE by aliasStatic(TridentEntityRenderer::field_4796)
fun TridentEntityRenderer.render(arg0: TridentEntity, arg1: Float, arg2: Float, arg3: MatrixStack, arg4: VertexConsumerProvider, arg5: Int) = this.method_4133(arg0, arg1, arg2, arg3, arg4, arg5)
fun TridentEntityRenderer.getTexture(arg0: TridentEntity) = this.method_4134(arg0)
