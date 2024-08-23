package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BanEntry

val <T>KClass<BanEntry<T>>.FOREVER by aliasStatic({BanEntry.field_29787})
val <T>KClass<BanEntry<T>>.DATE_FORMAT by aliasStatic({BanEntry.field_14308})
fun <T>BanEntry<T>.getSource() = this.method_14501()
fun <T>BanEntry<T>.getExpiryDate() = this.method_14502()
fun <T>BanEntry<T>.toText() = this.method_14504()
fun <T>BanEntry<T>.getCreationDate() = this.method_34885()
fun <T>BanEntry<T>.getReason() = this.method_14503()
