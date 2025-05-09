package me.hellrevenger.generated.Map_DimensionType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DimensionTypeKt {
    /**
     * field_28135
     */
    val MAX_COLUMN_HEIGHT by aliasStatic(DimensionType::field_28135)
    /**
     * field_24752
     */
    val MOON_SIZES by aliasStatic(DimensionType::field_24752)
    /**
     * field_28133
     */
    val SIZE_BITS_Y by aliasStatic(DimensionType::field_28133)
    /**
     * field_28136
     */
    val MIN_HEIGHT by aliasStatic(DimensionType::field_28136)
    /**
     * field_28134
     */
    val MAX_HEIGHT by aliasStatic(DimensionType::field_28134)
    /**
     * method_31109
     */
    fun getCoordinateScaleFactor(fromDimension: DimensionType, toDimension: DimensionType) = DimensionType.method_31109(fromDimension, toDimension)
    /**
     * method_28521
     */
    fun worldFromDimensionNbt(nbt: Dynamic<*>) = DimensionType.method_28521(nbt)
    /**
     * method_12488
     */
    fun getSaveDirectory(worldRef: RegistryKey<world_World>, worldDirectory: file_Path) = DimensionType.method_12488(worldRef, worldDirectory)
}