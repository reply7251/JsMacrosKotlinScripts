package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SaveVersion

val SaveVersion.MAIN_SERIES by aliasStatic(SaveVersion::field_34768)
fun SaveVersion.isNotMainSeries() = this.method_38490()
fun SaveVersion.isAvailableTo(arg0: SaveVersion) = this.method_38493(arg0)
