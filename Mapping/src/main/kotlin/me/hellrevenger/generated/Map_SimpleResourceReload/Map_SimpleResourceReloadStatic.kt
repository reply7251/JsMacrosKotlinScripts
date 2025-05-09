package me.hellrevenger.generated.Map_SimpleResourceReload
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SimpleResourceReloadKt {
    /**
     * method_18369
     */
    fun <S>create(manager: ResourceManager, reloaders: MutableList<ResourceReloader>, prepareExecutor: Executor, applyExecutor: Executor, initialStage: CompletableFuture<util_Unit>) = SimpleResourceReload.method_18369(manager, reloaders, prepareExecutor, applyExecutor, initialStage)
    /**
     * method_40087
     */
    fun <S>start(manager: ResourceManager, reloaders: MutableList<ResourceReloader>, prepareExecutor: Executor, applyExecutor: Executor, initialStage: CompletableFuture<util_Unit>, profiled: Boolean) = SimpleResourceReload.method_40087(manager, reloaders, prepareExecutor, applyExecutor, initialStage, profiled)
}