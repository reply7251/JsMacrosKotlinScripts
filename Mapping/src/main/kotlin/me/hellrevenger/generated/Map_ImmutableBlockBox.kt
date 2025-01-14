package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ImmutableBlockBox

fun ImmutableBlockBox.includes(arg0: BlockPos) = this.method_58244(arg0)
fun ImmutableBlockBox.expand(arg0: Direction, arg1: Int) = this.method_58238(arg0, arg1)
fun ImmutableBlockBox.move(arg0: Vec3i) = this.method_58239(arg0)
fun ImmutableBlockBox.getBlockCountZ() = this.method_58246()
fun ImmutableBlockBox.move(arg0: Direction, arg1: Int) = this.method_58242(arg0, arg1)
fun ImmutableBlockBox.getBlockCountY() = this.method_58245()
fun ImmutableBlockBox.getBlockCountX() = this.method_58243()
fun KClass<ImmutableBlockBox>.of(arg0: BlockPos) = ImmutableBlockBox.method_58236(arg0)
fun KClass<ImmutableBlockBox>.of(arg0: BlockPos, arg1: BlockPos) = ImmutableBlockBox.method_58237(arg0, arg1)
fun ImmutableBlockBox.encompass(arg0: BlockPos) = this.method_58241(arg0)
fun ImmutableBlockBox.isSingleBlock() = this.method_58235()
fun ImmutableBlockBox.enclosingBox() = this.method_58240()
fun ImmutableBlockBox.min() = this.comp_2466()
fun ImmutableBlockBox.max() = this.comp_2467()
