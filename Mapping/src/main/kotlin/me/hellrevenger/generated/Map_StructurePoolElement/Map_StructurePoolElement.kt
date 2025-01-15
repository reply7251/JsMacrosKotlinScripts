package me.hellrevenger.generated.Map_StructurePoolElement
import kotlin.reflect.*
import me.hellrevenger.generated.*
import java.util.function.Function

fun KClass<StructurePoolElement>.ofProcessedSingle(arg0: String, arg1: RegistryEntry<StructureProcessorList>, arg2: StructureLiquidSettings) = StructurePoolElement.method_61016(arg0, arg1, arg2)
fun KClass<StructurePoolElement>.ofProcessedSingle(arg0: String, arg1: RegistryEntry<StructureProcessorList>) = StructurePoolElement.method_30435(arg0, arg1)
fun KClass<StructurePoolElement>.ofSingle(arg0: String) = StructurePoolElement.method_30434(arg0)
fun StructurePoolElement.getBoundingBox(arg0: StructureTemplateManager, arg1: BlockPos, arg2: BlockRotation) = this.method_16628(arg0, arg1, arg2)
fun StructurePoolElement.setProjection(arg0: net.minecraft.class_3785.class_3786) = this.method_16622(arg0)
fun StructurePoolElement.getStart(arg0: StructureTemplateManager, arg1: BlockRotation) = this.method_16601(arg0, arg1)
fun StructurePoolElement.generate(arg0: StructureTemplateManager, arg1: StructureWorldAccess, arg2: StructureAccessor, arg3: ChunkGenerator, arg4: BlockPos, arg5: BlockPos, arg6: BlockRotation, arg7: BlockBox, arg8: Random, arg9: StructureLiquidSettings, arg10: Boolean) = this.method_16626(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
fun KClass<StructurePoolElement>.ofEmpty() = StructurePoolElement.method_30438()
fun KClass<StructurePoolElement>.ofProcessedLegacySingle(arg0: String, arg1: RegistryEntry<StructureProcessorList>) = StructurePoolElement.method_30426(arg0, arg1)
fun StructurePoolElement.getProjection() = this.method_16624()
fun KClass<StructurePoolElement>.ofSingle(arg0: String, arg1: StructureLiquidSettings) = StructurePoolElement.method_61014(arg0, arg1)
fun StructurePoolElement.getType() = this.method_16757()
fun StructurePoolElement.getGroundLevelDelta() = this.method_19308()
fun KClass<StructurePoolElement>.ofFeature(arg0: RegistryEntry<PlacedFeature>) = StructurePoolElement.method_30421(arg0)
fun KClass<StructurePoolElement>.ofLegacySingle(arg0: String) = StructurePoolElement.method_30425(arg0)
fun StructurePoolElement.getStructureBlockInfos(arg0: StructureTemplateManager, arg1: BlockPos, arg2: BlockRotation, arg3: Random) = this.method_16627(arg0, arg1, arg2, arg3)
fun KClass<StructurePoolElement>.ofList(arg0: MutableList<Function<net.minecraft.class_3785.class_3786, out StructurePoolElement>>) = StructurePoolElement.method_30429(arg0)
