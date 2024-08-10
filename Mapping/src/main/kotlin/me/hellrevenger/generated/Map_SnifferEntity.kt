package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SnifferEntity

val SnifferEntity.risingAnimationState by alias(SnifferEntity::field_42655)
val SnifferEntity.sniffingAnimationState by alias(SnifferEntity::field_42652)
val SnifferEntity.feelingHappyAnimationState by alias(SnifferEntity::field_42650)
val SnifferEntity.diggingAnimationState by alias(SnifferEntity::field_42654)
val SnifferEntity.scentingAnimationState by alias(SnifferEntity::field_42651)
fun SnifferEntity.isTempted() = this.method_51158()
fun SnifferEntity.isDiggingOrSearching() = this.method_49150()
fun SnifferEntity.isSearching() = this.method_51301()
fun KClass<SnifferEntity>.createSnifferAttributes() = SnifferEntity.method_49146()
fun SnifferEntity.canTryToDig() = this.method_51155()
fun SnifferEntity.startState(arg0: net.minecraft.class_8153.class_8154) = this.method_49132(arg0)
fun SnifferEntity.finishDigging(arg0: Boolean) = this.method_49149(arg0)
