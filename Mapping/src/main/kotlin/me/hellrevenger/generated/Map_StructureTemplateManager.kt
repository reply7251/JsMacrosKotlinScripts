package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StructureTemplateManager

val StructureTemplateManager.STRUCTURE_DIRECTORY by aliasStatic(StructureTemplateManager::field_31684)
fun StructureTemplateManager.getTemplateOrBlank(arg0: Identifier) = this.method_15091(arg0)
fun StructureTemplateManager.getTemplatePath(arg0: Identifier, arg1: String) = this.method_15085(arg0, arg1)
fun StructureTemplateManager.unloadTemplate(arg0: Identifier) = this.method_15087(arg0)
fun StructureTemplateManager.getTemplate(arg0: Identifier) = this.method_15094(arg0)
fun StructureTemplateManager.saveTemplate(arg0: Identifier) = this.method_15093(arg0)
fun StructureTemplateManager.setResourceManager(arg0: ResourceManager) = this.method_29300(arg0)
fun StructureTemplateManager.streamTemplates() = this.method_44226()
fun StructureTemplateManager.createTemplate(arg0: NbtCompound) = this.method_21891(arg0)
