package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EnchantmentLocationBasedEffect

fun EnchantmentLocationBasedEffect.apply(arg0: ServerWorld, arg1: Int, arg2: EnchantmentEffectContext, arg3: Entity, arg4: Vec3d, arg5: Boolean) = this.method_60221(arg0, arg1, arg2, arg3, arg4, arg5)
fun EnchantmentLocationBasedEffect.remove(arg0: EnchantmentEffectContext, arg1: Entity, arg2: Vec3d, arg3: Int) = this.method_60222(arg0, arg1, arg2, arg3)
fun KClass<EnchantmentLocationBasedEffect>.registerAndGetDefault(arg0: Registry<MapCodec<out EnchantmentLocationBasedEffect>>) = EnchantmentLocationBasedEffect.method_60232(arg0)
fun EnchantmentLocationBasedEffect.getCodec() = this.method_60219()
