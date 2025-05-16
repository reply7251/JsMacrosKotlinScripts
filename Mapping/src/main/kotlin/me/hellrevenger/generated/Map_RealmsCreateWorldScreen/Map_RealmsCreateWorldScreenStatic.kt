package me.hellrevenger.generated.Map_RealmsCreateWorldScreen
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RealmsCreateWorldScreenKt {
    /**
     * field_46125
     */
    val CREATING_TEXT by aliasStatic(RealmsCreateWorldScreen::field_46125)
    /**
     * method_53801
     */
    fun newWorld(parent: Screen?, slot: Int, serverData: RealmsServer?, callback: Runnable?) = RealmsCreateWorldScreen.method_53801(parent, slot, serverData, callback)
    /**
     * method_53805
     */
    fun resetWorld(parent: Screen?, serverData: RealmsServer?, callback: Runnable?) = RealmsCreateWorldScreen.method_53805(parent, serverData, callback)
    /**
     * method_53802
     */
    fun newRealm(parent: Screen?, serverData: RealmsServer?, creationTask: WorldCreationTask?, callback: Runnable?) = RealmsCreateWorldScreen.method_53802(parent, serverData, creationTask, callback)
}