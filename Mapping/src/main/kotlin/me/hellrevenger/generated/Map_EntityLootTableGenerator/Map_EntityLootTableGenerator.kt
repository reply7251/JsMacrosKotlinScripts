package me.hellrevenger.generated.Map_EntityLootTableGenerator
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_40615
 */
val EntityLootTableGenerator.lootTables by alias(EntityLootTableGenerator::field_40615)
/**
 * method_46028
 */
fun EntityLootTableGenerator.register(arg0: EntityType<*>, arg1: RegistryKey<LootTable>, arg2: net.minecraft.class_52.class_53) = this.method_46028(arg0, arg1, arg2)
/**
 * method_46029
 */
fun EntityLootTableGenerator.register(arg0: EntityType<*>, arg1: net.minecraft.class_52.class_53) = this.method_46029(arg0, arg1)
/**
 * method_10400
 */
fun EntityLootTableGenerator.generate() = this.method_10400()
/**
 * method_46031
 */
fun KClass<EntityLootTableGenerator>.createForSheep(arg0: Map<DyeColor, RegistryKey<LootTable>>) = EntityLootTableGenerator.method_46031(arg0)
