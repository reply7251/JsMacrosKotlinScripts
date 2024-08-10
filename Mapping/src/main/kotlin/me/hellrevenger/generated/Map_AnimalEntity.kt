package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AnimalEntity

fun AnimalEntity.setLoveTicks(arg0: Int) = this.method_6476(arg0)
fun AnimalEntity.isBreedingItem(arg0: ItemStack) = this.method_6481(arg0)
fun AnimalEntity.breed(arg0: ServerWorld, arg1: AnimalEntity, arg2: PassiveEntity) = this.method_49794(arg0, arg1, arg2)
fun AnimalEntity.resetLoveTicks() = this.method_6477()
fun AnimalEntity.method_48926() = this.method_37908()
fun KClass<AnimalEntity>.isValidNaturalSpawn(arg0: EntityType<out AnimalEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = AnimalEntity.method_20663(arg0, arg1, arg2, arg3, arg4)
fun AnimalEntity.canBreedWith(arg0: AnimalEntity) = this.method_6474(arg0)
fun AnimalEntity.canEat() = this.method_6482()
fun AnimalEntity.lovePlayer(arg0: PlayerEntity) = this.method_6480(arg0)
fun AnimalEntity.isInLove() = this.method_6479()
fun AnimalEntity.breed(arg0: ServerWorld, arg1: AnimalEntity) = this.method_24650(arg0, arg1)
