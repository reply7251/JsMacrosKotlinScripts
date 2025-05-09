package me.hellrevenger.generated.Map_EntityType
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_5896
 */
fun <T>EntityType<T>.isSummonable() where T: Entity = this.method_5896()
/**
 * method_5891
 */
fun <T>EntityType<T>.getSpawnGroup() where T: Entity = this.method_5891()
/**
 * method_19946
 */
fun <T>EntityType<T>.isFireImmune() where T: Entity = this.method_19946()
/**
 * method_40124
 */
fun <T>EntityType<T>.getRegistryEntry() where T: Entity = this.method_40124()
/**
 * method_31488
 */
fun <T>EntityType<T>.downcast(arg0: Entity) where T: Entity = this.method_31488(arg0)
/**
 * method_5899
 */
fun <T>EntityType<T>.spawn(world: ServerWorld, afterConsumer: Consumer<T>, pos: BlockPos, reason: SpawnReason, alignPosition: Boolean, invertY: Boolean) where T: Entity = this.method_5899(world, afterConsumer, pos, reason, alignPosition, invertY)
/**
 * method_16351
 */
fun <T>EntityType<T>.getLootTableKey() where T: Entity = this.method_16351()
/**
 * method_53125
 */
fun <T>EntityType<T>.isIn(entityTypeEntryList: RegistryEntryList<EntityType<*>>) where T: Entity = this.method_53125(entityTypeEntryList)
/**
 * method_17686
 */
fun <T>EntityType<T>.getHeight() where T: Entity = this.method_17686()
/**
 * method_18389
 */
fun <T>EntityType<T>.alwaysUpdateVelocity() where T: Entity = this.method_18389()
/**
 * method_58629
 */
fun <T>EntityType<T>.getSpawnBox(x: Double, arg1: Double, y: Double) where T: Entity = this.method_58629(x, arg1, y)
/**
 * method_5894
 */
fun <T>EntityType<T>.spawnFromItemStack(world: ServerWorld, stack: ItemStack, player: PlayerEntity, pos: BlockPos, spawnReason: SpawnReason, alignPosition: Boolean, invertY: Boolean) where T: Entity = this.method_5894(world, stack, player, pos, spawnReason, alignPosition, invertY)
/**
 * method_5888
 */
fun <T>EntityType<T>.create(world: ServerWorld, afterConsumer: Consumer<T>, pos: BlockPos, reason: SpawnReason, alignPosition: Boolean, invertY: Boolean) where T: Entity = this.method_5888(world, afterConsumer, pos, reason, alignPosition, invertY)
/**
 * method_65893
 */
fun <T>EntityType<T>.canPotentiallyExecuteCommands() where T: Entity = this.method_65893()
/**
 * method_29496
 */
fun <T>EntityType<T>.isInvalidSpawn(state: BlockState) where T: Entity = this.method_29496(state)
/**
 * method_5882
 */
fun <T>EntityType<T>.getTranslationKey() where T: Entity = this.method_5882()
/**
 * method_17685
 */
fun <T>EntityType<T>.getWidth() where T: Entity = this.method_17685()
/**
 * method_18386
 */
fun <T>EntityType<T>.getDimensions() where T: Entity = this.method_18386()
/**
 * method_18387
 */
fun <T>EntityType<T>.getMaxTrackDistance() where T: Entity = this.method_18387()
/**
 * method_35050
 */
fun <T>EntityType<T>.getUntranslatedName() where T: Entity = this.method_35050()
/**
 * method_5893
 */
fun <T>EntityType<T>.isSaveable() where T: Entity = this.method_5893()
/**
 * method_18388
 */
fun <T>EntityType<T>.getTrackTickInterval() where T: Entity = this.method_18388()
/**
 * method_5897
 */
fun <T>EntityType<T>.getName() where T: Entity = this.method_5897()
/**
 * method_20814
 */
fun <T>EntityType<T>.isSpawnableFarFromPlayer() where T: Entity = this.method_20814()
