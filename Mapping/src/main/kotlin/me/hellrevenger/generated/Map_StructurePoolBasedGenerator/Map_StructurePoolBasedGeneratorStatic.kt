package me.hellrevenger.generated.Map_StructurePoolBasedGenerator
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StructurePoolBasedGeneratorKt {
    /**
     * method_30419
     */
    fun generate(context: net.minecraft.class_3195.class_7149?, structurePool: RegistryEntry<StructurePool>?, id: Optional<Identifier>?, size: Int, pos: BlockPos?, useExpansionHack: Boolean, projectStartToHeightmap: Optional<net.minecraft.class_2902.class_2903>?, maxDistanceFromCenter: Int, aliasLookup: StructurePoolAliasLookup?, dimensionPadding: DimensionPadding?, liquidSettings: StructureLiquidSettings?) = StructurePoolBasedGenerator.method_30419(context, structurePool, id, size, pos, useExpansionHack, projectStartToHeightmap, maxDistanceFromCenter, aliasLookup, dimensionPadding, liquidSettings)
    /**
     * method_43729
     */
    fun generate(world: ServerWorld?, structurePool: RegistryEntry<StructurePool>?, id: Identifier?, size: Int, pos: BlockPos?, keepJigsaws: Boolean) = StructurePoolBasedGenerator.method_43729(world, structurePool, id, size, pos, keepJigsaws)
}