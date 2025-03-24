package me.hellrevenger.generated.Map_Raid
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30670
 */
val KClass<Raid>.MAX_DESPAWN_COUNTER by aliasStatic(Raid::field_30670)
/**
 * field_30675
 */
val KClass<Raid>.SQUARED_MAX_RAIDER_DISTANCE by aliasStatic(Raid::field_30675)
/**
 * field_53976
 */
val KClass<Raid>.RAVAGER_SPAWN_LOCATION by aliasStatic(Raid::field_53976)
/**
 * method_16514
 */
fun Raid.getMaxAcceptableBadOmenLevel() = this.method_16514()
/**
 * method_16506
 */
fun Raid.invalidate() = this.method_16506()
/**
 * method_16493
 */
fun Raid.getBadOmenLevel() = this.method_16493()
/**
 * method_20022
 */
fun Raid.hasStopped() = this.method_20022()
/**
 * method_16518
 */
fun Raid.start(arg0: ServerPlayerEntity) = this.method_16518(arg0)
/**
 * method_16832
 */
fun Raid.isFinished() = this.method_16832()
/**
 * method_35212
 */
fun Raid.getTotalHealth() = this.method_35212()
/**
 * method_16491
 */
fun Raid.setWaveCaptain(arg0: Int, arg1: RaiderEntity) = this.method_16491(arg0, arg1)
/**
 * method_16490
 */
fun Raid.getGroupsSpawned() = this.method_16490()
/**
 * method_16494
 */
fun Raid.getRaidId() = this.method_16494()
/**
 * method_16495
 */
fun Raid.getCenter() = this.method_16495()
/**
 * method_35211
 */
fun Raid.setBadOmenLevel(arg0: Int) = this.method_35211(arg0)
/**
 * method_16502
 */
fun Raid.writeNbt(arg0: NbtCompound) = this.method_16502(arg0)
/**
 * method_20021
 */
fun Raid.hasSpawned() = this.method_20021()
/**
 * method_61558
 */
fun KClass<Raid>.createOminousBanner(arg0: RegistryEntryLookup<BannerPattern>) = Raid.method_61558(arg0)
/**
 * method_16500
 */
fun Raid.removeLeader(arg0: Int) = this.method_16500(arg0)
/**
 * method_20024
 */
fun Raid.hasLost() = this.method_20024()
/**
 * method_16831
 */
fun Raid.getWorld() = this.method_16831()
/**
 * method_20017
 */
fun Raid.addHero(arg0: Entity) = this.method_20017(arg0)
/**
 * method_16523
 */
fun Raid.updateBar() = this.method_16523()
/**
 * method_20020
 */
fun Raid.isPreRaid() = this.method_20020()
/**
 * method_35213
 */
fun Raid.getAllRaiders() = this.method_35213()
/**
 * method_16510
 */
fun Raid.removeFromWave(arg0: RaiderEntity, arg1: Boolean) = this.method_16510(arg0, arg1)
/**
 * method_20025
 */
fun Raid.getEnchantmentChance() = this.method_20025()
/**
 * method_16496
 */
fun Raid.getCaptain(arg0: Int) = this.method_16496(arg0)
/**
 * method_16516
 */
fun Raid.addRaider(arg0: Int, arg1: RaiderEntity, arg2: BlockPos, arg3: Boolean) = this.method_16516(arg0, arg1, arg2, arg3)
/**
 * method_16487
 */
fun Raid.addToWave(arg0: Int, arg1: RaiderEntity, arg2: Boolean) = this.method_16487(arg0, arg1, arg2)
/**
 * method_16509
 */
fun Raid.tick() = this.method_16509()
/**
 * method_20016
 */
fun Raid.getMaxWaves(arg0: Difficulty) = this.method_20016(arg0)
/**
 * method_20023
 */
fun Raid.hasWon() = this.method_20023()
/**
 * method_16504
 */
fun Raid.isActive() = this.method_16504()
/**
 * method_16524
 */
fun Raid.hasStarted() = this.method_16524()
/**
 * method_16513
 */
fun Raid.getCurrentRaiderHealth() = this.method_16513()
/**
 * method_16517
 */
fun Raid.getRaiderCount() = this.method_16517()
