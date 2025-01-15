package me.hellrevenger.generated.Map_VillagerData
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<VillagerData>.MAX_LEVEL by aliasStatic(VillagerData::field_30614)
val KClass<VillagerData>.MIN_LEVEL by aliasStatic(VillagerData::field_30613)
fun VillagerData.withType(arg0: VillagerType) = this.method_16922(arg0)
fun KClass<VillagerData>.canLevelUp(arg0: Int) = VillagerData.method_19196(arg0)
fun VillagerData.withLevel(arg0: Int) = this.method_16920(arg0)
fun KClass<VillagerData>.getUpperLevelExperience(arg0: Int) = VillagerData.method_19195(arg0)
fun VillagerData.getProfession() = this.method_16924()
fun VillagerData.getType() = this.method_16919()
fun VillagerData.withProfession(arg0: VillagerProfession) = this.method_16921(arg0)
fun VillagerData.getLevel() = this.method_16925()
fun KClass<VillagerData>.getLowerLevelExperience(arg0: Int) = VillagerData.method_19194(arg0)
