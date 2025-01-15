package me.hellrevenger.generated.Map_PhaseType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val <T>KClass<PhaseType<T>>.TAKEOFF where T: Phase by aliasStatic({PhaseType.field_7077})
val <T>KClass<PhaseType<T>>.CHARGING_PLAYER where T: Phase by aliasStatic({PhaseType.field_7078})
val <T>KClass<PhaseType<T>>.SITTING_ATTACKING where T: Phase by aliasStatic({PhaseType.field_7073})
val <T>KClass<PhaseType<T>>.HOVER where T: Phase by aliasStatic({PhaseType.field_7075})
val <T>KClass<PhaseType<T>>.STRAFE_PLAYER where T: Phase by aliasStatic({PhaseType.field_7076})
val <T>KClass<PhaseType<T>>.LANDING_APPROACH where T: Phase by aliasStatic({PhaseType.field_7071})
val <T>KClass<PhaseType<T>>.SITTING_FLAMING where T: Phase by aliasStatic({PhaseType.field_7072})
val <T>KClass<PhaseType<T>>.HOLDING_PATTERN where T: Phase by aliasStatic({PhaseType.field_7069})
val <T>KClass<PhaseType<T>>.LANDING where T: Phase by aliasStatic({PhaseType.field_7067})
val <T>KClass<PhaseType<T>>.DYING where T: Phase by aliasStatic({PhaseType.field_7068})
val <T>KClass<PhaseType<T>>.SITTING_SCANNING where T: Phase by aliasStatic({PhaseType.field_7081})
fun <T>KClass<PhaseType<T>>.count() where T: Phase = PhaseType.method_6869()
fun <T>KClass<PhaseType<T>>.getFromId(arg0: Int) where T: Phase = PhaseType.method_6868(arg0)
fun <T>PhaseType<T>.getTypeId() where T: Phase = this.method_6871()
fun <T>PhaseType<T>.create(arg0: EnderDragonEntity) where T: Phase = this.method_6866(arg0)
