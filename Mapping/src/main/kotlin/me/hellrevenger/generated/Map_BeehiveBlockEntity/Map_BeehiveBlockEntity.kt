package me.hellrevenger.generated.Map_BeehiveBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<BeehiveBlockEntity>.MIN_OCCUPATION_TICKS_WITHOUT_NECTAR by aliasStatic(BeehiveBlockEntity::field_31313)
val KClass<BeehiveBlockEntity>.MAX_BEE_COUNT by aliasStatic(BeehiveBlockEntity::field_31312)
fun BeehiveBlockEntity.getBeeCount() = this.method_23903()
fun BeehiveBlockEntity.tryEnterHive(arg0: Entity) = this.method_21848(arg0)
fun KClass<BeehiveBlockEntity>.serverTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: BeehiveBlockEntity) = BeehiveBlockEntity.method_31656(arg0, arg1, arg2, arg3)
fun BeehiveBlockEntity.addBee(arg0: net.minecraft.class_4482.class_9309) = this.method_35292(arg0)
fun BeehiveBlockEntity.angerBees(arg0: PlayerEntity, arg1: BlockState, arg2: net.minecraft.class_4482.class_4484) = this.method_21850(arg0, arg1, arg2)
fun BeehiveBlockEntity.isFullOfBees() = this.method_21856()
fun BeehiveBlockEntity.hasNoBees() = this.method_22400()
fun BeehiveBlockEntity.isNearFire() = this.method_23280()
fun KClass<BeehiveBlockEntity>.getHoneyLevel(arg0: BlockState) = BeehiveBlockEntity.method_23902(arg0)
fun BeehiveBlockEntity.isSmoked() = this.method_23904()
