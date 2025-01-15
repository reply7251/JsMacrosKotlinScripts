package me.hellrevenger.generated.Map_EntitySelector
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<EntitySelector>.ARBITRARY by aliasStatic(EntitySelector::field_41524)
val KClass<EntitySelector>.MAX_VALUE by aliasStatic(EntitySelector::field_33068)
fun EntitySelector.getPlayers(arg0: ServerCommandSource) = this.method_9813(arg0)
fun EntitySelector.getPlayer(arg0: ServerCommandSource) = this.method_9811(arg0)
fun EntitySelector.isSenderOnly() = this.method_9820()
fun KClass<EntitySelector>.getNames(arg0: MutableList<out Entity>) = EntitySelector.method_9822(arg0)
fun EntitySelector.getLimit() = this.method_9815()
fun EntitySelector.getEntities(arg0: ServerCommandSource) = this.method_9816(arg0)
fun EntitySelector.getEntity(arg0: ServerCommandSource) = this.method_9809(arg0)
fun EntitySelector.isLocalWorldOnly() = this.method_9821()
fun EntitySelector.usesAt() = this.method_35815()
fun EntitySelector.includesNonPlayers() = this.method_9819()
