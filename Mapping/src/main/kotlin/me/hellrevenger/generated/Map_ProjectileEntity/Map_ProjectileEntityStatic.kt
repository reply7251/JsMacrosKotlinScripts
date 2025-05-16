package me.hellrevenger.generated.Map_ProjectileEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ProjectileEntityKt {
    /**
     * method_61549
     */
    fun <T>spawnWithVelocity(creator: net.minecraft.class_1676.class_9876<T>?, world: ServerWorld?, projectileStack: ItemStack?, shooter: LivingEntity?, roll: Float, power: Float, divergence: Float) where T: ProjectileEntity = ProjectileEntity.method_61549<T>(creator, world, projectileStack, shooter, roll, power, divergence)
    /**
     * method_61553
     */
    fun <T>spawn(projectile: T, world: ServerWorld?, projectileStack: ItemStack?, beforeSpawn: Consumer<T>?) where T: ProjectileEntity = ProjectileEntity.method_61553<T>(projectile, world, projectileStack, beforeSpawn)
    /**
     * method_61548
     */
    fun <T>spawnWithVelocity(creator: net.minecraft.class_1676.class_9876<T>?, world: ServerWorld?, projectileStack: ItemStack?, shooter: LivingEntity?, velocityX: Double, arg5: Double, velocityY: Double, arg7: Float, velocityZ: Float) where T: ProjectileEntity = ProjectileEntity.method_61548<T>(creator, world, projectileStack, shooter, velocityX, arg5, velocityY, arg7, velocityZ)
    /**
     * method_61551
     */
    fun <T>spawn(projectile: T, world: ServerWorld?, projectileStack: ItemStack?) where T: ProjectileEntity = ProjectileEntity.method_61551<T>(projectile, world, projectileStack)
    /**
     * method_61552
     */
    fun <T>spawnWithVelocity(projectile: T, world: ServerWorld?, projectileStack: ItemStack?, velocityX: Double, arg4: Double, velocityY: Double, arg6: Float, velocityZ: Float) where T: ProjectileEntity = ProjectileEntity.method_61552<T>(projectile, world, projectileStack, velocityX, arg4, velocityY, arg6, velocityZ)
}