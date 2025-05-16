package me.hellrevenger.generated.Map_IntegratedServerLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_54610
 */
fun IntegratedServerLoader.load(levelProperties: Dynamic<*>?, safeMode: Boolean, dataPackManager: ResourcePackManager?) = this.method_54610(levelProperties, safeMode, dataPackManager)
/**
 * method_41889
 */
fun IntegratedServerLoader.startNewWorld(session: net.minecraft.class_32.class_5143?, dataPackContents: DataPackContents?, dynamicRegistryManager: CombinedDynamicRegistries<ServerDynamicRegistryType>?, saveProperties: SaveProperties?) = this.method_41889(session, dataPackContents, dynamicRegistryManager, saveProperties)
/**
 * method_41895
 */
fun IntegratedServerLoader.createAndStart(levelName: String?, levelInfo: LevelInfo?, dynamicRegistryManager: GeneratorOptions?, dimensionsRegistrySupplier: function_Function<net.minecraft.class_7225.class_7874, DimensionOptionsRegistryHolder>?, screen: Screen?) = this.method_41895(levelName, levelInfo, dynamicRegistryManager, dimensionsRegistrySupplier, screen)
/**
 * method_57784
 */
fun IntegratedServerLoader.start(name: String?, onCancel: Runnable?) = this.method_57784(name, onCancel)
/**
 * method_45696
 */
fun IntegratedServerLoader.loadForRecreation(session: net.minecraft.class_32.class_5143?) = this.method_45696(session)
