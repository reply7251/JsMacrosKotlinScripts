package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Bucketable

fun Bucketable.getBucketFillSound() = this.method_35171()
fun Bucketable.setFromBucket(arg0: Boolean) = this.method_6454(arg0)
fun KClass<Bucketable>.copyDataFromNbt(arg0: MobEntity, arg1: NbtCompound) = Bucketable.method_35168(arg0, arg1)
fun Bucketable.copyDataFromNbt(arg0: NbtCompound) = this.method_35170(arg0)
fun Bucketable.copyDataToStack(arg0: ItemStack) = this.method_6455(arg0)
fun <T>KClass<Bucketable>.tryBucket(arg0: PlayerEntity, arg1: Hand, arg2: T) where T: LivingEntity, T: Bucketable = Bucketable.method_35169<T>(arg0, arg1, arg2)
fun KClass<Bucketable>.copyDataToStack(arg0: MobEntity, arg1: ItemStack) = Bucketable.method_35167(arg0, arg1)
fun Bucketable.getBucketItem() = this.method_6452()
fun Bucketable.isFromBucket() = this.method_6453()
