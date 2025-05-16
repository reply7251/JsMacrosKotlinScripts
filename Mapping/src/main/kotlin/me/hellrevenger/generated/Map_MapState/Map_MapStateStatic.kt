package me.hellrevenger.generated.Map_MapState
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MapStateKt {
    /**
     * field_31831
     */
    val MAX_SCALE by aliasStatic(MapState::field_31831)
    /**
     * field_33991
     */
    val MAX_DECORATIONS by aliasStatic(MapState::field_33991)
    /**
     * method_52611
     */
    fun getPersistentStateType() = MapState.method_52611()
    /**
     * method_32362
     */
    fun of(scale: Byte, locked: Boolean, dimension: RegistryKey<world_World>?) = MapState.method_32362(scale, locked, dimension)
    /**
     * method_32363
     */
    fun of(centerX: Double, arg1: Double, centerZ: Byte, arg3: Boolean, scale: Boolean, showDecorations: RegistryKey<world_World>?) = MapState.method_32363(centerX, arg1, centerZ, arg3, scale, showDecorations)
    /**
     * method_110
     */
    fun addDecorationsNbt(stack: ItemStack?, pos: BlockPos?, id: String?, decorationType: RegistryEntry<MapDecorationType>?) = MapState.method_110(stack, pos, id, decorationType)
    /**
     * method_32371
     */
    fun fromNbt(nbt: NbtCompound?, registries: net.minecraft.class_7225.class_7874?) = MapState.method_32371(nbt, registries)
}