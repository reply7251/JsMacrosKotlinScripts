package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GameMode

val KClass<GameMode>.DEFAULT by aliasStatic(GameMode::field_28045)
val KClass<GameMode>.CREATIVE by aliasEnum(GameMode::class, "field_9220")
val KClass<GameMode>.SPECTATOR by aliasEnum(GameMode::class, "field_9219")
val KClass<GameMode>.SURVIVAL by aliasEnum(GameMode::class, "field_9215")
val KClass<GameMode>.ADVENTURE by aliasEnum(GameMode::class, "field_9216")
fun KClass<GameMode>.byName(arg0: String, arg1: GameMode) = GameMode.method_8378(arg0, arg1)
fun GameMode.getId() = this.method_8379()
fun GameMode.setAbilities(arg0: PlayerAbilities) = this.method_8382(arg0)
fun GameMode.getName() = this.method_8381()
fun KClass<GameMode>.getOrNull(arg0: Int) = GameMode.method_32762(arg0)
fun GameMode.getSimpleTranslatableName() = this.method_32763()
fun KClass<GameMode>.byId(arg0: Int) = GameMode.method_8384(arg0)
fun GameMode.getTranslatableName() = this.method_8383()
fun KClass<GameMode>.byName(arg0: String) = GameMode.method_8385(arg0)
fun KClass<GameMode>.getId(arg0: GameMode) = GameMode.method_32761(arg0)
fun GameMode.isCreative() = this.method_8386()
fun GameMode.isBlockBreakingRestricted() = this.method_8387()
fun GameMode.isSurvivalLike() = this.method_8388()
