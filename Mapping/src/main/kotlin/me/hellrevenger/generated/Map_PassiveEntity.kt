package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PassiveEntity

val KClass<PassiveEntity>.BABY_AGE by aliasStatic(PassiveEntity::field_29969)
fun PassiveEntity.isReadyToBreed() = this.method_19184()
fun PassiveEntity.getBreedingAge() = this.method_5618()
fun PassiveEntity.growUp(arg0: Int, arg1: Boolean) = this.method_5620(arg0, arg1)
fun PassiveEntity.setBreedingAge(arg0: Int) = this.method_5614(arg0)
fun PassiveEntity.growUp(arg0: Int) = this.method_5615(arg0)
fun KClass<PassiveEntity>.toGrowUpAge(arg0: Int) = PassiveEntity.method_41321(arg0)
fun PassiveEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_5613(arg0, arg1)
