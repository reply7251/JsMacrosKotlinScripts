package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SimpleTickScheduler

fun <T>KClass<SimpleTickScheduler<T>>.tick(arg0: NbtList, arg1: Function<String, Optional<T>>, arg2: ChunkPos) = SimpleTickScheduler.method_39398<T>(arg0, arg1, arg2)
fun <T>SimpleTickScheduler<T>.getTicks() = this.method_39399()
