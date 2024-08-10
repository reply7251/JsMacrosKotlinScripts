package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Component

val <T>Component<T>.PACKET_CODEC by aliasStatic({Component.field_49657})
fun <T>Component<T>.apply(arg0: ComponentMapImpl) = this.method_57946(arg0)
fun <T>KClass<Component<T>>.of(arg0: ComponentType<T>, arg1: Object) = Component.method_57945<T>(arg0, arg1)
fun <T, D>Component<T>.encode(arg0: DynamicOps<D>) = this.method_57943<D>(arg0)
fun <T>Component<T>.value() = this.comp_2444()
fun <T>Component<T>.type() = this.comp_2443()
