package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerAbilities

var PlayerAbilities.allowModifyWorld by alias(PlayerAbilities::field_7476)
var PlayerAbilities.creativeMode by alias(PlayerAbilities::field_7477)
var PlayerAbilities.allowFlying by alias(PlayerAbilities::field_7478)
var PlayerAbilities.flying by alias(PlayerAbilities::field_7479)
var PlayerAbilities.invulnerable by alias(PlayerAbilities::field_7480)
fun PlayerAbilities.writeNbt(arg0: NbtCompound) = this.method_7251(arg0)
fun PlayerAbilities.getFlySpeed() = this.method_7252()
fun PlayerAbilities.readNbt(arg0: NbtCompound) = this.method_7249(arg0)
fun PlayerAbilities.setFlySpeed(arg0: Float) = this.method_7248(arg0)
fun PlayerAbilities.getWalkSpeed() = this.method_7253()
fun PlayerAbilities.setWalkSpeed(arg0: Float) = this.method_7250(arg0)
