package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CheckedGson

fun <T>CheckedGson.fromJson(arg0: String, arg1: Class<T>) where T: RealmsSerializable = this.method_25038<T>(arg0, arg1)
fun CheckedGson.toJson(arg0: JsonElement) = this.method_49573(arg0)
fun CheckedGson.toJson(arg0: RealmsSerializable) = this.method_25037(arg0)
