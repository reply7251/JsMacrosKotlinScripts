package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LightmapCoordinatesRetriever

fun <S>LightmapCoordinatesRetriever<S>.getFromBoth(arg0: S, arg1: S) where S: BlockEntity = this.method_24192(arg0, arg1)
fun <S>LightmapCoordinatesRetriever<S>.getFallback() where S: BlockEntity = this.method_24189()
fun <S>LightmapCoordinatesRetriever<S>.getFrom(arg0: S) where S: BlockEntity = this.method_24191(arg0)
