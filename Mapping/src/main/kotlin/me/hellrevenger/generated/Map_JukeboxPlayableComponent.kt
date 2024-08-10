package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.JukeboxPlayableComponent

val JukeboxPlayableComponent.PACKET_CODEC by aliasStatic(JukeboxPlayableComponent::field_52026)
fun JukeboxPlayableComponent.withShowInTooltip(arg0: Boolean) = this.method_60749(arg0)
fun KClass<JukeboxPlayableComponent>.tryPlayStack(arg0: world_World, arg1: BlockPos, arg2: ItemStack, arg3: PlayerEntity) = JukeboxPlayableComponent.method_60747(arg0, arg1, arg2, arg3)
fun JukeboxPlayableComponent.showInTooltip() = this.comp_2834()
fun JukeboxPlayableComponent.song() = this.comp_2833()
