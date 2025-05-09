package me.hellrevenger.generated.Map_MapState
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_17403
 */
val MapState.locked by alias(MapState::field_17403)
/**
 * field_122
 */
var MapState.colors by alias(MapState::field_122)
/**
 * field_115
 */
val MapState.centerZ by alias(MapState::field_115)
/**
 * field_118
 */
val MapState.dimension by alias(MapState::field_118)
/**
 * field_119
 */
val MapState.scale by alias(MapState::field_119)
/**
 * field_116
 */
val MapState.centerX by alias(MapState::field_116)
/**
 * method_102
 */
fun MapState.update(player: PlayerEntity, stack: ItemStack) = this.method_102(player, stack)
/**
 * method_109
 */
fun MapState.removeBanner(world: BlockView, x: Int, z: Int) = this.method_109(world, x, z)
/**
 * method_101
 */
fun MapState.getPlayerSyncData(player: PlayerEntity) = this.method_101(player)
/**
 * method_32370
 */
fun MapState.setColor(x: Int, z: Int, color: Byte) = this.method_32370(x, z, color)
/**
 * method_35503
 */
fun MapState.getBanners() = this.method_35503()
/**
 * method_32364
 */
fun MapState.zoomOut() = this.method_32364()
/**
 * method_100
 */
fun MapState.getPlayerMarkerPacket(mapId: MapIdComponent, player: PlayerEntity) = this.method_100(mapId, player)
/**
 * method_32372
 */
fun MapState.hasExplorationMapDecoration() = this.method_32372()
/**
 * method_108
 */
fun MapState.addBanner(world: WorldAccess, pos: BlockPos) = this.method_108(world, pos)
/**
 * method_37343
 */
fun MapState.decorationCountNotLessThan(decorationCount: Int) = this.method_37343(decorationCount)
/**
 * method_32369
 */
fun MapState.replaceDecorations(decorations: MutableList<MapDecoration>) = this.method_32369(decorations)
/**
 * method_32365
 */
fun MapState.putColor(x: Int, z: Int, color: Byte) = this.method_32365(x, z, color)
/**
 * method_32373
 */
fun MapState.getDecorations() = this.method_32373()
/**
 * method_104
 */
fun MapState.removeFrame(pos: BlockPos, id: Int) = this.method_104(pos, id)
/**
 * method_32361
 */
fun MapState.copy() = this.method_32361()
