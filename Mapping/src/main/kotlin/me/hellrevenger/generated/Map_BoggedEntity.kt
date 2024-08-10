package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BoggedEntity

val BoggedEntity.SHEARED_KEY by aliasStatic(BoggedEntity::field_49240)
fun BoggedEntity.setSheared(arg0: Boolean) = this.method_57310(arg0)
fun BoggedEntity.isSheared() = this.method_57308()
fun KClass<BoggedEntity>.createBoggedAttributes() = BoggedEntity.method_57080()
