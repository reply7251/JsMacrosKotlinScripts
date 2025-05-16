package me.hellrevenger.generated.Map_MinecraftServer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MinecraftServerKt {
    /**
     * field_33211
     */
    val MAX_WORLD_BORDER_RADIUS by aliasStatic(MinecraftServer::field_33211)
    /**
     * field_34982
     */
    val VANILLA by aliasStatic(MinecraftServer::field_34982)
    /**
     * field_35641
     */
    val ANONYMOUS_PLAYER_PROFILE by aliasStatic(MinecraftServer::field_35641)
    /**
     * field_17704
     */
    val DEMO_LEVEL_INFO by aliasStatic(MinecraftServer::field_17704)
    /**
     * method_29736
     */
    fun loadDataPacks(resourcePackManager: ResourcePackManager?, dataConfiguration: DataConfiguration?, initMode: Boolean, safeMode: Boolean) = MinecraftServer.method_29736(resourcePackManager, dataConfiguration, initMode, safeMode)
    /**
     * method_60584
     */
    fun checkWorldGenException() = MinecraftServer.method_60584()
    /**
     * method_29740
     */
    fun <S>startServer(serverFactory: function_Function<Thread, S>?) where S: MinecraftServer = MinecraftServer.method_29740<S>(serverFactory)
    /**
     * method_60582
     */
    fun setWorldGenException(exception: RuntimeException?) = MinecraftServer.method_60582(exception)
}