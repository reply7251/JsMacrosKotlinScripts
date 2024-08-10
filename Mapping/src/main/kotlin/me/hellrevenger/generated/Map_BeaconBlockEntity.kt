package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BeaconBlockEntity

val BeaconBlockEntity.EFFECTS_BY_LEVEL by aliasStatic(BeaconBlockEntity::field_11801)
val BeaconBlockEntity.SECONDARY_PROPERTY_INDEX by aliasStatic(BeaconBlockEntity::field_31302)
val BeaconBlockEntity.LEVEL_PROPERTY_INDEX by aliasStatic(BeaconBlockEntity::field_31300)
val BeaconBlockEntity.PROPERTY_COUNT by aliasStatic(BeaconBlockEntity::field_31303)
val BeaconBlockEntity.PRIMARY_PROPERTY_INDEX by aliasStatic(BeaconBlockEntity::field_31301)
fun KClass<BeaconBlockEntity>.playSound(arg0: world_World, arg1: BlockPos, arg2: SoundEvent) = BeaconBlockEntity.method_10938(arg0, arg1, arg2)
fun BeaconBlockEntity.toUpdatePacket() = this.method_38236()
fun BeaconBlockEntity.setCustomName(arg0: Text) = this.method_10936(arg0)
fun KClass<BeaconBlockEntity>.tick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: BeaconBlockEntity) = BeaconBlockEntity.method_16896(arg0, arg1, arg2, arg3)
