package me.hellrevenger.generated.Map_RegionBasedStorage
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<RegionBasedStorage>.MCA_EXTENSION by aliasStatic(RegionBasedStorage::field_31425)
fun RegionBasedStorage.getTagAt(arg0: ChunkPos) = this.method_17911(arg0)
fun RegionBasedStorage.getStorageKey() = this.method_61005()
fun RegionBasedStorage.sync() = this.method_26982()
fun RegionBasedStorage.scanChunk(arg0: ChunkPos, arg1: NbtScanner) = this.method_39802(arg0, arg1)
