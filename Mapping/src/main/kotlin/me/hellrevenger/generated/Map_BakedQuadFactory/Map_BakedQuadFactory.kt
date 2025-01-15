package me.hellrevenger.generated.Map_BakedQuadFactory
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun BakedQuadFactory.transformVertex(arg0: Vector3f, arg1: AffineTransformation) = this.method_3455(arg0, arg1)
fun KClass<BakedQuadFactory>.uvLock(arg0: ModelElementTexture, arg1: Direction, arg2: AffineTransformation) = BakedQuadFactory.method_3454(arg0, arg1, arg2)
fun BakedQuadFactory.bake(arg0: Vector3f, arg1: Vector3f, arg2: ModelElementFace, arg3: Sprite, arg4: Direction, arg5: ModelBakeSettings, arg6: json_ModelRotation, arg7: Boolean) = this.method_3468(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun KClass<BakedQuadFactory>.decodeDirection(arg0: IntArray) = BakedQuadFactory.method_3467(arg0)
