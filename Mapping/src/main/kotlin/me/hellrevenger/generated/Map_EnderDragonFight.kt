package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EnderDragonFight

val KClass<EnderDragonFight>.SPAWN_Y by aliasStatic(EnderDragonFight::field_31442)
fun EnderDragonFight.tick() = this.method_12538()
fun EnderDragonFight.crystalDestroyed(arg0: EndCrystalEntity, arg1: DamageSource) = this.method_12526(arg0, arg1)
fun EnderDragonFight.setSkipChunksLoadedCheck() = this.method_51855()
fun EnderDragonFight.respawnDragon() = this.method_12522()
fun EnderDragonFight.getAliveEndCrystals() = this.method_12517()
fun EnderDragonFight.updateFight(arg0: EnderDragonEntity) = this.method_12532(arg0)
fun EnderDragonFight.dragonKilled(arg0: EnderDragonEntity) = this.method_12528(arg0)
fun EnderDragonFight.resetEndCrystals() = this.method_12524()
fun EnderDragonFight.hasPreviouslyKilled() = this.method_12536()
fun EnderDragonFight.getDragonUuid() = this.method_52179()
fun EnderDragonFight.toData() = this.method_12530()
fun EnderDragonFight.clearGatewaysList() = this.method_51856()
