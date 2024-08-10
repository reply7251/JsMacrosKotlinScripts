package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ResourceFinder

fun ResourceFinder.toResourcePath(arg0: Identifier) = this.method_45112(arg0)
fun ResourceFinder.toResourceId(arg0: Identifier) = this.method_45115(arg0)
fun KClass<ResourceFinder>.json(arg0: String) = ResourceFinder.method_45114(arg0)
fun ResourceFinder.findAllResources(arg0: ResourceManager) = this.method_45116(arg0)
fun ResourceFinder.findResources(arg0: ResourceManager) = this.method_45113(arg0)
