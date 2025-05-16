package me.hellrevenger.generated.Map_LargeEntitySpawnHelper
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LargeEntitySpawnHelperKt {
    /**
     * method_42122
     */
    fun <T>trySpawnAt(entityType: EntityType<T>?, reason: SpawnReason?, world: ServerWorld?, pos: BlockPos?, tries: Int, horizontalRange: Int, verticalRange: Int, requirements: net.minecraft.class_7244.class_7502?, requireEmptySpace: Boolean) where T: MobEntity = LargeEntitySpawnHelper.method_42122<T>(entityType, reason, world, pos, tries, horizontalRange, verticalRange, requirements, requireEmptySpace)
}