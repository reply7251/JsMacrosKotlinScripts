package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SummonCommand

fun KClass<SummonCommand>.summon(arg0: ServerCommandSource, arg1: net.minecraft.class_6880.class_6883<EntityType<*>>, arg2: Vec3d, arg3: NbtCompound, arg4: Boolean) = SummonCommand.method_48758(arg0, arg1, arg2, arg3, arg4)
fun KClass<SummonCommand>.register(arg0: CommandDispatcher<ServerCommandSource>, arg1: CommandRegistryAccess) = SummonCommand.method_13690(arg0, arg1)
