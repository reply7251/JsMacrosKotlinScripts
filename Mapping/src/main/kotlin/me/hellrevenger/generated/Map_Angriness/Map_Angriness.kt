package me.hellrevenger.generated.Map_Angriness
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<Angriness>.AGITATED by aliasEnum(Angriness::class, "field_38121")
val KClass<Angriness>.ANGRY by aliasEnum(Angriness::class, "field_38122")
val KClass<Angriness>.CALM by aliasEnum(Angriness::class, "field_38120")
fun Angriness.getListeningSound() = this.method_43103()
fun Angriness.getThreshold() = this.method_42170()
fun KClass<Angriness>.getForAnger(arg0: Int) = Angriness.method_42171(arg0)
fun Angriness.getSound() = this.method_42174()
fun Angriness.isAngry() = this.method_43691()
