package me.hellrevenger.generated.Map_DebugInfoSender
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<DebugInfoSender>.sendChunkWatchingChange(arg0: ServerWorld, arg1: ChunkPos) = DebugInfoSender.method_19775(arg0, arg1)
fun KClass<DebugInfoSender>.sendNeighborUpdate(arg0: world_World, arg1: BlockPos) = DebugInfoSender.method_19472(arg0, arg1)
fun KClass<DebugInfoSender>.sendPathfindingData(arg0: world_World, arg1: MobEntity, arg2: Path, arg3: Float) = DebugInfoSender.method_19470(arg0, arg1, arg2, arg3)
fun KClass<DebugInfoSender>.sendStructureStart(arg0: StructureWorldAccess, arg1: StructureStart) = DebugInfoSender.method_19474(arg0, arg1)
fun KClass<DebugInfoSender>.sendBeeDebugData(arg0: BeeEntity) = DebugInfoSender.method_23855(arg0)
fun KClass<DebugInfoSender>.sendGameEvent(arg0: world_World, arg1: RegistryEntry<GameEvent>, arg2: Vec3d) = DebugInfoSender.method_33139(arg0, arg1, arg2)
fun KClass<DebugInfoSender>.sendPoiAddition(arg0: ServerWorld, arg1: BlockPos) = DebugInfoSender.method_19776(arg0, arg1)
fun KClass<DebugInfoSender>.sendPoiRemoval(arg0: ServerWorld, arg1: BlockPos) = DebugInfoSender.method_19777(arg0, arg1)
fun KClass<DebugInfoSender>.sendBeehiveDebugData(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: BeehiveBlockEntity) = DebugInfoSender.method_23856(arg0, arg1, arg2, arg3)
fun KClass<DebugInfoSender>.sendBreezeDebugData(arg0: BreezeEntity) = DebugInfoSender.method_54909(arg0)
fun KClass<DebugInfoSender>.sendPointOfInterest(arg0: ServerWorld, arg1: BlockPos) = DebugInfoSender.method_19778(arg0, arg1)
fun KClass<DebugInfoSender>.sendGoalSelector(arg0: world_World, arg1: MobEntity, arg2: GoalSelector) = DebugInfoSender.method_19469(arg0, arg1, arg2)
fun KClass<DebugInfoSender>.clearGameTestMarkers(arg0: ServerWorld) = DebugInfoSender.method_22317(arg0)
fun KClass<DebugInfoSender>.sendGameEventListener(arg0: world_World, arg1: GameEventListener) = DebugInfoSender.method_33140(arg0, arg1)
fun KClass<DebugInfoSender>.sendRaids(arg0: ServerWorld, arg1: Collection<Raid>) = DebugInfoSender.method_20575(arg0, arg1)
fun KClass<DebugInfoSender>.sendBrainDebugData(arg0: LivingEntity) = DebugInfoSender.method_19774(arg0)
fun KClass<DebugInfoSender>.addGameTestMarker(arg0: ServerWorld, arg1: BlockPos, arg2: String, arg3: Int, arg4: Int) = DebugInfoSender.method_22318(arg0, arg1, arg2, arg3, arg4)
