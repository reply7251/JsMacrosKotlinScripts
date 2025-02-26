package me.hellrevenger.generated.Map_Chunk
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_44632
 */
val KClass<Chunk>.MISSING_SECTION by aliasStatic(Chunk::field_44632)
/**
 * method_12002
 */
fun Chunk.addEntity(arg0: Entity) = this.method_12002(arg0)
/**
 * method_12034
 */
fun Chunk.setStructureStarts(arg0: Map<Structure, StructureStart>) = this.method_12034(arg0)
/**
 * method_60791
 */
fun Chunk.isSectionEmpty(arg0: Int) = this.method_60791(arg0)
/**
 * method_20598
 */
fun Chunk.getPackedBlockEntityNbt(arg0: BlockPos, arg1: net.minecraft.class_7225.class_7874) = this.method_20598(arg0, arg1)
/**
 * method_12039
 */
fun Chunk.markBlockForPostProcessing(arg0: BlockPos) = this.method_12039(arg0)
/**
 * method_38255
 */
fun Chunk.getOrCreateChunkNoiseSampler(arg0: function_Function<Chunk, ChunkNoiseSampler>) = this.method_38255(arg0)
/**
 * method_39461
 */
fun Chunk.hasBelowZeroRetrogen() = this.method_39461()
/**
 * method_12029
 */
fun Chunk.markBlockForPostProcessing(arg0: Short, arg1: Int) = this.method_12029(arg0, arg1)
/**
 * method_12042
 */
fun Chunk.addPendingBlockEntityNbt(arg0: NbtCompound) = this.method_12042(arg0)
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
fun Chunk.setLightOn(arg0: Boolean) = this.method_12020(arg0)
/**
 * method_12016
 */
fun Chunk.getStructureStarts() = this.method_12016()
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
fun Chunk.setInhabitedTime(arg0: Long) = this.method_12028(arg0)
/**
 * method_12003
 */
fun Chunk.getUpgradeData() = this.method_12003()
/**
 * method_12010
 */
fun Chunk.setBlockState(arg0: BlockPos, arg1: BlockState, arg2: Boolean) = this.method_12010(arg0, arg1, arg2)
/**
 * method_39299
 */
fun Chunk.getBlendingData() = this.method_39299()
/**
 * method_32914
 */
fun Chunk.getGameEventDispatcher(arg0: Int) = this.method_32914(arg0)
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
fun Chunk.setBlockEntity(arg0: BlockEntity) = this.method_12007(arg0)
/**
 * method_12032
 */
fun Chunk.getHeightmap(arg0: net.minecraft.class_2902.class_2903) = this.method_12032(arg0)
/**
 * method_39295
 */
fun Chunk.hasHeightmap(arg0: net.minecraft.class_2902.class_2903) = this.method_39295(arg0)
/**
 * method_39294
 */
fun Chunk.setBlendingData(arg0: BlendingData) = this.method_39294(arg0)
/**
 * method_38871
 */
fun Chunk.hasStructureReferences() = this.method_38871()
/**
 * method_44214
 */
fun Chunk.getOrCreateGenerationSettings(arg0: Supplier<GenerationSettings>) = this.method_44214(arg0)
/**
 * method_12037
 */
fun Chunk.setHeightmap(arg0: net.minecraft.class_2902.class_2903, arg1: LongArray) = this.method_12037(arg0, arg1)
/**
 * method_12013
 */
fun Chunk.getBlockTickScheduler() = this.method_12013()
/**
 * method_51525
 */
fun Chunk.forEachBlockMatchingPredicate(arg0: Predicate<BlockState>, arg1: BiConsumer<BlockPos, BlockState>) = this.method_51525(arg0, arg1)
/**
 * method_39297
 */
fun Chunk.usesOldNoise() = this.method_39297()
/**
 * method_12005
 */
fun Chunk.sampleHeightmap(arg0: net.minecraft.class_2902.class_2903, arg1: Int, arg2: Int) = this.method_12005(arg0, arg1, arg2)
/**
 * method_12040
 */
fun Chunk.getHighestNonEmptySection() = this.method_12040()
/**
 * method_12041
 */
fun Chunk.removeBlockEntity(arg0: BlockPos) = this.method_12041(arg0)
/**
 * method_38259
 */
fun Chunk.getSection(arg0: Int) = this.method_38259(arg0)
/**
 * method_12009
 */
fun Chunk.getStatus() = this.method_12009()
/**
 * method_12008
 */
fun Chunk.setNeedsSaving(arg0: Boolean) = this.method_12008(arg0)
/**
 * method_38257
 */
fun Chunk.populateBiomes(arg0: BiomeSupplier, arg1: net.minecraft.class_6544.class_6552) = this.method_38257(arg0, arg1)
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
fun Chunk.areSectionsEmptyBetween(arg0: Int, arg1: Int) = this.method_12228(arg0, arg1)
/**
 * method_12006
 */
fun Chunk.getSectionArray() = this.method_12006()
/**
 * method_12024
 */
fun Chunk.getBlockEntityNbt(arg0: BlockPos) = this.method_12024(arg0)
/**
 * method_12026
 */
fun KClass<Chunk>.getList(arg0: Array<ShortList>, arg1: Int) = Chunk.method_12026(arg0, arg1)
/**
 * method_12031
 */
fun Chunk.getHighestNonEmptySectionYOffset() = this.method_12031()
/**
 * method_39296
 */
fun Chunk.getTickSchedulers() = this.method_39296()
/**
 * method_51522
 */
fun Chunk.refreshSurfaceY() = this.method_51522()
/**
 * method_38870
 */
fun Chunk.increaseInhabitedTime(arg0: Long) = this.method_38870(arg0)
