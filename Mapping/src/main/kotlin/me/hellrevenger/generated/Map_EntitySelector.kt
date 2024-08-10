package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntitySelector

val EntitySelector.ARBITRARY by aliasStatic(EntitySelector::field_41524)
val EntitySelector.MAX_VALUE by aliasStatic(EntitySelector::field_33068)
fun EntitySelector.getPlayers(arg0: ServerCommandSource) = this.method_9813(arg0)
fun EntitySelector.getPlayer(arg0: ServerCommandSource) = this.method_9811(arg0)
fun EntitySelector.isSenderOnly() = this.method_9820()
fun KClass<EntitySelector>.getNames(arg0: List<out Entity>) = EntitySelector.method_9822(arg0)
fun EntitySelector.getEntities(arg0: ServerCommandSource) = this.method_9816(arg0)
fun EntitySelector.getEntity(arg0: ServerCommandSource) = this.method_9809(arg0)
fun EntitySelector.isLocalWorldOnly() = this.method_9821()
fun EntitySelector.usesAt() = this.method_35815()
fun EntitySelector.includesNonPlayers() = this.method_9819()
