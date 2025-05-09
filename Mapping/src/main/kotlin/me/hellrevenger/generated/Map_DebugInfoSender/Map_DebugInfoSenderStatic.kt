package me.hellrevenger.generated.Map_DebugInfoSender
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DebugInfoSenderKt {
    /**
     * method_19775
     */
    fun sendChunkWatchingChange(world: ServerWorld, pos: ChunkPos) = DebugInfoSender.method_19775(world, pos)
    /**
     * method_19472
     */
    fun sendNeighborUpdate(world: world_World, pos: BlockPos) = DebugInfoSender.method_19472(world, pos)
    /**
     * method_19474
     */
    fun sendStructureStart(world: StructureWorldAccess, structureStart: StructureStart) = DebugInfoSender.method_19474(world, structureStart)
    /**
     * method_19470
     */
    fun sendPathfindingData(world: world_World, mob: MobEntity, path: Path, nodeReachProximity: Float) = DebugInfoSender.method_19470(world, mob, path, nodeReachProximity)
    /**
     * method_23855
     */
    fun sendBeeDebugData(bee: BeeEntity) = DebugInfoSender.method_23855(bee)
    /**
     * method_33139
     */
    fun sendGameEvent(world: world_World, event: RegistryEntry<GameEvent>, pos: Vec3d) = DebugInfoSender.method_33139(world, event, pos)
    /**
     * method_19776
     */
    fun sendPoiAddition(world: ServerWorld, pos: BlockPos) = DebugInfoSender.method_19776(world, pos)
    /**
     * method_19777
     */
    fun sendPoiRemoval(world: ServerWorld, pos: BlockPos) = DebugInfoSender.method_19777(world, pos)
    /**
     * method_23856
     */
    fun sendBeehiveDebugData(world: world_World, pos: BlockPos, state: BlockState, blockEntity: BeehiveBlockEntity) = DebugInfoSender.method_23856(world, pos, state, blockEntity)
    /**
     * method_54909
     */
    fun sendBreezeDebugData(breeze: BreezeEntity) = DebugInfoSender.method_54909(breeze)
    /**
     * method_19778
     */
    fun sendPointOfInterest(world: ServerWorld, pos: BlockPos) = DebugInfoSender.method_19778(world, pos)
    /**
     * method_19469
     */
    fun sendGoalSelector(world: world_World, mob: MobEntity, goalSelector: GoalSelector) = DebugInfoSender.method_19469(world, mob, goalSelector)
    /**
     * method_22317
     */
    fun clearGameTestMarkers(world: ServerWorld) = DebugInfoSender.method_22317(world)
    /**
     * method_61218
     */
    fun sendRedstoneUpdateOrder(world: world_World, payload: DebugRedstoneUpdateOrderCustomPayload) = DebugInfoSender.method_61218(world, payload)
    /**
     * method_33140
     */
    fun sendGameEventListener(world: world_World, eventListener: GameEventListener) = DebugInfoSender.method_33140(world, eventListener)
    /**
     * method_20575
     */
    fun sendRaids(server: ServerWorld, raids: Collection<Raid>) = DebugInfoSender.method_20575(server, raids)
    /**
     * method_22318
     */
    fun addGameTestMarker(world: ServerWorld, pos: BlockPos, message: String, color: Int, duration: Int) = DebugInfoSender.method_22318(world, pos, message, color, duration)
    /**
     * method_19774
     */
    fun sendBrainDebugData(living: LivingEntity) = DebugInfoSender.method_19774(living)
}