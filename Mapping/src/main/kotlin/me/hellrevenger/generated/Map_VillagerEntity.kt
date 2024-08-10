package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VillagerEntity

val VillagerEntity.POINTS_OF_INTEREST by aliasStatic(VillagerEntity::field_18851)
val VillagerEntity.ITEM_FOOD_VALUES by aliasStatic(VillagerEntity::field_18526)
fun VillagerEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_7225(arg0, arg1)
fun VillagerEntity.releaseTicketFor(arg0: MemoryModuleType<GlobalPos>) = this.method_19176(arg0)
fun VillagerEntity.setOffers(arg0: TradeOfferList) = this.method_16917(arg0)
fun VillagerEntity.wantsToStartBreeding() = this.method_7234()
fun VillagerEntity.hasSeedToPlant() = this.method_19623()
fun VillagerEntity.readGossipDataNbt(arg0: NbtElement) = this.method_21650(arg0)
fun VillagerEntity.restock() = this.method_19182()
fun VillagerEntity.canBreed() = this.method_7239()
fun VillagerEntity.eatForBreeding() = this.method_20697()
fun VillagerEntity.talkWithVillager(arg0: ServerWorld, arg1: VillagerEntity, arg2: Long) = this.method_19177(arg0, arg1, arg2)
fun VillagerEntity.reinitializeBrain(arg0: ServerWorld) = this.method_19179(arg0)
fun VillagerEntity.playWorkSound() = this.method_19183()
fun VillagerEntity.getReputation(arg0: PlayerEntity) = this.method_20594(arg0)
fun VillagerEntity.setExperience(arg0: Int) = this.method_19625(arg0)
fun VillagerEntity.shouldRestock() = this.method_20822()
fun VillagerEntity.canSummonGolem(arg0: Long) = this.method_20687(arg0)
fun VillagerEntity.summonGolem(arg0: ServerWorld, arg1: Long, arg2: Int) = this.method_20688(arg0, arg1, arg2)
fun KClass<VillagerEntity>.createVillagerAttributes() = VillagerEntity.method_26955()
fun VillagerEntity.isNatural() = this.method_29279()
