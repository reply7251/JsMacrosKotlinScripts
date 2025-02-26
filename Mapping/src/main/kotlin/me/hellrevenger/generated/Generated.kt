package me.hellrevenger.generated

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.*

fun <R, T> alias(alias: KProperty1<R, T>) = ReadOnlyProperty<R, T> { thisRef, _ -> alias.get(thisRef) }
fun <R, T> alias(alias: KMutableProperty1<R, T>) = MyReadWriteProperty(alias)
fun <T> aliasStatic(alias: KProperty0<T>) = ReadOnlyStaticProperty(alias)
fun <T> aliasStatic(alias: () -> T) = ReadOnlyStaticProperty(alias)
fun <T> aliasStatic(alias: KMutableProperty0<T>) = ReadOnlyStaticProperty(alias)
fun <T: Any> aliasEnum(type: KClass<T>, name: kotlin.String) = EnumProperty(type, name)

class ReadOnlyStaticProperty<T>(val getter: () -> T) {
    constructor(alias: KProperty0<T>): this(alias as () -> T)

    operator fun <Self> getValue(thisRef: Self, prop: KProperty<*>): T = getter.invoke()
}

class EnumProperty<T : Any>(val type: KClass<T>, val name: kotlin.String) {
    private val ordinal: Int
    init {
        val enums = type.java.enumConstants as kotlin.Array<kotlin.Enum<*>>
        ordinal = enums.first { it.name == name}.ordinal
    }
    operator fun <Self> getValue(thisRef: Self, prop: KProperty<*>): T {
        return type.java.enumConstants[ordinal]
    }
}

class ReadWriteStaticProperty<T>(val alias: KMutableProperty0<T>) {
    operator fun <Self> getValue(thisRef: Self, prop: KProperty<*>): T = alias.get()

    operator fun <Self> setValue(thisRef: Self, property: KProperty<*>, value: T) {
        alias.set(value)
    }
}

class MyReadWriteProperty<R, T>(val alias: KMutableProperty1<R, T>) {
    operator fun getValue(thisRef: R, property: KProperty<*>): T = alias.get(thisRef)

    operator fun setValue(thisRef: R, property: KProperty<*>, value: T) {
        (alias as? KMutableProperty1<R, T>)?.set(thisRef, value)
    }
}
/**
 * net.minecraft.class_2627
 */
typealias ShulkerBoxBlockEntity = net.minecraft.class_2627
/**
 * net.minecraft.class_6626
 */
typealias StructurePiecesCollector = net.minecraft.class_6626
/**
 * net.minecraft.class_7097
 */
typealias WalkTowardsLandTask = net.minecraft.class_7097
/**
 * net.minecraft.class_4622
 */
typealias HoneyBlock = net.minecraft.class_4622
/**
 * net.minecraft.class_9203
 */
typealias VaultConfig = net.minecraft.class_9203
/**
 * net.minecraft.class_823
 */
typealias BannerBlockEntityRenderer = net.minecraft.class_823
/**
 * net.minecraft.class_4238
 */
typealias SoundExecutor = net.minecraft.class_4238
/**
 * net.minecraft.class_3780
 */
typealias JigsawJunction = net.minecraft.class_3780
/**
 * net.minecraft.class_3336
 */
typealias BannedPlayerEntry = net.minecraft.class_3336
/**
 * net.minecraft.class_380
 */
typealias GlyphAtlasTexture = net.minecraft.class_380
/**
 * net.minecraft.class_184
 */
typealias CriterionConditions = net.minecraft.class_184
/**
 * net.minecraft.class_8609
 */
typealias ServerCommonNetworkHandler = net.minecraft.class_8609
/**
 * net.minecraft.class_7495
 */
typealias ServerMetadataS2CPacket = net.minecraft.class_7495
/**
 * org.joml.Matrix4f
 */
typealias Matrix4f = org.joml.Matrix4f
/**
 * net.minecraft.class_8089
 */
typealias TabNavigationWidget = net.minecraft.class_8089
/**
 * com.mojang.authlib.GameProfile
 */
typealias GameProfile = com.mojang.authlib.GameProfile
/**
 * net.minecraft.class_4480
 */
typealias HoneyBottleItem = net.minecraft.class_4480
/**
 * net.minecraft.class_1685
 */
typealias TridentEntity = net.minecraft.class_1685
/**
 * net.minecraft.class_6672
 */
typealias GaussianGenerator = net.minecraft.class_6672
/**
 * net.minecraft.class_9718
 */
typealias DamageImmunityEnchantmentEffect = net.minecraft.class_9718
/**
 * net.minecraft.class_3353
 */
typealias MineshaftGenerator = net.minecraft.class_3353
/**
 * net.minecraft.class_9671
 */
typealias SetItemLootFunction = net.minecraft.class_9671
/**
 * net.minecraft.class_390
 */
typealias Font = net.minecraft.class_390
/**
 * net.minecraft.class_1106
 */
typealias EntityTrackingSoundInstance = net.minecraft.class_1106
/**
 * net.minecraft.class_3218
 */
typealias ServerWorld = net.minecraft.class_3218
/**
 * org.joml.Matrix3f
 */
typealias Matrix3f = org.joml.Matrix3f
/**
 * net.minecraft.class_4341
 */
typealias RealmsClient = net.minecraft.class_4341
/**
 * net.minecraft.class_3864
 */
typealias DefaultBiomeFeatures = net.minecraft.class_3864
/**
 * net.minecraft.class_8244
 */
typealias AppendLootRuleBlockEntityModifier = net.minecraft.class_8244
/**
 * net.minecraft.class_1211
 */
typealias EntityRenameFix = net.minecraft.class_1211
/**
 * net.minecraft.class_5534
 */
typealias FuzzyTargeting = net.minecraft.class_5534
/**
 * net.minecraft.class_8862
 */
typealias CommandFunctionAction<T> = net.minecraft.class_8862<T>
/**
 * net.minecraft.class_9170
 */
typealias RecreatedChunkStorage = net.minecraft.class_9170
/**
 * net.minecraft.class_8053
 */
typealias ArmorTrim = net.minecraft.class_8053
/**
 * net.minecraft.class_6028
 */
typealias FleeTask<E> = net.minecraft.class_6028<E>
/**
 * net.minecraft.class_3408
 */
typealias RconListener = net.minecraft.class_3408
/**
 * net.minecraft.class_8944
 */
typealias LootContextPredicateValidator = net.minecraft.class_8944
/**
 * net.minecraft.class_2436
 */
typealias RedstoneBlock = net.minecraft.class_2436
/**
 * net.minecraft.class_5569
 */
typealias EntityChangeListener = net.minecraft.class_5569
/**
 * net.minecraft.class_3018
 */
typealias EndGatewayFeatureConfig = net.minecraft.class_3018
/**
 * net.minecraft.class_1677
 */
typealias SmallFireballEntity = net.minecraft.class_1677
/**
 * net.minecraft.class_3837
 */
typealias CopyNbtLootFunction = net.minecraft.class_3837
/**
 * net.minecraft.class_4896
 */
typealias CrossbowPosing = net.minecraft.class_4896
/**
 * java.nio.file.FileSystem
 */
typealias FileSystem = java.nio.file.FileSystem
/**
 * net.minecraft.class_9742
 */
typealias EnchantmentProviderType = net.minecraft.class_9742
/**
 * net.minecraft.class_8722
 */
typealias DebugPoiAddedCustomPayload = net.minecraft.class_8722
/**
 * net.minecraft.class_9790
 */
typealias JukeboxPlayablePredicate = net.minecraft.class_9790
/**
 * net.minecraft.class_909
 */
typealias BipedEntityRenderer<T, M> = net.minecraft.class_909<T, M>
/**
 * net.minecraft.class_6417
 */
typealias MacWindowUtil = net.minecraft.class_6417
/**
 * net.minecraft.class_6037
 */
typealias FieldsAreNonnullByDefault2 = net.minecraft.class_6037
/**
 * net.minecraft.class_5154
 */
typealias DeltaFeature = net.minecraft.class_5154
/**
 * net.minecraft.class_9734
 */
typealias SpawnParticlesEnchantmentEffect = net.minecraft.class_9734
/**
 * net.minecraft.class_15
 */
typealias AmphibiousPathNodeMaker = net.minecraft.class_15
/**
 * net.minecraft.class_5551
 */
typealias EndRodBlock = net.minecraft.class_5551
/**
 * net.minecraft.class_8223
 */
typealias RemoveFeatureTogglesFix = net.minecraft.class_8223
/**
 * net.minecraft.class_5463
 */
typealias ConfiguredCarvers = net.minecraft.class_5463
/**
 * net.minecraft.class_9015
 */
typealias ScoreHolder = net.minecraft.class_9015
/**
 * net.minecraft.class_4265
 */
typealias ElementListWidget<E> = net.minecraft.class_4265<E>
/**
 * net.minecraft.class_3532
 */
typealias MathHelper = net.minecraft.class_3532
/**
 * com.mojang.authlib.minecraft.TelemetryPropertyContainer
 */
typealias TelemetryPropertyContainer = com.mojang.authlib.minecraft.TelemetryPropertyContainer
/**
 * net.minecraft.class_8979
 */
typealias GustEmitterParticle = net.minecraft.class_8979
/**
 * net.minecraft.class_1776
 */
typealias EnderPearlItem = net.minecraft.class_1776
/**
 * net.minecraft.class_4410
 */
typealias RealmsCreateWorldScreen = net.minecraft.class_4410
/**
 * net.minecraft.class_824
 */
typealias BlockEntityRenderDispatcher = net.minecraft.class_824
/**
 * net.minecraft.class_4997
 */
typealias StriderEntityModel<T> = net.minecraft.class_4997<T>
/**
 * net.minecraft.class_9104
 */
typealias AnyBlockUseCriterion = net.minecraft.class_9104
/**
 * net.minecraft.class_9462
 */
typealias OminousBottleItem = net.minecraft.class_9462
/**
 * com.mojang.authlib.minecraft.BanDetails
 */
typealias BanDetails = com.mojang.authlib.minecraft.BanDetails
/**
 * net.minecraft.class_1049
 */
typealias ResourceTexture = net.minecraft.class_1049
/**
 * net.minecraft.class_2816
 */
typealias IdListPalette<T> = net.minecraft.class_2816<T>
/**
 * org.lwjgl.util.freetype.FT_Face
 */
typealias FT_Face = org.lwjgl.util.freetype.FT_Face
/**
 * net.minecraft.class_7579
 */
typealias RealmsNewsUpdater = net.minecraft.class_7579
/**
 * net.minecraft.class_8921
 */
typealias TickManager = net.minecraft.class_8921
/**
 * net.minecraft.class_1809
 */
typealias PlayerHeadItem = net.minecraft.class_1809
/**
 * net.minecraft.class_1195
 */
typealias LevelFlatGeneratorInfoFix = net.minecraft.class_1195
/**
 * net.minecraft.class_7688
 */
typealias AmbientStandGoal = net.minecraft.class_7688
/**
 * net.minecraft.class_5355
 */
typealias WalkTowardClosestAdultTask = net.minecraft.class_5355
/**
 * net.minecraft.class_8199
 */
typealias HeightmapArgumentType = net.minecraft.class_8199
/**
 * net.minecraft.class_4208
 */
typealias GlobalPos = net.minecraft.class_4208
/**
 * net.minecraft.class_3866
 */
typealias FurnaceBlockEntity = net.minecraft.class_3866
/**
 * net.minecraft.class_3304
 */
typealias ReloadableResourceManagerImpl = net.minecraft.class_3304
/**
 * net.minecraft.class_2085
 */
typealias LevitationCriterion = net.minecraft.class_2085
/**
 * net.minecraft.class_7099
 */
typealias LayFrogSpawnTask = net.minecraft.class_7099
/**
 * net.minecraft.class_277
 */
typealias GlBlendState = net.minecraft.class_277
/**
 * net.minecraft.class_9721
 */
typealias EnchantmentEntityEffect = net.minecraft.class_9721
/**
 * net.minecraft.class_2491
 */
typealias NbtEnd = net.minecraft.class_2491
/**
 * net.minecraft.class_3542
 */
typealias StringIdentifiable = net.minecraft.class_3542
/**
 * net.minecraft.class_2603
 */
typealias DaylightDetectorBlockEntity = net.minecraft.class_2603
/**
 * net.minecraft.class_3194
 */
typealias ChunkLevelType = net.minecraft.class_3194
/**
 * net.minecraft.class_488
 */
typealias HopperScreen = net.minecraft.class_488
/**
 * net.minecraft.class_340
 */
typealias DebugHud = net.minecraft.class_340
/**
 * net.minecraft.class_1425
 */
typealias SchoolingFishEntity = net.minecraft.class_1425
/**
 * java.util.concurrent.CompletableFuture
 */
typealias CompletableFuture<T> = java.util.concurrent.CompletableFuture<T>
/**
 * net.minecraft.class_3213
 */
typealias ServerBossBar = net.minecraft.class_3213
/**
 * net.minecraft.class_8047
 */
typealias ForgingSlotsManager = net.minecraft.class_8047
/**
 * net.minecraft.class_9710
 */
typealias TargetedEnchantmentEffect<T> = net.minecraft.class_9710<T>
/**
 * net.minecraft.class_4173
 */
typealias ScheduleRule = net.minecraft.class_4173
/**
 * net.minecraft.class_8134
 */
typealias ExperimentsScreen = net.minecraft.class_8134
/**
 * net.minecraft.class_8913
 */
typealias UpdateTickRateS2CPacket = net.minecraft.class_8913
/**
 * net.minecraft.class_418
 */
typealias DeathScreen = net.minecraft.class_418
/**
 * net.minecraft.class_9691
 */
typealias BlockAttachedEntity = net.minecraft.class_9691
/**
 * net.minecraft.class_7090
 */
typealias BlendingDataFix = net.minecraft.class_7090
/**
 * net.minecraft.class_6873
 */
typealias SpreadType = net.minecraft.class_6873
/**
 * net.minecraft.class_5868
 */
typealias HeightContext = net.minecraft.class_5868
/**
 * net.minecraft.class_22
 */
typealias MapState = net.minecraft.class_22
/**
 * net.minecraft.class_8759
 */
typealias TickChart = net.minecraft.class_8759
/**
 * net.minecraft.class_4977
 */
typealias JigsawPropertiesFix = net.minecraft.class_4977
/**
 * java.io.BufferedReader
 */
typealias BufferedReader = java.io.BufferedReader
/**
 * net.minecraft.class_7184
 */
typealias Animation = net.minecraft.class_7184
/**
 * net.minecraft.class_7256
 */
typealias FindRoarTargetTask = net.minecraft.class_7256
/**
 * net.minecraft.class_73
 */
typealias EmptyEntry = net.minecraft.class_73
/**
 * net.minecraft.class_3447
 */
typealias SwampHutGenerator = net.minecraft.class_3447
/**
 * net.minecraft.class_8136
 */
typealias ArmorEntityModel<T> = net.minecraft.class_8136<T>
/**
 * net.minecraft.class_1646
 */
typealias VillagerEntity = net.minecraft.class_1646
/**
 * net.minecraft.class_384
 */
typealias EmptyGlyphRenderer = net.minecraft.class_384
/**
 * net.minecraft.class_4218
 */
typealias PlayWithVillagerBabiesTask = net.minecraft.class_4218
/**
 * net.minecraft.class_2076
 */
typealias KilledByCrossbowCriterion = net.minecraft.class_2076
/**
 * net.minecraft.class_5450
 */
typealias SquarePlacementModifier = net.minecraft.class_5450
/**
 * net.minecraft.class_3330
 */
typealias ServerConfigEntry<T> = net.minecraft.class_3330<T>
/**
 * net.minecraft.class_4829
 */
typealias ForgetAngryAtTargetTask = net.minecraft.class_4829
/**
 * net.minecraft.class_6375
 */
typealias AngledModelEntity = net.minecraft.class_6375
/**
 * net.minecraft.class_1588
 */
typealias HostileEntity = net.minecraft.class_1588
/**
 * net.minecraft.class_372
 */
typealias TutorialToast = net.minecraft.class_372
/**
 * net.minecraft.class_8782
 */
typealias AdvancementRequirements = net.minecraft.class_8782
/**
 * net.minecraft.class_5819
 */
typealias Random = net.minecraft.class_5819
/**
 * net.minecraft.class_6396
 */
typealias SystemDetails = net.minecraft.class_6396
/**
 * net.minecraft.class_4242
 */
typealias CelebrateRaidWinTask = net.minecraft.class_4242
/**
 * net.minecraft.class_1225
 */
typealias Schema1125 = net.minecraft.class_1225
/**
 * net.minecraft.class_4917
 */
typealias BlockStateSupplier = net.minecraft.class_4917
/**
 * net.minecraft.class_6780
 */
typealias BiomeSupplier = net.minecraft.class_6780
/**
 * net.minecraft.class_1258
 */
typealias DoubleInventory = net.minecraft.class_1258
/**
 * net.minecraft.class_7298
 */
typealias AllayEntity = net.minecraft.class_7298
/**
 * net.minecraft.class_5698
 */
typealias GameEventTags = net.minecraft.class_5698
/**
 * net.minecraft.class_7168
 */
typealias GlTimer = net.minecraft.class_7168
/**
 * net.minecraft.class_5429
 */
typealias RemoveGolemGossipFix = net.minecraft.class_5429
/**
 * com.mojang.datafixers.DataFixer
 */
typealias DataFixer = com.mojang.datafixers.DataFixer
/**
 * net.minecraft.class_3971
 */
typealias StonecutterScreenHandler = net.minecraft.class_3971
/**
 * net.minecraft.class_3914
 */
typealias ScreenHandlerContext = net.minecraft.class_3914
/**
 * net.minecraft.class_9061
 */
typealias Schema3799 = net.minecraft.class_9061
/**
 * net.minecraft.class_4299
 */
typealias OminousBannerBlockEntityRenameFix = net.minecraft.class_4299
/**
 * net.minecraft.class_1202
 */
typealias OptionsForceVBOFix = net.minecraft.class_1202
/**
 * net.minecraft.class_4580
 */
typealias StorageDataObject = net.minecraft.class_4580
/**
 * net.minecraft.class_7141
 */
typealias SculkPatchFeatureConfig = net.minecraft.class_7141
/**
 * net.minecraft.class_926
 */
typealias MooshroomEntityRenderer = net.minecraft.class_926
/**
 * net.minecraft.class_7
 */
typealias PathNodeType = net.minecraft.class_7
/**
 * net.minecraft.class_7733
 */
typealias RegistryEntryReferenceArgumentType<T> = net.minecraft.class_7733<T>
/**
 * net.minecraft.class_5183
 */
typealias RuinedPortalStructure = net.minecraft.class_5183
/**
 * net.minecraft.class_405
 */
typealias BackupPromptScreen = net.minecraft.class_405
/**
 * net.minecraft.class_4523
 */
typealias FailureLoggingTestCompletionListener = net.minecraft.class_4523
/**
 * net.minecraft.class_785
 */
typealias ModelElement = net.minecraft.class_785
/**
 * net.minecraft.class_8520
 */
typealias LightDebugRenderer = net.minecraft.class_8520
/**
 * net.minecraft.class_9471
 */
typealias RaiderPredicate = net.minecraft.class_9471
/**
 * net.minecraft.class_1271
 */
typealias TypedActionResult<T> = net.minecraft.class_1271<T>
/**
 * net.minecraft.class_8714
 */
typealias DebugGameTestAddMarkerCustomPayload = net.minecraft.class_8714
/**
 * net.minecraft.class_3554
 */
typealias LevelPropagator = net.minecraft.class_3554
/**
 * net.minecraft.class_1342
 */
typealias BreatheAirGoal = net.minecraft.class_1342
/**
 * net.minecraft.class_3184
 */
typealias PlayerListGui = net.minecraft.class_3184
/**
 * net.minecraft.class_1282
 */
typealias DamageSource = net.minecraft.class_1282
/**
 * net.minecraft.class_4112
 */
typealias WanderAroundTask = net.minecraft.class_4112
/**
 * net.minecraft.class_3443
 */
typealias StructurePiece = net.minecraft.class_3443
/**
 * net.minecraft.class_9486
 */
typealias VanillaEquipmentLootTableGenerator = net.minecraft.class_9486
/**
 * net.minecraft.class_1303
 */
typealias ExperienceOrbEntity = net.minecraft.class_1303
/**
 * net.minecraft.class_8143
 */
typealias EntityDamageS2CPacket = net.minecraft.class_8143
/**
 * net.minecraft.class_4775
 */
typealias SoulFireBlock = net.minecraft.class_4775
/**
 * net.minecraft.class_5950
 */
typealias ExecutorSampling = net.minecraft.class_5950
/**
 * net.minecraft.class_1851
 */
typealias FireworkRocketRecipe = net.minecraft.class_1851
/**
 * net.minecraft.class_8111
 */
typealias DamageTypes = net.minecraft.class_8111
/**
 * net.minecraft.class_9648
 */
typealias CollectionPredicate<T, P> = net.minecraft.class_9648<T, P>
/**
 * net.minecraft.class_7938
 */
typealias WallPiglinHeadBlock = net.minecraft.class_7938
/**
 * net.minecraft.class_8854
 */
typealias CommandExecutionContext<T> = net.minecraft.class_8854<T>
/**
 * net.minecraft.class_2910
 */
typealias PhantomSpawner = net.minecraft.class_2910
/**
 * com.mojang.datafixers.kinds.App
 */
typealias App<F, A> = com.mojang.datafixers.kinds.App<F, A>
/**
 * net.minecraft.class_5356
 */
typealias NearestVisibleAdultSensor = net.minecraft.class_5356
/**
 * net.minecraft.class_481
 */
typealias CreativeInventoryScreen = net.minecraft.class_481
/**
 * net.minecraft.class_7085
 */
typealias BlockEntry = net.minecraft.class_7085
/**
 * net.minecraft.class_1061
 */
typealias TextureTickListener = net.minecraft.class_1061
/**
 * net.minecraft.class_8019
 */
typealias NarratedMultilineTextWidget = net.minecraft.class_8019
/**
 * net.minecraft.class_8758
 */
typealias PingChart = net.minecraft.class_8758
/**
 * net.minecraft.class_6825
 */
typealias VillagePlacedFeatures = net.minecraft.class_6825
/**
 * net.minecraft.class_5204
 */
typealias TwoLayersFeatureSize = net.minecraft.class_5204
/**
 * net.minecraft.class_322
 */
typealias BlockColorProvider = net.minecraft.class_322
/**
 * net.minecraft.class_72
 */
typealias SequenceEntry = net.minecraft.class_72
/**
 * net.minecraft.class_117
 */
typealias LootFunction = net.minecraft.class_117
/**
 * net.minecraft.class_3004
 */
typealias BossBarManager = net.minecraft.class_3004
/**
 * net.minecraft.class_2456
 */
typealias ComplexRecipeJsonBuilder = net.minecraft.class_2456
/**
 * com.mojang.blaze3d.platform.GlStateManager
 */
typealias GlStateManager = com.mojang.blaze3d.platform.GlStateManager
/**
 * net.minecraft.class_8548
 */
typealias AllOfLootCondition = net.minecraft.class_8548
/**
 * net.minecraft.class_9760
 */
typealias ChunkLoadingManager = net.minecraft.class_9760
/**
 * net.minecraft.class_8934
 */
typealias LootableInventory = net.minecraft.class_8934
/**
 * net.minecraft.class_1306
 */
typealias Arm = net.minecraft.class_1306
/**
 * net.minecraft.class_2500
 */
typealias SpreadableBlock = net.minecraft.class_2500
/**
 * net.minecraft.class_7089
 */
typealias WorldPresetTags = net.minecraft.class_7089
/**
 * net.minecraft.class_6904
 */
typealias SaveLoader = net.minecraft.class_6904
/**
 * net.minecraft.class_5589
 */
typealias GeodeFeatureConfig = net.minecraft.class_5589
/**
 * net.minecraft.class_4280
 */
typealias AlwaysSelectedEntryListWidget<E> = net.minecraft.class_4280<E>
/**
 * net.minecraft.class_8689
 */
typealias GuiResourceMetadata = net.minecraft.class_8689
/**
 * net.minecraft.class_7763
 */
typealias CamelEntityRenderer = net.minecraft.class_7763
/**
 * net.minecraft.class_8496
 */
typealias QuickPlay = net.minecraft.class_8496
/**
 * net.minecraft.class_2452
 */
typealias RailPlacementHelper = net.minecraft.class_2452
/**
 * net.minecraft.class_9639
 */
typealias CollectionContainsPredicate<T, P> = net.minecraft.class_9639<T, P>
/**
 * net.minecraft.class_4459
 */
typealias TargetPathNode = net.minecraft.class_4459
/**
 * net.minecraft.class_4123
 */
typealias SleepTask = net.minecraft.class_4123
/**
 * net.minecraft.class_1420
 */
typealias BatEntity = net.minecraft.class_1420
/**
 * net.minecraft.class_9739
 */
typealias SummonEntityEnchantmentEffect = net.minecraft.class_9739
/**
 * net.minecraft.class_4309
 */
typealias JsonDataLoader = net.minecraft.class_4309
/**
 * java.lang.Runnable
 */
typealias Runnable = java.lang.Runnable
/**
 * net.minecraft.class_9068
 */
typealias ArmadilloScareDetectedSensor<T> = net.minecraft.class_9068<T>
/**
 * net.minecraft.class_1674
 */
typealias FireballEntity = net.minecraft.class_1674
/**
 * net.minecraft.class_9366
 */
typealias HeavyCoreBlock = net.minecraft.class_9366
/**
 * net.minecraft.class_8884
 */
typealias RecipeCache = net.minecraft.class_8884
/**
 * net.minecraft.class_9
 */
typealias PathNode = net.minecraft.class_9
/**
 * net.minecraft.class_3115
 */
typealias ScoreboardCommand = net.minecraft.class_3115
/**
 * net.minecraft.class_8781
 */
typealias PlacedAdvancement = net.minecraft.class_8781
/**
 * net.minecraft.class_5725
 */
typealias DripstoneClusterFeature = net.minecraft.class_5725
/**
 * net.minecraft.class_4904
 */
typealias RealmsObjectSelectionList<E> = net.minecraft.class_4904<E>
/**
 * net.minecraft.class_5431
 */
typealias SideShapeType = net.minecraft.class_5431
/**
 * java.security.PublicKey
 */
typealias PublicKey = java.security.PublicKey
/**
 * net.minecraft.class_3902
 */
typealias util_Unit = net.minecraft.class_3902
/**
 * net.minecraft.class_4453
 */
typealias UploadTokenCache = net.minecraft.class_4453
/**
 * net.minecraft.class_2843
 */
typealias UpgradeData = net.minecraft.class_2843
/**
 * net.minecraft.class_6522
 */
typealias CpuLoadSample = net.minecraft.class_6522
/**
 * net.minecraft.class_296
 */
typealias VertexFormatElement = net.minecraft.class_296
/**
 * net.minecraft.class_1750
 */
typealias ItemPlacementContext = net.minecraft.class_1750
/**
 * net.minecraft.class_4106
 */
typealias FindEntityTask = net.minecraft.class_4106
/**
 * net.minecraft.class_5915
 */
typealias GlowItemFrameEntity = net.minecraft.class_5915
/**
 * net.minecraft.class_8875
 */
typealias SlotChangedStateC2SPacket = net.minecraft.class_8875
/**
 * net.minecraft.class_7288
 */
typealias WardenFeatureRenderer<T, M> = net.minecraft.class_7288<T, M>
/**
 * net.minecraft.class_8242
 */
typealias SignText = net.minecraft.class_8242
/**
 * net.minecraft.class_3128
 */
typealias SetWorldSpawnCommand = net.minecraft.class_3128
/**
 * net.minecraft.class_9401
 */
typealias Suggestable<S> = net.minecraft.class_9401<S>
/**
 * java.util.function.IntSupplier
 */
typealias IntSupplier = java.util.function.IntSupplier
/**
 * net.minecraft.class_8582
 */
typealias AllowedSymlinkPathMatcher = net.minecraft.class_8582
/**
 * io.netty.channel.ChannelHandlerContext
 */
typealias ChannelHandlerContext = io.netty.channel.ChannelHandlerContext
/**
 * net.minecraft.class_673
 */
typealias ExplosionSmokeParticle = net.minecraft.class_673
/**
 * net.minecraft.class_269
 */
typealias Scoreboard = net.minecraft.class_269
/**
 * net.minecraft.class_9024
 */
typealias NumberFormatTypes = net.minecraft.class_9024
/**
 * net.minecraft.class_4590
 */
typealias AffineTransformation = net.minecraft.class_4590
/**
 * net.minecraft.class_1741
 */
typealias ArmorMaterial = net.minecraft.class_1741
/**
 * net.minecraft.class_4872
 */
typealias PendingInvitesList = net.minecraft.class_4872
/**
 * net.minecraft.class_2231
 */
typealias AbstractPressurePlateBlock = net.minecraft.class_2231
/**
 * net.minecraft.class_596
 */
typealias RabbitEntityModel<T> = net.minecraft.class_596<T>
/**
 * net.minecraft.class_3934
 */
typealias CartographyTableScreen = net.minecraft.class_3934
/**
 * net.minecraft.class_5871
 */
typealias CarverConfig = net.minecraft.class_5871
/**
 * net.minecraft.class_2814
 */
typealias BiMapPalette<T> = net.minecraft.class_2814<T>
/**
 * com.mojang.authlib.minecraft.TelemetrySession
 */
typealias TelemetrySession = com.mojang.authlib.minecraft.TelemetrySession
/**
 * net.minecraft.class_3229
 */
typealias FlatChunkGeneratorLayer = net.minecraft.class_3229
/**
 * net.minecraft.class_7111
 */
typealias TadpoleBrain = net.minecraft.class_7111
/**
 * net.minecraft.class_661
 */
typealias BubblePopParticle = net.minecraft.class_661
/**
 * net.minecraft.class_2165
 */
typealias CommandOutput = net.minecraft.class_2165
/**
 * net.minecraft.class_1946
 */
typealias PortalForcer = net.minecraft.class_1946
/**
 * net.minecraft.class_6808
 */
typealias TreeConfiguredFeatures = net.minecraft.class_6808
/**
 * net.minecraft.class_2520
 */
typealias NbtElement = net.minecraft.class_2520
/**
 * net.minecraft.class_663
 */
typealias BlockLeakParticle = net.minecraft.class_663
/**
 * net.minecraft.class_4889
 */
typealias WorldDownload = net.minecraft.class_4889
/**
 * net.minecraft.class_1002
 */
typealias SkeletonOverlayFeatureRenderer<T, M> = net.minecraft.class_1002<T, M>
/**
 * net.minecraft.class_9801
 */
typealias BuiltBuffer = net.minecraft.class_9801
/**
 * net.minecraft.class_5711
 */
typealias SimpleGameEventDispatcher = net.minecraft.class_5711
/**
 * net.minecraft.class_9225
 */
typealias ResourcePackPosition = net.minecraft.class_9225
/**
 * net.minecraft.class_1204
 */
typealias OptionsKeyTranslationFix = net.minecraft.class_1204
/**
 * net.minecraft.class_908
 */
typealias GiantEntityRenderer = net.minecraft.class_908
/**
 * net.minecraft.class_2855
 */
typealias RenameItemC2SPacket = net.minecraft.class_2855
/**
 * net.minecraft.class_1547
 */
typealias AbstractSkeletonEntity = net.minecraft.class_1547
/**
 * net.minecraft.class_2824
 */
typealias PlayerInteractEntityC2SPacket = net.minecraft.class_2824
/**
 * net.minecraft.class_9294
 */
typealias MapColorComponent = net.minecraft.class_9294
/**
 * net.minecraft.class_4486
 */
typealias ChunkCompressionFormat = net.minecraft.class_4486
/**
 * net.minecraft.class_5339
 */
typealias LootFunctionType<T> = net.minecraft.class_5339<T>
/**
 * net.minecraft.class_9151
 */
typealias ServerTransferS2CPacket = net.minecraft.class_9151
/**
 * java.lang.Object
 */
typealias Object = java.lang.Object
/**
 * net.minecraft.class_1172
 */
typealias EntityWolfColorFix = net.minecraft.class_1172
/**
 * net.minecraft.class_2917
 */
typealias LoginKeyC2SPacket = net.minecraft.class_2917
/**
 * net.minecraft.class_9191
 */
typealias MultiValueDebugSampleLogImpl = net.minecraft.class_9191
/**
 * net.minecraft.class_2002
 */
typealias ChanneledLightningCriterion = net.minecraft.class_2002
/**
 * net.minecraft.class_642
 */
typealias ServerInfo = net.minecraft.class_642
/**
 * net.minecraft.class_590
 */
typealias PolarBearEntityModel<T> = net.minecraft.class_590<T>
/**
 * com.google.common.collect.ImmutableList
 */
typealias ImmutableList<E> = com.google.common.collect.ImmutableList<E>
/**
 * net.minecraft.class_2985
 */
typealias PlayerAdvancementTracker = net.minecraft.class_2985
/**
 * net.minecraft.class_4069
 */
typealias ParentElement = net.minecraft.class_4069
/**
 * net.minecraft.class_8565
 */
typealias RandomSequencesState = net.minecraft.class_8565
/**
 * net.minecraft.class_8952
 */
typealias BreezeJumpTask = net.minecraft.class_8952
/**
 * net.minecraft.class_7134
 */
typealias DimensionTypes = net.minecraft.class_7134
/**
 * net.minecraft.class_2550
 */
typealias SplitterHandler = net.minecraft.class_2550
/**
 * net.minecraft.class_9085
 */
typealias WolfArmorFeatureRenderer = net.minecraft.class_9085
/**
 * net.minecraft.class_5338
 */
typealias LootPoolEntryType = net.minecraft.class_5338
/**
 * net.minecraft.class_4695
 */
typealias StructureReferenceFix = net.minecraft.class_4695
/**
 * net.minecraft.class_1177
 */
typealias HeightmapRenamingFix = net.minecraft.class_1177
/**
 * java.lang.reflect.Type
 */
typealias Type = java.lang.reflect.Type
/**
 * net.minecraft.class_2355
 */
typealias EightWayDirection = net.minecraft.class_2355
/**
 * net.minecraft.class_6579
 */
typealias AbstractNoiseBlockStateProvider = net.minecraft.class_6579
/**
 * net.minecraft.class_1508
 */
typealias EnderDragonPart = net.minecraft.class_1508
/**
 * net.minecraft.class_3178
 */
typealias DedicatedServerWatchdog = net.minecraft.class_3178
/**
 * net.minecraft.class_9079
 */
typealias ArmadilloAnimations = net.minecraft.class_9079
/**
 * net.minecraft.class_4495
 */
typealias BeeEntityModel<T> = net.minecraft.class_4495<T>
/**
 * net.minecraft.class_953
 */
typealias FlyingItemEntityRenderer<T> = net.minecraft.class_953<T>
/**
 * net.minecraft.class_9443
 */
typealias MapDecorationsAtlasManager = net.minecraft.class_9443
/**
 * net.minecraft.class_2935
 */
typealias QueryPingC2SPacket = net.minecraft.class_2935
/**
 * net.minecraft.class_1070
 */
typealias FoliageColormapResourceSupplier = net.minecraft.class_1070
/**
 * net.minecraft.class_3047
 */
typealias GlowstoneBlobFeature = net.minecraft.class_3047
/**
 * net.minecraft.class_5709
 */
typealias EntityPositionSource = net.minecraft.class_5709
/**
 * net.minecraft.class_1838
 */
typealias ItemUsageContext = net.minecraft.class_1838
/**
 * net.minecraft.class_2804
 */
typealias ChunkNibbleArray = net.minecraft.class_2804
/**
 * com.google.gson.JsonObject
 */
typealias JsonObject = com.google.gson.JsonObject
/**
 * net.minecraft.class_7827
 */
typealias ProfilelessChatMessageS2CPacket = net.minecraft.class_7827
/**
 * net.minecraft.class_3882
 */
typealias ModelWithHead = net.minecraft.class_3882
/**
 * net.minecraft.class_2287
 */
typealias ItemStackArgumentType = net.minecraft.class_2287
/**
 * net.minecraft.class_1531
 */
typealias ArmorStandEntity = net.minecraft.class_1531
/**
 * net.minecraft.class_5768
 */
typealias AxolotlBrain = net.minecraft.class_5768
/**
 * net.minecraft.class_898
 */
typealias EntityRenderDispatcher = net.minecraft.class_898
/**
 * net.minecraft.class_9080
 */
typealias LayeredDrawer = net.minecraft.class_9080
/**
 * net.minecraft.class_1257
 */
typealias WorldUpdater = net.minecraft.class_1257
/**
 * net.minecraft.class_2899
 */
typealias LoginQueryRequestS2CPacket = net.minecraft.class_2899
/**
 * net.minecraft.class_7116
 */
typealias MangroveRootsBlock = net.minecraft.class_7116
/**
 * net.minecraft.class_2956
 */
typealias BuriedTreasureStructure = net.minecraft.class_2956
/**
 * net.minecraft.class_3551
 */
typealias Schemas = net.minecraft.class_3551
/**
 * net.minecraft.class_2214
 */
typealias ScoreboardObjectiveArgumentType = net.minecraft.class_2214
/**
 * net.minecraft.class_528
 */
typealias WorldListWidget = net.minecraft.class_528
/**
 * net.minecraft.class_2313
 */
typealias DetectorRailBlock = net.minecraft.class_2313
/**
 * net.minecraft.class_6756
 */
typealias QueryableTickScheduler<T> = net.minecraft.class_6756<T>
/**
 * it.unimi.dsi.fastutil.floats.Float2FloatFunction
 */
typealias Float2FloatFunction = it.unimi.dsi.fastutil.floats.Float2FloatFunction
/**
 * net.minecraft.class_2513
 */
typealias StemBlock = net.minecraft.class_2513
/**
 * net.minecraft.class_4910
 */
typealias BlockStateModelGenerator = net.minecraft.class_4910
/**
 * com.google.gson.Gson
 */
typealias Gson = com.google.gson.Gson
/**
 * net.minecraft.class_3026
 */
typealias EndIslandFeature = net.minecraft.class_3026
/**
 * net.minecraft.class_6783
 */
typealias InsideWorldBoundsBlockPredicate = net.minecraft.class_6783
/**
 * net.minecraft.class_3875
 */
typealias BlastFurnaceRecipeBookScreen = net.minecraft.class_3875
/**
 * net.minecraft.class_2827
 */
typealias KeepAliveC2SPacket = net.minecraft.class_2827
/**
 * net.minecraft.class_9830
 */
typealias FixedPlacementModifier = net.minecraft.class_9830
/**
 * net.minecraft.class_8079
 */
typealias StatusEffectDurationFix = net.minecraft.class_8079
/**
 * net.minecraft.class_2388
 */
typealias BlockStateParticleEffect = net.minecraft.class_2388
/**
 * net.minecraft.class_6402
 */
typealias ServerSamplerSource = net.minecraft.class_6402
/**
 * net.minecraft.class_436
 */
typealias OpenToLanScreen = net.minecraft.class_436
/**
 * net.minecraft.class_9741
 */
typealias EnchantmentProvider = net.minecraft.class_9741
/**
 * net.minecraft.class_7261
 */
typealias WardenBrain = net.minecraft.class_7261
/**
 * net.minecraft.class_4950
 */
typealias TwistingVinesPlantBlock = net.minecraft.class_4950
/**
 * net.minecraft.class_2434
 */
typealias VanillaEntityLootTableGenerator = net.minecraft.class_2434
/**
 * net.minecraft.class_320
 */
typealias Session = net.minecraft.class_320
/**
 * net.minecraft.class_913
 */
typealias IronGolemEntityRenderer = net.minecraft.class_913
/**
 * net.minecraft.class_2464
 */
typealias BlockRenderType = net.minecraft.class_2464
/**
 * net.minecraft.class_478
 */
typealias CreativeInventoryListener = net.minecraft.class_478
/**
 * net.minecraft.class_9674
 */
typealias EnchantmentTagProvider = net.minecraft.class_9674
/**
 * net.minecraft.class_9283
 */
typealias FireworkExplosionComponent = net.minecraft.class_9283
/**
 * net.minecraft.class_2726
 */
typealias EntitySetHeadYawS2CPacket = net.minecraft.class_2726
/**
 * net.minecraft.class_9389
 */
typealias ParsingRules<S> = net.minecraft.class_9389<S>
/**
 * net.minecraft.class_912
 */
typealias HuskEntityRenderer = net.minecraft.class_912
/**
 * net.minecraft.class_4657
 */
typealias WeightedBlockStateProvider = net.minecraft.class_4657
/**
 * net.minecraft.class_2181
 */
typealias DimensionArgumentType = net.minecraft.class_2181
/**
 * net.minecraft.class_8239
 */
typealias CalibratedSculkSensorBlockEntity = net.minecraft.class_8239
/**
 * net.minecraft.class_4416
 */
typealias RealmsSelectFileToUploadScreen = net.minecraft.class_4416
/**
 * net.minecraft.class_4011
 */
typealias ResourceReload = net.minecraft.class_4011
/**
 * net.minecraft.class_4757
 */
typealias TickTimeTracker = net.minecraft.class_4757
/**
 * net.minecraft.class_3179
 */
typealias SimpleRandomFeatureConfig = net.minecraft.class_3179
/**
 * net.minecraft.class_1855
 */
typealias MapCloningRecipe = net.minecraft.class_1855
/**
 * net.minecraft.class_2327
 */
typealias FloatArgumentSerializer = net.minecraft.class_2327
/**
 * net.minecraft.class_5628
 */
typealias NbtTextFormatter = net.minecraft.class_5628
/**
 * net.minecraft.class_5138
 */
typealias StructureAccessor = net.minecraft.class_5138
/**
 * net.minecraft.class_4763
 */
typealias BiomeEffects = net.minecraft.class_4763
/**
 * net.minecraft.class_82
 */
typealias LootChoice = net.minecraft.class_82
/**
 * net.minecraft.class_4130
 */
typealias HoldTradeOffersTask = net.minecraft.class_4130
/**
 * net.minecraft.class_793
 */
typealias JsonUnbakedModel = net.minecraft.class_793
/**
 * net.minecraft.class_4806
 */
typealias BreedTask = net.minecraft.class_4806
/**
 * net.minecraft.class_4739
 */
typealias AbstractChestBlock<E> = net.minecraft.class_4739<E>
/**
 * net.minecraft.class_5575
 */
typealias TypeFilter<B, T> = net.minecraft.class_5575<B, T>
/**
 * net.minecraft.class_1589
 */
typealias MagmaCubeEntity = net.minecraft.class_1589
/**
 * net.minecraft.class_2664
 */
typealias ExplosionS2CPacket = net.minecraft.class_2664
/**
 * net.minecraft.class_9689
 */
typealias ArrowStoredWeaponFix = net.minecraft.class_9689
/**
 * net.minecraft.class_7214
 */
typealias TadpoleEntityRenderer = net.minecraft.class_7214
/**
 * net.minecraft.class_6019
 */
typealias UniformIntProvider = net.minecraft.class_6019
/**
 * net.minecraft.class_4076
 */
typealias ChunkSectionPos = net.minecraft.class_4076
/**
 * net.minecraft.class_6506
 */
typealias InstanceType = net.minecraft.class_6506
/**
 * net.minecraft.class_5766
 */
typealias AmphibiousSwimNavigation = net.minecraft.class_5766
/**
 * net.minecraft.class_2256
 */
typealias Fertilizable = net.minecraft.class_2256
/**
 * net.minecraft.class_52
 */
typealias LootTable = net.minecraft.class_52
/**
 * net.minecraft.class_6807
 */
typealias PileConfiguredFeatures = net.minecraft.class_6807
/**
 * net.minecraft.class_5952
 */
typealias SampleableExecutor = net.minecraft.class_5952
/**
 * net.minecraft.class_4925
 */
typealias VariantsBlockStateSupplier = net.minecraft.class_4925
/**
 * net.minecraft.class_619
 */
typealias ZombieVillagerEntityModel<T> = net.minecraft.class_619<T>
/**
 * net.minecraft.class_6564
 */
typealias SingularPalette<T> = net.minecraft.class_6564<T>
/**
 * net.minecraft.class_1804
 */
typealias LeadItem = net.minecraft.class_1804
/**
 * net.minecraft.class_2421
 */
typealias NetherWartBlock = net.minecraft.class_2421
/**
 * net.minecraft.class_3887
 */
typealias FeatureRenderer<T, M> = net.minecraft.class_3887<T, M>
/**
 * net.minecraft.class_3898
 */
typealias ServerChunkLoadingManager = net.minecraft.class_3898
/**
 * net.minecraft.class_568
 */
typealias EvokerFangsEntityModel<T> = net.minecraft.class_568<T>
/**
 * net.minecraft.class_2939
 */
typealias Carver<C> = net.minecraft.class_2939<C>
/**
 * net.minecraft.class_2386
 */
typealias IceBlock = net.minecraft.class_2386
/**
 * net.minecraft.class_5731
 */
typealias DripstoneClusterFeatureConfig = net.minecraft.class_5731
/**
 * net.minecraft.class_3727
 */
typealias EntityShapeContext = net.minecraft.class_3727
/**
 * net.minecraft.class_3073
 */
typealias KickCommand = net.minecraft.class_3073
/**
 * net.minecraft.class_6348
 */
typealias RotatedInfestedBlock = net.minecraft.class_6348
/**
 * net.minecraft.class_1183
 */
typealias ItemPotionFix = net.minecraft.class_1183
/**
 * net.minecraft.class_7442
 */
typealias GoatHornIdFix = net.minecraft.class_7442
/**
 * net.minecraft.class_9355
 */
typealias item_DamagePredicate = net.minecraft.class_9355
/**
 * net.minecraft.class_8590
 */
typealias AcknowledgeChunksC2SPacket = net.minecraft.class_8590
/**
 * net.minecraft.class_4693
 */
typealias TimedTaskRunner = net.minecraft.class_4693
/**
 * net.minecraft.class_919
 */
typealias LightningEntityRenderer = net.minecraft.class_919
/**
 * net.minecraft.class_324
 */
typealias BlockColors = net.minecraft.class_324
/**
 * net.minecraft.class_1104
 */
typealias ClientPlayerTickable = net.minecraft.class_1104
/**
 * net.minecraft.class_2435
 */
typealias PlayerSkullBlock = net.minecraft.class_2435
/**
 * net.minecraft.class_8600
 */
typealias DebugConfigCommand = net.minecraft.class_8600
/**
 * net.minecraft.class_9757
 */
typealias TradeRebalanceBuiltinRegistries = net.minecraft.class_9757
/**
 * net.minecraft.class_2363
 */
typealias AbstractFurnaceBlock = net.minecraft.class_2363
/**
 * net.minecraft.class_7683
 */
typealias OptionsProgrammerArtFix = net.minecraft.class_7683
/**
 * net.minecraft.class_4048
 */
typealias EntityDimensions = net.minecraft.class_4048
/**
 * net.minecraft.class_1367
 */
typealias MoveToTargetPosGoal = net.minecraft.class_1367
/**
 * net.minecraft.class_2649
 */
typealias InventoryS2CPacket = net.minecraft.class_2649
/**
 * net.minecraft.class_6371
 */
typealias RedirectResolver = net.minecraft.class_6371
/**
 * net.minecraft.class_6519
 */
typealias JfrJsonReport = net.minecraft.class_6519
/**
 * net.minecraft.class_3856
 */
typealias FlyingItemEntity = net.minecraft.class_3856
/**
 * net.minecraft.class_5293
 */
typealias LevelScreenProvider = net.minecraft.class_5293
/**
 * net.minecraft.class_1205
 */
typealias WoodRecipeMapping = net.minecraft.class_1205
/**
 * net.minecraft.class_644
 */
typealias MultiplayerServerListPinger = net.minecraft.class_644
/**
 * net.minecraft.class_508
 */
typealias RecipeAlternativesWidget = net.minecraft.class_508
/**
 * net.minecraft.class_4966
 */
typealias VerticalBlockSample = net.minecraft.class_4966
/**
 * net.minecraft.class_3673
 */
typealias GlfwUtil = net.minecraft.class_3673
/**
 * net.minecraft.class_9361
 */
typealias ItemSubPredicateTypes = net.minecraft.class_9361
/**
 * net.minecraft.class_5424
 */
typealias LunarWorldView = net.minecraft.class_5424
/**
 * net.minecraft.class_1178
 */
typealias ItemCustomNameToComponentFix = net.minecraft.class_1178
/**
 * net.minecraft.class_4874
 */
typealias PlayerInfo = net.minecraft.class_4874
/**
 * net.minecraft.class_3705
 */
typealias BlastFurnaceScreenHandler = net.minecraft.class_3705
/**
 * net.minecraft.class_5350
 */
typealias DataPackContents = net.minecraft.class_5350
/**
 * net.minecraft.class_9347
 */
typealias WolfVariants = net.minecraft.class_9347
/**
 * net.minecraft.class_7687
 */
typealias RandomLookAroundTask = net.minecraft.class_7687
/**
 * net.minecraft.class_9102
 */
typealias StatusPackets = net.minecraft.class_9102
/**
 * net.minecraft.class_961
 */
typealias ZombieHorseEntityRenderer = net.minecraft.class_961
/**
 * net.minecraft.class_7477
 */
typealias PointOfInterestTypes = net.minecraft.class_7477
/**
 * net.minecraft.class_2601
 */
typealias DispenserBlockEntity = net.minecraft.class_2601
/**
 * net.minecraft.class_756
 */
typealias BuiltinModelItemRenderer = net.minecraft.class_756
/**
 * net.minecraft.class_2575
 */
typealias BlockNbtDataSource = net.minecraft.class_2575
/**
 * net.minecraft.class_2515
 */
typealias StructureBlock = net.minecraft.class_2515
/**
 * net.minecraft.class_6580
 */
typealias NoiseBlockStateProvider = net.minecraft.class_6580
/**
 * net.minecraft.class_270
 */
typealias AbstractTeam = net.minecraft.class_270
/**
 * net.minecraft.class_1680
 */
typealias SnowballEntity = net.minecraft.class_1680
/**
 * net.minecraft.class_7265
 */
typealias VehicleInventory = net.minecraft.class_7265
/**
 * net.minecraft.class_7387
 */
typealias RootPlacer = net.minecraft.class_7387
/**
 * net.minecraft.class_4089
 */
typealias ParticleTextureData = net.minecraft.class_4089
/**
 * net.minecraft.class_1999
 */
typealias ChangedDimensionCriterion = net.minecraft.class_1999
/**
 * net.minecraft.class_3782
 */
typealias ListPoolElement = net.minecraft.class_3782
/**
 * net.minecraft.class_5603
 */
typealias ModelTransform = net.minecraft.class_5603
/**
 * net.minecraft.class_2266
 */
typealias CactusBlock = net.minecraft.class_2266
/**
 * net.minecraft.class_9743
 */
typealias ByCostEnchantmentProvider = net.minecraft.class_9743
/**
 * net.minecraft.class_3540
 */
typealias Smoother = net.minecraft.class_3540
/**
 * net.minecraft.class_5363
 */
typealias DimensionOptions = net.minecraft.class_5363
/**
 * net.minecraft.class_9275
 */
typealias BlockStateComponent = net.minecraft.class_9275
/**
 * net.minecraft.class_3718
 */
typealias StonecutterBlock = net.minecraft.class_3718
/**
 * net.minecraft.class_4899
 */
typealias DisconnectedRealmsScreen = net.minecraft.class_4899
/**
 * org.lwjgl.glfw.GLFWMouseButtonCallbackI
 */
typealias GLFWMouseButtonCallbackI = org.lwjgl.glfw.GLFWMouseButtonCallbackI
/**
 * net.minecraft.class_8936
 */
typealias ExecutionFlags = net.minecraft.class_8936
/**
 * net.minecraft.class_4390
 */
typealias RealmsCreateRealmScreen = net.minecraft.class_4390
/**
 * net.minecraft.class_7431
 */
typealias SetInstrumentLootFunction = net.minecraft.class_7431
/**
 * net.minecraft.class_2708
 */
typealias PlayerPositionLookS2CPacket = net.minecraft.class_2708
/**
 * net.minecraft.class_9017
 */
typealias ContainerWidget = net.minecraft.class_9017
/**
 * net.minecraft.class_7794
 */
typealias VanillaLootTableProviders = net.minecraft.class_7794
/**
 * net.minecraft.class_4660
 */
typealias CocoaBeansTreeDecorator = net.minecraft.class_4660
/**
 * net.minecraft.class_4819
 */
typealias HuntFinishTask = net.minecraft.class_4819
/**
 * net.minecraft.class_1471
 */
typealias TameableShoulderEntity = net.minecraft.class_1471
/**
 * net.minecraft.class_8538
 */
typealias TextRenderLayerSet = net.minecraft.class_8538
/**
 * net.minecraft.class_7551
 */
typealias AbuseReportReasonScreen = net.minecraft.class_7551
/**
 * net.minecraft.class_6011
 */
typealias Weighting = net.minecraft.class_6011
/**
 * net.minecraft.class_9228
 */
typealias FixUtil = net.minecraft.class_9228
/**
 * net.minecraft.class_318
 */
typealias ScreenshotRecorder = net.minecraft.class_318
/**
 * net.minecraft.class_4944
 */
typealias TextureMap = net.minecraft.class_4944
/**
 * net.minecraft.class_9291
 */
typealias LodestoneTrackerComponent = net.minecraft.class_9291
/**
 * net.minecraft.class_7924
 */
typealias RegistryKeys = net.minecraft.class_7924
/**
 * net.minecraft.class_566
 */
typealias EndermanEntityModel<T> = net.minecraft.class_566<T>
/**
 * net.minecraft.class_4506
 */
typealias StuckStingersFeatureRenderer<T, M> = net.minecraft.class_4506<T, M>
/**
 * net.minecraft.class_3262
 */
typealias ResourcePack = net.minecraft.class_3262
/**
 * net.minecraft.class_3954
 */
typealias InventoryProvider = net.minecraft.class_3954
/**
 * net.minecraft.class_4017
 */
typealias DiveJumpingGoal = net.minecraft.class_4017
/**
 * net.minecraft.class_1101
 */
typealias MovingSoundInstance = net.minecraft.class_1101
/**
 * net.minecraft.class_7532
 */
typealias PlayerSkinDrawer = net.minecraft.class_7532
/**
 * net.minecraft.class_6759
 */
typealias Tick<T> = net.minecraft.class_6759<T>
/**
 * java.net.SocketAddress
 */
typealias SocketAddress = java.net.SocketAddress
/**
 * net.minecraft.class_355
 */
typealias PlayerListHud = net.minecraft.class_355
/**
 * net.minecraft.class_2494
 */
typealias NbtFloat = net.minecraft.class_2494
/**
 * net.minecraft.class_1693
 */
typealias StorageMinecartEntity = net.minecraft.class_1693
/**
 * net.minecraft.class_238
 */
typealias Box = net.minecraft.class_238
/**
 * net.minecraft.class_9711
 */
typealias AddEnchantmentEffect = net.minecraft.class_9711
/**
 * net.minecraft.class_8611
 */
typealias JoinWorldTask = net.minecraft.class_8611
/**
 * net.minecraft.class_3176
 */
typealias MinecraftDedicatedServer = net.minecraft.class_3176
/**
 * net.minecraft.class_5535
 */
typealias FuzzyPositions = net.minecraft.class_5535
/**
 * net.minecraft.class_5965
 */
typealias Sampler = net.minecraft.class_5965
/**
 * net.minecraft.class_7091
 */
typealias ChunkDeleteIgnoredLightDataFix = net.minecraft.class_7091
/**
 * java.util.function.ToIntFunction
 */
typealias ToIntFunction<T> = java.util.function.ToIntFunction<T>
/**
 * net.minecraft.class_1887
 */
typealias Enchantment = net.minecraft.class_1887
/**
 * net.minecraft.class_5820
 */
typealias CheckedRandom = net.minecraft.class_5820
/**
 * net.minecraft.class_1409
 */
typealias MobNavigation = net.minecraft.class_1409
/**
 * net.minecraft.class_4296
 */
typealias SimpleTickScheduler<T> = net.minecraft.class_4296<T>
/**
 * net.minecraft.class_8953
 */
typealias BreezeShootTask = net.minecraft.class_8953
/**
 * net.minecraft.class_9676
 */
typealias VanillaEnchantmentTagProvider = net.minecraft.class_9676
/**
 * net.minecraft.class_8490
 */
typealias LootDataType<T> = net.minecraft.class_8490<T>
/**
 * net.minecraft.class_7124
 */
typealias SculkSpreadable = net.minecraft.class_7124
/**
 * net.minecraft.class_6637
 */
typealias ChunkHeightAndBiomeFix = net.minecraft.class_6637
/**
 * net.minecraft.class_8880
 */
typealias Schema3683 = net.minecraft.class_8880
/**
 * net.minecraft.class_8879
 */
typealias Schema3682 = net.minecraft.class_8879
/**
 * net.minecraft.class_8945
 */
typealias Schema3689 = net.minecraft.class_8945
/**
 * net.minecraft.class_1224
 */
typealias Schema1022 = net.minecraft.class_1224
/**
 * net.minecraft.class_8920
 */
typealias Schema3685 = net.minecraft.class_8920
/**
 * net.minecraft.class_2463
 */
typealias SnbtProvider = net.minecraft.class_2463
/**
 * net.minecraft.class_2582
 */
typealias BannerPattern = net.minecraft.class_2582
/**
 * net.minecraft.class_6760
 */
typealias OrderedTick<T> = net.minecraft.class_6760<T>
/**
 * net.minecraft.class_1734
 */
typealias CraftingResultSlot = net.minecraft.class_1734
/**
 * net.minecraft.class_7976
 */
typealias SampleEvent = net.minecraft.class_7976
/**
 * net.minecraft.class_6595
 */
typealias SaveVersion = net.minecraft.class_6595
/**
 * net.minecraft.class_7801
 */
typealias BundleRecipeProvider = net.minecraft.class_7801
/**
 * net.minecraft.class_281
 */
typealias ShaderStage = net.minecraft.class_281
/**
 * net.minecraft.class_7372
 */
typealias MultipliedFloatSupplier = net.minecraft.class_7372
/**
 * net.minecraft.class_5268
 */
typealias ServerWorldProperties = net.minecraft.class_5268
/**
 * javax.swing.JTextArea
 */
typealias JTextArea = javax.swing.JTextArea
/**
 * net.minecraft.class_1825
 */
typealias SpectralArrowItem = net.minecraft.class_1825
/**
 * net.minecraft.class_6581
 */
typealias NoiseThresholdBlockStateProvider = net.minecraft.class_6581
/**
 * net.minecraft.class_4115
 */
typealias LookTarget = net.minecraft.class_4115
/**
 * net.minecraft.class_6327
 */
typealias DebugPathCommand = net.minecraft.class_6327
/**
 * net.minecraft.class_1634
 */
typealias VexEntity = net.minecraft.class_1634
/**
 * net.minecraft.class_3414
 */
typealias SoundEvent = net.minecraft.class_3414
/**
 * net.minecraft.class_3065
 */
typealias GameRuleCommand = net.minecraft.class_3065
/**
 * net.minecraft.class_9192
 */
typealias DebugSampleType = net.minecraft.class_9192
/**
 * net.minecraft.class_6328
 */
typealias MethodsReturnNonnullByDefault = net.minecraft.class_6328
/**
 * net.minecraft.class_4658
 */
typealias AlterGroundTreeDecorator = net.minecraft.class_4658
/**
 * net.minecraft.class_1118
 */
typealias AmbientSoundLoops = net.minecraft.class_1118
/**
 * net.minecraft.class_5519
 */
typealias SocialInteractionsPlayerListEntry = net.minecraft.class_5519
/**
 * net.minecraft.class_7492
 */
typealias MessageDecorator = net.minecraft.class_7492
/**
 * net.minecraft.class_5136
 */
typealias ZoglinEntity = net.minecraft.class_5136
/**
 * net.minecraft.class_1263
 */
typealias Inventory = net.minecraft.class_1263
/**
 * net.minecraft.class_1404
 */
typealias UntamedActiveTargetGoal<T> = net.minecraft.class_1404<T>
/**
 * net.minecraft.class_4823
 */
typealias AdmireItemTask = net.minecraft.class_4823
/**
 * net.minecraft.class_7413
 */
typealias LoadingDisplay = net.minecraft.class_7413
/**
 * net.minecraft.class_79
 */
typealias LootPoolEntry = net.minecraft.class_79
/**
 * net.minecraft.class_3350
 */
typealias RconCommandOutput = net.minecraft.class_3350
/**
 * net.minecraft.class_5381
 */
typealias RegistryElementCodec<E> = net.minecraft.class_5381<E>
/**
 * net.minecraft.class_2240
 */
typealias ItemSlotArgumentType = net.minecraft.class_2240
/**
 * net.minecraft.class_7775
 */
typealias Baker = net.minecraft.class_7775
/**
 * net.minecraft.class_2431
 */
typealias ExperienceDroppingBlock = net.minecraft.class_2431
/**
 * net.minecraft.class_7452
 */
typealias SonicBoomParticle = net.minecraft.class_7452
/**
 * net.minecraft.class_1439
 */
typealias IronGolemEntity = net.minecraft.class_1439
/**
 * net.minecraft.class_7855
 */
typealias AbuseReport = net.minecraft.class_7855
/**
 * net.minecraft.class_8718
 */
typealias DebugHiveCustomPayload = net.minecraft.class_8718
/**
 * net.minecraft.class_8706
 */
typealias ServerCommonPacketListener = net.minecraft.class_8706
/**
 * net.minecraft.class_1715
 */
typealias CraftingInventory = net.minecraft.class_1715
/**
 * net.minecraft.class_2576
 */
typealias EntityNbtDataSource = net.minecraft.class_2576
/**
 * net.minecraft.class_2749
 */
typealias HealthUpdateS2CPacket = net.minecraft.class_2749
/**
 * net.minecraft.class_3903
 */
typealias CatTypeFix = net.minecraft.class_3903
/**
 * net.minecraft.class_300
 */
typealias DataQueryHandler = net.minecraft.class_300
/**
 * net.minecraft.class_8690
 */
typealias Scaling = net.minecraft.class_8690
/**
 * net.minecraft.class_333
 */
typealias NarratorManager = net.minecraft.class_333
/**
 * net.minecraft.class_9663
 */
typealias WrittenBookContentPredicate = net.minecraft.class_9663
/**
 * net.minecraft.class_5659
 */
typealias LootNumberProviderTypes = net.minecraft.class_5659
/**
 * net.minecraft.class_77
 */
typealias ItemEntry = net.minecraft.class_77
/**
 * net.minecraft.class_6677
 */
typealias Xoroshiro128PlusPlusRandom = net.minecraft.class_6677
/**
 * net.minecraft.class_3978
 */
typealias IdCountsState = net.minecraft.class_3978
/**
 * net.minecraft.class_6804
 */
typealias MiscConfiguredFeatures = net.minecraft.class_6804
/**
 * net.minecraft.class_7088
 */
typealias FlatLevelGeneratorPresetTags = net.minecraft.class_7088
/**
 * net.minecraft.class_2172
 */
typealias CommandSource = net.minecraft.class_2172
/**
 * com.mojang.brigadier.arguments.FloatArgumentType
 */
typealias FloatArgumentType = com.mojang.brigadier.arguments.FloatArgumentType
/**
 * net.minecraft.class_2758
 */
typealias IntProperty = net.minecraft.class_2758
/**
 * net.minecraft.class_350
 */
typealias EntryListWidget<E> = net.minecraft.class_350<E>
/**
 * net.minecraft.class_2815
 */
typealias CloseHandledScreenC2SPacket = net.minecraft.class_2815
/**
 * net.minecraft.class_1535
 */
typealias PaintingVariant = net.minecraft.class_1535
/**
 * net.minecraft.class_7566
 */
typealias ChatAbuseReport = net.minecraft.class_7566
/**
 * net.minecraft.class_7940
 */
typealias MultilineTextWidget = net.minecraft.class_7940
/**
 * net.minecraft.class_599
 */
typealias SalmonEntityModel<T> = net.minecraft.class_599<T>
/**
 * net.minecraft.class_6350
 */
typealias AquiferSampler = net.minecraft.class_6350
/**
 * net.minecraft.class_7788
 */
typealias BlockLootTableGenerator = net.minecraft.class_7788
/**
 * net.minecraft.class_7923
 */
typealias Registries = net.minecraft.class_7923
/**
 * net.minecraft.class_7951
 */
typealias AtlasSourceType = net.minecraft.class_7951
/**
 * net.minecraft.class_143
 */
typealias UncaughtExceptionHandler = net.minecraft.class_143
/**
 * net.minecraft.class_4005
 */
typealias AsyncTexture = net.minecraft.class_4005
/**
 * net.minecraft.class_2853
 */
typealias RecipeBookDataC2SPacket = net.minecraft.class_2853
/**
 * java.util.function.IntPredicate
 */
typealias IntPredicate = java.util.function.IntPredicate
/**
 * net.minecraft.class_3497
 */
typealias tag_TagEntry = net.minecraft.class_3497
/**
 * net.minecraft.class_765
 */
typealias LightmapTextureManager = net.minecraft.class_765
/**
 * net.minecraft.class_190
 */
typealias DamageSourcePropertiesLootCondition = net.minecraft.class_190
/**
 * net.minecraft.class_5816
 */
typealias Tilt = net.minecraft.class_5816
/**
 * net.minecraft.class_4096
 */
typealias FindPointOfInterestTask = net.minecraft.class_4096
/**
 * com.mojang.brigadier.ParseResults
 */
typealias brigadier_ParseResults<S> = com.mojang.brigadier.ParseResults<S>
/**
 * net.minecraft.class_7313
 */
typealias AncientCityOutskirtsGenerator = net.minecraft.class_7313
/**
 * net.minecraft.class_5201
 */
typealias FeatureSize = net.minecraft.class_5201
/**
 * net.minecraft.class_1265
 */
typealias InventoryChangedListener = net.minecraft.class_1265
/**
 * net.minecraft.class_7296
 */
typealias GiveInventoryToLookTargetTask<E> = net.minecraft.class_7296<E>
/**
 * net.minecraft.class_4650
 */
typealias SpruceFoliagePlacer = net.minecraft.class_4650
/**
 * net.minecraft.class_8188
 */
typealias DecoratedPotBlockEntityRenderer = net.minecraft.class_8188
/**
 * net.minecraft.class_1275
 */
typealias Nameable = net.minecraft.class_1275
/**
 * net.minecraft.class_3483
 */
typealias EntityTypeTags = net.minecraft.class_3483
/**
 * net.minecraft.class_2412
 */
typealias VanillaAdventureTabAdvancementGenerator = net.minecraft.class_2412
/**
 * net.minecraft.class_3941
 */
typealias CampfireBlockEntityRenderer = net.minecraft.class_3941
/**
 * net.minecraft.class_3153
 */
typealias TriggerCommand = net.minecraft.class_3153
/**
 * net.minecraft.class_1519
 */
typealias LandingApproachPhase = net.minecraft.class_1519
/**
 * net.minecraft.class_1712
 */
typealias ScreenHandlerListener = net.minecraft.class_1712
/**
 * net.minecraft.class_454
 */
typealias AdvancementTab = net.minecraft.class_454
/**
 * net.minecraft.class_178
 */
typealias CriterionProgress = net.minecraft.class_178
/**
 * net.minecraft.class_3193
 */
typealias ChunkHolder = net.minecraft.class_3193
/**
 * net.minecraft.class_4215
 */
typealias LookTargetUtil = net.minecraft.class_4215
/**
 * net.minecraft.class_2955
 */
typealias InputSlotFiller<I, R> = net.minecraft.class_2955<I, R>
/**
 * net.minecraft.class_5561
 */
typealias ViewerCountManager = net.minecraft.class_5561
/**
 * net.minecraft.class_4422
 */
typealias RealmsSettingsScreen = net.minecraft.class_4422
/**
 * net.minecraft.class_1742
 */
typealias ArmorStandItem = net.minecraft.class_1742
/**
 * net.minecraft.class_970
 */
typealias ArmorFeatureRenderer<T, M, A> = net.minecraft.class_970<T, M, A>
/**
 * net.minecraft.class_6374
 */
typealias CommonPongC2SPacket = net.minecraft.class_6374
/**
 * org.apache.commons.lang3.math.Fraction
 */
typealias Fraction = org.apache.commons.lang3.math.Fraction
/**
 * net.minecraft.class_7375
 */
typealias CatVariant = net.minecraft.class_7375
/**
 * net.minecraft.class_4959
 */
typealias BlockEntityUuidFix = net.minecraft.class_4959
/**
 * org.lwjgl.util.freetype.FT_Vector
 */
typealias FT_Vector = org.lwjgl.util.freetype.FT_Vector
/**
 * net.minecraft.class_8087
 */
typealias Tab = net.minecraft.class_8087
/**
 * net.minecraft.class_9448
 */
typealias ResetChatS2CPacket = net.minecraft.class_9448
/**
 * net.minecraft.class_5732
 */
typealias LargeDripstoneFeatureConfig = net.minecraft.class_5732
/**
 * net.minecraft.class_757
 */
typealias GameRenderer = net.minecraft.class_757
/**
 * net.minecraft.class_8062
 */
typealias SmithingTrimRecipe = net.minecraft.class_8062
/**
 * com.mojang.brigadier.tree.CommandNode
 */
typealias CommandNode<S> = com.mojang.brigadier.tree.CommandNode<S>
/**
 * net.minecraft.class_287
 */
typealias BufferBuilder = net.minecraft.class_287
/**
 * net.minecraft.class_8132
 */
typealias ThreePartsLayoutWidget = net.minecraft.class_8132
/**
 * net.minecraft.class_7399
 */
typealias MangroveRootPlacement = net.minecraft.class_7399
/**
 * net.minecraft.class_4981
 */
typealias ItemSteerable = net.minecraft.class_4981
/**
 * net.minecraft.class_7231
 */
typealias DimensionTypeRegistrar = net.minecraft.class_7231
/**
 * net.minecraft.class_5721
 */
typealias CaveSurface = net.minecraft.class_5721
/**
 * net.minecraft.class_668
 */
typealias ConnectionParticle = net.minecraft.class_668
/**
 * net.minecraft.class_5547
 */
typealias Degradable<T> = net.minecraft.class_5547<T>
/**
 * net.minecraft.class_801
 */
typealias json_ItemModelGenerator = net.minecraft.class_801
/**
 * net.minecraft.class_725
 */
typealias SquidInkParticle = net.minecraft.class_725
/**
 * net.minecraft.class_696
 */
typealias LargeFireSmokeParticle = net.minecraft.class_696
/**
 * net.minecraft.class_3298
 */
typealias Resource = net.minecraft.class_3298
/**
 * net.minecraft.class_4174
 */
typealias FoodComponent = net.minecraft.class_4174
/**
 * net.minecraft.class_4514
 */
typealias GameTestBatch = net.minecraft.class_4514
/**
 * net.minecraft.class_7947
 */
typealias AtlasLoader = net.minecraft.class_7947
/**
 * net.minecraft.class_1299
 */
typealias EntityType<T> = net.minecraft.class_1299<T>
/**
 * net.minecraft.class_3528
 */
typealias Lazy<T> = net.minecraft.class_3528<T>
/**
 * net.minecraft.class_8076
 */
typealias SmithingTrimRecipeJsonBuilder = net.minecraft.class_8076
/**
 * net.minecraft.class_2186
 */
typealias EntityArgumentType = net.minecraft.class_2186
/**
 * net.minecraft.class_4301
 */
typealias ZombieVillagerXpRebuildFix = net.minecraft.class_4301
/**
 * net.minecraft.class_9807
 */
typealias ServerLinksScreen = net.minecraft.class_9807
/**
 * net.minecraft.class_4620
 */
typealias PointOfInterestFix = net.minecraft.class_4620
/**
 * net.minecraft.class_9292
 */
typealias MapDecorationsComponent = net.minecraft.class_9292
/**
 * net.minecraft.class_2539
 */
typealias NetworkPhase = net.minecraft.class_2539
/**
 * net.minecraft.class_7845
 */
typealias GridWidget = net.minecraft.class_7845
/**
 * net.minecraft.class_5405
 */
typealias DialogScreen = net.minecraft.class_5405
/**
 * net.minecraft.class_4224
 */
typealias Source = net.minecraft.class_4224
/**
 * net.minecraft.class_2871
 */
typealias UpdateCommandBlockMinecartC2SPacket = net.minecraft.class_2871
/**
 * net.minecraft.class_8738
 */
typealias ChunkSentS2CPacket = net.minecraft.class_8738
/**
 * java.lang.RuntimeException
 */
typealias RuntimeException = java.lang.RuntimeException
/**
 * net.minecraft.class_809
 */
typealias ModelTransformation = net.minecraft.class_809
/**
 * net.minecraft.class_2641
 */
typealias CommandTreeS2CPacket = net.minecraft.class_2641
/**
 * net.minecraft.class_1071
 */
typealias PlayerSkinProvider = net.minecraft.class_1071
/**
 * com.mojang.serialization.MapLike
 */
typealias MapLike<T> = com.mojang.serialization.MapLike<T>
/**
 * net.minecraft.class_4740
 */
typealias FpsSmoother = net.minecraft.class_4740
/**
 * net.minecraft.class_419
 */
typealias DisconnectedScreen = net.minecraft.class_419
/**
 * net.minecraft.class_415
 */
typealias CustomizeBuffetLevelScreen = net.minecraft.class_415
/**
 * net.minecraft.class_3909
 */
typealias RaidGoal<T> = net.minecraft.class_3909<T>
/**
 * net.minecraft.class_7228
 */
typealias BiomeParametersProvider = net.minecraft.class_7228
/**
 * net.minecraft.class_6613
 */
typealias Finishable = net.minecraft.class_6613
/**
 * net.minecraft.class_39
 */
typealias LootTables = net.minecraft.class_39
/**
 * net.minecraft.class_666
 */
typealias DragonBreathParticle = net.minecraft.class_666
/**
 * net.minecraft.class_3949
 */
typealias WorldGenerationProgressListener = net.minecraft.class_3949
/**
 * net.minecraft.class_9019
 */
typealias StyleArgumentType = net.minecraft.class_9019
/**
 * net.minecraft.class_7259
 */
typealias StartSniffingTask = net.minecraft.class_7259
/**
 * net.minecraft.class_873
 */
typealias WorldGenAttemptDebugRenderer = net.minecraft.class_873
/**
 * net.minecraft.class_3152
 */
typealias EmeraldOreFeature = net.minecraft.class_3152
/**
 * net.minecraft.class_3069
 */
typealias HelpCommand = net.minecraft.class_3069
/**
 * net.minecraft.class_534
 */
typealias RootSpectatorCommandGroup = net.minecraft.class_534
/**
 * net.minecraft.class_3112
 */
typealias ScheduleCommand = net.minecraft.class_3112
/**
 * net.minecraft.class_7143
 */
typealias FlatLevelGeneratorPresets = net.minecraft.class_7143
/**
 * com.mojang.datafixers.util.Function3
 */
typealias Function3<T1, T2, T3, R> = com.mojang.datafixers.util.Function3<T1, T2, T3, R>
/**
 * net.minecraft.class_7497
 */
typealias ApiServices = net.minecraft.class_7497
/**
 * com.mojang.datafixers.util.Function5
 */
typealias Function5<T1, T2, T3, T4, T5, R> = com.mojang.datafixers.util.Function5<T1, T2, T3, T4, T5, R>
/**
 * com.mojang.datafixers.util.Function4
 */
typealias Function4<T1, T2, T3, T4, R> = com.mojang.datafixers.util.Function4<T1, T2, T3, T4, R>
/**
 * com.mojang.datafixers.util.Function6
 */
typealias Function6<T1, T2, T3, T4, T5, T6, R> = com.mojang.datafixers.util.Function6<T1, T2, T3, T4, T5, T6, R>
/**
 * net.minecraft.class_1088
 */
typealias ModelLoader = net.minecraft.class_1088
/**
 * net.minecraft.class_592
 */
typealias LargePufferfishEntityModel<T> = net.minecraft.class_592<T>
/**
 * net.minecraft.class_2973
 */
typealias InvalidHierarchicalFileException = net.minecraft.class_2973
/**
 * net.minecraft.class_1082
 */
typealias LanguageResourceMetadata = net.minecraft.class_1082
/**
 * net.minecraft.class_2495
 */
typealias NbtIntArray = net.minecraft.class_2495
/**
 * net.minecraft.class_3351
 */
typealias IglooGenerator = net.minecraft.class_3351
/**
 * net.minecraft.class_1915
 */
typealias Merchant = net.minecraft.class_1915
/**
 * net.minecraft.class_2707
 */
typealias LookAtS2CPacket = net.minecraft.class_2707
/**
 * net.minecraft.class_4717
 */
typealias ChatInputSuggestor = net.minecraft.class_4717
/**
 * net.minecraft.class_477
 */
typealias CommandBlockScreen = net.minecraft.class_477
/**
 * net.minecraft.class_3439
 */
typealias RecipeBook = net.minecraft.class_3439
/**
 * net.minecraft.class_3137
 */
typealias RandomBooleanFeatureConfig = net.minecraft.class_3137
/**
 * net.minecraft.class_8564
 */
typealias RandomSequence = net.minecraft.class_8564
/**
 * net.minecraft.class_2298
 */
typealias CoralBlockBlock = net.minecraft.class_2298
/**
 * net.minecraft.class_27
 */
typealias UnmodifiableLevelProperties = net.minecraft.class_27
/**
 * net.minecraft.class_9123
 */
typealias TestFinder<T> = net.minecraft.class_9123<T>
/**
 * net.minecraft.class_2420
 */
typealias MushroomPlantBlock = net.minecraft.class_2420
/**
 * net.minecraft.class_7237
 */
typealias SaveLoading = net.minecraft.class_7237
/**
 * net.minecraft.class_507
 */
typealias RecipeBookWidget = net.minecraft.class_507
/**
 * net.minecraft.class_2771
 */
typealias SlabType = net.minecraft.class_2771
/**
 * net.minecraft.class_548
 */
typealias ArmorStandArmorEntityModel = net.minecraft.class_548
/**
 * net.minecraft.class_9360
 */
typealias ItemSubPredicate = net.minecraft.class_9360
/**
 * net.minecraft.class_3417
 */
typealias SoundEvents = net.minecraft.class_3417
/**
 * net.minecraft.class_6813
 */
typealias EndPlacedFeatures = net.minecraft.class_6813
/**
 * net.minecraft.class_3680
 */
typealias CatEntityModel<T> = net.minecraft.class_3680<T>
/**
 * net.minecraft.class_3877
 */
typealias SmokerRecipeBookScreen = net.minecraft.class_3877
/**
 * net.minecraft.class_1835
 */
typealias TridentItem = net.minecraft.class_1835
/**
 * net.minecraft.class_5521
 */
typealias SocialInteractionsPlayerListWidget = net.minecraft.class_5521
/**
 * net.minecraft.class_7370
 */
typealias AdvancementCriteriaRenameFix = net.minecraft.class_7370
/**
 * net.minecraft.class_2618
 */
typealias LidOpenable = net.minecraft.class_2618
/**
 * net.minecraft.class_445
 */
typealias CreditsScreen = net.minecraft.class_445
/**
 * net.minecraft.class_1386
 */
typealias SitGoal = net.minecraft.class_1386
/**
 * net.minecraft.class_2842
 */
typealias UpdatePlayerAbilitiesC2SPacket = net.minecraft.class_2842
/**
 * net.minecraft.class_675
 */
typealias EndRodParticle = net.minecraft.class_675
/**
 * net.minecraft.class_1992
 */
typealias FixedBiomeSource = net.minecraft.class_1992
/**
 * net.minecraft.class_5798
 */
typealias LockHelper = net.minecraft.class_5798
/**
 * net.minecraft.class_4355
 */
typealias RealmsServiceException = net.minecraft.class_4355
/**
 * net.minecraft.class_2724
 */
typealias PlayerRespawnS2CPacket = net.minecraft.class_2724
/**
 * net.minecraft.class_677
 */
typealias FireworksSparkParticle = net.minecraft.class_677
/**
 * net.minecraft.class_5419
 */
typealias PiglinBruteEntity = net.minecraft.class_5419
/**
 * net.minecraft.class_7501
 */
typealias Signer = net.minecraft.class_7501
/**
 * net.minecraft.class_4384
 */
typealias RealmsBrokenWorldScreen = net.minecraft.class_4384
/**
 * net.minecraft.class_299
 */
typealias ClientRecipeBook = net.minecraft.class_299
/**
 * net.minecraft.class_9107
 */
typealias DefaultBlockUseCriterion = net.minecraft.class_9107
/**
 * it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
typealias ObjectArrayList<K> = it.unimi.dsi.fastutil.objects.ObjectArrayList<K>
/**
 * net.minecraft.class_2524
 */
typealias PacketEncryptionManager = net.minecraft.class_2524
/**
 * net.minecraft.class_3088
 */
typealias PardonIpCommand = net.minecraft.class_3088
/**
 * net.minecraft.class_3279
 */
typealias FileResourcePackProvider = net.minecraft.class_3279
/**
 * net.minecraft.class_5588
 */
typealias GeodeFeature = net.minecraft.class_5588
/**
 * net.minecraft.class_3302
 */
typealias ResourceReloader = net.minecraft.class_3302
/**
 * net.minecraft.class_3446
 */
typealias StatFormatter = net.minecraft.class_3446
/**
 * net.minecraft.class_1353
 */
typealias FollowParentGoal = net.minecraft.class_1353
/**
 * net.minecraft.class_4934
 */
typealias PropertiesMap = net.minecraft.class_4934
/**
 * net.minecraft.class_9276
 */
typealias BundleContentsComponent = net.minecraft.class_9276
/**
 * net.minecraft.class_3808
 */
typealias AbstractPropertiesHandler<T> = net.minecraft.class_3808<T>
/**
 * net.minecraft.class_3518
 */
typealias JsonHelper = net.minecraft.class_3518
/**
 * net.minecraft.class_600
 */
typealias ShieldEntityModel = net.minecraft.class_600
/**
 * net.minecraft.class_2646
 */
typealias TrappedChestBlockEntity = net.minecraft.class_2646
/**
 * net.minecraft.class_836
 */
typealias SkullBlockEntityRenderer = net.minecraft.class_836
/**
 * net.minecraft.class_312
 */
typealias Mouse = net.minecraft.class_312
/**
 * net.minecraft.class_3119
 */
typealias SetBlockCommand = net.minecraft.class_3119
/**
 * net.minecraft.class_14
 */
typealias LandPathNodeMaker = net.minecraft.class_14
/**
 * net.minecraft.class_1407
 */
typealias BirdNavigation = net.minecraft.class_1407
/**
 * net.minecraft.class_8726
 */
typealias DebugStructuresCustomPayload = net.minecraft.class_8726
/**
 * net.minecraft.class_6767
 */
typealias NetworkIoStatistics<T> = net.minecraft.class_6767<T>
/**
 * net.minecraft.class_630
 */
typealias ModelPart = net.minecraft.class_630
/**
 * net.minecraft.class_7662
 */
typealias ResourceMetadataMap = net.minecraft.class_7662
/**
 * net.minecraft.class_2213
 */
typealias BarrierBlock = net.minecraft.class_2213
/**
 * net.minecraft.class_2558
 */
typealias ClickEvent = net.minecraft.class_2558
/**
 * net.minecraft.class_3879
 */
typealias model_Model = net.minecraft.class_3879
/**
 * net.minecraft.class_5757
 */
typealias AquaticMoveControl = net.minecraft.class_5757
/**
 * net.minecraft.class_4809
 */
typealias MemoryTransferTask = net.minecraft.class_4809
/**
 * net.minecraft.class_2673
 */
typealias WorldEventS2CPacket = net.minecraft.class_2673
/**
 * it.unimi.dsi.fastutil.doubles.DoubleList
 */
typealias DoubleList = it.unimi.dsi.fastutil.doubles.DoubleList
/**
 * net.minecraft.class_3852
 */
typealias VillagerProfession = net.minecraft.class_3852
/**
 * net.minecraft.class_1431
 */
typealias CodEntity = net.minecraft.class_1431
/**
 * net.minecraft.class_3606
 */
typealias HangingEntityFix = net.minecraft.class_3606
/**
 * net.minecraft.class_3005
 */
typealias DesertWellFeature = net.minecraft.class_3005
/**
 * net.minecraft.class_6736
 */
typealias BuiltinNoiseParameters = net.minecraft.class_6736
/**
 * net.minecraft.class_6634
 */
typealias ChaseCommand = net.minecraft.class_6634
/**
 * net.minecraft.class_4103
 */
typealias CompositeTask<E> = net.minecraft.class_4103<E>
/**
 * net.minecraft.class_8102
 */
typealias DamageCommand = net.minecraft.class_8102
/**
 * net.minecraft.class_2595
 */
typealias ChestBlockEntity = net.minecraft.class_2595
/**
 * net.minecraft.class_5834
 */
typealias UnderwaterMagmaFeature = net.minecraft.class_5834
/**
 * net.minecraft.class_9182
 */
typealias HorseChestIndexingFix = net.minecraft.class_9182
/**
 * java.util.function.IntFunction
 */
typealias IntFunction<R> = java.util.function.IntFunction<R>
/**
 * net.minecraft.class_7243
 */
typealias CodecHolder<A> = net.minecraft.class_7243<A>
/**
 * net.minecraft.class_7098
 */
typealias WalkTowardsWaterTask = net.minecraft.class_7098
/**
 * net.minecraft.class_1739
 */
typealias AirBlockItem = net.minecraft.class_1739
/**
 * net.minecraft.class_433
 */
typealias GameMenuScreen = net.minecraft.class_433
/**
 * net.minecraft.class_3215
 */
typealias ServerChunkManager = net.minecraft.class_3215
/**
 * net.minecraft.class_8603
 */
typealias ChunkFilter = net.minecraft.class_8603
/**
 * net.minecraft.class_176
 */
typealias LootContextType = net.minecraft.class_176
/**
 * net.minecraft.class_5181
 */
typealias BastionData = net.minecraft.class_5181
/**
 * net.minecraft.class_4388
 */
typealias RealmsConfigureWorldScreen = net.minecraft.class_4388
/**
 * com.mojang.datafixers.kinds.K1
 */
typealias K1 = com.mojang.datafixers.kinds.K1
/**
 * net.minecraft.class_3818
 */
typealias AlwaysTrueRuleTest = net.minecraft.class_3818
/**
 * net.minecraft.class_9011
 */
typealias ScoreboardEntry = net.minecraft.class_9011
/**
 * net.minecraft.class_2675
 */
typealias ParticleS2CPacket = net.minecraft.class_2675
/**
 * java.net.URI
 */
typealias URI = java.net.URI
/**
 * java.net.URL
 */
typealias URL = java.net.URL
/**
 * net.minecraft.class_1738
 */
typealias ArmorItem = net.minecraft.class_1738
/**
 * net.minecraft.class_1874
 */
typealias AbstractCookingRecipe = net.minecraft.class_1874
/**
 * net.minecraft.class_3915
 */
typealias Property = net.minecraft.class_3915
/**
 * net.minecraft.class_3874
 */
typealias SmokerScreen = net.minecraft.class_3874
/**
 * net.minecraft.class_6625
 */
typealias StructureContext = net.minecraft.class_6625
/**
 * net.minecraft.class_8030
 */
typealias ScreenRect = net.minecraft.class_8030
/**
 * net.minecraft.class_2881
 */
typealias EnderDragonFight = net.minecraft.class_2881
/**
 * net.minecraft.class_7390
 */
typealias UpwardsBranchingTrunkPlacer = net.minecraft.class_7390
/**
 * net.minecraft.class_2901
 */
typealias LoginSuccessS2CPacket = net.minecraft.class_2901
/**
 * net.minecraft.class_7511
 */
typealias ChunkGenerators = net.minecraft.class_7511
/**
 * net.minecraft.class_3488
 */
typealias BlockRotStructureProcessor = net.minecraft.class_3488
/**
 * net.minecraft.class_2265
 */
typealias ColumnPos = net.minecraft.class_2265
/**
 * net.minecraft.class_8027
 */
typealias NavigationAxis = net.minecraft.class_8027
/**
 * net.minecraft.class_463
 */
typealias AbstractCommandBlockScreen = net.minecraft.class_463
/**
 * net.minecraft.class_9787
 */
typealias PortalManager = net.minecraft.class_9787
/**
 * net.minecraft.class_9118
 */
typealias TestAttemptConfig = net.minecraft.class_9118
/**
 * net.minecraft.class_1518
 */
typealias LandingPhase = net.minecraft.class_1518
/**
 * net.minecraft.class_1806
 */
typealias FilledMapItem = net.minecraft.class_1806
/**
 * net.minecraft.class_5866
 */
typealias UniformFloatProvider = net.minecraft.class_5866
/**
 * net.minecraft.class_1321
 */
typealias TameableEntity = net.minecraft.class_1321
/**
 * net.minecraft.class_4436
 */
typealias DownloadTask = net.minecraft.class_4436
/**
 * net.minecraft.class_7838
 */
typealias WrapperWidget = net.minecraft.class_7838
/**
 * net.minecraft.class_6075
 */
typealias HungerConstants = net.minecraft.class_6075
/**
 * com.mojang.serialization.MapEncoder
 */
typealias MapEncoder<A> = com.mojang.serialization.MapEncoder<A>
/**
 * net.minecraft.class_7805
 */
typealias ItemTagProvider = net.minecraft.class_7805
/**
 * net.minecraft.class_1086
 */
typealias ModelRotation = net.minecraft.class_1086
/**
 * net.minecraft.class_4645
 */
typealias AcaciaFoliagePlacer = net.minecraft.class_4645
/**
 * net.minecraft.class_609
 */
typealias SlimeEntityModel<T> = net.minecraft.class_609<T>
/**
 * net.minecraft.class_1308
 */
typealias MobEntity = net.minecraft.class_1308
/**
 * net.minecraft.class_6517
 */
typealias JfrProfile = net.minecraft.class_6517
/**
 * net.minecraft.class_6123
 */
typealias HeightProviderType<P> = net.minecraft.class_6123<P>
/**
 * net.minecraft.class_3469
 */
typealias StatHandler = net.minecraft.class_3469
/**
 * net.minecraft.class_4102
 */
typealias EntityLookTarget = net.minecraft.class_4102
/**
 * net.minecraft.class_576
 */
typealias MagmaCubeEntityModel<T> = net.minecraft.class_576<T>
/**
 * net.minecraft.class_6843
 */
typealias NbtScanQuery = net.minecraft.class_6843
/**
 * net.minecraft.class_3242
 */
typealias ServerNetworkIo = net.minecraft.class_3242
/**
 * net.minecraft.class_2476
 */
typealias SeagrassBlock = net.minecraft.class_2476
/**
 * net.minecraft.class_5685
 */
typealias SnowflakeParticle = net.minecraft.class_5685
/**
 * net.minecraft.class_2408
 */
typealias DataCache = net.minecraft.class_2408
/**
 * net.minecraft.class_7530
 */
typealias EditBox = net.minecraft.class_7530
/**
 * net.minecraft.class_535
 */
typealias SpectatorMenuCommandGroup = net.minecraft.class_535
/**
 * net.minecraft.class_422
 */
typealias AddServerScreen = net.minecraft.class_422
/**
 * net.minecraft.class_7444
 */
typealias Instrument = net.minecraft.class_7444
/**
 * net.minecraft.class_9724
 */
typealias ExplodeEnchantmentEffect = net.minecraft.class_9724
/**
 * net.minecraft.class_9669
 */
typealias ModifyContentsLootFunction = net.minecraft.class_9669
/**
 * net.minecraft.class_5452
 */
typealias CountMultilayerPlacementModifier = net.minecraft.class_5452
/**
 * net.minecraft.class_26
 */
typealias PersistentStateManager = net.minecraft.class_26
/**
 * java.util.function.Consumer
 */
typealias Consumer<T> = java.util.function.Consumer<T>
/**
 * net.minecraft.class_2757
 */
typealias ScoreboardScoreUpdateS2CPacket = net.minecraft.class_2757
/**
 * net.minecraft.class_9263
 */
typealias AreaEffectCloudPotionFix = net.minecraft.class_9263
/**
 * net.minecraft.class_9234
 */
typealias ChunkRegionSample = net.minecraft.class_9234
/**
 * net.minecraft.class_9388
 */
typealias Cut = net.minecraft.class_9388
/**
 * net.minecraft.class_4999
 */
typealias StriderEntityRenderer = net.minecraft.class_4999
/**
 * net.minecraft.class_3449
 */
typealias StructureStart = net.minecraft.class_3449
/**
 * net.minecraft.class_2330
 */
typealias IntegerArgumentSerializer = net.minecraft.class_2330
/**
 * net.minecraft.class_5851
 */
typealias CarvingMaskPlacementModifier = net.minecraft.class_5851
/**
 * net.minecraft.class_1694
 */
typealias ChestMinecartEntity = net.minecraft.class_1694
/**
 * net.minecraft.class_5673
 */
typealias ResettingNormalWorldTask = net.minecraft.class_5673
/**
 * net.minecraft.class_151
 */
typealias InvalidIdentifierException = net.minecraft.class_151
/**
 * net.minecraft.class_3873
 */
typealias FurnaceScreen = net.minecraft.class_3873
/**
 * net.minecraft.class_1532
 */
typealias LeashKnotEntity = net.minecraft.class_1532
/**
 * net.minecraft.class_9396
 */
typealias ParsingRule<S, T> = net.minecraft.class_9396<S, T>
/**
 * net.minecraft.class_5705
 */
typealias SculkSensorPhase = net.minecraft.class_5705
/**
 * net.minecraft.class_2277
 */
typealias Vec3ArgumentType = net.minecraft.class_2277
/**
 * net.minecraft.class_4864
 */
typealias AbstractPlantBlock = net.minecraft.class_4864
/**
 * net.minecraft.class_1577
 */
typealias GuardianEntity = net.minecraft.class_1577
/**
 * net.minecraft.class_5838
 */
typealias SleepManager = net.minecraft.class_5838
/**
 * net.minecraft.class_4666
 */
typealias StickyKeyBinding = net.minecraft.class_4666
/**
 * net.minecraft.class_957
 */
typealias TntMinecartEntityRenderer = net.minecraft.class_957
/**
 * net.minecraft.class_7707
 */
typealias HangingSignItem = net.minecraft.class_7707
/**
 * net.minecraft.class_8162
 */
typealias BrushItem = net.minecraft.class_8162
/**
 * net.minecraft.class_5269
 */
typealias MutableWorldProperties = net.minecraft.class_5269
/**
 * net.minecraft.class_4220
 */
typealias GoToSecondaryPositionTask = net.minecraft.class_4220
/**
 * net.minecraft.class_3106
 */
typealias SaveOffCommand = net.minecraft.class_3106
/**
 * net.minecraft.class_5520
 */
typealias SocialInteractionsManager = net.minecraft.class_5520
/**
 * java.io.Writer
 */
typealias Writer = java.io.Writer
/**
 * net.minecraft.class_584
 */
typealias ParrotEntityModel = net.minecraft.class_584
/**
 * net.minecraft.class_2889
 */
typealias HandshakeC2SPacket = net.minecraft.class_2889
/**
 * net.minecraft.class_8702
 */
typealias StringEncoding = net.minecraft.class_8702
/**
 * net.minecraft.class_1893
 */
typealias Enchantments = net.minecraft.class_1893
/**
 * net.minecraft.class_3118
 */
typealias SeedCommand = net.minecraft.class_3118
/**
 * net.minecraft.class_2419
 */
typealias VanillaEndTabAdvancementGenerator = net.minecraft.class_2419
/**
 * net.minecraft.class_347
 */
typealias LockButtonWidget = net.minecraft.class_347
/**
 * net.minecraft.class_3953
 */
typealias WorldGenerationProgressTracker = net.minecraft.class_3953
/**
 * net.minecraft.class_8575
 */
typealias LegacyDragonFightFix = net.minecraft.class_8575
/**
 * net.minecraft.class_2950
 */
typealias ForestRockFeature = net.minecraft.class_2950
/**
 * net.minecraft.class_4300
 */
typealias VillagerXpRebuildFix = net.minecraft.class_4300
/**
 * net.minecraft.class_8776
 */
typealias AbuseReportType = net.minecraft.class_8776
/**
 * net.minecraft.class_6192
 */
typealias PlayerActivity = net.minecraft.class_6192
/**
 * java.util.BitSet
 */
typealias BitSet = java.util.BitSet
/**
 * net.minecraft.class_4895
 */
typealias SmithingScreen = net.minecraft.class_4895
/**
 * net.minecraft.class_8848
 */
typealias ControlFlowAware<T> = net.minecraft.class_8848<T>
/**
 * net.minecraft.class_7260
 */
typealias WardenEntity = net.minecraft.class_7260
/**
 * net.minecraft.class_1501
 */
typealias LlamaEntity = net.minecraft.class_1501
/**
 * net.minecraft.class_9701
 */
typealias EnchantmentEffectComponentTypes = net.minecraft.class_9701
/**
 * net.minecraft.class_2745
 */
typealias ChestType = net.minecraft.class_2745
/**
 * net.minecraft.class_3722
 */
typealias LecternBlockEntity = net.minecraft.class_3722
/**
 * net.minecraft.class_1765
 */
typealias TallBlockItem = net.minecraft.class_1765
/**
 * net.minecraft.class_8011
 */
typealias RideCommand = net.minecraft.class_8011
/**
 * net.minecraft.class_8851
 */
typealias Forkable<T> = net.minecraft.class_8851<T>
/**
 * net.minecraft.class_9679
 */
typealias AbstractDustParticleEffect = net.minecraft.class_9679
/**
 * net.minecraft.class_5125
 */
typealias SessionLock = net.minecraft.class_5125
/**
 * net.minecraft.class_5888
 */
typealias ClearTitleS2CPacket = net.minecraft.class_5888
/**
 * net.minecraft.class_2743
 */
typealias EntityVelocityUpdateS2CPacket = net.minecraft.class_2743
/**
 * net.minecraft.class_1847
 */
typealias Potions = net.minecraft.class_1847
/**
 * net.minecraft.class_7376
 */
typealias EntitySubPredicate = net.minecraft.class_7376
/**
 * net.minecraft.class_7503
 */
typealias RemoveFilteredBookTextFix = net.minecraft.class_7503
/**
 * net.minecraft.class_6054
 */
typealias GoatBrain = net.minecraft.class_6054
/**
 * net.minecraft.class_1774
 */
typealias EndCrystalItem = net.minecraft.class_1774
/**
 * net.minecraft.class_1462
 */
typealias SalmonEntity = net.minecraft.class_1462
/**
 * net.minecraft.class_9111
 */
typealias FreeTypeUtil = net.minecraft.class_9111
/**
 * net.minecraft.class_7229
 */
typealias VanillaFlatLevelGeneratorPresetTagProvider = net.minecraft.class_7229
/**
 * net.minecraft.class_8771
 */
typealias SkinReportScreen = net.minecraft.class_8771
/**
 * net.minecraft.class_587
 */
typealias PigEntityModel<T> = net.minecraft.class_587<T>
/**
 * net.minecraft.class_2747
 */
typealias ComparatorMode = net.minecraft.class_2747
/**
 * net.minecraft.class_1751
 */
typealias BookItem = net.minecraft.class_1751
/**
 * net.minecraft.class_1686
 */
typealias PotionEntity = net.minecraft.class_1686
/**
 * net.minecraft.class_2453
 */
typealias RedstoneLampBlock = net.minecraft.class_2453
/**
 * net.minecraft.class_3853
 */
typealias TradeOffers = net.minecraft.class_3853
/**
 * net.minecraft.class_8560
 */
typealias SupportingBlockDebugRenderer = net.minecraft.class_8560
/**
 * net.minecraft.class_5326
 */
typealias WorkStationCompetitionTask = net.minecraft.class_5326
/**
 * net.minecraft.class_330
 */
typealias MapRenderer = net.minecraft.class_330
/**
 * net.minecraft.class_885
 */
typealias CodEntityRenderer = net.minecraft.class_885
/**
 * net.minecraft.class_2526
 */
typealias ShortPlantBlock = net.minecraft.class_2526
/**
 * net.minecraft.class_2954
 */
typealias BlueIceFeature = net.minecraft.class_2954
/**
 * net.minecraft.class_9022
 */
typealias NumberFormat = net.minecraft.class_9022
/**
 * net.minecraft.class_169
 */
typealias LootContextParameter<T> = net.minecraft.class_169<T>
/**
 * net.minecraft.class_7145
 */
typealias WorldPreset = net.minecraft.class_7145
/**
 * net.minecraft.class_2738
 */
typealias BlockFace = net.minecraft.class_2738
/**
 * net.minecraft.class_2574
 */
typealias NbtTextContent = net.minecraft.class_2574
/**
 * net.minecraft.class_3723
 */
typealias SmokerBlockEntity = net.minecraft.class_3723
/**
 * net.minecraft.class_219
 */
typealias RandomChanceLootCondition = net.minecraft.class_219
/**
 * net.minecraft.class_9224
 */
typealias ResourcePackInfo = net.minecraft.class_9224
/**
 * net.minecraft.class_8931
 */
typealias ExperimentalRegistriesValidator = net.minecraft.class_8931
/**
 * net.minecraft.class_6681
 */
typealias WouldSurviveBlockPredicate = net.minecraft.class_6681
/**
 * net.minecraft.class_2358
 */
typealias FireBlock = net.minecraft.class_2358
/**
 * net.minecraft.class_7254
 */
typealias WardenAngerManager = net.minecraft.class_7254
/**
 * net.minecraft.class_6568
 */
typealias ChunkNoiseSampler = net.minecraft.class_6568
/**
 * net.minecraft.class_4518
 */
typealias TestListener = net.minecraft.class_4518
/**
 * net.minecraft.class_4253
 */
typealias StartRaidTask = net.minecraft.class_4253
/**
 * net.minecraft.class_3012
 */
typealias BanIpCommand = net.minecraft.class_3012
/**
 * net.minecraft.class_6179
 */
typealias ClientMethodsReturnNonnullByDefault = net.minecraft.class_6179
/**
 * net.minecraft.class_9071
 */
typealias ArmadilloBrain = net.minecraft.class_9071
/**
 * net.minecraft.class_8728
 */
typealias DebugVillageSectionsCustomPayload = net.minecraft.class_8728
/**
 * net.minecraft.class_129
 */
typealias CrashReportSection = net.minecraft.class_129
/**
 * net.minecraft.class_1233
 */
typealias Schema1451v5 = net.minecraft.class_1233
/**
 * net.minecraft.class_1122
 */
typealias IdentifierSearchableIterator<T> = net.minecraft.class_1122<T>
/**
 * net.minecraft.class_1234
 */
typealias Schema1451v4 = net.minecraft.class_1234
/**
 * net.minecraft.class_2006
 */
typealias ConstructBeaconCriterion = net.minecraft.class_2006
/**
 * net.minecraft.class_1231
 */
typealias Schema1451v3 = net.minecraft.class_1231
/**
 * net.minecraft.class_1232
 */
typealias Schema1451v2 = net.minecraft.class_1232
/**
 * net.minecraft.class_4856
 */
typealias RepeatingAudioStream = net.minecraft.class_4856
/**
 * net.minecraft.class_1229
 */
typealias Schema1451v1 = net.minecraft.class_1229
/**
 * net.minecraft.class_9323
 */
typealias ComponentMap = net.minecraft.class_9323
/**
 * net.minecraft.class_5903
 */
typealias SubtitleS2CPacket = net.minecraft.class_5903
/**
 * net.minecraft.class_2316
 */
typealias ArgumentTypes = net.minecraft.class_2316
/**
 * net.minecraft.class_7737
 */
typealias RegistryEntryPredicateArgumentType<T> = net.minecraft.class_7737<T>
/**
 * net.minecraft.class_1718
 */
typealias EnchantmentScreenHandler = net.minecraft.class_1718
/**
 * net.minecraft.class_7648
 */
typealias PacketCallbacks = net.minecraft.class_7648
/**
 * net.minecraft.class_5538
 */
typealias SpyglassItem = net.minecraft.class_5538
/**
 * net.minecraft.class_2396
 */
typealias ParticleType<T> = net.minecraft.class_2396<T>
/**
 * net.minecraft.class_2867
 */
typealias RegionBasedStorage = net.minecraft.class_2867
/**
 * net.minecraft.class_367
 */
typealias AdvancementToast = net.minecraft.class_367
/**
 * net.minecraft.class_1236
 */
typealias Schema1451v6 = net.minecraft.class_1236
/**
 * net.minecraft.class_3317
 */
typealias BannedIpList = net.minecraft.class_3317
/**
 * net.minecraft.class_2748
 */
typealias ExperienceBarUpdateS2CPacket = net.minecraft.class_2748
/**
 * net.minecraft.class_9173
 */
typealias ClientRegistries = net.minecraft.class_9173
/**
 * net.minecraft.class_2739
 */
typealias EntityTrackerUpdateS2CPacket = net.minecraft.class_2739
/**
 * net.minecraft.class_9433
 */
typealias RegistryEntryArgumentType<T> = net.minecraft.class_9433<T>
/**
 * net.minecraft.class_4041
 */
typealias FoxEntityModel<T> = net.minecraft.class_4041<T>
/**
 * net.minecraft.class_2297
 */
typealias CoralFanBlock = net.minecraft.class_2297
/**
 * net.minecraft.class_2534
 */
typealias PacketDeflater = net.minecraft.class_2534
/**
 * net.minecraft.class_2271
 */
typealias CarrotsBlock = net.minecraft.class_2271
/**
 * net.minecraft.class_3204
 */
typealias ChunkTicketManager = net.minecraft.class_3204
/**
 * net.minecraft.class_8901
 */
typealias BlockBufferBuilderPool = net.minecraft.class_8901
/**
 * net.minecraft.class_421
 */
typealias FatalErrorScreen = net.minecraft.class_421
/**
 * net.minecraft.class_289
 */
typealias Tessellator = net.minecraft.class_289
/**
 * net.minecraft.class_4491
 */
typealias RenderCallStorage = net.minecraft.class_4491
/**
 * net.minecraft.class_3990
 */
typealias WanderingTraderManager = net.minecraft.class_3990
/**
 * net.minecraft.class_2044
 */
typealias EntityHurtPlayerCriterion = net.minecraft.class_2044
/**
 * net.minecraft.class_1166
 */
typealias EntityRidingToPassengerFix = net.minecraft.class_1166
/**
 * net.minecraft.class_5895
 */
typealias WorldBorderCenterChangedS2CPacket = net.minecraft.class_5895
/**
 * net.minecraft.class_9409
 */
typealias AnyIdParsingRule = net.minecraft.class_9409
/**
 * net.minecraft.class_3919
 */
typealias ArrayPropertyDelegate = net.minecraft.class_3919
/**
 * net.minecraft.class_2185
 */
typealias AbstractBannerBlock = net.minecraft.class_2185
/**
 * net.minecraft.class_1511
 */
typealias EndCrystalEntity = net.minecraft.class_1511
/**
 * net.minecraft.class_1452
 */
typealias PigEntity = net.minecraft.class_1452
/**
 * net.minecraft.class_3709
 */
typealias BellBlock = net.minecraft.class_3709
/**
 * net.minecraft.class_2069
 */
typealias ItemDurabilityChangedCriterion = net.minecraft.class_2069
/**
 * net.minecraft.class_834
 */
typealias ShulkerBoxBlockEntityRenderer = net.minecraft.class_834
/**
 * net.minecraft.class_3107
 */
typealias SaveOnCommand = net.minecraft.class_3107
/**
 * net.minecraft.class_6401
 */
typealias SamplerFactory = net.minecraft.class_6401
/**
 * net.minecraft.class_943
 */
typealias ShulkerEntityRenderer = net.minecraft.class_943
/**
 * net.minecraft.class_3019
 */
typealias BossBarCommand = net.minecraft.class_3019
/**
 * net.minecraft.class_3030
 */
typealias DeOpCommand = net.minecraft.class_3030
/**
 * net.minecraft.class_1500
 */
typealias MuleEntity = net.minecraft.class_1500
/**
 * net.minecraft.class_4647
 */
typealias FoliagePlacer = net.minecraft.class_4647
/**
 * net.minecraft.class_5642
 */
typealias SetEnchantmentsLootFunction = net.minecraft.class_5642
/**
 * net.minecraft.class_4949
 */
typealias VineLogic = net.minecraft.class_4949
/**
 * net.minecraft.class_261
 */
typealias OffsetDoubleList = net.minecraft.class_261
/**
 * net.minecraft.class_1005
 */
typealias WitchHeldItemFeatureRenderer<T> = net.minecraft.class_1005<T>
/**
 * net.minecraft.class_2909
 */
typealias LoginDisconnectS2CPacket = net.minecraft.class_2909
/**
 * net.minecraft.class_2772
 */
typealias PlayerListHeaderS2CPacket = net.minecraft.class_2772
/**
 * net.minecraft.class_2221
 */
typealias DeadCoralFanBlock = net.minecraft.class_2221
/**
 * net.minecraft.class_4128
 */
typealias ForgetCompletedPointOfInterestTask = net.minecraft.class_4128
/**
 * com.mojang.brigadier.Message
 */
typealias Message = com.mojang.brigadier.Message
/**
 * net.minecraft.class_1708
 */
typealias BrewingStandScreenHandler = net.minecraft.class_1708
/**
 * net.minecraft.class_4824
 */
typealias UpdateAttackTargetTask = net.minecraft.class_4824
/**
 * net.minecraft.class_1743
 */
typealias AxeItem = net.minecraft.class_1743
/**
 * net.minecraft.class_1684
 */
typealias EnderPearlEntity = net.minecraft.class_1684
/**
 * net.minecraft.class_6597
 */
typealias ChunkBuilderMode = net.minecraft.class_6597
/**
 * net.minecraft.class_6749
 */
typealias BlendingData = net.minecraft.class_6749
/**
 * net.minecraft.class_3345
 */
typealias DataStreamHelper = net.minecraft.class_3345
/**
 * net.minecraft.class_6734
 */
typealias BlockMarkerParticle = net.minecraft.class_6734
/**
 * net.minecraft.class_2493
 */
typealias SnowyBlock = net.minecraft.class_2493
/**
 * net.minecraft.class_1381
 */
typealias ProjectileAttackGoal = net.minecraft.class_1381
/**
 * net.minecraft.class_8257
 */
typealias PendingUpdateQueue = net.minecraft.class_8257
/**
 * net.minecraft.class_3002
 */
typealias CommandBossBar = net.minecraft.class_3002
/**
 * net.minecraft.class_1281
 */
typealias DamageRecord = net.minecraft.class_1281
/**
 * net.minecraft.class_3177
 */
typealias SimpleRandomFeature = net.minecraft.class_3177
/**
 * net.minecraft.class_2325
 */
typealias DropperBlock = net.minecraft.class_2325
/**
 * net.minecraft.class_6558
 */
typealias EntryMissingException = net.minecraft.class_6558
/**
 * net.minecraft.class_527
 */
typealias OptimizeWorldScreen = net.minecraft.class_527
/**
 * net.minecraft.class_4063
 */
typealias CloudRenderMode = net.minecraft.class_4063
/**
 * net.minecraft.class_241
 */
typealias Vec2f = net.minecraft.class_241
/**
 * net.minecraft.class_2672
 */
typealias ChunkDataS2CPacket = net.minecraft.class_2672
/**
 * net.minecraft.class_4237
 */
typealias SoundLoader = net.minecraft.class_4237
/**
 * net.minecraft.class_4219
 */
typealias GoToNearbyPositionTask = net.minecraft.class_4219
/**
 * net.minecraft.class_5892
 */
typealias DeathMessageS2CPacket = net.minecraft.class_5892
/**
 * net.minecraft.class_2614
 */
typealias HopperBlockEntity = net.minecraft.class_2614
/**
 * net.minecraft.class_5712
 */
typealias GameEvent = net.minecraft.class_5712
/**
 * net.minecraft.class_3283
 */
typealias ResourcePackManager = net.minecraft.class_3283
/**
 * net.minecraft.class_6012
 */
typealias Pool<E> = net.minecraft.class_6012<E>
/**
 * net.minecraft.class_1105
 */
typealias GuardianAttackSoundInstance = net.minecraft.class_1105
/**
 * net.minecraft.class_3798
 */
typealias TagMatchRuleTest = net.minecraft.class_3798
/**
 * net.minecraft.class_3168
 */
typealias SeagrassFeature = net.minecraft.class_3168
/**
 * net.minecraft.class_4708
 */
typealias BeeNestDestroyedCriterion = net.minecraft.class_4708
/**
 * net.minecraft.class_4516
 */
typealias TestContext = net.minecraft.class_4516
/**
 * it.unimi.dsi.fastutil.longs.LongSet
 */
typealias LongSet = it.unimi.dsi.fastutil.longs.LongSet
/**
 * net.minecraft.class_7709
 */
typealias CookingRecipeCategory = net.minecraft.class_7709
/**
 * net.minecraft.class_65
 */
typealias AlternativeEntry = net.minecraft.class_65
/**
 * net.minecraft.class_8625
 */
typealias DropInvalidSignDatafixDataFix = net.minecraft.class_8625
/**
 * net.minecraft.class_2697
 */
typealias BlockPatternBuilder = net.minecraft.class_2697
/**
 * net.minecraft.class_9041
 */
typealias ReloadScheduler = net.minecraft.class_9041
/**
 * net.minecraft.class_3670
 */
typealias SetNameLootFunction = net.minecraft.class_3670
/**
 * net.minecraft.class_3682
 */
typealias WindowProvider = net.minecraft.class_3682
/**
 * net.minecraft.class_9307
 */
typealias BannerPatternsComponent = net.minecraft.class_9307
/**
 * net.minecraft.class_8246
 */
typealias ClearRuleBlockEntityModifier = net.minecraft.class_8246
/**
 * com.google.gson.JsonDeserializationContext
 */
typealias JsonDeserializationContext = com.google.gson.JsonDeserializationContext
/**
 * net.minecraft.class_9109
 */
typealias ProjectileDeflection = net.minecraft.class_9109
/**
 * org.lwjgl.glfw.GLFWCharModsCallbackI
 */
typealias GLFWCharModsCallbackI = org.lwjgl.glfw.GLFWCharModsCallbackI
/**
 * net.minecraft.class_3062
 */
typealias FunctionCommand = net.minecraft.class_3062
/**
 * net.minecraft.class_6381
 */
typealias NarrationPart = net.minecraft.class_6381
/**
 * net.minecraft.class_3108
 */
typealias NetherFortressStructure = net.minecraft.class_3108
/**
 * net.minecraft.class_6216
 */
typealias MathMethodsReturnNonnullByDefault = net.minecraft.class_6216
/**
 * net.minecraft.class_2442
 */
typealias PoweredRailBlock = net.minecraft.class_2442
/**
 * net.minecraft.class_2620
 */
typealias BlockBreakingProgressS2CPacket = net.minecraft.class_2620
/**
 * net.minecraft.class_4945
 */
typealias TextureKey = net.minecraft.class_4945
/**
 * net.minecraft.class_4510
 */
typealias AbstractBeeSoundInstance = net.minecraft.class_4510
/**
 * net.minecraft.class_3536
 */
typealias ProgressListener = net.minecraft.class_3536
/**
 * net.minecraft.class_2623
 */
typealias BlockEventS2CPacket = net.minecraft.class_2623
/**
 * net.minecraft.class_561
 */
typealias CodEntityModel<T> = net.minecraft.class_561<T>
/**
 * net.minecraft.class_4014
 */
typealias SimpleResourceReload<S> = net.minecraft.class_4014<S>
/**
 * net.minecraft.class_6802
 */
typealias EndConfiguredFeatures = net.minecraft.class_6802
/**
 * net.minecraft.class_5672
 */
typealias RealmsWorldGeneratorType = net.minecraft.class_5672
/**
 * net.minecraft.class_3541
 */
typealias SimplexNoiseSampler = net.minecraft.class_3541
/**
 * net.minecraft.class_8761
 */
typealias PingMeasurer = net.minecraft.class_8761
/**
 * net.minecraft.class_1197
 */
typealias ChoiceFix = net.minecraft.class_1197
/**
 * net.minecraft.class_5616
 */
typealias BlockEntityRendererFactories = net.minecraft.class_5616
/**
 * net.minecraft.class_6655
 */
typealias BlockColumnFeatureConfig = net.minecraft.class_6655
/**
 * net.minecraft.class_9717
 */
typealias DamageEntityEnchantmentEffect = net.minecraft.class_9717
/**
 * net.minecraft.class_1403
 */
typealias TrackOwnerAttackerGoal = net.minecraft.class_1403
/**
 * net.minecraft.class_8847
 */
typealias CommandQueueEntry<T> = net.minecraft.class_8847<T>
/**
 * net.minecraft.class_7782
 */
typealias SerializableRegistries = net.minecraft.class_7782
/**
 * net.minecraft.class_2218
 */
typealias OperationArgumentType = net.minecraft.class_2218
/**
 * net.minecraft.class_7280
 */
typealias WardenEntityModel<T> = net.minecraft.class_7280<T>
/**
 * net.minecraft.class_2357
 */
typealias DispenserBehavior = net.minecraft.class_2357
/**
 * net.minecraft.class_9236
 */
typealias AbstractWindChargeEntity = net.minecraft.class_9236
/**
 * net.minecraft.class_2806
 */
typealias ChunkStatus = net.minecraft.class_2806
/**
 * net.minecraft.class_1730
 */
typealias EnderChestInventory = net.minecraft.class_1730
/**
 * net.minecraft.class_1656
 */
typealias PlayerAbilities = net.minecraft.class_1656
/**
 * net.minecraft.class_1854
 */
typealias FireworkStarFadeRecipe = net.minecraft.class_1854
/**
 * net.minecraft.class_3232
 */
typealias FlatChunkGeneratorConfig = net.minecraft.class_3232
/**
 * net.minecraft.class_9205
 */
typealias VaultSharedData = net.minecraft.class_9205
/**
 * net.minecraft.class_8029
 */
typealias ScreenPos = net.minecraft.class_8029
/**
 * net.minecraft.class_6045
 */
typealias NearestVisibleLivingEntitySensor = net.minecraft.class_6045
/**
 * net.minecraft.class_3713
 */
typealias GrindstoneBlock = net.minecraft.class_3713
/**
 * net.minecraft.class_476
 */
typealias GenericContainerScreen = net.minecraft.class_476
/**
 * net.minecraft.class_3559
 */
typealias BedItemColorFix = net.minecraft.class_3559
/**
 * net.minecraft.class_1113
 */
typealias SoundInstance = net.minecraft.class_1113
/**
 * it.unimi.dsi.fastutil.booleans.BooleanConsumer
 */
typealias BooleanConsumer = it.unimi.dsi.fastutil.booleans.BooleanConsumer
/**
 * net.minecraft.class_9141
 */
typealias PacketDecoder<I, T> = net.minecraft.class_9141<I, T>
/**
 * net.minecraft.class_4668
 */
typealias RenderPhase = net.minecraft.class_4668
/**
 * net.minecraft.class_5528
 */
typealias CauldronRenameFix = net.minecraft.class_5528
/**
 * net.minecraft.class_2474
 */
typealias TagProvider<T> = net.minecraft.class_2474<T>
/**
 * net.minecraft.class_9703
 */
typealias EnchantmentEffectTarget = net.minecraft.class_9703
/**
 * net.minecraft.class_8153
 */
typealias SnifferEntity = net.minecraft.class_8153
/**
 * net.minecraft.class_161
 */
typealias Advancement = net.minecraft.class_161
/**
 * net.minecraft.class_3597
 */
typealias EntityCustomNameToTextFix = net.minecraft.class_3597
/**
 * net.minecraft.class_5936
 */
typealias EffectShaderProgram = net.minecraft.class_5936
/**
 * net.minecraft.class_1107
 */
typealias MinecartInsideSoundInstance = net.minecraft.class_1107
/**
 * net.minecraft.class_996
 */
typealias SnowGolemPumpkinFeatureRenderer = net.minecraft.class_996
/**
 * net.minecraft.class_7837
 */
typealias MatrixUtil = net.minecraft.class_7837
/**
 * net.minecraft.class_1361
 */
typealias LookAtEntityGoal = net.minecraft.class_1361
/**
 * net.minecraft.class_3223
 */
typealias WoodlandMansionStructure = net.minecraft.class_3223
/**
 * net.minecraft.class_212
 */
typealias BlockStatePropertyLootCondition = net.minecraft.class_212
/**
 * net.minecraft.class_743
 */
typealias KeyboardInput = net.minecraft.class_743
/**
 * net.minecraft.class_338
 */
typealias ChatHud = net.minecraft.class_338
/**
 * net.minecraft.class_6796
 */
typealias PlacedFeature = net.minecraft.class_6796
/**
 * net.minecraft.class_9805
 */
typealias ProfilesTooltipComponent = net.minecraft.class_9805
/**
 * net.minecraft.class_2737
 */
typealias BambooLeaves = net.minecraft.class_2737
/**
 * net.minecraft.class_1545
 */
typealias BlazeEntity = net.minecraft.class_1545
/**
 * net.minecraft.class_2374
 */
typealias Position = net.minecraft.class_2374
/**
 * net.minecraft.class_1832
 */
typealias ToolMaterial = net.minecraft.class_1832
/**
 * net.minecraft.class_9651
 */
typealias Schema3818_5 = net.minecraft.class_9651
/**
 * net.minecraft.class_9272
 */
typealias Schema3818_4 = net.minecraft.class_9272
/**
 * net.minecraft.class_1606
 */
typealias ShulkerEntity = net.minecraft.class_1606
/**
 * net.minecraft.class_9271
 */
typealias Schema3818_3 = net.minecraft.class_9271
/**
 * net.minecraft.class_2859
 */
typealias AdvancementTabC2SPacket = net.minecraft.class_2859
/**
 * net.minecraft.class_2422
 */
typealias BlockListProvider = net.minecraft.class_2422
/**
 * net.minecraft.class_3850
 */
typealias VillagerData = net.minecraft.class_3850
/**
 * net.minecraft.class_21
 */
typealias MapDecorationTypes = net.minecraft.class_21
/**
 * net.minecraft.class_9413
 */
typealias Literals = net.minecraft.class_9413
/**
 * net.minecraft.class_597
 */
typealias QuadrupedEntityModel<T> = net.minecraft.class_597<T>
/**
 * net.minecraft.class_1853
 */
typealias FireworkStarRecipe = net.minecraft.class_1853
/**
 * net.minecraft.class_6872
 */
typealias RandomSpreadStructurePlacement = net.minecraft.class_6872
/**
 * net.minecraft.class_1829
 */
typealias SwordItem = net.minecraft.class_1829
/**
 * net.minecraft.class_711
 */
typealias SpellParticle = net.minecraft.class_711
/**
 * net.minecraft.class_3195
 */
typealias Structure = net.minecraft.class_3195
/**
 * net.minecraft.class_9240
 */
typealias StorageKey = net.minecraft.class_9240
/**
 * net.minecraft.class_9238
 */
typealias BreezeWindChargeEntity = net.minecraft.class_9238
/**
 * net.minecraft.class_3781
 */
typealias SinglePoolElement = net.minecraft.class_3781
/**
 * net.minecraft.class_8889
 */
typealias StructurePoolAliasBinding = net.minecraft.class_8889
/**
 * net.minecraft.class_3082
 */
typealias MessageCommand = net.minecraft.class_3082
/**
 * net.minecraft.class_530
 */
typealias TeleportToSpecificPlayerSpectatorCommand = net.minecraft.class_530
/**
 * net.minecraft.class_2080
 */
typealias OnKilledCriterion = net.minecraft.class_2080
/**
 * net.minecraft.class_7151
 */
typealias StructureType<S> = net.minecraft.class_7151<S>
/**
 * net.minecraft.class_8525
 */
typealias ChunkDeleteLightFix = net.minecraft.class_8525
/**
 * net.minecraft.class_7979
 */
typealias WorldLoadedEvent = net.minecraft.class_7979
/**
 * net.minecraft.class_5492
 */
typealias TextReorderingProcessor = net.minecraft.class_5492
/**
 * net.minecraft.class_1399
 */
typealias RevengeGoal = net.minecraft.class_1399
/**
 * net.minecraft.class_9126
 */
typealias HandlerNames = net.minecraft.class_9126
/**
 * net.minecraft.class_3589
 */
typealias ChunkStatusFix = net.minecraft.class_3589
/**
 * net.minecraft.class_7587
 */
typealias Backoff = net.minecraft.class_7587
/**
 * net.minecraft.class_2915
 */
typealias LoginHelloC2SPacket = net.minecraft.class_2915
/**
 * net.minecraft.class_992
 */
typealias SaddleFeatureRenderer<T, M> = net.minecraft.class_992<T, M>
/**
 * net.minecraft.class_8046
 */
typealias Ownable = net.minecraft.class_8046
/**
 * net.minecraft.class_3240
 */
typealias LocalServerHandshakeNetworkHandler = net.minecraft.class_3240
/**
 * net.minecraft.class_1131
 */
typealias LanServerInfo = net.minecraft.class_1131
/**
 * net.minecraft.class_6790
 */
typealias TwistingVinesFeatureConfig = net.minecraft.class_6790
/**
 * net.minecraft.class_1498
 */
typealias HorseEntity = net.minecraft.class_1498
/**
 * net.minecraft.class_3611
 */
typealias Fluid = net.minecraft.class_3611
/**
 * net.minecraft.class_3491
 */
typealias StructureProcessor = net.minecraft.class_3491
/**
 * net.minecraft.class_1780
 */
typealias FireworkStarItem = net.minecraft.class_1780
/**
 * net.minecraft.class_6497
 */
typealias Range<T> = net.minecraft.class_6497<T>
/**
 * net.minecraft.class_567
 */
typealias GhastEntityModel<T> = net.minecraft.class_567<T>
/**
 * net.minecraft.class_8056
 */
typealias ArmorTrimPattern = net.minecraft.class_8056
/**
 * net.minecraft.class_2402
 */
typealias FluidFillable = net.minecraft.class_2402
/**
 * net.minecraft.class_6412
 */
typealias ClientSamplerSource = net.minecraft.class_6412
/**
 * net.minecraft.class_1054
 */
typealias TextureStitcherCannotFitException = net.minecraft.class_1054
/**
 * net.minecraft.class_4043
 */
typealias FoxHeldItemFeatureRenderer = net.minecraft.class_4043
/**
 * net.minecraft.class_2268
 */
typealias LookingPosArgument = net.minecraft.class_2268
/**
 * net.minecraft.class_963
 */
typealias VillagerEntityRenderer = net.minecraft.class_963
/**
 * net.minecraft.class_8224
 */
typealias Schema3438 = net.minecraft.class_8224
/**
 * net.minecraft.class_4465
 */
typealias Schema2100 = net.minecraft.class_4465
/**
 * net.minecraft.class_5617
 */
typealias EntityRendererFactory<T> = net.minecraft.class_5617<T>
/**
 * net.minecraft.class_5498
 */
typealias Perspective = net.minecraft.class_5498
/**
 * net.minecraft.class_1091
 */
typealias ModelIdentifier = net.minecraft.class_1091
/**
 * net.minecraft.class_6307
 */
typealias XmlReportingTestCompletionListener = net.minecraft.class_6307
/**
 * net.minecraft.class_4108
 */
typealias FollowCustomerTask = net.minecraft.class_4108
/**
 * net.minecraft.class_2382
 */
typealias Vec3i = net.minecraft.class_2382
/**
 * net.minecraft.class_2531
 */
typealias TrappedChestBlock = net.minecraft.class_2531
/**
 * net.minecraft.class_5670
 */
typealias LootScoreProvider = net.minecraft.class_5670
/**
 * net.minecraft.class_8506
 */
typealias Schema3448 = net.minecraft.class_8506
/**
 * net.minecraft.class_1333
 */
typealias LookControl = net.minecraft.class_1333
/**
 * net.minecraft.class_6903
 */
typealias RegistryOps<T> = net.minecraft.class_6903<T>
/**
 * net.minecraft.class_9687
 */
typealias RemoveEmptyItemInSuspiciousBlockFix = net.minecraft.class_9687
/**
 * net.minecraft.class_243
 */
typealias Vec3d = net.minecraft.class_243
/**
 * net.minecraft.class_9673
 */
typealias BufferedAudioStream = net.minecraft.class_9673
/**
 * net.minecraft.class_5734
 */
typealias DustColorTransitionParticle = net.minecraft.class_5734
/**
 * net.minecraft.class_945
 */
typealias SlimeEntityRenderer = net.minecraft.class_945
/**
 * net.minecraft.class_4646
 */
typealias BlobFoliagePlacer = net.minecraft.class_4646
/**
 * net.minecraft.class_1011
 */
typealias NativeImage = net.minecraft.class_1011
/**
 * net.minecraft.class_2148
 */
typealias UsedTotemCriterion = net.minecraft.class_2148
/**
 * it.unimi.dsi.fastutil.objects.Object2ObjectMap
 */
typealias Object2ObjectMap<K, V> = it.unimi.dsi.fastutil.objects.Object2ObjectMap<K, V>
/**
 * net.minecraft.class_8588
 */
typealias EnterReconfigurationS2CPacket = net.minecraft.class_8588
/**
 * net.minecraft.class_2885
 */
typealias PlayerInteractBlockC2SPacket = net.minecraft.class_2885
/**
 * net.minecraft.class_9098
 */
typealias LoginPackets = net.minecraft.class_9098
/**
 * net.minecraft.class_5327
 */
typealias TakeJobSiteTask = net.minecraft.class_5327
/**
 * net.minecraft.class_2487
 */
typealias NbtCompound = net.minecraft.class_2487
/**
 * net.minecraft.class_3078
 */
typealias ListCommand = net.minecraft.class_3078
/**
 * net.minecraft.class_8005
 */
typealias AdvancementDisplays = net.minecraft.class_8005
/**
 * net.minecraft.class_2381
 */
typealias MushroomBlock = net.minecraft.class_2381
/**
 * net.minecraft.class_8567
 */
typealias LootContextParameterSet = net.minecraft.class_8567
/**
 * net.minecraft.class_6954
 */
typealias DensityFunctions = net.minecraft.class_6954
/**
 * net.minecraft.class_3409
 */
typealias OceanRuinGenerator = net.minecraft.class_3409
/**
 * net.minecraft.class_2604
 */
typealias EntitySpawnS2CPacket = net.minecraft.class_2604
/**
 * net.minecraft.class_1640
 */
typealias WitchEntity = net.minecraft.class_1640
/**
 * net.minecraft.class_3872
 */
typealias BookScreen = net.minecraft.class_3872
/**
 * net.minecraft.class_8959
 */
typealias Spawner = net.minecraft.class_8959
/**
 * net.minecraft.class_1762
 */
typealias NetworkSyncedItem = net.minecraft.class_1762
/**
 * net.minecraft.class_2617
 */
typealias StatisticsS2CPacket = net.minecraft.class_2617
/**
 * net.minecraft.class_3716
 */
typealias SmokerBlock = net.minecraft.class_3716
/**
 * net.minecraft.class_2983
 */
typealias LoggerPrintStream = net.minecraft.class_2983
/**
 * net.minecraft.class_8940
 */
typealias IsolatedCommandAction<T> = net.minecraft.class_8940<T>
/**
 * net.minecraft.class_2499
 */
typealias NbtList = net.minecraft.class_2499
/**
 * net.minecraft.class_4097
 */
typealias MultiTickTask<E> = net.minecraft.class_4097<E>
/**
 * net.minecraft.class_8182
 */
typealias SnifferAnimations = net.minecraft.class_8182
/**
 * net.minecraft.class_382
 */
typealias GlyphRenderer = net.minecraft.class_382
/**
 * net.minecraft.class_9791
 */
typealias RegistryPair<T> = net.minecraft.class_9791<T>
/**
 * net.minecraft.class_7230
 */
typealias VanillaWorldPresetTagProvider = net.minecraft.class_7230
/**
 * net.minecraft.class_4565
 */
typealias DataCommandStorage = net.minecraft.class_4565
/**
 * net.minecraft.class_1748
 */
typealias BedItem = net.minecraft.class_1748
/**
 * net.minecraft.class_5571
 */
typealias ChunkDataAccess<T> = net.minecraft.class_5571<T>
/**
 * net.minecraft.class_1803
 */
typealias LingeringPotionItem = net.minecraft.class_1803
/**
 * net.minecraft.class_8133
 */
typealias LayoutWidget = net.minecraft.class_8133
/**
 * net.minecraft.class_2323
 */
typealias DoorBlock = net.minecraft.class_2323
/**
 * net.minecraft.class_870
 */
typealias StructureDebugRenderer = net.minecraft.class_870
/**
 * net.minecraft.class_5805
 */
typealias CaveVinesHeadBlock = net.minecraft.class_5805
/**
 * net.minecraft.class_1510
 */
typealias EnderDragonEntity = net.minecraft.class_1510
/**
 * net.minecraft.class_4791
 */
typealias HoglinEntityModel<T> = net.minecraft.class_4791<T>
/**
 * java.util.OptionalInt
 */
typealias OptionalInt = java.util.OptionalInt
/**
 * net.minecraft.class_4609
 */
typealias AffineTransformations = net.minecraft.class_4609
/**
 * net.minecraft.class_4818
 */
typealias StrollTask = net.minecraft.class_4818
/**
 * net.minecraft.class_1729
 */
typealias AbstractRecipeScreenHandler<I, R> = net.minecraft.class_1729<I, R>
/**
 * net.minecraft.class_1811
 */
typealias RangedWeaponItem = net.minecraft.class_1811
/**
 * net.minecraft.class_571
 */
typealias RavagerEntityModel = net.minecraft.class_571
/**
 * net.minecraft.class_2282
 */
typealias CocoaBlock = net.minecraft.class_2282
/**
 * net.minecraft.class_4802
 */
typealias TimeHelper = net.minecraft.class_4802
/**
 * net.minecraft.class_555
 */
typealias BlazeEntityModel<T> = net.minecraft.class_555<T>
/**
 * net.minecraft.class_4381
 */
typealias RealmsBackupScreen = net.minecraft.class_4381
/**
 * net.minecraft.class_2818
 */
typealias WorldChunk = net.minecraft.class_2818
/**
 * net.minecraft.class_4593
 */
typealias TintableAnimalModel<E> = net.minecraft.class_4593<E>
/**
 * net.minecraft.class_7751
 */
typealias CamelEntityModel<T> = net.minecraft.class_7751<T>
/**
 * net.minecraft.class_9188
 */
typealias SampleSubscriptionTracker = net.minecraft.class_9188
/**
 * net.minecraft.class_8614
 */
typealias OverlayResourcePack = net.minecraft.class_8614
/**
 * net.minecraft.class_4379
 */
typealias RealmsBackupInfoScreen = net.minecraft.class_4379
/**
 * net.minecraft.class_4074
 */
typealias StatusEffectSpriteManager = net.minecraft.class_4074
/**
 * net.minecraft.class_8666
 */
typealias ButtonTextures = net.minecraft.class_8666
/**
 * net.minecraft.class_828
 */
typealias EnchantingTableBlockEntityRenderer = net.minecraft.class_828
/**
 * net.minecraft.class_410
 */
typealias ConfirmScreen = net.minecraft.class_410
/**
 * net.minecraft.class_5304
 */
typealias SpecialSpawner = net.minecraft.class_5304
/**
 * net.minecraft.class_1934
 */
typealias GameMode = net.minecraft.class_1934
/**
 * net.minecraft.class_8177
 */
typealias BlockSetType = net.minecraft.class_8177
/**
 * net.minecraft.class_4387
 */
typealias RealmsClientIncompatibleScreen = net.minecraft.class_4387
/**
 * net.minecraft.class_8197
 */
typealias MultiNoiseBiomeSourceParameterList = net.minecraft.class_8197
/**
 * net.minecraft.class_9364
 */
typealias BookContent<T, C> = net.minecraft.class_9364<T, C>
/**
 * net.minecraft.class_8607
 */
typealias LegacyQueries = net.minecraft.class_8607
/**
 * net.minecraft.class_4101
 */
typealias WaitTask = net.minecraft.class_4101
/**
 * net.minecraft.class_8740
 */
typealias ServerQueryPingPacketListener = net.minecraft.class_8740
/**
 * net.minecraft.class_9044
 */
typealias ServerResourcePackManager = net.minecraft.class_9044
/**
 * net.minecraft.class_9346
 */
typealias WolfVariant = net.minecraft.class_9346
/**
 * com.mojang.authlib.minecraft.report.AbuseReport
 */
typealias report_AbuseReport = com.mojang.authlib.minecraft.report.AbuseReport
/**
 * net.minecraft.class_1344
 */
typealias EscapeSunlightGoal = net.minecraft.class_1344
/**
 * net.minecraft.class_704
 */
typealias CloudParticle = net.minecraft.class_704
/**
 * net.minecraft.class_3186
 */
typealias PlayerStatsGui = net.minecraft.class_3186
/**
 * net.minecraft.class_6845
 */
typealias SimpleNbtScanner = net.minecraft.class_6845
/**
 * net.minecraft.class_2300
 */
typealias EntitySelector = net.minecraft.class_2300
/**
 * net.minecraft.class_3980
 */
typealias CuboidBlockIterator = net.minecraft.class_3980
/**
 * net.minecraft.class_8716
 */
typealias DebugGoalSelectorCustomPayload = net.minecraft.class_8716
/**
 * net.minecraft.class_610
 */
typealias SquidEntityModel<T> = net.minecraft.class_610<T>
/**
 * net.minecraft.class_1699
 */
typealias SpawnerMinecartEntity = net.minecraft.class_1699
/**
 * net.minecraft.class_2378
 */
typealias Registry<T> = net.minecraft.class_2378<T>
/**
 * net.minecraft.class_8876
 */
typealias LevelLegacyWorldGenSettingsFix = net.minecraft.class_8876
/**
 * net.minecraft.class_3876
 */
typealias FurnaceRecipeBookScreen = net.minecraft.class_3876
/**
 * net.minecraft.class_7843
 */
typealias SimplePositioningWidget = net.minecraft.class_7843
/**
 * net.minecraft.class_3821
 */
typealias StructureProcessorRule = net.minecraft.class_3821
/**
 * net.minecraft.class_6669
 */
typealias LegacyBiomeMapping = net.minecraft.class_6669
/**
 * net.minecraft.class_3616
 */
typealias LavaFluid = net.minecraft.class_3616
/**
 * net.minecraft.class_2488
 */
typealias SnowBlock = net.minecraft.class_2488
/**
 * java.security.PrivateKey
 */
typealias PrivateKey = java.security.PrivateKey
/**
 * net.minecraft.class_6836
 */
typealias NbtScanner = net.minecraft.class_6836
/**
 * net.minecraft.class_3922
 */
typealias CampfireBlock = net.minecraft.class_3922
/**
 * net.minecraft.class_3886
 */
typealias ZombieEntityRenderer = net.minecraft.class_3886
/**
 * net.minecraft.class_1679
 */
typealias SpectralArrowEntity = net.minecraft.class_1679
/**
 * net.minecraft.class_5761
 */
typealias Bucketable = net.minecraft.class_5761
/**
 * net.minecraft.class_2437
 */
typealias VanillaFishingLootTableGenerator = net.minecraft.class_2437
/**
 * net.minecraft.class_3140
 */
typealias TagCommand = net.minecraft.class_3140
/**
 * net.minecraft.class_3127
 */
typealias SpawnPointCommand = net.minecraft.class_3127
/**
 * net.minecraft.class_4663
 */
typealias TreeDecoratorType<P> = net.minecraft.class_4663<P>
/**
 * net.minecraft.class_8950
 */
typealias BreezeBrain = net.minecraft.class_8950
/**
 * net.minecraft.class_6609
 */
typealias SimulationDistanceLevelPropagator = net.minecraft.class_6609
/**
 * net.minecraft.class_1916
 */
typealias TradeOfferList = net.minecraft.class_1916
/**
 * net.minecraft.class_3486
 */
typealias FluidTags = net.minecraft.class_3486
/**
 * net.minecraft.class_3505
 */
typealias TagManagerLoader = net.minecraft.class_3505
/**
 * net.minecraft.class_693
 */
typealias ItemPickupParticle = net.minecraft.class_693
/**
 * net.minecraft.class_8105
 */
typealias CachedMapper<K, V> = net.minecraft.class_8105<K, V>
/**
 * net.minecraft.class_9733
 */
typealias SetEnchantmentEffect = net.minecraft.class_9733
/**
 * net.minecraft.class_5636
 */
typealias CameraSubmersionType = net.minecraft.class_5636
/**
 * net.minecraft.class_1191
 */
typealias LeavesFix = net.minecraft.class_1191
/**
 * net.minecraft.class_2637
 */
typealias ChunkDeltaUpdateS2CPacket = net.minecraft.class_2637
/**
 * net.minecraft.class_1996
 */
typealias BrewedPotionCriterion = net.minecraft.class_1996
/**
 * net.minecraft.class_4439
 */
typealias RealmsPrepareConnectionTask = net.minecraft.class_4439
/**
 * net.minecraft.class_2616
 */
typealias EntityAnimationS2CPacket = net.minecraft.class_2616
/**
 * net.minecraft.class_1564
 */
typealias EvokerEntity = net.minecraft.class_1564
/**
 * net.minecraft.class_9656
 */
typealias ContainerPredicate = net.minecraft.class_9656
/**
 * net.minecraft.class_899
 */
typealias EvokerEntityRenderer<T> = net.minecraft.class_899<T>
/**
 * net.minecraft.class_4450
 */
typealias TextRenderingUtils = net.minecraft.class_4450
/**
 * net.minecraft.class_8532
 */
typealias GlyphContainer<T> = net.minecraft.class_8532<T>
/**
 * net.minecraft.class_8612
 */
typealias SendResourcePackTask = net.minecraft.class_8612
/**
 * net.minecraft.class_9728
 */
typealias RemoveBinomialEnchantmentEffect = net.minecraft.class_9728
/**
 * net.minecraft.class_9226
 */
typealias VersionedIdentifier = net.minecraft.class_9226
/**
 * net.minecraft.class_4652
 */
typealias BlockStateProviderType<P> = net.minecraft.class_4652<P>
/**
 * net.minecraft.class_3521
 */
typealias NetworkUtils = net.minecraft.class_3521
/**
 * net.minecraft.class_8922
 */
typealias BulbBlock = net.minecraft.class_8922
/**
 * net.minecraft.class_2246
 */
typealias Blocks = net.minecraft.class_2246
/**
 * net.minecraft.class_8853
 */
typealias CommandAction<T> = net.minecraft.class_8853<T>
/**
 * net.minecraft.class_740
 */
typealias RainSplashParticle = net.minecraft.class_740
/**
 * net.minecraft.class_2633
 */
typealias StructureBlockBlockEntity = net.minecraft.class_2633
/**
 * net.minecraft.class_456
 */
typealias AdvancementWidget = net.minecraft.class_456
/**
 * net.minecraft.class_2469
 */
typealias VanillaFluidTagProvider = net.minecraft.class_2469
/**
 * net.minecraft.class_199
 */
typealias EntityScoresLootCondition = net.minecraft.class_199
/**
 * net.minecraft.class_9223
 */
typealias SynchronizeRegistriesTask = net.minecraft.class_9223
/**
 * net.minecraft.class_4792
 */
typealias AshParticle = net.minecraft.class_4792
/**
 * net.minecraft.class_2611
 */
typealias EnderChestBlockEntity = net.minecraft.class_2611
/**
 * net.minecraft.class_4942
 */
typealias Model = net.minecraft.class_4942
/**
 * net.minecraft.class_5949
 */
typealias SampleType = net.minecraft.class_5949
/**
 * net.minecraft.class_1749
 */
typealias BoatItem = net.minecraft.class_1749
/**
 * net.minecraft.class_6026
 */
typealias Mount = net.minecraft.class_6026
/**
 * net.minecraft.class_2876
 */
typealias EnderDragonSpawnState = net.minecraft.class_2876
/**
 * net.minecraft.class_5206
 */
typealias DarkOakFoliagePlacer = net.minecraft.class_5206
/**
 * net.minecraft.class_2684
 */
typealias EntityS2CPacket = net.minecraft.class_2684
/**
 * net.minecraft.class_9014
 */
typealias ScoreAccess = net.minecraft.class_9014
/**
 * net.minecraft.class_5225
 */
typealias TextHandler = net.minecraft.class_5225
/**
 * net.minecraft.class_1827
 */
typealias VerticallyAttachableBlockItem = net.minecraft.class_1827
/**
 * net.minecraft.class_7897
 */
typealias Tasks = net.minecraft.class_7897
/**
 * net.minecraft.class_9096
 */
typealias HandshakePackets = net.minecraft.class_9096
/**
 * net.minecraft.class_4227
 */
typealias SoundListener = net.minecraft.class_4227
/**
 * net.minecraft.class_3060
 */
typealias ForceLoadCommand = net.minecraft.class_3060
/**
 * net.minecraft.class_9786
 */
typealias JukeboxTicksSinceSongStartedFix = net.minecraft.class_9786
/**
 * net.minecraft.class_4018
 */
typealias GoToVillageGoal = net.minecraft.class_4018
/**
 * net.minecraft.class_279
 */
typealias PostEffectProcessor = net.minecraft.class_279
/**
 * net.minecraft.class_5736
 */
typealias AbstractDustParticle<T> = net.minecraft.class_5736<T>
/**
 * net.minecraft.class_5650
 */
typealias LootNbtProviderType = net.minecraft.class_5650
/**
 * net.minecraft.class_7964
 */
typealias TelemetryLogger = net.minecraft.class_7964
/**
 * net.minecraft.class_2315
 */
typealias DispenserBlock = net.minecraft.class_2315
/**
 * net.minecraft.class_3513
 */
typealias Int2ObjectBiMap<K> = net.minecraft.class_3513<K>
/**
 * net.minecraft.class_4719
 */
typealias WoodType = net.minecraft.class_4719
/**
 * net.minecraft.class_8800
 */
typealias PngMetadata = net.minecraft.class_8800
/**
 * net.minecraft.class_4985
 */
typealias StriderEntity = net.minecraft.class_4985
/**
 * net.minecraft.class_3076
 */
typealias JungleTempleStructure = net.minecraft.class_3076
/**
 * net.minecraft.class_3720
 */
typealias BlastFurnaceBlockEntity = net.minecraft.class_3720
/**
 * net.minecraft.class_1335
 */
typealias MoveControl = net.minecraft.class_1335
/**
 * net.minecraft.class_6844
 */
typealias NbtCollector = net.minecraft.class_6844
/**
 * net.minecraft.class_3489
 */
typealias ItemTags = net.minecraft.class_3489
/**
 * net.minecraft.class_2242
 */
typealias BeetrootsBlock = net.minecraft.class_2242
/**
 * net.minecraft.class_1740
 */
typealias ArmorMaterials = net.minecraft.class_1740
/**
 * net.minecraft.class_819
 */
typealias MultipartModelComponent = net.minecraft.class_819
/**
 * net.minecraft.class_3881
 */
typealias ModelWithArms = net.minecraft.class_3881
/**
 * net.minecraft.class_3347
 */
typealias BufferHelper = net.minecraft.class_3347
/**
 * net.minecraft.class_526
 */
typealias SelectWorldScreen = net.minecraft.class_526
/**
 * net.minecraft.class_293
 */
typealias VertexFormat = net.minecraft.class_293
/**
 * net.minecraft.class_841
 */
typealias EndGatewayBlockEntityRenderer = net.minecraft.class_841
/**
 * net.minecraft.class_3122
 */
typealias OreFeature = net.minecraft.class_3122
/**
 * net.minecraft.class_2514
 */
typealias AbstractNbtNumber = net.minecraft.class_2514
/**
 * net.minecraft.class_1860
 */
typealias Recipe<T> = net.minecraft.class_1860<T>
/**
 * net.minecraft.class_9075
 */
typealias BreezeMovementUtil = net.minecraft.class_9075
/**
 * net.minecraft.class_837
 */
typealias SignBlockEntityRenderer = net.minecraft.class_837
/**
 * net.minecraft.class_1395
 */
typealias FlyGoal = net.minecraft.class_1395
/**
 * net.minecraft.class_3685
 */
typealias RawTextureDataLoader = net.minecraft.class_3685
/**
 * net.minecraft.class_4540
 */
typealias SeedMixer = net.minecraft.class_4540
/**
 * net.minecraft.class_8232
 */
typealias GlowInkSacItem = net.minecraft.class_8232
/**
 * net.minecraft.class_2497
 */
typealias NbtInt = net.minecraft.class_2497
/**
 * net.minecraft.class_3895
 */
typealias OpenWrittenBookS2CPacket = net.minecraft.class_3895
/**
 * net.minecraft.class_632
 */
typealias ClientAdvancementManager = net.minecraft.class_632
/**
 * net.minecraft.class_4317
 */
typealias RepairItemRecipe = net.minecraft.class_4317
/**
 * net.minecraft.class_1523
 */
typealias SittingFlamingPhase = net.minecraft.class_1523
/**
 * net.minecraft.class_5953
 */
typealias HoneycombItem = net.minecraft.class_5953
/**
 * net.minecraft.class_9299
 */
typealias TooltipAppender = net.minecraft.class_9299
/**
 * net.minecraft.class_6630
 */
typealias ChaseClient = net.minecraft.class_6630
/**
 * net.minecraft.class_5000
 */
typealias Orientation = net.minecraft.class_5000
/**
 * net.minecraft.class_4304
 */
typealias RaidCenterDebugRenderer = net.minecraft.class_4304
/**
 * net.minecraft.class_2777
 */
typealias EntityPositionS2CPacket = net.minecraft.class_2777
/**
 * net.minecraft.class_2552
 */
typealias SizePrepender = net.minecraft.class_2552
/**
 * net.minecraft.class_2480
 */
typealias ShulkerBoxBlock = net.minecraft.class_2480
/**
 * net.minecraft.class_3900
 */
typealias ChunkTaskPrioritySystem = net.minecraft.class_3900
/**
 * net.minecraft.class_734
 */
typealias TotemParticle = net.minecraft.class_734
/**
 * net.minecraft.class_588
 */
typealias PhantomEntityModel<T> = net.minecraft.class_588<T>
/**
 * net.minecraft.class_5325
 */
typealias WalkTowardJobSiteTask = net.minecraft.class_5325
/**
 * net.minecraft.class_3346
 */
typealias DesertTempleGenerator = net.minecraft.class_3346
/**
 * net.minecraft.class_1185
 */
typealias ItemShulkerBoxColorFix = net.minecraft.class_1185
/**
 * net.minecraft.class_6566
 */
typealias BaseRandom = net.minecraft.class_6566
/**
 * net.minecraft.class_2217
 */
typealias DeadCoralBlock = net.minecraft.class_2217
/**
 * net.minecraft.class_6791
 */
typealias WeightedListHeightProvider = net.minecraft.class_6791
/**
 * net.minecraft.class_3312
 */
typealias UserCache = net.minecraft.class_3312
/**
 * net.minecraft.class_4623
 */
typealias Boxes = net.minecraft.class_4623
/**
 * net.minecraft.class_5329
 */
typealias BlockCollisionSpliterator<T> = net.minecraft.class_5329<T>
/**
 * net.minecraft.class_6008
 */
typealias Weighted = net.minecraft.class_6008
/**
 * net.minecraft.class_4873
 */
typealias PingResult = net.minecraft.class_4873
/**
 * net.minecraft.class_5223
 */
typealias TextVisitFactory = net.minecraft.class_5223
/**
 * net.minecraft.class_7257
 */
typealias LookAtDisturbanceTask = net.minecraft.class_7257
/**
 * net.minecraft.class_2503
 */
typealias NbtLong = net.minecraft.class_2503
/**
 * net.minecraft.class_1008
 */
typealias GlDebug = net.minecraft.class_1008
/**
 * net.minecraft.class_3495
 */
typealias TagBuilder = net.minecraft.class_3495
/**
 * net.minecraft.class_6397
 */
typealias ZipCompressor = net.minecraft.class_6397
/**
 * net.minecraft.class_1719
 */
typealias FurnaceOutputSlot = net.minecraft.class_1719
/**
 * net.minecraft.class_6628
 */
typealias TelemetryManager = net.minecraft.class_6628
/**
 * net.minecraft.class_6342
 */
typealias TrapezoidHeightProvider = net.minecraft.class_6342
/**
 * net.minecraft.class_2813
 */
typealias ClickSlotC2SPacket = net.minecraft.class_2813
/**
 * net.minecraft.class_3560
 */
typealias LightStorage<M> = net.minecraft.class_3560<M>
/**
 * net.minecraft.class_8898
 */
typealias CrafterScreen = net.minecraft.class_8898
/**
 * net.minecraft.class_7533
 */
typealias CursorMovement = net.minecraft.class_7533
/**
 * net.minecraft.class_1525
 */
typealias StrafePlayerPhase = net.minecraft.class_1525
/**
 * net.minecraft.class_7573
 */
typealias AbuseReportReason = net.minecraft.class_7573
/**
 * net.minecraft.class_2572
 */
typealias KeybindTextContent = net.minecraft.class_2572
/**
 * net.minecraft.class_1926
 */
typealias FoliageColors = net.minecraft.class_1926
/**
 * net.minecraft.class_455
 */
typealias AdvancementObtainedStatus = net.minecraft.class_455

/**
 * net.minecraft.class_7367
 */
typealias InputSupplier<T> = net.minecraft.class_7367<T>
/**
 * net.minecraft.class_5800
 */
typealias AzaleaBlock = net.minecraft.class_5800
/**
 * net.minecraft.class_5707
 */
typealias BlockPositionSource = net.minecraft.class_5707
/**
 * java.util.Optional
 */
typealias Optional<T> = java.util.Optional<T>
/**
 * net.minecraft.class_4231
 */
typealias StaticSound = net.minecraft.class_4231
/**
 * net.minecraft.class_1065
 */
typealias DefaultClientResourcePackProvider = net.minecraft.class_1065
/**
 * net.minecraft.class_1845
 */
typealias BrewingRecipeRegistry = net.minecraft.class_1845
/**
 * net.minecraft.class_2688
 */
typealias State<O, S> = net.minecraft.class_2688<O, S>
/**
 * net.minecraft.class_3468
 */
typealias Stats = net.minecraft.class_3468
/**
 * net.minecraft.class_9304
 */
typealias ItemEnchantmentsComponent = net.minecraft.class_9304
/**
 * net.minecraft.class_1292
 */
typealias StatusEffectUtil = net.minecraft.class_1292
/**
 * net.minecraft.class_8736
 */
typealias ReadyC2SPacket = net.minecraft.class_8736
/**
 * net.minecraft.class_3951
 */
typealias WorldGenerationProgressLogger = net.minecraft.class_3951
/**
 * net.minecraft.class_2911
 */
typealias ServerLoginPacketListener = net.minecraft.class_2911
/**
 * java.lang.StringBuilder
 */
typealias StringBuilder = java.lang.StringBuilder
/**
 * net.minecraft.class_5196
 */
typealias BitStorageAlignFix = net.minecraft.class_5196
/**
 * net.minecraft.class_640
 */
typealias PlayerListEntry = net.minecraft.class_640
/**
 * net.minecraft.class_9681
 */
typealias NoopInboundHandler = net.minecraft.class_9681
/**
 * net.minecraft.class_9375
 */
typealias SetFireworkExplosionLootFunction = net.minecraft.class_9375
/**
 * net.minecraft.class_1092
 */
typealias BakedModelManager = net.minecraft.class_1092
/**
 * net.minecraft.class_4371
 */
typealias RealmsAcceptRejectButton = net.minecraft.class_4371
/**
 * net.minecraft.class_3679
 */
typealias ShaderProgramSetupView = net.minecraft.class_3679
/**
 * net.minecraft.class_930
 */
typealias ParrotEntityRenderer = net.minecraft.class_930
/**
 * net.minecraft.class_8004
 */
typealias OptionsAmbientOcclusionFix = net.minecraft.class_8004
/**
 * net.minecraft.class_386
 */
typealias BitmapFont = net.minecraft.class_386
/**
 * net.minecraft.class_2713
 */
typealias ChangeUnlockedRecipesS2CPacket = net.minecraft.class_2713
/**
 * net.minecraft.class_2311
 */
typealias DeadBushBlock = net.minecraft.class_2311
/**
 * net.minecraft.class_9266
 */
typealias EmptyItemInHotbarFix = net.minecraft.class_9266
/**
 * net.minecraft.class_826
 */
typealias ChestBlockEntityRenderer<T> = net.minecraft.class_826<T>
/**
 * net.minecraft.class_1770
 */
typealias ElytraItem = net.minecraft.class_1770
/**
 * net.minecraft.class_3222
 */
typealias ServerPlayerEntity = net.minecraft.class_3222
/**
 * net.minecraft.class_9668
 */
typealias FilteredLootFunction = net.minecraft.class_9668
/**
 * net.minecraft.class_9794
 */
typealias JukeboxManager = net.minecraft.class_9794
/**
 * net.minecraft.class_5169
 */
typealias ServerMBean = net.minecraft.class_5169
/**
 * net.minecraft.class_2143
 */
typealias UsedEnderEyeCriterion = net.minecraft.class_2143
/**
 * net.minecraft.class_2508
 */
typealias SignBlock = net.minecraft.class_2508
/**
 * net.minecraft.class_3920
 */
typealias CampfireCookingRecipe = net.minecraft.class_3920
/**
 * net.minecraft.class_4140
 */
typealias MemoryModuleType<U> = net.minecraft.class_4140<U>
/**
 * net.minecraft.class_1514
 */
typealias AbstractSittingPhase = net.minecraft.class_1514
/**
 * net.minecraft.class_1173
 */
typealias EntityTippedArrowFix = net.minecraft.class_1173
/**
 * net.minecraft.class_1393
 */
typealias MoveIntoWaterGoal = net.minecraft.class_1393
/**
 * net.minecraft.class_5489
 */
typealias MultilineText = net.minecraft.class_5489
/**
 * net.minecraft.class_167
 */
typealias AdvancementProgress = net.minecraft.class_167
/**
 * net.minecraft.class_3188
 */
typealias StrongholdStructure = net.minecraft.class_3188
/**
 * net.minecraft.class_8910
 */
typealias InvalidNbtException = net.minecraft.class_8910
/**
 * net.minecraft.class_3348
 */
typealias JungleTempleGenerator = net.minecraft.class_3348
/**
 * net.minecraft.class_7701
 */
typealias FeatureFlags = net.minecraft.class_7701
/**
 * net.minecraft.class_3715
 */
typealias LecternBlock = net.minecraft.class_3715
/**
 * net.minecraft.class_3533
 */
typealias ProfilerSystem = net.minecraft.class_3533
/**
 * net.minecraft.class_8012
 */
typealias Colors = net.minecraft.class_8012
/**
 * net.minecraft.class_1043
 */
typealias NativeImageBackedTexture = net.minecraft.class_1043
/**
 * net.minecraft.class_2606
 */
typealias ExperienceOrbSpawnS2CPacket = net.minecraft.class_2606
/**
 * net.minecraft.class_9171
 */
typealias RecreationStorage = net.minecraft.class_9171
/**
 * net.minecraft.class_5531
 */
typealias NoWaterTargeting = net.minecraft.class_5531
/**
 * net.minecraft.class_2336
 */
typealias EnderChestBlock = net.minecraft.class_2336
/**
 * net.minecraft.class_149
 */
typealias SetDamageLootFunction = net.minecraft.class_149
/**
 * net.minecraft.class_3890
 */
typealias VillagerResourceMetadataReader = net.minecraft.class_3890
/**
 * net.minecraft.class_2302
 */
typealias CropBlock = net.minecraft.class_2302
/**
 * net.minecraft.class_8497
 */
typealias QuickPlayLogger = net.minecraft.class_8497
/**
 * net.minecraft.class_2540
 */
typealias PacketByteBuf = net.minecraft.class_2540
/**
 * net.minecraft.class_1524
 */
typealias TakeoffPhase = net.minecraft.class_1524
/**
 * net.minecraft.class_6501
 */
typealias ToFloatFunction<C> = net.minecraft.class_6501<C>
/**
 * net.minecraft.class_9175
 */
typealias ClientTagLoader = net.minecraft.class_9175
/**
 * net.minecraft.class_6505
 */
typealias JfrProfiler = net.minecraft.class_6505
/**
 * net.minecraft.class_5328
 */
typealias ItemUsage = net.minecraft.class_5328
/**
 * net.minecraft.class_1171
 */
typealias EntityStringUuidFix = net.minecraft.class_1171
/**
 * net.minecraft.class_4257
 */
typealias VillagerBabiesSensor = net.minecraft.class_4257
/**
 * net.minecraft.class_6607
 */
typealias JfrCommand = net.minecraft.class_6607
/**
 * net.minecraft.class_6784
 */
typealias SolidBlockPredicate = net.minecraft.class_6784
/**
 * net.minecraft.class_2391
 */
typealias KelpPlantBlock = net.minecraft.class_2391
/**
 * net.minecraft.class_429
 */
typealias OptionsScreen = net.minecraft.class_429
/**
 * net.minecraft.class_1140
 */
typealias SoundSystem = net.minecraft.class_1140
/**
 * net.minecraft.class_3612
 */
typealias Fluids = net.minecraft.class_3612
/**
 * net.minecraft.class_2609
 */
typealias AbstractFurnaceBlockEntity = net.minecraft.class_2609
/**
 * net.minecraft.class_1758
 */
typealias OnAStickItem<T> = net.minecraft.class_1758<T>
/**
 * net.minecraft.class_223
 */
typealias MatchToolLootCondition = net.minecraft.class_223
/**
 * net.minecraft.class_5195
 */
typealias MusicSound = net.minecraft.class_5195
/**
 * net.minecraft.class_6732
 */
typealias RandomOffsetPlacementModifier = net.minecraft.class_6732
/**
 * net.minecraft.class_7451
 */
typealias SignedArgumentType<T> = net.minecraft.class_7451<T>
/**
 * net.minecraft.class_7569
 */
typealias ReporterEnvironment = net.minecraft.class_7569
/**
 * net.minecraft.class_5727
 */
typealias LargeDripstoneFeature = net.minecraft.class_5727
/**
 * net.minecraft.class_250
 */
typealias IdentityPairList = net.minecraft.class_250
/**
 * net.minecraft.class_2504
 */
typealias StainedGlassPaneBlock = net.minecraft.class_2504
/**
 * net.minecraft.class_2549
 */
typealias WallSkullBlock = net.minecraft.class_2549
/**
 * net.minecraft.class_8222
 */
typealias EntityBrushableBlockFieldsRenameFix = net.minecraft.class_8222
/**
 * net.minecraft.class_9139
 */
typealias PacketCodec<B, V> = net.minecraft.class_9139<B, V>
/**
 * net.minecraft.class_3170
 */
typealias ShipwreckStructure = net.minecraft.class_3170
/**
 * net.minecraft.class_5894
 */
typealias OverlayMessageS2CPacket = net.minecraft.class_5894
/**
 * net.minecraft.class_867
 */
typealias HeightmapDebugRenderer = net.minecraft.class_867
/**
 * net.minecraft.class_2923
 */
typealias PingResultS2CPacket = net.minecraft.class_2923
/**
 * net.minecraft.class_7591
 */
typealias MessageIndicator = net.minecraft.class_7591
/**
 * net.minecraft.class_1440
 */
typealias PandaEntity = net.minecraft.class_1440
/**
 * net.minecraft.class_2784
 */
typealias WorldBorder = net.minecraft.class_2784
/**
 * net.minecraft.class_8164
 */
typealias CraftingDecoratedPotRecipe = net.minecraft.class_8164
/**
 * net.minecraft.class_8146
 */
typealias Schema3326 = net.minecraft.class_8146
/**
 * net.minecraft.class_8106
 */
typealias Schema3325 = net.minecraft.class_8106
/**
 * net.minecraft.class_4737
 */
typealias LightmapCoordinatesRetriever<S> = net.minecraft.class_4737<S>
/**
 * net.minecraft.class_6801
 */
typealias UndergroundConfiguredFeatures = net.minecraft.class_6801
/**
 * net.minecraft.class_8148
 */
typealias Schema3328 = net.minecraft.class_8148
/**
 * net.minecraft.class_8147
 */
typealias Schema3327 = net.minecraft.class_8147
/**
 * net.minecraft.class_4807
 */
typealias AttackTask = net.minecraft.class_4807
/**
 * net.minecraft.class_8990
 */
typealias RegistryCloner<T> = net.minecraft.class_8990<T>
/**
 * net.minecraft.class_6089
 */
typealias LightBlock = net.minecraft.class_6089
/**
 * net.minecraft.class_645
 */
typealias SweepAttackParticle = net.minecraft.class_645
/**
 * net.minecraft.class_1953
 */
typealias TickPriority = net.minecraft.class_1953
/**
 * net.minecraft.class_5658
 */
typealias LootNumberProvider = net.minecraft.class_5658
/**
 * net.minecraft.class_617
 */
typealias VexEntityModel = net.minecraft.class_617
/**
 * net.minecraft.class_4732
 */
typealias DoubleBlockProperties = net.minecraft.class_4732
/**
 * net.minecraft.class_1757
 */
typealias ChorusFruitItem = net.minecraft.class_1757
/**
 * net.minecraft.class_4940
 */
typealias SimpleModelSupplier = net.minecraft.class_4940
/**
 * net.minecraft.class_9785
 */
typealias AttributeIdFix = net.minecraft.class_9785
/**
 * net.minecraft.class_5753
 */
typealias TemptationCooldownTask = net.minecraft.class_5753
/**
 * net.minecraft.class_8238
 */
typealias SnifferEggBlock = net.minecraft.class_8238
/**
 * net.minecraft.class_2373
 */
typealias TranslucentBlock = net.minecraft.class_2373
/**
 * net.minecraft.class_4643
 */
typealias TreeFeatureConfig = net.minecraft.class_4643
/**
 * net.minecraft.class_9348
 */
typealias SlotRange = net.minecraft.class_9348
/**
 * net.minecraft.class_7072
 */
typealias StructureSets = net.minecraft.class_7072
/**
 * net.minecraft.class_1665
 */
typealias PersistentProjectileEntity = net.minecraft.class_1665
/**
 * net.minecraft.class_3734
 */
typealias ScaffoldingItem = net.minecraft.class_3734
/**
 * net.minecraft.class_9661
 */
typealias WritableBookContentPredicate = net.minecraft.class_9661
/**
 * net.minecraft.class_9476
 */
typealias SetOminousBottleAmplifierLootFunction = net.minecraft.class_9476
/**
 * net.minecraft.class_12
 */
typealias WaterPathNodeMaker = net.minecraft.class_12
/**
 * net.minecraft.class_1358
 */
typealias StopAndLookAtEntityGoal = net.minecraft.class_1358
/**
 * net.minecraft.class_1682
 */
typealias ThrownEntity = net.minecraft.class_1682
/**
 * net.minecraft.class_8886
 */
typealias CrafterBlock = net.minecraft.class_8886
/**
 * net.minecraft.class_8572
 */
typealias FallLocation = net.minecraft.class_8572
/**
 * net.minecraft.class_2258
 */
typealias BubbleColumnBlock = net.minecraft.class_2258
/**
 * net.minecraft.class_1785
 */
typealias EntityBucketItem = net.minecraft.class_1785
/**
 * net.minecraft.class_5354
 */
typealias Angerable = net.minecraft.class_5354
/**
 * net.minecraft.class_4618
 */
typealias OutlineVertexConsumerProvider = net.minecraft.class_4618
/**
 * net.minecraft.class_977
 */
typealias DolphinHeldItemFeatureRenderer = net.minecraft.class_977
/**
 * net.minecraft.class_2274
 */
typealias Vec2ArgumentType = net.minecraft.class_2274
/**
 * net.minecraft.class_5587
 */
typealias GeodeLayerThicknessConfig = net.minecraft.class_5587
/**
 * net.minecraft.class_1041
 */
typealias Window = net.minecraft.class_1041
/**
 * net.minecraft.class_578
 */
typealias LlamaEntityModel<T> = net.minecraft.class_578<T>
/**
 * net.minecraft.class_6130
 */
typealias StructurePiecesHolder = net.minecraft.class_6130
/**
 * net.minecraft.class_9383
 */
typealias ReloadableRegistries = net.minecraft.class_9383
/**
 * java.util.function.DoubleConsumer
 */
typealias DoubleConsumer = java.util.function.DoubleConsumer
/**
 * net.minecraft.class_3738
 */
typealias ServerTask = net.minecraft.class_3738
/**
 * net.minecraft.class_3360
 */
typealias FeatureUpdater = net.minecraft.class_3360
/**
 * net.minecraft.class_3820
 */
typealias BlockStateMatchRuleTest = net.minecraft.class_3820
/**
 * net.minecraft.class_8014
 */
typealias OptionsAccessibilityOnboardFix = net.minecraft.class_8014
/**
 * net.minecraft.class_9699
 */
typealias EnchantmentEffectContext = net.minecraft.class_9699
/**
 * net.minecraft.class_1364
 */
typealias LookAtCustomerGoal = net.minecraft.class_1364
/**
 * net.minecraft.class_2440
 */
typealias PressurePlateBlock = net.minecraft.class_2440
/**
 * net.minecraft.class_7847
 */
typealias Positioner = net.minecraft.class_7847
/**
 * net.minecraft.class_2861
 */
typealias RegionFile = net.minecraft.class_2861
/**
 * net.minecraft.class_245
 */
typealias ArrayVoxelShape = net.minecraft.class_245
/**
 * net.minecraft.class_776
 */
typealias BlockRenderManager = net.minecraft.class_776
/**
 * net.minecraft.class_2430
 */
typealias VanillaBlockLootTableGenerator = net.minecraft.class_2430
/**
 * net.minecraft.class_5542
 */
typealias AmethystClusterBlock = net.minecraft.class_5542
/**
 * net.minecraft.class_3977
 */
typealias VersionedChunkStorage = net.minecraft.class_3977
/**
 * net.minecraft.class_7463
 */
typealias Decoration = net.minecraft.class_7463
/**
 * net.minecraft.class_7446
 */
typealias BannerPatterns = net.minecraft.class_7446
/**
 * net.minecraft.class_1133
 */
typealias LanServerPinger = net.minecraft.class_1133
/**
 * net.minecraft.class_7796
 */
typealias MetadataProvider = net.minecraft.class_7796
/**
 * net.minecraft.class_4466
 */
typealias BeeEntity = net.minecraft.class_4466
/**
 * net.minecraft.class_3442
 */
typealias ServerStatHandler = net.minecraft.class_3442
/**
 * net.minecraft.class_2769
 */
typealias property_Property<T> = net.minecraft.class_2769<T>
/**
 * net.minecraft.class_3093
 */
typealias PublishCommand = net.minecraft.class_3093
/**
 * net.minecraft.class_9359
 */
typealias PotionContentsPredicate = net.minecraft.class_9359
/**
 * net.minecraft.class_3827
 */
typealias RuleTestType<P> = net.minecraft.class_3827<P>
/**
 * net.minecraft.class_4176
 */
typealias FoodComponents = net.minecraft.class_4176
/**
 * net.minecraft.class_6373
 */
typealias CommonPingS2CPacket = net.minecraft.class_6373
/**
 * net.minecraft.class_3534
 */
typealias ProfilerTiming = net.minecraft.class_3534
/**
 * net.minecraft.class_3596
 */
typealias EntityCodSalmonFix = net.minecraft.class_3596
/**
 * net.minecraft.class_4431
 */
typealias JsonUtils = net.minecraft.class_4431
/**
 * net.minecraft.class_1752
 */
typealias BoneMealItem = net.minecraft.class_1752
/**
 * net.minecraft.class_9727
 */
typealias PlaySoundEnchantmentEffect = net.minecraft.class_9727
/**
 * net.minecraft.class_4356
 */
typealias RetryCallException = net.minecraft.class_4356
/**
 * net.minecraft.class_3802
 */
typealias GrindstoneScreen = net.minecraft.class_3802
/**
 * net.minecraft.class_8811
 */
typealias BlockTypes = net.minecraft.class_8811
/**
 * net.minecraft.class_3324
 */
typealias PlayerManager = net.minecraft.class_3324
/**
 * net.minecraft.class_1145
 */
typealias SoundInstanceListener = net.minecraft.class_1145
/**
 * net.minecraft.class_3275
 */
typealias NoiseBasedCountPlacementModifier = net.minecraft.class_3275
/**
 * net.minecraft.class_7954
 */
typealias DirectoryAtlasSource = net.minecraft.class_7954
/**
 * net.minecraft.class_7281
 */
typealias ShriekParticle = net.minecraft.class_7281
/**
 * it.unimi.dsi.fastutil.ints.IntList
 */
typealias IntList = it.unimi.dsi.fastutil.ints.IntList
/**
 * net.minecraft.class_221
 */
typealias KilledByPlayerLootCondition = net.minecraft.class_221
/**
 * net.minecraft.class_1936
 */
typealias WorldAccess = net.minecraft.class_1936
/**
 * net.minecraft.class_5875
 */
typealias ScatteredOreFeature = net.minecraft.class_5875
/**
 * net.minecraft.class_2280
 */
typealias DefaultPosArgument = net.minecraft.class_2280
/**
 * net.minecraft.class_106
 */
typealias EnchantWithLevelsLootFunction = net.minecraft.class_106
/**
 * net.minecraft.class_3751
 */
typealias JigsawBlockEntity = net.minecraft.class_3751
/**
 * net.minecraft.class_7719
 */
typealias GameEventDispatchManager = net.minecraft.class_7719
/**
 * net.minecraft.class_1419
 */
typealias ZombieSiegeManager = net.minecraft.class_1419
/**
 * net.minecraft.class_4180
 */
typealias SerializingRegionBasedStorage<R> = net.minecraft.class_4180<R>
/**
 * net.minecraft.class_1150
 */
typealias NoneTutorialStepHandler = net.minecraft.class_1150
/**
 * net.minecraft.class_5504
 */
typealias BuiltinBiomes = net.minecraft.class_5504
/**
 * net.minecraft.class_3855
 */
typealias AbstractFireballEntity = net.minecraft.class_3855
/**
 * net.minecraft.class_5172
 */
typealias ChainBlock = net.minecraft.class_5172
/**
 * net.minecraft.class_2199
 */
typealias AnvilBlock = net.minecraft.class_2199
/**
 * net.minecraft.class_2856
 */
typealias ResourcePackStatusC2SPacket = net.minecraft.class_2856
/**
 * net.minecraft.class_2884
 */
typealias SpectatorTeleportC2SPacket = net.minecraft.class_2884
/**
 * net.minecraft.class_4508
 */
typealias AggressiveBeeSoundInstance = net.minecraft.class_4508
/**
 * net.minecraft.class_3712
 */
typealias FletchingTableBlock = net.minecraft.class_3712
/**
 * net.minecraft.class_6832
 */
typealias StructureLocator = net.minecraft.class_6832
/**
 * net.minecraft.class_2014
 */
typealias CuredZombieVillagerCriterion = net.minecraft.class_2014
/**
 * net.minecraft.class_165
 */
typealias FurnaceSmeltLootFunction = net.minecraft.class_165
/**
 * net.minecraft.class_3822
 */
typealias NopStructureProcessor = net.minecraft.class_3822
/**
 * net.minecraft.class_2833
 */
typealias VehicleMoveC2SPacket = net.minecraft.class_2833
/**
 * net.minecraft.class_3999
 */
typealias ParticleTextureSheet = net.minecraft.class_3999
/**
 * net.minecraft.class_975
 */
typealias EndermanBlockFeatureRenderer = net.minecraft.class_975
/**
 * net.minecraft.class_7995
 */
typealias ValueLists = net.minecraft.class_7995
/**
 * net.minecraft.class_403
 */
typealias NoticeScreen = net.minecraft.class_403
/**
 * net.minecraft.class_2108
 */
typealias TravelCriterion = net.minecraft.class_2108
/**
 * net.minecraft.class_5137
 */
typealias Hoglin = net.minecraft.class_5137
/**
 * net.minecraft.class_9813
 */
typealias ReportType = net.minecraft.class_9813
/**
 * javax.swing.JScrollPane
 */
typealias JScrollPane = javax.swing.JScrollPane
/**
 * net.minecraft.class_942
 */
typealias SilverfishEntityRenderer = net.minecraft.class_942
/**
 * net.minecraft.class_3327
 */
typealias OperatorEntry = net.minecraft.class_3327
/**
 * net.minecraft.class_341
 */
typealias ChatMessages = net.minecraft.class_341
/**
 * net.minecraft.class_8617
 */
typealias PackOverlaysMetadata = net.minecraft.class_8617
/**
 * net.minecraft.class_8803
 */
typealias BlockKeys = net.minecraft.class_8803
/**
 * net.minecraft.class_6792
 */
typealias BiomePlacementModifier = net.minecraft.class_6792
/**
 * net.minecraft.class_5127
 */
typealias ThrowableDeliverer<T> = net.minecraft.class_5127<T>
/**
 * net.minecraft.class_283
 */
typealias PostEffectPass = net.minecraft.class_283
/**
 * net.minecraft.class_2934
 */
typealias NetherCaveCarver = net.minecraft.class_2934
/**
 * net.minecraft.class_7948
 */
typealias AtlasSource = net.minecraft.class_7948
/**
 * net.minecraft.class_1920
 */
typealias BlockRenderView = net.minecraft.class_1920
/**
 * net.minecraft.class_2599
 */
typealias ComparatorBlockEntity = net.minecraft.class_2599
/**
 * net.minecraft.class_4419
 */
typealias RealmsSelectWorldTemplateScreen = net.minecraft.class_4419
/**
 * net.minecraft.class_2257
 */
typealias BlockStateArgumentType = net.minecraft.class_2257
/**
 * net.minecraft.class_2661
 */
typealias DisconnectS2CPacket = net.minecraft.class_2661
/**
 * net.minecraft.class_4798
 */
typealias HoglinEntityRenderer = net.minecraft.class_4798
/**
 * net.minecraft.class_2025
 */
typealias DistancePredicate = net.minecraft.class_2025
/**
 * net.minecraft.class_2424
 */
typealias NetherPortal = net.minecraft.class_2424
/**
 * net.minecraft.class_4066
 */
typealias ParticlesMode = net.minecraft.class_4066
/**
 * net.minecraft.class_3300
 */
typealias ResourceManager = net.minecraft.class_3300
/**
 * net.minecraft.class_6407
 */
typealias StartedRidingCriterion = net.minecraft.class_6407
/**
 * net.minecraft.class_6584
 */
typealias SurfaceThresholdFilterPlacementModifier = net.minecraft.class_6584
/**
 * net.minecraft.class_5174
 */
typealias BastionBridgeData = net.minecraft.class_5174
/**
 * net.minecraft.class_377
 */
typealias FontStorage = net.minecraft.class_377
/**
 * net.minecraft.class_7617
 */
typealias RemoveMessageS2CPacket = net.minecraft.class_7617
/**
 * net.minecraft.class_4625
 */
typealias HugeMushroomFeature = net.minecraft.class_4625
/**
 * net.minecraft.class_3320
 */
typealias BannedIpEntry = net.minecraft.class_3320
/**
 * net.minecraft.class_2241
 */
typealias AbstractRailBlock = net.minecraft.class_2241
/**
 * net.minecraft.util.profiling.jfr.event.ChunkGenerationEvent
 */
typealias ChunkGenerationEvent = net.minecraft.util.profiling.jfr.event.ChunkGenerationEvent
/**
 * net.minecraft.class_9814
 */
typealias CustomReportDetailsS2CPacket = net.minecraft.class_9814
/**
 * net.minecraft.class_1428
 */
typealias ChickenEntity = net.minecraft.class_1428
/**
 * net.minecraft.class_5285
 */
typealias GeneratorOptions = net.minecraft.class_5285
/**
 * net.minecraft.class_1867
 */
typealias ShapelessRecipe = net.minecraft.class_1867
/**
 * net.minecraft.class_6121
 */
typealias ConstantHeightProvider = net.minecraft.class_6121
/**
 * net.minecraft.class_9712
 */
typealias AllOfEnchantmentEffects = net.minecraft.class_9712
/**
 * net.minecraft.class_266
 */
typealias ScoreboardObjective = net.minecraft.class_266
/**
 * com.google.gson.stream.JsonWriter
 */
typealias JsonWriter = com.google.gson.stream.JsonWriter
/**
 * net.minecraft.class_7663
 */
typealias PackFeatureSetMetadata = net.minecraft.class_7663
/**
 * net.minecraft.class_236
 */
typealias Timer<T> = net.minecraft.class_236<T>
/**
 * net.minecraft.class_5469
 */
typealias StructureProcessorLists = net.minecraft.class_5469
/**
 * net.minecraft.class_4770
 */
typealias AbstractFireBlock = net.minecraft.class_4770
/**
 * net.minecraft.class_1400
 */
typealias ActiveTargetGoal<T> = net.minecraft.class_1400<T>
/**
 * net.minecraft.class_8813
 */
typealias SaplingGenerator = net.minecraft.class_8813
/**
 * net.minecraft.class_7128
 */
typealias SculkSpreadManager = net.minecraft.class_7128
/**
 * net.minecraft.class_2995
 */
typealias ServerScoreboard = net.minecraft.class_2995
/**
 * net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent
 */
typealias NetworkSummaryEvent = net.minecraft.util.profiling.jfr.event.NetworkSummaryEvent
/**
 * net.minecraft.class_3286
 */
typealias VanillaDataPackProvider = net.minecraft.class_3286
/**
 * net.minecraft.class_2332
 */
typealias StringArgumentSerializer = net.minecraft.class_2332
/**
 * com.google.common.base.Stopwatch
 */
typealias Stopwatch = com.google.common.base.Stopwatch
/**
 * net.minecraft.class_4081
 */
typealias StatusEffectCategory = net.minecraft.class_4081
/**
 * net.minecraft.class_3185
 */
typealias SpringFeature = net.minecraft.class_3185
/**
 * com.mojang.blaze3d.platform.GLX
 */
typealias GLX = com.mojang.blaze3d.platform.GLX
/**
 * net.minecraft.class_3788
 */
typealias ChunkStatusFix2 = net.minecraft.class_3788
/**
 * net.minecraft.class_2454
 */
typealias CookingRecipeJsonBuilder = net.minecraft.class_2454
/**
 * net.minecraft.class_4941
 */
typealias ModelIds = net.minecraft.class_4941
/**
 * net.minecraft.class_9377
 */
typealias SetWritableBookPagesLootFunction = net.minecraft.class_9377
/**
 * net.minecraft.class_2969
 */
typealias FallibleItemDispenserBehavior = net.minecraft.class_2969
/**
 * net.minecraft.class_273
 */
typealias ScoreboardState = net.minecraft.class_273
/**
 * net.minecraft.class_9335
 */
typealias ComponentMapImpl = net.minecraft.class_9335
/**
 * net.minecraft.class_3564
 */
typealias BlockEntityBannerColorFix = net.minecraft.class_3564
/**
 * net.minecraft.class_6834
 */
typealias StructureGeneratorFactory<C> = net.minecraft.class_6834<C>
/**
 * net.minecraft.class_8891
 */
typealias StructurePoolAliasLookup = net.minecraft.class_8891
/**
 * net.minecraft.class_2839
 */
typealias ProtoChunk = net.minecraft.class_2839
/**
 * net.minecraft.class_2926
 */
typealias ServerMetadata = net.minecraft.class_2926
/**
 * net.minecraft.class_2409
 */
typealias AdvancementProvider = net.minecraft.class_2409
/**
 * net.minecraft.class_1852
 */
typealias SpecialCraftingRecipe = net.minecraft.class_1852
/**
 * net.minecraft.class_496
 */
typealias MinecartCommandBlockScreen = net.minecraft.class_496
/**
 * net.minecraft.class_2682
 */
typealias EmptyBlockView = net.minecraft.class_2682
/**
 * net.minecraft.class_5573
 */
typealias SectionedEntityCache<T> = net.minecraft.class_5573<T>
/**
 * net.minecraft.class_2379
 */
typealias EulerAngle = net.minecraft.class_2379
/**
 * net.minecraft.class_8939
 */
typealias FallthroughCommandAction<T> = net.minecraft.class_8939<T>
/**
 * net.minecraft.class_4837
 */
typealias PiglinActivity = net.minecraft.class_4837
/**
 * net.minecraft.class_5514
 */
typealias TextFilterer = net.minecraft.class_5514
/**
 * net.minecraft.class_2237
 */
typealias BlockWithEntity = net.minecraft.class_2237
/**
 * net.minecraft.class_6673
 */
typealias RandomSeed = net.minecraft.class_6673
/**
 * it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
typealias Int2IntFunction = it.unimi.dsi.fastutil.ints.Int2IntFunction
/**
 * net.minecraft.class_7828
 */
typealias PlayerRemoveS2CPacket = net.minecraft.class_7828
/**
 * net.minecraft.class_128
 */
typealias CrashReport = net.minecraft.class_128
/**
 * net.minecraft.class_3547
 */
typealias BlockLightStorage = net.minecraft.class_3547
/**
 * net.minecraft.class_9340
 */
typealias VanillaShearingLootTableGenerator = net.minecraft.class_9340
/**
 * net.minecraft.class_3561
 */
typealias FlatteningBiomeMapping = net.minecraft.class_3561
/**
 * net.minecraft.class_69
 */
typealias CombinedEntry = net.minecraft.class_69
/**
 * net.minecraft.class_310
 */
typealias MinecraftClient = net.minecraft.class_310
/**
 * net.minecraft.class_5631
 */
typealias BundleTooltipData = net.minecraft.class_5631
/**
 * net.minecraft.class_1186
 */
typealias ItemInstanceMapIdFix = net.minecraft.class_1186
/**
 * net.minecraft.class_1581
 */
typealias IllusionerEntity = net.minecraft.class_1581
/**
 * net.minecraft.class_9199
 */
typealias VaultBlockEntity = net.minecraft.class_9199
/**
 * net.minecraft.class_8700
 */
typealias NetworkStateTransitionHandler = net.minecraft.class_8700
/**
 * net.minecraft.class_2877
 */
typealias UpdateSignC2SPacket = net.minecraft.class_2877
/**
 * net.minecraft.class_5274
 */
typealias IronGolemWanderAroundGoal = net.minecraft.class_5274
/**
 * net.minecraft.class_2570
 */
typealias WitherSkullBlock = net.minecraft.class_2570
/**
 * net.minecraft.class_7699
 */
typealias FeatureSet = net.minecraft.class_7699
/**
 * net.minecraft.class_7635
 */
typealias LastSeenMessageList = net.minecraft.class_7635
/**
 * net.minecraft.class_5375
 */
typealias PackScreen = net.minecraft.class_5375
/**
 * com.mojang.datafixers.util.Pair
 */
typealias util_Pair<F, S> = com.mojang.datafixers.util.Pair<F, S>
/**
 * net.minecraft.class_894
 */
typealias EndermanEntityRenderer = net.minecraft.class_894
/**
 * net.minecraft.class_5865
 */
typealias TrapezoidFloatProvider = net.minecraft.class_5865
/**
 * net.minecraft.class_3865
 */
typealias FurnaceBlock = net.minecraft.class_3865
/**
 * net.minecraft.class_7946
 */
typealias PiglinHeadEntityModel = net.minecraft.class_7946
/**
 * net.minecraft.class_8080
 */
typealias LimbAnimator = net.minecraft.class_8080
/**
 * net.minecraft.class_8732
 */
typealias ClientConfigurationPacketListener = net.minecraft.class_8732
/**
 * net.minecraft.class_9416
 */
typealias NbtParsingRule = net.minecraft.class_9416
/**
 * net.minecraft.class_3331
 */
typealias ServerConfigList<K, V> = net.minecraft.class_3331<K, V>
/**
 * net.minecraft.class_8868
 */
typealias Procedure<T> = net.minecraft.class_8868<T>
/**
 * net.minecraft.class_6806
 */
typealias OreConfiguredFeatures = net.minecraft.class_6806
/**
 * net.minecraft.class_5804
 */
typealias CaveVinesBodyBlock = net.minecraft.class_5804
/**
 * net.minecraft.class_5585
 */
typealias GeodeLayerConfig = net.minecraft.class_5585
/**
 * net.minecraft.class_8113
 */
typealias DisplayEntity = net.minecraft.class_8113
/**
 * net.minecraft.class_2776
 */
typealias StructureBlockMode = net.minecraft.class_2776
/**
 * net.minecraft.class_1821
 */
typealias ShovelItem = net.minecraft.class_1821
/**
 * net.minecraft.class_1737
 */
typealias RecipeInputProvider = net.minecraft.class_1737
/**
 * com.mojang.serialization.MapCodec
 */
typealias MapCodec<A> = com.mojang.serialization.MapCodec<A>
/**
 * net.minecraft.class_8039
 */
typealias PacketBundleHandler = net.minecraft.class_8039
/**
 * net.minecraft.class_852
 */
typealias ChunkOcclusionDataBuilder = net.minecraft.class_852
/**
 * net.minecraft.class_8729
 */
typealias DebugWorldgenAttemptCustomPayload = net.minecraft.class_8729
/**
 * net.minecraft.class_144
 */
typealias SetLootTableLootFunction = net.minecraft.class_144
/**
 * net.minecraft.class_5961
 */
typealias DebugRecorder = net.minecraft.class_5961
/**
 * net.minecraft.class_2283
 */
typealias ChorusPlantBlock = net.minecraft.class_2283
/**
 * net.minecraft.class_8103
 */
typealias DamageTypeTags = net.minecraft.class_8103
/**
 * net.minecraft.class_2477
 */
typealias Language = net.minecraft.class_2477
/**
 * net.minecraft.class_2390
 */
typealias DustParticleEffect = net.minecraft.class_2390
/**
 * net.minecraft.class_3182
 */
typealias DedicatedServerGui = net.minecraft.class_3182
/**
 * net.minecraft.class_5780
 */
typealias MultifaceGrowthFeatureConfig = net.minecraft.class_5780
/**
 * net.minecraft.class_2761
 */
typealias WorldTimeUpdateS2CPacket = net.minecraft.class_2761
/**
 * net.minecraft.class_1836
 */
typealias TooltipType = net.minecraft.class_1836
/**
 * net.minecraft.class_5653
 */
typealias StorageLootNbtProvider = net.minecraft.class_5653
/**
 * net.minecraft.class_7448
 */
typealias SignedCommandArguments = net.minecraft.class_7448
/**
 * net.minecraft.class_1672
 */
typealias EyeOfEnderEntity = net.minecraft.class_1672
/**
 * net.minecraft.class_892
 */
typealias EndCrystalEntityRenderer = net.minecraft.class_892
/**
 * net.minecraft.class_9354
 */
typealias CustomDataPredicate = net.minecraft.class_9354
/**
 * net.minecraft.class_4883
 */
typealias RealmsWorldOptions = net.minecraft.class_4883
/**
 * net.minecraft.class_4840
 */
typealias PiglinEntityModel<T> = net.minecraft.class_4840<T>
/**
 * net.minecraft.class_8181
 */
typealias SingleStackInventory = net.minecraft.class_8181
/**
 * net.minecraft.class_8104
 */
typealias Brightness = net.minecraft.class_8104
/**
 * net.minecraft.class_5423
 */
typealias RegistryWorldView = net.minecraft.class_5423
/**
 * net.minecraft.class_3227
 */
typealias ServerLightingProvider = net.minecraft.class_3227
/**
 * net.minecraft.class_9632
 */
typealias ProjectilePowerS2CPacket = net.minecraft.class_9632
/**
 * net.minecraft.class_9424
 */
typealias ToolComponent = net.minecraft.class_9424
/**
 * net.minecraft.class_134
 */
typealias SetContentsLootFunction = net.minecraft.class_134
/**
 * net.minecraft.class_4325
 */
typealias RealmsMainScreen = net.minecraft.class_4325
/**
 * net.minecraft.class_6364
 */
typealias WindowFramebuffer = net.minecraft.class_6364
/**
 * net.minecraft.class_3411
 */
typealias OceanRuinStructure = net.minecraft.class_3411
/**
 * net.minecraft.class_4830
 */
typealias RemoveOffHandItemTask = net.minecraft.class_4830
/**
 * net.minecraft.class_2459
 */
typealias RedstoneTorchBlock = net.minecraft.class_2459
/**
 * net.minecraft.class_1360
 */
typealias SitOnOwnerShoulderGoal = net.minecraft.class_1360
/**
 * net.minecraft.class_4171
 */
typealias ScheduleBuilder = net.minecraft.class_4171

/**
 * net.minecraft.class_2866
 */
typealias UpdateBeaconC2SPacket = net.minecraft.class_2866
/**
 * net.minecraft.class_7952
 */
typealias AtlasSourceManager = net.minecraft.class_7952
/**
 * net.minecraft.class_7784
 */
typealias DataOutput = net.minecraft.class_7784
/**
 * java.io.Reader
 */
typealias Reader = java.io.Reader
/**
 * net.minecraft.class_6334
 */
typealias ClampedIntProvider = net.minecraft.class_6334
/**
 * net.minecraft.class_4425
 */
typealias RealmsSubscriptionInfoScreen = net.minecraft.class_4425
/**
 * net.minecraft.class_3666
 */
typealias EndSpikeFeatureConfig = net.minecraft.class_3666
/**
 * net.minecraft.class_3481
 */
typealias BlockTags = net.minecraft.class_3481
/**
 * net.minecraft.class_9421
 */
typealias FallAfterExplosionCriterion = net.minecraft.class_9421
/**
 * net.minecraft.class_3020
 */
typealias ClearCommand = net.minecraft.class_3020
/**
 * net.minecraft.class_8709
 */
typealias BrandCustomPayload = net.minecraft.class_8709
/**
 * net.minecraft.class_3940
 */
typealias BillboardParticle = net.minecraft.class_3940
/**
 * net.minecraft.class_6005
 */
typealias DataPool<E> = net.minecraft.class_6005<E>
/**
 * net.minecraft.class_7608
 */
typealias MessageBody = net.minecraft.class_7608
/**
 * net.minecraft.class_7832
 */
typealias FeaturesS2CPacket = net.minecraft.class_7832
/**
 * net.minecraft.class_7595
 */
typealias MessageTrustStatus = net.minecraft.class_7595
/**
 * net.minecraft.class_1538
 */
typealias LightningEntity = net.minecraft.class_1538
/**
 * net.minecraft.class_3083
 */
typealias OpCommand = net.minecraft.class_3083
/**
 * net.minecraft.class_1064
 */
typealias ResourceIndex = net.minecraft.class_1064
/**
 * net.minecraft.class_442
 */
typealias TitleScreen = net.minecraft.class_442
/**
 * net.minecraft.class_4214
 */
typealias WakeUpTask = net.minecraft.class_4214
/**
 * net.minecraft.class_606
 */
typealias SkeletonEntityModel<T> = net.minecraft.class_606<T>
/**
 * net.minecraft.class_3935
 */
typealias LecternScreen = net.minecraft.class_3935
/**
 * net.minecraft.class_6122
 */
typealias HeightProvider = net.minecraft.class_6122
/**
 * net.minecraft.class_2245
 */
typealias TimeArgumentType = net.minecraft.class_2245
/**
 * net.minecraft.class_4526
 */
typealias TestClassArgumentType = net.minecraft.class_4526
/**
 * it.unimi.dsi.fastutil.shorts.ShortList
 */
typealias ShortList = it.unimi.dsi.fastutil.shorts.ShortList
/**
 * net.minecraft.class_893
 */
typealias ElderGuardianEntityRenderer = net.minecraft.class_893
/**
 * net.minecraft.class_7771
 */
typealias SpriteDimensions = net.minecraft.class_7771
/**
 * net.minecraft.class_2587
 */
typealias BedBlockEntity = net.minecraft.class_2587
/**
 * net.minecraft.class_2981
 */
typealias EulaReader = net.minecraft.class_2981
/**
 * net.minecraft.class_4488
 */
typealias CopyStateLootFunction = net.minecraft.class_4488
/**
 * net.minecraft.class_8180
 */
typealias CherryTrunkPlacer = net.minecraft.class_8180
/**
 * net.minecraft.class_2952
 */
typealias RecipeGridAligner<T> = net.minecraft.class_2952<T>
/**
 * net.minecraft.class_4694
 */
typealias SpectateCommand = net.minecraft.class_4694
/**
 * net.minecraft.class_900
 */
typealias EvokerFangsEntityRenderer = net.minecraft.class_900
/**
 * net.minecraft.class_9062
 */
typealias ItemActionResult = net.minecraft.class_9062
/**
 * net.minecraft.class_613
 */
typealias TridentEntityModel = net.minecraft.class_613
/**
 * net.minecraft.class_7506
 */
typealias PointOfInterestRemoveFix = net.minecraft.class_7506
/**
 * net.minecraft.class_7204
 */
typealias SequencedPacketCreator = net.minecraft.class_7204
/**
 * net.minecraft.class_7594
 */
typealias MessageHandler = net.minecraft.class_7594
/**
 * net.minecraft.class_3871
 */
typealias BlastFurnaceScreen = net.minecraft.class_3871
/**
 * net.minecraft.class_8872
 */
typealias ExpandedMacro<T> = net.minecraft.class_8872<T>
/**
 * net.minecraft.class_8595
 */
typealias LoginQueryRequestPayload = net.minecraft.class_8595
/**
 * net.minecraft.class_44
 */
typealias ConstantLootNumberProvider = net.minecraft.class_44
/**
 * net.minecraft.class_9362
 */
typealias MaceItem = net.minecraft.class_9362
/**
 * net.minecraft.class_3861
 */
typealias SmeltingRecipe = net.minecraft.class_3861
/**
 * net.minecraft.class_8621
 */
typealias ResourcePackOpener<T> = net.minecraft.class_8621<T>
/**
 * java.util.function.ToDoubleFunction
 */
typealias ToDoubleFunction<T> = java.util.function.ToDoubleFunction<T>
/**
 * net.minecraft.class_7686
 */
typealias Schema3204 = net.minecraft.class_7686
/**
 * net.minecraft.class_4291
 */
typealias WanderAroundPointOfInterestGoal = net.minecraft.class_4291
/**
 * net.minecraft.class_7685
 */
typealias Schema3203 = net.minecraft.class_7685
/**
 * net.minecraft.class_7684
 */
typealias Schema3202 = net.minecraft.class_7684
/**
 * net.minecraft.class_6662
 */
typealias SetPotionLootFunction = net.minecraft.class_6662
/**
 * net.minecraft.class_2821
 */
typealias WrapperProtoChunk = net.minecraft.class_2821
/**
 * net.minecraft.class_4531
 */
typealias TestCompletionListener = net.minecraft.class_4531
/**
 * net.minecraft.class_6748
 */
typealias Blender = net.minecraft.class_6748
/**
 * net.minecraft.class_2427
 */
typealias RegistryDumpProvider = net.minecraft.class_2427
/**
 * net.minecraft.class_3048
 */
typealias EnchantCommand = net.minecraft.class_3048
/**
 * net.minecraft.class_4525
 */
typealias StructureTestUtil = net.minecraft.class_4525
/**
 * net.minecraft.class_1168
 */
typealias EntitySkeletonSplitFix = net.minecraft.class_1168
/**
 * net.minecraft.class_1382
 */
typealias StepAndDestroyBlockGoal = net.minecraft.class_1382
/**
 * net.minecraft.class_7988
 */
typealias VariantHolder<T> = net.minecraft.class_7988<T>
/**
 * net.minecraft.class_9135
 */
typealias PacketCodecs = net.minecraft.class_9135
/**
 * net.minecraft.class_7101
 */
typealias IsInWaterSensor = net.minecraft.class_7101
/**
 * net.minecraft.class_1366
 */
typealias MeleeAttackGoal = net.minecraft.class_1366
/**
 * net.minecraft.class_1732
 */
typealias RecipeUnlocker = net.minecraft.class_1732
/**
 * net.minecraft.class_2328
 */
typealias DragonEggBlock = net.minecraft.class_2328
/**
 * net.minecraft.class_7293
 */
typealias GameEventRenamesFix = net.minecraft.class_7293
/**
 * net.minecraft.class_1378
 */
typealias SwimAroundGoal = net.minecraft.class_1378
/**
 * net.minecraft.class_7713
 */
typealias HangingSignBlock = net.minecraft.class_7713
/**
 * net.minecraft.class_9211
 */
typealias DebugSampleSubscriber = net.minecraft.class_9211
/**
 * net.minecraft.class_3050
 */
typealias ExecuteCommand = net.minecraft.class_3050
/**
 * net.minecraft.class_3729
 */
typealias IllagerEntityRenderer<T> = net.minecraft.class_3729<T>
/**
 * net.minecraft.class_2622
 */
typealias BlockEntityUpdateS2CPacket = net.minecraft.class_2622
/**
 * net.minecraft.class_426
 */
typealias LanguageOptionsScreen = net.minecraft.class_426
/**
 * net.minecraft.class_1307
 */
typealias FlyingEntity = net.minecraft.class_1307
/**
 * net.minecraft.class_1473
 */
typealias SnowGolemEntity = net.minecraft.class_1473
/**
 * net.minecraft.class_6611
 */
typealias FlightProfiler = net.minecraft.class_6611
/**
 * com.mojang.authlib.minecraft.UserApiService
 */
typealias UserApiService = com.mojang.authlib.minecraft.UserApiService
/**
 * net.minecraft.class_46
 */
typealias LootContextAware = net.minecraft.class_46
/**
 * net.minecraft.class_3288
 */
typealias ResourcePackProfile = net.minecraft.class_3288
/**
 * net.minecraft.class_3264
 */
typealias ResourceType = net.minecraft.class_3264
/**
 * net.minecraft.class_5739
 */
typealias GameEventDebugRenderer = net.minecraft.class_5739
/**
 * net.minecraft.class_8110
 */
typealias DamageType = net.minecraft.class_8110
/**
 * net.minecraft.class_2447
 */
typealias ShapedRecipeJsonBuilder = net.minecraft.class_2447
/**
 * net.minecraft.class_9129
 */
typealias RegistryByteBuf = net.minecraft.class_9129
/**
 * net.minecraft.class_8184
 */
typealias SinglePartEntityModelWithChildTransform<E> = net.minecraft.class_8184<E>
/**
 * net.minecraft.class_109
 */
typealias EnchantRandomlyLootFunction = net.minecraft.class_109
/**
 * net.minecraft.class_9321
 */
typealias BoggedEntityModel = net.minecraft.class_9321
/**
 * net.minecraft.class_3665
 */
typealias ModelBakeSettings = net.minecraft.class_3665
/**
 * net.minecraft.class_4124
 */
typealias MeetVillagerTask = net.minecraft.class_4124
/**
 * net.minecraft.class_9027
 */
typealias ServerPackCommand = net.minecraft.class_9027
/**
 * net.minecraft.class_1109
 */
typealias PositionedSoundInstance = net.minecraft.class_1109
/**
 * net.minecraft.class_1228
 */
typealias Schema135 = net.minecraft.class_1228
/**
 * net.minecraft.class_5813
 */
typealias OxidizableSlabBlock = net.minecraft.class_5813
/**
 * net.minecraft.class_7641
 */
typealias ItemRemoveBlockEntityTagFix = net.minecraft.class_7641
/**
 * net.minecraft.class_1097
 */
typealias WeightedBakedModel = net.minecraft.class_1097
/**
 * net.minecraft.class_5937
 */
typealias EffectShaderStage = net.minecraft.class_5937
/**
 * net.minecraft.class_2742
 */
typealias BedPart = net.minecraft.class_2742
/**
 * net.minecraft.class_3829
 */
typealias Clearable = net.minecraft.class_3829
/**
 * com.mojang.brigadier.suggestion.Suggestions
 */
typealias Suggestions = com.mojang.brigadier.suggestion.Suggestions
/**
 * net.minecraft.class_655
 */
typealias WaterBubbleParticle = net.minecraft.class_655
/**
 * net.minecraft.class_914
 */
typealias IllusionerEntityRenderer = net.minecraft.class_914
/**
 * net.minecraft.class_637
 */
typealias ClientCommandSource = net.minecraft.class_637
/**
 * net.minecraft.class_2768
 */
typealias RailShape = net.minecraft.class_2768
/**
 * net.minecraft.class_5801
 */
typealias BigDripleafBlock = net.minecraft.class_5801
/**
 * net.minecraft.class_7427
 */
typealias PlayerKeyPair = net.minecraft.class_7427
/**
 * net.minecraft.class_897
 */
typealias EntityRenderer<T> = net.minecraft.class_897<T>
/**
 * net.minecraft.class_1221
 */
typealias Schema102 = net.minecraft.class_1221
/**
 * net.minecraft.class_1222
 */
typealias Schema100 = net.minecraft.class_1222
/**
 * net.minecraft.class_1266
 */
typealias LocalDifficulty = net.minecraft.class_1266
/**
 * net.minecraft.class_1223
 */
typealias Schema106 = net.minecraft.class_1223
/**
 * net.minecraft.class_8035
 */
typealias PacketBundler = net.minecraft.class_8035
/**
 * net.minecraft.class_1226
 */
typealias Schema107 = net.minecraft.class_1226
/**
 * net.minecraft.class_8982
 */
typealias TrialSpawnerDetectionParticle = net.minecraft.class_8982
/**
 * com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
typealias DynamicCommandExceptionType = com.mojang.brigadier.exceptions.DynamicCommandExceptionType
/**
 * net.minecraft.class_4398
 */
typealias RealmsLongRunningMcoTaskScreen = net.minecraft.class_4398
/**
 * net.minecraft.class_2741
 */
typealias Properties = net.minecraft.class_2741
/**
 * net.minecraft.class_5857
 */
typealias AbstractCountPlacementModifier = net.minecraft.class_5857
/**
 * net.minecraft.class_6367
 */
typealias SimpleFramebuffer = net.minecraft.class_6367
/**
 * net.minecraft.class_2406
 */
typealias LoomBlock = net.minecraft.class_2406
/**
 * net.minecraft.class_495
 */
typealias ShulkerBoxScreen = net.minecraft.class_495
/**
 * net.minecraft.class_2631
 */
typealias SkullBlockEntity = net.minecraft.class_2631
/**
 * net.minecraft.class_315
 */
typealias GameOptions = net.minecraft.class_315
/**
 * net.minecraft.class_5715
 */
typealias EntityGameEventHandler<T> = net.minecraft.class_5715<T>
/**
 * net.minecraft.class_3310
 */
typealias EndSpikeFeature = net.minecraft.class_3310
/**
 * net.minecraft.class_5794
 */
typealias BlockFamily = net.minecraft.class_5794
/**
 * net.minecraft.class_4116
 */
typealias GoToIfNearbyTask = net.minecraft.class_4116
/**
 * net.minecraft.class_3545
 */
typealias Pair<A, B> = net.minecraft.class_3545<A, B>
/**
 * net.minecraft.class_6369
 */
typealias AddressResolver = net.minecraft.class_6369
/**
 * net.minecraft.class_4718
 */
typealias GlException = net.minecraft.class_4718
/**
 * net.minecraft.class_3904
 */
typealias NewVillageFix = net.minecraft.class_3904
/**
 * net.minecraft.class_6554
 */
typealias VanillaBiomeParameters = net.minecraft.class_6554
/**
 * net.minecraft.class_339
 */
typealias ClickableWidget = net.minecraft.class_339
/**
 * net.minecraft.class_1808
 */
typealias MinecartItem = net.minecraft.class_1808
/**
 * net.minecraft.class_4616
 */
typealias StorageNbtDataSource = net.minecraft.class_4616
/**
 * net.minecraft.class_6795
 */
typealias HeightRangePlacementModifier = net.minecraft.class_6795
/**
 * net.minecraft.class_9774
 */
typealias OptionsMenuBlurrinessFix = net.minecraft.class_9774
/**
 * net.minecraft.class_3776
 */
typealias FeaturePoolElement = net.minecraft.class_3776
/**
 * net.minecraft.class_3228
 */
typealias ChunkTicket<T> = net.minecraft.class_3228<T>
/**
 * net.minecraft.class_2260
 */
typealias BrewingStandBlock = net.minecraft.class_2260
/**
 * net.minecraft.class_9246
 */
typealias FontOptionsScreen = net.minecraft.class_9246
/**
 * net.minecraft.class_7691
 */
typealias CamelBrain = net.minecraft.class_7691
/**
 * net.minecraft.class_412
 */
typealias ConnectScreen = net.minecraft.class_412
/**
 * net.minecraft.class_626
 */
typealias DragonHeadEntityModel = net.minecraft.class_626
/**
 * net.minecraft.class_4543
 */
typealias BiomeAccess = net.minecraft.class_4543
/**
 * net.minecraft.class_7861
 */
typealias PlayerSessionC2SPacket = net.minecraft.class_7861
/**
 * net.minecraft.data.Main
 */
typealias data_Main = net.minecraft.data.Main
/**
 * net.minecraft.class_4922
 */
typealias MultipartBlockStateSupplier = net.minecraft.class_4922
/**
 * org.apache.commons.lang3.mutable.MutableFloat
 */
typealias MutableFloat = org.apache.commons.lang3.mutable.MutableFloat
/**
 * net.minecraft.class_5552
 */
typealias OperatorBlock = net.minecraft.class_5552
/**
 * net.minecraft.class_4844
 */
typealias Uuids = net.minecraft.class_4844
/**
 * net.minecraft.class_5444
 */
typealias FeaturePlacementContext = net.minecraft.class_5444
/**
 * net.minecraft.class_7963
 */
typealias ThreadedLogWriter = net.minecraft.class_7963
/**
 * net.minecraft.class_251
 */
typealias VoxelSet = net.minecraft.class_251
/**
 * net.minecraft.class_7291
 */
typealias TranslatableOption = net.minecraft.class_7291
/**
 * net.minecraft.class_8816
 */
typealias PopupScreen = net.minecraft.class_8816
/**
 * net.minecraft.class_3972
 */
typealias CuttingRecipe = net.minecraft.class_3972
/**
 * net.minecraft.class_6858
 */
typealias WeaponsmithChestLootTableFix = net.minecraft.class_6858
/**
 * net.minecraft.class_9193
 */
typealias SubscribableDebugSampleLog = net.minecraft.class_9193
/**
 * net.minecraft.class_684
 */
typealias EmotionParticle = net.minecraft.class_684
/**
 * net.minecraft.class_5697
 */
typealias PlayerHeldItemFeatureRenderer<T, M> = net.minecraft.class_5697<T, M>
/**
 * net.minecraft.class_8249
 */
typealias RuleBlockEntityModifierType<P> = net.minecraft.class_8249<P>
/**
 * net.minecraft.class_5716
 */
typealias PositionSource = net.minecraft.class_5716
/**
 * net.minecraft.class_3778
 */
typealias StructurePoolBasedGenerator = net.minecraft.class_3778
/**
 * net.minecraft.class_1102
 */
typealias AbstractSoundInstance = net.minecraft.class_1102
/**
 * net.minecraft.class_5497
 */
typealias StructureProcessorList = net.minecraft.class_5497
/**
 * net.minecraft.class_1227
 */
typealias Schema143 = net.minecraft.class_1227
/**
 * net.minecraft.class_2658
 */
typealias CustomPayloadS2CPacket = net.minecraft.class_2658
/**
 * com.google.common.collect.Multimap
 */
typealias Multimap<K, V> = com.google.common.collect.Multimap<K, V>
/**
 * net.minecraft.class_2523
 */
typealias SugarCaneBlock = net.minecraft.class_2523
/**
 * net.minecraft.obfuscate.DontObfuscate
 */
typealias DontObfuscate = net.minecraft.obfuscate.DontObfuscate
/**
 * net.minecraft.class_1948
 */
typealias SpawnHelper = net.minecraft.class_1948
/**
 * net.minecraft.class_2848
 */
typealias ClientCommandC2SPacket = net.minecraft.class_2848
/**
 * net.minecraft.class_4092
 */
typealias OptionsAddTextBackgroundFix = net.minecraft.class_4092
/**
 * net.minecraft.class_6847
 */
typealias HasSturdyFacePredicate = net.minecraft.class_6847
/**
 * net.minecraft.class_201
 */
typealias SurvivesExplosionLootCondition = net.minecraft.class_201
/**
 * net.minecraft.class_3975
 */
typealias StonecuttingRecipe = net.minecraft.class_3975
/**
 * net.minecraft.class_4442
 */
typealias SwitchMinigameTask = net.minecraft.class_4442
/**
 * net.minecraft.class_2580
 */
typealias BeaconBlockEntity = net.minecraft.class_2580
/**
 * net.minecraft.class_1817
 */
typealias ServerItemCooldownManager = net.minecraft.class_1817
/**
 * net.minecraft.class_474
 */
typealias PageTurnWidget = net.minecraft.class_474
/**
 * net.minecraft.class_5572
 */
typealias EntityTrackingSection<T> = net.minecraft.class_5572<T>
/**
 * net.minecraft.class_1044
 */
typealias AbstractTexture = net.minecraft.class_1044
/**
 * net.minecraft.class_3023
 */
typealias CloneCommand = net.minecraft.class_3023
/**
 * net.minecraft.class_3074
 */
typealias IcebergFeature = net.minecraft.class_3074
/**
 * net.minecraft.class_1103
 */
typealias ElytraSoundInstance = net.minecraft.class_1103
/**
 * net.minecraft.class_1516
 */
typealias HoverPhase = net.minecraft.class_1516
/**
 * net.minecraft.class_7752
 */
typealias ChestBoatEntityModel = net.minecraft.class_7752
/**
 * net.minecraft.class_2248
 */
typealias Block = net.minecraft.class_2248
/**
 * net.minecraft.class_7406
 */
typealias PaintingVariantTags = net.minecraft.class_7406
/**
 * net.minecraft.class_4907
 */
typealias RepeatedNarrator = net.minecraft.class_4907
/**
 * net.minecraft.class_4980
 */
typealias SaddledComponent = net.minecraft.class_4980
/**
 * net.minecraft.class_9412
 */
typealias ParsingStateImpl = net.minecraft.class_9412
/**
 * net.minecraft.class_6603
 */
typealias ChunkData = net.minecraft.class_6603
/**
 * net.minecraft.class_517
 */
typealias AbstractFurnaceRecipeBookScreen = net.minecraft.class_517
/**
 * net.minecraft.class_7458
 */
typealias VanillaBannerPatternTagProvider = net.minecraft.class_7458
/**
 * net.minecraft.class_1391
 */
typealias TemptGoal = net.minecraft.class_1391
/**
 * net.minecraft.class_4867
 */
typealias Backup = net.minecraft.class_4867
/**
 * net.minecraft.class_234
 */
typealias TimerCallback<T> = net.minecraft.class_234<T>
/**
 * net.minecraft.class_3268
 */
typealias DefaultResourcePack = net.minecraft.class_3268
/**
 * net.minecraft.class_8198
 */
typealias MultiNoiseBiomeSourceParameterLists = net.minecraft.class_8198
/**
 * net.minecraft.class_2629
 */
typealias BossBarS2CPacket = net.minecraft.class_2629
/**
 * net.minecraft.class_2450
 */
typealias ShapelessRecipeJsonBuilder = net.minecraft.class_2450
/**
 * net.minecraft.class_1506
 */
typealias SkeletonHorseEntity = net.minecraft.class_1506
/**
 * net.minecraft.class_7114
 */
typealias MangroveLeavesBlock = net.minecraft.class_7114
/**
 * com.mojang.brigadier.suggestion.SuggestionProvider
 */
typealias SuggestionProvider<S> = com.mojang.brigadier.suggestion.SuggestionProvider<S>
/**
 * net.minecraft.class_949
 */
typealias SpiderEntityRenderer<T> = net.minecraft.class_949<T>
/**
 * net.minecraft.class_7250
 */
typealias EmergeTask<E> = net.minecraft.class_7250<E>
/**
 * com.mojang.blaze3d.platform.TextureUtil
 */
typealias TextureUtil = com.mojang.blaze3d.platform.TextureUtil
/**
 * net.minecraft.class_5555
 */
typealias TintedGlassBlock = net.minecraft.class_5555
/**
 * net.minecraft.class_254
 */
typealias SimplePairList = net.minecraft.class_254
/**
 * net.minecraft.class_703
 */
typealias Particle = net.minecraft.class_703
/**
 * net.minecraft.class_9316
 */
typealias PathContext = net.minecraft.class_9316
/**
 * net.minecraft.class_3695
 */
typealias Profiler = net.minecraft.class_3695
/**
 * net.minecraft.class_1641
 */
typealias ZombieVillagerEntity = net.minecraft.class_1641
/**
 * net.minecraft.class_2636
 */
typealias MobSpawnerBlockEntity = net.minecraft.class_2636
/**
 * net.minecraft.class_4731
 */
typealias RemovePoiValidTagFix = net.minecraft.class_4731
/**
 * net.minecraft.class_2342
 */
typealias BlockPointer = net.minecraft.class_2342
/**
 * net.minecraft.class_4519
 */
typealias TestFunctions = net.minecraft.class_4519
/**
 * net.minecraft.class_3603
 */
typealias EntityIdFix = net.minecraft.class_3603
/**
 * net.minecraft.class_7066
 */
typealias RegistryPredicateArgumentType<T> = net.minecraft.class_7066<T>
/**
 * net.minecraft.class_4894
 */
typealias ForgingScreen<T> = net.minecraft.class_4894<T>
/**
 * net.minecraft.class_6683
 */
typealias ModStatus = net.minecraft.class_6683
/**
 * net.minecraft.class_4294
 */
typealias OminousBannerItemRenameFix = net.minecraft.class_4294
/**
 * net.minecraft.class_1176
 */
typealias IglooMetadataRemovalFix = net.minecraft.class_1176
/**
 * net.minecraft.class_3885
 */
typealias VillagerClothingFeatureRenderer<T, M> = net.minecraft.class_3885<T, M>
/**
 * net.minecraft.class_1559
 */
typealias EndermiteEntity = net.minecraft.class_1559
/**
 * net.minecraft.class_9087
 */
typealias ClientCookieRequestPacketListener = net.minecraft.class_9087
/**
 * net.minecraft.class_3717
 */
typealias SmithingTableBlock = net.minecraft.class_3717
/**
 * net.minecraft.class_3156
 */
typealias WhitelistCommand = net.minecraft.class_3156
/**
 * net.minecraft.class_6814
 */
typealias MiscPlacedFeatures = net.minecraft.class_6814
/**
 * net.minecraft.class_2645
 */
typealias CloseScreenS2CPacket = net.minecraft.class_2645
/**
 * net.minecraft.class_4642
 */
typealias SpringFeatureConfig = net.minecraft.class_4642
/**
 * net.minecraft.class_4635
 */
typealias HugeMushroomFeatureConfig = net.minecraft.class_4635
/**
 * java.nio.file.Path
 */
typealias file_Path = java.nio.file.Path
/**
 * net.minecraft.class_3763
 */
typealias RaiderEntity = net.minecraft.class_3763
/**
 * net.minecraft.class_8916
 */
typealias TickCommand = net.minecraft.class_8916
/**
 * net.minecraft.class_4982
 */
typealias BoneMealTask = net.minecraft.class_4982
/**
 * net.minecraft.class_811
 */
typealias ModelTransformationMode = net.minecraft.class_811
/**
 * net.minecraft.class_2803
 */
typealias ClientOptionsC2SPacket = net.minecraft.class_2803
/**
 * net.minecraft.class_9280
 */
typealias CustomModelDataComponent = net.minecraft.class_9280
/**
 * net.minecraft.class_11
 */
typealias Path = net.minecraft.class_11
/**
 * org.lwjgl.glfw.GLFWKeyCallbackI
 */
typealias GLFWKeyCallbackI = org.lwjgl.glfw.GLFWKeyCallbackI
/**
 * net.minecraft.class_491
 */
typealias HorseScreen = net.minecraft.class_491
/**
 * net.minecraft.class_1921
 */
typealias RenderLayer = net.minecraft.class_1921
/**
 * net.minecraft.class_5485
 */
typealias GenerationSettings = net.minecraft.class_5485
/**
 * net.minecraft.class_6812
 */
typealias UndergroundPlacedFeatures = net.minecraft.class_6812
/**
 * net.minecraft.class_6757
 */
typealias WorldTickScheduler<T> = net.minecraft.class_6757<T>
/**
 * net.minecraft.class_1371
 */
typealias AttackGoal = net.minecraft.class_1371
/**
 * net.minecraft.class_7417
 */
typealias TextContent = net.minecraft.class_7417
/**
 * net.minecraft.class_1614
 */
typealias SilverfishEntity = net.minecraft.class_1614
/**
 * net.minecraft.class_407
 */
typealias ConfirmLinkScreen = net.minecraft.class_407
/**
 * net.minecraft.class_4243
 */
typealias GiveGiftsToHeroTask = net.minecraft.class_4243
/**
 * net.minecraft.class_790
 */
typealias ModelVariantMap = net.minecraft.class_790
/**
 * net.minecraft.class_5861
 */
typealias ClampedNormalFloatProvider = net.minecraft.class_5861
/**
 * net.minecraft.class_9274
 */
typealias AttributeModifierSlot = net.minecraft.class_9274
/**
 * net.minecraft.class_2851
 */
typealias PlayerInputC2SPacket = net.minecraft.class_2851
/**
 * net.minecraft.class_3079
 */
typealias LocateCommand = net.minecraft.class_3079
/**
 * net.minecraft.class_7383
 */
typealias SlimePredicate = net.minecraft.class_7383
/**
 * net.minecraft.class_207
 */
typealias InvertedLootCondition = net.minecraft.class_207
/**
 * net.minecraft.class_8220
 */
typealias RenameBlockEntityFix = net.minecraft.class_8220
/**
 * net.minecraft.class_8566
 */
typealias RecipeInputInventory = net.minecraft.class_8566
/**
 * net.minecraft.class_4184
 */
typealias Camera = net.minecraft.class_4184
/**
 * net.minecraft.class_9817
 */
typealias Leashable = net.minecraft.class_9817
/**
 * net.minecraft.class_2439
 */
typealias PotatoesBlock = net.minecraft.class_2439
/**
 * net.minecraft.class_8917
 */
typealias PriorityIterator<T> = net.minecraft.class_8917<T>
/**
 * net.minecraft.class_5399
 */
typealias LavaSubmergedBlockStructureProcessor = net.minecraft.class_5399
/**
 * net.minecraft.class_1687
 */
typealias WitherSkullEntity = net.minecraft.class_1687
/**
 * net.minecraft.class_3845
 */
typealias VillagerProfessionFix = net.minecraft.class_3845
/**
 * net.minecraft.class_3683
 */
typealias OcelotEntityRenderer = net.minecraft.class_3683
/**
 * net.minecraft.class_4903
 */
typealias RealmsLabel = net.minecraft.class_4903
/**
 * net.minecraft.class_3609
 */
typealias FlowableFluid = net.minecraft.class_3609
/**
 * net.minecraft.class_6534
 */
typealias LongRunningSample = net.minecraft.class_6534
/**
 * net.minecraft.class_7188
 */
typealias FrogAnimations = net.minecraft.class_7188
/**
 * net.minecraft.class_3575
 */
typealias BlockEntityShulkerBoxColorFix = net.minecraft.class_3575
/**
 * net.minecraft.class_1188
 */
typealias ItemInstanceTheFlatteningFix = net.minecraft.class_1188
/**
 * net.minecraft.class_7714
 */
typealias ChiseledBookshelfBlock = net.minecraft.class_7714
/**
 * net.minecraft.class_6539
 */
typealias ColorResolver = net.minecraft.class_6539
/**
 * net.minecraft.class_7061
 */
typealias StructureSpawns = net.minecraft.class_7061
/**
 * net.minecraft.class_2519
 */
typealias NbtString = net.minecraft.class_2519
/**
 * net.minecraft.class_1828
 */
typealias SplashPotionItem = net.minecraft.class_1828
/**
 * net.minecraft.class_1410
 */
typealias SpiderNavigation = net.minecraft.class_1410
/**
 * net.minecraft.class_8155
 */
typealias SnifferBrain = net.minecraft.class_8155
/**
 * net.minecraft.class_9336
 */
typealias Component<T> = net.minecraft.class_9336<T>
/**
 * net.minecraft.class_8052
 */
typealias SmithingTemplateItem = net.minecraft.class_8052
/**
 * net.minecraft.class_4597
 */
typealias VertexConsumerProvider = net.minecraft.class_4597
/**
 * net.minecraft.class_6230
 */
typealias EntityModelPartNames = net.minecraft.class_6230
/**
 * com.mojang.serialization.DataResult
 */
typealias DataResult<R> = com.mojang.serialization.DataResult<R>
/**
 * net.minecraft.class_5962
 */
typealias Recorder = net.minecraft.class_5962
/**
 * net.minecraft.class_3044
 */
typealias FossilFeature = net.minecraft.class_3044
/**
 * net.minecraft.class_1706
 */
typealias AnvilScreenHandler = net.minecraft.class_1706
/**
 * net.minecraft.class_1080
 */
typealias AnimationFrameResourceMetadata = net.minecraft.class_1080
/**
 * net.minecraft.class_366
 */
typealias RecipeToast = net.minecraft.class_366
/**
 * java.util.function.DoubleSupplier
 */
typealias DoubleSupplier = java.util.function.DoubleSupplier
/**
 * net.minecraft.class_7730
 */
typealias CamelAnimations = net.minecraft.class_7730
/**
 * net.minecraft.class_4095
 */
typealias Brain<E> = net.minecraft.class_4095<E>
/**
 * net.minecraft.class_8167
 */
typealias CherryLeavesBlock = net.minecraft.class_8167
/**
 * net.minecraft.class_7102
 */
typealias FrogEntity = net.minecraft.class_7102
/**
 * net.minecraft.class_7887
 */
typealias BuiltinRegistries = net.minecraft.class_7887
/**
 * net.minecraft.class_4863
 */
typealias AbstractPlantPartBlock = net.minecraft.class_4863
/**
 * net.minecraft.class_497
 */
typealias StructureBlockScreen = net.minecraft.class_497
/**
 * net.minecraft.class_3749
 */
typealias LanternBlock = net.minecraft.class_3749
/**
 * net.minecraft.class_564
 */
typealias DrownedEntityModel<T> = net.minecraft.class_564<T>
/**
 * net.minecraft.class_4779
 */
typealias BasaltPillarFeature = net.minecraft.class_4779
/**
 * net.minecraft.class_7755
 */
typealias ModelWithWaterPatch = net.minecraft.class_7755
/**
 * java.util.function.BinaryOperator
 */
typealias BinaryOperator<T> = java.util.function.BinaryOperator<T>
/**
 * net.minecraft.class_2306
 */
typealias EntitySelectorOptions = net.minecraft.class_2306
/**
 * net.minecraft.class_1542
 */
typealias ItemEntity = net.minecraft.class_1542
/**
 * net.minecraft.class_5610
 */
typealias ModelPartData = net.minecraft.class_5610
/**
 * java.util.function.DoublePredicate
 */
typealias DoublePredicate = java.util.function.DoublePredicate
/**
 * net.minecraft.class_1146
 */
typealias WeightedSoundSet = net.minecraft.class_1146
/**
 * net.minecraft.class_8054
 */
typealias ArmorTrimMaterial = net.minecraft.class_8054
/**
 * net.minecraft.class_1408
 */
typealias EntityNavigation = net.minecraft.class_1408
/**
 * net.minecraft.class_2022
 */
typealias DamageSourcePredicate = net.minecraft.class_2022
/**
 * net.minecraft.class_1380
 */
typealias BowAttackGoal<T> = net.minecraft.class_1380<T>
/**
 * net.minecraft.class_3470
 */
typealias SimpleStructurePiece = net.minecraft.class_3470
/**
 * net.minecraft.class_2841
 */
typealias PalettedContainer<T> = net.minecraft.class_2841<T>
/**
 * net.minecraft.class_8789
 */
typealias RealmsLongRunningTickableTaskScreen = net.minecraft.class_8789
/**
 * net.minecraft.class_2817
 */
typealias CustomPayloadC2SPacket = net.minecraft.class_2817
/**
 * net.minecraft.class_2350
 */
typealias Direction = net.minecraft.class_2350
/**
 * net.minecraft.class_3577
 */
typealias BlockEntitySignTextStrictJsonFix = net.minecraft.class_3577
/**
 * net.minecraft.class_969
 */
typealias WolfEntityRenderer = net.minecraft.class_969
/**
 * net.minecraft.class_2392
 */
typealias ItemStackParticleEffect = net.minecraft.class_2392
/**
 * net.minecraft.class_3746
 */
typealias TestableWorld = net.minecraft.class_3746
/**
 * net.minecraft.class_4594
 */
typealias TintableCompositeModel<E> = net.minecraft.class_4594<E>
/**
 * net.minecraft.class_8801
 */
typealias NbtSizeValidationException = net.minecraft.class_8801
/**
 * net.minecraft.class_2518
 */
typealias StructureVoidBlock = net.minecraft.class_2518
/**
 * net.minecraft.class_2232
 */
typealias IdentifierArgumentType = net.minecraft.class_2232
/**
 * net.minecraft.class_1372
 */
typealias IronGolemLookGoal = net.minecraft.class_1372
/**
 * net.minecraft.class_721
 */
typealias SpitParticle = net.minecraft.class_721
/**
 * net.minecraft.class_404
 */
typealias ChatOptionsScreen = net.minecraft.class_404
/**
 * net.minecraft.class_3944
 */
typealias OpenScreenS2CPacket = net.minecraft.class_3944
/**
 * net.minecraft.class_2717
 */
typealias BlockPredicate = net.minecraft.class_2717
/**
 * net.minecraft.class_2902
 */
typealias Heightmap = net.minecraft.class_2902
/**
 * net.minecraft.class_4841
 */
typealias VillageSectionsDebugRenderer = net.minecraft.class_4841
/**
 * net.minecraft.class_2703
 */
typealias PlayerListS2CPacket = net.minecraft.class_2703
/**
 * net.minecraft.class_3270
 */
typealias ResourceMetadataReader<T> = net.minecraft.class_3270<T>
/**
 * net.minecraft.class_7486
 */
typealias BlockMirrorArgumentType = net.minecraft.class_7486
/**
 * net.minecraft.class_7419
 */
typealias NbtDataSource = net.minecraft.class_7419
/**
 * net.minecraft.class_2836
 */
typealias BoatPaddleStateC2SPacket = net.minecraft.class_2836
/**
 * net.minecraft.class_5742
 */
typealias BiomeCoords = net.minecraft.class_5742
/**
 * net.minecraft.class_1927
 */
typealias Explosion = net.minecraft.class_1927
/**
 * net.minecraft.class_124
 */
typealias Formatting = net.minecraft.class_124
/**
 * net.minecraft.class_5912
 */
typealias ResourceFactory = net.minecraft.class_5912
/**
 * net.minecraft.class_5896
 */
typealias WorldBorderInterpolateSizeS2CPacket = net.minecraft.class_5896
/**
 * net.minecraft.class_1153
 */
typealias PunchTreeTutorialStepHandler = net.minecraft.class_1153
/**
 * net.minecraft.class_4100
 */
typealias StopPanickingTask = net.minecraft.class_4100
/**
 * net.minecraft.class_4814
 */
typealias WalkTowardsPosTask = net.minecraft.class_4814
/**
 * net.minecraft.class_353
 */
typealias OptionListWidget = net.minecraft.class_353
/**
 * net.minecraft.class_9206
 */
typealias VaultState = net.minecraft.class_9206
/**
 * com.mojang.serialization.Dynamic
 */
typealias Dynamic<T> = com.mojang.serialization.Dynamic<T>
/**
 * net.minecraft.class_4211
 */
typealias UpdateDifficultyLockC2SPacket = net.minecraft.class_4211
/**
 * net.minecraft.class_8954
 */
typealias BreezeSlideTowardsTargetTask = net.minecraft.class_8954
/**
 * net.minecraft.class_4075
 */
typealias SpriteAtlasHolder = net.minecraft.class_4075
/**
 * net.minecraft.class_2795
 */
typealias QueryBlockNbtC2SPacket = net.minecraft.class_2795
/**
 * net.minecraft.class_7138
 */
typealias NoiseConfig = net.minecraft.class_7138
/**
 * net.minecraft.class_2897
 */
typealias FlatChunkGenerator = net.minecraft.class_2897
/**
 * net.minecraft.class_5703
 */
typealias SculkSensorBlock = net.minecraft.class_5703
/**
 * net.minecraft.class_1289
 */
typealias InstantStatusEffect = net.minecraft.class_1289
/**
 * net.minecraft.class_8107
 */
typealias DamageEffects = net.minecraft.class_8107
/**
 * net.minecraft.class_2102
 */
typealias EntityEffectPredicate = net.minecraft.class_2102
/**
 * net.minecraft.class_4845
 */
typealias VanillaBarterLootTableGenerator = net.minecraft.class_4845
/**
 * net.minecraft.class_4441
 */
typealias RestoreTask = net.minecraft.class_4441
/**
 * net.minecraft.class_5407
 */
typealias VideoWarningManager = net.minecraft.class_5407
/**
 * java.time.LocalDate
 */
typealias LocalDate = java.time.LocalDate
/**
 * net.minecraft.class_8247
 */
typealias PassthroughRuleBlockEntityModifier = net.minecraft.class_8247
/**
 * net.minecraft.class_3238
 */
typealias LegacyQueryHandler = net.minecraft.class_3238
/**
 * net.minecraft.class_8977
 */
typealias GustParticle = net.minecraft.class_8977
/**
 * net.minecraft.class_551
 */
typealias ArmorStandEntityModel = net.minecraft.class_551
/**
 * net.minecraft.class_2496
 */
typealias SpawnerBlock = net.minecraft.class_2496
/**
 * net.minecraft.class_8858
 */
typealias SingleCommandAction<T> = net.minecraft.class_8858<T>
/**
 * net.minecraft.class_6957
 */
typealias VanillaBiomeTagProvider = net.minecraft.class_6957
/**
 * net.minecraft.class_2385
 */
typealias MutableRegistry<T> = net.minecraft.class_2385<T>
/**
 * net.minecraft.class_3471
 */
typealias WoodlandMansionGenerator = net.minecraft.class_3471
/**
 * net.minecraft.class_7563
 */
typealias AbuseReportSender = net.minecraft.class_7563
/**
 * net.minecraft.class_8883
 */
typealias CrafterOutputSlot = net.minecraft.class_8883
/**
 * net.minecraft.class_9113
 */
typealias Batches = net.minecraft.class_9113
/**
 * net.minecraft.class_7115
 */
typealias PropaguleBlock = net.minecraft.class_7115
/**
 * net.minecraft.class_9020
 */
typealias BlankNumberFormat = net.minecraft.class_9020
/**
 * net.minecraft.class_8713
 */
typealias DebugGameEventListenersCustomPayload = net.minecraft.class_8713
/**
 * net.minecraft.class_753
 */
typealias CubeFace = net.minecraft.class_753
/**
 * net.minecraft.class_2190
 */
typealias AbstractSkullBlock = net.minecraft.class_2190
/**
 * net.minecraft.class_3191
 */
typealias BlockBreakingInfo = net.minecraft.class_3191
/**
 * net.minecraft.class_247
 */
typealias BooleanBiFunction = net.minecraft.class_247
/**
 * net.minecraft.class_7157
 */
typealias CommandRegistryAccess = net.minecraft.class_7157
/**
 * net.minecraft.class_9380
 */
typealias ImmutableBlockBox = net.minecraft.class_9380
/**
 * net.minecraft.class_5341
 */
typealias LootCondition = net.minecraft.class_5341
/**
 * net.minecraft.class_2361
 */
typealias IdList<T> = net.minecraft.class_2361<T>
/**
 * net.minecraft.class_7700
 */
typealias FeatureUniverse = net.minecraft.class_7700
/**
 * net.minecraft.class_3281
 */
typealias ResourcePackCompatibility = net.minecraft.class_3281
/**
 * net.minecraft.class_3790
 */
typealias PoolStructurePiece = net.minecraft.class_3790
/**
 * net.minecraft.class_558
 */
typealias ChickenEntityModel<T> = net.minecraft.class_558<T>
/**
 * net.minecraft.class_3785
 */
typealias StructurePool = net.minecraft.class_3785
/**
 * net.minecraft.class_932
 */
typealias PigEntityRenderer = net.minecraft.class_932
/**
 * net.minecraft.class_1332
 */
typealias YawAdjustingLookControl = net.minecraft.class_1332
/**
 * net.minecraft.class_9411
 */
typealias IdentifierSuggestable = net.minecraft.class_9411
/**
 * net.minecraft.class_3807
 */
typealias ServerPropertiesLoader = net.minecraft.class_3807
/**
 * net.minecraft.class_1206
 */
typealias FlatteningRecipeMapping = net.minecraft.class_1206
/**
 * net.minecraft.class_5256
 */
typealias StriderGravityFix = net.minecraft.class_5256
/**
 * net.minecraft.class_6306
 */
typealias TestServer = net.minecraft.class_6306
/**
 * net.minecraft.class_9267
 */
typealias ItemStackComponentizationFix = net.minecraft.class_9267
/**
 * net.minecraft.class_4448
 */
typealias RealmsUtil = net.minecraft.class_4448
/**
 * net.minecraft.class_5762
 */
typealias AxolotlEntity = net.minecraft.class_5762
/**
 * net.minecraft.class_2720
 */
typealias ResourcePackSendS2CPacket = net.minecraft.class_2720
/**
 * net.minecraft.class_1702
 */
typealias HungerManager = net.minecraft.class_1702
/**
 * net.minecraft.class_7695
 */
typealias ToggleableFeature = net.minecraft.class_7695
/**
 * net.minecraft.class_2715
 */
typealias BlockStatePredicate = net.minecraft.class_2715
/**
 * net.minecraft.class_5558
 */
typealias BlockEntityTicker<T> = net.minecraft.class_5558<T>
/**
 * net.minecraft.class_612
 */
typealias SmallTropicalFishEntityModel<T> = net.minecraft.class_612<T>
/**
 * net.minecraft.class_1973
 */
typealias CheckerboardBiomeSource = net.minecraft.class_1973
/**
 * net.minecraft.class_2223
 */
typealias ParticleEffectArgumentType = net.minecraft.class_2223
/**
 * net.minecraft.class_1642
 */
typealias ZombieEntity = net.minecraft.class_1642
/**
 * net.minecraft.class_4958
 */
typealias AbstractUuidFix = net.minecraft.class_4958
/**
 * net.minecraft.class_2828
 */
typealias PlayerMoveC2SPacket = net.minecraft.class_2828
/**
 * net.minecraft.class_1639
 */
typealias WitherSkeletonEntity = net.minecraft.class_1639
/**
 * com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 */
typealias YggdrasilAuthenticationService = com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
/**
 * net.minecraft.class_3834
 */
typealias SavannaVillageData = net.minecraft.class_3834
/**
 * net.minecraft.class_2233
 */
typealias ScoreHolderArgumentType = net.minecraft.class_2233
/**
 * net.minecraft.class_8974
 */
typealias WindChargeEntityModel = net.minecraft.class_8974
/**
 * net.minecraft.class_2426
 */
typealias ObserverBlock = net.minecraft.class_2426
/**
 * net.minecraft.class_7096
 */
typealias BiasedLongJumpTask<E> = net.minecraft.class_7096<E>
/**
 * net.minecraft.class_4615
 */
typealias NbtTypes = net.minecraft.class_4615
/**
 * net.minecraft.class_3745
 */
typealias CrossbowUser = net.minecraft.class_3745
/**
 * net.minecraft.class_3952
 */
typealias QueueingWorldGenerationProgressListener = net.minecraft.class_3952
/**
 * net.minecraft.class_6404
 */
typealias LightningBoltPredicate = net.minecraft.class_6404
/**
 * net.minecraft.class_9265
 */
typealias BeehiveFieldRenameFix = net.minecraft.class_9265
/**
 * net.minecraft.class_8684
 */
typealias SpriteOpener = net.minecraft.class_8684
/**
 * net.minecraft.class_1704
 */
typealias BeaconScreenHandler = net.minecraft.class_1704
/**
 * net.minecraft.class_2597
 */
typealias ConduitBlockEntity = net.minecraft.class_2597
/**
 * net.minecraft.class_9650
 */
typealias ParticleUnflatteningFix = net.minecraft.class_9650
/**
 * net.minecraft.class_8082
 */
typealias AccessibilityOnboardingButtons = net.minecraft.class_8082
/**
 * net.minecraft.class_1432
 */
typealias Flutterer = net.minecraft.class_1432
/**
 * net.minecraft.class_4149
 */
typealias SensorType<U> = net.minecraft.class_4149<U>
/**
 * net.minecraft.class_1933
 */
typealias GrassColors = net.minecraft.class_1933
/**
 * net.minecraft.class_7654
 */
typealias ResourceFinder = net.minecraft.class_7654
/**
 * net.minecraft.class_4592
 */
typealias AnimalModel<E> = net.minecraft.class_4592<E>
/**
 * net.minecraft.class_7386
 */
typealias MangroveRootPlacer = net.minecraft.class_7386
/**
 * net.minecraft.class_2048
 */
typealias EntityPredicate = net.minecraft.class_2048
/**
 * net.minecraft.class_923
 */
typealias LlamaSpitEntityRenderer = net.minecraft.class_923
/**
 * net.minecraft.class_5843
 */
typealias YOffset = net.minecraft.class_5843
/**
 * net.minecraft.class_2735
 */
typealias UpdateSelectedSlotS2CPacket = net.minecraft.class_2735
/**
 * net.minecraft.class_9770
 */
typealias ChunkGenerationStep = net.minecraft.class_9770
/**
 * io.netty.channel.ChannelPipeline
 */
typealias ChannelPipeline = io.netty.channel.ChannelPipeline
/**
 * net.minecraft.class_1190
 */
typealias ItemWaterPotionFix = net.minecraft.class_1190
/**
 * net.minecraft.class_747
 */
typealias SimpleNamedScreenHandlerFactory = net.minecraft.class_747
/**
 * net.minecraft.class_2399
 */
typealias LadderBlock = net.minecraft.class_2399
/**
 * net.minecraft.class_5219
 */
typealias SaveProperties = net.minecraft.class_5219
/**
 * net.minecraft.class_7202
 */
typealias PendingUpdateManager = net.minecraft.class_7202
/**
 * net.minecraft.class_9143
 */
typealias ValueFirstEncoder<O, T> = net.minecraft.class_9143<O, T>
/**
 * net.minecraft.class_6544
 */
typealias MultiNoiseUtil = net.minecraft.class_6544
/**
 * net.minecraft.class_7894
 */
typealias SingleTickTask<E> = net.minecraft.class_7894<E>
/**
 * net.minecraft.class_3590
 */
typealias ChunkStructuresTemplateRenameFix = net.minecraft.class_3590
/**
 * net.minecraft.class_1095
 */
typealias MultipartBakedModel = net.minecraft.class_1095
/**
 * net.minecraft.class_1662
 */
typealias RecipeMatcher = net.minecraft.class_1662
/**
 * net.minecraft.class_9159
 */
typealias TransferCommand = net.minecraft.class_9159
/**
 * net.minecraft.class_3098
 */
typealias MineshaftStructure = net.minecraft.class_3098
/**
 * net.minecraft.class_3492
 */
typealias StructurePlacementData = net.minecraft.class_3492
/**
 * net.minecraft.class_5430
 */
typealias AdmireItemTimeLimitTask = net.minecraft.class_5430
/**
 * net.minecraft.class_1924
 */
typealias EntityView = net.minecraft.class_1924
/**
 * net.minecraft.class_8765
 */
typealias PlayerSkinWidget = net.minecraft.class_8765
/**
 * net.minecraft.class_8169
 */
typealias FlowerbedBlock = net.minecraft.class_8169
/**
 * net.minecraft.class_5565
 */
typealias EntityChunkDataAccess = net.minecraft.class_5565
/**
 * net.minecraft.class_2443
 */
typealias RailBlock = net.minecraft.class_2443
/**
 * net.minecraft.class_5
 */
typealias PathMinHeap = net.minecraft.class_5
/**
 * net.minecraft.class_5361
 */
typealias EntityExplosionBehavior = net.minecraft.class_5361
/**
 * net.minecraft.class_1357
 */
typealias DolphinJumpGoal = net.minecraft.class_1357
/**
 * net.minecraft.class_839
 */
typealias MobSpawnerBlockEntityRenderer = net.minecraft.class_839
/**
 * net.minecraft.class_796
 */
typealias BakedQuadFactory = net.minecraft.class_796
/**
 * net.minecraft.class_9078
 */
typealias DateTimeFormatters = net.minecraft.class_9078
/**
 * net.minecraft.class_3998
 */
typealias NoRenderParticle = net.minecraft.class_3998
/**
 * net.minecraft.class_8679
 */
typealias ChunkRenderingDataPreparer = net.minecraft.class_8679
/**
 * net.minecraft.class_1788
 */
typealias OperatorOnlyBlockItem = net.minecraft.class_1788
/**
 * net.minecraft.class_3364
 */
typealias QueryResponseHandler = net.minecraft.class_3364
/**
 * net.minecraft.class_5971
 */
typealias RecordDumper = net.minecraft.class_5971
/**
 * net.minecraft.class_4774
 */
typealias RootsBlock = net.minecraft.class_4774
/**
 * net.minecraft.class_5878
 */
typealias ParticleGroup = net.minecraft.class_5878
/**
 * net.minecraft.class_2140
 */
typealias VillagerTradeCriterion = net.minecraft.class_2140
/**
 * net.minecraft.class_5539
 */
typealias HeightLimitView = net.minecraft.class_5539
/**
 * net.minecraft.class_7768
 */
typealias Animator = net.minecraft.class_7768
/**
 * net.minecraft.class_1918
 */
typealias CommandBlockExecutor = net.minecraft.class_1918
/**
 * com.google.gson.reflect.TypeToken
 */
typealias TypeToken<T> = com.google.gson.reflect.TypeToken<T>
/**
 * net.minecraft.class_5409
 */
typealias PlayerInteractedWithEntityCriterion = net.minecraft.class_5409
/**
 * net.minecraft.class_3335
 */
typealias BannedPlayerList = net.minecraft.class_3335
/**
 * net.minecraft.class_1149
 */
typealias CraftPlanksTutorialStepHandler = net.minecraft.class_1149
/**
 * net.minecraft.class_9156
 */
typealias ConfigPackets = net.minecraft.class_9156
/**
 * net.minecraft.class_4151
 */
typealias EntityInteraction = net.minecraft.class_4151
/**
 * net.minecraft.class_5244
 */
typealias ScreenTexts = net.minecraft.class_5244
/**
 * net.minecraft.class_1347
 */
typealias SwimGoal = net.minecraft.class_1347
/**
 * net.minecraft.class_4061
 */
typealias AttackIndicator = net.minecraft.class_4061
/**
 * net.minecraft.class_7706
 */
typealias ItemGroups = net.minecraft.class_7706
/**
 * net.minecraft.class_185
 */
typealias AdvancementDisplay = net.minecraft.class_185
/**
 * net.minecraft.class_7522
 */
typealias ReadableContainer<T> = net.minecraft.class_7522<T>
/**
 * net.minecraft.class_1317
 */
typealias SpawnRestriction = net.minecraft.class_1317
/**
 * net.minecraft.class_2807
 */
typealias GenerationTask = net.minecraft.class_2807
/**
 * net.minecraft.class_1213
 */
typealias StatsRenameFix = net.minecraft.class_1213
/**
 * net.minecraft.class_2984
 */
typealias CountConfig = net.minecraft.class_2984
/**
 * net.minecraft.class_2037
 */
typealias EnterBlockCriterion = net.minecraft.class_2037
/**
 * net.minecraft.class_3258
 */
typealias ZipResourcePack = net.minecraft.class_3258
/**
 * net.minecraft.class_4235
 */
typealias Channel = net.minecraft.class_4235
/**
 * net.minecraft.class_1210
 */
typealias LegacyCoralBlockMapping = net.minecraft.class_1210
/**
 * net.minecraft.class_2119
 */
typealias RecipeUnlockedCriterion = net.minecraft.class_2119
/**
 * net.minecraft.class_2195
 */
typealias AttachedStemBlock = net.minecraft.class_2195
/**
 * net.minecraft.class_8909
 */
typealias NbtException = net.minecraft.class_8909
/**
 * net.minecraft.class_3131
 */
typealias SpreadPlayersCommand = net.minecraft.class_3131
/**
 * net.minecraft.class_1406
 */
typealias AttackWithOwnerGoal = net.minecraft.class_1406
/**
 * net.minecraft.class_1304
 */
typealias EquipmentSlot = net.minecraft.class_1304
/**
 * net.minecraft.class_8060
 */
typealias SmithingTransformRecipe = net.minecraft.class_8060
/**
 * net.minecraft.class_5890
 */
typealias EndCombatS2CPacket = net.minecraft.class_5890
/**
 * net.minecraft.class_2665
 */
typealias PistonBlock = net.minecraft.class_2665
/**
 * net.minecraft.class_4146
 */
typealias NearestLivingEntitiesSensor<T> = net.minecraft.class_4146<T>
/**
 * net.minecraft.class_104
 */
typealias ExplosionDecayLootFunction = net.minecraft.class_104
/**
 * net.minecraft.class_7715
 */
typealias WallHangingSignBlock = net.minecraft.class_7715
/**
 * net.minecraft.class_877
 */
typealias ArmorStandEntityRenderer = net.minecraft.class_877
/**
 * net.minecraft.class_4337
 */
typealias FileUpload = net.minecraft.class_4337
/**
 * net.minecraft.class_1781
 */
typealias FireworkRocketItem = net.minecraft.class_1781
/**
 * net.minecraft.class_1387
 */
typealias HorseBondWithPlayerGoal = net.minecraft.class_1387
/**
 * net.minecraft.class_9695
 */
typealias RecipeInput = net.minecraft.class_9695
/**
 * net.minecraft.class_4777
 */
typealias TwistingVinesBlock = net.minecraft.class_4777
/**
 * net.minecraft.class_5927
 */
typealias VegetationPatchFeatureConfig = net.minecraft.class_5927
/**
 * net.minecraft.class_1194
 */
typealias ItemWrittenBookPagesStrictJsonFix = net.minecraft.class_1194
/**
 * net.minecraft.class_8021
 */
typealias Widget = net.minecraft.class_8021
/**
 * net.minecraft.class_4559
 */
typealias StatePredicate = net.minecraft.class_4559
/**
 * net.minecraft.class_4794
 */
typealias AscendingParticle = net.minecraft.class_4794
/**
 * com.mojang.serialization.Codec
 */
typealias Codec<A> = com.mojang.serialization.Codec<A>
/**
 * net.minecraft.class_5570
 */
typealias EntityIndex<T> = net.minecraft.class_5570<T>
/**
 * net.minecraft.class_2919
 */
typealias ChunkRandom = net.minecraft.class_2919
/**
 * net.minecraft.class_958
 */
typealias TurtleEntityRenderer = net.minecraft.class_958
/**
 * net.minecraft.class_3599
 */
typealias EntityEquipmentToArmorAndHandFix = net.minecraft.class_3599
/**
 * net.minecraft.class_3160
 */
typealias SeaPickleFeature = net.minecraft.class_3160
/**
 * net.minecraft.class_1111
 */
typealias Sound = net.minecraft.class_1111
/**
 * net.minecraft.class_3039
 */
typealias LootCommand = net.minecraft.class_3039
/**
 * net.minecraft.class_1110
 */
typealias SoundEntry = net.minecraft.class_1110
/**
 * net.minecraft.class_1799
 */
typealias ItemStack = net.minecraft.class_1799
/**
 * net.minecraft.class_7117
 */
typealias MudBlock = net.minecraft.class_7117
/**
 * net.minecraft.class_7227
 */
typealias SculkChargeParticleEffect = net.minecraft.class_7227
/**
 * net.minecraft.class_1728
 */
typealias MerchantScreenHandler = net.minecraft.class_1728
/**
 * net.minecraft.class_3594
 */
typealias EntityArmorStandSilentFix = net.minecraft.class_3594
/**
 * com.mojang.serialization.codecs.RecordCodecBuilder.Instance
 */
typealias Instance<O> = com.mojang.serialization.codecs.RecordCodecBuilder.Instance<O>
/**
 * net.minecraft.class_4825
 */
typealias DefeatTargetTask = net.minecraft.class_4825
/**
 * net.minecraft.class_2371
 */
typealias DefaultedList<E> = net.minecraft.class_2371<E>
/**
 * net.minecraft.class_163
 */
typealias AdvancementManager = net.minecraft.class_163
/**
 * net.minecraft.class_6379
 */
typealias Selectable = net.minecraft.class_6379
/**
 * net.minecraft.class_3146
 */
typealias TellRawCommand = net.minecraft.class_3146
/**
 * net.minecraft.class_5470
 */
typealias Structures = net.minecraft.class_5470
/**
 * com.mojang.brigadier.arguments.LongArgumentType
 */
typealias LongArgumentType = com.mojang.brigadier.arguments.LongArgumentType
/**
 * net.minecraft.class_8725
 */
typealias DebugRaidsCustomPayload = net.minecraft.class_8725
/**
 * net.minecraft.class_2736
 */
typealias ScoreboardDisplayS2CPacket = net.minecraft.class_2736
/**
 * net.minecraft.class_4703
 */
typealias BeeDebugRenderer = net.minecraft.class_4703
/**
 * net.minecraft.class_1189
 */
typealias ItemInstanceSpawnEggFix = net.minecraft.class_1189
/**
 * net.minecraft.class_9288
 */
typealias ContainerComponent = net.minecraft.class_9288
/**
 * net.minecraft.class_860
 */
typealias ChunkLoadingDebugRenderer = net.minecraft.class_860
/**
 * net.minecraft.class_7764
 */
typealias SpriteContents = net.minecraft.class_7764
/**
 * net.minecraft.class_4207
 */
typealias VillageDebugRenderer = net.minecraft.class_4207
/**
 * net.minecraft.class_9698
 */
typealias EnchantmentEffectEntry<T> = net.minecraft.class_9698<T>
/**
 * net.minecraft.class_4255
 */
typealias LongDoorInteractGoal = net.minecraft.class_4255
/**
 * net.minecraft.class_9202
 */
typealias VaultClientData = net.minecraft.class_9202
/**
 * net.minecraft.class_7543
 */
typealias ChatSelectionScreen = net.minecraft.class_7543
/**
 * net.minecraft.class_3440
 */
typealias ChunkUpdateState = net.minecraft.class_3440
/**
 * net.minecraft.class_7172
 */
typealias SimpleOption<T> = net.minecraft.class_7172<T>
/**
 * net.minecraft.class_971
 */
typealias ZombieVillagerEntityRenderer = net.minecraft.class_971
/**
 * java.util.OptionalLong
 */
typealias OptionalLong = java.util.OptionalLong
/**
 * net.minecraft.class_5579
 */
typealias ServerEntityManager<T> = net.minecraft.class_5579<T>
/**
 * net.minecraft.class_1359
 */
typealias PounceAtTargetGoal = net.minecraft.class_1359
/**
 * net.minecraft.class_853
 */
typealias ChunkRendererRegion = net.minecraft.class_853
/**
 * net.minecraft.class_3936
 */
typealias ScreenHandlerProvider<T> = net.minecraft.class_3936<T>
/**
 * net.minecraft.class_4239
 */
typealias PathUtil = net.minecraft.class_4239
/**
 * net.minecraft.class_7610
 */
typealias MessageChain = net.minecraft.class_7610
/**
 * net.minecraft.class_5923
 */
typealias WaterloggedVegetationPatchFeature = net.minecraft.class_5923
/**
 * com.google.common.hash.HashCode
 */
typealias HashCode = com.google.common.hash.HashCode
/**
 * net.minecraft.class_8130
 */
typealias AbstractTextWidget = net.minecraft.class_8130
/**
 * net.minecraft.class_9248
 */
typealias RegistryEntryInfo = net.minecraft.class_9248
/**
 * net.minecraft.class_5417
 */
typealias PiglinBruteSpecificSensor = net.minecraft.class_5417
/**
 * net.minecraft.class_2152
 */
typealias FloatRangeArgument = net.minecraft.class_2152
/**
 * net.minecraft.class_374
 */
typealias ToastManager = net.minecraft.class_374
/**
 * net.minecraft.class_2810
 */
typealias StructureHolder = net.minecraft.class_2810
/**
 * net.minecraft.class_4185
 */
typealias ButtonWidget = net.minecraft.class_4185
/**
 * net.minecraft.class_4346
 */
typealias realms_Request<T> = net.minecraft.class_4346<T>
/**
 * com.google.common.hash.HashFunction
 */
typealias HashFunction = com.google.common.hash.HashFunction
/**
 * net.minecraft.class_1816
 */
typealias SaddleItem = net.minecraft.class_1816
/**
 * net.minecraft.class_5932
 */
typealias VerticalSurfaceType = net.minecraft.class_5932
/**
 * net.minecraft.class_3421
 */
typealias StrongholdGenerator = net.minecraft.class_3421
/**
 * net.minecraft.class_1413
 */
typealias MobVisibilityCache = net.minecraft.class_1413
/**
 * net.minecraft.class_3508
 */
typealias PackedIntegerArray = net.minecraft.class_3508
/**
 * net.minecraft.class_7576
 */
typealias TimeSupplier = net.minecraft.class_7576
/**
 * net.minecraft.class_862
 */
typealias ChunkBorderDebugRenderer = net.minecraft.class_862
/**
 * net.minecraft.class_285
 */
typealias GlProgramManager = net.minecraft.class_285
/**
 * net.minecraft.class_9796
 */
typealias JukeboxSongs = net.minecraft.class_9796
/**
 * net.minecraft.class_746
 */
typealias ClientPlayerEntity = net.minecraft.class_746
/**
 * net.minecraft.class_2799
 */
typealias ClientStatusC2SPacket = net.minecraft.class_2799
/**
 * net.minecraft.class_9331
 */
typealias ComponentType<T> = net.minecraft.class_9331<T>
/**
 * net.minecraft.class_4461
 */
typealias LongArgumentSerializer = net.minecraft.class_4461
/**
 * net.minecraft.class_6725
 */
typealias VanillaSurfaceRules = net.minecraft.class_6725
/**
 * net.minecraft.class_5582
 */
typealias ClientEntityManager<T> = net.minecraft.class_5582<T>
/**
 * net.minecraft.class_9649
 */
typealias EmptyItemInVillagerTradeFix = net.minecraft.class_9649
/**
 * net.minecraft.class_6014
 */
typealias GroupAssigningThreadFactory = net.minecraft.class_6014
/**
 * net.minecraft.class_2211
 */
typealias BambooBlock = net.minecraft.class_2211
/**
 * net.minecraft.class_2288
 */
typealias CommandBlock = net.minecraft.class_2288
/**
 * net.minecraft.class_34
 */
typealias LevelSummary = net.minecraft.class_34
/**
 * net.minecraft.class_1822
 */
typealias SignItem = net.minecraft.class_1822
/**
 * com.mojang.authlib.minecraft.report.AbuseReportLimits
 */
typealias AbuseReportLimits = com.mojang.authlib.minecraft.report.AbuseReportLimits
/**
 * net.minecraft.class_9103
 */
typealias QueryStates = net.minecraft.class_9103
/**
 * net.minecraft.class_6740
 */
typealias ProtoChunkTickListFix = net.minecraft.class_6740
/**
 * net.minecraft.class_827
 */
typealias BlockEntityRenderer<T> = net.minecraft.class_827<T>
/**
 * net.minecraft.class_2380
 */
typealias HayBlock = net.minecraft.class_2380
/**
 * net.minecraft.class_8599
 */
typealias QueryableServer = net.minecraft.class_8599
/**
 * net.minecraft.class_3813
 */
typealias VillageGenerator = net.minecraft.class_3813
/**
 * net.minecraft.class_233
 */
typealias TimerCallbackSerializer<C> = net.minecraft.class_233<C>
/**
 * net.minecraft.class_8541
 */
typealias ReferenceFont = net.minecraft.class_8541
/**
 * net.minecraft.class_2179
 */
typealias NbtCompoundArgumentType = net.minecraft.class_2179
/**
 * net.minecraft.class_3989
 */
typealias WanderingTraderEntity = net.minecraft.class_3989
/**
 * net.minecraft.class_8216
 */
typealias Urls = net.minecraft.class_8216
/**
 * net.minecraft.class_938
 */
typealias SalmonEntityRenderer = net.minecraft.class_938
/**
 * net.minecraft.class_3621
 */
typealias WaterFluid = net.minecraft.class_3621
/**
 * net.minecraft.class_1169
 */
typealias EntityShulkerColorFix = net.minecraft.class_1169
/**
 * org.lwjgl.system.Pointer
 */
typealias Pointer = org.lwjgl.system.Pointer
/**
 * net.minecraft.class_8589
 */
typealias CommonPlayerSpawnInfo = net.minecraft.class_8589
/**
 * net.minecraft.class_3591
 */
typealias ChunkToProtoChunkFix = net.minecraft.class_3591
/**
 * net.minecraft.class_5491
 */
typealias ReorderingUtil = net.minecraft.class_5491
/**
 * net.minecraft.class_4965
 */
typealias FishingHookPredicate = net.minecraft.class_4965
/**
 * net.minecraft.class_513
 */
typealias RecipeBookResults = net.minecraft.class_513
/**
 * net.minecraft.class_8015
 */
typealias GuiNavigationType = net.minecraft.class_8015
/**
 * net.minecraft.class_2753
 */
typealias DirectionProperty = net.minecraft.class_2753
/**
 * net.minecraft.class_4725
 */
typealias MipmapHelper = net.minecraft.class_4725
/**
 * net.minecraft.class_5754
 */
typealias TemptTask = net.minecraft.class_5754
/**
 * net.minecraft.class_2292
 */
typealias ConcretePowderBlock = net.minecraft.class_2292
/**
 * net.minecraft.class_2805
 */
typealias RequestCommandCompletionsC2SPacket = net.minecraft.class_2805
/**
 * net.minecraft.class_4553
 */
typealias PlayerPredicate = net.minecraft.class_4553
/**
 * net.minecraft.class_8627
 */
typealias RenameScoreboardDisplaySlotFix = net.minecraft.class_8627
/**
 * net.minecraft.class_3251
 */
typealias ServerQueryNetworkHandler = net.minecraft.class_3251
/**
 * net.minecraft.class_4812
 */
typealias RidingTask = net.minecraft.class_4812
/**
 * net.minecraft.class_327
 */
typealias TextRenderer = net.minecraft.class_327
/**
 * net.minecraft.class_1293
 */
typealias StatusEffectInstance = net.minecraft.class_1293
/**
 * net.minecraft.class_6606
 */
typealias LightData = net.minecraft.class_6606
/**
 * net.minecraft.class_8899
 */
typealias WhiteSmokeParticle = net.minecraft.class_8899
/**
 * net.minecraft.class_2478
 */
typealias AbstractSignBlock = net.minecraft.class_2478
/**
 * net.minecraft.class_3753
 */
typealias UpdateJigsawC2SPacket = net.minecraft.class_3753
/**
 * net.minecraft.class_2991
 */
typealias CommandFunctionManager = net.minecraft.class_2991
/**
 * net.minecraft.class_9479
 */
typealias OminousSpawningParticle = net.minecraft.class_9479
/**
 * net.minecraft.class_2501
 */
typealias NbtLongArray = net.minecraft.class_2501
/**
 * net.minecraft.class_6508
 */
typealias Quantiles = net.minecraft.class_6508
/**
 * net.minecraft.class_615
 */
typealias LargeTropicalFishEntityModel<T> = net.minecraft.class_615<T>
/**
 * net.minecraft.class_1394
 */
typealias WanderAroundFarGoal = net.minecraft.class_1394
/**
 * net.minecraft.class_1820
 */
typealias ShearsItem = net.minecraft.class_1820
/**
 * net.minecraft.class_1493
 */
typealias WolfEntity = net.minecraft.class_1493
/**
 * net.minecraft.class_2286
 */
typealias ComparatorBlock = net.minecraft.class_2286

/**
 * net.minecraft.class_9097
 */
typealias HandshakeStates = net.minecraft.class_9097
/**
 * net.minecraft.class_7388
 */
typealias RootPlacerType<P> = net.minecraft.class_7388<P>
/**
 * net.minecraft.class_4256
 */
typealias NearestBedSensor = net.minecraft.class_4256
/**
 * net.minecraft.class_4568
 */
typealias ReferenceLootCondition = net.minecraft.class_4568
/**
 * net.minecraft.class_2557
 */
typealias WeightedPressurePlateBlock = net.minecraft.class_2557
/**
 * net.minecraft.class_4938
 */
typealias VariantSetting<T> = net.minecraft.class_4938<T>
/**
 * net.minecraft.class_2837
 */
typealias Palette<T> = net.minecraft.class_2837<T>
/**
 * net.minecraft.class_1521
 */
typealias Phase = net.minecraft.class_1521
/**
 * net.minecraft.class_7869
 */
typealias StructurePlacementCalculator = net.minecraft.class_7869
/**
 * net.minecraft.class_189
 */
typealias AdvancementFrame = net.minecraft.class_189
/**
 * net.minecraft.class_4248
 */
typealias SeekSkyTask = net.minecraft.class_4248
/**
 * net.minecraft.class_175
 */
typealias AdvancementCriterion<T> = net.minecraft.class_175<T>
/**
 * net.minecraft.class_6538
 */
typealias BlockPredicatesChecker = net.minecraft.class_6538
/**
 * net.minecraft.class_6818
 */
typealias TreePlacedFeatures = net.minecraft.class_6818
/**
 * net.minecraft.class_4651
 */
typealias BlockStateProvider = net.minecraft.class_4651
/**
 * com.mojang.blaze3d.systems.RenderSystem
 */
typealias RenderSystem = com.mojang.blaze3d.systems.RenderSystem
/**
 * net.minecraft.class_3701
 */
typealias OcelotEntity = net.minecraft.class_3701
/**
 * net.minecraft.class_8799
 */
typealias TradeRebalanceStructureTagProvider = net.minecraft.class_8799
/**
 * net.minecraft.class_7689
 */
typealias CamelEntity = net.minecraft.class_7689
/**
 * net.minecraft.class_5365
 */
typealias GraphicsMode = net.minecraft.class_5365
/**
 * net.minecraft.class_3196
 */
typealias ChunkPosDistanceLevelPropagator = net.minecraft.class_3196
/**
 * net.minecraft.class_7999
 */
typealias FocusedTooltipPositioner = net.minecraft.class_7999
/**
 * net.minecraft.class_1736
 */
typealias ShulkerBoxSlot = net.minecraft.class_1736
/**
 * net.minecraft.class_4107
 */
typealias OpenDoorsTask = net.minecraft.class_4107
/**
 * net.minecraft.class_9322
 */
typealias ComponentHolder = net.minecraft.class_9322
/**
 * net.minecraft.class_7106
 */
typealias FrogVariant = net.minecraft.class_7106
/**
 * net.minecraft.class_263
 */
typealias SlicedVoxelShape = net.minecraft.class_263
/**
 * net.minecraft.class_2326
 */
typealias DoubleArgumentSerializer = net.minecraft.class_2326
/**
 * net.minecraft.class_3233
 */
typealias ChunkRegion = net.minecraft.class_3233
/**
 * net.minecraft.class_7371
 */
typealias EntityVariantTypeFix = net.minecraft.class_7371
/**
 * net.minecraft.class_8882
 */
typealias CrafterInputSlot = net.minecraft.class_8882
/**
 * net.minecraft.class_7208
 */
typealias SculkChargePopParticle = net.minecraft.class_7208
/**
 * net.minecraft.class_1865
 */
typealias RecipeSerializer<T> = net.minecraft.class_1865<T>
/**
 * net.minecraft.class_5299
 */
typealias StructureSeparationDataFix = net.minecraft.class_5299
/**
 * net.minecraft.class_4599
 */
typealias BufferBuilderStorage = net.minecraft.class_4599
/**
 * net.minecraft.class_5427
 */
typealias RecipeCategoryOptionsC2SPacket = net.minecraft.class_5427
/**
 * net.minecraft.class_1972
 */
typealias BiomeKeys = net.minecraft.class_1972
/**
 * net.minecraft.class_1659
 */
typealias ChatVisibility = net.minecraft.class_1659
/**
 * net.minecraft.class_6599
 */
typealias KeybindsScreen = net.minecraft.class_6599
/**
 * net.minecraft.class_4936
 */
typealias VariantSettings = net.minecraft.class_4936
/**
 * net.minecraft.class_7966
 */
typealias TelemetryEventType = net.minecraft.class_7966
/**
 * net.minecraft.class_2944
 */
typealias TreeFeature = net.minecraft.class_2944
/**
 * net.minecraft.class_267
 */
typealias ScoreboardScore = net.minecraft.class_267
/**
 * java.util.stream.LongStream
 */
typealias LongStream = java.util.stream.LongStream
/**
 * net.minecraft.class_2168
 */
typealias ServerCommandSource = net.minecraft.class_2168
/**
 * net.minecraft.class_1593
 */
typealias PhantomEntity = net.minecraft.class_1593
/**
 * net.minecraft.class_1154
 */
typealias OpenInventoryTutorialStepHandler = net.minecraft.class_1154
/**
 * net.minecraft.class_9169
 */
typealias SpawnLocationTypes = net.minecraft.class_9169
/**
 * net.minecraft.class_1735
 */
typealias Slot = net.minecraft.class_1735
/**
 * net.minecraft.class_1152
 */
typealias FindTreeTutorialStepHandler = net.minecraft.class_1152
/**
 * net.minecraft.class_3485
 */
typealias StructureTemplateManager = net.minecraft.class_3485
/**
 * net.minecraft.class_9084
 */
typealias ArmadilloEntityRenderer = net.minecraft.class_9084
/**
 * net.minecraft.class_682
 */
typealias BlockFallingDustParticle = net.minecraft.class_682
/**
 * net.minecraft.class_8770
 */
typealias AbuseReportTypeScreen = net.minecraft.class_8770
/**
 * net.minecraft.class_6088
 */
typealias WorldEvents = net.minecraft.class_6088
/**
 * net.minecraft.class_7310
 */
typealias AllayEntityRenderer = net.minecraft.class_7310
/**
 * net.minecraft.class_3711
 */
typealias CartographyTableBlock = net.minecraft.class_3711
/**
 * net.minecraft.class_1549
 */
typealias CaveSpiderEntity = net.minecraft.class_1549
/**
 * net.minecraft.class_1334
 */
typealias JumpControl = net.minecraft.class_1334
/**
 * net.minecraft.class_440
 */
typealias SkinOptionsScreen = net.minecraft.class_440
/**
 * net.minecraft.class_3097
 */
typealias ReloadCommand = net.minecraft.class_3097
/**
 * net.minecraft.class_3598
 */
typealias EntityElderGuardianSplitFix = net.minecraft.class_3598
/**
 * net.minecraft.class_8178
 */
typealias CherryFoliagePlacer = net.minecraft.class_8178
/**
 * net.minecraft.class_2669
 */
typealias PistonBlockEntity = net.minecraft.class_2669
/**
 * net.minecraft.class_5926
 */
typealias RootSystemFeatureConfig = net.minecraft.class_5926
/**
 * net.minecraft.class_1726
 */
typealias LoomScreenHandler = net.minecraft.class_1726
/**
 * net.minecraft.class_5769
 */
typealias PlayDeadTask = net.minecraft.class_5769
/**
 * net.minecraft.class_1374
 */
typealias EscapeDangerGoal = net.minecraft.class_1374
/**
 * net.minecraft.class_7391
 */
typealias CompassAnglePredicateProvider = net.minecraft.class_7391
/**
 * net.minecraft.class_4139
 */
typealias VillageGossipType = net.minecraft.class_4139
/**
 * net.minecraft.class_6490
 */
typealias PaletteStorage = net.minecraft.class_6490
/**
 * net.minecraft.class_4401
 */
typealias RealmsPendingInvitesScreen = net.minecraft.class_4401
/**
 * net.minecraft.class_2960
 */
typealias Identifier = net.minecraft.class_2960
/**
 * net.minecraft.class_3138
 */
typealias SummonCommand = net.minecraft.class_3138
/**
 * net.minecraft.class_5726
 */
typealias DripstoneHelper = net.minecraft.class_5726
/**
 * com.mojang.brigadier.arguments.StringArgumentType
 */
typealias StringArgumentType = com.mojang.brigadier.arguments.StringArgumentType
/**
 * net.minecraft.class_813
 */
typealias ModelVariant = net.minecraft.class_813
/**
 * net.minecraft.class_1198
 */
typealias MobSpawnerEntityIdentifiersFix = net.minecraft.class_1198
/**
 * net.minecraft.class_7450
 */
typealias ArgumentSignatureDataMap = net.minecraft.class_7450
/**
 * net.minecraft.class_5684
 */
typealias TooltipComponent = net.minecraft.class_5684
/**
 * net.minecraft.class_7213
 */
typealias FrogEntityRenderer = net.minecraft.class_7213
/**
 * net.minecraft.class_7956
 */
typealias FilterAtlasSource = net.minecraft.class_7956
/**
 * net.minecraft.class_4771
 */
typealias FungusBlock = net.minecraft.class_4771
/**
 * net.minecraft.class_2545
 */
typealias EncoderHandler<T> = net.minecraft.class_2545<T>
/**
 * net.minecraft.class_6793
 */
typealias CountPlacementModifier = net.minecraft.class_6793
/**
 * net.minecraft.class_4587
 */
typealias MatrixStack = net.minecraft.class_4587
/**
 * net.minecraft.class_6029
 */
typealias LeapingChargeTask = net.minecraft.class_6029
/**
 * net.minecraft.class_3503
 */
typealias TagGroupLoader<T> = net.minecraft.class_3503<T>
/**
 * net.minecraft.class_4273
 */
typealias ChunkLoadDistanceS2CPacket = net.minecraft.class_4273
/**
 * net.minecraft.class_9453
 */
typealias TrialSpawnerConfigTagFix = net.minecraft.class_9453
/**
 * net.minecraft.class_3576
 */
typealias EmptyFluid = net.minecraft.class_3576
/**
 * java.net.Proxy
 */
typealias Proxy = java.net.Proxy
/**
 * net.minecraft.class_3066
 */
typealias HugeRedMushroomFeature = net.minecraft.class_3066
/**
 * net.minecraft.class_8233
 */
typealias InkSacItem = net.minecraft.class_8233
/**
 * net.minecraft.class_1540
 */
typealias FallingBlockEntity = net.minecraft.class_1540
/**
 * net.minecraft.class_3342
 */
typealias EndCityGenerator = net.minecraft.class_3342
/**
 * net.minecraft.class_538
 */
typealias TeleportSpectatorMenu = net.minecraft.class_538
/**
 * net.minecraft.class_5891
 */
typealias EnterCombatS2CPacket = net.minecraft.class_5891
/**
 * net.minecraft.class_9197
 */
typealias VaultBlock = net.minecraft.class_9197
/**
 * net.minecraft.class_6679
 */
typealias OffsetPredicate = net.minecraft.class_6679
/**
 * net.minecraft.class_4715
 */
typealias NoOpFeature = net.minecraft.class_4715
/**
 * net.minecraft.class_5605
 */
typealias Dilation = net.minecraft.class_5605
/**
 * net.minecraft.class_5913
 */
typealias GlImportProcessor = net.minecraft.class_5913
/**
 * net.minecraft.class_9731
 */
typealias RunFunctionEnchantmentEffect = net.minecraft.class_9731
/**
 * net.minecraft.class_8251
 */
typealias VertexSorter = net.minecraft.class_8251
/**
 * net.minecraft.class_707
 */
typealias ParticleFactory<T> = net.minecraft.class_707<T>
/**
 * net.minecraft.class_638
 */
typealias ClientWorld = net.minecraft.class_638
/**
 * net.minecraft.class_1207
 */
typealias LegacyCoralFanBlockMapping = net.minecraft.class_1207
/**
 * net.minecraft.class_9028
 */
typealias Downloader = net.minecraft.class_9028
/**
 * net.minecraft.class_7164
 */
typealias SimpleNeighborUpdater = net.minecraft.class_7164
/**
 * net.minecraft.class_9255
 */
typealias BoggedEntityRenderer = net.minecraft.class_9255
/**
 * net.minecraft.class_4428
 */
typealias SizeUnit = net.minecraft.class_4428
/**
 * net.minecraft.class_8757
 */
typealias RenderingChart = net.minecraft.class_8757
/**
 * net.minecraft.class_1324
 */
typealias EntityAttributeInstance = net.minecraft.class_1324
/**
 * net.minecraft.class_3016
 */
typealias BanCommand = net.minecraft.class_3016
/**
 * net.minecraft.class_3230
 */
typealias ChunkTicketType<T> = net.minecraft.class_3230<T>
/**
 * net.minecraft.class_554
 */
typealias BoatEntityModel = net.minecraft.class_554
/**
 * net.minecraft.class_9759
 */
typealias ChunkLoader = net.minecraft.class_9759
/**
 * net.minecraft.class_9239
 */
typealias WindChargeItem = net.minecraft.class_9239
/**
 * net.minecraft.class_1184
 */
typealias ItemSpawnEggFix = net.minecraft.class_1184
/**
 * net.minecraft.class_9782
 */
typealias ServerLinks = net.minecraft.class_9782
/**
 * net.minecraft.class_7092
 */
typealias Schema3076 = net.minecraft.class_7092
/**
 * net.minecraft.util.profiling.jfr.event.ServerTickTimeEvent
 */
typealias ServerTickTimeEvent = net.minecraft.util.profiling.jfr.event.ServerTickTimeEvent
/**
 * net.minecraft.class_1295
 */
typealias AreaEffectCloudEntity = net.minecraft.class_1295
/**
 * net.minecraft.class_4943
 */
typealias Models = net.minecraft.class_4943
/**
 * net.minecraft.class_7093
 */
typealias Schema3078 = net.minecraft.class_7093
/**
 * net.minecraft.class_2158
 */
typealias CommandFunction<T> = net.minecraft.class_2158<T>
/**
 * net.minecraft.class_262
 */
typealias CroppedVoxelSet = net.minecraft.class_262
/**
 * net.minecraft.class_7508
 */
typealias RenameVariantsFix = net.minecraft.class_7508
/**
 * net.minecraft.class_5566
 */
typealias ChunkDataList<T> = net.minecraft.class_5566<T>
/**
 * net.minecraft.class_4967
 */
typealias BiomeAdditionsSound = net.minecraft.class_4967
/**
 * net.minecraft.class_4389
 */
typealias RealmsConfirmScreen = net.minecraft.class_4389
/**
 * net.minecraft.class_7245
 */
typealias Schema3081 = net.minecraft.class_7245
/**
 * net.minecraft.class_2756
 */
typealias DoubleBlockHalf = net.minecraft.class_2756
/**
 * net.minecraft.class_4521
 */
typealias TestManager = net.minecraft.class_4521
/**
 * net.minecraft.class_1212
 */
typealias EntitySimpleTransformFix = net.minecraft.class_1212
/**
 * net.minecraft.class_641
 */
typealias ServerList = net.minecraft.class_641
/**
 * net.minecraft.class_7294
 */
typealias Schema3083 = net.minecraft.class_7294
/**
 * net.minecraft.class_1379
 */
typealias WanderAroundGoal = net.minecraft.class_1379
/**
 * net.minecraft.class_2128
 */
typealias SummonedEntityCriterion = net.minecraft.class_2128
/**
 * net.minecraft.class_7246
 */
typealias Schema3082 = net.minecraft.class_7246
/**
 * net.minecraft.class_4109
 */
typealias FindInteractionTargetTask = net.minecraft.class_4109
/**
 * net.minecraft.class_5411
 */
typealias RecipeBookOptions = net.minecraft.class_5411
/**
 * net.minecraft.class_9247
 */
typealias ClientDataPackManager = net.minecraft.class_9247
/**
 * net.minecraft.class_7944
 */
typealias TelemetryInfoScreen = net.minecraft.class_7944
/**
 * net.minecraft.class_3678
 */
typealias WindowEventHandler = net.minecraft.class_3678
/**
 * net.minecraft.class_443
 */
typealias SoundOptionsScreen = net.minecraft.class_443
/**
 * net.minecraft.class_4918
 */
typealias When = net.minecraft.class_4918
/**
 * net.minecraft.class_7973
 */
typealias PropertyMap = net.minecraft.class_7973
/**
 * net.minecraft.class_3601
 */
typealias EntityHorseSaddleFix = net.minecraft.class_3601
/**
 * net.minecraft.class_8236
 */
typealias CalibratedSculkSensorBlock = net.minecraft.class_8236
/**
 * net.minecraft.class_5277
 */
typealias EntityShulkerRotationFix = net.minecraft.class_5277
/**
 * net.minecraft.class_9221
 */
typealias DataTracked = net.minecraft.class_9221
/**
 * net.minecraft.class_1148
 */
typealias SoundContainer<T> = net.minecraft.class_1148<T>
/**
 * net.minecraft.class_2573
 */
typealias BannerBlockEntity = net.minecraft.class_2573
/**
 * net.minecraft.class_1208
 */
typealias TypeReferences = net.minecraft.class_1208
/**
 * net.minecraft.class_9130
 */
typealias NetworkStateTransitions = net.minecraft.class_9130
/**
 * net.minecraft.class_4094
 */
typealias InteractionObserver = net.minecraft.class_4094
/**
 * net.minecraft.class_563
 */
typealias ElytraEntityModel<T> = net.minecraft.class_563<T>
/**
 * net.minecraft.class_2945
 */
typealias DataTracker = net.minecraft.class_2945
/**
 * net.minecraft.class_18
 */
typealias PersistentState = net.minecraft.class_18
/**
 * net.minecraft.class_4169
 */
typealias ScheduleRuleEntry = net.minecraft.class_4169
/**
 * net.minecraft.class_4816
 */
typealias MeleeAttackTask = net.minecraft.class_4816
/**
 * net.minecraft.class_7191
 */
typealias BuiltinEmptyGlyph = net.minecraft.class_7191
/**
 * net.minecraft.class_3619
 */
typealias PistonBehavior = net.minecraft.class_3619
/**
 * net.minecraft.class_4835
 */
typealias HoglinBrain = net.minecraft.class_4835
/**
 * net.minecraft.class_4595
 */
typealias CompositeEntityModel<E> = net.minecraft.class_4595<E>
/**
 * it.unimi.dsi.fastutil.longs.LongConsumer
 */
typealias LongConsumer = it.unimi.dsi.fastutil.longs.LongConsumer
/**
 * net.minecraft.class_1165
 */
typealias EntityRedundantChanceTagsFix = net.minecraft.class_1165
/**
 * net.minecraft.class_1368
 */
typealias MoveThroughVillageGoal = net.minecraft.class_1368
/**
 * net.minecraft.class_7926
 */
typealias FillBiomeCommand = net.minecraft.class_7926
/**
 * net.minecraft.class_3530
 */
typealias LowercaseEnumTypeAdapterFactory = net.minecraft.class_3530

/**
 * net.minecraft.class_1134
 */
typealias LanServerQueryManager = net.minecraft.class_1134
/**
 * net.minecraft.class_3956
 */
typealias RecipeType<T> = net.minecraft.class_3956<T>
/**
 * net.minecraft.class_9750
 */
typealias MovementPredicate = net.minecraft.class_9750
/**
 * net.minecraft.class_7826
 */
typealias MessageLink = net.minecraft.class_7826
/**
 * net.minecraft.class_1330
 */
typealias BodyControl = net.minecraft.class_1330
/**
 * net.minecraft.class_383
 */
typealias RenderableGlyph = net.minecraft.class_383
/**
 * net.minecraft.class_1675
 */
typealias ProjectileUtil = net.minecraft.class_1675
/**
 * net.minecraft.class_473
 */
typealias BookEditScreen = net.minecraft.class_473
/**
 * net.minecraft.class_3164
 */
typealias DataCommand = net.minecraft.class_3164
/**
 * java.util.EnumSet
 */
typealias EnumSet<E> = java.util.EnumSet<E>
/**
 * net.minecraft.class_7555
 */
typealias ChatLog = net.minecraft.class_7555
/**
 * net.minecraft.class_9146
 */
typealias SideValidatingDispatchingCodecBuilder<B, L> = net.minecraft.class_9146<B, L>
/**
 * net.minecraft.class_3816
 */
typealias StructurePoolElementType<P> = net.minecraft.class_3816<P>
/**
 * net.minecraft.class_8020
 */
typealias LogoDrawer = net.minecraft.class_8020
/**
 * net.minecraft.class_5592
 */
typealias SetBannerPatternLootFunction = net.minecraft.class_5592
/**
 * net.minecraft.class_4822
 */
typealias RangedApproachTask = net.minecraft.class_4822
/**
 * net.minecraft.class_1754
 */
typealias GlassBottleItem = net.minecraft.class_1754
/**
 * net.minecraft.class_2941
 */
typealias TrackedDataHandler<T> = net.minecraft.class_2941<T>
/**
 * net.minecraft.class_9306
 */
typealias TradedItem = net.minecraft.class_9306
/**
 * net.minecraft.class_4831
 */
typealias Memory<T> = net.minecraft.class_4831<T>
/**
 * net.minecraft.class_5462
 */
typealias CharPredicate = net.minecraft.class_5462
/**
 * net.minecraft.class_6492
 */
typealias Spline<C, I> = net.minecraft.class_6492<C, I>
/**
 * net.minecraft.class_1515
 */
typealias DyingPhase = net.minecraft.class_1515
/**
 * net.minecraft.class_907
 */
typealias GuardianEntityRenderer = net.minecraft.class_907
/**
 * net.minecraft.class_1541
 */
typealias TntEntity = net.minecraft.class_1541
/**
 * net.minecraft.class_8844
 */
typealias CreatingSnapshotWorldTask = net.minecraft.class_8844
/**
 * net.minecraft.class_9066
 */
typealias EntityAttachments = net.minecraft.class_9066
/**
 * net.minecraft.class_6395
 */
typealias ClampedModelPredicateProvider = net.minecraft.class_6395
/**
 * net.minecraft.class_570
 */
typealias GuardianEntityModel = net.minecraft.class_570
/**
 * net.minecraft.class_1690
 */
typealias BoatEntity = net.minecraft.class_1690
/**
 * net.minecraft.class_4662
 */
typealias TreeDecorator = net.minecraft.class_4662
/**
 * net.minecraft.class_3755
 */
typealias ChunkLightRemoveFix = net.minecraft.class_3755
/**
 * net.minecraft.class_5362
 */
typealias ExplosionBehavior = net.minecraft.class_5362
/**
 * net.minecraft.class_4135
 */
typealias PrioritizedGoal = net.minecraft.class_4135
/**
 * net.minecraft.class_9310
 */
typealias ChunkGenerating = net.minecraft.class_9310
/**
 * net.minecraft.class_1627
 */
typealias StrayEntity = net.minecraft.class_1627
/**
 * net.minecraft.class_8762
 */
typealias PacketSizeLogger = net.minecraft.class_8762
/**
 * net.minecraft.class_6761
 */
typealias SerializableTickScheduler<T> = net.minecraft.class_6761<T>
/**
 * net.minecraft.class_6862
 */
typealias TagKey<T> = net.minecraft.class_6862<T>
/**
 * net.minecraft.class_7710
 */
typealias CraftingRecipeCategory = net.minecraft.class_7710
/**
 * net.minecraft.class_8057
 */
typealias ArmorTrimPatterns = net.minecraft.class_8057
/**
 * net.minecraft.class_4773
 */
typealias NetherrackBlock = net.minecraft.class_4773
/**
 * net.minecraft.class_2445
 */
typealias PumpkinBlock = net.minecraft.class_2445
/**
 * net.minecraft.class_8961
 */
typealias TrialSpawnerBlockEntity = net.minecraft.class_8961
/**
 * net.minecraft.class_6378
 */
typealias ProtectedBlocksStructureProcessor = net.minecraft.class_6378
/**
 * net.minecraft.class_2301
 */
typealias CoralBlock = net.minecraft.class_2301
/**
 * net.minecraft.class_960
 */
typealias VexEntityRenderer = net.minecraft.class_960
/**
 * net.minecraft.class_7620
 */
typealias FutureQueue = net.minecraft.class_7620
/**
 * net.minecraft.class_4127
 */
typealias ScheduleActivityTask = net.minecraft.class_4127
/**
 * net.minecraft.class_2593
 */
typealias CommandBlockBlockEntity = net.minecraft.class_2593
/**
 * net.minecraft.class_5182
 */
typealias BastionTreasureData = net.minecraft.class_5182
/**
 * net.minecraft.class_7248
 */
typealias RideableInventory = net.minecraft.class_7248
/**
 * net.minecraft.class_2556
 */
typealias MessageType = net.minecraft.class_2556
/**
 * net.minecraft.class_910
 */
typealias HorseEntityRenderer = net.minecraft.class_910
/**
 * net.minecraft.class_7384
 */
typealias ThreadSafeRandom = net.minecraft.class_7384
/**
 * net.minecraft.class_8059
 */
typealias SmithingRecipe = net.minecraft.class_8059
/**
 * net.minecraft.class_4481
 */
typealias BeehiveBlock = net.minecraft.class_4481
/**
 * net.minecraft.class_3081
 */
typealias KelpFeature = net.minecraft.class_3081
/**
 * net.minecraft.class_9088
 */
typealias CookieRequestS2CPacket = net.minecraft.class_9088
/**
 * net.minecraft.class_2678
 */
typealias GameJoinS2CPacket = net.minecraft.class_2678
/**
 * net.minecraft.class_7133
 */
typealias SculkShriekerBlockEntity = net.minecraft.class_7133
/**
 * net.minecraft.class_806
 */
typealias ModelOverrideList = net.minecraft.class_806
/**
 * net.minecraft.class_5898
 */
typealias WorldBorderWarningTimeChangedS2CPacket = net.minecraft.class_5898
/**
 * net.minecraft.class_2383
 */
typealias HorizontalFacingBlock = net.minecraft.class_2383
/**
 * net.minecraft.class_7166
 */
typealias SpaceFont = net.minecraft.class_7166
/**
 * net.minecraft.class_7469
 */
typealias MessageSignatureData = net.minecraft.class_7469
/**
 * net.minecraft.class_471
 */
typealias AnvilScreen = net.minecraft.class_471
/**
 * net.minecraft.class_1522
 */
typealias SittingScanningPhase = net.minecraft.class_1522
/**
 * net.minecraft.class_4897
 */
typealias BiomeEffectSoundPlayer = net.minecraft.class_4897
/**
 * net.minecraft.class_9350
 */
typealias SlotsPredicate = net.minecraft.class_9350
/**
 * net.minecraft.class_687
 */
typealias FlameParticle = net.minecraft.class_687
/**
 * net.minecraft.class_179
 */
typealias Criterion<T> = net.minecraft.class_179<T>
/**
 * net.minecraft.class_1966
 */
typealias BiomeSource = net.minecraft.class_1966
/**
 * net.minecraft.class_918
 */
typealias ItemRenderer = net.minecraft.class_918
/**
 * net.minecraft.class_2965
 */
typealias ProjectileDispenserBehavior = net.minecraft.class_2965
/**
 * net.minecraft.class_3819
 */
typealias BlockMatchRuleTest = net.minecraft.class_3819
/**
 * net.minecraft.class_7269
 */
typealias Vibration = net.minecraft.class_7269
/**
 * net.minecraft.class_4456
 */
typealias CsvWriter = net.minecraft.class_4456
/**
 * jdk.jfr.consumer.RecordedEvent
 */
typealias RecordedEvent = jdk.jfr.consumer.RecordedEvent
/**
 * net.minecraft.class_3104
 */
typealias SaveAllCommand = net.minecraft.class_3104
/**
 * net.minecraft.class_6880
 */
typealias RegistryEntry<T> = net.minecraft.class_6880<T>
/**
 * java.nio.ByteBuffer
 */
typealias ByteBuffer = java.nio.ByteBuffer
/**
 * net.minecraft.class_7487
 */
typealias BlockRotationArgumentType = net.minecraft.class_7487
/**
 * net.minecraft.class_2115
 */
typealias PlayerHurtEntityCriterion = net.minecraft.class_2115
/**
 * net.minecraft.class_2462
 */
typealias RepeaterBlock = net.minecraft.class_2462
/**
 * net.minecraft.class_1155
 */
typealias TutorialStepHandler = net.minecraft.class_1155
/**
 * net.minecraft.class_708
 */
typealias AnimatedParticle = net.minecraft.class_708
/**
 * net.minecraft.class_4992
 */
typealias AxisAlignedLinearPosRuleTest = net.minecraft.class_4992
/**
 * net.minecraft.class_8707
 */
typealias DebugBeeCustomPayload = net.minecraft.class_8707
/**
 * net.minecraft.class_8221
 */
typealias UpdateSignTextFormatFix = net.minecraft.class_8221
/**
 * net.minecraft.class_4869
 */
typealias CheckedGson = net.minecraft.class_4869
/**
 * net.minecraft.class_6826
 */
typealias FixedBufferInputStream = net.minecraft.class_6826
/**
 * net.minecraft.class_7398
 */
typealias AboveRootPlacement = net.minecraft.class_7398
/**
 * net.minecraft.class_7095
 */
typealias CroakTask = net.minecraft.class_7095
/**
 * net.minecraft.class_2781
 */
typealias EntityAttributesS2CPacket = net.minecraft.class_2781
/**
 * net.minecraft.class_423
 */
typealias SleepingChatScreen = net.minecraft.class_423
/**
 * net.minecraft.class_2760
 */
typealias BlockHalf = net.minecraft.class_2760
/**
 * net.minecraft.class_3608
 */
typealias EntityPufferfishRenameFix = net.minecraft.class_3608
/**
 * net.minecraft.class_5646
 */
typealias ContextLootNbtProvider = net.minecraft.class_5646
/**
 * net.minecraft.class_5776
 */
typealias GlowSquidEntity = net.minecraft.class_5776
/**
 * net.minecraft.class_1246
 */
typealias Schema700 = net.minecraft.class_1246
/**
 * net.minecraft.class_1249
 */
typealias Schema701 = net.minecraft.class_1249
/**
 * net.minecraft.class_1250
 */
typealias Schema704 = net.minecraft.class_1250
/**
 * net.minecraft.class_3235
 */
typealias MultiTickScheduler<T> = net.minecraft.class_3235<T>
/**
 * net.minecraft.class_2293
 */
typealias ItemPredicateArgumentType = net.minecraft.class_2293
/**
 * net.minecraft.class_1253
 */
typealias Schema705 = net.minecraft.class_1253
/**
 * net.minecraft.class_3244
 */
typealias ServerPlayNetworkHandler = net.minecraft.class_3244
/**
 * java.lang.StackTraceElement
 */
typealias StackTraceElement = java.lang.StackTraceElement
/**
 * net.minecraft.class_1248
 */
typealias Schema702 = net.minecraft.class_1248
/**
 * net.minecraft.class_1251
 */
typealias Schema703 = net.minecraft.class_1251
/**
 * net.minecraft.class_7927
 */
typealias LazyIterationConsumer<T> = net.minecraft.class_7927<T>
/**
 * net.minecraft.class_2774
 */
typealias NbtQueryResponseS2CPacket = net.minecraft.class_2774
/**
 * net.minecraft.class_4513
 */
typealias PositionedException = net.minecraft.class_4513
/**
 * java.util.concurrent.Executor
 */
typealias Executor = java.util.concurrent.Executor
/**
 * net.minecraft.class_7142
 */
typealias FlatLevelGeneratorPreset = net.minecraft.class_7142
/**
 * net.minecraft.class_5483
 */
typealias SpawnSettings = net.minecraft.class_5483
/**
 * net.minecraft.class_4530
 */
typealias TestFunctionArgumentType = net.minecraft.class_4530
/**
 * net.minecraft.class_2586
 */
typealias BlockEntity = net.minecraft.class_2586
/**
 * net.minecraft.class_1001
 */
typealias TropicalFishColorFeatureRenderer = net.minecraft.class_1001
/**
 * net.minecraft.class_8173
 */
typealias DecoratedPotPatterns = net.minecraft.class_8173
/**
 * net.minecraft.class_2040
 */
typealias EntityFlagsPredicate = net.minecraft.class_2040
/**
 * net.minecraft.class_2764
 */
typealias PistonType = net.minecraft.class_2764
/**
 * net.minecraft.class_5608
 */
typealias TextureDimensions = net.minecraft.class_5608
/**
 * net.minecraft.class_2543
 */
typealias DecoderHandler<T> = net.minecraft.class_2543<T>
/**
 * net.minecraft.class_591
 */
typealias PlayerEntityModel<T> = net.minecraft.class_591<T>
/**
 * net.minecraft.class_8845
 */
typealias DustPlumeParticle = net.minecraft.class_8845
/**
 * net.minecraft.class_8704
 */
typealias VarLongs = net.minecraft.class_8704
/**
 * net.minecraft.class_7757
 */
typealias ContextMessageCollector = net.minecraft.class_7757
/**
 * net.minecraft.class_9142
 */
typealias PacketEncoder<O, T> = net.minecraft.class_9142<O, T>
/**
 * net.minecraft.class_7193
 */
typealias GeneratorOptionsHolder = net.minecraft.class_7193
/**
 * net.minecraft.class_9025
 */
typealias StyledNumberFormat = net.minecraft.class_9025
/**
 * net.minecraft.class_8174
 */
typealias BrushableBlockEntity = net.minecraft.class_8174
/**
 * net.minecraft.class_5737
 */
typealias VibrationParticle = net.minecraft.class_5737
/**
 * net.minecraft.class_9157
 */
typealias ConfigurationStates = net.minecraft.class_9157
/**
 * net.minecraft.class_244
 */
typealias BitSetVoxelSet = net.minecraft.class_244
/**
 * net.minecraft.class_2314
 */
typealias ArgumentSerializer<A, T> = net.minecraft.class_2314<A, T>
/**
 * net.minecraft.class_6726
 */
typealias TheEndBiomeCreator = net.minecraft.class_6726
/**
 * net.minecraft.class_4121
 */
typealias GoToRememberedPositionTask = net.minecraft.class_4121
/**
 * net.minecraft.class_1174
 */
typealias EntityZombieVillagerTypeFix = net.minecraft.class_1174
/**
 * net.minecraft.class_1291
 */
typealias StatusEffect = net.minecraft.class_1291
/**
 * net.minecraft.class_8574
 */
typealias WearableCarvedPumpkinBlock = net.minecraft.class_8574
/**
 * net.minecraft.class_9095
 */
typealias PlayStateFactories = net.minecraft.class_9095
/**
 * net.minecraft.class_2770
 */
typealias StopSoundS2CPacket = net.minecraft.class_2770
/**
 * net.minecraft.class_7126
 */
typealias SculkCatalystBlock = net.minecraft.class_7126
/**
 * net.minecraft.class_5425
 */
typealias ServerWorldAccess = net.minecraft.class_5425
/**
 * net.minecraft.class_8987
 */
typealias WindChargeEntityRenderer = net.minecraft.class_8987
/**
 * net.minecraft.class_5475
 */
typealias DynamicRegistriesProvider = net.minecraft.class_5475
/**
 * net.minecraft.class_9392
 */
typealias ParseError<S> = net.minecraft.class_9392<S>
/**
 * net.minecraft.class_9284
 */
typealias FireworksComponent = net.minecraft.class_9284
/**
 * net.minecraft.class_494
 */
typealias LoomScreen = net.minecraft.class_494
/**
 * net.minecraft.class_3556
 */
typealias ChunkToNibbleArrayMap<M> = net.minecraft.class_3556<M>
/**
 * net.minecraft.class_2319
 */
typealias ConstantArgumentSerializer<A> = net.minecraft.class_2319<A>
/**
 * net.minecraft.class_758
 */
typealias BackgroundRenderer = net.minecraft.class_758
/**
 * net.minecraft.class_9342
 */
typealias ComponentFix = net.minecraft.class_9342
/**
 * net.minecraft.class_10
 */
typealias NavigationType = net.minecraft.class_10
/**
 * net.minecraft.class_1348
 */
typealias FollowMobGoal = net.minecraft.class_1348
/**
 * net.minecraft.class_2177
 */
typealias ColorArgumentType = net.minecraft.class_2177
/**
 * net.minecraft.class_1841
 */
typealias PlaceableOnWaterItem = net.minecraft.class_1841
/**
 * net.minecraft.class_2318
 */
typealias FacingBlock = net.minecraft.class_2318
/**
 * net.minecraft.class_8215
 */
typealias DynamicTexture = net.minecraft.class_8215
/**
 * net.minecraft.class_775
 */
typealias FluidRenderer = net.minecraft.class_775
/**
 * net.minecraft.class_1144
 */
typealias SoundManager = net.minecraft.class_1144
/**
 * net.minecraft.class_2279
 */
typealias ChorusFlowerBlock = net.minecraft.class_2279
/**
 * net.minecraft.class_8942
 */
typealias ErrorReporter = net.minecraft.class_8942
/**
 * net.minecraft.class_420
 */
typealias DirectConnectScreen = net.minecraft.class_420
/**
 * net.minecraft.class_5872
 */
typealias CarverDebugConfig = net.minecraft.class_5872
/**
 * net.minecraft.class_8086
 */
typealias GridScreenTab = net.minecraft.class_8086
/**
 * net.minecraft.class_3068
 */
typealias GiveCommand = net.minecraft.class_3068
/**
 * net.minecraft.class_3708
 */
typealias BarrelBlock = net.minecraft.class_3708
/**
 * net.minecraft.class_5928
 */
typealias RandomSpreadFoliagePlacer = net.minecraft.class_5928
/**
 * net.minecraft.class_5513
 */
typealias TextStream = net.minecraft.class_5513
/**
 * net.minecraft.class_1688
 */
typealias AbstractMinecartEntity = net.minecraft.class_1688
/**
 * net.minecraft.class_3341
 */
typealias BlockBox = net.minecraft.class_3341
/**
 * net.minecraft.class_3988
 */
typealias MerchantEntity = net.minecraft.class_3988
/**
 * net.minecraft.class_2423
 */
typealias NetherPortalBlock = net.minecraft.class_2423
/**
 * net.minecraft.class_2416
 */
typealias VanillaNetherTabAdvancementGenerator = net.minecraft.class_2416
/**
 * net.minecraft.class_2370
 */
typealias SimpleRegistry<T> = net.minecraft.class_2370<T>
/**
 * com.mojang.serialization.Lifecycle
 */
typealias Lifecycle = com.mojang.serialization.Lifecycle
/**
 * net.minecraft.class_7459
 */
typealias VanillaInstrumentTagProvider = net.minecraft.class_7459
/**
 * net.minecraft.class_4817
 */
typealias StartRidingTask = net.minecraft.class_4817
/**
 * net.minecraft.class_7935
 */
typealias LogWriter<T> = net.minecraft.class_7935<T>
/**
 * net.minecraft.class_5537
 */
typealias BundleItem = net.minecraft.class_5537
/**
 * net.minecraft.class_6953
 */
typealias NoiseRouter = net.minecraft.class_6953
/**
 * net.minecraft.class_498
 */
typealias SignEditScreen = net.minecraft.class_498
/**
 * net.minecraft.class_2505
 */
typealias NbtSizeTracker = net.minecraft.class_2505
/**
 * net.minecraft.class_3710
 */
typealias BlastFurnaceBlock = net.minecraft.class_3710
/**
 * net.minecraft.class_3924
 */
typealias CampfireBlockEntity = net.minecraft.class_3924
/**
 * net.minecraft.class_936
 */
typealias PufferfishEntityRenderer = net.minecraft.class_936
/**
 * net.minecraft.class_2852
 */
typealias ChunkSerializer = net.minecraft.class_2852
/**
 * net.minecraft.class_7262
 */
typealias SculkShriekerWarningManager = net.minecraft.class_7262
/**
 * net.minecraft.class_2400
 */
typealias SimpleParticleType = net.minecraft.class_2400
/**
 * net.minecraft.class_4953
 */
typealias TwistingVinesFeature = net.minecraft.class_4953
/**
 * net.minecraft.class_829
 */
typealias ConduitBlockEntityRenderer = net.minecraft.class_829
/**
 * net.minecraft.class_2027
 */
typealias EffectsChangedCriterion = net.minecraft.class_2027
/**
 * net.minecraft.class_8138
 */
typealias DisplayEntityRenderer<T, S> = net.minecraft.class_8138<T, S>
/**
 * net.minecraft.class_2767
 */
typealias PlaySoundS2CPacket = net.minecraft.class_2767
/**
 * net.minecraft.class_2334
 */
typealias EndPortalBlock = net.minecraft.class_2334
/**
 * net.minecraft.class_8083
 */
typealias Navigable = net.minecraft.class_8083
/**
 * net.minecraft.class_631
 */
typealias ClientChunkManager = net.minecraft.class_631
/**
 * net.minecraft.class_840
 */
typealias EndPortalBlockEntityRenderer<T> = net.minecraft.class_840<T>
/**
 * net.minecraft.class_1863
 */
typealias RecipeManager = net.minecraft.class_1863
/**
 * net.minecraft.class_194
 */
typealias AdvancementPositioner = net.minecraft.class_194
/**
 * net.minecraft.class_7287
 */
typealias WardenEntityRenderer = net.minecraft.class_7287
/**
 * net.minecraft.class_42
 */
typealias BoundedIntUnaryOperator = net.minecraft.class_42
/**
 * net.minecraft.class_6498
 */
typealias WinNativeModuleUtil = net.minecraft.class_6498
/**
 * net.minecraft.class_8836
 */
typealias VehicleEntity = net.minecraft.class_8836
/**
 * net.minecraft.class_5250
 */
typealias MutableText = net.minecraft.class_5250
/**
 * net.minecraft.class_8503
 */
typealias ReturnCommand = net.minecraft.class_8503
/**
 * net.minecraft.class_2840
 */
typealias CraftRequestC2SPacket = net.minecraft.class_2840
/**
 * net.minecraft.class_5629
 */
typealias PlayerAssociatedNetworkHandler = net.minecraft.class_5629
/**
 * net.minecraft.class_2964
 */
typealias ChorusPlantFeature = net.minecraft.class_2964
/**
 * net.minecraft.class_8794
 */
typealias TradeRebalanceChestLootTableGenerator = net.minecraft.class_8794
/**
 * net.minecraft.class_487
 */
typealias EnchantingPhrases = net.minecraft.class_487
/**
 * net.minecraft.class_1264
 */
typealias ItemScatterer = net.minecraft.class_1264
/**
 * net.minecraft.class_7581
 */
typealias PeriodicRunnerFactory = net.minecraft.class_7581
/**
 * net.minecraft.class_1492
 */
typealias AbstractDonkeyEntity = net.minecraft.class_1492
/**
 * net.minecraft.class_3957
 */
typealias CookingRecipeSerializer<T> = net.minecraft.class_3957<T>
/**
 * net.minecraft.class_2331
 */
typealias EnchantingTableBlock = net.minecraft.class_2331
/**
 * net.minecraft.class_928
 */
typealias PaintingEntityRenderer = net.minecraft.class_928
/**
 * net.minecraft.class_2489
 */
typealias NbtDouble = net.minecraft.class_2489
/**
 * net.minecraft.class_4136
 */
typealias VillagerGossips = net.minecraft.class_4136
/**
 * net.minecraft.class_5777
 */
typealias GlowLichenBlock = net.minecraft.class_5777
/**
 * net.minecraft.class_6136
 */
typealias LinkedBlockPosHashSet = net.minecraft.class_6136
/**
 * net.minecraft.class_1474
 */
typealias TropicalFishEntity = net.minecraft.class_1474
/**
 * net.minecraft.class_8527
 */
typealias LightSourceView = net.minecraft.class_8527
/**
 * net.minecraft.class_7655
 */
typealias RegistryLoader = net.minecraft.class_7655
/**
 * net.minecraft.class_7475
 */
typealias TagFile = net.minecraft.class_7475
/**
 * net.minecraft.class_8204
 */
typealias RealmsNotification = net.minecraft.class_8204
/**
 * net.minecraft.class_4886
 */
typealias RegionPingResult = net.minecraft.class_4886
/**
 * net.minecraft.class_6636
 */
typealias AddFlagIfNotPresentFix = net.minecraft.class_6636
/**
 * net.minecraft.class_2438
 */
typealias LootTableProvider = net.minecraft.class_2438
/**
 * net.minecraft.class_368
 */
typealias Toast = net.minecraft.class_368
/**
 * net.minecraft.class_1046
 */
typealias PlayerSkinTexture = net.minecraft.class_1046
/**
 * com.mojang.serialization.MapDecoder
 */
typealias MapDecoder<A> = com.mojang.serialization.MapDecoder<A>
/**
 * net.minecraft.class_1201
 */
typealias OptionsKeyLwjgl3Fix = net.minecraft.class_1201
/**
 * net.minecraft.class_5148
 */
typealias HorseMarking = net.minecraft.class_5148
/**
 * net.minecraft.class_2695
 */
typealias CraftFailedResponseS2CPacket = net.minecraft.class_2695
/**
 * net.minecraft.class_378
 */
typealias FontManager = net.minecraft.class_378
/**
 * net.minecraft.class_5421
 */
typealias RecipeBookCategory = net.minecraft.class_5421
/**
 * net.minecraft.class_5468
 */
typealias StructurePools = net.minecraft.class_5468
/**
 * net.minecraft.class_9089
 */
typealias CookiePackets = net.minecraft.class_9089
/**
 * net.minecraft.class_5831
 */
typealias AtomicStack<T> = net.minecraft.class_5831<T>
/**
 * net.minecraft.class_2461
 */
typealias NbtProvider = net.minecraft.class_2461
/**
 * net.minecraft.class_2874
 */
typealias DimensionType = net.minecraft.class_2874
/**
 * net.minecraft.class_8189
 */
typealias BrushableBlockEntityRenderer = net.minecraft.class_8189
/**
 * net.minecraft.class_974
 */
typealias CreeperChargeFeatureRenderer = net.minecraft.class_974
/**
 * net.minecraft.class_2510
 */
typealias StairsBlock = net.minecraft.class_2510
/**
 * net.minecraft.class_1181
 */
typealias ItemIdFix = net.minecraft.class_1181
/**
 * net.minecraft.class_2792
 */
typealias ServerPlayPacketListener = net.minecraft.class_2792
/**
 * net.minecraft.class_4099
 */
typealias BlockPosLookTarget = net.minecraft.class_4099
/**
 * net.minecraft.class_4426
 */
typealias RealmsTermsScreen = net.minecraft.class_4426
/**
 * net.minecraft.class_7409
 */
typealias DiscFragmentItem = net.minecraft.class_7409
/**
 * net.minecraft.class_9368
 */
typealias ListOperation = net.minecraft.class_9368

/**
 * net.minecraft.class_75
 */
typealias LootPoolEntryTypes = net.minecraft.class_75
/**
 * net.minecraft.class_9038
 */
typealias DownloadQueuer = net.minecraft.class_9038
/**
 * net.minecraft.class_8887
 */
typealias CrafterBlockEntity = net.minecraft.class_8887
/**
 * net.minecraft.class_4892
 */
typealias OptionSliderWidget = net.minecraft.class_4892
/**
 * net.minecraft.class_2602
 */
typealias ClientPlayPacketListener = net.minecraft.class_2602
/**
 * net.minecraft.class_344
 */
typealias TexturedButtonWidget = net.minecraft.class_344
/**
 * net.minecraft.class_5224
 */
typealias CharacterVisitor = net.minecraft.class_5224
/**
 * net.minecraft.class_2191
 */
typealias GameProfileArgumentType = net.minecraft.class_2191
/**
 * net.minecraft.class_6530
 */
typealias ThreadAllocationStatisticsSample = net.minecraft.class_6530
/**
 * net.minecraft.class_582
 */
typealias OcelotEntityModel<T> = net.minecraft.class_582<T>
/**
 * net.minecraft.class_2937
 */
typealias QueryRequestC2SPacket = net.minecraft.class_2937
/**
 * net.minecraft.class_7244
 */
typealias LargeEntitySpawnHelper = net.minecraft.class_7244
/**
 * net.minecraft.class_2598
 */
typealias NetworkSide = net.minecraft.class_2598
/**
 * net.minecraft.class_3309
 */
typealias BanEntry<T> = net.minecraft.class_3309<T>
/**
 * net.minecraft.class_3071
 */
typealias IglooStructure = net.minecraft.class_3071
/**
 * net.minecraft.class_9279
 */
typealias NbtComponent = net.minecraft.class_9279
/**
 * net.minecraft.class_6503
 */
typealias UntaggedSpawnerFix = net.minecraft.class_6503
/**
 * net.minecraft.class_8824
 */
typealias TextCodecs = net.minecraft.class_8824
/**
 * net.minecraft.class_4713
 */
typealias SlideDownBlockCriterion = net.minecraft.class_4713
/**
 * net.minecraft.class_2291
 */
typealias ItemStringReader = net.minecraft.class_2291
/**
 * net.minecraft.class_2835
 */
typealias PaletteResizeListener<T> = net.minecraft.class_2835<T>
/**
 * net.minecraft.class_6025
 */
typealias Tameable = net.minecraft.class_6025
/**
 * net.minecraft.class_7962
 */
typealias SentTelemetryEvent = net.minecraft.class_7962
/**
 * net.minecraft.class_4437
 */
typealias OpenServerTask = net.minecraft.class_4437
/**
 * net.minecraft.class_3725
 */
typealias EntityCatSplitFix = net.minecraft.class_3725
/**
 * net.minecraft.class_4995
 */
typealias PosRuleTest = net.minecraft.class_4995
/**
 * net.minecraft.class_6797
 */
typealias PlacementModifier = net.minecraft.class_6797
/**
 * net.minecraft.class_8760
 */
typealias ChunkBatchSizeCalculator = net.minecraft.class_8760
/**
 * net.minecraft.class_7422
 */
typealias TrackedPosition = net.minecraft.class_7422
/**
 * net.minecraft.class_5733
 */
typealias SmallDripstoneFeatureConfig = net.minecraft.class_5733
/**
 * net.minecraft.class_278
 */
typealias Uniform = net.minecraft.class_278
/**
 * net.minecraft.class_2538
 */
typealias TripwireBlock = net.minecraft.class_2538
/**
 * net.minecraft.class_8218
 */
typealias GivensPair = net.minecraft.class_8218
/**
 * net.minecraft.class_744
 */
typealias Input = net.minecraft.class_744
/**
 * net.minecraft.class_4413
 */
typealias ResetWorldInfo = net.minecraft.class_4413
/**
 * net.minecraft.class_7100
 */
typealias FrogAttackablesSensor = net.minecraft.class_7100
/**
 * net.minecraft.class_1603
 */
typealias RangedAttackMob = net.minecraft.class_1603
/**
 * net.minecraft.class_4229
 */
typealias ChannelList = net.minecraft.class_4229
/**
 * net.minecraft.class_8042
 */
typealias BundleS2CPacket = net.minecraft.class_8042
/**
 * net.minecraft.class_2640
 */
typealias EndPortalBlockEntity = net.minecraft.class_2640
/**
 * net.minecraft.class_1701
 */
typealias TntMinecartEntity = net.minecraft.class_1701
/**
 * net.minecraft.class_4503
 */
typealias GameTestDebugRenderer = net.minecraft.class_4503
/**
 * net.minecraft.class_159
 */
typealias SetCustomDataLootFunction = net.minecraft.class_159
/**
 * net.minecraft.class_5255
 */
typealias RedstoneConnectionsFix = net.minecraft.class_5255
/**
 * net.minecraft.class_8514
 */
typealias Vibrations = net.minecraft.class_8514
/**
 * net.minecraft.class_8839
 */
typealias AbstractServerCommandSource<T> = net.minecraft.class_8839<T>
/**
 * net.minecraft.class_6491
 */
typealias CubicSampler = net.minecraft.class_6491
/**
 * net.minecraft.class_4588
 */
typealias VertexConsumer = net.minecraft.class_4588
/**
 * net.minecraft.class_7416
 */
typealias VanillaPaintingVariantTagProvider = net.minecraft.class_7416
/**
 * net.minecraft.class_9460
 */
typealias EquipmentHolder = net.minecraft.class_9460
/**
 * net.minecraft.class_5641
 */
typealias AndLootFunction = net.minecraft.class_5641
/**
 * java.util.Date
 */
typealias Date = java.util.Date
/**
 * net.minecraft.class_3210
 */
typealias PlayerChunkWatchingManager = net.minecraft.class_3210
/**
 * net.minecraft.class_553
 */
typealias BatEntityModel = net.minecraft.class_553
/**
 * net.minecraft.class_4723
 */
typealias SpriteTexturedVertexConsumer = net.minecraft.class_4723
/**
 * net.minecraft.class_361
 */
typealias ToggleButtonWidget = net.minecraft.class_361
/**
 * net.minecraft.class_1078
 */
typealias TranslationStorage = net.minecraft.class_1078
/**
 * net.minecraft.class_846
 */
typealias ChunkBuilder = net.minecraft.class_846
/**
 * net.minecraft.class_1199
 */
typealias ObjectiveRenderTypeFix = net.minecraft.class_1199
/**
 * net.minecraft.class_5803
 */
typealias CaveVines = net.minecraft.class_5803
/**
 * net.minecraft.class_2693
 */
typealias SignEditorOpenS2CPacket = net.minecraft.class_2693
/**
 * net.minecraft.class_4147
 */
typealias NearestPlayersSensor = net.minecraft.class_4147
/**
 * net.minecraft.class_156
 */
typealias Util = net.minecraft.class_156
/**
 * net.minecraft.class_3858
 */
typealias FurnaceScreenHandler = net.minecraft.class_3858
/**
 * net.minecraft.class_998
 */
typealias TridentRiptideFeatureRenderer<T> = net.minecraft.class_998<T>
/**
 * net.minecraft.class_5743
 */
typealias DustColorTransitionParticleEffect = net.minecraft.class_5743
/**
 * net.minecraft.class_8756
 */
typealias PacketSizeChart = net.minecraft.class_8756
/**
 * net.minecraft.class_2689
 */
typealias StateManager<O, S> = net.minecraft.class_2689<O, S>
/**
 * net.minecraft.class_4752
 */
typealias FurnaceRecipesFix = net.minecraft.class_4752
/**
 * net.minecraft.class_7255
 */
typealias RoarTask = net.minecraft.class_7255
/**
 * net.minecraft.class_8963
 */
typealias TrialSpawnerLogic = net.minecraft.class_8963
/**
 * net.minecraft.class_1801
 */
typealias KnowledgeBookItem = net.minecraft.class_1801
/**
 * net.minecraft.class_1315
 */
typealias EntityData = net.minecraft.class_1315
/**
 * net.minecraft.class_8856
 */
typealias SourcedCommandAction<T> = net.minecraft.class_8856<T>
/**
 * net.minecraft.class_4250
 */
typealias EndRaidTask = net.minecraft.class_4250
/**
 * net.minecraft.class_4698
 */
typealias StorageIoWorker = net.minecraft.class_4698
/**
 * net.minecraft.class_5478
 */
typealias OverworldBiomeCreator = net.minecraft.class_5478
/**
 * net.minecraft.class_6908
 */
typealias BiomeTags = net.minecraft.class_6908
/**
 * net.minecraft.class_4634
 */
typealias BlockPileFeatureConfig = net.minecraft.class_4634
/**
 * net.minecraft.class_3843
 */
typealias StructureValidatorProvider = net.minecraft.class_3843
/**
 * net.minecraft.class_8935
 */
typealias ReturnValueConsumer = net.minecraft.class_8935
/**
 * net.minecraft.class_3544
 */
typealias StringHelper = net.minecraft.class_3544
/**
 * net.minecraft.class_603
 */
typealias ShulkerBulletEntityModel<T> = net.minecraft.class_603<T>
/**
 * net.minecraft.class_2967
 */
typealias BoatDispenserBehavior = net.minecraft.class_2967
/**
 * net.minecraft.class_3057
 */
typealias FillCommand = net.minecraft.class_3057
/**
 * net.minecraft.class_9374
 */
typealias SetBookCoverLootFunction = net.minecraft.class_9374
/**
 * net.minecraft.class_5568
 */
typealias EntityLike = net.minecraft.class_5568
/**
 * net.minecraft.class_5626
 */
typealias StringNbtWriter = net.minecraft.class_5626
/**
 * com.mojang.brigadier.StringReader
 */
typealias StringReader = com.mojang.brigadier.StringReader
/**
 * net.minecraft.class_2632
 */
typealias DifficultyS2CPacket = net.minecraft.class_2632
/**
 * net.minecraft.class_3883
 */
typealias FeatureRendererContext<T, M> = net.minecraft.class_3883<T, M>
/**
 * net.minecraft.class_3823
 */
typealias RandomBlockStateMatchRuleTest = net.minecraft.class_3823
/**
 * net.minecraft.class_155
 */
typealias SharedConstants = net.minecraft.class_155
/**
 * net.minecraft.class_9136
 */
typealias PacketCodecDispatcher<B, V, T> = net.minecraft.class_9136<B, V, T>
/**
 * net.minecraft.class_58
 */
typealias LootTableReporter = net.minecraft.class_58
/**
 * net.minecraft.class_9410
 */
typealias IdentifiableParsingRule<C, V> = net.minecraft.class_9410<C, V>
/**
 * net.minecraft.class_2527
 */
typealias TorchBlock = net.minecraft.class_2527
/**
 * net.minecraft.class_3676
 */
typealias MonitorFactory = net.minecraft.class_3676
/**
 * net.minecraft.class_4961
 */
typealias ItemStackUuidFix = net.minecraft.class_4961
/**
 * net.minecraft.class_950
 */
typealias StrayEntityRenderer = net.minecraft.class_950
/**
 * net.minecraft.class_3154
 */
typealias EmeraldOreFeatureConfig = net.minecraft.class_3154
/**
 * net.minecraft.class_8235
 */
typealias RedstoneView = net.minecraft.class_8235
/**
 * net.minecraft.class_8957
 */
typealias RawShapedRecipe = net.minecraft.class_8957
/**
 * net.minecraft.class_4754
 */
typealias WallPropertyFix = net.minecraft.class_4754
/**
 * net.minecraft.class_729
 */
typealias SuspendParticle = net.minecraft.class_729
/**
 * net.minecraft.class_2473
 */
typealias SaplingBlock = net.minecraft.class_2473
/**
 * net.minecraft.class_3945
 */
typealias TeamMsgCommand = net.minecraft.class_3945
/**
 * net.minecraft.class_3825
 */
typealias RuleTest = net.minecraft.class_3825
/**
 * net.minecraft.class_8720
 */
typealias DebugNeighborsUpdateCustomPayload = net.minecraft.class_8720
/**
 * net.minecraft.class_3143
 */
typealias TeleportCommand = net.minecraft.class_3143
/**
 * net.minecraft.class_5687
 */
typealias ItemCommand = net.minecraft.class_5687
/**
 * net.minecraft.class_3553
 */
typealias ChoiceTypesFix = net.minecraft.class_3553
/**
 * net.minecraft.class_5601
 */
typealias EntityModelLayer = net.minecraft.class_5601
/**
 * net.minecraft.class_7521
 */
typealias DismountVehicleTask = net.minecraft.class_7521
/**
 * net.minecraft.class_1477
 */
typealias SquidEntity = net.minecraft.class_1477
/**
 * net.minecraft.class_1814
 */
typealias Rarity = net.minecraft.class_1814
/**
 * net.minecraft.class_6841
 */
typealias SelectiveNbtCollector = net.minecraft.class_6841
/**
 * net.minecraft.class_6329
 */
typealias RaidCommand = net.minecraft.class_6329
/**
 * net.minecraft.class_9754
 */
typealias RealmsPopups = net.minecraft.class_9754
/**
 * net.minecraft.class_5218
 */
typealias WorldSavePath = net.minecraft.class_5218
/**
 * net.minecraft.class_8248
 */
typealias RuleBlockEntityModifier = net.minecraft.class_8248
/**
 * net.minecraft.class_1869
 */
typealias ShapedRecipe = net.minecraft.class_1869
/**
 * net.minecraft.class_540
 */
typealias TeamTeleportSpectatorMenu = net.minecraft.class_540
/**
 * net.minecraft.class_9732
 */
typealias SetBlockPropertiesEnchantmentEffect = net.minecraft.class_9732
/**
 * net.minecraft.class_1341
 */
typealias AnimalMateGoal = net.minecraft.class_1341
/**
 * net.minecraft.class_7147
 */
typealias BasicTempleStructure = net.minecraft.class_7147
/**
 * net.minecraft.class_2366
 */
typealias GlazedTerracottaBlock = net.minecraft.class_2366
/**
 * net.minecraft.class_3862
 */
typealias SmokingRecipe = net.minecraft.class_3862
/**
 * net.minecraft.class_1069
 */
typealias GrassColormapResourceSupplier = net.minecraft.class_1069
/**
 * net.minecraft.class_6303
 */
typealias CustomTestProvider = net.minecraft.class_6303
/**
 * net.minecraft.class_9090
 */
typealias ServerCookieResponsePacketListener = net.minecraft.class_9090
/**
 * net.minecraft.class_736
 */
typealias CurrentDownParticle = net.minecraft.class_736
/**
 * net.minecraft.class_3747
 */
typealias ModifiableTestableWorld = net.minecraft.class_3747
/**
 * net.minecraft.class_6658
 */
typealias BlockFilterPlacementModifier = net.minecraft.class_6658
/**
 * net.minecraft.class_5778
 */
typealias MultifaceGrowthBlock = net.minecraft.class_5778
/**
 * net.minecraft.class_2980
 */
typealias DebugLoggerPrintStream = net.minecraft.class_2980
/**
 * net.minecraft.class_869
 */
typealias NeighborUpdateDebugRenderer = net.minecraft.class_869
/**
 * net.minecraft.class_125
 */
typealias EnchantedCountIncreaseLootFunction = net.minecraft.class_125
/**
 * net.minecraft.class_1671
 */
typealias FireworkRocketEntity = net.minecraft.class_1671
/**
 * com.mojang.brigadier.arguments.ArgumentType
 */
typealias ArgumentType<T> = com.mojang.brigadier.arguments.ArgumentType<T>
/**
 * net.minecraft.class_2970
 */
typealias BlockPlacementDispenserBehavior = net.minecraft.class_2970
/**
 * net.minecraft.class_3696
 */
typealias ProfileResult = net.minecraft.class_3696
/**
 * net.minecraft.class_4113
 */
typealias PanicTask = net.minecraft.class_4113
/**
 * net.minecraft.class_4608
 */
typealias OverlayTexture = net.minecraft.class_4608
/**
 * net.minecraft.class_4865
 */
typealias AbstractPlantStemBlock = net.minecraft.class_4865
/**
 * net.minecraft.class_3857
 */
typealias ThrownItemEntity = net.minecraft.class_3857
/**
 * net.minecraft.class_3340
 */
typealias WhitelistEntry = net.minecraft.class_3340
/**
 * net.minecraft.class_4275
 */
typealias Stainable = net.minecraft.class_4275
/**
 * net.minecraft.class_5925
 */
typealias HeightmapPlacementModifier = net.minecraft.class_5925
/**
 * net.minecraft.class_2778
 */
typealias StairShape = net.minecraft.class_2778
/**
 * net.minecraft.class_5574
 */
typealias EntityList = net.minecraft.class_5574
/**
 * net.minecraft.class_4125
 */
typealias StayAboveWaterTask = net.minecraft.class_4125
/**
 * net.minecraft.class_2922
 */
typealias ConfiguredCarver<WC> = net.minecraft.class_2922<WC>
/**
 * net.minecraft.class_8001
 */
typealias HoveredTooltipPositioner = net.minecraft.class_8001
/**
 * net.minecraft.class_1533
 */
typealias ItemFrameEntity = net.minecraft.class_1533
/**
 * net.minecraft.class_3969
 */
typealias GiantEntityModel = net.minecraft.class_3969
/**
 * net.minecraft.class_2135
 */
typealias TickCriterion = net.minecraft.class_2135
/**
 * net.minecraft.class_8734
 */
typealias DynamicRegistriesS2CPacket = net.minecraft.class_8734
/**
 * net.minecraft.class_9106
 */
typealias RenameEnchantmentFix = net.minecraft.class_9106
/**
 * net.minecraft.class_6326
 */
typealias DebugMobSpawningCommand = net.minecraft.class_6326
/**
 * net.minecraft.class_7677
 */
typealias ResourceMetadataSerializer<T> = net.minecraft.class_7677<T>
/**
 * net.minecraft.class_8109
 */
typealias DamageSources = net.minecraft.class_8109
/**
 * net.minecraft.class_524
 */
typealias EditWorldScreen = net.minecraft.class_524
/**
 * net.minecraft.class_4463
 */
typealias PlayerActionResponseS2CPacket = net.minecraft.class_4463
/**
 * net.minecraft.class_634
 */
typealias ClientPlayNetworkHandler = net.minecraft.class_634
/**
 * net.minecraft.class_7975
 */
typealias WorldSession = net.minecraft.class_7975
/**
 * net.minecraft.class_8237
 */
typealias PitcherCropBlock = net.minecraft.class_8237
/**
 * net.minecraft.class_9461
 */
typealias OminousItemSpawnerEntity = net.minecraft.class_9461
/**
 * net.minecraft.class_5625
 */
typealias NbtOrderedStringFormatter = net.minecraft.class_5625
/**
 * net.minecraft.class_7906
 */
typealias MemoryQueryResult<F, Value> = net.minecraft.class_7906<F, Value>
/**
 * net.minecraft.class_140
 */
typealias UncaughtExceptionLogger = net.minecraft.class_140
/**
 * net.minecraft.class_5929
 */
typealias RandomizedIntBlockStateProvider = net.minecraft.class_5929
/**
 * net.minecraft.class_8623
 */
typealias ArrayListDeque<T> = net.minecraft.class_8623<T>
/**
 * net.minecraft.class_2189
 */
typealias AirBlock = net.minecraft.class_2189
/**
 * net.minecraft.class_1632
 */
typealias VindicatorEntity = net.minecraft.class_1632
/**
 * net.minecraft.class_4571
 */
typealias TimeCheckLootCondition = net.minecraft.class_4571
/**
 * net.minecraft.class_2263
 */
typealias FluidDrainable = net.minecraft.class_2263
/**
 * net.minecraft.class_3674
 */
typealias Clipboard = net.minecraft.class_3674
/**
 * net.minecraft.class_2734
 */
typealias SetCameraEntityS2CPacket = net.minecraft.class_2734
/**
 * net.minecraft.class_2563
 */
typealias WitherRoseBlock = net.minecraft.class_2563
/**
 * net.minecraft.class_925
 */
typealias MinecartEntityRenderer<T> = net.minecraft.class_925<T>
/**
 * net.minecraft.class_9064
 */
typealias EntityAttachmentType = net.minecraft.class_9064
/**
 * net.minecraft.class_3789
 */
typealias BuriedTreasureGenerator = net.minecraft.class_3789
/**
 * net.minecraft.class_4110
 */
typealias LookAroundTask = net.minecraft.class_4110
/**
 * net.minecraft.class_6621
 */
typealias PostPlacementProcessor = net.minecraft.class_6621
/**
 * net.minecraft.class_5194
 */
typealias JigsawGeneratingC2SPacket = net.minecraft.class_5194
/**
 * net.minecraft.class_8812
 */
typealias ColoredFallingBlock = net.minecraft.class_8812
/**
 * net.minecraft.class_7389
 */
typealias AttachedToLeavesTreeDecorator = net.minecraft.class_7389
/**
 * java.util.function.Function
 */
typealias function_Function<T, R> = java.util.function.Function<T, R>
/**
 * net.minecraft.class_8626
 */
typealias RandomSequenceSettingsFix = net.minecraft.class_8626
/**
 * net.minecraft.class_986
 */
typealias IronGolemFlowerFeatureRenderer = net.minecraft.class_986
/**
 * net.minecraft.class_5282
 */
typealias PlayerGeneratesContainerLootCriterion = net.minecraft.class_5282
/**
 * net.minecraft.class_3913
 */
typealias PropertyDelegate = net.minecraft.class_3913
/**
 * net.minecraft.class_2779
 */
typealias AdvancementUpdateS2CPacket = net.minecraft.class_2779
/**
 * net.minecraft.class_4583
 */
typealias OverlayVertexConsumer = net.minecraft.class_4583
/**
 * net.minecraft.class_9680
 */
typealias PacketSizeLogHandler = net.minecraft.class_9680
/**
 * net.minecraft.class_5275
 */
typealias Dismounting = net.minecraft.class_5275
/**
 * net.minecraft.class_5815
 */
typealias DyedCarpetBlock = net.minecraft.class_5815
/**
 * net.minecraft.class_1087
 */
typealias BakedModel = net.minecraft.class_1087
/**
 * net.minecraft.class_6910
 */
typealias DensityFunction = net.minecraft.class_6910
/**
 * net.minecraft.class_1277
 */
typealias SimpleInventory = net.minecraft.class_1277
/**
 * net.minecraft.class_2413
 */
typealias MagmaBlock = net.minecraft.class_2413
/**
 * net.minecraft.class_2230
 */
typealias CoralParentBlock = net.minecraft.class_2230
/**
 * net.minecraft.class_4964
 */
typealias PersistentStateUuidFix = net.minecraft.class_4964
/**
 * net.minecraft.class_875
 */
typealias AbstractHorseEntityRenderer<T, M> = net.minecraft.class_875<T, M>
/**
 * net.minecraft.class_1543
 */
typealias IllagerEntity = net.minecraft.class_1543
/**
 * net.minecraft.class_2261
 */
typealias PlantBlock = net.minecraft.class_2261
/**
 * net.minecraft.class_5996
 */
typealias Debug = net.minecraft.class_5996
/**
 * net.minecraft.class_7455
 */
typealias IdentifierSearcher<T> = net.minecraft.class_7455<T>
/**
 * net.minecraft.class_9682
 */
typealias NoopOutboundHandler = net.minecraft.class_9682
/**
 * net.minecraft.class_1661
 */
typealias PlayerInventory = net.minecraft.class_1661
/**
 * net.minecraft.class_8966
 */
typealias TrialSpawnerData = net.minecraft.class_8966
/**
 * net.minecraft.class_8646
 */
typealias ScoreboardDisplaySlot = net.minecraft.class_8646
/**
 * net.minecraft.class_5627
 */
typealias NbtElementVisitor = net.minecraft.class_5627
/**
 * net.minecraft.class_2354
 */
typealias FenceBlock = net.minecraft.class_2354
/**
 * net.minecraft.class_1132
 */
typealias IntegratedServer = net.minecraft.class_1132
/**
 * net.minecraft.class_7396
 */
typealias SonicBoomTask = net.minecraft.class_7396
/**
 * net.minecraft.class_5634
 */
typealias PowderSnowBucketItem = net.minecraft.class_5634
/**
 * net.minecraft.class_1807
 */
typealias NameTagItem = net.minecraft.class_1807
/**
 * net.minecraft.class_9194
 */
typealias MultiValueDebugSampleLog = net.minecraft.class_9194
/**
 * net.minecraft.class_2348
 */
typealias SimpleDefaultedRegistry<T> = net.minecraft.class_2348<T>
/**
 * java.io.OutputStream
 */
typealias OutputStream = java.io.OutputStream
/**
 * net.minecraft.class_3697
 */
typealias GoToBedAndSleepGoal = net.minecraft.class_3697
/**
 * net.minecraft.class_789
 */
typealias json_ModelRotation = net.minecraft.class_789
/**
 * net.minecraft.class_1697
 */
typealias CommandBlockMinecartEntity = net.minecraft.class_1697
/**
 * net.minecraft.class_114
 */
typealias LimitCountLootFunction = net.minecraft.class_114
/**
 * net.minecraft.class_4003
 */
typealias SpriteBillboardParticle = net.minecraft.class_4003
/**
 * net.minecraft.class_6335
 */
typealias MarkerEntity = net.minecraft.class_6335
/**
 * net.minecraft.class_9094
 */
typealias PlayPackets = net.minecraft.class_9094
/**
 * net.minecraft.class_116
 */
typealias LootFunctionConsumingBuilder<T> = net.minecraft.class_116<T>
/**
 * net.minecraft.class_8791
 */
typealias SyncedClientOptions = net.minecraft.class_8791
/**
 * net.minecraft.class_4550
 */
typealias predicate_BlockPredicate = net.minecraft.class_4550
/**
 * net.minecraft.class_4836
 */
typealias PiglinEntity = net.minecraft.class_4836
/**
 * net.minecraft.class_9220
 */
typealias SelectKnownPacksC2SPacket = net.minecraft.class_9220
/**
 * net.minecraft.class_6916
 */
typealias DensityFunctionTypes = net.minecraft.class_6916
/**
 * net.minecraft.class_2716
 */
typealias EntitiesDestroyS2CPacket = net.minecraft.class_2716
/**
 * net.minecraft.class_4395
 */
typealias RealmsInviteScreen = net.minecraft.class_4395
/**
 * java.security.Key
 */
typealias Key = java.security.Key
/**
 * net.minecraft.class_1175
 */
typealias EntityZombieSplitFix = net.minecraft.class_1175
/**
 * net.minecraft.class_9343
 */
typealias LodestoneCompassComponentFix = net.minecraft.class_9343
/**
 * net.minecraft.class_4862
 */
typealias SmithingScreenHandler = net.minecraft.class_4862
/**
 * net.minecraft.class_2516
 */
typealias NbtShort = net.minecraft.class_2516
/**
 * net.minecraft.class_9778
 */
typealias DimensionPadding = net.minecraft.class_9778
/**
 * net.minecraft.class_2921
 */
typealias ClientQueryPacketListener = net.minecraft.class_2921
/**
 * net.minecraft.class_370
 */
typealias SystemToast = net.minecraft.class_370
/**
 * net.minecraft.class_1703
 */
typealias ScreenHandler = net.minecraft.class_1703
/**
 * net.minecraft.class_7637
 */
typealias LastSeenMessagesCollector = net.minecraft.class_7637
/**
 * net.minecraft.class_7201
 */
typealias TadpoleEntityModel<T> = net.minecraft.class_7201<T>
/**
 * net.minecraft.class_2289
 */
typealias ConduitBlock = net.minecraft.class_2289
/**
 * net.minecraft.class_3552
 */
typealias ChunkBlockLightProvider = net.minecraft.class_3552
/**
 * net.minecraft.class_1834
 */
typealias ToolMaterials = net.minecraft.class_1834
/**
 * net.minecraft.class_1928
 */
typealias GameRules = net.minecraft.class_1928
/**
 * net.minecraft.class_8581
 */
typealias SymlinkEntry = net.minecraft.class_8581
/**
 * net.minecraft.class_4228
 */
typealias OggAudioStream = net.minecraft.class_4228
/**
 * net.minecraft.class_120
 */
typealias ConditionalLootFunction = net.minecraft.class_120
/**
 * net.minecraft.class_927
 */
typealias MobEntityRenderer<T, M> = net.minecraft.class_927<T, M>
/**
 * net.minecraft.class_1724
 */
typealias HorseScreenHandler = net.minecraft.class_1724
/**
 * net.minecraft.class_542
 */
typealias RunArgs = net.minecraft.class_542
/**
 * net.minecraft.class_1127
 */
typealias TextSearchableIterator<T> = net.minecraft.class_1127<T>
/**
 * net.minecraft.class_6338
 */
typealias RamImpactTask = net.minecraft.class_6338
/**
 * net.minecraft.class_3021
 */
typealias EndCityStructure = net.minecraft.class_3021
/**
 * net.minecraft.class_1940
 */
typealias LevelInfo = net.minecraft.class_1940
/**
 * net.minecraft.class_1681
 */
typealias EggEntity = net.minecraft.class_1681
/**
 * net.minecraft.class_2907
 */
typealias LoginCompressionS2CPacket = net.minecraft.class_2907
/**
 * net.minecraft.class_5536
 */
typealias ClickType = net.minecraft.class_5536
/**
 * net.minecraft.class_1700
 */
typealias HopperMinecartEntity = net.minecraft.class_1700
/**
 * net.minecraft.class_543
 */
typealias WindowSettings = net.minecraft.class_543
/**
 * net.minecraft.class_2276
 */
typealias CarvedPumpkinBlock = net.minecraft.class_2276
/**
 * net.minecraft.class_472
 */
typealias BrewingStandScreen = net.minecraft.class_472
/**
 * net.minecraft.class_4656
 */
typealias SimpleBlockStateProvider = net.minecraft.class_4656
/**
 * net.minecraft.class_8773
 */
typealias UsernameAbuseReport = net.minecraft.class_8773
/**
 * net.minecraft.class_8112
 */
typealias DeathMessageType = net.minecraft.class_8112
/**
 * net.minecraft.class_956
 */
typealias TntEntityRenderer = net.minecraft.class_956
/**
 * net.minecraft.class_5607
 */
typealias TexturedModelData = net.minecraft.class_5607
/**
 * net.minecraft.class_7059
 */
typealias StructureSet = net.minecraft.class_7059
/**
 * net.minecraft.class_2565
 */
typealias WetSpongeBlock = net.minecraft.class_2565
/**
 * net.minecraft.class_1187
 */
typealias ItemStackEnchantmentFix = net.minecraft.class_1187
/**
 * net.minecraft.class_7077
 */
typealias PressableTextWidget = net.minecraft.class_7077
/**
 * net.minecraft.class_978
 */
typealias Deadmau5FeatureRenderer = net.minecraft.class_978
/**
 * net.minecraft.class_3136
 */
typealias StopSoundCommand = net.minecraft.class_3136
/**
 * net.minecraft.class_7196
 */
typealias IntegratedServerLoader = net.minecraft.class_7196
/**
 * net.minecraft.class_8518
 */
typealias Icons = net.minecraft.class_8518
/**
 * net.minecraft.class_4354
 */
typealias RealmsHttpException = net.minecraft.class_4354
/**
 * net.minecraft.class_6035
 */
typealias Control = net.minecraft.class_6035
/**
 * net.minecraft.class_8044
 */
typealias SpawnArmorTrimsCommand = net.minecraft.class_8044
/**
 * net.minecraft.class_4080
 */
typealias SinglePreparationResourceReloader<T> = net.minecraft.class_4080<T>
/**
 * net.minecraft.class_1932
 */
typealias ForcedChunkState = net.minecraft.class_1932
/**
 * net.minecraft.class_804
 */
typealias json_Transformation = net.minecraft.class_804
/**
 * net.minecraft.class_8712
 */
typealias DebugGameEventCustomPayload = net.minecraft.class_8712
/**
 * net.minecraft.class_1254
 */
typealias Schema99 = net.minecraft.class_1254
/**
 * net.minecraft.class_7264
 */
typealias ChestBoatEntity = net.minecraft.class_7264
/**
 * net.minecraft.class_5730
 */
typealias SmallDripstoneFeature = net.minecraft.class_5730
/**
 * net.minecraft.class_2278
 */
typealias CoordinateArgument = net.minecraft.class_2278
/**
 * net.minecraft.class_4781
 */
typealias HugeFungusFeature = net.minecraft.class_4781
/**
 * net.minecraft.class_274
 */
typealias ScoreboardCriterion = net.minecraft.class_274
/**
 * net.minecraft.class_698
 */
typealias NoteParticle = net.minecraft.class_698
/**
 * net.minecraft.class_4711
 */
typealias ItemCriterion = net.minecraft.class_4711
/**
 * net.minecraft.class_5946
 */
typealias ArrowPickupFix = net.minecraft.class_5946
/**
 * net.minecraft.class_1707
 */
typealias GenericContainerScreenHandler = net.minecraft.class_1707
/**
 * net.minecraft.class_4994
 */
typealias AlwaysTruePosRuleTest = net.minecraft.class_4994
/**
 * net.minecraft.class_1311
 */
typealias SpawnGroup = net.minecraft.class_1311
/**
 * net.minecraft.class_3008
 */
typealias AdvancementCommand = net.minecraft.class_3008
/**
 * net.minecraft.class_3868
 */
typealias DesertVillageData = net.minecraft.class_3868
/**
 * net.minecraft.class_2247
 */
typealias BlockStateArgument = net.minecraft.class_2247
/**
 * net.minecraft.class_9746
 */
typealias TradeRebalanceEnchantmentProviders = net.minecraft.class_9746
/**
 * net.minecraft.class_8669
 */
typealias SymlinkWarningScreen = net.minecraft.class_8669
/**
 * net.minecraft.class_6496
 */
typealias TopologicalSorts = net.minecraft.class_6496
/**
 * net.minecraft.class_5683
 */
typealias OrderedTextTooltipComponent = net.minecraft.class_5683
/**
 * net.minecraft.class_2299
 */
typealias CoralWallFanBlock = net.minecraft.class_2299
/**
 * net.minecraft.class_133
 */
typealias CrashCallable<V> = net.minecraft.class_133<V>
/**
 * net.minecraft.class_2838
 */
typealias PickFromInventoryC2SPacket = net.minecraft.class_2838
/**
 * net.minecraft.class_1463
 */
typealias RabbitEntity = net.minecraft.class_1463
/**
 * net.minecraft.class_1269
 */
typealias ActionResult = net.minecraft.class_1269
/**
 * net.minecraft.class_5541
 */
typealias AmethystBlock = net.minecraft.class_5541
/**
 * net.minecraft.class_2321
 */
typealias SuggestionProviders = net.minecraft.class_2321
/**
 * net.minecraft.class_621
 */
typealias WitherEntityModel<T> = net.minecraft.class_621<T>
/**
 * net.minecraft.class_8206
 */
typealias RealmsText = net.minecraft.class_8206
/**
 * net.minecraft.class_2337
 */
typealias RodBlock = net.minecraft.class_2337
/**
 * net.minecraft.class_8602
 */
typealias RandomCommand = net.minecraft.class_8602
/**
 * net.minecraft.class_3499
 */
typealias StructureTemplate = net.minecraft.class_3499
/**
 * net.minecraft.class_3791
 */
typealias PillagerOutpostGenerator = net.minecraft.class_3791
/**
 * net.minecraft.class_2812
 */
typealias EmptyChunk = net.minecraft.class_2812
/**
 * net.minecraft.class_3686
 */
typealias Schema1904 = net.minecraft.class_3686
/**
 * net.minecraft.class_3687
 */
typealias Schema1906 = net.minecraft.class_3687
/**
 * net.minecraft.class_5177
 */
typealias BastionHoglinStableData = net.minecraft.class_5177
/**
 * net.minecraft.class_5745
 */
typealias VibrationParticleEffect = net.minecraft.class_5745
/**
 * net.minecraft.class_9259
 */
typealias OptionalChunk<T> = net.minecraft.class_9259<T>
/**
 * com.mojang.brigadier.arguments.IntegerArgumentType
 */
typealias IntegerArgumentType = com.mojang.brigadier.arguments.IntegerArgumentType
/**
 * net.minecraft.class_1856
 */
typealias Ingredient = net.minecraft.class_1856
/**
 * net.minecraft.class_3743
 */
typealias Schema1909 = net.minecraft.class_3743
/**
 * net.minecraft.class_7378
 */
typealias EntitySubPredicateTypes = net.minecraft.class_7378
/**
 * net.minecraft.class_1528
 */
typealias WitherEntity = net.minecraft.class_1528
/**
 * net.minecraft.class_7640
 */
typealias MessageAcknowledgmentC2SPacket = net.minecraft.class_7640
/**
 * net.minecraft.class_602
 */
typealias ShulkerEntityModel<T> = net.minecraft.class_602<T>
/**
 * net.minecraft.class_301
 */
typealias Untracker = net.minecraft.class_301
/**
 * net.minecraft.class_7696
 */
typealias FeatureFlag = net.minecraft.class_7696
/**
 * net.minecraft.class_4505
 */
typealias BeeEntityRenderer = net.minecraft.class_4505
/**
 * net.minecraft.class_2588
 */
typealias TranslatableTextContent = net.minecraft.class_2588
/**
 * net.minecraft.class_7400
 */
typealias PredicatedStateProvider = net.minecraft.class_7400
/**
 * net.minecraft.class_4696
 */
typealias RenderLayers = net.minecraft.class_4696
/**
 * net.minecraft.class_778
 */
typealias BlockModelRenderer = net.minecraft.class_778
/**
 * net.minecraft.class_2541
 */
typealias VineBlock = net.minecraft.class_2541
/**
 * net.minecraft.class_940
 */
typealias ShulkerBulletEntityRenderer = net.minecraft.class_940
/**
 * net.minecraft.class_5699
 */
typealias Codecs = net.minecraft.class_5699
/**
 * net.minecraft.class_3905
 */
typealias Schema1920 = net.minecraft.class_3905
/**
 * net.minecraft.class_7140
 */
typealias SculkPatchFeature = net.minecraft.class_7140
/**
 * net.minecraft.class_2700
 */
typealias BlockPattern = net.minecraft.class_2700
/**
 * net.minecraft.class_3984
 */
typealias Schema1928 = net.minecraft.class_3984
/**
 * net.minecraft.class_4638
 */
typealias RandomPatchFeatureConfig = net.minecraft.class_4638
/**
 * net.minecraft.class_976
 */
typealias HeadFeatureRenderer<T, M> = net.minecraft.class_976<T, M>
/**
 * net.minecraft.class_3985
 */
typealias Schema1929 = net.minecraft.class_3985
/**
 * net.minecraft.class_9254
 */
typealias BoggedEntity = net.minecraft.class_9254
/**
 * net.minecraft.class_2666
 */
typealias UnloadChunkS2CPacket = net.minecraft.class_2666
/**
 * net.minecraft.class_5689
 */
typealias PointedDripstoneBlock = net.minecraft.class_5689
/**
 * net.minecraft.class_4878
 */
typealias RealmsServerAddress = net.minecraft.class_4878
/**
 * net.minecraft.class_879
 */
typealias BatEntityRenderer = net.minecraft.class_879
/**
 * net.minecraft.class_4016
 */
typealias Schema1931 = net.minecraft.class_4016
/**
 * net.minecraft.class_922
 */
typealias LivingEntityRenderer<T, M> = net.minecraft.class_922<T, M>
/**
 * net.minecraft.class_5153
 */
typealias BasaltColumnsFeature = net.minecraft.class_5153
/**
 * net.minecraft.class_989
 */
typealias HeldItemFeatureRenderer<T, M> = net.minecraft.class_989<T, M>
/**
 * net.minecraft.class_4877
 */
typealias RealmsServer = net.minecraft.class_4877
/**
 * net.minecraft.class_9660
 */
typealias TrimPredicate = net.minecraft.class_9660
/**
 * net.minecraft.class_1778
 */
typealias FireChargeItem = net.minecraft.class_1778
/**
 * net.minecraft.class_574
 */
typealias IronGolemEntityModel<T> = net.minecraft.class_574<T>
/**
 * net.minecraft.class_152
 */
typealias SetStewEffectLootFunction = net.minecraft.class_152
/**
 * net.minecraft.class_1349
 */
typealias FollowGroupLeaderGoal = net.minecraft.class_1349
/**
 * net.minecraft.class_4720
 */
typealias VertexConsumers = net.minecraft.class_4720
/**
 * net.minecraft.class_4142
 */
typealias WalkTarget = net.minecraft.class_4142
/**
 * net.minecraft.class_1179
 */
typealias ItemBannerColorFix = net.minecraft.class_1179
/**
 * net.minecraft.class_931
 */
typealias PandaEntityRenderer = net.minecraft.class_931
/**
 * net.minecraft.class_7922
 */
typealias DefaultedRegistry<T> = net.minecraft.class_7922<T>
/**
 * net.minecraft.class_888
 */
typealias DolphinEntityRenderer = net.minecraft.class_888
/**
 * net.minecraft.class_3389
 */
typealias RconClient = net.minecraft.class_3389
/**
 * net.minecraft.class_4122
 */
typealias VillagerWalkTowardsTask = net.minecraft.class_4122
/**
 * net.minecraft.class_5317
 */
typealias WorldPresets = net.minecraft.class_5317
/**
 * net.minecraft.class_7437
 */
typealias TextifiedException = net.minecraft.class_7437
/**
 * com.mojang.datafixers.types.Type
 */
typealias types_Type<A> = com.mojang.datafixers.types.Type<A>
/**
 * net.minecraft.class_2942
 */
typealias BambooFeature = net.minecraft.class_2942
/**
 * net.minecraft.class_1664
 */
typealias PlayerModelPart = net.minecraft.class_1664
/**
 * net.minecraft.class_2156
 */
typealias TranslatableBuiltInExceptions = net.minecraft.class_2156
/**
 * net.minecraft.class_8255
 */
typealias VanillaArchaeologyLootTableGenerator = net.minecraft.class_8255
/**
 * net.minecraft.class_4406
 */
typealias RealmsPlayerScreen = net.minecraft.class_4406
/**
 * net.minecraft.class_2551
 */
typealias WallSignBlock = net.minecraft.class_2551
/**
 * net.minecraft.class_1115
 */
typealias SoundEntryDeserializer = net.minecraft.class_1115
/**
 * net.minecraft.class_3321
 */
typealias ServerConfigHandler = net.minecraft.class_3321
/**
 * net.minecraft.class_2329
 */
typealias EndGatewayBlock = net.minecraft.class_2329
/**
 * net.minecraft.class_8998
 */
typealias TrialChamberData = net.minecraft.class_8998
/**
 * net.minecraft.class_5760
 */
typealias TemptationsSensor = net.minecraft.class_5760
/**
 * net.minecraft.class_9145
 */
typealias PacketType<T> = net.minecraft.class_9145<T>
/**
 * net.minecraft.class_9815
 */
typealias ServerLinksS2CPacket = net.minecraft.class_9815
/**
 * net.minecraft.class_83
 */
typealias LootTableEntry = net.minecraft.class_83
/**
 * net.minecraft.class_657
 */
typealias DamageParticle = net.minecraft.class_657
/**
 * net.minecraft.class_7849
 */
typealias AxisGridWidget = net.minecraft.class_7849
/**
 * net.minecraft.class_8508
 */
typealias RecipeCraftedCriterion = net.minecraft.class_8508
/**
 * net.minecraft.class_3155
 */
typealias WeatherCommand = net.minecraft.class_3155
/**
 * net.minecraft.class_3124
 */
typealias OreFeatureConfig = net.minecraft.class_3124
/**
 * net.minecraft.class_8219
 */
typealias CreditsAndAttributionScreen = net.minecraft.class_8219
/**
 * net.minecraft.class_2553
 */
typealias LilyPadBlock = net.minecraft.class_2553
/**
 * net.minecraft.class_3150
 */
typealias RandomFeature = net.minecraft.class_3150
/**
 * net.minecraft.class_7877
 */
typealias RegistryBuilder = net.minecraft.class_7877
/**
 * net.minecraft.class_1200
 */
typealias ObjectiveDisplayNameFix = net.minecraft.class_1200
/**
 * net.minecraft.class_2740
 */
typealias EntityAttachS2CPacket = net.minecraft.class_2740
/**
 * net.minecraft.class_1919
 */
typealias BlockEvent = net.minecraft.class_1919
/**
 * net.minecraft.class_816
 */
typealias MultipartUnbakedModel = net.minecraft.class_816
/**
 * net.minecraft.class_9285
 */
typealias AttributeModifiersComponent = net.minecraft.class_9285
/**
 * net.minecraft.class_8561
 */
typealias GameLoadTimeEvent = net.minecraft.class_8561
/**
 * net.minecraft.class_8941
 */
typealias DelegatingDataOutput = net.minecraft.class_8941
/**
 * net.minecraft.class_9338
 */
typealias ItemListProvider = net.minecraft.class_9338
/**
 * net.minecraft.class_2418
 */
typealias MyceliumBlock = net.minecraft.class_2418
/**
 * net.minecraft.class_4517
 */
typealias GameTestState = net.minecraft.class_4517
/**
 * net.minecraft.class_4758
 */
typealias TickDurationMonitor = net.minecraft.class_4758
/**
 * net.minecraft.class_565
 */
typealias EndermiteEntityModel<T> = net.minecraft.class_565<T>
/**
 * net.minecraft.class_1725
 */
typealias MerchantInventory = net.minecraft.class_1725
/**
 * net.minecraft.class_4760
 */
typealias HoglinEntity = net.minecraft.class_4760
/**
 * net.minecraft.client.main.Main
 */
typealias main_Main = net.minecraft.client.main.Main
/**
 * net.minecraft.class_5704
 */
typealias SculkSensorBlockEntity = net.minecraft.class_5704
/**
 * net.minecraft.class_2465
 */
typealias PillarBlock = net.minecraft.class_2465
/**
 * net.minecraft.class_1873
 */
typealias SuspiciousStewRecipe = net.minecraft.class_1873
/**
 * net.minecraft.class_8705
 */
typealias ClientCommonPacketListener = net.minecraft.class_8705
/**
 * net.minecraft.class_9829
 */
typealias EndPlatformFeature = net.minecraft.class_9829
/**
 * net.minecraft.class_937
 */
typealias PolarBearEntityRenderer = net.minecraft.class_937
/**
 * java.util.function.BiFunction
 */
typealias BiFunction<T, U, R> = java.util.function.BiFunction<T, U, R>
/**
 * net.minecraft.class_4849
 */
typealias NyliumBlock = net.minecraft.class_4849
/**
 * net.minecraft.class_2215
 */
typealias BannerBlock = net.minecraft.class_2215
/**
 * net.minecraft.class_1007
 */
typealias PlayerEntityRenderer = net.minecraft.class_1007
/**
 * net.minecraft.class_4963
 */
typealias PlayerUuidFix = net.minecraft.class_4963
/**
 * net.minecraft.class_4443
 */
typealias SwitchSlotTask = net.minecraft.class_4443
/**
 * net.minecraft.class_2159
 */
typealias LazyContainer = net.minecraft.class_2159
/**
 * net.minecraft.class_3714
 */
typealias VanillaGiftLootTableGenerator = net.minecraft.class_3714
/**
 * net.minecraft.class_4990
 */
typealias DirectionTransformation = net.minecraft.class_4990
/**
 * net.minecraft.class_1255
 */
typealias ThreadExecutor<R> = net.minecraft.class_1255<R>
/**
 * net.minecraft.class_2369
 */
typealias DirtPathBlock = net.minecraft.class_2369
/**
 * net.minecraft.class_2273
 */
typealias SwizzleArgumentType = net.minecraft.class_2273
/**
 * net.minecraft.class_7895
 */
typealias LookAtMobWithIntervalTask = net.minecraft.class_7895
/**
 * net.minecraft.class_3133
 */
typealias ProbabilityConfig = net.minecraft.class_3133
/**
 * net.minecraft.class_822
 */
typealias BeaconBlockEntityRenderer = net.minecraft.class_822
/**
 * net.minecraft.class_4394
 */
typealias RealmsGenericErrorScreen = net.minecraft.class_4394
/**
 * net.minecraft.class_1753
 */
typealias BowItem = net.minecraft.class_1753
/**
 * net.minecraft.class_5272
 */
typealias ModelPredicateProviderRegistry = net.minecraft.class_5272
/**
 * net.minecraft.class_6885
 */
typealias RegistryEntryList<T> = net.minecraft.class_6885<T>
/**
 * net.minecraft.class_773
 */
typealias BlockModels = net.minecraft.class_773
/**
 * net.minecraft.class_5904
 */
typealias TitleS2CPacket = net.minecraft.class_5904
/**
 * net.minecraft.class_2472
 */
typealias SeaPickleBlock = net.minecraft.class_2472
/**
 * net.minecraft.class_1142
 */
typealias MusicTracker = net.minecraft.class_1142
/**
 * net.minecraft.class_4004
 */
typealias VillagerHeldItemFeatureRenderer<T, M> = net.minecraft.class_4004<T, M>
/**
 * net.minecraft.class_8074
 */
typealias SmithingTransformRecipeJsonBuilder = net.minecraft.class_8074
/**
 * net.minecraft.class_581
 */
typealias LlamaSpitEntityModel<T> = net.minecraft.class_581<T>
/**
 * net.minecraft.class_4427
 */
typealias RealmsUploadScreen = net.minecraft.class_4427
/**
 * net.minecraft.class_1006
 */
typealias WolfCollarFeatureRenderer = net.minecraft.class_1006
/**
 * net.minecraft.class_3567
 */
typealias BlockEntityCustomNameToTextFix = net.minecraft.class_3567
/**
 * net.minecraft.class_6755
 */
typealias ChunkTickScheduler<T> = net.minecraft.class_6755<T>
/**
 * net.minecraft.class_5165
 */
typealias WhiteAshParticle = net.minecraft.class_5165
/**
 * net.minecraft.class_7299
 */
typealias AllayBrain = net.minecraft.class_7299
/**
 * net.minecraft.class_3509
 */
typealias TypeFilterableList<T> = net.minecraft.class_3509<T>
/**
 * net.minecraft.class_1182
 */
typealias ItemNameFix = net.minecraft.class_1182
/**
 * net.minecraft.class_595
 */
typealias MediumPufferfishEntityModel<T> = net.minecraft.class_595<T>
/**
 * net.minecraft.class_408
 */
typealias ChatScreen = net.minecraft.class_408
/**
 * net.minecraft.class_2178
 */
typealias TextArgumentType = net.minecraft.class_2178
/**
 * net.minecraft.class_8947
 */
typealias BreezeAttackablesSensor = net.minecraft.class_8947
/**
 * net.minecraft.class_9789
 */
typealias GameModeList = net.minecraft.class_9789
/**
 * com.mojang.brigadier.context.CommandContext
 */
typealias CommandContext<S> = com.mojang.brigadier.context.CommandContext<S>
/**
 * net.minecraft.class_8494
 */
typealias KeyCodes = net.minecraft.class_8494
/**
 * net.minecraft.class_4766
 */
typealias MultiNoiseBiomeSource = net.minecraft.class_4766
/**
 * net.minecraft.class_5459
 */
typealias BlockLocating = net.minecraft.class_5459
/**
 * net.minecraft.class_4333
 */
typealias FileDownload = net.minecraft.class_4333
/**
 * net.minecraft.class_881
 */
typealias BoatEntityRenderer = net.minecraft.class_881
/**
 * net.minecraft.class_8037
 */
typealias BundleSplitterPacket<T> = net.minecraft.class_8037<T>
/**
 * net.minecraft.class_4221
 */
typealias SecondaryPointsOfInterestSensor = net.minecraft.class_4221
/**
 * net.minecraft.class_7498
 */
typealias SignatureUpdatable = net.minecraft.class_7498
/**
 * net.minecraft.class_4784
 */
typealias WeepingVinesFeature = net.minecraft.class_4784
/**
 * net.minecraft.class_5522
 */
typealias SocialInteractionsScreen = net.minecraft.class_5522
/**
 * net.minecraft.class_4955
 */
typealias AbstractSlowingParticle = net.minecraft.class_4955
/**
 * net.minecraft.class_1527
 */
typealias PhaseType<T> = net.minecraft.class_1527<T>
/**
 * net.minecraft.class_6811
 */
typealias OceanPlacedFeatures = net.minecraft.class_6811
/**
 * net.minecraft.class_916
 */
typealias ItemEntityRenderer = net.minecraft.class_916
/**
 * net.minecraft.class_4295
 */
typealias LoseJobOnSiteLossTask = net.minecraft.class_4295
/**
 * net.minecraft.class_2212
 */
typealias NbtElementArgumentType = net.minecraft.class_2212
/**
 * net.minecraft.class_4926
 */
typealias BlockStateVariantMap = net.minecraft.class_4926
/**
 * net.minecraft.class_4458
 */
typealias GoToPointOfInterestTask = net.minecraft.class_4458
/**
 * net.minecraft.class_8573
 */
typealias WorldIcon = net.minecraft.class_8573
/**
 * net.minecraft.class_2696
 */
typealias PlayerAbilitiesS2CPacket = net.minecraft.class_2696
/**
 * net.minecraft.class_5963
 */
typealias DummyRecorder = net.minecraft.class_5963
/**
 * net.minecraft.class_2583
 */
typealias Style = net.minecraft.class_2583
/**
 * net.minecraft.class_1755
 */
typealias BucketItem = net.minecraft.class_1755
/**
 * net.minecraft.class_2579
 */
typealias SelectorTextContent = net.minecraft.class_2579
/**
 * net.minecraft.class_4352
 */
typealias ValueObject = net.minecraft.class_4352
/**
 * net.minecraft.class_492
 */
typealias MerchantScreen = net.minecraft.class_492
/**
 * net.minecraft.class_8234
 */
typealias SignChangingItem = net.minecraft.class_8234
/**
 * net.minecraft.class_2879
 */
typealias HandSwingC2SPacket = net.minecraft.class_2879
/**
 * net.minecraft.class_2692
 */
typealias VehicleMoveS2CPacket = net.minecraft.class_2692
/**
 * org.joml.Quaternionf
 */
typealias Quaternionf = org.joml.Quaternionf
/**
 * net.minecraft.class_6819
 */
typealias VegetationPlacedFeatures = net.minecraft.class_6819
/**
 * net.minecraft.class_622
 */
typealias WitchEntityModel<T> = net.minecraft.class_622<T>
/**
 * net.minecraft.class_689
 */
typealias ExplosionEmitterParticle = net.minecraft.class_689
/**
 * net.minecraft.class_1761
 */
typealias ItemGroup = net.minecraft.class_1761
/**
 * net.minecraft.class_871
 */
typealias BlockOutlineDebugRenderer = net.minecraft.class_871
/**
 * net.minecraft.class_186
 */
typealias AlternativeLootCondition = net.minecraft.class_186
/**
 * net.minecraft.class_5533
 */
typealias AboveGroundTargeting = net.minecraft.class_5533
/**
 * net.minecraft.class_3294
 */
typealias NamespaceResourceManager = net.minecraft.class_3294
/**
 * net.minecraft.class_1819
 */
typealias ShieldItem = net.minecraft.class_1819
/**
 * net.minecraft.class_7893
 */
typealias Task<E> = net.minecraft.class_7893<E>
/**
 * net.minecraft.class_5222
 */
typealias TextCollector = net.minecraft.class_5222
/**
 * net.minecraft.class_604
 */
typealias SilverfishEntityModel<T> = net.minecraft.class_604<T>
/**
 * net.minecraft.class_337
 */
typealias BossBarHud = net.minecraft.class_337
/**
 * net.minecraft.class_5560
 */
typealias ChestLidAnimator = net.minecraft.class_5560
/**
 * net.minecraft.class_941
 */
typealias SheepEntityRenderer = net.minecraft.class_941
/**
 * net.minecraft.class_9301
 */
typealias WritableBookContentComponent = net.minecraft.class_9301
/**
 * net.minecraft.class_2560
 */
typealias CobwebBlock = net.minecraft.class_2560
/**
 * net.minecraft.class_6686
 */
typealias MaterialRules = net.minecraft.class_6686
/**
 * net.minecraft.class_5322
 */
typealias SpawnLocating = net.minecraft.class_5322
/**
 * net.minecraft.class_1117
 */
typealias TickableSoundInstance = net.minecraft.class_1117
/**
 * net.minecraft.class_55
 */
typealias LootPool = net.minecraft.class_55
/**
 * net.minecraft.class_1338
 */
typealias FleeEntityGoal<T> = net.minecraft.class_1338<T>
/**
 * net.minecraft.class_9168
 */
typealias SpawnLocation = net.minecraft.class_9168
/**
 * net.minecraft.class_549
 */
typealias HorseEntityModel<T> = net.minecraft.class_549<T>
/**
 * net.minecraft.class_1451
 */
typealias CatEntity = net.minecraft.class_1451
/**
 * net.minecraft.class_3983
 */
typealias EntityRavagerRenameFix = net.minecraft.class_3983
/**
 * net.minecraft.class_9013
 */
typealias ReadableScoreboardScore = net.minecraft.class_9013
/**
 * net.minecraft.class_4141
 */
typealias MemoryModuleState = net.minecraft.class_4141
/**
 * net.minecraft.class_9793
 */
typealias JukeboxSong = net.minecraft.class_9793
/**
 * net.minecraft.class_4659
 */
typealias BeehiveTreeDecorator = net.minecraft.class_4659
/**
 * net.minecraft.class_7754
 */
typealias RaftEntityModel = net.minecraft.class_7754
/**
 * net.minecraft.class_4978
 */
typealias JigsawRotationFix = net.minecraft.class_4978
/**
 * net.minecraft.class_9264
 */
typealias BannerPatternFormatFix = net.minecraft.class_9264
/**
 * net.minecraft.class_6
 */
typealias BirdPathNodeMaker = net.minecraft.class_6
/**
 * net.minecraft.class_9209
 */
typealias MapIdComponent = net.minecraft.class_9209
/**
 * java.io.File
 */
typealias File = java.io.File
/**
 * net.minecraft.class_586
 */
typealias PandaEntityModel<T> = net.minecraft.class_586<T>
/**
 * net.minecraft.class_7534
 */
typealias TaskScreen = net.minecraft.class_7534
/**
 * net.minecraft.class_5630
 */
typealias StackReference = net.minecraft.class_5630
/**
 * net.minecraft.class_3760
 */
typealias DisableableFollowTargetGoal<T> = net.minecraft.class_3760<T>
/**
 * net.minecraft.class_1247
 */
typealias Schema501 = net.minecraft.class_1247
/**
 * net.minecraft.class_4875
 */
typealias RealmsDescriptionDto = net.minecraft.class_4875
/**
 * net.minecraft.class_5189
 */
typealias RuinedPortalStructurePiece = net.minecraft.class_5189
/**
 * net.minecraft.class_7761
 */
typealias HangingSignBlockEntityRenderer = net.minecraft.class_7761
/**
 * net.minecraft.class_5147
 */
typealias Shearable = net.minecraft.class_5147
/**
 * net.minecraft.class_1283
 */
typealias DamageTracker = net.minecraft.class_1283
/**
 * net.minecraft.class_6850
 */
typealias ChunkRendererRegionBuilder = net.minecraft.class_6850
/**
 * net.minecraft.class_505
 */
typealias RecipeBookGhostSlots = net.minecraft.class_505
/**
 * net.minecraft.class_1066
 */
typealias ServerResourcePackLoader = net.minecraft.class_1066
/**
 * net.minecraft.class_1512
 */
typealias AbstractPhase = net.minecraft.class_1512
/**
 * net.minecraft.class_1273
 */
typealias ContainerLock = net.minecraft.class_1273
/**
 * net.minecraft.class_17
 */
typealias MapBannerMarker = net.minecraft.class_17
/**
 * net.minecraft.class_5567
 */
typealias ChunkStatusChangeListener = net.minecraft.class_5567
/**
 * net.minecraft.class_3815
 */
typealias PlainsVillageData = net.minecraft.class_3815
/**
 * net.minecraft.class_2343
 */
typealias BlockEntityProvider = net.minecraft.class_2343
/**
 * net.minecraft.class_2359
 */
typealias IndexedIterable<T> = net.minecraft.class_2359<T>
/**
 * net.minecraft.class_1259
 */
typealias BossBar = net.minecraft.class_1259
/**
 * net.minecraft.class_9704
 */
typealias EnchantmentLevelBasedValue = net.minecraft.class_9704
/**
 * net.minecraft.class_2131
 */
typealias TameAnimalCriterion = net.minecraft.class_2131
/**
 * net.minecraft.class_7253
 */
typealias Angriness = net.minecraft.class_7253
/**
 * net.minecraft.class_249
 */
typealias SimpleVoxelShape = net.minecraft.class_249
/**
 * net.minecraft.class_5774
 */
typealias AxolotlEntityRenderer = net.minecraft.class_5774
/**
 * net.minecraft.class_314
 */
typealias RecipeBookGroup = net.minecraft.class_314
/**
 * net.minecraft.class_5814
 */
typealias OxidizableStairsBlock = net.minecraft.class_5814
/**
 * com.mojang.brigadier.arguments.DoubleArgumentType
 */
typealias DoubleArgumentType = com.mojang.brigadier.arguments.DoubleArgumentType
/**
 * net.minecraft.class_5808
 */
typealias SmallDripleafBlock = net.minecraft.class_5808
/**
 * java.time.Instant
 */
typealias Instant = java.time.Instant
/**
 * net.minecraft.class_7471
 */
typealias SignedMessage = net.minecraft.class_7471
/**
 * net.minecraft.class_583
 */
typealias EntityModel<T> = net.minecraft.class_583<T>
/**
 * net.minecraft.class_4700
 */
typealias BiomeColorCache = net.minecraft.class_4700
/**
 * net.minecraft.class_1767
 */
typealias DyeColor = net.minecraft.class_1767
/**
 * net.minecraft.class_40
 */
typealias BinomialLootNumberProvider = net.minecraft.class_40
/**
 * net.minecraft.class_8873
 */
typealias MacroInvocation = net.minecraft.class_8873
/**
 * net.minecraft.class_1720
 */
typealias AbstractFurnaceScreenHandler = net.minecraft.class_1720
/**
 * net.minecraft.class_6024
 */
typealias EntityStatuses = net.minecraft.class_6024
/**
 * net.minecraft.class_1314
 */
typealias PathAwareEntity = net.minecraft.class_1314
/**
 * net.minecraft.class_7509
 */
typealias BiomeSources = net.minecraft.class_7509
/**
 * net.minecraft.class_1548
 */
typealias CreeperEntity = net.minecraft.class_1548
/**
 * net.minecraft.class_3803
 */
typealias GrindstoneScreenHandler = net.minecraft.class_3803
/**
 * net.minecraft.class_8786
 */
typealias RecipeEntry<T> = net.minecraft.class_8786<T>
/**
 * net.minecraft.class_7079
 */
typealias RegistryKeyArgumentType<T> = net.minecraft.class_7079<T>
/**
 * net.minecraft.class_94
 */
typealias ApplyBonusLootFunction = net.minecraft.class_94
/**
 * net.minecraft.class_7491
 */
typealias VanillaPointOfInterestTypeTagProvider = net.minecraft.class_7491
/**
 * net.minecraft.class_5786
 */
typealias GlowParticle = net.minecraft.class_5786
/**
 * net.minecraft.class_5606
 */
typealias ModelPartBuilder = net.minecraft.class_5606
/**
 * net.minecraft.class_2449
 */
typealias RedstoneOreBlock = net.minecraft.class_2449
/**
 * net.minecraft.class_265
 */
typealias VoxelShape = net.minecraft.class_265
/**
 * net.minecraft.class_9356
 */
typealias EnchantmentsPredicate = net.minecraft.class_9356
/**
 * com.mojang.brigadier.CommandDispatcher
 */
typealias CommandDispatcher<S> = com.mojang.brigadier.CommandDispatcher<S>
/**
 * com.mojang.datafixers.DSL.TypeReference
 */
typealias TypeReference = com.mojang.datafixers.DSL.TypeReference
/**
 * net.minecraft.class_5142
 */
typealias TrunkPlacerType<P> = net.minecraft.class_5142<P>
/**
 * net.minecraft.class_2924
 */
typealias QueryResponseS2CPacket = net.minecraft.class_2924
/**
 * net.minecraft.class_4780
 */
typealias HugeFungusFeatureConfig = net.minecraft.class_4780
/**
 * net.minecraft.class_2765
 */
typealias PlaySoundFromEntityS2CPacket = net.minecraft.class_2765
/**
 * net.minecraft.class_8914
 */
typealias TickStepS2CPacket = net.minecraft.class_8914
/**
 * net.minecraft.class_9278
 */
typealias ChargedProjectilesComponent = net.minecraft.class_9278
/**
 * net.minecraft.class_1798
 */
typealias AliasedBlockItem = net.minecraft.class_1798
/**
 * net.minecraft.class_6724
 */
typealias SurfaceBuilder = net.minecraft.class_6724
/**
 * net.minecraft.class_733
 */
typealias EmitterParticle = net.minecraft.class_733
/**
 * net.minecraft.class_8
 */
typealias PathNodeMaker = net.minecraft.class_8
/**
 * net.minecraft.class_9231
 */
typealias MapBannerBlockPosFormatFix = net.minecraft.class_9231
/**
 * net.minecraft.class_101
 */
typealias CopyNameLootFunction = net.minecraft.class_101
/**
 * net.minecraft.class_1296
 */
typealias PassiveEntity = net.minecraft.class_1296
/**
 * net.minecraft.class_702
 */
typealias ParticleManager = net.minecraft.class_702
/**
 * net.minecraft.class_8579
 */
typealias SymlinkValidationException = net.minecraft.class_8579
/**
 * javax.crypto.Cipher
 */
typealias Cipher = javax.crypto.Cipher
/**
 * net.minecraft.class_3836
 */
typealias SnowyVillageData = net.minecraft.class_3836
/**
 * net.minecraft.class_319
 */
typealias VideoMode = net.minecraft.class_319
/**
 * net.minecraft.class_5140
 */
typealias StraightTrunkPlacer = net.minecraft.class_5140
/**
 * net.minecraft.class_148
 */
typealias CrashException = net.minecraft.class_148
/**
 * net.minecraft.class_9351
 */
typealias SlotRangeArgumentType = net.minecraft.class_9351
/**
 * net.minecraft.class_6413
 */
typealias PerfCommand = net.minecraft.class_6413
/**
 * net.minecraft.class_7629
 */
typealias ChatLogEntry = net.minecraft.class_7629
/**
 * net.minecraft.class_2183
 */
typealias EntityAnchorArgumentType = net.minecraft.class_2183
/**
 * net.minecraft.class_4520
 */
typealias TestRunContext = net.minecraft.class_4520
/**
 * net.minecraft.class_4119
 */
typealias LookAtMobTask = net.minecraft.class_4119
/**
 * net.minecraft.class_9178
 */
typealias DebugSampleS2CPacket = net.minecraft.class_9178
/**
 * net.minecraft.class_7891
 */
typealias Registerable<T> = net.minecraft.class_7891<T>
/**
 * net.minecraft.class_7165
 */
typealias NeighborUpdater = net.minecraft.class_7165
/**
 * net.minecraft.class_5921
 */
typealias RootSystemFeature = net.minecraft.class_5921
/**
 * net.minecraft.class_2433
 */
typealias WallPlayerSkullBlock = net.minecraft.class_2433
/**
 * net.minecraft.class_7071
 */
typealias VanillaStructureTagProvider = net.minecraft.class_7071
/**
 * net.minecraft.class_2624
 */
typealias LockableContainerBlockEntity = net.minecraft.class_2624
/**
 * net.minecraft.class_2533
 */
typealias TrapdoorBlock = net.minecraft.class_2533
/**
 * net.minecraft.class_4748
 */
typealias ProfileLocationInfo = net.minecraft.class_4748
/**
 * net.minecraft.class_8697
 */
typealias ClientPacketListener = net.minecraft.class_8697
/**
 * net.minecraft.class_1369
 */
typealias WanderNearTargetGoal = net.minecraft.class_1369
/**
 * net.minecraft.class_8805
 */
typealias ColorCode = net.minecraft.class_8805
/**
 * net.minecraft.class_4042
 */
typealias FoxEntityRenderer = net.minecraft.class_4042
/**
 * net.minecraft.class_9069
 */
typealias ArmadilloEntity = net.minecraft.class_9069
/**
 * net.minecraft.class_2521
 */
typealias TallFlowerBlock = net.minecraft.class_2521
/**
 * net.minecraft.class_2466
 */
typealias VanillaBlockTagProvider = net.minecraft.class_2466
/**
 * net.minecraft.class_9229
 */
typealias WolfHealthFix = net.minecraft.class_9229
/**
 * net.minecraft.class_3569
 */
typealias SkyLightStorage = net.minecraft.class_3569
/**
 * net.minecraft.class_3142
 */
typealias TeamCommand = net.minecraft.class_3142
/**
 * net.minecraft.class_2820
 */
typealias BookUpdateC2SPacket = net.minecraft.class_2820
/**
 * net.minecraft.class_4512
 */
typealias GameTestException = net.minecraft.class_4512
/**
 * net.minecraft.class_2347
 */
typealias ItemDispenserBehavior = net.minecraft.class_2347
/**
 * net.minecraft.class_7722
 */
typealias VibrationSelector = net.minecraft.class_7722
/**
 * net.minecraft.class_8129
 */
typealias TagPredicate<T> = net.minecraft.class_8129<T>
/**
 * net.minecraft.class_424
 */
typealias MessageScreen = net.minecraft.class_424
/**
 * net.minecraft.class_3043
 */
typealias EffectCommand = net.minecraft.class_3043
/**
 * net.minecraft.class_7678
 */
typealias VanillaResourcePackProvider = net.minecraft.class_7678
/**
 * net.minecraft.class_7977
 */
typealias PerformanceMetricsEvent = net.minecraft.class_7977
/**
 * net.minecraft.class_5802
 */
typealias BigDripleafStemBlock = net.minecraft.class_5802
/**
 * net.minecraft.class_1320
 */
typealias EntityAttribute = net.minecraft.class_1320
/**
 * net.minecraft.class_8733
 */
typealias ReadyS2CPacket = net.minecraft.class_8733
/**
 * java.io.InputStream
 */
typealias InputStream = java.io.InputStream
/**
 * net.minecraft.class_8580
 */
typealias SymlinkFinder = net.minecraft.class_8580
/**
 * net.minecraft.class_821
 */
typealias OrMultipartModelSelector = net.minecraft.class_821
/**
 * net.minecraft.class_9463
 */
typealias ProjectileItem = net.minecraft.class_9463
/**
 * net.minecraft.class_391
 */
typealias UnihexFont = net.minecraft.class_391
/**
 * net.minecraft.class_8711
 */
typealias UnknownCustomPayload = net.minecraft.class_8711
/**
 * net.minecraft.class_727
 */
typealias BlockDustParticle = net.minecraft.class_727
/**
 * net.minecraft.class_2766
 */
typealias NoteBlockInstrument = net.minecraft.class_2766
/**
 * net.minecraft.class_6833
 */
typealias StructurePresence = net.minecraft.class_6833
/**
 * net.minecraft.class_4655
 */
typealias PillarBlockStateProvider = net.minecraft.class_4655
/**
 * net.minecraft.class_2458
 */
typealias WallRedstoneTorchBlock = net.minecraft.class_2458
/**
 * net.minecraft.class_3568
 */
typealias LightingProvider = net.minecraft.class_3568
/**
 * net.minecraft.class_723
 */
typealias WaterSuspendParticle = net.minecraft.class_723
/**
 * net.minecraft.class_3091
 */
typealias PlaySoundCommand = net.minecraft.class_3091
/**
 * net.minecraft.class_4509
 */
typealias PassiveBeeSoundInstance = net.minecraft.class_4509
/**
 * net.minecraft.class_1124
 */
typealias SearchManager = net.minecraft.class_1124
/**
 * net.minecraft.class_9160
 */
typealias ServerTickType = net.minecraft.class_9160
/**
 * net.minecraft.class_2744
 */
typealias EntityEquipmentUpdateS2CPacket = net.minecraft.class_2744
/**
 * net.minecraft.class_9312
 */
typealias ChunkGenerationContext = net.minecraft.class_9312
/**
 * net.minecraft.class_6227
 */
typealias GoatEntityModel<T> = net.minecraft.class_6227<T>
/**
 * net.minecraft.class_4252
 */
typealias ForgetBellRingTask = net.minecraft.class_4252
/**
 * java.util.function.LongSupplier
 */
typealias LongSupplier = java.util.function.LongSupplier
/**
 * net.minecraft.class_4890
 */
typealias WorldTemplate = net.minecraft.class_4890
/**
 * net.minecraft.class_3183
 */
typealias FreezeTopLayerFeature = net.minecraft.class_3183
/**
 * net.minecraft.class_6842
 */
typealias NbtTreeNode = net.minecraft.class_6842
/**
 * net.minecraft.class_480
 */
typealias Generic3x3ContainerScreen = net.minecraft.class_480
/**
 * net.minecraft.class_8763
 */
typealias ClientPingResultPacketListener = net.minecraft.class_8763
/**
 * net.minecraft.class_5168
 */
typealias ShearsDispenserBehavior = net.minecraft.class_5168
/**
 * net.minecraft.class_2790
 */
typealias SynchronizeTagsS2CPacket = net.minecraft.class_2790
/**
 * net.minecraft.class_911
 */
typealias RavagerEntityRenderer = net.minecraft.class_911
/**
 * net.minecraft.class_5835
 */
typealias UnderwaterMagmaFeatureConfig = net.minecraft.class_5835
/**
 * net.minecraft.class_3035
 */
typealias DefaultGameModeCommand = net.minecraft.class_3035
/**
 * net.minecraft.class_4044
 */
typealias PaintingManager = net.minecraft.class_4044
/**
 * net.minecraft.class_9172
 */
typealias ChunkPosKeyedStorage = net.minecraft.class_9172
/**
 * net.minecraft.class_8721
 */
typealias DebugPathCustomPayload = net.minecraft.class_8721
/**
 * net.minecraft.class_3929
 */
typealias HandledScreens = net.minecraft.class_3929
/**
 * net.minecraft.class_4538
 */
typealias WorldView = net.minecraft.class_4538
/**
 * net.minecraft.class_276
 */
typealias Framebuffer = net.minecraft.class_276
/**
 * net.minecraft.class_4902
 */
typealias RealmsConnection = net.minecraft.class_4902
/**
 * net.minecraft.class_787
 */
typealias ModelElementTexture = net.minecraft.class_787
/**
 * net.minecraft.class_691
 */
typealias ExplosionLargeParticle = net.minecraft.class_691
/**
 * net.minecraft.class_2362
 */
typealias FlowerPotBlock = net.minecraft.class_2362
/**
 * net.minecraft.class_362
 */
typealias AbstractParentElement = net.minecraft.class_362
/**
 * net.minecraft.class_5945
 */
typealias ParticleUtil = net.minecraft.class_5945
/**
 * net.minecraft.class_9093
 */
typealias BundleDelimiterS2CPacket = net.minecraft.class_9093
/**
 * net.minecraft.class_286
 */
typealias BufferRenderer = net.minecraft.class_286
/**
 * java.util.function.IntUnaryOperator
 */
typealias IntUnaryOperator = java.util.function.IntUnaryOperator
/**
 * net.minecraft.class_7745
 */
typealias ExperimentalWarningScreen = net.minecraft.class_7745
/**
 * it.unimi.dsi.fastutil.ints.IntCollection
 */
typealias IntCollection = it.unimi.dsi.fastutil.ints.IntCollection
/**
 * net.minecraft.class_8152
 */
typealias Targeter = net.minecraft.class_8152
/**
 * java.util.UUID
 */
typealias UUID = java.util.UUID
/**
 * net.minecraft.class_257
 */
typealias DisjointPairList = net.minecraft.class_257
/**
 * net.minecraft.class_1245
 */
typealias Schema1800 = net.minecraft.class_1245
/**
 * net.minecraft.class_2783
 */
typealias EntityStatusEffectS2CPacket = net.minecraft.class_2783
/**
 * net.minecraft.class_1244
 */
typealias Schema1801 = net.minecraft.class_1244
/**
 * net.minecraft.class_2073
 */
typealias ItemPredicate = net.minecraft.class_2073
/**
 * net.minecraft.class_2272
 */
typealias CakeBlock = net.minecraft.class_2272
/**
 * net.minecraft.class_8962
 */
typealias EntityDetector = net.minecraft.class_8962
/**
 * net.minecraft.class_6868
 */
typealias PowderSnowJumpGoal = net.minecraft.class_6868
/**
 * net.minecraft.class_2415
 */
typealias BlockMirror = net.minecraft.class_2415
/**
 * net.minecraft.class_9053
 */
typealias ResourcePackRemoveS2CPacket = net.minecraft.class_9053
/**
 * net.minecraft.class_447
 */
typealias StatsScreen = net.minecraft.class_447
/**
 * net.minecraft.class_3579
 */
typealias BlockNameFix = net.minecraft.class_3579
/**
 * net.minecraft.class_3116
 */
typealias OceanMonumentStructure = net.minecraft.class_3116
/**
 * net.minecraft.class_33
 */
typealias LevelStorageException = net.minecraft.class_33
/**
 * net.minecraft.class_9827
 */
typealias PacketReportProvider = net.minecraft.class_9827
/**
 * net.minecraft.class_5817
 */
typealias StructureWeightSampler = net.minecraft.class_5817
/**
 * net.minecraft.class_4114
 */
typealias GoToWorkTask = net.minecraft.class_4114
/**
 * net.minecraft.class_8528
 */
typealias ChunkSkyLight = net.minecraft.class_8528
/**
 * net.minecraft.class_3726
 */
typealias ShapeContext = net.minecraft.class_3726
/**
 * net.minecraft.class_7982
 */
typealias WorldUnloadedEvent = net.minecraft.class_7982
/**
 * net.minecraft.class_8915
 */
typealias ServerTickManager = net.minecraft.class_8915
/**
 * net.minecraft.class_5553
 */
typealias LavaCauldronBlock = net.minecraft.class_5553
/**
 * net.minecraft.class_3604
 */
typealias EntityItemFrameDirectionFix = net.minecraft.class_3604
/**
 * net.minecraft.class_7065
 */
typealias WarningScreen = net.minecraft.class_7065
/**
 * net.minecraft.class_7665
 */
typealias DefaultResourcePackBuilder = net.minecraft.class_7665
/**
 * net.minecraft.class_7929
 */
typealias LogFileCompressor = net.minecraft.class_7929
/**
 * net.minecraft.class_1278
 */
typealias SidedInventory = net.minecraft.class_1278
/**
 * net.minecraft.class_1297
 */
typealias Entity = net.minecraft.class_1297
/**
 * net.minecraft.class_4833
 */
typealias NearestItemsSensor = net.minecraft.class_4833
/**
 * net.minecraft.class_3036
 */
typealias DifficultyCommand = net.minecraft.class_3036
/**
 * net.minecraft.class_8918
 */
typealias ProjectileItemTypeFix = net.minecraft.class_8918
/**
 * net.minecraft.class_6489
 */
typealias GameVersion = net.minecraft.class_6489
/**
 * net.minecraft.class_6383
 */
typealias Narratable = net.minecraft.class_6383
/**
 * net.minecraft.class_9082
 */
typealias ArmadilloEntityModel = net.minecraft.class_9082
/**
 * net.minecraft.class_5349
 */
typealias FunctionLoader = net.minecraft.class_5349
/**
 * net.minecraft.class_9381
 */
typealias EntityEffectParticleEffect = net.minecraft.class_9381
/**
 * net.minecraft.class_761
 */
typealias WorldRenderer = net.minecraft.class_761
/**
 * net.minecraft.class_7420
 */
typealias KeybindTranslations = net.minecraft.class_7420
/**
 * net.minecraft.class_6763
 */
typealias BasicTickScheduler<T> = net.minecraft.class_6763<T>
/**
 * net.minecraft.class_8577
 */
typealias ScrollableTextWidget = net.minecraft.class_8577
/**
 * net.minecraft.class_3688
 */
typealias EmptyProfileResult = net.minecraft.class_3688
/**
 * net.minecraft.class_5691
 */
typealias Thickness = net.minecraft.class_5691
/**
 * net.minecraft.class_1534
 */
typealias PaintingEntity = net.minecraft.class_1534
/**
 * net.minecraft.class_3572
 */
typealias ChunkSkyLightProvider = net.minecraft.class_3572
/**
 * net.minecraft.class_3602
 */
typealias EntityHorseSplitFix = net.minecraft.class_3602
/**
 * net.minecraft.class_4976
 */
typealias VillagerGossipFix = net.minecraft.class_4976
/**
 * net.minecraft.class_7936
 */
typealias LogReader<T> = net.minecraft.class_7936<T>
/**
 * net.minecraft.class_1093
 */
typealias BasicBakedModel = net.minecraft.class_1093
/**
 * net.minecraft.class_8492
 */
typealias ReferenceLootFunction = net.minecraft.class_8492
/**
 * net.minecraft.class_5789
 */
typealias GlowSquidEntityRenderer = net.minecraft.class_5789
/**
 * net.minecraft.class_3326
 */
typealias OperatorList = net.minecraft.class_3326
/**
 * net.minecraft.class_5702
 */
typealias BlockStateRaycastContext = net.minecraft.class_5702
/**
 * net.minecraft.class_6639
 */
typealias WorldGenSettingsHeightAndBiomeFix = net.minecraft.class_6639
/**
 * net.minecraft.class_1890
 */
typealias EnchantmentHelper = net.minecraft.class_1890
/**
 * net.minecraft.class_9810
 */
typealias SectionBuilder = net.minecraft.class_9810
/**
 * net.minecraft.class_1670
 */
typealias DragonFireballEntity = net.minecraft.class_1670
/**
 * net.minecraft.class_7428
 */
typealias PlayerPublicKey = net.minecraft.class_7428
/**
 * net.minecraft.class_3692
 */
typealias ProfileResultImpl = net.minecraft.class_3692
/**
 * net.minecraft.class_9281
 */
typealias DebugStickStateComponent = net.minecraft.class_9281
/**
 * net.minecraft.class_8657
 */
typealias CommandHistoryManager = net.minecraft.class_8657
/**
 * net.minecraft.class_3693
 */
typealias ReadableProfiler = net.minecraft.class_3693
/**
 * net.minecraft.class_2394
 */
typealias ParticleEffect = net.minecraft.class_2394
/**
 * net.minecraft.class_4264
 */
typealias PressableWidget = net.minecraft.class_4264
/**
 * net.minecraft.class_1826
 */
typealias SpawnEggItem = net.minecraft.class_1826
/**
 * net.minecraft.class_9637
 */
typealias NullOps = net.minecraft.class_9637
/**
 * net.minecraft.class_111
 */
typealias ExplorationMapLootFunction = net.minecraft.class_111
/**
 * net.minecraft.class_5836
 */
typealias NoiseHelper = net.minecraft.class_5836
/**
 * net.minecraft.class_2105
 */
typealias NbtPredicate = net.minecraft.class_2105
/**
 * net.minecraft.class_9634
 */
typealias ListDeque<T> = net.minecraft.class_9634<T>
/**
 * net.minecraft.class_5193
 */
typealias BlockAgeStructureProcessor = net.minecraft.class_5193
/**
 * net.minecraft.class_3161
 */
typealias BlockDataObject = net.minecraft.class_3161
/**
 * net.minecraft.class_889
 */
typealias DolphinEntityModel<T> = net.minecraft.class_889<T>
/**
 * net.minecraft.class_865
 */
typealias CollisionDebugRenderer = net.minecraft.class_865
/**
 * net.minecraft.class_5158
 */
typealias DeltaFeatureConfig = net.minecraft.class_5158
/**
 * net.minecraft.class_6507
 */
typealias JfrListener = net.minecraft.class_6507
/**
 * net.minecraft.class_9452
 */
typealias ItemStackCustomNameToItemNameFix = net.minecraft.class_9452
/**
 * net.minecraft.class_2822
 */
typealias QueryEntityNbtC2SPacket = net.minecraft.class_2822
/**
 * net.minecraft.class_6405
 */
typealias LightningStrikeCriterion = net.minecraft.class_6405
/**
 * java.util.Comparator
 */
typealias Comparator<T> = java.util.Comparator<T>
/**
 * com.mojang.datafixers.Typed
 */
typealias Typed<A> = com.mojang.datafixers.Typed<A>
/**
 * net.minecraft.class_4832
 */
typealias HoglinSpecificSensor = net.minecraft.class_4832
/**
 * net.minecraft.class_2532
 */
typealias PacketInflater = net.minecraft.class_2532
/**
 * net.minecraft.class_1763
 */
typealias DebugStickItem = net.minecraft.class_1763
/**
 * net.minecraft.class_6333
 */
typealias BiasedToBottomIntProvider = net.minecraft.class_6333
/**
 * net.minecraft.class_7791
 */
typealias LootTableGenerator = net.minecraft.class_7791
/**
 * net.minecraft.class_2600
 */
typealias NetworkThreadUtils = net.minecraft.class_2600
/**
 * net.minecraft.class_1151
 */
typealias MovementTutorialStepHandler = net.minecraft.class_1151
/**
 * net.minecraft.class_2913
 */
typealias LoginQueryResponseC2SPacket = net.minecraft.class_2913
/**
 * net.minecraft.class_2312
 */
typealias AbstractRedstoneGateBlock = net.minecraft.class_2312
/**
 * net.minecraft.class_2555
 */
typealias WallTorchBlock = net.minecraft.class_2555
/**
 * net.minecraft.class_3558
 */
typealias ChunkLightProvider<M, S> = net.minecraft.class_3558<M, S>
/**
 * net.minecraft.class_4399
 */
typealias RealmsNotificationsScreen = net.minecraft.class_4399
/**
 * net.minecraft.class_1294
 */
typealias StatusEffects = net.minecraft.class_1294
/**
 * net.minecraft.class_5944
 */
typealias ShaderProgram = net.minecraft.class_5944
/**
 * net.minecraft.class_205
 */
typealias LocationCheckLootCondition = net.minecraft.class_205
/**
 * net.minecraft.class_5964
 */
typealias Deviation = net.minecraft.class_5964
/**
 * net.minecraft.class_4118
 */
typealias RandomTask<E> = net.minecraft.class_4118<E>
/**
 * net.minecraft.class_4148
 */
typealias Sensor<E> = net.minecraft.class_4148<E>
/**
 * net.minecraft.class_4573
 */
typealias RenderCall = net.minecraft.class_4573
/**
 * net.minecraft.class_614
 */
typealias TurtleEntityModel<T> = net.minecraft.class_614<T>
/**
 * net.minecraft.class_4126
 */
typealias GatherItemsVillagerTask = net.minecraft.class_4126
/**
 * net.minecraft.class_965
 */
typealias WitchEntityRenderer = net.minecraft.class_965
/**
 * net.minecraft.class_8895
 */
typealias ParsedSaveProperties = net.minecraft.class_8895
/**
 * net.minecraft.class_6955
 */
typealias OreVeinSampler = net.minecraft.class_6955
/**
 * net.minecraft.class_5214
 */
typealias GiantTrunkPlacer = net.minecraft.class_5214
/**
 * net.minecraft.class_5676
 */
typealias CyclingButtonWidget<T> = net.minecraft.class_5676<T>
/**
 * net.minecraft.class_933
 */
typealias PhantomEntityRenderer = net.minecraft.class_933
/**
 * net.minecraft.class_2535
 */
typealias ClientConnection = net.minecraft.class_2535
/**
 * net.minecraft.class_1744
 */
typealias ArrowItem = net.minecraft.class_1744
/**
 * net.minecraft.class_3805
 */
typealias BlockPileFeature = net.minecraft.class_3805
/**
 * net.minecraft.class_7697
 */
typealias FeatureManager = net.minecraft.class_7697
/**
 * net.minecraft.class_4761
 */
typealias BiomeParticleConfig = net.minecraft.class_4761
/**
 * net.minecraft.class_3756
 */
typealias PerlinNoiseSampler = net.minecraft.class_3756
/**
 * net.minecraft.class_1100
 */
typealias UnbakedModel = net.minecraft.class_1100
/**
 * net.minecraft.class_8647
 */
typealias RealmsAvailability = net.minecraft.class_8647
/**
 * net.minecraft.class_5599
 */
typealias EntityModelLoader = net.minecraft.class_5599
/**
 * net.minecraft.class_4143
 */
typealias DummySensor = net.minecraft.class_4143
/**
 * net.minecraft.class_7225
 */
typealias RegistryWrapper<T> = net.minecraft.class_7225<T>
/**
 * net.minecraft.class_3992
 */
typealias WanderingTraderEntityRenderer = net.minecraft.class_3992
/**
 * net.minecraft.class_8973
 */
typealias BreezeEntityModel<T> = net.minecraft.class_8973<T>
/**
 * net.minecraft.class_2239
 */
typealias ScoreboardSlotArgumentType = net.minecraft.class_2239
/**
 * net.minecraft.class_284
 */
typealias GlUniform = net.minecraft.class_284
/**
 * net.minecraft.class_4170
 */
typealias Schedule = net.minecraft.class_4170
/**
 * net.minecraft.class_2868
 */
typealias UpdateSelectedSlotC2SPacket = net.minecraft.class_2868
/**
 * net.minecraft.class_2794
 */
typealias ChunkGenerator = net.minecraft.class_2794
/**
 * net.minecraft.class_4935
 */
typealias BlockStateVariant = net.minecraft.class_4935
/**
 * net.minecraft.class_1397
 */
typealias TrackIronGolemTargetGoal = net.minecraft.class_1397
/**
 * net.minecraft.class_4885
 */
typealias RealmsSerializable = net.minecraft.class_4885
/**
 * net.minecraft.class_8988
 */
typealias BreezeEyesFeatureRenderer = net.minecraft.class_8988
/**
 * net.minecraft.class_6368
 */
typealias Address = net.minecraft.class_6368
/**
 * net.minecraft.class_3162
 */
typealias DataCommandObject = net.minecraft.class_3162
/**
 * net.minecraft.class_9694
 */
typealias CraftingRecipeInput = net.minecraft.class_9694
/**
 * net.minecraft.class_9227
 */
typealias Class2IntMap = net.minecraft.class_9227
/**
 * net.minecraft.class_1551
 */
typealias DrownedEntity = net.minecraft.class_1551
/**
 * net.minecraft.class_1714
 */
typealias CraftingScreenHandler = net.minecraft.class_1714
/**
 * net.minecraft.class_3793
 */
typealias BlockIgnoreStructureProcessor = net.minecraft.class_3793
/**
 * net.minecraft.class_131
 */
typealias LootFunctionTypes = net.minecraft.class_131
/**
 * net.minecraft.class_2429
 */
typealias ConnectingBlock = net.minecraft.class_2429
/**
 * net.minecraft.class_2222
 */
typealias DeadCoralWallFanBlock = net.minecraft.class_2222
/**
 * net.minecraft.class_425
 */
typealias SplashOverlay = net.minecraft.class_425
/**
 * net.minecraft.class_1746
 */
typealias BannerItem = net.minecraft.class_1746
/**
 * net.minecraft.class_2389
 */
typealias PaneBlock = net.minecraft.class_2389
/**
 * net.minecraft.class_9378
 */
typealias SetWrittenBookPagesLootFunction = net.minecraft.class_9378
/**
 * net.minecraft.class_9290
 */
typealias LoreComponent = net.minecraft.class_9290
/**
 * net.minecraft.class_7507
 */
typealias PointOfInterestRenameFix = net.minecraft.class_7507
/**
 * net.minecraft.class_2891
 */
typealias DebugChunkGenerator = net.minecraft.class_2891
/**
 * net.minecraft.class_8088
 */
typealias TabManager = net.minecraft.class_8088
/**
 * net.minecraft.class_815
 */
typealias MultipartModelSelector = net.minecraft.class_815
/**
 * net.minecraft.class_9120
 */
typealias TestStructurePlacer = net.minecraft.class_9120
/**
 * net.minecraft.class_1337
 */
typealias WolfBegGoal = net.minecraft.class_1337
/**
 * java.util.concurrent.Callable
 */
typealias Callable<V> = java.util.concurrent.Callable<V>
/**
 * net.minecraft.class_6805
 */
typealias NetherConfiguredFeatures = net.minecraft.class_6805
/**
 * net.minecraft.class_4445
 */
typealias WorldCreationTask = net.minecraft.class_4445
/**
 * net.minecraft.class_1673
 */
typealias LlamaSpitEntity = net.minecraft.class_1673
/**
 * net.minecraft.class_2393
 */
typealias KelpBlock = net.minecraft.class_2393
/**
 * net.minecraft.class_2893
 */
typealias GenerationStep = net.minecraft.class_2893
/**
 * net.minecraft.class_8557
 */
typealias TrueTypeFontLoader = net.minecraft.class_8557
/**
 * net.minecraft.class_3806
 */
typealias ServerPropertiesHandler = net.minecraft.class_3806
/**
 * net.minecraft.class_3706
 */
typealias SmokerScreenHandler = net.minecraft.class_3706
/**
 * net.minecraft.class_9295
 */
typealias MapPostProcessingComponent = net.minecraft.class_9295
/**
 * net.minecraft.class_1068
 */
typealias DefaultSkinHelper = net.minecraft.class_1068
/**
 * net.minecraft.class_1795
 */
typealias ItemFrameItem = net.minecraft.class_1795
/**
 * net.minecraft.class_5543
 */
typealias BuddingAmethystBlock = net.minecraft.class_5543
/**
 * net.minecraft.class_3135
 */
typealias RandomBooleanFeature = net.minecraft.class_3135
/**
 * net.minecraft.class_954
 */
typealias ArrowEntityRenderer = net.minecraft.class_954
/**
 * net.minecraft.class_812
 */
typealias AndMultipartModelSelector = net.minecraft.class_812
/**
 * net.minecraft.class_2823
 */
typealias ChunkProvider = net.minecraft.class_2823
/**
 * net.minecraft.class_1262
 */
typealias Inventories = net.minecraft.class_1262
/**
 * net.minecraft.class_8168
 */
typealias DecoratedPotBlock = net.minecraft.class_8168
/**
 * net.minecraft.class_1055
 */
typealias TextureStitcher<T> = net.minecraft.class_1055<T>
/**
 * net.minecraft.class_2759
 */
typealias PlayerSpawnPositionS2CPacket = net.minecraft.class_2759
/**
 * net.minecraft.class_5863
 */
typealias FloatProvider = net.minecraft.class_5863
/**
 * net.minecraft.class_3255
 */
typealias AbstractFileResourcePack = net.minecraft.class_3255
/**
 * net.minecraft.class_1764
 */
typealias CrossbowItem = net.minecraft.class_1764
/**
 * net.minecraft.class_4507
 */
typealias StuckObjectsFeatureRenderer<T, M> = net.minecraft.class_4507<T, M>
/**
 * net.minecraft.class_1438
 */
typealias MooshroomEntity = net.minecraft.class_1438
/**
 * net.minecraft.class_4392
 */
typealias RealmsDownloadLatestWorldScreen = net.minecraft.class_4392
/**
 * net.minecraft.class_9150
 */
typealias StoreCookieS2CPacket = net.minecraft.class_9150
/**
 * net.minecraft.class_9112
 */
typealias CookieStorage = net.minecraft.class_9112
/**
 * net.minecraft.class_2890
 */
typealias ServerHandshakePacketListener = net.minecraft.class_2890
/**
 * net.minecraft.class_9390
 */
typealias ParseErrorList<S> = net.minecraft.class_9390<S>
/**
 * net.minecraft.class_7297
 */
typealias WalkTowardsLookTargetTask = net.minecraft.class_7297
/**
 * net.minecraft.class_906
 */
typealias FishingBobberEntityRenderer = net.minecraft.class_906
/**
 * net.minecraft.class_8863
 */
typealias SteppedCommandAction<T, P> = net.minecraft.class_8863<T, P>
/**
 * net.minecraft.class_8000
 */
typealias TooltipPositioner = net.minecraft.class_8000
/**
 * net.minecraft.class_2976
 */
typealias PendingServerCommand = net.minecraft.class_2976
/**
 * net.minecraft.class_3906
 */
typealias MessageListener<Msg> = net.minecraft.class_3906<Msg>
/**
 * net.minecraft.class_891
 */
typealias DragonFireballEntityRenderer = net.minecraft.class_891
/**
 * net.minecraft.class_7538
 */
typealias ChatReportScreen = net.minecraft.class_7538
/**
 * net.minecraft.class_8551
 */
typealias AnyOfLootCondition = net.minecraft.class_8551
/**
 * net.minecraft.class_5134
 */
typealias EntityAttributes = net.minecraft.class_5134
/**
 * net.minecraft.class_3086
 */
typealias PardonCommand = net.minecraft.class_3086
/**
 * net.minecraft.class_7712
 */
typealias DataConfiguration = net.minecraft.class_7712
/**
 * net.minecraft.class_3777
 */
typealias EmptyPoolElement = net.minecraft.class_3777
/**
 * net.minecraft.class_1716
 */
typealias Generic3x3ContainerScreenHandler = net.minecraft.class_1716
/**
 * net.minecraft.class_4225
 */
typealias SoundEngine = net.minecraft.class_4225
/**
 * net.minecraft.class_3581
 */
typealias BlockStateStructureTemplateFix = net.minecraft.class_3581
/**
 * net.minecraft.class_1805
 */
typealias MilkBucketItem = net.minecraft.class_1805
/**
 * net.minecraft.class_818
 */
typealias SimpleMultipartModelSelector = net.minecraft.class_818
/**
 * net.minecraft.class_4345
 */
typealias RealmsError = net.minecraft.class_4345
/**
 * net.minecraft.class_1830
 */
typealias SuspiciousStewItem = net.minecraft.class_1830
/**
 * net.minecraft.class_394
 */
typealias FontType = net.minecraft.class_394
/**
 * net.minecraft.class_9659
 */
typealias FireworksPredicate = net.minecraft.class_9659
/**
 * net.minecraft.class_1480
 */
typealias WaterCreatureEntity = net.minecraft.class_1480
/**
 * net.minecraft.class_304
 */
typealias KeyBinding = net.minecraft.class_304
/**
 * net.minecraft.class_7981
 */
typealias WorldLoadTimesEvent = net.minecraft.class_7981
/**
 * net.minecraft.class_3571
 */
typealias BlockEntityIdFix = net.minecraft.class_3571
/**
 * net.minecraft.class_7836
 */
typealias Divider = net.minecraft.class_7836
/**
 * net.minecraft.class_5651
 */
typealias LootNbtProvider = net.minecraft.class_5651
/**
 * net.minecraft.class_1823
 */
typealias SnowballItem = net.minecraft.class_1823
/**
 * net.minecraft.class_8928
 */
typealias BatAnimations = net.minecraft.class_8928
/**
 * net.minecraft.class_6746
 */
typealias BelowZeroRetrogen = net.minecraft.class_6746
/**
 * net.minecraft.class_1429
 */
typealias AnimalEntity = net.minecraft.class_1429
/**
 * net.minecraft.class_1376
 */
typealias LookAroundGoal = net.minecraft.class_1376
/**
 * net.minecraft.class_3272
 */
typealias PackResourceMetadata = net.minecraft.class_3272
/**
 * net.minecraft.class_5602
 */
typealias EntityModelLayers = net.minecraft.class_5602
/**
 * net.minecraft.class_5420
 */
typealias PiglinBruteBrain = net.minecraft.class_5420
/**
 * net.minecraft.class_5779
 */
typealias MultifaceGrowthFeature = net.minecraft.class_5779
/**
 * net.minecraft.class_7871
 */
typealias RegistryEntryLookup<T> = net.minecraft.class_7871<T>
/**
 * net.minecraft.class_9204
 */
typealias VaultServerData = net.minecraft.class_9204
/**
 * net.minecraft.class_8701
 */
typealias ServerPacketListener = net.minecraft.class_8701
/**
 * net.minecraft.class_2335
 */
typealias AxisCycleDirection = net.minecraft.class_2335
/**
 * net.minecraft.class_1074
 */
typealias I18n = net.minecraft.class_1074
/**
 * net.minecraft.class_3830
 */
typealias SweetBerryBushBlock = net.minecraft.class_3830
/**
 * net.minecraft.class_6017
 */
typealias IntProvider = net.minecraft.class_6017
/**
 * net.minecraft.class_5209
 */
typealias JungleFoliagePlacer = net.minecraft.class_5209
/**
 * net.minecraft.class_2270
 */
typealias RotationArgumentType = net.minecraft.class_2270
/**
 * net.minecraft.class_3719
 */
typealias BarrelBlockEntity = net.minecraft.class_3719
/**
 * net.minecraft.class_7504
 */
typealias RemoveFilteredSignTextFix = net.minecraft.class_7504
/**
 * net.minecraft.class_1683
 */
typealias ExperienceBottleEntity = net.minecraft.class_1683
/**
 * net.minecraft.class_1713
 */
typealias SlotActionType = net.minecraft.class_1713
/**
 * net.minecraft.class_5215
 */
typealias MegaJungleTrunkPlacer = net.minecraft.class_5215
/**
 * net.minecraft.class_1747
 */
typealias BlockItem = net.minecraft.class_1747
/**
 * net.minecraft.class_5369
 */
typealias ResourcePackOrganizer = net.minecraft.class_5369
/**
 * net.minecraft.class_7084
 */
typealias ResourceFilter = net.minecraft.class_7084
/**
 * net.minecraft.class_594
 */
typealias SmallPufferfishEntityModel<T> = net.minecraft.class_594<T>
/**
 * net.minecraft.class_3735
 */
typealias EntityEquipmentPredicate = net.minecraft.class_3735
/**
 * net.minecraft.class_2788
 */
typealias SynchronizeRecipesS2CPacket = net.minecraft.class_2788
/**
 * net.minecraft.class_7619
 */
typealias MessageChainTaskQueue = net.minecraft.class_7619
/**
 * net.minecraft.class_2797
 */
typealias ChatMessageC2SPacket = net.minecraft.class_2797
/**
 * net.minecraft.class_3754
 */
typealias NoiseChunkGenerator = net.minecraft.class_3754
/**
 * net.minecraft.class_2196
 */
typealias MessageArgumentType = net.minecraft.class_2196
/**
 * net.minecraft.class_5604
 */
typealias ModelCuboidData = net.minecraft.class_5604
/**
 * net.minecraft.class_7198
 */
typealias FrogEntityModel<T> = net.minecraft.class_7198<T>
/**
 * net.minecraft.class_636
 */
typealias ClientPlayerInteractionManager = net.minecraft.class_636
/**
 * net.minecraft.class_8724
 */
typealias DebugPoiTicketCountCustomPayload = net.minecraft.class_8724
/**
 * net.minecraft.class_4915
 */
typealias ItemModelGenerator = net.minecraft.class_4915
/**
 * net.minecraft.class_4267
 */
typealias MultiplayerServerListWidget = net.minecraft.class_4267
/**
 * java.util.function.Predicate
 */
typealias Predicate<T> = java.util.function.Predicate<T>
/**
 * net.minecraft.class_4998
 */
typealias AxisTransformation = net.minecraft.class_4998
/**
 * net.minecraft.class_7580
 */
typealias RealmsServerFilterer = net.minecraft.class_7580
/**
 * net.minecraft.class_2338
 */
typealias BlockPos = net.minecraft.class_2338
/**
 * net.minecraft.class_3123
 */
typealias SetIdleTimeoutCommand = net.minecraft.class_3123
/**
 * com.mojang.brigadier.exceptions.CommandSyntaxException
 */
typealias CommandSyntaxException = com.mojang.brigadier.exceptions.CommandSyntaxException
/**
 * net.minecraft.class_8911
 */
typealias NbtCrashException = net.minecraft.class_8911
/**
 * net.minecraft.class_1733
 */
typealias ShulkerBoxScreenHandler = net.minecraft.class_1733
/**
 * net.minecraft.class_903
 */
typealias FireworkRocketEntityRenderer = net.minecraft.class_903
/**
 * net.minecraft.class_4435
 */
typealias CloseServerTask = net.minecraft.class_4435
/**
 * net.minecraft.class_1405
 */
typealias TrackTargetGoal = net.minecraft.class_1405
/**
 * net.minecraft.class_9432
 */
typealias StorageLootNumberProvider = net.minecraft.class_9432
/**
 * net.minecraft.class_1848
 */
typealias BannerDuplicateRecipe = net.minecraft.class_1848
/**
 * net.minecraft.class_7240
 */
typealias WardenSpawnTrackerCommand = net.minecraft.class_7240
/**
 * net.minecraft.class_1766
 */
typealias MiningToolItem = net.minecraft.class_1766
/**
 * net.minecraft.class_3515
 */
typealias NetworkEncryptionUtils = net.minecraft.class_3515
/**
 * net.minecraft.class_5346
 */
typealias DataPackFailureScreen = net.minecraft.class_5346
/**
 * net.minecraft.class_3767
 */
typealias RaidManager = net.minecraft.class_3767
/**
 * net.minecraft.class_5263
 */
typealias GravityField = net.minecraft.class_5263
/**
 * net.minecraft.class_1941
 */
typealias CollisionView = net.minecraft.class_1941
/**
 * net.minecraft.class_1917
 */
typealias MobSpawnerLogic = net.minecraft.class_1917
/**
 * net.minecraft.class_8956
 */
typealias WindChargeEntity = net.minecraft.class_8956
/**
 * net.minecraft.class_3742
 */
typealias JigsawBlockScreen = net.minecraft.class_3742
/**
 * net.minecraft.class_3854
 */
typealias VillagerType = net.minecraft.class_3854
/**
 * net.minecraft.class_3773
 */
typealias StructurePieceType = net.minecraft.class_3773
/**
 * net.minecraft.class_2966
 */
typealias Bootstrap = net.minecraft.class_2966
/**
 * net.minecraft.class_4607
 */
typealias EnergySwirlOverlayFeatureRenderer<T, M> = net.minecraft.class_4607<T, M>
/**
 * net.minecraft.class_2933
 */
typealias ServerQueryPacketListener = net.minecraft.class_2933
/**
 * net.minecraft.class_5472
 */
typealias RateLimitedConnection = net.minecraft.class_5472
/**
 * net.minecraft.class_229
 */
typealias FunctionTagTimerCallback = net.minecraft.class_229
/**
 * net.minecraft.class_1876
 */
typealias TippedArrowRecipe = net.minecraft.class_1876
/**
 * net.minecraft.class_5202
 */
typealias FeatureSizeType<P> = net.minecraft.class_5202<P>
/**
 * net.minecraft.class_6575
 */
typealias LocalRandom = net.minecraft.class_6575
/**
 * net.minecraft.class_6622
 */
typealias StructurePiecesGenerator<C> = net.minecraft.class_6622<C>
/**
 * net.minecraft.class_4828
 */
typealias ForgetAttackTargetTask = net.minecraft.class_4828
/**
 * net.minecraft.class_8755
 */
typealias DebugChart = net.minecraft.class_8755
/**
 * net.minecraft.class_4983
 */
typealias FarmerWorkTask = net.minecraft.class_4983
/**
 * net.minecraft.class_3231
 */
typealias EntityTrackerEntry = net.minecraft.class_3231
/**
 * net.minecraft.class_5156
 */
typealias BasaltColumnsFeatureConfig = net.minecraft.class_5156
/**
 * net.minecraft.class_515
 */
typealias RecipeDisplayListener = net.minecraft.class_515
/**
 * net.minecraft.class_6409
 */
typealias UsingItemCriterion = net.minecraft.class_6409
/**
 * net.minecraft.class_8028
 */
typealias NavigationDirection = net.minecraft.class_8028
/**
 * net.minecraft.class_2548
 */
typealias PacketEncoderException = net.minecraft.class_2548
/**
 * net.minecraft.class_1792
 */
typealias Item = net.minecraft.class_1792
/**
 * net.minecraft.class_9055
 */
typealias CacheFiles = net.minecraft.class_9055
/**
 * com.mojang.authlib.yggdrasil.ServicesKeySet
 */
typealias ServicesKeySet = com.mojang.authlib.yggdrasil.ServicesKeySet
/**
 * net.minecraft.class_4245
 */
typealias JumpInBedTask = net.minecraft.class_4245
/**
 * net.minecraft.class_2414
 */
typealias VanillaHusbandryTabAdvancementGenerator = net.minecraft.class_2414
/**
 * net.minecraft.client.ClientBrandRetriever
 */
typealias ClientBrandRetriever = net.minecraft.client.ClientBrandRetriever
/**
 * net.minecraft.class_5662
 */
typealias UniformLootNumberProvider = net.minecraft.class_5662
/**
 * net.minecraft.class_3737
 */
typealias Waterloggable = net.minecraft.class_3737
/**
 * net.minecraft.class_7408
 */
typealias PaintingVariants = net.minecraft.class_7408
/**
 * net.minecraft.class_4846
 */
typealias EntityZombifiedPiglinRenameFix = net.minecraft.class_4846
/**
 * net.minecraft.class_9297
 */
typealias ContainerLootComponent = net.minecraft.class_9297
/**
 * net.minecraft.class_6193
 */
typealias PlayerActivities = net.minecraft.class_6193
/**
 * net.minecraft.class_2403
 */
typealias DataGenerator = net.minecraft.class_2403
/**
 * net.minecraft.class_6018
 */
typealias IntProviderType<P> = net.minecraft.class_6018<P>
/**
 * net.minecraft.class_5210
 */
typealias MegaPineFoliagePlacer = net.minecraft.class_5210
/**
 * net.minecraft.class_872
 */
typealias WaterDebugRenderer = net.minecraft.class_872
/**
 * net.minecraft.class_3870
 */
typealias TaigaVillageData = net.minecraft.class_3870
/**
 * net.minecraft.class_2522
 */
typealias StringNbtReader = net.minecraft.class_2522
/**
 * net.minecraft.class_5437
 */
typealias ReplaceBlobsFeatureConfig = net.minecraft.class_5437
/**
 * net.minecraft.class_2651
 */
typealias ScreenHandlerPropertyUpdateS2CPacket = net.minecraft.class_2651
/**
 * net.minecraft.class_988
 */
typealias LlamaDecorFeatureRenderer = net.minecraft.class_988
/**
 * net.minecraft.class_7505
 */
typealias ItemNbtFix = net.minecraft.class_7505
/**
 * net.minecraft.class_878
 */
typealias BlazeEntityRenderer = net.minecraft.class_878
/**
 * net.minecraft.class_6731
 */
typealias NoiseParametersKeys = net.minecraft.class_6731
/**
 * net.minecraft.class_5619
 */
typealias EntityRenderers = net.minecraft.class_5619
/**
 * net.minecraft.class_7290
 */
typealias ShriekParticleEffect = net.minecraft.class_7290
/**
 * com.mojang.datafixers.util.Either
 */
typealias Either<L, R> = com.mojang.datafixers.util.Either<L, R>
/**
 * com.mojang.brigadier.exceptions.CommandExceptionType
 */
typealias CommandExceptionType = com.mojang.brigadier.exceptions.CommandExceptionType
/**
 * net.minecraft.class_8013
 */
typealias RotationCalculator = net.minecraft.class_8013
/**
 * net.minecraft.class_3582
 */
typealias ChunkPalettedStorageFix = net.minecraft.class_3582
/**
 * net.minecraft.class_9039
 */
typealias PackStateChangeCallback = net.minecraft.class_9039
/**
 * net.minecraft.class_1384
 */
typealias AvoidSunlightGoal = net.minecraft.class_1384
/**
 * net.minecraft.class_3759
 */
typealias MoveToRaidCenterGoal<T> = net.minecraft.class_3759<T>
/**
 * net.minecraft.class_3962
 */
typealias ComposterBlock = net.minecraft.class_3962
/**
 * net.minecraft.class_3600
 */
typealias EntityHealthFix = net.minecraft.class_3600
/**
 * net.minecraft.class_290
 */
typealias VertexFormats = net.minecraft.class_290
/**
 * net.minecraft.class_1950
 */
typealias ChunkCache = net.minecraft.class_1950
/**
 * net.minecraft.class_9099
 */
typealias LoginStates = net.minecraft.class_9099
/**
 * java.lang.Thread
 */
typealias Thread = java.lang.Thread
/**
 * net.minecraft.class_3942
 */
typealias LecternBlockEntityRenderer = net.minecraft.class_3942
/**
 * com.google.gson.JsonElement
 */
typealias JsonElement = com.google.gson.JsonElement
/**
 * net.minecraft.class_4974
 */
typealias ReversePortalParticle = net.minecraft.class_4974
/**
 * net.minecraft.class_4916
 */
typealias ModelProvider = net.minecraft.class_4916
/**
 * net.minecraft.class_4423
 */
typealias RealmsSlotOptionsScreen = net.minecraft.class_4423
/**
 * net.minecraft.class_1794
 */
typealias HoeItem = net.minecraft.class_1794
/**
 * net.minecraft.class_4970
 */
typealias AbstractBlock = net.minecraft.class_4970
/**
 * net.minecraft.class_2589
 */
typealias BrewingStandBlockEntity = net.minecraft.class_2589
/**
 * net.minecraft.class_518
 */
typealias RecipeBookProvider = net.minecraft.class_518
/**
 * net.minecraft.class_4614
 */
typealias NbtType<T> = net.minecraft.class_4614<T>
/**
 * net.minecraft.class_7726
 */
typealias WorldGenSettings = net.minecraft.class_7726
/**
 * net.minecraft.class_3197
 */
typealias SwampHutStructure = net.minecraft.class_3197
/**
 * net.minecraft.class_6728
 */
typealias ClampedNormalIntProvider = net.minecraft.class_6728
/**
 * net.minecraft.class_2709
 */
typealias PositionFlag = net.minecraft.class_2709
/**
 * java.util.stream.Stream
 */
typealias Stream<T> = java.util.stream.Stream<T>
/**
 * net.minecraft.class_2834
 */
typealias ArrayPalette<T> = net.minecraft.class_2834<T>
/**
 * net.minecraft.class_4002
 */
typealias SpriteProvider = net.minecraft.class_4002
/**
 * net.minecraft.class_2264
 */
typealias ColumnPosArgumentType = net.minecraft.class_2264
/**
 * net.minecraft.class_4848
 */
typealias CryingObsidianBlock = net.minecraft.class_4848
/**
 * net.minecraft.class_4993
 */
typealias LinearPosRuleTest = net.minecraft.class_4993
/**
 * net.minecraft.class_2498
 */
typealias BlockSoundGroup = net.minecraft.class_2498
/**
 * net.minecraft.class_4358
 */
typealias LongRunningTask = net.minecraft.class_4358
/**
 * net.minecraft.class_1520
 */
typealias SittingAttackingPhase = net.minecraft.class_1520
/**
 * net.minecraft.class_5434
 */
typealias JigsawStructure = net.minecraft.class_5434
/**
 * net.minecraft.class_7058
 */
typealias StructureKeys = net.minecraft.class_7058
/**
 * net.minecraft.class_8675
 */
typealias ClientConnectionState = net.minecraft.class_8675
/**
 * net.minecraft.class_5132
 */
typealias DefaultAttributeContainer = net.minecraft.class_5132
/**
 * net.minecraft.class_1787
 */
typealias FishingRodItem = net.minecraft.class_1787
/**
 * net.minecraft.class_9315
 */
typealias PathNodeTypeCache = net.minecraft.class_9315
/**
 * net.minecraft.class_2290
 */
typealias ItemStackArgument = net.minecraft.class_2290
/**
 * net.minecraft.class_6067
 */
typealias InventoryOwner = net.minecraft.class_6067
/**
 * net.minecraft.class_2202
 */
typealias BambooShootBlock = net.minecraft.class_2202
/**
 * net.minecraft.class_2977
 */
typealias CoralMushroomFeature = net.minecraft.class_2977
/**
 * net.minecraft.class_1922
 */
typealias BlockView = net.minecraft.class_1922
/**
 * net.minecraft.class_7898
 */
typealias TaskTriggerer<E, M> = net.minecraft.class_7898<E, M>
/**
 * net.minecraft.class_8641
 */
typealias Macro<T> = net.minecraft.class_8641<T>
/**
 * net.minecraft.class_895
 */
typealias EnderDragonEntityRenderer = net.minecraft.class_895
/**
 * net.minecraft.class_1309
 */
typealias LivingEntity = net.minecraft.class_1309
/**
 * net.minecraft.class_9006
 */
typealias ScoreboardScoreResetS2CPacket = net.minecraft.class_9006
/**
 * net.minecraft.class_5664
 */
typealias ContextLootScoreProvider = net.minecraft.class_5664
/**
 * net.minecraft.class_4210
 */
typealias UpdateDifficultyC2SPacket = net.minecraft.class_4210
/**
 * net.minecraft.class_5129
 */
typealias RenameEntityAttributesFix = net.minecraft.class_5129
/**
 * net.minecraft.class_1047
 */
typealias MissingSprite = net.minecraft.class_1047
/**
 * net.minecraft.class_2802
 */
typealias ChunkManager = net.minecraft.class_2802
/**
 * net.minecraft.class_9428
 */
typealias MapDecorationType = net.minecraft.class_9428
/**
 * net.minecraft.class_5934
 */
typealias SurfaceWaterDepthFilterPlacementModifier = net.minecraft.class_5934
/**
 * net.minecraft.class_3158
 */
typealias WorldBorderCommand = net.minecraft.class_3158
/**
 * net.minecraft.class_7876
 */
typealias RegistryEntryOwner<T> = net.minecraft.class_7876<T>
/**
 * net.minecraft.class_3888
 */
typealias VillagerResourceMetadata = net.minecraft.class_3888
/**
 * net.minecraft.class_1849
 */
typealias ArmorDyeRecipe = net.minecraft.class_1849
/**
 * net.minecraft.class_2648
 */
typealias OpenHorseScreenS2CPacket = net.minecraft.class_2648
/**
 * net.minecraft.class_9820
 */
typealias ChunkErrorHandler = net.minecraft.class_9820
/**
 * net.minecraft.class_993
 */
typealias PhantomEyesFeatureRenderer<T> = net.minecraft.class_993<T>
/**
 * net.minecraft.class_1267
 */
typealias Difficulty = net.minecraft.class_1267
/**
 * net.minecraft.class_598
 */
typealias SheepWoolEntityModel<T> = net.minecraft.class_598<T>
/**
 * net.minecraft.class_671
 */
typealias RedDustParticle = net.minecraft.class_671
/**
 * net.minecraft.class_1000
 */
typealias SpiderEyesFeatureRenderer<T, M> = net.minecraft.class_1000<T, M>
/**
 * net.minecraft.class_4871
 */
typealias PendingInvite = net.minecraft.class_4871
/**
 * net.minecraft.class_1081
 */
typealias AnimationResourceMetadataReader = net.minecraft.class_1081
/**
 * net.minecraft.class_479
 */
typealias CraftingScreen = net.minecraft.class_479
/**
 * net.minecraft.class_2333
 */
typealias EndPortalFrameBlock = net.minecraft.class_2333
/**
 * net.minecraft.class_7911
 */
typealias TaskRunnable<E> = net.minecraft.class_7911<E>
/**
 * net.minecraft.class_3981
 */
typealias StonecuttingRecipeJsonBuilder = net.minecraft.class_3981
/**
 * net.minecraft.class_2846
 */
typealias PlayerActionC2SPacket = net.minecraft.class_2846
/**
 * net.minecraft.class_4838
 */
typealias PiglinBrain = net.minecraft.class_4838
/**
 * net.minecraft.class_6815
 */
typealias NetherPlacedFeatures = net.minecraft.class_6815
/**
 * net.minecraft.class_6053
 */
typealias GoatEntity = net.minecraft.class_6053
/**
 * net.minecraft.class_536
 */
typealias SpectatorMenuCloseCallback = net.minecraft.class_536
/**
 * net.minecraft.class_854
 */
typealias ChunkOcclusionData = net.minecraft.class_854
/**
 * net.minecraft.class_9762
 */
typealias BoundedRegionArray<T> = net.minecraft.class_9762<T>
/**
 * net.minecraft.class_6803
 */
typealias ConfiguredFeatures = net.minecraft.class_6803
/**
 * net.minecraft.class_868
 */
typealias PathfindingDebugRenderer = net.minecraft.class_868
/**
 * net.minecraft.class_1536
 */
typealias FishingBobberEntity = net.minecraft.class_1536
/**
 * net.minecraft.class_6504
 */
typealias Schema2831 = net.minecraft.class_6504
/**
 * net.minecraft.class_6640
 */
typealias Schema2832 = net.minecraft.class_6640
/**
 * net.minecraft.class_1121
 */
typealias IdentifierSearchProvider<T> = net.minecraft.class_1121<T>
/**
 * net.minecraft.class_3037
 */
typealias FeatureConfig = net.minecraft.class_3037
/**
 * net.minecraft.class_141
 */
typealias SetCountLootFunction = net.minecraft.class_141
/**
 * net.minecraft.class_1613
 */
typealias SkeletonEntity = net.minecraft.class_1613
/**
 * net.minecraft.class_1243
 */
typealias Schema1510 = net.minecraft.class_1243
/**
 * net.minecraft.class_6743
 */
typealias Schema2842 = net.minecraft.class_6743
/**
 * net.minecraft.class_8591
 */
typealias AcknowledgeReconfigurationC2SPacket = net.minecraft.class_8591
/**
 * net.minecraft.class_9296
 */
typealias ProfileComponent = net.minecraft.class_9296
/**
 * net.minecraft.class_2401
 */
typealias LeverBlock = net.minecraft.class_2401
/**
 * net.minecraft.class_8796
 */
typealias StructureUpdateEntrypoint = net.minecraft.class_8796
/**
 * net.minecraft.class_8890
 */
typealias StructurePoolAliasBindings = net.minecraft.class_8890
/**
 * net.minecraft.class_2546
 */
typealias WallBannerBlock = net.minecraft.class_2546
/**
 * net.minecraft.class_2346
 */
typealias FallingBlock = net.minecraft.class_2346
/**
 * net.minecraft.class_67
 */
typealias DynamicEntry = net.minecraft.class_67
/**
 * net.minecraft.class_182
 */
typealias TableBonusLootCondition = net.minecraft.class_182
/**
 * net.minecraft.class_7186
 */
typealias Keyframe = net.minecraft.class_7186
/**
 * net.minecraft.class_920
 */
typealias LeashKnotEntityRenderer = net.minecraft.class_920
/**
 * net.minecraft.class_6532
 */
typealias ServerTickTimeSample = net.minecraft.class_6532
/**
 * net.minecraft.class_5674
 */
typealias ResettingWorldTemplateTask = net.minecraft.class_5674
/**
 * net.minecraft.class_929
 */
typealias CatEntityRenderer = net.minecraft.class_929
/**
 * net.minecraft.class_1389
 */
typealias CreeperIgniteGoal = net.minecraft.class_1389
/**
 * net.minecraft.class_9214
 */
typealias VaultBlockEntityRenderer = net.minecraft.class_9214
/**
 * net.minecraft.class_560
 */
typealias CowEntityModel<T> = net.minecraft.class_560<T>
/**
 * net.minecraft.class_5954
 */
typealias RootedDirtBlock = net.minecraft.class_5954
/**
 * net.minecraft.class_6101
 */
typealias YLevels = net.minecraft.class_6101
/**
 * net.minecraft.class_9768
 */
typealias ChunkGenerationSteps = net.minecraft.class_9768
/**
 * net.minecraft.class_579
 */
typealias LeashKnotEntityModel<T> = net.minecraft.class_579<T>
/**
 * net.minecraft.class_6632
 */
typealias ChaseServer = net.minecraft.class_6632
/**
 * com.mojang.brigadier.context.ContextChain
 */
typealias ContextChain<S> = com.mojang.brigadier.context.ContextChain<S>
/**
 * net.minecraft.class_6523
 */
typealias FileIoSample = net.minecraft.class_6523
/**
 * net.minecraft.class_4246
 */
typealias HideInHomeTask = net.minecraft.class_4246
/**
 * net.minecraft.class_4787
 */
typealias NetherFossilGenerator = net.minecraft.class_4787
/**
 * java.lang.IllegalStateException
 */
typealias IllegalStateException = java.lang.IllegalStateException
/**
 * net.minecraft.class_9747
 */
typealias EnchantmentProviders = net.minecraft.class_9747
/**
 * net.minecraft.class_3029
 */
typealias EndGatewayFeature = net.minecraft.class_3029
/**
 * net.minecraft.class_5131
 */
typealias AttributeContainer = net.minecraft.class_5131
/**
 * net.minecraft.class_5584
 */
typealias EntityTrackingStatus = net.minecraft.class_5584
/**
 * net.minecraft.class_8185
 */
typealias SnifferEntityModel<T> = net.minecraft.class_8185<T>
/**
 * net.minecraft.class_417
 */
typealias DemoScreen = net.minecraft.class_417
/**
 * net.minecraft.class_1657
 */
typealias PlayerEntity = net.minecraft.class_1657
/**
 * net.minecraft.class_3795
 */
typealias GravityStructureProcessor = net.minecraft.class_3795
/**
 * net.minecraft.class_466
 */
typealias BeaconScreen = net.minecraft.class_466
/**
 * net.minecraft.class_1339
 */
typealias BreakDoorGoal = net.minecraft.class_1339
/**
 * net.minecraft.class_9729
 */
typealias ReplaceBlockEnchantmentEffect = net.minecraft.class_9729
/**
 * net.minecraft.class_9744
 */
typealias ByCostWithDifficultyEnchantmentProvider = net.minecraft.class_9744
/**
 * net.minecraft.class_1108
 */
typealias MovingMinecartSoundInstance = net.minecraft.class_1108
/**
 * net.minecraft.class_7800
 */
typealias RecipeCategory = net.minecraft.class_7800
/**
 * net.minecraft.class_882
 */
typealias ChickenEntityRenderer = net.minecraft.class_882
/**
 * net.minecraft.class_763
 */
typealias ItemModels = net.minecraft.class_763
/**
 * net.minecraft.class_489
 */
typealias AbstractFurnaceScreen<T> = net.minecraft.class_489<T>
/**
 * net.minecraft.class_8819
 */
typealias WorldLoadingState = net.minecraft.class_8819
/**
 * net.minecraft.class_1004
 */
typealias WitherArmorFeatureRenderer = net.minecraft.class_1004
/**
 * net.minecraft.class_5770
 */
typealias PlayDeadTimerTask = net.minecraft.class_5770
/**
 * net.minecraft.class_2530
 */
typealias TntBlock = net.minecraft.class_2530
/**
 * net.minecraft.class_3390
 */
typealias NetherFortressGenerator = net.minecraft.class_3390
/**
 * net.minecraft.class_9125
 */
typealias TestFunctionFinder = net.minecraft.class_9125
/**
 * net.minecraft.class_1427
 */
typealias GolemEntity = net.minecraft.class_1427
/**
 * net.minecraft.class_8190
 */
typealias SnifferEntityRenderer = net.minecraft.class_8190
/**
 * net.minecraft.class_4744
 */
typealias AdvancementRenameFix = net.minecraft.class_4744
/**
 * net.minecraft.class_8605
 */
typealias ServerPlayerConfigurationTask = net.minecraft.class_8605
/**
 * net.minecraft.class_2224
 */
typealias NumberRangeArgumentType<T> = net.minecraft.class_2224<T>
/**
 * net.minecraft.class_4189
 */
typealias AccessibilityOptionsScreen = net.minecraft.class_4189
/**
 * net.minecraft.class_572
 */
typealias BipedEntityModel<T> = net.minecraft.class_572<T>
/**
 * net.minecraft.class_3605
 */
typealias EntityMinecartIdentifiersFix = net.minecraft.class_3605
/**
 * net.minecraft.class_3248
 */
typealias ServerLoginNetworkHandler = net.minecraft.class_3248
/**
 * net.minecraft.class_1604
 */
typealias PillagerEntity = net.minecraft.class_1604
/**
 * net.minecraft.class_5793
 */
typealias BlockFamilies = net.minecraft.class_5793
/**
 * net.minecraft.class_5809
 */
typealias SporeBlossomBlock = net.minecraft.class_5809
/**
 * net.minecraft.class_173
 */
typealias LootContextTypes = net.minecraft.class_173
/**
 * net.minecraft.class_6647
 */
typealias BlockPredicateType<P> = net.minecraft.class_6647<P>
/**
 * net.minecraft.class_1355
 */
typealias GoalSelector = net.minecraft.class_1355
/**
 * net.minecraft.class_1280
 */
typealias DamageUtil = net.minecraft.class_1280
/**
 * net.minecraft.class_3075
 */
typealias KillCommand = net.minecraft.class_3075
/**
 * net.minecraft.class_342
 */
typealias TextFieldWidget = net.minecraft.class_342
/**
 * net.minecraft.class_5746
 */
typealias VanillaGameEventTagProvider = net.minecraft.class_5746
/**
 * net.minecraft.class_2377
 */
typealias HopperBlock = net.minecraft.class_2377
/**
 * net.minecraft.class_7368
 */
typealias ResourceMetadata = net.minecraft.class_7368
/**
 * net.minecraft.class_9408
 */
typealias ArgumentParser<T> = net.minecraft.class_9408<T>
/**
 * net.minecraft.class_1530
 */
typealias AbstractDecorationEntity = net.minecraft.class_1530
/**
 * net.minecraft.class_9684
 */
typealias CodecCache = net.minecraft.class_9684
/**
 * net.minecraft.class_6670
 */
typealias LivingTargetCache = net.minecraft.class_6670
/**
 * net.minecraft.class_8927
 */
typealias OxidizableTrapdoorBlock = net.minecraft.class_8927
/**
 * net.minecraft.class_7373
 */
typealias FloatSupplier = net.minecraft.class_7373
/**
 * net.minecraft.class_280
 */
typealias JsonEffectShaderProgram = net.minecraft.class_280
/**
 * net.minecraft.class_6400
 */
typealias SamplerSource = net.minecraft.class_6400
/**
 * net.minecraft.class_4604
 */
typealias Frustum = net.minecraft.class_4604
/**
 * net.minecraft.class_1668
 */
typealias ExplosiveProjectileEntity = net.minecraft.class_1668
/**
 * net.minecraft.class_2203
 */
typealias NbtPathArgumentType = net.minecraft.class_2203
/**
 * net.minecraft.class_8150
 */
typealias InteractionEntity = net.minecraft.class_8150
/**
 * net.minecraft.class_4307
 */
typealias GolemLastSeenSensor = net.minecraft.class_4307
/**
 * net.minecraft.class_291
 */
typealias VertexBuffer = net.minecraft.class_291
/**
 * net.minecraft.class_1456
 */
typealias PolarBearEntity = net.minecraft.class_1456
/**
 * net.minecraft.class_7528
 */
typealias ScrollableWidget = net.minecraft.class_7528
/**
 * net.minecraft.class_8186
 */
typealias BanReason = net.minecraft.class_8186
/**
 * net.minecraft.class_9230
 */
typealias BlockPosFormatFix = net.minecraft.class_9230
/**
 * net.minecraft.class_326
 */
typealias ItemColorProvider = net.minecraft.class_326
/**
 * net.minecraft.class_7434
 */
typealias ProfileKeysImpl = net.minecraft.class_7434
/**
 * net.minecraft.class_3448
 */
typealias StatType<T> = net.minecraft.class_3448<T>
/**
 * net.minecraft.class_2791
 */
typealias Chunk = net.minecraft.class_2791
/**
 * java.util.function.LongPredicate
 */
typealias LongPredicate = java.util.function.LongPredicate
/**
 * net.minecraft.class_4706
 */
typealias SortedArraySet<T> = net.minecraft.class_4706<T>
/**
 * net.minecraft.class_947
 */
typealias SpectralArrowEntityRenderer = net.minecraft.class_947
/**
 * net.minecraft.class_4582
 */
typealias SkinOverlayOwner = net.minecraft.class_4582
/**
 * net.minecraft.class_4881
 */
typealias RealmsServerPlayerList = net.minecraft.class_4881
/**
 * net.minecraft.class_1669
 */
typealias EvokerFangsEntity = net.minecraft.class_1669
/**
 * net.minecraft.class_3610
 */
typealias FluidState = net.minecraft.class_3610
/**
 * net.minecraft.class_4815
 */
typealias WalkToNearestVisibleWantedItemTask = net.minecraft.class_4815
/**
 * net.minecraft.class_7578
 */
typealias RealmsPeriodicCheckers = net.minecraft.class_7578
/**
 * net.minecraft.class_3219
 */
typealias VinesFeature = net.minecraft.class_3219
/**
 * net.minecraft.class_514
 */
typealias AnimatedResultButton = net.minecraft.class_514
/**
 * net.minecraft.class_5812
 */
typealias OxidizableBlock = net.minecraft.class_5812
/**
 * net.minecraft.class_8855
 */
typealias ExecutionControl<T> = net.minecraft.class_8855<T>
/**
 * net.minecraft.class_8710
 */
typealias CustomPayload = net.minecraft.class_8710
/**
 * net.minecraft.class_7743
 */
typealias AbstractSignEditScreen = net.minecraft.class_7743
/**
 * net.minecraft.class_4946
 */
typealias TexturedModel = net.minecraft.class_4946
/**
 * net.minecraft.class_2244
 */
typealias BedBlock = net.minecraft.class_2244
/**
 * net.minecraft.class_1390
 */
typealias StopFollowingCustomerGoal = net.minecraft.class_1390
/**
 * net.minecraft.class_948
 */
typealias SnowGolemEntityRenderer = net.minecraft.class_948
/**
 * net.minecraft.class_7251
 */
typealias SniffTask<E> = net.minecraft.class_7251<E>
/**
 * net.minecraft.class_4065
 */
typealias NarratorMode = net.minecraft.class_4065
/**
 * net.minecraft.class_9730
 */
typealias ReplaceDiskEnchantmentEffect = net.minecraft.class_9730
/**
 * net.minecraft.class_6577
 */
typealias DiskFeatureConfig = net.minecraft.class_6577
/**
 * net.minecraft.class_3784
 */
typealias StructurePoolElement = net.minecraft.class_3784
/**
 * net.minecraft.class_227
 */
typealias WeatherCheckLootCondition = net.minecraft.class_227
/**
 * net.minecraft.class_5660
 */
typealias ScoreLootNumberProvider = net.minecraft.class_5660
/**
 * net.minecraft.class_8245
 */
typealias AppendStaticRuleBlockEntityModifier = net.minecraft.class_8245
/**
 * net.minecraft.class_4888
 */
typealias UploadInfo = net.minecraft.class_4888
/**
 * net.minecraft.class_6030
 */
typealias LongJumpTask<E> = net.minecraft.class_6030<E>
/**
 * net.minecraft.class_8768
 */
typealias ReportScreen<B> = net.minecraft.class_8768<B>
/**
 * javax.crypto.SecretKey
 */
typealias SecretKey = javax.crypto.SecretKey
/**
 * net.minecraft.class_7312
 */
typealias AncientCityGenerator = net.minecraft.class_7312
/**
 * net.minecraft.class_9147
 */
typealias NetworkStateBuilder<T, B> = net.minecraft.class_9147<T, B>
/**
 * net.minecraft.class_365
 */
typealias SpectatorHud = net.minecraft.class_365
/**
 * net.minecraft.class_345
 */
typealias ClientBossBar = net.minecraft.class_345
/**
 * org.lwjgl.glfw.GLFWErrorCallbackI
 */
typealias GLFWErrorCallbackI = org.lwjgl.glfw.GLFWErrorCallbackI
/**
 * net.minecraft.class_7110
 */
typealias TadpoleEntity = net.minecraft.class_7110
/**
 * net.minecraft.class_3607
 */
typealias EntityPaintingMotiveFix = net.minecraft.class_3607
/**
 * net.minecraft.class_3562
 */
typealias ChunkLightingView = net.minecraft.class_3562
/**
 * net.minecraft.class_1833
 */
typealias TippedArrowItem = net.minecraft.class_1833
/**
 * net.minecraft.class_1383
 */
typealias CrossbowAttackGoal<T> = net.minecraft.class_1383<T>
/**
 * net.minecraft.class_4803
 */
typealias MemoryExpiryDataFix = net.minecraft.class_4803
/**
 * net.minecraft.class_2746
 */
typealias BooleanProperty = net.minecraft.class_2746
/**
 * net.minecraft.class_9767
 */
typealias GenerationDependencies = net.minecraft.class_9767
/**
 * net.minecraft.class_8016
 */
typealias GuiNavigationPath = net.minecraft.class_8016
/**
 * net.minecraft.class_1329
 */
typealias ClampedEntityAttribute = net.minecraft.class_1329
/**
 * net.minecraft.class_8881
 */
typealias CrafterScreenHandler = net.minecraft.class_8881
/**
 * net.minecraft.class_2578
 */
typealias ScoreTextContent = net.minecraft.class_2578
/**
 * net.minecraft.class_7132
 */
typealias SculkCatalystBlockEntity = net.minecraft.class_7132
/**
 * net.minecraft.class_5258
 */
typealias LootContextPredicate = net.minecraft.class_5258
/**
 * net.minecraft.class_3824
 */
typealias RandomBlockMatchRuleTest = net.minecraft.class_3824
/**
 * net.minecraft.class_5864
 */
typealias FloatProviderType<P> = net.minecraft.class_5864<P>
/**
 * net.minecraft.class_5211
 */
typealias DarkOakTrunkPlacer = net.minecraft.class_5211
/**
 * net.minecraft.class_5578
 */
typealias SimpleEntityLookup<T> = net.minecraft.class_5578<T>
/**
 * com.mojang.datafixers.schemas.Schema
 */
typealias Schema = com.mojang.datafixers.schemas.Schema
/**
 * net.minecraft.class_1850
 */
typealias BookCloningRecipe = net.minecraft.class_1850
/**
 * net.minecraft.class_9187
 */
typealias ArrayDebugSampleLog = net.minecraft.class_9187
/**
 * net.minecraft.class_2062
 */
typealias ImpossibleCriterion = net.minecraft.class_2062
/**
 * net.minecraft.class_972
 */
typealias CapeFeatureRenderer = net.minecraft.class_972
/**
 * net.minecraft.class_8671
 */
typealias ReconfiguringScreen = net.minecraft.class_8671
/**
 * net.minecraft.class_2349
 */
typealias FenceGateBlock = net.minecraft.class_2349
/**
 * net.minecraft.class_8505
 */
typealias RenameChunkStatusFix = net.minecraft.class_8505
/**
 * net.minecraft.class_748
 */
typealias HotbarStorageEntry = net.minecraft.class_748
/**
 * net.minecraft.class_3201
 */
typealias DemoServerPlayerInteractionManager = net.minecraft.class_3201
/**
 * net.minecraft.class_997
 */
typealias SlimeOverlayFeatureRenderer<T> = net.minecraft.class_997<T>
/**
 * net.minecraft.class_5756
 */
typealias SeekWaterTask = net.minecraft.class_5756
/**
 * org.lwjgl.glfw.GLFWDropCallbackI
 */
typealias GLFWDropCallbackI = org.lwjgl.glfw.GLFWDropCallbackI
/**
 * java.io.DataInput
 */
typealias DataInput = java.io.DataInput
/**
 * net.minecraft.class_700
 */
typealias ElderGuardianAppearanceParticle = net.minecraft.class_700
/**
 * net.minecraft.class_6557
 */
typealias BlockColumn = net.minecraft.class_6557
/**
 * net.minecraft.class_1076
 */
typealias LanguageManager = net.minecraft.class_1076
/**
 * net.minecraft.class_7917
 */
typealias SuspiciousStewIngredient = net.minecraft.class_7917
/**
 * net.minecraft.class_9655
 */
typealias BundleContentsPredicate = net.minecraft.class_9655
/**
 * net.minecraft.class_1350
 */
typealias FollowOwnerGoal = net.minecraft.class_1350
/**
 * net.minecraft.class_3027
 */
typealias DatapackCommand = net.minecraft.class_3027
/**
 * java.time.format.DateTimeFormatter
 */
typealias DateTimeFormatter = java.time.format.DateTimeFormatter
/**
 * net.minecraft.class_1655
 */
typealias Npc = net.minecraft.class_1655
/**
 * net.minecraft.class_1126
 */
typealias TextSearchProvider<T> = net.minecraft.class_1126<T>
/**
 * net.minecraft.class_5562
 */
typealias BlockEntityTickInvoker = net.minecraft.class_5562
/**
 * net.minecraft.class_768
 */
typealias Rect2i = net.minecraft.class_768
/**
 * java.net.HttpURLConnection
 */
typealias HttpURLConnection = java.net.HttpURLConnection
/**
 * net.minecraft.class_580
 */
typealias MinecartEntityModel<T> = net.minecraft.class_580<T>
/**
 * net.minecraft.class_1576
 */
typealias HuskEntity = net.minecraft.class_1576
/**
 * net.minecraft.class_7473
 */
typealias PointOfInterestTypeTags = net.minecraft.class_7473
/**
 * net.minecraft.class_7785
 */
typealias AdvancementTabGenerator = net.minecraft.class_7785
/**
 * net.minecraft.class_985
 */
typealias EndermanEyesFeatureRenderer<T> = net.minecraft.class_985<T>
/**
 * net.minecraft.class_2863
 */
typealias SelectMerchantTradeC2SPacket = net.minecraft.class_2863
/**
 * net.minecraft.class_601
 */
typealias SheepEntityModel<T> = net.minecraft.class_601<T>
/**
 * net.minecraft.class_5151
 */
typealias Equipment = net.minecraft.class_5151
/**
 * net.minecraft.class_5455
 */
typealias DynamicRegistryManager = net.minecraft.class_5455
/**
 * net.minecraft.class_7541
 */
typealias MessagesListAdder = net.minecraft.class_7541
/**
 * java.util.stream.IntStream
 */
typealias IntStream = java.util.stream.IntStream
/**
 * net.minecraft.class_7644
 */
typealias SignedArgumentList<S> = net.minecraft.class_7644<S>
/**
 * net.minecraft.class_1771
 */
typealias EggItem = net.minecraft.class_1771
/**
 * net.minecraft.class_1163
 */
typealias BiomeColors = net.minecraft.class_1163
/**
 * net.minecraft.class_6394
 */
typealias BlockListChecker = net.minecraft.class_6394
/**
 * net.minecraft.class_7597
 */
typealias ChatSuggestionsS2CPacket = net.minecraft.class_7597
/**
 * net.minecraft.class_1352
 */
typealias Goal = net.minecraft.class_1352
/**
 * net.minecraft.class_5611
 */
typealias Vector2f = net.minecraft.class_5611
/**
 * net.minecraft.class_6799
 */
typealias RarityFilterPlacementModifier = net.minecraft.class_6799
/**
 * net.minecraft.class_9437
 */
typealias PackratParsing = net.minecraft.class_9437
/**
 * net.minecraft.class_9376
 */
typealias SetFireworksLootFunction = net.minecraft.class_9376
/**
 * net.minecraft.class_4887
 */
typealias Subscription = net.minecraft.class_4887
/**
 * net.minecraft.class_3684
 */
typealias CatCollarFeatureRenderer = net.minecraft.class_3684
/**
 * net.minecraft.class_884
 */
typealias CowEntityRenderer = net.minecraft.class_884
/**
 * net.minecraft.class_3557
 */
typealias BedBlockEntityFix = net.minecraft.class_3557
/**
 * net.minecraft.class_7249
 */
typealias DigTask<E> = net.minecraft.class_7249<E>
/**
 * net.minecraft.class_8708
 */
typealias DebugBrainCustomPayload = net.minecraft.class_8708
/**
 * net.minecraft.class_4079
 */
typealias SectionDistanceLevelPropagator = net.minecraft.class_4079
/**
 * net.minecraft.class_905
 */
typealias GhastEntityRenderer = net.minecraft.class_905
/**
 * org.joml.Vector3f
 */
typealias Vector3f = org.joml.Vector3f
/**
 * net.minecraft.class_4429
 */
typealias UploadResult = net.minecraft.class_4429
/**
 * net.minecraft.class_4344
 */
typealias RealmsClientConfig = net.minecraft.class_4344
/**
 * net.minecraft.class_6382
 */
typealias NarrationMessageBuilder = net.minecraft.class_6382
/**
 * net.minecraft.class_5600
 */
typealias EntityModels = net.minecraft.class_5600
/**
 * net.minecraft.class_9100
 */
typealias PingPackets = net.minecraft.class_9100
/**
 * net.minecraft.class_9643
 */
typealias CollectionCountsPredicate<T, P> = net.minecraft.class_9643<T, P>
/**
 * net.minecraft.class_4956
 */
typealias SoulParticle = net.minecraft.class_4956
/**
 * org.joml.Vector4f
 */
typealias Vector4f = org.joml.Vector4f
/**
 * net.minecraft.class_1569
 */
typealias Monster = net.minecraft.class_1569
/**
 * net.minecraft.class_750
 */
typealias BlockBufferAllocatorStorage = net.minecraft.class_750
/**
 * net.minecraft.class_525
 */
typealias CreateWorldScreen = net.minecraft.class_525
/**
 * net.minecraft.class_1786
 */
typealias FlintAndSteelItem = net.minecraft.class_1786
/**
 * net.minecraft.class_3880
 */
typealias BellBlockEntityRenderer = net.minecraft.class_3880
/**
 * net.minecraft.class_7520
 */
typealias GoatMissingStateFix = net.minecraft.class_7520
/**
 * net.minecraft.class_4249
 */
typealias HideWhenBellRingsTask = net.minecraft.class_4249
/**
 * net.minecraft.class_991
 */
typealias MooshroomMushroomFeatureRenderer<T> = net.minecraft.class_991<T>
/**
 * net.minecraft.class_302
 */
typealias HotbarStorage = net.minecraft.class_302
/**
 * com.google.gson.JsonArray
 */
typealias JsonArray = com.google.gson.JsonArray
/**
 * net.minecraft.class_7638
 */
typealias AcknowledgmentValidator = net.minecraft.class_7638
/**
 * net.minecraft.class_5493
 */
typealias NavigationConditions = net.minecraft.class_5493
/**
 * net.minecraft.class_962
 */
typealias VindicatorEntityRenderer = net.minecraft.class_962
/**
 * net.minecraft.class_6509
 */
typealias PacketEvent = net.minecraft.class_6509
/**
 * net.minecraft.class_1745
 */
typealias BannerPatternItem = net.minecraft.class_1745
/**
 * net.minecraft.class_8676
 */
typealias LegacyServerPinger = net.minecraft.class_8676
/**
 * net.minecraft.class_5309
 */
typealias GenerationShapeConfig = net.minecraft.class_5309
/**
 * net.minecraft.class_4432
 */
typealias RealmsPersistence = net.minecraft.class_4432
/**
 * net.minecraft.class_7557
 */
typealias ReceivedMessage = net.minecraft.class_7557
/**
 * net.minecraft.class_6856
 */
typealias ExclusiveNbtCollector = net.minecraft.class_6856
/**
 * net.minecraft.class_7817
 */
typealias AcknowledgedMessage = net.minecraft.class_7817
/**
 * net.minecraft.class_7957
 */
typealias UnstitchAtlasSource = net.minecraft.class_7957
/**
 * net.minecraft.class_6385
 */
typealias ScreenNarrator = net.minecraft.class_6385
/**
 * net.minecraft.class_1923
 */
typealias ChunkPos = net.minecraft.class_1923
/**
 * net.minecraft.class_3103
 */
typealias DungeonFeature = net.minecraft.class_3103
/**
 * net.minecraft.class_1802
 */
typealias Items = net.minecraft.class_1802
/**
 * net.minecraft.class_3003
 */
typealias NoiseThresholdCountPlacementModifier = net.minecraft.class_3003
/**
 * net.minecraft.class_5576
 */
typealias EntityHandler<T> = net.minecraft.class_5576<T>
/**
 * net.minecraft.class_8171
 */
typealias TorchflowerBlock = net.minecraft.class_8171
/**
 * net.minecraft.class_7918
 */
typealias GameModeArgumentType = net.minecraft.class_7918
/**
 * net.minecraft.class_4289
 */
typealias WanderIndoorsTask = net.minecraft.class_4289
/**
 * net.minecraft.class_2035
 */
typealias EnchantmentPredicate = net.minecraft.class_2035
/**
 * net.minecraft.class_9779
 */
typealias RenderTickCounter = net.minecraft.class_9779
/**
 * net.minecraft.class_5155
 */
typealias ReplaceBlobsFeature = net.minecraft.class_5155
/**
 * net.minecraft.class_7716
 */
typealias ChiseledBookshelfBlockEntity = net.minecraft.class_7716
/**
 * net.minecraft.class_32
 */
typealias LevelStorage = net.minecraft.class_32
/**
 * net.minecraft.class_559
 */
typealias DonkeyEntityModel<T> = net.minecraft.class_559<T>
/**
 * com.mojang.serialization.DynamicOps
 */
typealias DynamicOps<T> = com.mojang.serialization.DynamicOps<T>
/**
 * net.minecraft.class_6177
 */
typealias DeobfuscateClass = net.minecraft.class_6177
/**
 * net.minecraft.class_8209
 */
typealias TabButtonWidget = net.minecraft.class_8209
/**
 * net.minecraft.class_7046
 */
typealias StructuresToConfiguredStructuresFix = net.minecraft.class_7046
/**
 * net.minecraft.class_5179
 */
typealias BastionRemnantGenerator = net.minecraft.class_5179
/**
 * net.minecraft.class_5396
 */
typealias MissingDimensionFix = net.minecraft.class_5396
/**
 * net.minecraft.class_7118
 */
typealias LichenGrower = net.minecraft.class_7118
/**
 * net.minecraft.class_9282
 */
typealias DyedColorComponent = net.minecraft.class_9282
/**
 * net.minecraft.class_5398
 */
typealias UniversalAngerGoal<T> = net.minecraft.class_5398<T>
/**
 * net.minecraft.class_6370
 */
typealias AllowedAddressResolver = net.minecraft.class_6370
/**
 * net.minecraft.class_769
 */
typealias BuiltChunkStorage = net.minecraft.class_769
/**
 * net.minecraft.class_2564
 */
typealias Texts = net.minecraft.class_2564
/**
 * net.minecraft.class_2525
 */
typealias TallSeagrassBlock = net.minecraft.class_2525
/**
 * net.minecraft.class_623
 */
typealias ZombieEntityModel<T> = net.minecraft.class_623<T>
/**
 * net.minecraft.class_29
 */
typealias PlayerSaveHandler = net.minecraft.class_29
/**
 * net.minecraft.class_7268
 */
typealias SculkShriekerBlock = net.minecraft.class_7268
/**
 * net.minecraft.class_246
 */
typealias FractionalDoubleList = net.minecraft.class_246
/**
 * net.minecraft.class_766
 */
typealias RotatingCubeMapRenderer = net.minecraft.class_766
/**
 * net.minecraft.class_2344
 */
typealias FarmlandBlock = net.minecraft.class_2344
/**
 * net.minecraft.class_3359
 */
typealias RconBase = net.minecraft.class_3359
/**
 * net.minecraft.class_1676
 */
typealias ProjectileEntity = net.minecraft.class_1676
/**
 * net.minecraft.class_7485
 */
typealias EnumArgumentType<T> = net.minecraft.class_7485<T>
/**
 * net.minecraft.class_2975
 */
typealias ConfiguredFeature<FC, F> = net.minecraft.class_2975<FC, F>
/**
 * net.minecraft.class_7441
 */
typealias InstrumentTags = net.minecraft.class_7441
/**
 * net.minecraft.class_2775
 */
typealias ItemPickupAnimationS2CPacket = net.minecraft.class_2775
/**
 * java.lang.reflect.Method
 */
typealias Method = java.lang.reflect.Method
/**
 * net.minecraft.class_170
 */
typealias AdvancementRewards = net.minecraft.class_170
/**
 * net.minecraft.class_6120
 */
typealias BiasedToBottomHeightProvider = net.minecraft.class_6120
/**
 * net.minecraft.class_3537
 */
typealias OctavePerlinNoiseSampler = net.minecraft.class_3537
/**
 * java.net.InetAddress
 */
typealias InetAddress = java.net.InetAddress
/**
 * net.minecraft.class_2259
 */
typealias BlockArgumentParser = net.minecraft.class_2259
/**
 * net.minecraft.class_835
 */
typealias PistonBlockEntityRenderer = net.minecraft.class_835
/**
 * net.minecraft.class_6332
 */
typealias Schema2707 = net.minecraft.class_6332
/**
 * net.minecraft.class_7159
 */
typealias ChainRestrictedNeighborUpdater = net.minecraft.class_7159
/**
 * net.minecraft.class_6000
 */
typealias Schema2704 = net.minecraft.class_6000
/**
 * net.minecraft.class_6642
 */
typealias WeightedListIntProvider = net.minecraft.class_6642
/**
 * net.minecraft.class_1952
 */
typealias MobSpawnerEntry = net.minecraft.class_1952
/**
 * net.minecraft.class_5899
 */
typealias WorldBorderWarningBlocksChangedS2CPacket = net.minecraft.class_5899
/**
 * net.minecraft.class_1843
 */
typealias WrittenBookItem = net.minecraft.class_1843
/**
 * net.minecraft.class_4861
 */
typealias ForgingScreenHandler = net.minecraft.class_4861
/**
 * net.minecraft.class_959
 */
typealias TropicalFishEntityRenderer = net.minecraft.class_959
/**
 * net.minecraft.class_751
 */
typealias CubeMapRenderer = net.minecraft.class_751
/**
 * net.minecraft.class_880
 */
typealias CaveSpiderEntityRenderer = net.minecraft.class_880
/**
 * net.minecraft.class_7308
 */
typealias AllayEntityModel = net.minecraft.class_7308
/**
 * net.minecraft.class_4278
 */
typealias FillLayerFeature = net.minecraft.class_4278
/**
 * net.minecraft.class_2428
 */
typealias NoteBlock = net.minecraft.class_2428
/**
 * net.minecraft.class_9720
 */
typealias AttributeEnchantmentEffect = net.minecraft.class_9720
/**
 * net.minecraft.class_1935
 */
typealias ItemConvertible = net.minecraft.class_1935
/**
 * net.minecraft.class_9300
 */
typealias UnbreakableComponent = net.minecraft.class_9300
/**
 * net.minecraft.class_9696
 */
typealias SingleStackRecipeInput = net.minecraft.class_9696
/**
 * net.minecraft.class_8643
 */
typealias MacroException = net.minecraft.class_8643
/**
 * java.util.function.BiConsumer
 */
typealias BiConsumer<T, U> = java.util.function.BiConsumer<T, U>
/**
 * net.minecraft.class_93
 */
typealias GroupEntry = net.minecraft.class_93
/**
 * net.minecraft.class_7440
 */
typealias BannerPatternTags = net.minecraft.class_7440
/**
 * net.minecraft.class_4158
 */
typealias PointOfInterestType = net.minecraft.class_4158
/**
 * net.minecraft.class_2341
 */
typealias WallMountedBlock = net.minecraft.class_2341
/**
 * net.minecraft.class_3867
 */
typealias Attachment = net.minecraft.class_3867
/**
 * net.minecraft.class_7529
 */
typealias EditBoxWidget = net.minecraft.class_7529
/**
 * net.minecraft.class_31
 */
typealias LevelProperties = net.minecraft.class_31
/**
 * net.minecraft.class_3721
 */
typealias BellBlockEntity = net.minecraft.class_3721
/**
 * net.minecraft.class_4551
 */
typealias FluidPredicate = net.minecraft.class_4551
/**
 * net.minecraft.class_8055
 */
typealias ArmorTrimMaterials = net.minecraft.class_8055
/**
 * net.minecraft.class_1130
 */
typealias IntegratedPlayerManager = net.minecraft.class_1130
/**
 * net.minecraft.class_7445
 */
typealias Instruments = net.minecraft.class_7445
/**
 * net.minecraft.class_2605
 */
typealias EnchantingTableBlockEntity = net.minecraft.class_2605
/**
 * net.minecraft.class_1268
 */
typealias Hand = net.minecraft.class_1268
/**
 * net.minecraft.class_6007
 */
typealias Weight = net.minecraft.class_6007
/**
 * net.minecraft.class_8777
 */
typealias SkinAbuseReport = net.minecraft.class_8777
/**
 * net.minecraft.class_2387
 */
typealias JukeboxBlock = net.minecraft.class_2387
/**
 * net.minecraft.class_1645
 */
typealias SimpleMerchant = net.minecraft.class_1645
/**
 * net.minecraft.class_5807
 */
typealias MossBlock = net.minecraft.class_5807
/**
 * net.minecraft.class_9250
 */
typealias SelectKnownPacksS2CPacket = net.minecraft.class_9250
/**
 * net.minecraft.class_5873
 */
typealias CarverContext = net.minecraft.class_5873
/**
 * net.minecraft.class_8608
 */
typealias ChunkDataSender = net.minecraft.class_8608
/**
 * net.minecraft.class_8170
 */
typealias BrushableBlock = net.minecraft.class_8170
/**
 * net.minecraft.class_192
 */
typealias LootConditionConsumingBuilder<T> = net.minecraft.class_192<T>
/**
 * net.minecraft.class_6256
 */
typealias GoatEntityRenderer = net.minecraft.class_6256
/**
 * net.minecraft.class_1433
 */
typealias DolphinEntity = net.minecraft.class_1433
/**
 * net.minecraft.class_6360
 */
typealias ResourceReloadLogger = net.minecraft.class_6360
/**
 * net.minecraft.class_6860
 */
typealias LifecycledResourceManager = net.minecraft.class_6860
/**
 * net.minecraft.class_6178
 */
typealias ClientFieldsAreNonnullByDefault = net.minecraft.class_6178
/**
 * net.minecraft.class_9298
 */
typealias SuspiciousStewEffectsComponent = net.minecraft.class_9298
/**
 * net.minecraft.class_1769
 */
typealias DyeItem = net.minecraft.class_1769
/**
 * net.minecraft.class_3259
 */
typealias DirectoryResourcePack = net.minecraft.class_3259
/**
 * net.minecraft.class_9317
 */
typealias CopyComponentsLootFunction = net.minecraft.class_9317
/**
 * net.minecraft.class_7717
 */
typealias HangingSignBlockEntity = net.minecraft.class_7717
/**
 * net.minecraft.class_9110
 */
typealias TooltipState = net.minecraft.class_9110
/**
 * net.minecraft.class_9799
 */
typealias BufferAllocator = net.minecraft.class_9799
/**
 * net.minecraft.class_5947
 */
typealias StructureFeatureChildrenPoolElementFix = net.minecraft.class_5947
/**
 * net.minecraft.class_3033
 */
typealias EndPortalFeature = net.minecraft.class_3033
/**
 * net.minecraft.class_325
 */
typealias ItemColors = net.minecraft.class_325
/**
 * net.minecraft.class_3993
 */
typealias HoldInHandsGoal<T> = net.minecraft.class_3993<T>
/**
 * net.minecraft.class_934
 */
typealias PillagerEntityRenderer = net.minecraft.class_934
/**
 * net.minecraft.class_3337
 */
typealias Whitelist = net.minecraft.class_3337
/**
 * net.minecraft.class_4785
 */
typealias NetherFossilStructure = net.minecraft.class_4785
/**
 * net.minecraft.class_3748
 */
typealias JigsawBlock = net.minecraft.class_3748
/**
 * net.minecraft.class_4891
 */
typealias WorldTemplatePaginatedList = net.minecraft.class_4891
/**
 * com.mojang.authlib.yggdrasil.ServicesKeyType
 */
typealias ServicesKeyType = com.mojang.authlib.yggdrasil.ServicesKeyType
/**
 * net.minecraft.class_6583
 */
typealias BlockSource = net.minecraft.class_6583
/**
 * net.minecraft.class_137
 */
typealias SetAttributesLootFunction = net.minecraft.class_137
/**
 * net.minecraft.class_3736
 */
typealias ScaffoldingBlock = net.minecraft.class_3736
/**
 * net.minecraft.class_2528
 */
typealias PacketDecryptor = net.minecraft.class_2528
/**
 * net.minecraft.class_7125
 */
typealias SculkBlock = net.minecraft.class_7125
/**
 * net.minecraft.class_5682
 */
typealias BundleTooltipComponent = net.minecraft.class_5682
/**
 * net.minecraft.class_7659
 */
typealias ServerDynamicRegistryType = net.minecraft.class_7659
/**
 * net.minecraft.class_379
 */
typealias Glyph = net.minecraft.class_379
/**
 * net.minecraft.class_5633
 */
typealias FluidModificationItem = net.minecraft.class_5633
/**
 * net.minecraft.class_2870
 */
typealias UpdateCommandBlockC2SPacket = net.minecraft.class_2870
/**
 * net.minecraft.class_4826
 */
typealias HuntHoglinTask = net.minecraft.class_4826
/**
 * net.minecraft.class_2676
 */
typealias LightUpdateS2CPacket = net.minecraft.class_2676
/**
 * net.minecraft.class_5822
 */
typealias InterpolatedNoiseSampler = net.minecraft.class_5822
/**
 * net.minecraft.class_4851
 */
typealias TargetHitCriterion = net.minecraft.class_4851
/**
 * java.util.function.IntConsumer
 */
typealias IntConsumer = java.util.function.IntConsumer
/**
 * net.minecraft.class_1230
 */
typealias Schema1451 = net.minecraft.class_1230
/**
 * net.minecraft.class_8790
 */
typealias RecipeExporter = net.minecraft.class_8790
/**
 * net.minecraft.class_3226
 */
typealias RandomFeatureEntry = net.minecraft.class_3226
/**
 * net.minecraft.class_4541
 */
typealias BiomeFormatFix = net.minecraft.class_4541
/**
 * net.minecraft.class_20
 */
typealias MapDecoration = net.minecraft.class_20
/**
 * net.minecraft.class_6830
 */
typealias NbtScannable = net.minecraft.class_6830
/**
 * net.minecraft.class_8989
 */
typealias BreezeWindFeatureRenderer = net.minecraft.class_8989
/**
 * net.minecraft.class_6540
 */
typealias SpawnDensityCapper = net.minecraft.class_6540
/**
 * net.minecraft.class_4073
 */
typealias HorseArmorFeatureRenderer = net.minecraft.class_4073
/**
 * net.minecraft.class_1238
 */
typealias Schema1460 = net.minecraft.class_1238
/**
 * net.minecraft.class_2470
 */
typealias BlockRotation = net.minecraft.class_2470
/**
 * net.minecraft.class_1237
 */
typealias Schema1466 = net.minecraft.class_1237
/**
 * net.minecraft.class_5379
 */
typealias ForwardingDynamicOps<T> = net.minecraft.class_5379<T>
/**
 * net.minecraft.class_783
 */
typealias ModelElementFace = net.minecraft.class_783
/**
 * net.minecraft.class_4400
 */
typealias RealmsParentalConsentScreen = net.minecraft.class_4400
/**
 * net.minecraft.class_3174
 */
typealias DedicatedPlayerManager = net.minecraft.class_3174
/**
 * net.minecraft.class_1453
 */
typealias ParrotEntity = net.minecraft.class_1453
/**
 * net.minecraft.class_4051
 */
typealias TargetPredicate = net.minecraft.class_4051
/**
 * net.minecraft.class_6032
 */
typealias WeightedList<U> = net.minecraft.class_6032<U>
/**
 * net.minecraft.class_4209
 */
typealias DebugInfoSender = net.minecraft.class_4209
/**
 * net.minecraft.class_1240
 */
typealias Schema1470 = net.minecraft.class_1240
/**
 * net.minecraft.class_1157
 */
typealias TutorialStep = net.minecraft.class_1157
/**
 * net.minecraft.class_647
 */
typealias CrackParticle = net.minecraft.class_647
/**
 * net.minecraft.class_738
 */
typealias FishingParticle = net.minecraft.class_738
/**
 * org.lwjgl.glfw.GLFWScrollCallbackI
 */
typealias GLFWScrollCallbackI = org.lwjgl.glfw.GLFWScrollCallbackI
/**
 * net.minecraft.class_8767
 */
typealias LayoutWidgets = net.minecraft.class_8767
/**
 * net.minecraft.class_1239
 */
typealias Schema1481 = net.minecraft.class_1239
/**
 * net.minecraft.class_3175
 */
typealias SimpleBlockFeatureConfig = net.minecraft.class_3175
/**
 * net.minecraft.class_1242
 */
typealias Schema1483 = net.minecraft.class_1242
/**
 * net.minecraft.class_1800
 */
typealias ModelPredicateProvider = net.minecraft.class_1800
/**
 * net.minecraft.class_9670
 */
typealias SetCustomModelDataLootFunction = net.minecraft.class_9670
/**
 * net.minecraft.class_1241
 */
typealias Schema1486 = net.minecraft.class_1241
/**
 * net.minecraft.class_6516
 */
typealias JfrProfileRecorder = net.minecraft.class_6516
/**
 * net.minecraft.class_457
 */
typealias AdvancementsScreen = net.minecraft.class_457
/**
 * net.minecraft.class_8715
 */
typealias DebugGameTestClearCustomPayload = net.minecraft.class_8715
/**
 * net.minecraft.class_389
 */
typealias FontLoader = net.minecraft.class_389
/**
 * net.minecraft.class_2425
 */
typealias CommandSyntaxProvider = net.minecraft.class_2425
/**
 * net.minecraft.class_3846
 */
typealias TaskExecutor<T> = net.minecraft.class_3846<T>
/**
 * net.minecraft.class_5342
 */
typealias LootConditionType = net.minecraft.class_5342
/**
 * net.minecraft.class_4339
 */
typealias Ping = net.minecraft.class_4339
/**
 * net.minecraft.class_9269
 */
typealias TippedArrowPotionToItemFix = net.minecraft.class_9269
/**
 * net.minecraft.class_8804
 */
typealias ItemKeys = net.minecraft.class_8804
/**
 * net.minecraft.class_9387
 */
typealias Symbol<T> = net.minecraft.class_9387<T>
/**
 * net.minecraft.class_6416
 */
typealias CrashMemoryReserve = net.minecraft.class_6416
/**
 * net.minecraft.class_239
 */
typealias HitResult = net.minecraft.class_239
/**
 * net.minecraft.class_2668
 */
typealias GameStateChangeS2CPacket = net.minecraft.class_2668
/**
 * net.minecraft.class_6676
 */
typealias Xoroshiro128PlusPlusRandomImpl = net.minecraft.class_6676
/**
 * net.minecraft.class_6344
 */
typealias EmptyEntityRenderer<T> = net.minecraft.class_6344<T>
/**
 * net.minecraft.class_3592
 */
typealias ColorlessShulkerEntityFix = net.minecraft.class_3592
/**
 * net.minecraft.class_967
 */
typealias WitherSkeletonEntityRenderer = net.minecraft.class_967
/**
 * net.minecraft.class_5149
 */
typealias HorseColor = net.minecraft.class_5149
/**
 * net.minecraft.class_1796
 */
typealias ItemCooldownManager = net.minecraft.class_1796
/**
 * net.minecraft.class_2310
 */
typealias HorizontalConnectingBlock = net.minecraft.class_2310
/**
 * net.minecraft.class_3059
 */
typealias HugeBrownMushroomFeature = net.minecraft.class_3059
/**
 * net.minecraft.class_2096
 */
typealias NumberRange<T> = net.minecraft.class_2096<T>
/**
 * net.minecraft.class_215
 */
typealias EntityPropertiesLootCondition = net.minecraft.class_215
/**
 * net.minecraft.class_7852
 */
typealias EmptyWidget = net.minecraft.class_7852
/**
 * net.minecraft.class_5652
 */
typealias LootNbtProviderTypes = net.minecraft.class_5652
/**
 * net.minecraft.class_2718
 */
typealias RemoveEntityStatusEffectS2CPacket = net.minecraft.class_2718
/**
 * net.minecraft.class_1560
 */
typealias EndermanEntity = net.minecraft.class_1560
/**
 * net.minecraft.class_7510
 */
typealias PlacedFeatureIndexer = net.minecraft.class_7510
/**
 * net.minecraft.class_8965
 */
typealias TrialSpawnerConfig = net.minecraft.class_8965
/**
 * net.minecraft.class_4168
 */
typealias Activity = net.minecraft.class_4168
/**
 * net.minecraft.class_7670
 */
typealias ResourceFileSystem = net.minecraft.class_7670
/**
 * net.minecraft.class_4778
 */
typealias WallShape = net.minecraft.class_4778
/**
 * net.minecraft.class_8667
 */
typealias DirectionalLayoutWidget = net.minecraft.class_8667
/**
 * net.minecraft.class_6578
 */
typealias DualNoiseBlockStateProvider = net.minecraft.class_6578
/**
 * net.minecraft.class_4905
 */
typealias RealmsScreen = net.minecraft.class_4905
/**
 * net.minecraft.class_5251
 */
typealias TextColor = net.minecraft.class_5251
/**
 * net.minecraft.class_357
 */
typealias SliderWidget = net.minecraft.class_357
/**
 * net.minecraft.class_2507
 */
typealias NbtIo = net.minecraft.class_2507
/**
 * net.minecraft.class_9758
 */
typealias TradeRebalanceEnchantmentTagProvider = net.minecraft.class_9758
/**
 * net.minecraft.class_2940
 */
typealias TrackedData<T> = net.minecraft.class_2940<T>
/**
 * net.minecraft.class_7822
 */
typealias PublicPlayerSession = net.minecraft.class_7822
/**
 * net.minecraft.class_6346
 */
typealias Tracer = net.minecraft.class_6346
/**
 * net.minecraft.class_196
 */
typealias BredAnimalsCriterion = net.minecraft.class_196
/**
 * net.minecraft.class_4068
 */
typealias Drawable = net.minecraft.class_4068
/**
 * net.minecraft.class_2663
 */
typealias EntityStatusS2CPacket = net.minecraft.class_2663

/**
 * net.minecraft.class_1839
 */
typealias UseAction = net.minecraft.class_1839
/**
 * net.minecraft.class_4552
 */
typealias LightPredicate = net.minecraft.class_4552
/**
 * net.minecraft.class_2502
 */
typealias SpongeBlock = net.minecraft.class_2502
/**
 * net.minecraft.class_428
 */
typealias OutOfMemoryScreen = net.minecraft.class_428
/**
 * net.minecraft.class_1412
 */
typealias SwimNavigation = net.minecraft.class_1412
/**
 * net.minecraft.class_2281
 */
typealias ChestBlock = net.minecraft.class_2281
/**
 * net.minecraft.class_944
 */
typealias ShulkerHeadFeatureRenderer = net.minecraft.class_944
/**
 * net.minecraft.class_8519
 */
typealias SplashTextRenderer = net.minecraft.class_8519
/**
 * net.minecraft.class_395
 */
typealias TrueTypeFont = net.minecraft.class_395
/**
 * net.minecraft.class_6854
 */
typealias FogShape = net.minecraft.class_6854
/**
 * net.minecraft.class_639
 */
typealias ServerAddress = net.minecraft.class_639
/**
 * net.minecraft.class_7218
 */
typealias ArgumentHelper = net.minecraft.class_7218
/**
 * net.minecraft.class_2243
 */
typealias TeamArgumentType = net.minecraft.class_2243
/**
 * net.minecraft.class_7786
 */
typealias VanillaAdvancementProviders = net.minecraft.class_7786
/**
 * net.minecraft.class_8795
 */
typealias TradeRebalanceLootTableProviders = net.minecraft.class_8795
/**
 * net.minecraft.class_7045
 */
typealias StructureTags = net.minecraft.class_7045
/**
 * net.minecraft.class_9745
 */
typealias SingleEnchantmentProvider = net.minecraft.class_9745
/**
 * net.minecraft.class_268
 */
typealias Team = net.minecraft.class_268
/**
 * net.minecraft.class_5141
 */
typealias TrunkPlacer = net.minecraft.class_5141
/**
 * net.minecraft.class_3064
 */
typealias GameModeCommand = net.minecraft.class_3064
/**
 * net.minecraft.class_2537
 */
typealias TripwireHookBlock = net.minecraft.class_2537
/**
 * net.minecraft.class_1759
 */
typealias CompassItem = net.minecraft.class_1759
/**
 * net.minecraft.class_1495
 */
typealias DonkeyEntity = net.minecraft.class_1495
/**
 * net.minecraft.class_9653
 */
typealias AttributeModifiersPredicate = net.minecraft.class_9653
/**
 * net.minecraft.class_4879
 */
typealias RealmsServerList = net.minecraft.class_4879
/**
 * net.minecraft.class_6816
 */
typealias OrePlacedFeatures = net.minecraft.class_6816
/**
 * net.minecraft.class_4860
 */
typealias EntityProjectileOwnerFix = net.minecraft.class_4860
/**
 * net.minecraft.class_5418
 */
typealias AbstractPiglinEntity = net.minecraft.class_5418
/**
 * net.minecraft.class_557
 */
typealias BookModel = net.minecraft.class_557
/**
 * net.minecraft.class_5253
 */
typealias ColorHelper = net.minecraft.class_5253
/**
 * net.minecraft.class_3014
 */
typealias BanListCommand = net.minecraft.class_3014
/**
 * net.minecraft.class_915
 */
typealias ItemFrameEntityRenderer<T> = net.minecraft.class_915<T>
/**
 * net.minecraft.class_4527
 */
typealias TestCommand = net.minecraft.class_4527
/**
 * net.minecraft.class_6574
 */
typealias RandomSplitter = net.minecraft.class_6574
/**
 * net.minecraft.class_3441
 */
typealias ServerRecipeBook = net.minecraft.class_3441
/**
 * net.minecraft.class_4870
 */
typealias Ops = net.minecraft.class_4870
/**
 * net.minecraft.class_8656
 */
typealias BuyRealmsScreen = net.minecraft.class_8656
/**
 * net.minecraft.class_7187
 */
typealias AnimationHelper = net.minecraft.class_7187
/**
 * net.minecraft.class_4153
 */
typealias PointOfInterestStorage = net.minecraft.class_4153
/**
 * net.minecraft.class_2596
 */
typealias Packet<T> = net.minecraft.class_2596<T>
/**
 * net.minecraft.class_5905
 */
typealias TitleFadeS2CPacket = net.minecraft.class_5905
/**
 * net.minecraft.class_9636
 */
typealias EnchantmentTags = net.minecraft.class_9636
/**
 * net.minecraft.class_7589
 */
typealias BlendingDataRemoveFromNetherEndFix = net.minecraft.class_7589
/**
 * net.minecraft.class_47
 */
typealias LootContext = net.minecraft.class_47
/**
 * net.minecraft.class_8597
 */
typealias UnknownLoginQueryRequestPayload = net.minecraft.class_8597
/**
 * net.minecraft.class_4730
 */
typealias SpriteIdentifier = net.minecraft.class_4730
/**
 * net.minecraft.class_3828
 */
typealias StructureProcessorType<P> = net.minecraft.class_3828<P>
/**
 * net.minecraft.class_2384
 */
typealias InfestedBlock = net.minecraft.class_2384
/**
 * net.minecraft.class_8685
 */
typealias SkinTextures = net.minecraft.class_8685
/**
 * java.math.BigInteger
 */
typealias BigInteger = java.math.BigInteger
/**
 * net.minecraft.class_1430
 */
typealias CowEntity = net.minecraft.class_1430
/**
 * net.minecraft.class_8739
 */
typealias StartChunkSendS2CPacket = net.minecraft.class_8739
/**
 * net.minecraft.class_2169
 */
typealias TheEndBiomeSource = net.minecraft.class_2169
/**
 * net.minecraft.class_2404
 */
typealias FluidBlock = net.minecraft.class_2404
/**
 * net.minecraft.class_896
 */
typealias EndermiteEntityRenderer = net.minecraft.class_896
/**
 * net.minecraft.class_364
 */
typealias Element = net.minecraft.class_364
/**
 * net.minecraft.class_6661
 */
typealias AbstractConditionalPlacementModifier = net.minecraft.class_6661
/**
 * net.minecraft.class_486
 */
typealias EnchantmentScreen = net.minecraft.class_486
/**
 * net.minecraft.class_6124
 */
typealias UniformHeightProvider = net.minecraft.class_6124
/**
 * net.minecraft.class_1914
 */
typealias TradeOffer = net.minecraft.class_1914
/**
 * net.minecraft.class_5252
 */
typealias AttributeCommand = net.minecraft.class_5252
/**
 * net.minecraft.class_6909
 */
typealias TicksInWrongChunkFix = net.minecraft.class_6909
/**
 * net.minecraft.class_3899
 */
typealias LevelPrioritizedQueue<T> = net.minecraft.class_3899<T>
/**
 * net.minecraft.class_8002
 */
typealias TooltipBackgroundRenderer = net.minecraft.class_8002
/**
 * net.minecraft.class_7574
 */
typealias AbuseReportContext = net.minecraft.class_7574
/**
 * net.minecraft.class_8923
 */
typealias TransparentBlock = net.minecraft.class_8923
/**
 * net.minecraft.class_8878
 */
typealias PrimedTntBlockStateFix = net.minecraft.class_8878
/**
 * net.minecraft.class_6769
 */
typealias PacketSample = net.minecraft.class_6769
/**
 * net.minecraft.class_8256
 */
typealias TrailRuinsGenerator = net.minecraft.class_8256
/**
 * net.minecraft.class_6016
 */
typealias ConstantIntProvider = net.minecraft.class_6016
/**
 * net.minecraft.class_6794
 */
typealias EnvironmentScanPlacementModifier = net.minecraft.class_6794
/**
 * net.minecraft.class_8792
 */
typealias ConnectedClientData = net.minecraft.class_8792
/**
 * net.minecraft.class_3578
 */
typealias BlockNameFlatteningFix = net.minecraft.class_3578
/**
 * net.minecraft.class_485
 */
typealias AbstractInventoryScreen<T> = net.minecraft.class_485<T>
/**
 * net.minecraft.class_3089
 */
typealias ParticleCommand = net.minecraft.class_3089
/**
 * net.minecraft.class_8504
 */
typealias DecoratedPotFieldRenameFix = net.minecraft.class_8504
/**
 * net.minecraft.class_1370
 */
typealias GoToWalkTargetGoal = net.minecraft.class_1370
/**
 * net.minecraft.class_2619
 */
typealias JukeboxBlockEntity = net.minecraft.class_2619
/**
 * net.minecraft.class_1217
 */
typealias TeamDisplayNameFix = net.minecraft.class_1217
/**
 * net.minecraft.class_5930
 */
typealias BendingTrunkPlacer = net.minecraft.class_5930
/**
 * net.minecraft.class_8592
 */
typealias ConnectionIntent = net.minecraft.class_8592
/**
 * net.minecraft.class_5772
 */
typealias AxolotlEntityModel<T> = net.minecraft.class_5772<T>
/**
 * net.minecraft.class_6857
 */
typealias ServerCrashSafePacketListener = net.minecraft.class_6857
/**
 * net.minecraft.class_1322
 */
typealias EntityAttributeModifier = net.minecraft.class_1322
/**
 * net.minecraft.class_2567
 */
typealias WallWitherSkullBlock = net.minecraft.class_2567
/**
 * net.minecraft.class_1116
 */
typealias AmbientSoundPlayer = net.minecraft.class_1116
/**
 * java.nio.Buffer
 */
typealias Buffer = java.nio.Buffer
/**
 * net.minecraft.class_4996
 */
typealias PosRuleTestType<P> = net.minecraft.class_4996<P>
/**
 * net.minecraft.class_964
 */
typealias WitherEntityRenderer = net.minecraft.class_964
/**
 * net.minecraft.class_3415
 */
typealias ShipwreckGenerator = net.minecraft.class_3415
/**
 * net.minecraft.class_7744
 */
typealias HangingSignEditScreen = net.minecraft.class_7744
/**
 * net.minecraft.class_8191
 */
typealias SnifferDigSoundInstance = net.minecraft.class_8191
/**
 * net.minecraft.class_9326
 */
typealias ComponentChanges = net.minecraft.class_9326
/**
 * net.minecraft.class_2547
 */
typealias PacketListener = net.minecraft.class_2547
/**
 * net.minecraft.class_4960
 */
typealias EntityUuidFix = net.minecraft.class_4960
/**
 * net.minecraft.class_1872
 */
typealias ShieldDecorationRecipe = net.minecraft.class_1872
/**
 * net.minecraft.class_4842
 */
typealias PiglinEntityRenderer = net.minecraft.class_4842
/**
 * net.minecraft.class_2626
 */
typealias BlockUpdateS2CPacket = net.minecraft.class_2626
/**
 * net.minecraft.class_7561
 */
typealias MessageSignatureStorage = net.minecraft.class_7561
/**
 * net.minecraft.class_9451
 */
typealias BannerCustomNameToItemNameFix = net.minecraft.class_9451
/**
 * net.minecraft.class_9262
 */
typealias RawFilteredPair<T> = net.minecraft.class_9262<T>
/**
 * net.minecraft.class_1270
 */
typealias ScreenHandlerFactory = net.minecraft.class_1270
/**
 * net.minecraft.class_4776
 */
typealias WeepingVinesBlock = net.minecraft.class_4776
/**
 * net.minecraft.class_866
 */
typealias SkyLightDebugRenderer = net.minecraft.class_866
/**
 * net.minecraft.class_2309
 */
typealias DaylightDetectorBlock = net.minecraft.class_2309
/**
 * net.minecraft.class_1617
 */
typealias SpellcastingIllagerEntity = net.minecraft.class_1617
/**
 * net.minecraft.class_435
 */
typealias ProgressScreen = net.minecraft.class_435
/**
 * net.minecraft.class_5897
 */
typealias WorldBorderSizeChangedS2CPacket = net.minecraft.class_5897
/**
 * net.minecraft.class_2989
 */
typealias ServerAdvancementLoader = net.minecraft.class_2989
/**
 * net.minecraft.class_3169
 */
typealias EntityDataObject = net.minecraft.class_3169
/**
 * net.minecraft.class_3966
 */
typealias EntityHitResult = net.minecraft.class_3966
/**
 * net.minecraft.class_5632
 */
typealias TooltipData = net.minecraft.class_5632
/**
 * net.minecraft.class_709
 */
typealias PortalParticle = net.minecraft.class_709
/**
 * net.minecraft.class_259
 */
typealias VoxelShapes = net.minecraft.class_259
/**
 * net.minecraft.class_2808
 */
typealias ChunkType = net.minecraft.class_2808
/**
 * net.minecraft.class_6654
 */
typealias BlockColumnFeature = net.minecraft.class_6654
/**
 * net.minecraft.class_9483
 */
typealias OminousItemSpawnerEntityRenderer = net.minecraft.class_9483
/**
 * net.minecraft.class_5847
 */
typealias StructureTerrainAdaptation = net.minecraft.class_5847
/**
 * net.minecraft.class_5242
 */
typealias UuidArgumentType = net.minecraft.class_5242
/**
 * net.minecraft.class_2683
 */
typealias MapUpdateS2CPacket = net.minecraft.class_2683
/**
 * net.minecraft.class_2886
 */
typealias PlayerInteractItemC2SPacket = net.minecraft.class_2886
/**
 * net.minecraft.class_6643
 */
typealias CarvingMask = net.minecraft.class_6643
/**
 * net.minecraft.class_5623
 */
typealias TestFailureLogger = net.minecraft.class_5623
/**
 * net.minecraft.class_4691
 */
typealias IronGolemCrackFeatureRenderer = net.minecraft.class_4691
/**
 * net.minecraft.class_7803
 */
typealias VanillaRecipeProvider = net.minecraft.class_7803
/**
 * net.minecraft.class_2590
 */
typealias TranslationException = net.minecraft.class_2590
/**
 * net.minecraft.class_8674
 */
typealias ClientConfigurationNetworkHandler = net.minecraft.class_8674
/**
 * net.minecraft.class_9812
 */
typealias DisconnectionInfo = net.minecraft.class_9812
/**
 * net.minecraft.class_7057
 */
typealias StructureSetKeys = net.minecraft.class_7057
/**
 * net.minecraft.class_7430
 */
typealias GoatHornItem = net.minecraft.class_7430
/**
 * net.minecraft.class_6044
 */
typealias AxolotlAttackablesSensor = net.minecraft.class_6044
/**
 * net.minecraft.class_8610
 */
typealias ServerConfigurationNetworkHandler = net.minecraft.class_8610
/**
 * net.minecraft.class_3006
 */
typealias DesertPyramidStructure = net.minecraft.class_3006
/**
 * net.minecraft.class_1196
 */
typealias LevelDataGeneratorOptionsFix = net.minecraft.class_1196
/**
 * net.minecraft.class_2238
 */
typealias BeaconBlock = net.minecraft.class_2238
/**
 * net.minecraft.class_838
 */
typealias StructureBlockBlockEntityRenderer = net.minecraft.class_838
/**
 * net.minecraft.class_5546
 */
typealias CauldronBlock = net.minecraft.class_5546
/**
 * net.minecraft.class_6785
 */
typealias FeatureDebugLogger = net.minecraft.class_6785
/**
 * net.minecraft.class_1779
 */
typealias ExperienceBottleItem = net.minecraft.class_1779
/**
 * net.minecraft.class_653
 */
typealias BubbleColumnUpParticle = net.minecraft.class_653
/**
 * net.minecraft.class_8596
 */
typealias UnknownLoginQueryResponsePayload = net.minecraft.class_8596
/**
 * net.minecraft.class_1871
 */
typealias ShulkerBoxColoringRecipe = net.minecraft.class_1871
/**
 * net.minecraft.class_635
 */
typealias ClientLoginNetworkHandler = net.minecraft.class_635
/**
 * net.minecraft.class_2963
 */
typealias SingleStateFeatureConfig = net.minecraft.class_2963
/**
 * net.minecraft.class_512
 */
typealias RecipeGroupButtonWidget = net.minecraft.class_512
/**
 * net.minecraft.class_430
 */
typealias PresetsScreen = net.minecraft.class_430
/**
 * net.minecraft.class_4157
 */
typealias PointOfInterestSet = net.minecraft.class_4157
/**
 * net.minecraft.class_2432
 */
typealias VanillaChestLootTableGenerator = net.minecraft.class_2432
/**
 * net.minecraft.class_6638
 */
typealias WorldGenSettingsDisallowOldCustomWorldsFix = net.minecraft.class_6638
/**
 * net.minecraft.class_759
 */
typealias HeldItemRenderer = net.minecraft.class_759
/**
 * net.minecraft.class_8092
 */
typealias WidgetTooltipPositioner = net.minecraft.class_8092
/**
 * net.minecraft.class_3151
 */
typealias TitleCommand = net.minecraft.class_3151
/**
 * net.minecraft.class_1481
 */
typealias TurtleEntity = net.minecraft.class_1481
/**
 * net.minecraft.class_4529
 */
typealias TestFunction = net.minecraft.class_4529
/**
 * net.minecraft.class_4782
 */
typealias NetherForestVegetationFeature = net.minecraft.class_4782
/**
 * net.minecraft.class_459
 */
typealias ControlsListWidget = net.minecraft.class_459
/**
 * net.minecraft.class_2303
 */
typealias EntitySelectorReader = net.minecraft.class_2303
/**
 * net.minecraft.class_5135
 */
typealias DefaultAttributeRegistry = net.minecraft.class_5135
/**
 * net.minecraft.class_2170
 */
typealias CommandManager = net.minecraft.class_2170
/**
 * net.minecraft.class_9010
 */
typealias JsonReaderUtils = net.minecraft.class_9010
/**
 * net.minecraft.class_9722
 */
typealias EnchantmentLocationBasedEffect = net.minecraft.class_9722
/**
 * net.minecraft.class_5279
 */
typealias ThrownItemPickedUpByEntityCriterion = net.minecraft.class_5279
/**
 * net.minecraft.class_3851
 */
typealias VillagerDataContainer = net.minecraft.class_3851
/**
 * net.minecraft.class_2896
 */
typealias ClientLoginPacketListener = net.minecraft.class_2896
/**
 * net.minecraft.class_1937
 */
typealias world_World = net.minecraft.class_1937
/**
 * net.minecraft.class_8897
 */
typealias RecoverWorldScreen = net.minecraft.class_8897
/**
 * net.minecraft.class_5829
 */
typealias BundleTutorial = net.minecraft.class_5829
/**
 * net.minecraft.class_4019
 */
typealias FoxEntity = net.minecraft.class_4019
/**
 * net.minecraft.class_1507
 */
typealias ZombieHorseEntity = net.minecraft.class_1507
/**
 * net.minecraft.class_4524
 */
typealias TestSet = net.minecraft.class_4524
/**
 * net.minecraft.class_359
 */
typealias SubtitlesHud = net.minecraft.class_359
/**
 * net.minecraft.class_6384
 */
typealias Narration<T> = net.minecraft.class_6384<T>
/**
 * net.minecraft.class_1777
 */
typealias EnderEyeItem = net.minecraft.class_1777
/**
 * net.minecraft.class_562
 */
typealias CreeperEntityModel<T> = net.minecraft.class_562<T>
/**
 * io.netty.buffer.ByteBuf
 */
typealias ByteBuf = io.netty.buffer.ByteBuf
/**
 * net.minecraft.class_4279
 */
typealias FillLayerFeatureConfig = net.minecraft.class_4279
/**
 * net.minecraft.class_1844
 */
typealias PotionContentsComponent = net.minecraft.class_1844
/**
 * net.minecraft.class_7113
 */
typealias FrogspawnBlock = net.minecraft.class_7113
/**
 * net.minecraft.class_2542
 */
typealias TurtleEggBlock = net.minecraft.class_2542
/**
 * net.minecraft.class_3573
 */
typealias BlockEntityJukeboxFix = net.minecraft.class_3573
/**
 * net.minecraft.class_5454
 */
typealias TeleportTarget = net.minecraft.class_5454
/**
 * net.minecraft.class_4606
 */
typealias EyesFeatureRenderer<T, M> = net.minecraft.class_4606<T, M>
/**
 * net.minecraft.class_2483
 */
typealias AbstractNbtList<T> = net.minecraft.class_2483<T>
/**
 * net.minecraft.class_3970
 */
typealias MapIdFix = net.minecraft.class_3970
/**
 * net.minecraft.class_1077
 */
typealias LanguageDefinition = net.minecraft.class_1077
/**
 * org.lwjgl.glfw.GLFWCursorPosCallbackI
 */
typealias GLFWCursorPosCallbackI = org.lwjgl.glfw.GLFWCursorPosCallbackI
/**
 * net.minecraft.class_5525
 */
typealias NetworkEncryptionException = net.minecraft.class_5525
/**
 * net.minecraft.class_1143
 */
typealias MusicType = net.minecraft.class_1143
/**
 * net.minecraft.class_3928
 */
typealias LevelLoadingScreen = net.minecraft.class_3928
/**
 * net.minecraft.class_5973
 */
typealias MathConstants = net.minecraft.class_5973
/**
 * net.minecraft.class_2643
 */
typealias EndGatewayBlockEntity = net.minecraft.class_2643
/**
 * net.minecraft.class_4288
 */
typealias MouseOptionsScreen = net.minecraft.class_4288
/**
 * net.minecraft.class_7818
 */
typealias ClientPlayerSession = net.minecraft.class_7818
/**
 * net.minecraft.class_4217
 */
typealias FarmerVillagerTask = net.minecraft.class_4217
/**
 * net.minecraft.class_3694
 */
typealias DummyProfiler = net.minecraft.class_3694
/**
 * net.minecraft.class_9690
 */
typealias Schema3938 = net.minecraft.class_9690
/**
 * net.minecraft.class_9009
 */
typealias GrateBlock = net.minecraft.class_9009
/**
 * net.minecraft.class_3671
 */
typealias SetLoreLootFunction = net.minecraft.class_3671
/**
 * net.minecraft.class_9688
 */
typealias Schema3808_2 = net.minecraft.class_9688
/**
 * net.minecraft.class_9186
 */
typealias Schema3808_1 = net.minecraft.class_9186
/**
 * net.minecraft.class_8877
 */
typealias ChoiceWriteReadFix = net.minecraft.class_8877
/**
 * it.unimi.dsi.fastutil.floats.FloatConsumer
 */
typealias FloatConsumer = it.unimi.dsi.fastutil.floats.FloatConsumer
/**
 * net.minecraft.class_1396
 */
typealias ZombieAttackGoal = net.minecraft.class_1396
/**
 * net.minecraft.class_6762
 */
typealias TickScheduler<T> = net.minecraft.class_6762<T>
/**
 * net.minecraft.class_2591
 */
typealias BlockEntityType<T> = net.minecraft.class_2591<T>
/**
 * net.minecraft.class_9054
 */
typealias SoundListenerTransform = net.minecraft.class_9054
/**
 * net.minecraft.class_8144
 */
typealias Nullables = net.minecraft.class_8144
/**
 * net.minecraft.class_7919
 */
typealias Tooltip = net.minecraft.class_7919
/**
 * net.minecraft.class_9402
 */
typealias Term<S> = net.minecraft.class_9402<S>
/**
 * net.minecraft.class_624
 */
typealias WolfEntityModel<T> = net.minecraft.class_624<T>
/**
 * net.minecraft.class_1214
 */
typealias StatsCounterFix = net.minecraft.class_1214
/**
 * net.minecraft.class_5862
 */
typealias ConstantFloatProvider = net.minecraft.class_5862
/**
 * net.minecraft.class_9723
 */
typealias EnchantmentValueEffect = net.minecraft.class_9723
/**
 * net.minecraft.class_6871
 */
typealias ConcentricRingsStructurePlacement = net.minecraft.class_6871
/**
 * net.minecraft.class_5294
 */
typealias DimensionEffects = net.minecraft.class_5294
/**
 * net.minecraft.class_5217
 */
typealias WorldProperties = net.minecraft.class_5217
/**
 * net.minecraft.class_2123
 */
typealias ShotCrossbowCriterion = net.minecraft.class_2123
/**
 * net.minecraft.class_2484
 */
typealias SkullBlock = net.minecraft.class_2484
/**
 * net.minecraft.class_2216
 */
typealias ScoreboardCriterionArgumentType = net.minecraft.class_2216
/**
 * net.minecraft.class_2058
 */
typealias FishingRodHookedCriterion = net.minecraft.class_2058
/**
 * net.minecraft.class_4850
 */
typealias TargetBlock = net.minecraft.class_4850
/**
 * net.minecraft.class_1128
 */
typealias SuffixArray<T> = net.minecraft.class_1128<T>
/**
 * net.minecraft.class_6624
 */
typealias StructurePiecesList = net.minecraft.class_6624
/**
 * net.minecraft.class_2793
 */
typealias TeleportConfirmC2SPacket = net.minecraft.class_2793
/**
 * net.minecraft.class_2789
 */
typealias WorldBorderStage = net.minecraft.class_2789
/**
 * net.minecraft.class_7958
 */
typealias AtlasSprite = net.minecraft.class_7958
/**
 * java.io.DataOutput
 */
typealias io_DataOutput = java.io.DataOutput
/**
 * net.minecraft.class_4446
 */
typealias RealmsTextureManager = net.minecraft.class_4446
/**
 * net.minecraft.class_2925
 */
typealias CaveCarver = net.minecraft.class_2925
/**
 * net.minecraft.class_4013
 */
typealias SynchronousResourceReloader = net.minecraft.class_4013
/**
 * net.minecraft.class_3574
 */
typealias BlockEntityKeepPackedFix = net.minecraft.class_3574
/**
 * net.minecraft.class_2729
 */
typealias SelectAdvancementTabS2CPacket = net.minecraft.class_2729
/**
 * net.minecraft.class_3593
 */
typealias LegacyDyeItemMapping = net.minecraft.class_3593
/**
 * net.minecraft.class_5540
 */
typealias AbstractCandleBlock = net.minecraft.class_5540
/**
 * net.minecraft.class_9179
 */
typealias DebugSampleSubscriptionC2SPacket = net.minecraft.class_9179
/**
 * net.minecraft.class_4722
 */
typealias TexturedRenderLayers = net.minecraft.class_4722
/**
 * net.minecraft.class_5205
 */
typealias BushFoliagePlacer = net.minecraft.class_5205
/**
 * net.minecraft.class_3955
 */
typealias CraftingRecipe = net.minecraft.class_3955
/**
 * net.minecraft.class_2417
 */
typealias VanillaStoryTabAdvancementGenerator = net.minecraft.class_2417
/**
 * net.minecraft.class_4482
 */
typealias BeehiveBlockEntity = net.minecraft.class_4482
/**
 * net.minecraft.class_7753
 */
typealias ChestRaftEntityModel = net.minecraft.class_7753
/**
 * net.minecraft.class_825
 */
typealias BedBlockEntityRenderer = net.minecraft.class_825
/**
 * net.minecraft.class_2066
 */
typealias InventoryChangedCriterion = net.minecraft.class_2066
/**
 * net.minecraft.class_4133
 */
typealias VillagerWorkTask = net.minecraft.class_4133
/**
 * net.minecraft.class_8925
 */
typealias OxidizableDoorBlock = net.minecraft.class_8925
/**
 * net.minecraft.class_5922
 */
typealias VegetationPatchFeature = net.minecraft.class_5922
/**
 * net.minecraft.class_490
 */
typealias InventoryScreen = net.minecraft.class_490
/**
 * net.minecraft.class_5212
 */
typealias LargeOakTrunkPlacer = net.minecraft.class_5212
/**
 * java.util.function.BiPredicate
 */
typealias BiPredicate<T, U> = java.util.function.BiPredicate<T, U>
/**
 * net.minecraft.class_777
 */
typealias BakedQuad = net.minecraft.class_777
/**
 * net.minecraft.class_9429
 */
typealias ToggleTooltipsLootFunction = net.minecraft.class_9429
/**
 * net.minecraft.class_13
 */
typealias PathNodeNavigator = net.minecraft.class_13
/**
 * net.minecraft.class_1773
 */
typealias EmptyMapItem = net.minecraft.class_1773
/**
 * net.minecraft.class_2304
 */
typealias CraftingTableBlock = net.minecraft.class_2304
/**
 * net.minecraft.class_4617
 */
typealias NameGenerator = net.minecraft.class_4617
/**
 * net.minecraft.class_6582
 */
typealias ChainedBlockSource = net.minecraft.class_6582
/**
 * net.minecraft.class_9334
 */
typealias DataComponentTypes = net.minecraft.class_9334
/**
 * net.minecraft.class_9004
 */
typealias DebugBreezeCustomPayload = net.minecraft.class_9004
/**
 * net.minecraft.class_1772
 */
typealias EnchantedBookItem = net.minecraft.class_1772
/**
 * net.minecraft.class_3917
 */
typealias ScreenHandlerType<T> = net.minecraft.class_3917<T>
/**
 * net.minecraft.class_9761
 */
typealias AbstractChunkHolder = net.minecraft.class_9761
/**
 * net.minecraft.class_2875
 */
typealias UpdateStructureBlockC2SPacket = net.minecraft.class_2875
/**
 * net.minecraft.class_6502
 */
typealias EmptyPaletteStorage = net.minecraft.class_6502
/**
 * net.minecraft.class_4409
 */
typealias RealmsResetNormalWorldScreen = net.minecraft.class_4409
/**
 * net.minecraft.class_9302
 */
typealias WrittenBookContentComponent = net.minecraft.class_9302
/**
 * net.minecraft.class_2987
 */
typealias OffThreadException = net.minecraft.class_2987
/**
 * net.minecraft.class_5207
 */
typealias LargeOakFoliagePlacer = net.minecraft.class_5207
/**
 * net.minecraft.class_2019
 */
typealias DamagePredicate = net.minecraft.class_2019
/**
 * net.minecraft.class_2561
 */
typealias Text = net.minecraft.class_2561
/**
 * net.minecraft.class_4367
 */
typealias RealmsWorldSlotButton = net.minecraft.class_4367
/**
 * net.minecraft.class_4664
 */
typealias TrunkVineTreeDecorator = net.minecraft.class_4664
/**
 * net.minecraft.class_8563
 */
typealias ChunkLevels = net.minecraft.class_8563
/**
 * net.minecraft.class_6864
 */
typealias TagPacketSerializer = net.minecraft.class_6864
/**
 * net.minecraft.class_5481
 */
typealias OrderedText = net.minecraft.class_5481
/**
 * net.minecraft.class_1331
 */
typealias FlightMoveControl = net.minecraft.class_1331
/**
 * net.minecraft.class_9752
 */
typealias EnchantmentActiveCheckLootCondition = net.minecraft.class_9752
/**
 * net.minecraft.class_231
 */
typealias FunctionTimerCallback = net.minecraft.class_231
/**
 * net.minecraft.class_2615
 */
typealias Hopper = net.minecraft.class_2615
/**
 * net.minecraft.class_8735
 */
typealias ServerConfigurationPacketListener = net.minecraft.class_8735
/**
 * net.minecraft.class_3111
 */
typealias DefaultFeatureConfig = net.minecraft.class_3111
/**
 * net.minecraft.class_5775
 */
typealias Schema2688 = net.minecraft.class_5775
/**
 * net.minecraft.class_5701
 */
typealias Schema2684 = net.minecraft.class_5701
/**
 * net.minecraft.class_5752
 */
typealias Schema2686 = net.minecraft.class_5752
/**
 * net.minecraft.class_9449
 */
typealias ChatCommandSignedC2SPacket = net.minecraft.class_9449
/**
 * net.minecraft.class_6899
 */
typealias RegistryFixedCodec<E> = net.minecraft.class_6899<E>
/**
 * net.minecraft.class_1218
 */
typealias WriteAndReadFix = net.minecraft.class_1218
/**
 * net.minecraft.class_2671
 */
typealias PistonHeadBlock = net.minecraft.class_2671
/**
 * net.minecraft.class_2457
 */
typealias RedstoneWireBlock = net.minecraft.class_2457
/**
 * net.minecraft.class_4648
 */
typealias FoliagePlacerType<P> = net.minecraft.class_4648<P>
/**
 * net.minecraft.class_6852
 */
typealias PlaceCommand = net.minecraft.class_6852
/**
 * net.minecraft.class_4810
 */
typealias CrossbowAttackTask<E, T> = net.minecraft.class_4810<E, T>
/**
 * net.minecraft.class_3225
 */
typealias ServerPlayerInteractionManager = net.minecraft.class_3225
/**
 * net.minecraft.class_5298
 */
typealias WordPackedArray = net.minecraft.class_5298
/**
 * net.minecraft.class_9753
 */
typealias EnchantmentLevelLootNumberProvider = net.minecraft.class_9753
/**
 * net.minecraft.class_9672
 */
typealias NonRepeatingAudioStream = net.minecraft.class_9672
/**
 * net.minecraft.class_8038
 */
typealias BundlePacket<T> = net.minecraft.class_8038<T>
/**
 * net.minecraft.class_4724
 */
typealias SpriteAtlasManager = net.minecraft.class_4724
/**
 * net.minecraft.class_6682
 */
typealias SimulationDistanceS2CPacket = net.minecraft.class_6682
/**
 * net.minecraft.class_9716
 */
typealias ApplyMobEffectEnchantmentEffect = net.minecraft.class_9716
/**
 * net.minecraft.class_3794
 */
typealias JigsawReplacementStructureProcessor = net.minecraft.class_3794
/**
 * net.minecraft.class_575
 */
typealias IllagerEntityModel<T> = net.minecraft.class_575<T>
/**
 * net.minecraft.class_9726
 */
typealias MultiplyEnchantmentEffect = net.minecraft.class_9726
/**
 * net.minecraft.class_3943
 */
typealias SetTradeOffersS2CPacket = net.minecraft.class_3943
/**
 * net.minecraft.class_8594
 */
typealias LoginQueryResponsePayload = net.minecraft.class_8594
/**
 * net.minecraft.class_608
 */
typealias SnowGolemEntityModel<T> = net.minecraft.class_608<T>
/**
 * net.minecraft.class_6800
 */
typealias OceanConfiguredFeatures = net.minecraft.class_6800
/**
 * net.minecraft.class_3217
 */
typealias VoidStartPlatformFeature = net.minecraft.class_3217
/**
 * net.minecraft.class_313
 */
typealias Monitor = net.minecraft.class_313
/**
 * net.minecraft.class_5359
 */
typealias DataPackSettings = net.minecraft.class_5359
/**
 * net.minecraft.class_2943
 */
typealias TrackedDataHandlerRegistry = net.minecraft.class_2943
/**
 * net.minecraft.class_8043
 */
typealias DamageTiltS2CPacket = net.minecraft.class_8043
/**
 * net.minecraft.class_1831
 */
typealias ToolItem = net.minecraft.class_1831
/**
 * net.minecraft.class_3032
 */
typealias DebugCommand = net.minecraft.class_3032
/**
 * net.minecraft.class_966
 */
typealias WitherSkullEntityRenderer = net.minecraft.class_966
/**
 * net.minecraft.class_309
 */
typealias Keyboard = net.minecraft.class_309
/**
 * net.minecraft.class_7708
 */
typealias ItemStackSet = net.minecraft.class_7708
/**
 * net.minecraft.class_1861
 */
typealias MapExtendingRecipe = net.minecraft.class_1861
/**
 * net.minecraft.class_2667
 */
typealias PistonExtensionBlock = net.minecraft.class_2667
/**
 * net.minecraft.class_8810
 */
typealias AbstractTorchBlock = net.minecraft.class_8810
/**
 * net.minecraft.class_876
 */
typealias ProjectileEntityRenderer<T> = net.minecraft.class_876<T>
/**
 * net.minecraft.class_7633
 */
typealias TickablePacketListener = net.minecraft.class_7633
/**
 * net.minecraft.class_5289
 */
typealias GameModeSelectionScreen = net.minecraft.class_5289
/**
 * net.minecraft.class_7107
 */
typealias FrogBrain = net.minecraft.class_7107
/**
 * net.minecraft.class_3366
 */
typealias OceanMonumentGenerator = net.minecraft.class_3366
/**
 * net.minecraft.class_91
 */
typealias TagEntry = net.minecraft.class_91
/**
 * net.minecraft.class_1085
 */
typealias TextureResourceMetadataReader = net.minecraft.class_1085
/**
 * net.minecraft.server.Main
 */
typealias Main = net.minecraft.server.Main
/**
 * net.minecraft.class_217
 */
typealias LootConditionTypes = net.minecraft.class_217
/**
 * java.net.InetSocketAddress
 */
typealias InetSocketAddress = java.net.InetSocketAddress
/**
 * net.minecraft.class_3031
 */
typealias Feature<FC> = net.minecraft.class_3031<FC>
/**
 * net.minecraft.class_3565
 */
typealias LightingView = net.minecraft.class_3565
/**
 * net.minecraft.class_5837
 */
typealias FilteredMessage = net.minecraft.class_5837
/**
 * net.minecraft.class_4884
 */
typealias RealmsWorldResetDto = net.minecraft.class_4884
/**
 * net.minecraft.class_7278
 */
typealias WardenAnimations = net.minecraft.class_7278
/**
 * net.minecraft.class_5714
 */
typealias GameEventListener = net.minecraft.class_5714
/**
 * net.minecraft.class_7718
 */
typealias RotationPropertyHelper = net.minecraft.class_7718
/**
 * net.minecraft.class_8960
 */
typealias TrialSpawnerBlock = net.minecraft.class_8960
/**
 * net.minecraft.class_8661
 */
typealias RealmsLoadingWidget = net.minecraft.class_8661
/**
 * net.minecraft.class_1129
 */
typealias SearchProvider<T> = net.minecraft.class_1129<T>
/**
 * net.minecraft.class_8066
 */
typealias PalettedPermutationsAtlasSource = net.minecraft.class_8066
/**
 * net.minecraft.class_2284
 */
typealias CommandFunctionArgumentType = net.minecraft.class_2284
/**
 * net.minecraft.class_539
 */
typealias SpectatorMenuState = net.minecraft.class_539
/**
 * net.minecraft.class_8149
 */
typealias Attackable = net.minecraft.class_8149
/**
 * net.minecraft.class_8743
 */
typealias DebugSampleLog = net.minecraft.class_8743
/**
 * net.minecraft.class_1513
 */
typealias ChargingPlayerPhase = net.minecraft.class_1513
/**
 * net.minecraft.class_2267
 */
typealias PosArgument = net.minecraft.class_2267
/**
 * net.minecraft.class_1316
 */
typealias JumpingMount = net.minecraft.class_1316
/**
 * net.minecraft.class_3968
 */
typealias AbstractZombieModel<T> = net.minecraft.class_3968<T>
/**
 * net.minecraft.class_6789
 */
typealias NetherForestVegetationFeatureConfig = net.minecraft.class_6789
/**
 * net.minecraft.class_1866
 */
typealias SpecialRecipeSerializer<T> = net.minecraft.class_1866<T>
/**
 * net.minecraft.class_1621
 */
typealias SlimeEntity = net.minecraft.class_1621
/**
 * net.minecraft.class_5614
 */
typealias BlockEntityRendererFactory<T> = net.minecraft.class_5614<T>
/**
 * net.minecraft.class_9023
 */
typealias NumberFormatType<T> = net.minecraft.class_9023<T>
/**
 * net.minecraft.class_5273
 */
typealias VillagerFollowRangeFix = net.minecraft.class_5273
/**
 * net.minecraft.class_7955
 */
typealias SingleAtlasSource = net.minecraft.class_7955
/**
 * net.minecraft.class_3445
 */
typealias Stat<T> = net.minecraft.class_3445<T>
/**
 * net.minecraft.class_9797
 */
typealias Portal = net.minecraft.class_9797
/**
 * net.minecraft.class_719
 */
typealias WaterSplashParticle = net.minecraft.class_719
/**
 * net.minecraft.class_5667
 */
typealias FixedLootScoreProvider = net.minecraft.class_5667
/**
 * net.minecraft.class_9652
 */
typealias EquipmentTable = net.minecraft.class_9652
/**
 * net.minecraft.class_902
 */
typealias ExperienceOrbEntityRenderer = net.minecraft.class_902
/**
 * net.minecraft.class_6535
 */
typealias LongRunningSampleStatistics<T> = net.minecraft.class_6535<T>
/**
 * net.minecraft.class_4968
 */
typealias BiomeMoodSound = net.minecraft.class_4968
/**
 * net.minecraft.class_8526
 */
typealias Sherds = net.minecraft.class_8526
/**
 * net.minecraft.class_7588
 */
typealias Bans = net.minecraft.class_7588
/**
 * net.minecraft.class_8986
 */
typealias BreezeEntityRenderer = net.minecraft.class_8986
/**
 * net.minecraft.class_8593
 */
typealias EnterConfigurationC2SPacket = net.minecraft.class_8593
/**
 * net.minecraft.class_4868
 */
typealias BackupList = net.minecraft.class_4868
/**
 * net.minecraft.class_9183
 */
typealias HorseArmorFix = net.minecraft.class_9183
/**
 * net.minecraft.class_4251
 */
typealias RingBellTask = net.minecraft.class_4251
/**
 * net.minecraft.class_7842
 */
typealias TextWidget = net.minecraft.class_7842
/**
 * net.minecraft.class_521
 */
typealias PackListWidget = net.minecraft.class_521
/**
 * net.minecraft.class_2653
 */
typealias ScreenHandlerSlotUpdateS2CPacket = net.minecraft.class_2653
/**
 * net.minecraft.class_3728
 */
typealias SelectionManager = net.minecraft.class_3728
/**
 * net.minecraft.class_4008
 */
typealias SplashTextResourceSupplier = net.minecraft.class_4008
/**
 * net.minecraft.class_6809
 */
typealias VegetationConfiguredFeatures = net.minecraft.class_6809
/**
 * net.minecraft.class_465
 */
typealias HandledScreen<T> = net.minecraft.class_465<T>
/**
 * net.minecraft.class_745
 */
typealias OtherClientPlayerEntity = net.minecraft.class_745
/**
 * net.minecraft.class_2750
 */
typealias DoorHinge = net.minecraft.class_2750
/**
 * net.minecraft.class_8779
 */
typealias AdvancementEntry = net.minecraft.class_8779
/**
 * net.minecraft.class_3054
 */
typealias ExperienceCommand = net.minecraft.class_3054

/**
 * java.lang.Class
 */
typealias Class<T> = java.lang.Class<T>
/**
 * net.minecraft.class_4628
 */
typealias RandomPatchFeature = net.minecraft.class_4628
/**
 * net.minecraft.class_2979
 */
typealias CoralTreeFeature = net.minecraft.class_2979
/**
 * net.minecraft.class_8243
 */
typealias CappedStructureProcessor = net.minecraft.class_8243
/**
 * net.minecraft.class_4813
 */
typealias ForgetTask = net.minecraft.class_4813
/**
 * net.minecraft.class_8172
 */
typealias DecoratedPotBlockEntity = net.minecraft.class_8172
/**
 * net.minecraft.class_1343
 */
typealias DoorInteractGoal = net.minecraft.class_1343
/**
 * net.minecraft.class_9273
 */
typealias Cracks = net.minecraft.class_9273
/**
 * net.minecraft.class_7094
 */
typealias AnimationState = net.minecraft.class_7094
/**
 * net.minecraft.class_5315
 */
typealias SaveVersionInfo = net.minecraft.class_5315
/**
 * net.minecraft.class_1170
 */
typealias EntityTheRenameningBlockFix = net.minecraft.class_1170
/**
 * net.minecraft.class_2953
 */
typealias BonusChestFeature = net.minecraft.class_2953
/**
 * net.minecraft.class_5657
 */
typealias LootNumberProviderType = net.minecraft.class_5657
/**
 * net.minecraft.class_181
 */
typealias LootContextParameters = net.minecraft.class_181
/**
 * net.minecraft.class_2811
 */
typealias ButtonClickC2SPacket = net.minecraft.class_2811
/**
 * net.minecraft.class_7853
 */
typealias ProfileKeys = net.minecraft.class_7853
/**
 * net.minecraft.class_4667
 */
typealias GameOptionsScreen = net.minecraft.class_4667
/**
 * net.minecraft.class_1058
 */
typealias Sprite = net.minecraft.class_1058
/**
 * net.minecraft.class_2050
 */
typealias EntityTypePredicate = net.minecraft.class_2050
/**
 * net.minecraft.class_8673
 */
typealias ClientCommonNetworkHandler = net.minecraft.class_8673
/**
 * net.minecraft.class_4353
 */
typealias RealmsDefaultUncaughtExceptionHandler = net.minecraft.class_4353
/**
 * net.minecraft.class_8769
 */
typealias UsernameReportScreen = net.minecraft.class_8769
/**
 * net.minecraft.class_5146
 */
typealias Saddleable = net.minecraft.class_5146
/**
 * net.minecraft.class_917
 */
typealias MagmaCubeEntityRenderer = net.minecraft.class_917
/**
 * net.minecraft.class_1550
 */
typealias ElderGuardianEntity = net.minecraft.class_1550
/**
 * net.minecraft.class_1810
 */
typealias PickaxeItem = net.minecraft.class_1810
/**
 * net.minecraft.class_7968
 */
typealias TelemetryLogManager = net.minecraft.class_7968
/**
 * net.minecraft.class_7407
 */
typealias EntityPaintingFieldsRenameFix = net.minecraft.class_7407
/**
 * net.minecraft.class_3730
 */
typealias SpawnReason = net.minecraft.class_3730
/**
 * net.minecraft.class_9344
 */
typealias PlayerHeadBlockProfileFix = net.minecraft.class_9344
/**
 * net.minecraft.class_5216
 */
typealias DoublePerlinNoiseSampler = net.minecraft.class_5216
/**
 * net.minecraft.class_1723
 */
typealias PlayerScreenHandler = net.minecraft.class_1723
/**
 * net.minecraft.class_4234
 */
typealias AudioStream = net.minecraft.class_4234
/**
 * net.minecraft.class_7907
 */
typealias MemoryQuery<F, Value> = net.minecraft.class_7907<F, Value>
/**
 * net.minecraft.class_4649
 */
typealias PineFoliagePlacer = net.minecraft.class_4649
/**
 * net.minecraft.class_6108
 */
typealias CaveCarverConfig = net.minecraft.class_6108
/**
 * net.minecraft.class_5889
 */
typealias WorldBorderInitializeS2CPacket = net.minecraft.class_5889
/**
 * net.minecraft.class_3419
 */
typealias SoundCategory = net.minecraft.class_3419
/**
 * net.minecraft.class_1695
 */
typealias MinecartEntity = net.minecraft.class_1695
/**
 * net.minecraft.class_2482
 */
typealias SlabBlock = net.minecraft.class_2482
/**
 * net.minecraft.class_2577
 */
typealias CarpetBlock = net.minecraft.class_2577
/**
 * net.minecraft.class_8967
 */
typealias TrialSpawnerState = net.minecraft.class_8967
/**
 * net.minecraft.class_5586
 */
typealias GeodeCrackConfig = net.minecraft.class_5586
/**
 * net.minecraft.class_5281
 */
typealias StructureWorldAccess = net.minecraft.class_5281
/**
 * net.minecraft.class_5556
 */
typealias LeveledCauldronBlock = net.minecraft.class_5556
/**
 * net.minecraft.class_4951
 */
typealias WeepingVinesPlantBlock = net.minecraft.class_4951
/**
 * net.minecraft.class_5544
 */
typealias CandleBlock = net.minecraft.class_5544
/**
 * net.minecraft.class_2873
 */
typealias CreativeInventoryActionC2SPacket = net.minecraft.class_2873
/**
 * net.minecraft.class_939
 */
typealias RabbitEntityRenderer = net.minecraft.class_939
/**
 * net.minecraft.class_3085
 */
typealias LakeFeature = net.minecraft.class_3085
/**
 * net.minecraft.class_6877
 */
typealias PeriodicNotificationManager = net.minecraft.class_6877
/**
 * net.minecraft.class_174
 */
typealias Criteria = net.minecraft.class_174
/**
 * net.minecraft.class_1959
 */
typealias Biome = net.minecraft.class_1959
/**
 * net.minecraft.class_7969
 */
typealias TelemetryEventProperty<T> = net.minecraft.class_7969<T>
/**
 * net.minecraft.class_8723
 */
typealias DebugPoiRemovedCustomPayload = net.minecraft.class_8723
/**
 * net.minecraft.class_332
 */
typealias DrawContext = net.minecraft.class_332
/**
 * net.minecraft.class_5688
 */
typealias LandingBlock = net.minecraft.class_5688
/**
 * java.util.function.UnaryOperator
 */
typealias UnaryOperator<T> = java.util.function.UnaryOperator<T>
/**
 * net.minecraft.class_1373
 */
typealias CatSitOnBlockGoal = net.minecraft.class_1373
/**
 * net.minecraft.class_9697
 */
typealias SmithingRecipeInput = net.minecraft.class_9697
/**
 * net.minecraft.class_1842
 */
typealias Potion = net.minecraft.class_1842
/**
 * net.minecraft.class_1084
 */
typealias TextureResourceMetadata = net.minecraft.class_1084
/**
 * net.minecraft.class_6525
 */
typealias GcHeapSummarySample = net.minecraft.class_6525
/**
 * net.minecraft.class_883
 */
typealias DonkeyEntityRenderer<T> = net.minecraft.class_883<T>
/**
 * net.minecraft.class_1472
 */
typealias SheepEntity = net.minecraft.class_1472
/**
 * net.minecraft.class_329
 */
typealias InGameHud = net.minecraft.class_329
/**
 * net.minecraft.class_1570
 */
typealias GiantEntity = net.minecraft.class_1570
/**
 * net.minecraft.class_9329
 */
typealias ComponentPredicate = net.minecraft.class_9329
/**
 * net.minecraft.class_5530
 */
typealias NoPenaltySolidTargeting = net.minecraft.class_5530
/**
 * net.minecraft.class_3620
 */
typealias MapColor = net.minecraft.class_3620
/**
 * net.minecraft.class_6521
 */
typealias ChunkGenerationSample = net.minecraft.class_6521
/**
 * net.minecraft.class_6336
 */
typealias PrepareRamTask<E> = net.minecraft.class_6336<E>
/**
 * net.minecraft.class_3959
 */
typealias RaycastContext = net.minecraft.class_3959
/**
 * net.minecraft.class_1454
 */
typealias PufferfishEntity = net.minecraft.class_1454
/**
 * net.minecraft.class_979
 */
typealias ElytraFeatureRenderer<T, M> = net.minecraft.class_979<T, M>
/**
 * net.minecraft.class_248
 */
typealias FractionalPairList = net.minecraft.class_248
/**
 * net.minecraft.class_2752
 */
typealias EntityPassengersSetS2CPacket = net.minecraft.class_2752
/**
 * net.minecraft.class_5644
 */
typealias ValueCheckLootCondition = net.minecraft.class_5644
/**
 * net.minecraft.class_4537
 */
typealias ThrowablePotionItem = net.minecraft.class_4537
/**
 * net.minecraft.class_3965
 */
typealias BlockHitResult = net.minecraft.class_3965
/**
 * net.minecraft.class_9232
 */
typealias ChunkRegionEvent = net.minecraft.class_9232
/**
 * net.minecraft.class_3246
 */
typealias ServerHandshakeNetworkHandler = net.minecraft.class_3246
/**
 * net.minecraft.class_9657
 */
typealias FireworkExplosionPredicate = net.minecraft.class_9657
/**
 * net.minecraft.class_8023
 */
typealias GuiNavigation = net.minecraft.class_8023
/**
 * net.minecraft.class_2625
 */
typealias SignBlockEntity = net.minecraft.class_2625
/**
 * net.minecraft.class_6798
 */
typealias PlacementModifierType<P> = net.minecraft.class_6798<P>
/**
 * net.minecraft.class_8142
 */
typealias VanillaDamageTypeTagProvider = net.minecraft.class_8142
/**
 * net.minecraft.class_2656
 */
typealias CooldownUpdateS2CPacket = net.minecraft.class_2656
/**
 * net.minecraft.class_8662
 */
typealias TextIconButtonWidget = net.minecraft.class_8662
/**
 * net.minecraft.class_2905
 */
typealias LoginHelloS2CPacket = net.minecraft.class_2905
/**
 * net.minecraft.class_2968
 */
typealias AutomaticItemPlacementContext = net.minecraft.class_2968
/**
 * net.minecraft.class_2994
 */
typealias DedicatedServer = net.minecraft.class_2994
/**
 * net.minecraft.class_4558
 */
typealias AbstractCriterion<T> = net.minecraft.class_4558<T>
/**
 * net.minecraft.class_2509
 */
typealias NbtOps = net.minecraft.class_2509
/**
 * net.minecraft.class_1667
 */
typealias ArrowEntity = net.minecraft.class_1667
/**
 * net.minecraft.class_4117
 */
typealias FindWalkTargetTask = net.minecraft.class_4117
/**
 * net.minecraft.class_7252
 */
typealias WardenAttackablesSensor = net.minecraft.class_7252
/**
 * net.minecraft.class_1362
 */
typealias FormCaravanGoal = net.minecraft.class_1362
/**
 * net.minecraft.class_1220
 */
typealias IdentifierNormalizingSchema = net.minecraft.class_1220
/**
 * net.minecraft.class_1812
 */
typealias PotionItem = net.minecraft.class_1812
/**
 * net.minecraft.class_5348
 */
typealias StringVisitable = net.minecraft.class_5348
/**
 * net.minecraft.class_5597
 */
typealias SinglePartEntityModel<E> = net.minecraft.class_5597<E>
/**
 * net.minecraft.class_2252
 */
typealias BlockPredicateArgumentType = net.minecraft.class_2252
/**
 * net.minecraft.class_2446
 */
typealias RecipeProvider = net.minecraft.class_2446
/**
 * net.minecraft.class_4661
 */
typealias LeavesVineTreeDecorator = net.minecraft.class_4661
/**
 * net.minecraft.class_1156
 */
typealias TutorialManager = net.minecraft.class_1156
/**
 * net.minecraft.class_4230
 */
typealias AlUtil = net.minecraft.class_4230
/**
 * net.minecraft.class_8984
 */
typealias TrialSpawnerBlockEntityRenderer = net.minecraft.class_8984
/**
 * net.minecraft.class_6875
 */
typealias StructurePlacementType<SP> = net.minecraft.class_6875<SP>
/**
 * net.minecraft.class_2529
 */
typealias PacketEncryptor = net.minecraft.class_2529
/**
 * net.minecraft.class_5598
 */
typealias SkullBlockEntityModel = net.minecraft.class_5598
/**
 * net.minecraft.class_434
 */
typealias DownloadingTerrainScreen = net.minecraft.class_434
/**
 * net.minecraft.class_8972
 */
typealias BreezeAnimations = net.minecraft.class_8972
/**
 * net.minecraft.class_4749
 */
typealias MultiplayerWarningScreen = net.minecraft.class_4749
/**
 * net.minecraft.class_5284
 */
typealias ChunkGeneratorSettings = net.minecraft.class_5284
/**
 * net.minecraft.class_8212
 */
typealias ChunkBiomeDataS2CPacket = net.minecraft.class_8212
/**
 * net.minecraft.class_9400
 */
typealias ParseResults = net.minecraft.class_9400
/**
 * net.minecraft.class_3675
 */
typealias InputUtil = net.minecraft.class_3675
/**
 * net.minecraft.class_2090
 */
typealias LocationPredicate = net.minecraft.class_2090
/**
 * net.minecraft.class_2262
 */
typealias BlockPosArgumentType = net.minecraft.class_2262
/**
 * net.minecraft.class_2621
 */
typealias LootableContainerBlockEntity = net.minecraft.class_2621
/**
 * net.minecraft.class_3910
 */
typealias CartographyTableScreenHandler = net.minecraft.class_3910
/**
 * net.minecraft.class_1203
 */
typealias OptionsLowerCaseLanguageFix = net.minecraft.class_1203
/**
 * net.minecraft.class_2544
 */
typealias WallBlock = net.minecraft.class_2544
/**
 * net.minecraft.class_4494
 */
typealias GlDebugInfo = net.minecraft.class_4494
/**
 * net.minecraft.class_8865
 */
typealias FixedCommandAction<T> = net.minecraft.class_8865<T>
/**
 * net.minecraft.class_1790
 */
typealias DecorationItem = net.minecraft.class_1790
/**
 * net.minecraft.class_1079
 */
typealias AnimationResourceMetadata = net.minecraft.class_1079
/**
 * net.minecraft.class_4282
 */
typealias ChunkRenderDistanceCenterS2CPacket = net.minecraft.class_4282
/**
 * net.minecraft.class_8926
 */
typealias OxidizableGrateBlock = net.minecraft.class_8926
/**
 * net.minecraft.class_5321
 */
typealias RegistryKey<T> = net.minecraft.class_5321<T>
/**
 * com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
typealias SuggestionsBuilder = com.mojang.brigadier.suggestion.SuggestionsBuilder
/**
 * net.minecraft.class_2754
 */
typealias property_EnumProperty<T> = net.minecraft.class_2754<T>
/**
 * net.minecraft.class_5352
 */
typealias ResourcePackSource = net.minecraft.class_5352
/**
 * net.minecraft.class_4351
 */
typealias UploadStatus = net.minecraft.class_4351
/**
 * net.minecraft.class_7472
 */
typealias CommandExecutionC2SPacket = net.minecraft.class_7472
/**
 * net.minecraft.class_1167
 */
typealias EntityTransformFix = net.minecraft.class_1167
/**
 * net.minecraft.class_6777
 */
typealias OnlineOptionsScreen = net.minecraft.class_6777
/**
 * net.minecraft.class_7723
 */
typealias DimensionOptionsRegistryHolder = net.minecraft.class_7723
/**
 * net.minecraft.class_4438
 */
typealias RealmsConnectTask = net.minecraft.class_4438
/**
 * net.minecraft.class_9184
 */
typealias Schema3807 = net.minecraft.class_9184
/**
 * net.minecraft.class_9185
 */
typealias Schema3808 = net.minecraft.class_9185
/**
 * net.minecraft.class_1496
 */
typealias AbstractHorseEntity = net.minecraft.class_1496
/**
 * net.minecraft.class_3580
 */
typealias BlockStateFlattening = net.minecraft.class_3580
/**
 * net.minecraft.class_1060
 */
typealias TextureManager = net.minecraft.class_1060
/**
 * net.minecraft.class_717
 */
typealias FireSmokeParticle = net.minecraft.class_717
/**
 * net.minecraft.class_807
 */
typealias WeightedUnbakedModel = net.minecraft.class_807
/**
 * net.minecraft.class_5554
 */
typealias LightningRodBlock = net.minecraft.class_5554
/**
 * net.minecraft.class_2492
 */
typealias SoulSandBlock = net.minecraft.class_2492
/**
 * net.minecraft.class_1717
 */
typealias FurnaceFuelSlot = net.minecraft.class_1717
/**
 * net.minecraft.class_7438
 */
typealias ChatMessageS2CPacket = net.minecraft.class_7438
/**
 * net.minecraft.class_2978
 */
typealias CoralFeature = net.minecraft.class_2978
/**
 * net.minecraft.class_9119
 */
typealias StructureBlockFinder = net.minecraft.class_9119
/**
 * net.minecraft.class_7206
 */
typealias SculkChargeParticle = net.minecraft.class_7206
/**
 * net.minecraft.class_5867
 */
typealias ChunkSectionCache = net.minecraft.class_5867
/**
 * net.minecraft.class_9270
 */
typealias Schema3818 = net.minecraft.class_9270
/**
 * net.minecraft.class_1571
 */
typealias GhastEntity = net.minecraft.class_1571
/**
 * net.minecraft.class_2479
 */
typealias NbtByteArray = net.minecraft.class_2479
/**
 * net.minecraft.class_1252
 */
typealias Schema808 = net.minecraft.class_1252
/**
 * net.minecraft.class_9253
 */
typealias Schema3816 = net.minecraft.class_9253
/**
 * net.minecraft.class_6861
 */
typealias LifecycledResourceManagerImpl = net.minecraft.class_6861
/**
 * net.minecraft.class_9824
 */
typealias BlockStatesLoader = net.minecraft.class_9824
/**
 * net.minecraft.class_1301
 */
typealias EntityPredicates = net.minecraft.class_1301
/**
 * net.minecraft.class_3908
 */
typealias NamedScreenHandlerFactory = net.minecraft.class_3908
/**
 * net.minecraft.class_5713
 */
typealias GameEventDispatcher = net.minecraft.class_5713
/**
 * net.minecraft.class_7649
 */
typealias FilterMask = net.minecraft.class_7649
/**
 * net.minecraft.class_8658
 */
typealias GuiAtlasManager = net.minecraft.class_8658
/**
 * net.minecraft.class_4485
 */
typealias SectorMap = net.minecraft.class_4485
/**
 * net.minecraft.class_4876
 */
typealias RealmsNews = net.minecraft.class_4876
/**
 * java.time.Duration
 */
typealias Duration = java.time.Duration
/**
 * net.minecraft.class_9454
 */
typealias Schema3825 = net.minecraft.class_9454
/**
 * net.minecraft.class_1696
 */
typealias FurnaceMinecartEntity = net.minecraft.class_1696
/**
 * net.minecraft.class_2269
 */
typealias ButtonBlock = net.minecraft.class_2269
/**
 * net.minecraft.class_4755
 */
typealias Schema2501 = net.minecraft.class_4755
/**
 * net.minecraft.class_4756
 */
typealias Schema2502 = net.minecraft.class_4756
/**
 * net.minecraft.class_5235
 */
typealias EditGameRulesScreen = net.minecraft.class_5235
/**
 * net.minecraft.class_4847
 */
typealias Schema2509 = net.minecraft.class_4847
/**
 * com.mojang.datafixers.DSL.TypeReference
 */
typealias DSL_TypeReference = com.mojang.datafixers.DSL.TypeReference
/**
 * net.minecraft.class_4804
 */
typealias Schema2505 = net.minecraft.class_4804
/**
 * net.minecraft.class_1313
 */
typealias MovementType = net.minecraft.class_1313
/**
 * net.minecraft.class_3543
 */
typealias OctaveSimplexNoiseSampler = net.minecraft.class_3543
/**
 * net.minecraft.class_3986
 */
typealias TraderLlamaEntity = net.minecraft.class_3986
/**
 * net.minecraft.class_3555
 */
typealias AdvancementsFix = net.minecraft.class_3555
/**
 * net.minecraft.class_9127
 */
typealias NetworkState<T> = net.minecraft.class_9127<T>
/**
 * net.minecraft.class_3937
 */
typealias CampfireSmokeParticle = net.minecraft.class_3937
/**
 * net.minecraft.class_3732
 */
typealias PatrolEntity = net.minecraft.class_3732
/**
 * net.minecraft.class_2356
 */
typealias FlowerBlock = net.minecraft.class_2356
/**
 * net.minecraft.class_3859
 */
typealias BlastingRecipe = net.minecraft.class_3859
/**
 * net.minecraft.class_8744
 */
typealias StatusEffectFix = net.minecraft.class_8744
/**
 * net.minecraft.class_4979
 */
typealias Schema2519 = net.minecraft.class_4979
/**
 * net.minecraft.class_742
 */
typealias AbstractClientPlayerEntity = net.minecraft.class_742
/**
 * net.minecraft.class_6319
 */
typealias FieldsAreNonnullByDefault = net.minecraft.class_6319
/**
 * net.minecraft.class_3141
 */
typealias RandomFeatureConfig = net.minecraft.class_3141
/**
 * net.minecraft.class_1180
 */
typealias ItemLoreToTextFix = net.minecraft.class_1180
/**
 * net.minecraft.class_2490
 */
typealias SlimeBlock = net.minecraft.class_2490
/**
 * net.minecraft.class_2826
 */
typealias ChunkSection = net.minecraft.class_2826
/**
 * net.minecraft.class_1944
 */
typealias LightType = net.minecraft.class_1944
/**
 * net.minecraft.class_5130
 */
typealias Schema2522 = net.minecraft.class_5130
/**
 * net.minecraft.class_9243
 */
typealias FontFilterType = net.minecraft.class_9243
/**
 * net.minecraft.class_7833
 */
typealias RotationAxis = net.minecraft.class_7833
/**
 * net.minecraft.class_4603
 */
typealias InGameOverlayRenderer = net.minecraft.class_4603
/**
 * net.minecraft.class_2512
 */
typealias NbtHelper = net.minecraft.class_2512
/**
 * net.minecraft.class_1590
 */
typealias ZombifiedPiglinEntity = net.minecraft.class_1590
/**
 * net.minecraft.class_9822
 */
typealias StructureLiquidSettings = net.minecraft.class_9822
/**
 * net.minecraft.class_2506
 */
typealias StainedGlassBlock = net.minecraft.class_2506
/**
 * net.minecraft.class_9091
 */
typealias CookieResponseC2SPacket = net.minecraft.class_9091
/**
 * net.minecraft.class_5620
 */
typealias CauldronBehavior = net.minecraft.class_5620
/**
 * net.minecraft.class_4496
 */
typealias ModelUtil = net.minecraft.class_4496
/**
 * net.minecraft.class_3285
 */
typealias ResourcePackProvider = net.minecraft.class_3285
/**
 * net.minecraft.class_3797
 */
typealias MinecraftVersion = net.minecraft.class_3797
/**
 * net.minecraft.class_2320
 */
typealias TallPlantBlock = net.minecraft.class_2320
/**
 * net.minecraft.class_8937
 */
typealias Frame = net.minecraft.class_8937
/**
 * net.minecraft.class_303
 */
typealias ChatHudLine = net.minecraft.class_303
/**
 * net.minecraft.class_951
 */
typealias SquidEntityRenderer<T> = net.minecraft.class_951<T>
/**
 * net.minecraft.class_4285
 */
typealias PointOfInterestReorganizationFix = net.minecraft.class_4285
/**
 * net.minecraft.class_901
 */
typealias FallingBlockEntityRenderer = net.minecraft.class_901
/**
 * java.util.function.Supplier
 */
typealias Supplier<T> = java.util.function.Supplier<T>
/**
 * net.minecraft.class_3916
 */
typealias LecternScreenHandler = net.minecraft.class_3916
/**
 * net.minecraft.class_4050
 */
typealias EntityPose = net.minecraft.class_4050
/**
 * net.minecraft.class_6895
 */
typealias RegistryCodecs = net.minecraft.class_6895
/**
 * net.minecraft.class_2639
 */
typealias CommandSuggestionsS2CPacket = net.minecraft.class_2639
/**
 * net.minecraft.class_5301
 */
typealias Schema2551 = net.minecraft.class_5301
/**
 * net.minecraft.class_1346
 */
typealias ChaseBoatGoal = net.minecraft.class_1346
/**
 * net.minecraft.class_7108
 */
typealias FrogEatEntityTask = net.minecraft.class_7108
/**
 * net.minecraft.class_8064
 */
typealias CyclingSlotIcon = net.minecraft.class_8064
/**
 * net.minecraft.class_887
 */
typealias CreeperEntityRenderer = net.minecraft.class_887
/**
 * net.minecraft.class_3173
 */
typealias SimpleBlockFeature = net.minecraft.class_3173
/**
 * net.minecraft.class_7403
 */
typealias DataWriter = net.minecraft.class_7403
/**
 * net.minecraft.class_7369
 */
typealias CatVariantTags = net.minecraft.class_7369
/**
 * net.minecraft.class_5416
 */
typealias Schema2568 = net.minecraft.class_5416
/**
 * net.minecraft.class_4111
 */
typealias VillagerBreedTask = net.minecraft.class_4111
/**
 * net.minecraft.class_7889
 */
typealias ValueLookupTagProvider<T> = net.minecraft.class_7889<T>
/**
 * net.minecraft.class_5999
 */
typealias Schema2571 = net.minecraft.class_5999
/**
 * net.minecraft.class_3149
 */
typealias TimeCommand = net.minecraft.class_3149
/**
 * net.minecraft.class_4286
 */
typealias CheckboxWidget = net.minecraft.class_4286
/**
 * net.minecraft.class_2398
 */
typealias ParticleTypes = net.minecraft.class_2398
/**
 * net.minecraft.class_2481
 */
typealias NbtByte = net.minecraft.class_2481
/**
 * net.minecraft.class_9365
 */
typealias ComponentSubPredicate<T> = net.minecraft.class_9365<T>
/**
 * net.minecraft.class_4808
 */
typealias PacifyTask = net.minecraft.class_4808
/**
 * net.minecraft.class_1722
 */
typealias HopperScreenHandler = net.minecraft.class_1722
/**
 * net.minecraft.class_9766
 */
typealias DecoratedPotPattern = net.minecraft.class_9766
/**
 * net.minecraft.class_4059
 */
typealias AnimalArmorItem = net.minecraft.class_4059
/**
 * net.minecraft.class_3566
 */
typealias BlockEntityBlockStateFix = net.minecraft.class_3566
/**
 * net.minecraft.class_3950
 */
typealias WorldGenerationProgressListenerFactory = net.minecraft.class_3950
/**
 * net.minecraft.class_5609
 */
typealias ModelData = net.minecraft.class_5609
/**
 * net.minecraft.class_2030
 */
typealias EnchantedItemCriterion = net.minecraft.class_2030
/**
 * net.minecraft.class_19
 */
typealias MapFrameMarker = net.minecraft.class_19
/**
 * net.minecraft.class_2405
 */
typealias DataProvider = net.minecraft.class_2405
/**
 * net.minecraft.class_8828
 */
typealias PlainTextContent = net.minecraft.class_8828
/**
 * net.minecraft.class_8985
 */
typealias BreezeDebugRenderer = net.minecraft.class_8985
/**
 * net.minecraft.class_1421
 */
typealias AmbientEntity = net.minecraft.class_1421
/**
 * net.minecraft.class_500
 */
typealias MultiplayerScreen = net.minecraft.class_500
/**
 * net.minecraft.class_7439
 */
typealias GameMessageS2CPacket = net.minecraft.class_7439
/**
 * net.minecraft.class_3595
 */
typealias EntityBlockStateFix = net.minecraft.class_3595
/**
 * net.minecraft.class_983
 */
typealias ShoulderParrotFeatureRenderer<T> = net.minecraft.class_983<T>
/**
 * net.minecraft.class_413
 */
typealias CustomizeFlatLevelScreen = net.minecraft.class_413
/**
 * net.minecraft.class_5900
 */
typealias TeamS2CPacket = net.minecraft.class_5900
/**
 * net.minecraft.class_5669
 */
typealias LootScoreProviderType = net.minecraft.class_5669
/**
 * net.minecraft.class_2694
 */
typealias CachedBlockPosition = net.minecraft.class_2694
/**
 * net.minecraft.class_4772
 */
typealias SproutsBlock = net.minecraft.class_4772
/**
 * net.minecraft.class_3418
 */
typealias ShiftableStructurePiece = net.minecraft.class_3418
/**
 * net.minecraft.class_1727
 */
typealias TradeOutputSlot = net.minecraft.class_1727
/**
 * net.minecraft.class_1215
 */
typealias AddTrappedChestFix = net.minecraft.class_1215
/**
 * net.minecraft.class_9114
 */
typealias BatchListener = net.minecraft.class_9114
/**
 * net.minecraft.class_607
 */
typealias SkullEntityModel = net.minecraft.class_607
/**
 * net.minecraft.server.MinecraftServer
 */
typealias MinecraftServer = net.minecraft.server.MinecraftServer
/**
 * net.minecraft.class_1889
 */
typealias EnchantmentLevelEntry = net.minecraft.class_1889
/**
 * net.minecraft.class_5955
 */
typealias Oxidizable = net.minecraft.class_5955
/**
 * net.minecraft.class_1517
 */
typealias HoldingPatternPhase = net.minecraft.class_1517
/**
 * net.minecraft.class_8924
 */
typealias OxidizableBulbBlock = net.minecraft.class_8924
/**
 * net.minecraft.class_2670
 */
typealias KeepAliveS2CPacket = net.minecraft.class_2670
/**
 * net.minecraft.class_3070
 */
typealias IceSpikeFeature = net.minecraft.class_3070
/**
 * net.minecraft.class_8809
 */
typealias TextFixes = net.minecraft.class_8809
/**
 * net.minecraft.class_1526
 */
typealias PhaseManager = net.minecraft.class_1526
/**
 * net.minecraft.class_5577
 */
typealias EntityLookup<T> = net.minecraft.class_5577<T>
/**
 * net.minecraft.class_2360
 */
typealias FrostedIceBlock = net.minecraft.class_2360
/**
 * net.minecraft.class_994
 */
typealias SheepWoolFeatureRenderer = net.minecraft.class_994
/**
 * net.minecraft.class_3110
 */
typealias SayCommand = net.minecraft.class_3110
/**
 * net.minecraft.class_2780
 */
typealias WorldBorderListener = net.minecraft.class_2780
/**
 * net.minecraft.class_9021
 */
typealias FixedNumberFormat = net.minecraft.class_9021
/**
 * net.minecraft.class_4071
 */
typealias Overlay = net.minecraft.class_4071
/**
 * net.minecraft.class_921
 */
typealias LlamaEntityRenderer = net.minecraft.class_921
/**
 * net.minecraft.class_1678
 */
typealias ShulkerBulletEntity = net.minecraft.class_1678
/**
 * net.minecraft.class_2608
 */
typealias DropperBlockEntity = net.minecraft.class_2608
/**
 * net.minecraft.class_6817
 */
typealias PlacedFeatures = net.minecraft.class_6817
/**
 * net.minecraft.class_4010
 */
typealias ProfiledResourceReload = net.minecraft.class_4010
/**
 * net.minecraft.class_4150
 */
typealias VillagerHostilesSensor = net.minecraft.class_4150
/**
 * net.minecraft.class_7789
 */
typealias EntityLootTableGenerator = net.minecraft.class_7789
/**
 * net.minecraft.class_5404
 */
typealias OptionFix = net.minecraft.class_5404
/**
 * net.minecraft.class_6867
 */
typealias StructureSettingsFlattenFix = net.minecraft.class_6867
/**
 * net.minecraft.class_4144
 */
typealias HurtBySensor = net.minecraft.class_4144
/**
 * net.minecraft.class_8108
 */
typealias DamageScaling = net.minecraft.class_8108
/**
 * net.minecraft.class_1731
 */
typealias CraftingResultInventory = net.minecraft.class_1731
/**
 * net.minecraft.class_3045
 */
typealias MeCommand = net.minecraft.class_3045
/**
 * net.minecraft.class_376
 */
typealias BlankFont = net.minecraft.class_376
/**
 * net.minecraft.class_8949
 */
typealias BreezeEntity = net.minecraft.class_8949
/**
 * net.minecraft.class_2372
 */
typealias GrassBlock = net.minecraft.class_2372
/**
 * net.minecraft.class_537
 */
typealias SpectatorMenuCommand = net.minecraft.class_537
/**
 * net.minecraft.class_5203
 */
typealias ThreeLayersFeatureSize = net.minecraft.class_5203
/**
 * net.minecraft.class_2397
 */
typealias LeavesBlock = net.minecraft.class_2397
/**
 * net.minecraft.class_5919
 */
typealias FossilFeatureConfig = net.minecraft.class_5919
/**
 * net.minecraft.class_4274
 */
typealias CatSpawner = net.minecraft.class_4274
/**
 * net.minecraft.class_1505
 */
typealias SkeletonHorseTrapTriggerGoal = net.minecraft.class_1505
/**
 * net.minecraft.class_7500
 */
typealias SignatureVerifier = net.minecraft.class_7500
/**
 * java.util.function.BooleanSupplier
 */
typealias BooleanSupplier = java.util.function.BooleanSupplier
/**
 * net.minecraft.class_9035
 */
typealias BreezeShootIfStuckTask = net.minecraft.class_9035
/**
 * net.minecraft.class_9320
 */
typealias SetComponentsLootFunction = net.minecraft.class_9320
/**
 * net.minecraft.class_9667
 */
typealias ContainerComponentModifiers = net.minecraft.class_9667
/**
 * net.minecraft.class_7780
 */
typealias CombinedDynamicRegistries<T> = net.minecraft.class_7780<T>
/**
 * net.minecraft.class_8523
 */
typealias DependencyTracker<K, V> = net.minecraft.class_8523<K, V>
/**
 * net.minecraft.class_4290
 */
typealias WalkHomeTask = net.minecraft.class_4290
/**
 * net.minecraft.class_9719
 */
typealias DamageItemEnchantmentEffect = net.minecraft.class_9719
/**
 * net.minecraft.class_5532
 */
typealias NoPenaltyTargeting = net.minecraft.class_5532
/**
 * net.minecraft.class_7941
 */
typealias TelemetryEventWidget = net.minecraft.class_7941
/**
 * net.minecraft.class_8253
 */
typealias CherryLeavesParticle = net.minecraft.class_8253
/**
 * net.minecraft.class_4277
 */
typealias BubbleColumnSoundPlayer = net.minecraft.class_4277
/**
 * net.minecraft.class_4156
 */
typealias PointOfInterest = net.minecraft.class_4156
/**
 * net.minecraft.class_7615
 */
typealias MessageVerifier = net.minecraft.class_7615
/**
 * net.minecraft.class_516
 */
typealias RecipeResultCollection = net.minecraft.class_516
/**
 * net.minecraft.class_6765
 */
typealias VanillaTerrainParametersCreator = net.minecraft.class_6765
/**
 * net.minecraft.class_5916
 */
typealias ScreenHandlerSyncHandler = net.minecraft.class_5916
/**
 * net.minecraft.class_6848
 */
typealias MatchingBlockTagPredicate = net.minecraft.class_6848
/**
 * net.minecraft.class_531
 */
typealias SpectatorMenu = net.minecraft.class_531
/**
 * net.minecraft.class_2054
 */
typealias FilledBucketCriterion = net.minecraft.class_2054
/**
 * net.minecraft.class_4962
 */
typealias WorldUuidFix = net.minecraft.class_4962
/**
 * net.minecraft.class_1628
 */
typealias SpiderEntity = net.minecraft.class_1628
/**
 * net.minecraft.class_2467
 */
typealias VanillaEntityTypeTagProvider = net.minecraft.class_2467
/**
 * net.minecraft.class_6727
 */
typealias TheNetherBiomeCreator = net.minecraft.class_6727
/**
 * net.minecraft.class_2674
 */
typealias PistonHandler = net.minecraft.class_2674
/**
 * net.minecraft.class_8032
 */
typealias AccessibilityOnboardingScreen = net.minecraft.class_8032
/**
 * net.minecraft.class_7393
 */
typealias VanillaCatVariantTagProvider = net.minecraft.class_7393
/**
 * net.minecraft.class_8100
 */
typealias WorldCreator = net.minecraft.class_8100
/**
 * net.minecraft.class_3979
 */
typealias StonecutterScreen = net.minecraft.class_3979
/**
 * net.minecraft.class_3769
 */
typealias PatrolSpawner = net.minecraft.class_3769
/**
 * net.minecraft.class_3668
 */
typealias FillPlayerHeadLootFunction = net.minecraft.class_3668
/**
 * net.minecraft.class_1059
 */
typealias SpriteAtlasTexture = net.minecraft.class_1059
/**
 * net.minecraft.class_308
 */
typealias DiffuseLighting = net.minecraft.class_308
/**
 * net.minecraft.class_5797
 */
typealias CraftingRecipeJsonBuilder = net.minecraft.class_5797
/**
 * net.minecraft.class_611
 */
typealias SpiderEntityModel<T> = net.minecraft.class_611<T>
/**
 * net.minecraft.class_5188
 */
typealias LegacySinglePoolElement = net.minecraft.class_5188
/**
 * net.minecraft.class_9152
 */
typealias CommonPackets = net.minecraft.class_9152
/**
 * net.minecraft.class_955
 */
typealias TridentEntityRenderer = net.minecraft.class_955
/**
 * net.minecraft.class_85
 */
typealias LeafEntry = net.minecraft.class_85
/**
 * net.minecraft.class_990
 */
typealias PandaHeldItemFeatureRenderer = net.minecraft.class_990
/**
 * net.minecraft.class_3884
 */
typealias ModelWithHat = net.minecraft.class_3884
/**
 * net.minecraft.class_6898
 */
typealias RegistryEntryListCodec<E> = net.minecraft.class_6898<E>
/**
 * net.minecraft.class_2680
 */
typealias BlockState = net.minecraft.class_2680
/**
 * net.minecraft.class_863
 */
typealias DebugRenderer = net.minecraft.class_863
/**
 * net.minecraft.class_6754
 */
typealias EmptyTickSchedulers = net.minecraft.class_6754
/**
 * net.minecraft.class_3095
 */
typealias RecipeCommand = net.minecraft.class_3095
/**
 * net.minecraft.class_4093
 */
typealias ReentrantThreadExecutor<R> = net.minecraft.class_4093<R>
/**
 * net.minecraft.class_4969
 */
typealias RespawnAnchorBlock = net.minecraft.class_4969
/**
 * net.minecraft.class_5473
 */
typealias AngleArgumentType = net.minecraft.class_5473
/**
 * net.minecraft.class_4834
 */
typealias PiglinSpecificSensor = net.minecraft.class_4834
/**
 * net.minecraft.class_3847
 */
typealias TaskQueue<T, F> = net.minecraft.class_3847<T, F>
/**
 * net.minecraft.class_7766
 */
typealias SpriteLoader = net.minecraft.class_7766
/**
 * net.minecraft.class_2751
 */
typealias ScoreboardObjectiveUpdateS2CPacket = net.minecraft.class_2751
/**
 * net.minecraft.class_6874
 */
typealias StructurePlacement = net.minecraft.class_6874
/**
 * net.minecraft.class_8036
 */
typealias PacketUnbundler = net.minecraft.class_8036
/**
 * net.minecraft.class_2471
 */
typealias VanillaItemTagProvider = net.minecraft.class_2471
/**
 * net.minecraft.class_2972
 */
typealias CoralClawFeature = net.minecraft.class_2972
/**
 * net.minecraft.class_973
 */
typealias StuckArrowsFeatureRenderer<T, M> = net.minecraft.class_973<T, M>
/**
 * net.minecraft.class_5178
 */
typealias BastionUnitsData = net.minecraft.class_5178
/**
 * net.minecraft.class_1584
 */
typealias RavagerEntity = net.minecraft.class_1584
/**
 * net.minecraft.class_6343
 */
typealias VeryBiasedToBottomHeightProvider = net.minecraft.class_6343
/**
 * net.minecraft.class_5869
 */
typealias RavineCarverConfig = net.minecraft.class_5869
/**
 * net.minecraft.class_5167
 */
typealias HorseMarkingFeatureRenderer = net.minecraft.class_5167
/**
 * net.minecraft.class_6742
 */
typealias ChunkLevelTagRenameFix = net.minecraft.class_6742
/**
 * net.minecraft.class_7130
 */
typealias SculkVeinBlock = net.minecraft.class_7130
/**
 * net.minecraft.class_8703
 */
typealias VarInts = net.minecraft.class_8703
/**
 * net.minecraft.class_968
 */
typealias ZombieBaseEntityRenderer<T, M> = net.minecraft.class_968<T, M>
/**
 * net.minecraft.class_4827
 */
typealias WantNewItemTask<E> = net.minecraft.class_4827<E>
/**
 * net.minecraft.class_9792
 */
typealias JukeboxPlayableComponent = net.minecraft.class_9792
/**
 * net.minecraft.class_5635
 */
typealias PowderSnowBlock = net.minecraft.class_5635
/**
 * net.minecraft.class_9749
 */
typealias AdvancedExplosionBehavior = net.minecraft.class_9749
/**
 * net.minecraft.class_4120
 */
typealias GoTowardsLookTargetTask = net.minecraft.class_4120
/**
 * net.minecraft.class_5671
 */
typealias LootScoreProviderTypes = net.minecraft.class_5671
/**
 * net.minecraft.class_8208
 */
typealias IconWidget = net.minecraft.class_8208
/**
 * net.minecraft.class_2773
 */
typealias WireConnection = net.minecraft.class_2773
/**
 * net.minecraft.class_6646
 */
typealias blockpredicate_BlockPredicate = net.minecraft.class_6646
/**
 * net.minecraft.class_446
 */
typealias VideoOptionsScreen = net.minecraft.class_446
/**
 * net.minecraft.class_7179
 */
typealias Transformation = net.minecraft.class_7179
/**
 * net.minecraft.class_2275
 */
typealias AbstractCauldronBlock = net.minecraft.class_2275
/**
 * net.minecraft.class_225
 */
typealias RandomChanceWithEnchantedBonusLootCondition = net.minecraft.class_225
/**
 * net.minecraft.class_4129
 */
typealias VillagerTaskListProvider = net.minecraft.class_4129
/**
 * net.minecraft.class_3765
 */
typealias Raid = net.minecraft.class_3765
/**
 * net.minecraft.class_3826
 */
typealias RuleStructureProcessor = net.minecraft.class_3826
/**
 * net.minecraft.class_9349
 */
typealias SlotRanges = net.minecraft.class_9349
/**
 * net.minecraft.class_1345
 */
typealias EatGrassGoal = net.minecraft.class_1345
/**
 * net.minecraft.class_9393
 */
typealias ParsingState<S> = net.minecraft.class_9393<S>
/**
 * net.minecraft.class_4205
 */
typealias GoalSelectorDebugRenderer = net.minecraft.class_4205
/**
 * net.minecraft.class_7756
 */
typealias ClientDynamicRegistryType = net.minecraft.class_7756
/**
 * net.minecraft.class_7965
 */
typealias TelemetrySender = net.minecraft.class_7965
/**
 * net.minecraft.class_7604
 */
typealias SentMessage = net.minecraft.class_7604
/**
 * net.minecraft.class_2568
 */
typealias HoverEvent = net.minecraft.class_2568
/**
 * net.minecraft.class_890
 */
typealias DrownedEntityRenderer = net.minecraft.class_890
/**
 * net.minecraft.class_1422
 */
typealias FishEntity = net.minecraft.class_1422
/**
 * net.minecraft.class_9725
 */
typealias IgniteEnchantmentEffect = net.minecraft.class_9725
/**
 * net.minecraft.class_5139
 */
typealias ForkingTrunkPlacer = net.minecraft.class_5139
/**
 * net.minecraft.class_5192
 */
typealias BlackstoneReplacementStructureProcessor = net.minecraft.class_5192
/**
 * net.minecraft.class_1219
 */
typealias VillagerTradeFix = net.minecraft.class_1219
/**
 * net.minecraft.class_620
 */
typealias VillagerResemblingModel<T> = net.minecraft.class_620<T>
/**
 * net.minecraft.class_8946
 */
typealias LongJumpUtil = net.minecraft.class_8946
/**
 * net.minecraft.class_3134
 */
typealias StopCommand = net.minecraft.class_3134
/**
 * net.minecraft.class_5806
 */
typealias HangingRootsBlock = net.minecraft.class_5806
/**
 * net.minecraft.class_1840
 */
typealias WritableBookItem = net.minecraft.class_1840
/**
 * net.minecraft.class_5717
 */
typealias PositionSourceType<T> = net.minecraft.class_5717<T>
/**
 * net.minecraft.class_1945
 */
typealias ModifiableWorld = net.minecraft.class_1945
/**
 * net.minecraft.class_437
 */
typealias Screen = net.minecraft.class_437
/**
 * net.minecraft.class_5545
 */
typealias CandleCakeBlock = net.minecraft.class_5545
/**
 * net.minecraft.class_1090
 */
typealias BuiltinBakedModel = net.minecraft.class_1090
/**
 * net.minecraft.class_980
 */
typealias DrownedOverlayFeatureRenderer<T> = net.minecraft.class_980<T>
/**
 * net.minecraft.class_9666
 */
typealias ContainerComponentModifier<T> = net.minecraft.class_9666<T>
/**
 * net.minecraft.class_4522
 */
typealias TickLimitExceededException = net.minecraft.class_4522
/**
 * net.minecraft.class_2010
 */
typealias ConsumeItemCriterion = net.minecraft.class_2010
/**
 * net.minecraft.class_458
 */
typealias ControlsOptionsScreen = net.minecraft.class_458
/**
 * net.minecraft.class_5870
 */
typealias RavineCarver = net.minecraft.class_5870
/**
 * net.minecraft.class_4440
 */
typealias ResettingWorldTask = net.minecraft.class_4440
/**
 * net.minecraft.class_5144
 */
typealias ZoglinEntityRenderer = net.minecraft.class_5144
/**
 * net.minecraft.class_694
 */
typealias LavaEmberParticle = net.minecraft.class_694
/**
 * net.minecraft.class_323
 */
typealias MonitorTracker = net.minecraft.class_323
/**
 * net.minecraft.class_4284
 */
typealias DataFixTypes = net.minecraft.class_4284
/**
 * net.minecraft.class_3011
 */
typealias DiskFeature = net.minecraft.class_3011
/**
 * net.minecraft.class_5821
 */
typealias FeatureContext<FC> = net.minecraft.class_5821<FC>
/**
 * java.lang.Exception
 */
typealias Exception = java.lang.Exception
/**
 * java.math.BigDecimal
 */
typealias BigDecimal = java.math.BigDecimal
/**
 * net.minecraft.class_799
 */
typealias ModelOverride = net.minecraft.class_799
/**
 * net.minecraft.class_946
 */
typealias SkeletonEntityRenderer<T> = net.minecraft.class_946<T>