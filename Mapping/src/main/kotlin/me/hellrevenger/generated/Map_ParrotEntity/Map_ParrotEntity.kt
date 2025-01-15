package me.hellrevenger.generated.Map_ParrotEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

var ParrotEntity.prevMaxWingDeviation by alias(ParrotEntity::field_6827)
var ParrotEntity.maxWingDeviation by alias(ParrotEntity::field_6819)
var ParrotEntity.flapProgress by alias(ParrotEntity::field_6818)
var ParrotEntity.prevFlapProgress by alias(ParrotEntity::field_6829)
fun KClass<ParrotEntity>.createParrotAttributes() = ParrotEntity.method_26889()
fun ParrotEntity.isSongPlaying() = this.method_6582()
fun ParrotEntity.getVariant() = this.method_6584()
fun KClass<ParrotEntity>.getRandomSound(arg0: world_World, arg1: Random) = ParrotEntity.method_6583(arg0, arg1)
fun KClass<ParrotEntity>.imitateNearbyMob(arg0: world_World, arg1: Entity) = ParrotEntity.method_6587(arg0, arg1)
fun ParrotEntity.setVariant(arg0: net.minecraft.class_1453.class_7989) = this.method_47848(arg0)
fun KClass<ParrotEntity>.getSoundPitch(arg0: Random) = ParrotEntity.method_6580(arg0)
fun KClass<ParrotEntity>.canSpawn(arg0: EntityType<ParrotEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = ParrotEntity.method_20667(arg0, arg1, arg2, arg3, arg4)
