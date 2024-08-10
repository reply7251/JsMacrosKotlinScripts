package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.JigsawBlockEntity

val JigsawBlockEntity.POOL_KEY by aliasStatic(JigsawBlockEntity::field_31344)
val JigsawBlockEntity.NAME_KEY by aliasStatic(JigsawBlockEntity::field_31346)
val JigsawBlockEntity.SELECTION_PRIORITY_KEY by aliasStatic(JigsawBlockEntity::field_47097)
val JigsawBlockEntity.TARGET_KEY by aliasStatic(JigsawBlockEntity::field_31343)
val JigsawBlockEntity.FINAL_STATE_KEY by aliasStatic(JigsawBlockEntity::field_31347)
val JigsawBlockEntity.JOINT_KEY by aliasStatic(JigsawBlockEntity::field_31345)
val JigsawBlockEntity.PLACEMENT_PRIORITY_KEY by aliasStatic(JigsawBlockEntity::field_47096)
fun JigsawBlockEntity.toUpdatePacket() = this.method_38248()
fun JigsawBlockEntity.setTarget(arg0: Identifier) = this.method_16378(arg0)
fun JigsawBlockEntity.setPool(arg0: RegistryKey<StructurePool>) = this.method_26398(arg0)
fun JigsawBlockEntity.setJoint(arg0: net.minecraft.class_3751.class_4991) = this.method_26396(arg0)
fun JigsawBlockEntity.setPlacementPriority(arg0: Int) = this.method_54775(arg0)
fun JigsawBlockEntity.setName(arg0: Identifier) = this.method_16379(arg0)
fun JigsawBlockEntity.setFinalState(arg0: String) = this.method_16377(arg0)
fun JigsawBlockEntity.generate(arg0: ServerWorld, arg1: Int, arg2: Boolean) = this.method_27191(arg0, arg1, arg2)
fun JigsawBlockEntity.setSelectionPriority(arg0: Int) = this.method_54776(arg0)
