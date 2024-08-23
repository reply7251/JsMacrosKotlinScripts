package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SideShapeType

val KClass<SideShapeType>.RIGID by aliasEnum(SideShapeType::class, "field_25824")
val KClass<SideShapeType>.FULL by aliasEnum(SideShapeType::class, "field_25822")
val KClass<SideShapeType>.CENTER by aliasEnum(SideShapeType::class, "field_25823")
fun SideShapeType.matches(arg0: BlockState, arg1: BlockView, arg2: BlockPos, arg3: Direction) = this.method_30367(arg0, arg1, arg2, arg3)
