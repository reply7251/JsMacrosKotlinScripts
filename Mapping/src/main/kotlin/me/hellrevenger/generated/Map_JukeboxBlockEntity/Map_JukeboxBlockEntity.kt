package me.hellrevenger.generated.Map_JukeboxBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<JukeboxBlockEntity>.RECORD_ITEM_NBT_KEY by aliasStatic(JukeboxBlockEntity::field_52064)
val KClass<JukeboxBlockEntity>.TICKS_SINCE_SONG_STARTED_NBT_KEY by aliasStatic(JukeboxBlockEntity::field_52065)
fun JukeboxBlockEntity.onManagerChange() = this.method_60785()
fun JukeboxBlockEntity.getComparatorOutput() = this.method_60992()
fun KClass<JukeboxBlockEntity>.tick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: JukeboxBlockEntity) = JukeboxBlockEntity.method_44370(arg0, arg1, arg2, arg3)
fun JukeboxBlockEntity.getManager() = this.method_60784()
fun JukeboxBlockEntity.reloadDisc() = this.method_60786()
fun JukeboxBlockEntity.dropRecord() = this.method_49213()
fun JukeboxBlockEntity.setDisc(arg0: ItemStack) = this.method_49210(arg0)
