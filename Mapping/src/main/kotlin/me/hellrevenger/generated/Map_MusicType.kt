package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MusicType

val MusicType.DRAGON by aliasStatic(MusicType::field_5580)
val MusicType.CREDITS by aliasStatic(MusicType::field_5578)
val MusicType.GAME by aliasStatic(MusicType::field_5586)
val MusicType.MENU by aliasStatic(MusicType::field_5585)
val MusicType.UNDERWATER by aliasStatic(MusicType::field_5576)
val MusicType.CREATIVE by aliasStatic(MusicType::field_5581)
val MusicType.END by aliasStatic(MusicType::field_5583)
fun KClass<MusicType>.createIngameMusic(arg0: RegistryEntry<SoundEvent>) = MusicType.method_27283(arg0)
