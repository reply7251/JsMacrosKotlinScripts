package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.UserCache

fun UserCache.getByUuid(arg0: UUID) = this.method_14512(arg0)
fun UserCache.save() = this.method_14518()
fun UserCache.clearExecutor() = this.method_39753()
fun UserCache.add(arg0: GameProfile) = this.method_14508(arg0)
fun UserCache.setExecutor(arg0: Executor) = this.method_37157(arg0)
fun UserCache.findByNameAsync(arg0: String) = this.method_37156(arg0)
fun UserCache.findByName(arg0: String) = this.method_14515(arg0)
fun UserCache.load() = this.method_14517()
fun KClass<UserCache>.setUseRemote(arg0: Boolean) = UserCache.method_14510(arg0)
