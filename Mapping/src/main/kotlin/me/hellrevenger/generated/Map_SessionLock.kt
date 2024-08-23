package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SessionLock

val KClass<SessionLock>.SESSION_LOCK by aliasStatic(SessionLock::field_29838)
fun SessionLock.isValid() = this.method_26802()
fun KClass<SessionLock>.create(arg0: file_Path) = SessionLock.method_26803(arg0)
fun KClass<SessionLock>.isLocked(arg0: file_Path) = SessionLock.method_26804(arg0)
