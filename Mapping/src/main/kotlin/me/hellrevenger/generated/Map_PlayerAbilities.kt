package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerAbilities

val PlayerAbilities.allowModifyWorld by alias(PlayerAbilities::field_7476)
val PlayerAbilities.creativeMode by alias(PlayerAbilities::field_7477)
val PlayerAbilities.allowFlying by alias(PlayerAbilities::field_7478)
val PlayerAbilities.flying by alias(PlayerAbilities::field_7479)
val PlayerAbilities.invulnerable by alias(PlayerAbilities::field_7480)
fun PlayerAbilities.writeNbt(arg0: NbtCompound) = this.method_7251(arg0)
fun PlayerAbilities.readNbt(arg0: NbtCompound) = this.method_7249(arg0)
fun PlayerAbilities.setFlySpeed(arg0: Float) = this.method_7248(arg0)
fun PlayerAbilities.setWalkSpeed(arg0: Float) = this.method_7250(arg0)
