package me.hellrevenger.generated.Map_PostEffectProcessor
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_53104
 */
val KClass<PostEffectProcessor>.MAIN by aliasStatic(PostEffectProcessor::field_53104)
/**
 * method_1256
 */
fun KClass<PostEffectProcessor>.parseEffect(arg0: PostEffectPipeline, arg1: TextureManager, arg2: ShaderLoader, arg3: Set<Identifier>) = PostEffectProcessor.method_1256(arg0, arg1, arg2, arg3)
/**
 * method_57799
 */
fun PostEffectProcessor.setUniforms(arg0: String, arg1: Float) = this.method_57799(arg0, arg1)
/**
 * method_1258
 */
fun PostEffectProcessor.render(arg0: Framebuffer, arg1: ObjectAllocator) = this.method_1258(arg0, arg1)
/**
 * method_62234
 */
fun PostEffectProcessor.render(arg0: FrameGraphBuilder, arg1: Int, arg2: Int, arg3: net.minecraft.class_279.class_9961) = this.method_62234(arg0, arg1, arg2, arg3)
