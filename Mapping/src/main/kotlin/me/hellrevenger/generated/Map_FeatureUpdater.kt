package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FeatureUpdater

fun KClass<FeatureUpdater>.create(arg0: RegistryKey<world_World>, arg1: PersistentStateManager) = FeatureUpdater.method_14745(arg0, arg1)
fun FeatureUpdater.markResolved(arg0: Long) = this.method_14744(arg0)
fun FeatureUpdater.getUpdatedReferences(arg0: NbtCompound) = this.method_14735(arg0)
