package me.hellrevenger.generated.Map_SystemToast
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SystemToastKt {
    /**
     * method_57723
     */
    fun addLowDiskSpace(client: MinecraftClient) = SystemToast.method_57723(client)
    /**
     * method_57724
     */
    fun addChunkLoadFailure(client: MinecraftClient, pos: ChunkPos) = SystemToast.method_57724(client, pos)
    /**
     * method_29627
     */
    fun addPackCopyFailure(client: MinecraftClient, directory: String) = SystemToast.method_29627(client, directory)
    /**
     * method_60865
     */
    fun addFileDropFailure(client: MinecraftClient, count: Int) = SystemToast.method_60865(client, count)
    /**
     * method_55507
     */
    fun hide(manager: ToastManager, type: net.minecraft.class_370.class_9037) = SystemToast.method_55507(manager, type)
    /**
     * method_1990
     */
    fun show(manager: ToastManager, type: net.minecraft.class_370.class_9037, title: Text, description: Text) = SystemToast.method_1990(manager, type, title, description)
    /**
     * method_27024
     */
    fun add(manager: ToastManager, type: net.minecraft.class_370.class_9037, title: Text, description: Text) = SystemToast.method_27024(manager, type, title, description)
    /**
     * method_57725
     */
    fun addChunkSaveFailure(client: MinecraftClient, pos: ChunkPos) = SystemToast.method_57725(client, pos)
    /**
     * method_27023
     */
    fun addWorldAccessFailureToast(client: MinecraftClient, worldName: String) = SystemToast.method_27023(client, worldName)
    /**
     * method_27025
     */
    fun addWorldDeleteFailureToast(client: MinecraftClient, worldName: String) = SystemToast.method_27025(client, worldName)
    /**
     * method_29047
     */
    fun create(client: MinecraftClient, type: net.minecraft.class_370.class_9037, title: Text, description: Text) = SystemToast.method_29047(client, type, title, description)
}