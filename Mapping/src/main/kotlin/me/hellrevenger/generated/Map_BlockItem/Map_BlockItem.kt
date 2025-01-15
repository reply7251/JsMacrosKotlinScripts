package me.hellrevenger.generated.Map_BlockItem
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<BlockItem>.writeNbtToBlockEntity(arg0: world_World, arg1: PlayerEntity, arg2: BlockPos, arg3: ItemStack) = BlockItem.method_7714(arg0, arg1, arg2, arg3)
fun BlockItem.getPlacementContext(arg0: ItemPlacementContext) = this.method_16356(arg0)
fun KClass<BlockItem>.setBlockEntityData(arg0: ItemStack, arg1: BlockEntityType<*>, arg2: NbtCompound) = BlockItem.method_57338(arg0, arg1, arg2)
fun BlockItem.appendBlocks(arg0: Map<Block, Item>, arg1: Item) = this.method_7713(arg0, arg1)
fun BlockItem.place(arg0: ItemPlacementContext) = this.method_7712(arg0)
fun BlockItem.getBlock() = this.method_7711()
