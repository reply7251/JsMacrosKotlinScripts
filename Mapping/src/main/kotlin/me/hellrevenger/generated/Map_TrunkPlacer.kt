package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TrunkPlacer

val TrunkPlacer.TYPE_CODEC by aliasStatic(TrunkPlacer::field_24972)
fun TrunkPlacer.getHeight(arg0: Random) = this.method_26993(arg0)
fun TrunkPlacer.generate(arg0: TestableWorld, arg1: BiConsumer<BlockPos, BlockState>, arg2: Random, arg3: Int, arg4: BlockPos, arg5: TreeFeatureConfig) = this.method_26991(arg0, arg1, arg2, arg3, arg4, arg5)
fun TrunkPlacer.canReplaceOrIsLog(arg0: TestableWorld, arg1: BlockPos) = this.method_43198(arg0, arg1)
