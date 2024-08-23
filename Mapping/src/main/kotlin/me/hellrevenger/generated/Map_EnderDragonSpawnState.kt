package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EnderDragonSpawnState

val KClass<EnderDragonSpawnState>.END by aliasEnum(EnderDragonSpawnState::class, "field_13099")
val KClass<EnderDragonSpawnState>.SUMMONING_DRAGON by aliasEnum(EnderDragonSpawnState::class, "field_13098")
val KClass<EnderDragonSpawnState>.START by aliasEnum(EnderDragonSpawnState::class, "field_13097")
val KClass<EnderDragonSpawnState>.PREPARING_TO_SUMMON_PILLARS by aliasEnum(EnderDragonSpawnState::class, "field_13095")
val KClass<EnderDragonSpawnState>.SUMMONING_PILLARS by aliasEnum(EnderDragonSpawnState::class, "field_13094")
fun EnderDragonSpawnState.run(arg0: ServerWorld, arg1: EnderDragonFight, arg2: MutableList<EndCrystalEntity>, arg3: Int, arg4: BlockPos) = this.method_12507(arg0, arg1, arg2, arg3, arg4)
