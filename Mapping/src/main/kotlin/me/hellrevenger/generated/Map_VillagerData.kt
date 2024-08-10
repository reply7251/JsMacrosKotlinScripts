package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VillagerData

val VillagerData.MAX_LEVEL by aliasStatic(VillagerData::field_30614)
val VillagerData.MIN_LEVEL by aliasStatic(VillagerData::field_30613)
val VillagerData.PACKET_CODEC by aliasStatic(VillagerData::field_48345)
fun VillagerData.withType(arg0: VillagerType) = this.method_16922(arg0)
fun KClass<VillagerData>.canLevelUp(arg0: Int) = VillagerData.method_19196(arg0)
fun VillagerData.withLevel(arg0: Int) = this.method_16920(arg0)
fun KClass<VillagerData>.getUpperLevelExperience(arg0: Int) = VillagerData.method_19195(arg0)
fun VillagerData.withProfession(arg0: VillagerProfession) = this.method_16921(arg0)
fun KClass<VillagerData>.getLowerLevelExperience(arg0: Int) = VillagerData.method_19194(arg0)
