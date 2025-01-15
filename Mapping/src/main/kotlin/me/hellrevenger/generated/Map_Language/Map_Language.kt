package me.hellrevenger.generated.Map_Language
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<Language>.DEFAULT_LANGUAGE by aliasStatic(Language::field_33187)
fun Language.reorder(arg0: StringVisitable) = this.method_30934(arg0)
fun Language.get(arg0: String, arg1: String) = this.method_4679(arg0, arg1)
fun KClass<Language>.getInstance() = Language.method_10517()
fun KClass<Language>.setInstance(arg0: Language) = Language.method_29427(arg0)
fun Language.get(arg0: String) = this.method_48307(arg0)
fun Language.isRightToLeft() = this.method_29428()
fun KClass<Language>.load(arg0: InputStream, arg1: BiConsumer<String, String>) = Language.method_29425(arg0, arg1)
fun Language.reorder(arg0: MutableList<StringVisitable>) = this.method_30933(arg0)
fun Language.hasTranslation(arg0: String) = this.method_4678(arg0)
