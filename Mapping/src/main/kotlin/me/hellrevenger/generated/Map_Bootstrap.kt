package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Bootstrap

val KClass<Bootstrap>.SYSOUT by aliasStatic(Bootstrap::field_13358)
val KClass<Bootstrap>.LOAD_TIME by aliasStatic(Bootstrap::field_44781)
fun KClass<Bootstrap>.getMissingTranslations() = Bootstrap.method_17597()
fun KClass<Bootstrap>.initialize() = Bootstrap.method_12851()
fun KClass<Bootstrap>.logMissing() = Bootstrap.method_17598()
fun KClass<Bootstrap>.println(arg0: String) = Bootstrap.method_12847(arg0)
fun KClass<Bootstrap>.ensureBootstrapped(arg0: Supplier<String>) = Bootstrap.method_36235(arg0)
