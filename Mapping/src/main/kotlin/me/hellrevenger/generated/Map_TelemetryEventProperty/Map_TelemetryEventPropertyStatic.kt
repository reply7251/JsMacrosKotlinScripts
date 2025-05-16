package me.hellrevenger.generated.Map_TelemetryEventProperty
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TelemetryEventPropertyKt {
    /**
     * field_41473
     */
    val FRAME_RATE_SAMPLES by aliasStatic({TelemetryEventProperty.field_41473})
    /**
     * field_41474
     */
    val RENDER_TIME_SAMPLES by aliasStatic({TelemetryEventProperty.field_41474})
    /**
     * field_41475
     */
    val USED_MEMORY_SAMPLES by aliasStatic({TelemetryEventProperty.field_41475})
    /**
     * field_41471
     */
    val SECONDS_SINCE_LOAD by aliasStatic({TelemetryEventProperty.field_41471})
    /**
     * field_41472
     */
    val TICKS_SINCE_LOAD by aliasStatic({TelemetryEventProperty.field_41472})
    /**
     * field_41478
     */
    val DEDICATED_MEMORY_KB by aliasStatic({TelemetryEventProperty.field_41478})
    /**
     * field_41479
     */
    val WORLD_LOAD_TIME_MS by aliasStatic({TelemetryEventProperty.field_41479})
    /**
     * field_41476
     */
    val NUMBER_OF_SAMPLES by aliasStatic({TelemetryEventProperty.field_41476})
    /**
     * field_41477
     */
    val RENDER_DISTANCE by aliasStatic({TelemetryEventProperty.field_41477})
    /**
     * field_41480
     */
    val NEW_WORLD by aliasStatic({TelemetryEventProperty.field_41480})
    /**
     * field_41468
     */
    val OPT_IN by aliasStatic({TelemetryEventProperty.field_41468})
    /**
     * field_41469
     */
    val EVENT_TIMESTAMP_UTC by aliasStatic({TelemetryEventProperty.field_41469})
    /**
     * field_41461
     */
    val GAME_VERSION by aliasStatic({TelemetryEventProperty.field_41461})
    /**
     * field_41462
     */
    val OPERATING_SYSTEM by aliasStatic({TelemetryEventProperty.field_41462})
    /**
     * field_41460
     */
    val MINECRAFT_SESSION_ID by aliasStatic({TelemetryEventProperty.field_41460})
    /**
     * field_41466
     */
    val SERVER_MODDED by aliasStatic({TelemetryEventProperty.field_41466})
    /**
     * field_41467
     */
    val SERVER_TYPE by aliasStatic({TelemetryEventProperty.field_41467})
    /**
     * field_41463
     */
    val PLATFORM by aliasStatic({TelemetryEventProperty.field_41463})
    /**
     * field_41464
     */
    val CLIENT_MODDED by aliasStatic({TelemetryEventProperty.field_41464})
    /**
     * field_41465
     */
    val WORLD_SESSION_ID by aliasStatic({TelemetryEventProperty.field_41465})
    /**
     * field_41470
     */
    val GAME_MODE by aliasStatic({TelemetryEventProperty.field_41470})
    /**
     * field_41458
     */
    val USER_ID by aliasStatic({TelemetryEventProperty.field_41458})
    /**
     * field_41459
     */
    val CLIENT_ID by aliasStatic({TelemetryEventProperty.field_41459})
    /**
     * field_44841
     */
    val LOAD_TIME_TOTAL_TIME_MS by aliasStatic({TelemetryEventProperty.field_44841})
    /**
     * field_44840
     */
    val REALMS_MAP_CONTENT by aliasStatic({TelemetryEventProperty.field_44840})
    /**
     * field_44835
     */
    val LOAD_TIME_BOOTSTRAP_MS by aliasStatic({TelemetryEventProperty.field_44835})
    /**
     * field_44834
     */
    val LOAD_TIME_PRE_WINDOW_MS by aliasStatic({TelemetryEventProperty.field_44834})
    /**
     * field_44839
     */
    val LAUNCHER_NAME by aliasStatic({TelemetryEventProperty.field_44839})
    /**
     * field_44838
     */
    val ADVANCEMENT_GAME_TIME by aliasStatic({TelemetryEventProperty.field_44838})
    /**
     * field_44837
     */
    val ADVANCEMENT_ID by aliasStatic({TelemetryEventProperty.field_44837})
    /**
     * field_44836
     */
    val LOAD_TIME_LOADING_OVERLAY_MS by aliasStatic({TelemetryEventProperty.field_44836})
    /**
     * method_51799
     */
    fun <T>ofTimeMeasurement(id: String?, exportKey: String?) = TelemetryEventProperty.method_51799(id, exportKey)
    /**
     * method_51798
     */
    fun <T>ofLong(id: String?, exportKey: String?) = TelemetryEventProperty.method_51798(id, exportKey)
    /**
     * method_47754
     */
    fun <T>ofUuid(id: String?, exportKey: String?) = TelemetryEventProperty.method_47754(id, exportKey)
    /**
     * method_47755
     */
    fun <T>ofLongList(id: String?, exportKey: String?) = TelemetryEventProperty.method_47755(id, exportKey)
    /**
     * method_47751
     */
    fun <T>of(id: String?, exportKey: String?, codec: Codec<T>?, exporter: net.minecraft.class_7969.class_7970<T>?) = TelemetryEventProperty.method_47751<T>(id, exportKey, codec, exporter)
    /**
     * method_47752
     */
    fun <T>ofString(id: String?, exportKey: String?) = TelemetryEventProperty.method_47752(id, exportKey)
    /**
     * method_47753
     */
    fun <T>ofInteger(id: String?, exportKey: String?) = TelemetryEventProperty.method_47753(id, exportKey)
    /**
     * method_47750
     */
    fun <T>ofBoolean(id: String?, exportKey: String?) = TelemetryEventProperty.method_47750(id, exportKey)
}