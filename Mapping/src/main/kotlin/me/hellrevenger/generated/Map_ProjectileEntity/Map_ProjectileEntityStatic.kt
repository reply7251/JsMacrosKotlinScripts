package me.hellrevenger.generated.Map_ProjectileEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ProjectileEntityKt {
    /**
     * method_61549
     */
    fun <T>spawnWithVelocity(creator: net.minecraft.class_1676.class_9876<T>, world: ServerWorld, projectileStack: ItemStack, shooter: LivingEntity, roll: Float, power: Float, divergence: Float) where T: ProjectileEntity = ProjectileEntity.method_61549<T>(creator, world, projectileStack, shooter, roll, power, divergence)
    /**
     * method_61553
     */
    fun <T>spawn(projectile: T, world: ServerWorld, projectileStack: ItemStack, beforeSpawn: Consumer<T>) where T: ProjectileEntity = ProjectileEntity.method_61553<T>(projectile, world, projectileStack, beforeSpawn)
}