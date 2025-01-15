package me.hellrevenger.generated.Map_AdvancementRequirements
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<AdvancementRequirements>.EMPTY by aliasStatic(AdvancementRequirements::field_46084)
fun AdvancementRequirements.writeRequirements(arg0: PacketByteBuf) = this.method_53670(arg0)
fun AdvancementRequirements.getLength() = this.method_53664()
fun AdvancementRequirements.countMatches(arg0: Predicate<String>) = this.method_53675(arg0)
fun AdvancementRequirements.getNames() = this.method_53678()
fun AdvancementRequirements.validate(arg0: Set<String>) = this.method_54925(arg0)
fun AdvancementRequirements.matches(arg0: Predicate<String>) = this.method_53669(arg0)
fun KClass<AdvancementRequirements>.anyOf(arg0: Collection<String>) = AdvancementRequirements.method_53674(arg0)
fun AdvancementRequirements.isEmpty() = this.method_53677()
fun KClass<AdvancementRequirements>.allOf(arg0: Collection<String>) = AdvancementRequirements.method_53668(arg0)
fun AdvancementRequirements.requirements() = this.comp_1922()
