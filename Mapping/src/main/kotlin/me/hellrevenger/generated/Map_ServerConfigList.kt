package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ServerConfigList

fun <V, K>ServerConfigList<K, V>.load() where V: ServerConfigEntry<K> = this.method_14630()
fun <V, K>ServerConfigList<K, V>.values() where V: ServerConfigEntry<K> = this.method_14632()
fun <V, K>ServerConfigList<K, V>.getNames() where V: ServerConfigEntry<K> = this.method_14636()
fun <V, K>ServerConfigList<K, V>.get(arg0: K) where V: ServerConfigEntry<K> = this.method_14640(arg0)
fun <V, K>ServerConfigList<K, V>.remove(arg0: ServerConfigEntry<K>) where V: ServerConfigEntry<K> = this.method_14638(arg0)
fun <V, K>ServerConfigList<K, V>.save() where V: ServerConfigEntry<K> = this.method_14629()
fun <V, K>ServerConfigList<K, V>.remove(arg0: K) where V: ServerConfigEntry<K> = this.method_14635(arg0)
fun <V, K>ServerConfigList<K, V>.add(arg0: V) where V: ServerConfigEntry<K> = this.method_14633(arg0)
fun <V, K>ServerConfigList<K, V>.isEmpty() where V: ServerConfigEntry<K> = this.method_14641()
