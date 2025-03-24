package me.hellrevenger.generated.Map_GameMode
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_28045
 */
val KClass<GameMode>.DEFAULT by aliasStatic(GameMode::field_28045)
/**
 * field_9220
 */
val KClass<GameMode>.CREATIVE by aliasEnum(GameMode::class, "field_9220")
/**
 * field_9219
 */
val KClass<GameMode>.SPECTATOR by aliasEnum(GameMode::class, "field_9219")
/**
 * field_9215
 */
val KClass<GameMode>.SURVIVAL by aliasEnum(GameMode::class, "field_9215")
/**
 * field_9216
 */
val KClass<GameMode>.ADVENTURE by aliasEnum(GameMode::class, "field_9216")
/**
 * method_8378
 */
fun KClass<GameMode>.byName(arg0: String, arg1: GameMode) = GameMode.method_8378(arg0, arg1)
/**
 * method_8379
 */
fun GameMode.getId() = this.method_8379()
/**
 * method_8382
 */
fun GameMode.setAbilities(arg0: PlayerAbilities) = this.method_8382(arg0)
/**
 * method_8381
 */
fun GameMode.getName() = this.method_8381()
/**
 * method_32762
 */
fun KClass<GameMode>.getOrNull(arg0: Int) = GameMode.method_32762(arg0)
/**
 * method_32763
 */
fun GameMode.getSimpleTranslatableName() = this.method_32763()
/**
 * method_64760
 */
fun KClass<GameMode>.isValid(arg0: Int) = GameMode.method_64760(arg0)
/**
 * method_8384
 */
fun KClass<GameMode>.byId(arg0: Int) = GameMode.method_8384(arg0)
/**
 * method_8383
 */
fun GameMode.getTranslatableName() = this.method_8383()
/**
 * method_8385
 */
fun KClass<GameMode>.byName(arg0: String) = GameMode.method_8385(arg0)
/**
 * method_32761
 */
fun KClass<GameMode>.getId(arg0: GameMode) = GameMode.method_32761(arg0)
/**
 * method_8386
 */
fun GameMode.isCreative() = this.method_8386()
/**
 * method_8387
 */
fun GameMode.isBlockBreakingRestricted() = this.method_8387()
/**
 * method_8388
 */
fun GameMode.isSurvivalLike() = this.method_8388()
