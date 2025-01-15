package me.hellrevenger.generated.Map_LootContext
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>LootContext.get(arg0: LootContextParameter<T>) = this.method_296<T>(arg0)
fun LootContext.drop(arg0: Identifier, arg1: Consumer<ItemStack>) = this.method_297(arg0, arg1)
fun LootContext.isActive(arg0: net.minecraft.class_47.class_8487<*>) = this.method_51184(arg0)
fun LootContext.getWorld() = this.method_299()
fun LootContext.getRandom() = this.method_294()
fun LootContext.markActive(arg0: net.minecraft.class_47.class_8487<*>) = this.method_298(arg0)
fun LootContext.markInactive(arg0: net.minecraft.class_47.class_8487<*>) = this.method_295(arg0)
fun LootContext.getLookup() = this.method_51183()
fun KClass<LootContext>.predicate(arg0: LootCondition) = LootContext.method_51187(arg0)
fun LootContext.hasParameter(arg0: LootContextParameter<*>) = this.method_300(arg0)
fun KClass<LootContext>.itemModifier(arg0: LootFunction) = LootContext.method_51186(arg0)
fun LootContext.getLuck() = this.method_302()
fun <T>LootContext.requireParameter(arg0: LootContextParameter<T>) = this.method_35508<T>(arg0)
fun KClass<LootContext>.table(arg0: LootTable) = LootContext.method_51185(arg0)
