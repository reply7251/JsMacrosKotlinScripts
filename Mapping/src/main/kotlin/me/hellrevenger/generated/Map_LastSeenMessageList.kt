package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LastSeenMessageList

val LastSeenMessageList.EMPTY by aliasStatic(LastSeenMessageList::field_39883)
val LastSeenMessageList.MAX_ENTRIES by aliasStatic(LastSeenMessageList::field_39884)
fun LastSeenMessageList.pack(arg0: MessageSignatureStorage) = this.method_46258(arg0)
fun LastSeenMessageList.updateSignatures(arg0: net.minecraft.class_7498.class_7499) = this.method_46257(arg0)
fun LastSeenMessageList.entries() = this.comp_965()
