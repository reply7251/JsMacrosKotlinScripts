package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SystemToast

fun KClass<SystemToast>.addLowDiskSpace(arg0: MinecraftClient) = SystemToast.method_57723(arg0)
fun KClass<SystemToast>.addChunkLoadFailure(arg0: MinecraftClient, arg1: ChunkPos) = SystemToast.method_57724(arg0, arg1)
fun KClass<SystemToast>.addPackCopyFailure(arg0: MinecraftClient, arg1: String) = SystemToast.method_29627(arg0, arg1)
fun KClass<SystemToast>.addFileDropFailure(arg0: MinecraftClient, arg1: Int) = SystemToast.method_60865(arg0, arg1)
fun KClass<SystemToast>.hide(arg0: ToastManager, arg1: net.minecraft.class_370.class_9037) = SystemToast.method_55507(arg0, arg1)
fun KClass<SystemToast>.show(arg0: ToastManager, arg1: net.minecraft.class_370.class_9037, arg2: Text, arg3: Text) = SystemToast.method_1990(arg0, arg1, arg2, arg3)
fun SystemToast.setContent(arg0: Text, arg1: Text) = this.method_1991(arg0, arg1)
fun KClass<SystemToast>.add(arg0: ToastManager, arg1: net.minecraft.class_370.class_9037, arg2: Text, arg3: Text) = SystemToast.method_27024(arg0, arg1, arg2, arg3)
fun KClass<SystemToast>.addChunkSaveFailure(arg0: MinecraftClient, arg1: ChunkPos) = SystemToast.method_57725(arg0, arg1)
fun KClass<SystemToast>.addWorldAccessFailureToast(arg0: MinecraftClient, arg1: String) = SystemToast.method_27023(arg0, arg1)
fun KClass<SystemToast>.addWorldDeleteFailureToast(arg0: MinecraftClient, arg1: String) = SystemToast.method_27025(arg0, arg1)
fun KClass<SystemToast>.create(arg0: MinecraftClient, arg1: net.minecraft.class_370.class_9037, arg2: Text, arg3: Text) = SystemToast.method_29047(arg0, arg1, arg2, arg3)
fun SystemToast.hide() = this.method_55508()
