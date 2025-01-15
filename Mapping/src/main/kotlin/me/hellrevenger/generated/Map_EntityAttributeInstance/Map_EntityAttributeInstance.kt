package me.hellrevenger.generated.Map_EntityAttributeInstance
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<EntityAttributeInstance>.ID_NBT_KEY by aliasStatic(EntityAttributeInstance::field_52007)
fun EntityAttributeInstance.toNbt() = this.method_26839()
fun EntityAttributeInstance.updateModifier(arg0: EntityAttributeModifier) = this.method_55696(arg0)
fun EntityAttributeInstance.removeModifier(arg0: Identifier) = this.method_6200(arg0)
fun EntityAttributeInstance.overwritePersistentModifier(arg0: EntityAttributeModifier) = this.method_61163(arg0)
fun EntityAttributeInstance.readNbt(arg0: NbtCompound) = this.method_26833(arg0)
fun EntityAttributeInstance.getModifier(arg0: Identifier) = this.method_6199(arg0)
fun EntityAttributeInstance.setFrom(arg0: EntityAttributeInstance) = this.method_26831(arg0)
fun EntityAttributeInstance.getValue() = this.method_6194()
fun EntityAttributeInstance.setBaseValue(arg0: Double) = this.method_6192(arg0)
fun EntityAttributeInstance.getBaseValue() = this.method_6201()
fun EntityAttributeInstance.hasModifier(arg0: Identifier) = this.method_6196(arg0)
fun EntityAttributeInstance.getModifiers() = this.method_6195()
fun EntityAttributeInstance.addPersistentModifier(arg0: EntityAttributeModifier) = this.method_26837(arg0)
fun EntityAttributeInstance.getAttribute() = this.method_6198()
fun EntityAttributeInstance.removeModifier(arg0: EntityAttributeModifier) = this.method_6202(arg0)
fun EntityAttributeInstance.addTemporaryModifier(arg0: EntityAttributeModifier) = this.method_26835(arg0)
fun EntityAttributeInstance.clearModifiers() = this.method_6203()
