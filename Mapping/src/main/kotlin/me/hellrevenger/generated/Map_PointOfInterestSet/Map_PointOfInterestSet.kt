package me.hellrevenger.generated.Map_PointOfInterestSet
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_19153
 */
fun PointOfInterestSet.releaseTicket(pos: BlockPos?) = this.method_19153(pos)
/**
 * method_19154
 */
fun PointOfInterestSet.getType(pos: BlockPos?) = this.method_19154(pos)
/**
 * method_19145
 */
fun PointOfInterestSet.remove(pos: BlockPos?) = this.method_19145(pos)
/**
 * method_35157
 */
fun PointOfInterestSet.getFreeTickets(pos: BlockPos?) = this.method_35157(pos)
/**
 * method_19146
 */
fun PointOfInterestSet.add(pos: BlockPos?, type: RegistryEntry<PointOfInterestType>?) = this.method_19146(pos, type)
/**
 * method_19147
 */
fun PointOfInterestSet.test(pos: BlockPos?, predicate: Predicate<RegistryEntry<PointOfInterestType>>?) = this.method_19147(pos, predicate)
/**
 * method_61451
 */
fun PointOfInterestSet.toSerialized() = this.method_61451()
/**
 * method_20353
 */
fun PointOfInterestSet.updatePointsOfInterest(updater: Consumer<BiConsumer<BlockPos, RegistryEntry<PointOfInterestType>>>?) = this.method_20353(updater)
/**
 * method_19150
 */
fun PointOfInterestSet.get(predicate: Predicate<RegistryEntry<PointOfInterestType>>?, occupationStatus: net.minecraft.class_4153.class_4155?) = this.method_19150(predicate, occupationStatus)
