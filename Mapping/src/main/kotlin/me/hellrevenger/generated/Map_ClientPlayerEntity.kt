package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ClientPlayerEntity

val ClientPlayerEntity.input by alias(ClientPlayerEntity::field_3913)
val ClientPlayerEntity.prevNauseaIntensity by alias(ClientPlayerEntity::field_44912)
val ClientPlayerEntity.lastRenderYaw by alias(ClientPlayerEntity::field_3931)
val ClientPlayerEntity.lastRenderPitch by alias(ClientPlayerEntity::field_3914)
val ClientPlayerEntity.networkHandler by alias(ClientPlayerEntity::field_3944)
val ClientPlayerEntity.LOGGER by aliasStatic(ClientPlayerEntity::field_39078)
val ClientPlayerEntity.nauseaIntensity by alias(ClientPlayerEntity::field_44911)
val ClientPlayerEntity.renderYaw by alias(ClientPlayerEntity::field_3932)
val ClientPlayerEntity.renderPitch by alias(ClientPlayerEntity::field_3916)
fun ClientPlayerEntity.isRiding() = this.method_3144()
fun ClientPlayerEntity.openRidingInventory() = this.method_3132()
fun ClientPlayerEntity.getUnderwaterVisibility() = this.method_3140()
fun ClientPlayerEntity.dropSelectedItem(arg0: Boolean) = this.method_7290(arg0)
fun ClientPlayerEntity.setShowsDeathScreen(arg0: Boolean) = this.method_22420(arg0)
fun ClientPlayerEntity.updateHealth(arg0: Float) = this.method_3138(arg0)
fun ClientPlayerEntity.setClientPermissionLevel(arg0: Int) = this.method_3147(arg0)
fun ClientPlayerEntity.onRecipeDisplayed(arg0: RecipeEntry<*>) = this.method_3141(arg0)
fun ClientPlayerEntity.getMoodPercentage() = this.method_26269()
fun ClientPlayerEntity.onGameModeChanged(arg0: GameMode) = this.method_51889(arg0)
fun ClientPlayerEntity.getJumpingMount() = this.method_45773()
fun ClientPlayerEntity.setLimitedCraftingEnabled(arg0: Boolean) = this.method_53848(arg0)
fun ClientPlayerEntity.getCurrentPortalEffect() = this.method_60886()
fun ClientPlayerEntity.init() = this.method_33689()
fun ClientPlayerEntity.isLimitedCraftingEnabled() = this.method_53847()
fun ClientPlayerEntity.isAutoJumpEnabled() = this.method_3149()
fun ClientPlayerEntity.closeScreen() = this.method_3137()
fun ClientPlayerEntity.shouldSlowDown() = this.method_20303()
fun ClientPlayerEntity.showsDeathScreen() = this.method_22419()
fun ClientPlayerEntity.setExperience(arg0: Float, arg1: Int, arg2: Int) = this.method_3145(arg0, arg1, arg2)
