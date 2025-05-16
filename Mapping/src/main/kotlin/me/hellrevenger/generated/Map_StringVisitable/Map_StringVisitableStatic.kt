package me.hellrevenger.generated.Map_StringVisitable
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StringVisitableKt {
    /**
     * method_29431
     */
    fun styled(string: String?, style: Style?) = StringVisitable.method_29431(string, style)
    /**
     * method_29433
     */
    fun concat(visitables: Array<StringVisitable>) = StringVisitable.method_29433(*visitables)
    /**
     * method_29432
     */
    fun concat(visitables: MutableList<out StringVisitable>?) = StringVisitable.method_29432(visitables)
    /**
     * method_29430
     */
    fun plain(string: String?) = StringVisitable.method_29430(string)
}