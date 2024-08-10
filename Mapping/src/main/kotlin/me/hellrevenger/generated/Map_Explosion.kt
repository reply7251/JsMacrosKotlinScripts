package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Explosion

fun Explosion.canTriggerBlocks() = this.method_60274()
fun KClass<Explosion>.getExposure(arg0: Vec3d, arg1: Entity) = Explosion.method_17752(arg0, arg1)
fun Explosion.getPosition() = this.method_55109()
fun KClass<Explosion>.createDamageSource(arg0: world_World, arg1: Entity) = Explosion.method_55108(arg0, arg1)
fun Explosion.affectWorld(arg0: Boolean) = this.method_8350(arg0)
fun Explosion.shouldDestroy() = this.method_46667()
fun Explosion.getCausingEntity() = this.method_8347()
fun Explosion.collectBlocksAndDamageEntities() = this.method_8348()
fun Explosion.clearAffectedBlocks() = this.method_8352()
