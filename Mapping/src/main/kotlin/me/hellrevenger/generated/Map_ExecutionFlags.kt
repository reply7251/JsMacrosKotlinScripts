package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ExecutionFlags

val ExecutionFlags.NONE by aliasStatic(ExecutionFlags::field_47160)
fun ExecutionFlags.isSilent() = this.method_54884()
fun ExecutionFlags.setSilent() = this.method_54886()
fun ExecutionFlags.setInsideReturnRun() = this.method_54888()
fun ExecutionFlags.isInsideReturnRun() = this.method_54887()
fun ExecutionFlags.flags() = this.comp_2020()
