package me.hellrevenger.generated.Map_PointOfInterestStorage
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_43985
 */
fun PointOfInterestStorage.getNearestTypeAndPosition(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_43985(typePredicate, pos, radius, occupationStatus)
/**
 * method_19118
 */
fun PointOfInterestStorage.getDistanceFromNearestOccupied(pos: ChunkSectionPos) = this.method_19118(pos)
/**
 * method_19129
 */
fun PointOfInterestStorage.releaseTicket(pos: BlockPos) = this.method_19129(pos)
/**
 * method_20252
 */
fun PointOfInterestStorage.count(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_20252(typePredicate, pos, radius, occupationStatus)
/**
 * method_20006
 */
fun PointOfInterestStorage.getNearestPosition(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_20006(typePredicate, pos, radius, occupationStatus)
/**
 * method_19132
 */
fun PointOfInterestStorage.getType(pos: BlockPos) = this.method_19132(pos)
/**
 * method_19125
 */
fun PointOfInterestStorage.getInCircle(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_19125(typePredicate, pos, radius, occupationStatus)
/**
 * method_19112
 */
fun PointOfInterestStorage.remove(pos: BlockPos) = this.method_19112(pos)
/**
 * method_22439
 */
fun PointOfInterestStorage.preloadChunks(world: WorldView, pos: BlockPos, radius: Int) = this.method_22439(world, pos, radius)
/**
 * method_30957
 */
fun PointOfInterestStorage.getSortedTypesAndPositions(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, posPredicate: Predicate<BlockPos>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_30957(typePredicate, posPredicate, pos, radius, occupationStatus)
/**
 * method_26339
 */
fun PointOfInterestStorage.hasTypeAt(type: RegistryKey<PointOfInterestType>, pos: BlockPos) = this.method_26339(type, pos)
/**
 * method_22383
 */
fun PointOfInterestStorage.getInSquare(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_22383(typePredicate, pos, radius, occupationStatus)
/**
 * method_20005
 */
fun PointOfInterestStorage.getPosition(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, positionPredicate: Predicate<BlockPos>, occupationStatus: net.minecraft.class_4153.class_4155, pos: BlockPos, radius: Int, random: Random) = this.method_20005(typePredicate, positionPredicate, occupationStatus, pos, radius, random)
/**
 * method_34712
 */
fun PointOfInterestStorage.getNearestPosition(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, posPredicate: Predicate<BlockPos>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_34712(typePredicate, posPredicate, pos, radius, occupationStatus)
/**
 * method_19116
 */
fun PointOfInterestStorage.test(pos: BlockPos, predicate: Predicate<RegistryEntry<PointOfInterestType>>) = this.method_19116(pos, predicate)
/**
 * method_35155
 */
fun PointOfInterestStorage.getFreeTickets(pos: BlockPos) = this.method_35155(pos)
/**
 * method_19127
 */
fun PointOfInterestStorage.getPosition(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, posPredicate: Predicate<BlockPos>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_19127(typePredicate, posPredicate, pos, radius, occupationStatus)
/**
 * method_19510
 */
fun PointOfInterestStorage.initForPalette(sectionPos: ChunkSectionPos, chunkSection: ChunkSection) = this.method_19510(sectionPos, chunkSection)
/**
 * method_21647
 */
fun PointOfInterestStorage.getPositions(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, posPredicate: Predicate<BlockPos>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_21647(typePredicate, posPredicate, pos, radius, occupationStatus)
/**
 * method_19123
 */
fun PointOfInterestStorage.getInChunk(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, chunkPos: ChunkPos, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_19123(typePredicate, chunkPos, occupationStatus)
/**
 * method_19115
 */
fun PointOfInterestStorage.add(pos: BlockPos, type: RegistryEntry<PointOfInterestType>) = this.method_19115(pos, type)
/**
 * method_19126
 */
fun PointOfInterestStorage.getPosition(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, posPredicate: BiPredicate<RegistryEntry<PointOfInterestType>, BlockPos>, pos: BlockPos, radius: Int) = this.method_19126(typePredicate, posPredicate, pos, radius)
/**
 * method_43983
 */
fun PointOfInterestStorage.getTypesAndPositions(typePredicate: Predicate<RegistryEntry<PointOfInterestType>>, posPredicate: Predicate<BlockPos>, pos: BlockPos, radius: Int, occupationStatus: net.minecraft.class_4153.class_4155) = this.method_43983(typePredicate, posPredicate, pos, radius, occupationStatus)
