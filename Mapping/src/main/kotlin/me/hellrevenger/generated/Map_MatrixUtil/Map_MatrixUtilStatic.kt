package me.hellrevenger.generated.Map_MatrixUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MatrixUtilKt {
    /**
     * method_46412
     */
    fun svdDecompose(A: Matrix3f) = MatrixUtil.method_46412(A)
    /**
     * method_56826
     */
    fun isTranslation(matrix: Matrix4f) = MatrixUtil.method_56826(matrix)
    /**
     * method_65174
     */
    fun isIdentity(matrix: Matrix4f) = MatrixUtil.method_65174(matrix)
    /**
     * method_56827
     */
    fun isOrthonormal(matrix: Matrix4f) = MatrixUtil.method_56827(matrix)
    /**
     * method_49741
     */
    fun applyJacobiIterations(AtA: Matrix3f, numJacobiIterations: Int) = MatrixUtil.method_49741(AtA, numJacobiIterations)
    /**
     * method_46414
     */
    fun scale(matrix: Matrix4f, scalar: Float) = MatrixUtil.method_46414(matrix, scalar)
}