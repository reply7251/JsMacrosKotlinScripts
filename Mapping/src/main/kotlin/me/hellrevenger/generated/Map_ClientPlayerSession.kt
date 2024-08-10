package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ClientPlayerSession

fun ClientPlayerSession.toPublicSession() = this.method_46275()
fun KClass<ClientPlayerSession>.create(arg0: PlayerKeyPair) = ClientPlayerSession.method_46273(arg0)
fun ClientPlayerSession.createPacker(arg0: UUID) = this.method_46274(arg0)
fun ClientPlayerSession.keyPair() = this.comp_1078()
fun ClientPlayerSession.sessionId() = this.comp_1077()
