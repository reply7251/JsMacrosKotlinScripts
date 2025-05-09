package me.hellrevenger.generated.Map_DataCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DataCommandKt {
    /**
     * field_13792
     */
    val SOURCE_OBJECT_TYPES by aliasStatic(DataCommand::field_13792)
    /**
     * field_13798
     */
    val TARGET_OBJECT_TYPES by aliasStatic(DataCommand::field_13798)
    /**
     * field_13790
     */
    val OBJECT_TYPE_FACTORIES by aliasStatic(DataCommand::field_13790)
    /**
     * method_13921
     */
    fun getNbt(path: net.minecraft.class_2203.class_2209, arg1: DataCommandObject) = DataCommand.method_13921(path, arg1)
    /**
     * method_13905
     */
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>) = DataCommand.method_13905(dispatcher)
}