package me.hellrevenger.generated.Map_SampleSubscriptionTracker
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<SampleSubscriptionTracker>.STOP_TRACK_TICK by aliasStatic(SampleSubscriptionTracker::field_48808)
val KClass<SampleSubscriptionTracker>.STOP_TRACK_MS by aliasStatic(SampleSubscriptionTracker::field_48809)
fun SampleSubscriptionTracker.sendPacket(arg0: DebugSampleS2CPacket) = this.method_56655(arg0)
fun SampleSubscriptionTracker.addPlayer(arg0: ServerPlayerEntity, arg1: DebugSampleType) = this.method_56656(arg0, arg1)
fun SampleSubscriptionTracker.shouldPush(arg0: DebugSampleType) = this.method_56657(arg0)
fun SampleSubscriptionTracker.tick(arg0: Int) = this.method_56652(arg0)
