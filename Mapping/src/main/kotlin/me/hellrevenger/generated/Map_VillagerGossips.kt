package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VillagerGossips

fun VillagerGossips.removeGossip(arg0: UUID, arg1: VillageGossipType, arg2: Int) = this.method_35126(arg0, arg1, arg2)
fun VillagerGossips.remove(arg0: VillageGossipType) = this.method_35121(arg0)
fun <T>VillagerGossips.serialize(arg0: DynamicOps<T>) = this.method_19067<T>(arg0)
fun VillagerGossips.getEntityReputationAssociatedGossips() = this.method_35120()
fun VillagerGossips.startGossip(arg0: UUID, arg1: VillageGossipType, arg2: Int) = this.method_19072(arg0, arg1, arg2)
fun VillagerGossips.getReputationCount(arg0: VillageGossipType, arg1: DoublePredicate) = this.method_35122(arg0, arg1)
fun VillagerGossips.shareGossipFrom(arg0: VillagerGossips, arg1: Random, arg2: Int) = this.method_19061(arg0, arg1, arg2)
fun VillagerGossips.remove(arg0: UUID, arg1: VillageGossipType) = this.method_35124(arg0, arg1)
fun VillagerGossips.decay() = this.method_20651()
fun VillagerGossips.getReputationFor(arg0: UUID, arg1: Predicate<VillageGossipType>) = this.method_19073(arg0, arg1)
fun VillagerGossips.deserialize(arg0: Dynamic<*>) = this.method_19066(arg0)
