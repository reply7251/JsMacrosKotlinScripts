package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DataPackContents

fun DataPackContents.getServerAdvancementLoader() = this.method_29473()
fun DataPackContents.getFunctionLoader() = this.method_29465()
fun DataPackContents.getReloadableRegistries() = this.method_58297()
fun DataPackContents.refresh() = this.method_40421()
fun DataPackContents.getContents() = this.method_40427()
fun DataPackContents.getRecipeManager() = this.method_29471()
fun KClass<DataPackContents>.reload(arg0: ResourceManager, arg1: CombinedDynamicRegistries<ServerDynamicRegistryType>, arg2: FeatureSet, arg3: net.minecraft.class_2170.class_5364, arg4: Int, arg5: Executor, arg6: Executor) = DataPackContents.method_29466(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun DataPackContents.getCommandManager() = this.method_29472()
