package me.hellrevenger.generated.Map_SizeUnit
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_20202
 */
val KClass<SizeUnit>.MB by aliasEnum(SizeUnit::class, "field_20202")
/**
 * field_20201
 */
val KClass<SizeUnit>.KB by aliasEnum(SizeUnit::class, "field_20201")
/**
 * field_20200
 */
val KClass<SizeUnit>.B by aliasEnum(SizeUnit::class, "field_20200")
/**
 * field_20203
 */
val KClass<SizeUnit>.GB by aliasEnum(SizeUnit::class, "field_20203")
/**
 * method_25028
 */
fun KClass<SizeUnit>.convertToUnit(arg0: Long, arg1: SizeUnit) = SizeUnit.method_25028(arg0, arg1)
/**
 * method_25029
 */
fun KClass<SizeUnit>.getUserFriendlyString(arg0: Long) = SizeUnit.method_25029(arg0)
/**
 * method_25027
 */
fun KClass<SizeUnit>.getLargestUnit(arg0: Long) = SizeUnit.method_25027(arg0)
/**
 * method_25030
 */
fun KClass<SizeUnit>.humanReadableSize(arg0: Long, arg1: SizeUnit) = SizeUnit.method_25030(arg0, arg1)
