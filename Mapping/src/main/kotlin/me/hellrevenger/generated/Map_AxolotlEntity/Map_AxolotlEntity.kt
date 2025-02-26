package me.hellrevenger.generated.Map_AxolotlEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30390
 */
val KClass<AxolotlEntity>.BLUE_BABY_CHANCE by aliasStatic(AxolotlEntity::field_30390)
/**
 * field_30388
 */
val KClass<AxolotlEntity>.PLAY_DEAD_TICKS by aliasStatic(AxolotlEntity::field_30388)
/**
 * field_30391
 */
val KClass<AxolotlEntity>.VARIANT_KEY by aliasStatic(AxolotlEntity::field_30391)
/**
 * field_30389
 */
val KClass<AxolotlEntity>.BUFF_RANGE by aliasStatic(AxolotlEntity::field_30389)
/**
 * method_33226
 */
fun AxolotlEntity.isPlayingDead() = this.method_33226()
/**
 * method_33225
 */
fun AxolotlEntity.getVariant() = this.method_33225()
/**
 * method_33231
 */
fun AxolotlEntity.setPlayingDead(arg0: Boolean) = this.method_33231(arg0)
/**
 * method_38987
 */
fun KClass<AxolotlEntity>.canSpawn(arg0: EntityType<out LivingEntity>, arg1: ServerWorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = AxolotlEntity.method_38987(arg0, arg1, arg2, arg3, arg4)
/**
 * method_36282
 */
fun AxolotlEntity.hydrateFromPotion() = this.method_36282()
/**
 * method_33227
 */
fun KClass<AxolotlEntity>.createAxolotlAttributes() = AxolotlEntity.method_33227()
/**
 * method_35175
 */
fun KClass<AxolotlEntity>.appreciatePlayer(arg0: AxolotlEntity, arg1: LivingEntity) = AxolotlEntity.method_35175(arg0, arg1)
/**
 * method_33223
 */
fun AxolotlEntity.buffPlayer(arg0: PlayerEntity) = this.method_33223(arg0)
/**
 * method_33219
 */
fun AxolotlEntity.setVariant(arg0: net.minecraft.class_5762.class_5767) = this.method_33219(arg0)
