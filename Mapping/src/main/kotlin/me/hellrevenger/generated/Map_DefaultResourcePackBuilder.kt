package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DefaultResourcePackBuilder

val DefaultResourcePackBuilder.callback by aliasStatic(DefaultResourcePackBuilder::field_40004)
fun DefaultResourcePackBuilder.withNamespaces(arg0: Array<String>) = this.method_45206(*arg0)
fun DefaultResourcePackBuilder.withRoot(arg0: file_Path) = this.method_45204(arg0)
fun DefaultResourcePackBuilder.build(arg0: ResourcePackInfo) = this.method_45210(arg0)
fun DefaultResourcePackBuilder.withPath(arg0: ResourceType, arg1: file_Path) = this.method_45201(arg0, arg1)
fun DefaultResourcePackBuilder.withDefaultPaths() = this.method_45197()
fun DefaultResourcePackBuilder.withMetadataMap(arg0: ResourceMetadataMap) = this.method_45198(arg0)
fun DefaultResourcePackBuilder.withPaths(arg0: ResourceType, arg1: Class<*>) = this.method_45200(arg0, arg1)
fun DefaultResourcePackBuilder.runCallback() = this.method_45207()
