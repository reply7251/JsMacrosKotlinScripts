package me.hellrevenger.generated.Map_blockpredicate_BlockPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*
object blockpredicate_BlockPredicateKt {
    /**
     * method_39584
     */
    fun solid(offset: Vec3i) = blockpredicate_BlockPredicate.method_39584(offset)
    /**
     * method_39586
     */
    fun insideWorldBounds(offset: Vec3i) = blockpredicate_BlockPredicate.method_39586(offset)
    /**
     * method_45543
     */
    fun noFluid(offset: Vec3i) = blockpredicate_BlockPredicate.method_45543(offset)
    /**
     * method_38887
     */
    fun anyOf(predicates: Array<blockpredicate_BlockPredicate>) = blockpredicate_BlockPredicate.method_38887(*predicates)
    /**
     * method_39909
     */
    fun hasSturdyFace(offset: Vec3i, face: Direction) = blockpredicate_BlockPredicate.method_39909(offset, face)
    /**
     * method_39585
     */
    fun solid() = blockpredicate_BlockPredicate.method_39585()
    /**
     * method_39009
     */
    fun wouldSurvive(state: BlockState, offset: Vec3i) = blockpredicate_BlockPredicate.method_39009(state, offset)
    /**
     * method_60285
     */
    fun unobstructed() = blockpredicate_BlockPredicate.method_60285()
    /**
     * method_38878
     */
    fun bothOf(first: blockpredicate_BlockPredicate, second: blockpredicate_BlockPredicate) = blockpredicate_BlockPredicate.method_38878(first, second)
    /**
     * method_43288
     */
    fun matchingBlocks(offset: Vec3i, blocks: Array<Block>) = blockpredicate_BlockPredicate.method_43288(offset, *blocks)
    /**
     * method_38880
     */
    fun allOf(predicates: MutableList<blockpredicate_BlockPredicate>) = blockpredicate_BlockPredicate.method_38880(predicates)
    /**
     * method_38884
     */
    fun eitherOf(first: blockpredicate_BlockPredicate, second: blockpredicate_BlockPredicate) = blockpredicate_BlockPredicate.method_38884(first, second)
    /**
     * method_38881
     */
    fun matchingBlocks(offset: Vec3i, blocks: MutableList<Block>) = blockpredicate_BlockPredicate.method_38881(offset, blocks)
    /**
     * method_38883
     */
    fun replaceable() = blockpredicate_BlockPredicate.method_38883()
    /**
     * method_39010
     */
    fun replaceable(offset: Vec3i) = blockpredicate_BlockPredicate.method_39010(offset)
    /**
     * method_39011
     */
    fun alwaysTrue() = blockpredicate_BlockPredicate.method_39011()
    /**
     * method_43289
     */
    fun matchingFluids(offset: Vec3i, fluids: Array<Fluid>) = blockpredicate_BlockPredicate.method_43289(offset, *fluids)
    /**
     * method_43291
     */
    fun matchingFluids(fluids: Array<Fluid>) = blockpredicate_BlockPredicate.method_43291(*fluids)
    /**
     * method_39908
     */
    fun matchingBlockTag(offset: Vec3i, tag: TagKey<Block>) = blockpredicate_BlockPredicate.method_39908(offset, tag)
    /**
     * method_60284
     */
    fun unobstructed(offset: Vec3i) = blockpredicate_BlockPredicate.method_60284(offset)
    /**
     * method_38885
     */
    fun anyOf(predicates: MutableList<blockpredicate_BlockPredicate>) = blockpredicate_BlockPredicate.method_38885(predicates)
    /**
     * method_39930
     */
    fun hasSturdyFace(face: Direction) = blockpredicate_BlockPredicate.method_39930(face)
    /**
     * method_38877
     */
    fun not(predicate: blockpredicate_BlockPredicate) = blockpredicate_BlockPredicate.method_38877(predicate)
    /**
     * method_38882
     */
    fun allOf(predicates: Array<blockpredicate_BlockPredicate>) = blockpredicate_BlockPredicate.method_38882(*predicates)
    /**
     * method_38886
     */
    fun matchingFluids(offset: Vec3i, fluids: MutableList<Fluid>) = blockpredicate_BlockPredicate.method_38886(offset, fluids)
    /**
     * method_39907
     */
    fun matchingBlockTag(offset: TagKey<Block>) = blockpredicate_BlockPredicate.method_39907(offset)
    /**
     * method_39910
     */
    fun matchingBlocks(blocks: MutableList<Block>) = blockpredicate_BlockPredicate.method_39910(blocks)
    /**
     * method_45544
     */
    fun noFluid() = blockpredicate_BlockPredicate.method_45544()
    /**
     * method_43290
     */
    fun matchingBlocks(blocks: Array<Block>) = blockpredicate_BlockPredicate.method_43290(*blocks)
}