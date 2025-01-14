package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TagBuilder

fun TagBuilder.add(arg0: Identifier) = this.method_26784(arg0)
fun TagBuilder.build() = this.method_26782()
fun TagBuilder.addTag(arg0: Identifier) = this.method_26787(arg0)
fun TagBuilder.add(arg0: tag_TagEntry) = this.method_27064(arg0)
fun TagBuilder.addOptional(arg0: Identifier) = this.method_34891(arg0)
fun TagBuilder.addOptionalTag(arg0: Identifier) = this.method_34892(arg0)
fun KClass<TagBuilder>.create() = TagBuilder.method_26778()
