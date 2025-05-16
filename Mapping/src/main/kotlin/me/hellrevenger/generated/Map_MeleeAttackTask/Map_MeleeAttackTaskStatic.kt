package me.hellrevenger.generated.Map_MeleeAttackTask
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MeleeAttackTaskKt {
    /**
     * method_64622
     */
    fun <T>create(targetPredicate: Predicate<T>?, cooldown: Int) where T: MobEntity = MeleeAttackTask.method_64622<T>(targetPredicate, cooldown)
    /**
     * method_46987
     */
    fun <T>create(cooldown: Int) where T: MobEntity = MeleeAttackTask.method_46987<T>(cooldown)
}