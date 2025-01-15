package me.hellrevenger.generated.Map_ChunkTicketType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val <T>KClass<ChunkTicketType<T>>.POST_TELEPORT by aliasStatic({ChunkTicketType.field_19347})
val <T>KClass<ChunkTicketType<T>>.DRAGON by aliasStatic({ChunkTicketType.field_17264})
val <T>KClass<ChunkTicketType<T>>.START by aliasStatic({ChunkTicketType.field_14030})
val <T>KClass<ChunkTicketType<T>>.PORTAL by aliasStatic({ChunkTicketType.field_19280})
val <T>KClass<ChunkTicketType<T>>.FORCED by aliasStatic({ChunkTicketType.field_14031})
val <T>KClass<ChunkTicketType<T>>.UNKNOWN by aliasStatic({ChunkTicketType.field_14032})
val <T>KClass<ChunkTicketType<T>>.PLAYER by aliasStatic({ChunkTicketType.field_14033})
fun <T>ChunkTicketType<T>.getArgumentComparator() = this.method_14292()
fun <T>ChunkTicketType<T>.getExpiryTicks() = this.method_20629()
fun <T>KClass<ChunkTicketType<T>>.create(arg0: String, arg1: Comparator<T>, arg2: Int) = ChunkTicketType.method_20628<T>(arg0, arg1, arg2)
fun <T>KClass<ChunkTicketType<T>>.create(arg0: String, arg1: Comparator<T>) = ChunkTicketType.method_14291<T>(arg0, arg1)
