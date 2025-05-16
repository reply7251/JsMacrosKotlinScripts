package me.hellrevenger.generated.Map_StructurePools
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StructurePoolsKt {
    /**
     * field_26254
     */
    val EMPTY by aliasStatic(StructurePools::field_26254)
    /**
     * method_30600
     */
    fun register(structurePoolsRegisterable: Registerable<StructurePool>?, id: String?, pool: StructurePool?) = StructurePools.method_30600(structurePoolsRegisterable, id, pool)
    /**
     * method_30599
     */
    fun bootstrap(structurePoolsRegisterable: Registerable<StructurePool>?) = StructurePools.method_30599(structurePoolsRegisterable)
    /**
     * method_60923
     */
    fun of(id: String?) = StructurePools.method_60923(id)
    /**
     * method_46844
     */
    fun ofVanilla(id: String?) = StructurePools.method_46844(id)
    /**
     * method_64955
     */
    fun of(id: Identifier?) = StructurePools.method_64955(id)
}