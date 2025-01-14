package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ResourcePackManager

var ResourcePackManager.providers by alias(ResourcePackManager::field_14227)
fun KClass<ResourcePackManager>.listPacks(arg0: Collection<ResourcePackProfile>) = ResourcePackManager.method_59809(arg0)
fun ResourcePackManager.scanPacks() = this.method_14445()
fun ResourcePackManager.getRequestedFeatures() = this.method_45278()
fun ResourcePackManager.enable(arg0: String) = this.method_49427(arg0)
fun ResourcePackManager.createResourcePacks() = this.method_29211()
fun ResourcePackManager.getProfile(arg0: String) = this.method_14449(arg0)
fun ResourcePackManager.getIds() = this.method_29206()
fun ResourcePackManager.disable(arg0: String) = this.method_49428(arg0)
fun ResourcePackManager.getEnabledProfiles() = this.method_14444()
fun ResourcePackManager.getProfiles() = this.method_14441()
fun ResourcePackManager.setEnabledProfiles(arg0: Collection<String>) = this.method_14447(arg0)
fun ResourcePackManager.hasProfile(arg0: String) = this.method_29207(arg0)
fun ResourcePackManager.getEnabledIds() = this.method_29210()
