package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TradeOffer

val TradeOffer.PACKET_CODEC by aliasStatic(TradeOffer::field_48371)
fun TradeOffer.copy() = this.method_53881()
fun TradeOffer.isDisabled() = this.method_8255()
fun TradeOffer.clearSpecialPrice() = this.method_19276()
fun TradeOffer.getDisplayedFirstBuyItem() = this.method_19272()
fun TradeOffer.hasBeenUsed() = this.method_21834()
fun TradeOffer.getDisplayedSecondBuyItem() = this.method_8247()
fun TradeOffer.disable() = this.method_8254()
fun TradeOffer.resetUses() = this.method_19275()
fun TradeOffer.copySellItem() = this.method_18019()
fun TradeOffer.depleteBuyItems(arg0: ItemStack, arg1: ItemStack) = this.method_16953(arg0, arg1)
fun TradeOffer.updateDemandBonus() = this.method_19274()
fun TradeOffer.getOriginalFirstBuyItem() = this.method_8246()
fun TradeOffer.increaseSpecialPrice(arg0: Int) = this.method_8245(arg0)
fun TradeOffer.setSpecialPrice(arg0: Int) = this.method_19273(arg0)
fun TradeOffer.matchesBuyItems(arg0: ItemStack, arg1: ItemStack) = this.method_16952(arg0, arg1)
fun TradeOffer.use() = this.method_8244()
fun KClass<TradeOffer>.read(arg0: RegistryByteBuf) = TradeOffer.method_56110(arg0)
fun TradeOffer.shouldRewardPlayerExperience() = this.method_8256()
