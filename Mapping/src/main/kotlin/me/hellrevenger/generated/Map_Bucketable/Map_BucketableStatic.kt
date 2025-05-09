package me.hellrevenger.generated.Map_Bucketable
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BucketableKt {
    /**
     * method_35168
     */
    fun copyDataFromNbt(entity: MobEntity, nbt: NbtCompound) = Bucketable.method_35168(entity, nbt)
    /**
     * method_35169
     */
    fun <T>tryBucket(player: PlayerEntity, hand: Hand, entity: T) where T: LivingEntity, T: Bucketable = Bucketable.method_35169<T>(player, hand, entity)
}