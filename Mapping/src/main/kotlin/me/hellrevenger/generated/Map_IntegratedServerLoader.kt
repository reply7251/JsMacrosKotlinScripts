package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.IntegratedServerLoader

fun IntegratedServerLoader.load(arg0: Dynamic<*>, arg1: Boolean, arg2: ResourcePackManager) = this.method_54610(arg0, arg1, arg2)
fun KClass<IntegratedServerLoader>.tryLoad(arg0: MinecraftClient, arg1: CreateWorldScreen, arg2: Lifecycle, arg3: Runnable, arg4: Boolean) = IntegratedServerLoader.method_41892(arg0, arg1, arg2, arg3, arg4)
fun IntegratedServerLoader.startNewWorld(arg0: net.minecraft.class_32.class_5143, arg1: DataPackContents, arg2: CombinedDynamicRegistries<ServerDynamicRegistryType>, arg3: SaveProperties) = this.method_41889(arg0, arg1, arg2, arg3)
fun IntegratedServerLoader.createAndStart(arg0: String, arg1: LevelInfo, arg2: GeneratorOptions, arg3: Function<DynamicRegistryManager, DimensionOptionsRegistryHolder>, arg4: Screen) = this.method_41895(arg0, arg1, arg2, arg3, arg4)
fun IntegratedServerLoader.start(arg0: String, arg1: Runnable) = this.method_57784(arg0, arg1)
fun IntegratedServerLoader.loadForRecreation(arg0: net.minecraft.class_32.class_5143) = this.method_45696(arg0)
