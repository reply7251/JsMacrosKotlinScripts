package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ModelTransformationMode

val ModelTransformationMode.FROM_INDEX by aliasStatic(ModelTransformationMode::field_42469)
val ModelTransformationMode.THIRD_PERSON_LEFT_HAND by aliasEnum(ModelTransformationMode::class, "field_4323")
val ModelTransformationMode.FIRST_PERSON_RIGHT_HAND by aliasEnum(ModelTransformationMode::class, "field_4322")
val ModelTransformationMode.FIRST_PERSON_LEFT_HAND by aliasEnum(ModelTransformationMode::class, "field_4321")
val ModelTransformationMode.THIRD_PERSON_RIGHT_HAND by aliasEnum(ModelTransformationMode::class, "field_4320")
val ModelTransformationMode.FIXED by aliasEnum(ModelTransformationMode::class, "field_4319")
val ModelTransformationMode.GROUND by aliasEnum(ModelTransformationMode::class, "field_4318")
val ModelTransformationMode.GUI by aliasEnum(ModelTransformationMode::class, "field_4317")
val ModelTransformationMode.HEAD by aliasEnum(ModelTransformationMode::class, "field_4316")
val ModelTransformationMode.NONE by aliasEnum(ModelTransformationMode::class, "field_4315")
fun ModelTransformationMode.isFirstPerson() = this.method_29998()
