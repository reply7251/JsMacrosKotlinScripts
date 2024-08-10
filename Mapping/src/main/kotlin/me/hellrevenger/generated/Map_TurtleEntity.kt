package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TurtleEntity

val TurtleEntity.BABY_TURTLE_ON_LAND_FILTER by aliasStatic(TurtleEntity::field_6921)
fun TurtleEntity.setHomePos(arg0: BlockPos) = this.method_6683(arg0)
fun KClass<TurtleEntity>.createTurtleAttributes() = TurtleEntity.method_26896()
fun TurtleEntity.isDiggingSand() = this.method_6695()
fun TurtleEntity.hasEgg() = this.method_6679()
fun KClass<TurtleEntity>.canSpawn(arg0: EntityType<TurtleEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = TurtleEntity.method_20671(arg0, arg1, arg2, arg3, arg4)
