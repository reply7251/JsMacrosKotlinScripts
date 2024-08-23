package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TridentRiptideFeatureRenderer

val <T>KClass<TridentRiptideFeatureRenderer<T>>.BOX where T: LivingEntity by aliasStatic({TridentRiptideFeatureRenderer.field_32946})
val <T>KClass<TridentRiptideFeatureRenderer<T>>.TEXTURE where T: LivingEntity by aliasStatic({TridentRiptideFeatureRenderer.field_4898})
fun <T>KClass<TridentRiptideFeatureRenderer<T>>.getTexturedModelData() where T: LivingEntity = TridentRiptideFeatureRenderer.method_32200()
fun <T>TridentRiptideFeatureRenderer<T>.render(arg0: MatrixStack, arg1: VertexConsumerProvider, arg2: Int, arg3: T, arg4: Float, arg5: Float, arg6: Float, arg7: Float, arg8: Float, arg9: Float) where T: LivingEntity = this.method_4203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
