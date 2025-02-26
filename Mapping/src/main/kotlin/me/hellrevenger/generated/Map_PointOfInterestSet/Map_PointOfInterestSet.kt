package me.hellrevenger.generated.Map_PointOfInterestSet
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_19153
 */
fun PointOfInterestSet.releaseTicket(arg0: BlockPos) = this.method_19153(arg0)
/**
 * method_19154
 */
fun PointOfInterestSet.getType(arg0: BlockPos) = this.method_19154(arg0)
/**
 * method_19145
 */
fun PointOfInterestSet.remove(arg0: BlockPos) = this.method_19145(arg0)
/**
 * method_35157
 */
fun PointOfInterestSet.getFreeTickets(arg0: BlockPos) = this.method_35157(arg0)
/**
 * method_19146
 */
fun PointOfInterestSet.add(arg0: BlockPos, arg1: RegistryEntry<PointOfInterestType>) = this.method_19146(arg0, arg1)
/**
 * method_19147
 */
fun PointOfInterestSet.test(arg0: BlockPos, arg1: Predicate<RegistryEntry<PointOfInterestType>>) = this.method_19147(arg0, arg1)
/**
 * method_20353
 */
fun PointOfInterestSet.updatePointsOfInterest(arg0: Consumer<BiConsumer<BlockPos, RegistryEntry<PointOfInterestType>>>) = this.method_20353(arg0)
/**
 * method_19150
 */
fun PointOfInterestSet.get(arg0: Predicate<RegistryEntry<PointOfInterestType>>, arg1: net.minecraft.class_4153.class_4155) = this.method_19150(arg0, arg1)
/**
 * method_28364
 */
fun KClass<PointOfInterestSet>.createCodec(arg0: Runnable) = PointOfInterestSet.method_28364(arg0)
