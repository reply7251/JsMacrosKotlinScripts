package me.hellrevenger.generated.Map_ShaderLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_53934
 */
val KClass<ShaderLoader>.SHADERS_PATH by aliasStatic(ShaderLoader::field_53934)
/**
 * field_53935
 */
val KClass<ShaderLoader>.INCLUDE_PATH by aliasStatic(ShaderLoader::field_53935)
/**
 * method_62944
 */
fun ShaderLoader.preload(arg0: ResourceFactory, arg1: Array<ShaderProgramKey>) = this.method_62944(arg0, *arg1)
/**
 * method_62941
 */
fun ShaderLoader.loadPostEffect(arg0: Identifier, arg1: Set<Identifier>) = this.method_62941(arg0, arg1)
/**
 * method_64062
 */
fun ShaderLoader.getProgramToLoad(arg0: ShaderProgramKey) = this.method_64062(arg0)
/**
 * method_62947
 */
fun ShaderLoader.getOrCreateProgram(arg0: ShaderProgramKey) = this.method_62947(arg0)
