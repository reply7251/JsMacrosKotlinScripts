package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VaultState

val KClass<VaultState>.INACTIVE by aliasEnum(VaultState::class, "field_48899")
val KClass<VaultState>.UNLOCKING by aliasEnum(VaultState::class, "field_48901")
val KClass<VaultState>.EJECTING by aliasEnum(VaultState::class, "field_48902")
val KClass<VaultState>.ACTIVE by aliasEnum(VaultState::class, "field_48900")
fun VaultState.getLuminance() = this.method_56801()
fun VaultState.onStateChange(arg0: ServerWorld, arg1: BlockPos, arg2: VaultState, arg3: VaultConfig, arg4: VaultSharedData, arg5: Boolean) = this.method_56806(arg0, arg1, arg2, arg3, arg4, arg5)
fun VaultState.update(arg0: ServerWorld, arg1: BlockPos, arg2: VaultConfig, arg3: VaultServerData, arg4: VaultSharedData) = this.method_56803(arg0, arg1, arg2, arg3, arg4)
