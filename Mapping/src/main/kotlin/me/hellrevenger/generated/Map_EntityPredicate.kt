package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityPredicate

fun KClass<EntityPredicate>.contextPredicateFromEntityPredicate(arg0: Optional<EntityPredicate>) = EntityPredicate.method_53137(arg0)
fun KClass<EntityPredicate>.contextPredicateFromEntityPredicate(arg0: net.minecraft.class_2048.class_2049) = EntityPredicate.method_53134(arg0)
fun EntityPredicate.typeSpecific() = this.comp_1769()
fun KClass<EntityPredicate>.createAdvancementEntityLootContext(arg0: ServerPlayerEntity, arg1: Entity) = EntityPredicate.method_27802(arg0, arg1)
fun EntityPredicate.test(arg0: ServerPlayerEntity, arg1: Entity) = this.method_8914(arg0, arg1)
fun EntityPredicate.distance() = this.comp_1762()
fun EntityPredicate.type() = this.comp_1761()
fun KClass<EntityPredicate>.contextPredicateFromEntityPredicates(arg0: Array<net.minecraft.class_2048.class_2049>) = EntityPredicate.method_53139(*arg0)
fun EntityPredicate.test(arg0: ServerWorld, arg1: Vec3d, arg2: Entity) = this.method_8909(arg0, arg1, arg2)
fun KClass<EntityPredicate>.asLootContextPredicate(arg0: EntityPredicate) = EntityPredicate.method_51704(arg0)
fun EntityPredicate.slots() = this.comp_2446()
fun EntityPredicate.vehicle() = this.comp_1770()
fun EntityPredicate.passenger() = this.comp_1771()
fun EntityPredicate.targetedEntity() = this.comp_1772()
fun EntityPredicate.movement() = this.comp_2668()
fun EntityPredicate.team() = this.comp_1773()
fun EntityPredicate.effects() = this.comp_1765()
fun EntityPredicate.nbt() = this.comp_1766()
fun EntityPredicate.flags() = this.comp_1767()
fun EntityPredicate.equipment() = this.comp_1768()
fun EntityPredicate.location() = this.comp_1763()
fun EntityPredicate.periodicTick() = this.comp_2669()
