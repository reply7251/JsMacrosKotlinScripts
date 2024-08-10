package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StructurePlacement

val StructurePlacement.TYPE_CODEC by aliasStatic(StructurePlacement::field_36428)
fun StructurePlacement.applyExclusionZone(arg0: StructurePlacementCalculator, arg1: Int, arg2: Int) = this.method_56576(arg0, arg1, arg2)
fun StructurePlacement.getType() = this.method_40166()
fun StructurePlacement.getLocatePos(arg0: ChunkPos) = this.method_41636(arg0)
fun StructurePlacement.applyFrequencyReduction(arg0: Int, arg1: Int, arg2: Long) = this.method_56575(arg0, arg1, arg2)
fun StructurePlacement.shouldGenerate(arg0: StructurePlacementCalculator, arg1: Int, arg2: Int) = this.method_41639(arg0, arg1, arg2)
