package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NbtTreeNode

fun KClass<NbtTreeNode>.createRoot() = NbtTreeNode.method_40060()
fun NbtTreeNode.isTypeEqual(arg0: NbtType<*>, arg1: String) = this.method_40061(arg0, arg1)
fun NbtTreeNode.add(arg0: NbtScanQuery) = this.method_39881(arg0)
fun NbtTreeNode.depth() = this.comp_315()
fun NbtTreeNode.fieldsToRecurse() = this.comp_317()
fun NbtTreeNode.selectedFields() = this.comp_323()
