package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Advancement

val Advancement.PACKET_CODEC by aliasStatic(Advancement::field_47996)
fun Advancement.validate(arg0: ErrorReporter, arg1: net.minecraft.class_7871.class_7872) = this.method_54912(arg0, arg1)
fun KClass<Advancement>.getNameFromIdentity(arg0: AdvancementEntry) = Advancement.method_53622(arg0)
fun Advancement.isRoot() = this.method_53630()
fun Advancement.criteria() = this.comp_1915()
fun Advancement.sendsTelemetryEvent() = this.comp_1917()
fun Advancement.display() = this.comp_1913()
fun Advancement.parent() = this.comp_1912()
fun Advancement.name() = this.comp_1918()
fun Advancement.rewards() = this.comp_1914()
fun Advancement.requirements() = this.comp_1916()
