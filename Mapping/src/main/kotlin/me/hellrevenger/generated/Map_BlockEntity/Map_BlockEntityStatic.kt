package me.hellrevenger.generated.Map_BlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockEntityKt {
    /**
     * method_59894
     */
    fun tryParseCustomName(json: String?, registries: net.minecraft.class_7225.class_7874?) = BlockEntity.method_59894(json, registries)
    /**
     * method_38238
     */
    fun writeIdToNbt(nbt: NbtCompound?, type: BlockEntityType<*>?) = BlockEntity.method_38238(nbt, type)
    /**
     * method_38239
     */
    fun posFromNbt(nbt: NbtCompound?) = BlockEntity.method_38239(nbt)
    /**
     * method_11005
     */
    fun createFromNbt(pos: BlockPos?, state: BlockState?, nbt: NbtCompound?, registries: net.minecraft.class_7225.class_7874?) = BlockEntity.method_11005(pos, state, nbt, registries)
}