package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractTexture

val KClass<AbstractTexture>.DEFAULT_ID by aliasStatic(AbstractTexture::field_32948)
fun AbstractTexture.load(arg0: ResourceManager) = this.method_4625(arg0)
fun AbstractTexture.bindTexture() = this.method_23207()
fun AbstractTexture.getGlId() = this.method_4624()
fun AbstractTexture.registerTexture(arg0: TextureManager, arg1: ResourceManager, arg2: Identifier, arg3: Executor) = this.method_18169(arg0, arg1, arg2, arg3)
fun AbstractTexture.setFilter(arg0: Boolean, arg1: Boolean) = this.method_4527(arg0, arg1)
fun AbstractTexture.clearGlId() = this.method_4528()
