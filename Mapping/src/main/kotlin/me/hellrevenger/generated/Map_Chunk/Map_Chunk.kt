package me.hellrevenger.generated.Map_Chunk
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_12002
 */
fun Chunk.addEntity(entity: Entity) = this.method_12002(entity)
/**
 * method_12034
 */
fun Chunk.setStructureStarts(structureStarts: Map<Structure, StructureStart>) = this.method_12034(structureStarts)
/**
 * method_60791
 */
fun Chunk.isSectionEmpty(sectionCoord: Int) = this.method_60791(sectionCoord)
/**
 * method_20598
 */
fun Chunk.getPackedBlockEntityNbt(pos: BlockPos, registries: net.minecraft.class_7225.class_7874) = this.method_20598(pos, registries)
/**
 * method_12039
 */
fun Chunk.markBlockForPostProcessing(pos: BlockPos) = this.method_12039(pos)
/**
 * method_38255
 */
fun Chunk.getOrCreateChunkNoiseSampler(chunkNoiseSamplerCreator: function_Function<Chunk, ChunkNoiseSampler>) = this.method_38255(chunkNoiseSamplerCreator)
/**
 * method_39461
 */
fun Chunk.hasBelowZeroRetrogen() = this.method_39461()
/**
 * method_12042
 */
fun Chunk.addPendingBlockEntityNbt(nbt: NbtCompound) = this.method_12042(nbt)
/**
 * method_12038
 */
fun Chunk.isLightOn() = this.method_12038()
/**
 * method_39300
 */
fun Chunk.getBelowZeroRetrogen() = this.method_39300()
/**
 * method_12021
 */
fun Chunk.getBlockEntityPositions() = this.method_12021()
/**
 * method_12020
 */
fun Chunk.setLightOn(lightOn: Boolean) = this.method_12020(lightOn)
/**
 * method_12016
 */
fun Chunk.getStructureStarts() = this.method_12016()
/**
 * method_65063
 */
fun Chunk.markNeedsSaving() = this.method_65063()
/**
 * method_12029
 */
fun Chunk.markBlocksForPostProcessing(packedPositions: ShortList, index: Int) = this.method_12029(packedPositions, index)
/**
 * method_12044
 */
fun Chunk.needsSaving() = this.method_12044()
/**
 * method_51526
 */
fun Chunk.getMaxStatus() = this.method_51526()
/**
 * method_12028
 */
fun Chunk.setInhabitedTime(inhabitedTime: Long) = this.method_12028(inhabitedTime)
/**
 * method_12003
 */
fun Chunk.getUpgradeData() = this.method_12003()
/**
 * method_12010
 */
fun Chunk.setBlockState(pos: BlockPos, state: BlockState, moved: Boolean) = this.method_12010(pos, state, moved)
/**
 * method_39299
 */
fun Chunk.getBlendingData() = this.method_39299()
/**
 * method_32914
 */
fun Chunk.getGameEventDispatcher(ySectionCoord: Int) = this.method_32914(ySectionCoord)
/**
 * method_12033
 */
fun Chunk.getInhabitedTime() = this.method_12033()
/**
 * method_12012
 */
fun Chunk.getPostProcessingLists() = this.method_12012()
/**
 * method_12004
 */
fun Chunk.getPos() = this.method_12004()
/**
 * method_12007
 */
fun Chunk.setBlockEntity(blockEntity: BlockEntity) = this.method_12007(blockEntity)
/**
 * method_12032
 */
fun Chunk.getHeightmap(type: net.minecraft.class_2902.class_2903) = this.method_12032(type)
/**
 * method_39295
 */
fun Chunk.hasHeightmap(type: net.minecraft.class_2902.class_2903) = this.method_39295(type)
/**
 * method_38871
 */
fun Chunk.hasStructureReferences() = this.method_38871()
/**
 * method_44214
 */
fun Chunk.getOrCreateGenerationSettings(generationSettingsCreator: Supplier<GenerationSettings>) = this.method_44214(generationSettingsCreator)
/**
 * method_12037
 */
fun Chunk.setHeightmap(type: net.minecraft.class_2902.class_2903, heightmap: LongArray) = this.method_12037(type, heightmap)
/**
 * method_12013
 */
fun Chunk.getBlockTickScheduler() = this.method_12013()
/**
 * method_51525
 */
fun Chunk.forEachBlockMatchingPredicate(predicate: Predicate<BlockState>, consumer: BiConsumer<BlockPos, BlockState>) = this.method_51525(predicate, consumer)
/**
 * method_39297
 */
fun Chunk.usesOldNoise() = this.method_39297()
/**
 * method_39296
 */
fun Chunk.getTickSchedulers(time: Long) = this.method_39296(time)
/**
 * method_12005
 */
fun Chunk.sampleHeightmap(type: net.minecraft.class_2902.class_2903, x: Int, z: Int) = this.method_12005(type, x, z)
/**
 * method_12040
 */
fun Chunk.getHighestNonEmptySection() = this.method_12040()
/**
 * method_12041
 */
fun Chunk.removeBlockEntity(pos: BlockPos) = this.method_12041(pos)
/**
 * method_38259
 */
fun Chunk.getSection(yIndex: Int) = this.method_38259(yIndex)
/**
 * method_12009
 */
fun Chunk.getStatus() = this.method_12009()
/**
 * method_38257
 */
fun Chunk.populateBiomes(biomeSupplier: BiomeSupplier, sampler: net.minecraft.class_6544.class_6552) = this.method_38257(biomeSupplier, sampler)
/**
 * method_65069
 */
fun Chunk.isSerializable() = this.method_65069()
/**
 * method_12011
 */
fun Chunk.getHeightmaps() = this.method_12011()
/**
 * method_39460
 */
fun Chunk.getHeightLimitView() = this.method_39460()
/**
 * method_12014
 */
fun Chunk.getFluidTickScheduler() = this.method_12014()
/**
 * method_12228
 */
fun Chunk.areSectionsEmptyBetween(lowerHeight: Int, upperHeight: Int) = this.method_12228(lowerHeight, upperHeight)
/**
 * method_12006
 */
fun Chunk.getSectionArray() = this.method_12006()
/**
 * method_12024
 */
fun Chunk.getBlockEntityNbt(pos: BlockPos) = this.method_12024(pos)
/**
 * method_12031
 */
fun Chunk.getHighestNonEmptySectionYOffset() = this.method_12031()
/**
 * method_65064
 */
fun Chunk.tryMarkSaved() = this.method_65064()
/**
 * method_51522
 */
fun Chunk.refreshSurfaceY() = this.method_51522()
/**
 * method_38870
 */
fun Chunk.increaseInhabitedTime(delta: Long) = this.method_38870(delta)
