package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Merchant

fun Merchant.setExperienceFromServer(arg0: Int) = this.method_19271(arg0)
fun Merchant.sendOffers(arg0: PlayerEntity, arg1: Text, arg2: Int) = this.method_17449(arg0, arg1, arg2)
fun Merchant.setCustomer(arg0: PlayerEntity) = this.method_8259(arg0)
fun Merchant.getYesSound() = this.method_18010()
fun Merchant.getExperience() = this.method_19269()
fun Merchant.getOffers() = this.method_8264()
fun Merchant.isLeveledMerchant() = this.method_19270()
fun Merchant.onSellingItem(arg0: ItemStack) = this.method_8258(arg0)
fun Merchant.isClient() = this.method_38069()
fun Merchant.trade(arg0: TradeOffer) = this.method_8262(arg0)
fun Merchant.canRefreshTrades() = this.method_20708()
fun Merchant.setOffersFromServer(arg0: TradeOfferList) = this.method_8261(arg0)
fun Merchant.getCustomer() = this.method_8257()
