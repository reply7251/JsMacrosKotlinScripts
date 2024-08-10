package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AxolotlEntity

val AxolotlEntity.BLUE_BABY_CHANCE by aliasStatic(AxolotlEntity::field_30390)
val AxolotlEntity.PLAY_DEAD_TICKS by aliasStatic(AxolotlEntity::field_30388)
val AxolotlEntity.VARIANT_KEY by aliasStatic(AxolotlEntity::field_30391)
val AxolotlEntity.BUFF_RANGE by aliasStatic(AxolotlEntity::field_30389)
fun AxolotlEntity.isPlayingDead() = this.method_33226()
fun AxolotlEntity.getVariant() = this.method_33225()
fun AxolotlEntity.setPlayingDead(arg0: Boolean) = this.method_33231(arg0)
fun KClass<AxolotlEntity>.canSpawn(arg0: EntityType<out LivingEntity>, arg1: ServerWorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = AxolotlEntity.method_38987(arg0, arg1, arg2, arg3, arg4)
fun AxolotlEntity.hydrateFromPotion() = this.method_36282()
fun KClass<AxolotlEntity>.createAxolotlAttributes() = AxolotlEntity.method_33227()
fun KClass<AxolotlEntity>.appreciatePlayer(arg0: AxolotlEntity, arg1: LivingEntity) = AxolotlEntity.method_35175(arg0, arg1)
fun AxolotlEntity.buffPlayer(arg0: PlayerEntity) = this.method_33223(arg0)
fun AxolotlEntity.setVariant(arg0: net.minecraft.class_5762.class_5767) = this.method_33219(arg0)
