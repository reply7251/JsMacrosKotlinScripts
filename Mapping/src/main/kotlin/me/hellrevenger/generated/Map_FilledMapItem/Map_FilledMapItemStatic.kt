package me.hellrevenger.generated.Map_FilledMapItem
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FilledMapItemKt {
    /**
     * method_8005
     */
    fun createMap(world: world_World, x: Int, z: Int, scale: Byte, showIcons: Boolean, unlimitedTracking: Boolean) = FilledMapItem.method_8005(world, x, z, scale, showIcons, unlimitedTracking)
    /**
     * method_17442
     */
    fun copyMap(world: world_World, stack: ItemStack) = FilledMapItem.method_17442(world, stack)
    /**
     * method_8001
     */
    fun getMapState(map: ItemStack, world: world_World) = FilledMapItem.method_8001(map, world)
    /**
     * method_53836
     */
    fun getIdText(id: MapIdComponent) = FilledMapItem.method_53836(id)
    /**
     * method_8002
     */
    fun fillExplorationMap(world: ServerWorld, map: ItemStack) = FilledMapItem.method_8002(world, map)
}