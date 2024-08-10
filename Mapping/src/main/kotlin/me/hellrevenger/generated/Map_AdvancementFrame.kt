package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AdvancementFrame

val AdvancementFrame.TASK by aliasEnum(AdvancementFrame::class, "field_1254")
val AdvancementFrame.CHALLENGE by aliasEnum(AdvancementFrame::class, "field_1250")
val AdvancementFrame.GOAL by aliasEnum(AdvancementFrame::class, "field_1249")
fun AdvancementFrame.getChatAnnouncementText(arg0: AdvancementEntry, arg1: ServerPlayerEntity) = this.method_54932(arg0, arg1)
