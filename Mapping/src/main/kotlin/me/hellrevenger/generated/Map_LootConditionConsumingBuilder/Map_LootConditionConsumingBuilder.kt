package me.hellrevenger.generated.Map_LootConditionConsumingBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_840
 */
fun <T>LootConditionConsumingBuilder<T>.conditionally(condition: net.minecraft.class_5341.class_210) where T: LootConditionConsumingBuilder<T> = this.method_840(condition)
/**
 * method_43744
 */
fun <T, E>LootConditionConsumingBuilder<T>.conditionally(conditions: Iterable<E>, toBuilderFunction: function_Function<E, net.minecraft.class_5341.class_210>) where T: LootConditionConsumingBuilder<T> = this.method_43744<E>(conditions, toBuilderFunction)
/**
 * method_512
 */
fun <T>LootConditionConsumingBuilder<T>.getThisConditionConsumingBuilder() where T: LootConditionConsumingBuilder<T> = this.method_512()
