package me.hellrevenger.generated.Map_PersistentStateManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_17923
 */
fun PersistentStateManager.readNbt(id: String, dataFixTypes: DataFixTypes, currentSaveVersion: Int) = this.method_17923(id, dataFixTypes, currentSaveVersion)
/**
 * method_20786
 */
fun <T>PersistentStateManager.get(type: net.minecraft.class_18.class_8645<T>, id: String) where T: PersistentState = this.method_20786<T>(type, id)
/**
 * method_125
 */
fun PersistentStateManager.save() = this.method_125()
/**
 * method_123
 */
fun PersistentStateManager.set(id: String, state: PersistentState) = this.method_123(id, state)
/**
 * method_61873
 */
fun PersistentStateManager.startSaving() = this.method_61873()
/**
 * method_17924
 */
fun <T>PersistentStateManager.getOrCreate(type: net.minecraft.class_18.class_8645<T>, id: String) where T: PersistentState = this.method_17924<T>(type, id)
