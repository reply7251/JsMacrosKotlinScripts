package me.hellrevenger.generated.Map_DataCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<DataCommand>.SOURCE_OBJECT_TYPES by aliasStatic(DataCommand::field_13792)
val KClass<DataCommand>.TARGET_OBJECT_TYPES by aliasStatic(DataCommand::field_13798)
val KClass<DataCommand>.OBJECT_TYPE_FACTORIES by aliasStatic(DataCommand::field_13790)
fun KClass<DataCommand>.getNbt(arg0: net.minecraft.class_2203.class_2209, arg1: DataCommandObject) = DataCommand.method_13921(arg0, arg1)
fun KClass<DataCommand>.register(arg0: CommandDispatcher<ServerCommandSource>) = DataCommand.method_13905(arg0)
