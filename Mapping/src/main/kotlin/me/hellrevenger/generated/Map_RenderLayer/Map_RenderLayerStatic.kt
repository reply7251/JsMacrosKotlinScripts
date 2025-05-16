package me.hellrevenger.generated.Map_RenderLayer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RenderLayerKt {
    /**
     * field_32775
     */
    val DEFAULT_BUFFER_SIZE by aliasStatic(RenderLayer::field_32775)
    /**
     * field_32774
     */
    val CUTOUT_BUFFER_SIZE by aliasStatic(RenderLayer::field_32774)
    /**
     * field_32772
     */
    val SOLID_BUFFER_SIZE by aliasStatic(RenderLayer::field_32772)
    /**
     * field_54857
     */
    val SECONDARY_BLOCK_OUTLINE by aliasStatic(RenderLayer::field_54857)
    /**
     * field_21695
     */
    val LINES by aliasStatic(RenderLayer::field_21695)
    /**
     * field_29456
     */
    val LINE_STRIP by aliasStatic(RenderLayer::field_29456)
    /**
     * method_62291
     */
    fun getNoCullingClouds() = RenderLayer.method_62291()
    /**
     * method_23026
     */
    fun getEyes(texture: Identifier?) = RenderLayer.method_23026(texture)
    /**
     * method_51456
     */
    fun getDebugSectionQuads() = RenderLayer.method_51456()
    /**
     * method_24049
     */
    fun of(name: String?, vertexFormat: VertexFormat?, drawMode: net.minecraft.class_293.class_5596?, expectedBufferSize: Int, hasCrumbling: Boolean, translucent: Boolean, phases: net.minecraft.class_1921.class_4688?) = RenderLayer.method_24049(name, vertexFormat, drawMode, expectedBufferSize, hasCrumbling, translucent, phases)
    /**
     * method_65221
     */
    fun getStars() = RenderLayer.method_65221()
    /**
     * method_23587
     */
    fun getLeash() = RenderLayer.method_23587()
    /**
     * method_34572
     */
    fun getLineStrip() = RenderLayer.method_34572()
    /**
     * method_61157
     */
    fun getDragonRaysDepth() = RenderLayer.method_61157()
    /**
     * method_25448
     */
    fun getArmorCutoutNoCull(texture: Identifier?) = RenderLayer.method_25448(texture)
    /**
     * method_62277
     */
    fun getGuiTextured(texture: Identifier?) = RenderLayer.method_62277(texture)
    /**
     * method_65220
     */
    fun getSunriseSunset() = RenderLayer.method_65220()
    /**
     * method_23570
     */
    fun getBlockBreaking(texture: Identifier?) = RenderLayer.method_23570(texture)
    /**
     * method_28116
     */
    fun getEntityCutoutNoCullZOffset(texture: Identifier?) = RenderLayer.method_28116(texture)
    /**
     * method_23574
     */
    fun getEndPortal() = RenderLayer.method_23574()
    /**
     * method_29997
     */
    fun getTripwire() = RenderLayer.method_29997()
    /**
     * method_65217
     */
    fun getFireScreenEffect(texture: Identifier?) = RenderLayer.method_65217(texture)
    /**
     * method_64914
     */
    fun getSecondaryBlockOutline() = RenderLayer.method_64914()
    /**
     * method_23592
     */
    fun getBeaconBeam(texture: Identifier?, translucent: Boolean) = RenderLayer.method_23592(texture, translucent)
    /**
     * method_62279
     */
    fun getVignette(texture: Identifier?) = RenderLayer.method_62279(texture)
    /**
     * method_23580
     */
    fun getEntityTranslucent(texture: Identifier?) = RenderLayer.method_23580(texture)
    /**
     * method_56850
     */
    fun getFancyClouds() = RenderLayer.method_56850()
    /**
     * method_61045
     */
    fun getDebugStructureQuads() = RenderLayer.method_61045()
    /**
     * method_49047
     */
    fun getDebugFilledBox() = RenderLayer.method_49047()
    /**
     * method_65215
     */
    fun getCelestial(texture: Identifier?) = RenderLayer.method_65215(texture)
    /**
     * method_23287
     */
    fun getOutline(texture: Identifier?) = RenderLayer.method_23287(texture)
    /**
     * method_23583
     */
    fun getTranslucent() = RenderLayer.method_23583()
    /**
     * method_27949
     */
    fun getArmorEntityGlint() = RenderLayer.method_27949()
    /**
     * method_49046
     */
    fun getTextBackgroundSeeThrough() = RenderLayer.method_49046()
    /**
     * method_62278
     */
    fun getDebugTriangleFan() = RenderLayer.method_62278()
    /**
     * method_49045
     */
    fun getTextBackground() = RenderLayer.method_49045()
    /**
     * method_65216
     */
    fun getBlockScreenEffect(texture: Identifier?) = RenderLayer.method_65216(texture)
    /**
     * method_34571
     */
    fun getEndGateway() = RenderLayer.method_34571()
    /**
     * method_23594
     */
    fun getLines() = RenderLayer.method_23594()
    /**
     * method_62276
     */
    fun getGuiOpaqueTexturedBackground(texture: Identifier?) = RenderLayer.method_62276(texture)
    /**
     * method_65227
     */
    fun getWorldBorder(allMask: Boolean) = RenderLayer.method_65227(allMask)
    /**
     * method_37345
     */
    fun getTextPolygonOffset(texture: Identifier?) = RenderLayer.method_37345(texture)
    /**
     * method_65213
     */
    fun getOpaqueParticle(texture: Identifier?) = RenderLayer.method_65213(texture)
    /**
     * method_65219
     */
    fun getEndSky() = RenderLayer.method_65219()
    /**
     * method_23581
     */
    fun getCutout() = RenderLayer.method_23581()
    /**
     * method_23593
     */
    fun getLightning() = RenderLayer.method_23593()
    /**
     * method_61046
     */
    fun getDragonRays() = RenderLayer.method_61046()
    /**
     * method_42600
     */
    fun getEntityTranslucentEmissive(texture: Identifier?) = RenderLayer.method_42600(texture)
    /**
     * method_62275
     */
    fun getGuiTexturedOverlay(texture: Identifier?) = RenderLayer.method_62275(texture)
    /**
     * method_65052
     */
    fun createArmorTranslucent(texture: Identifier?) = RenderLayer.method_65052(texture)
    /**
     * method_37346
     */
    fun getTextIntensityPolygonOffset(texture: Identifier?) = RenderLayer.method_37346(texture)
    /**
     * method_65214
     */
    fun getTranslucentParticle(texture: Identifier?) = RenderLayer.method_65214(texture)
    /**
     * method_65218
     */
    fun getSky() = RenderLayer.method_65218()
    /**
     * method_23030
     */
    fun getTextSeeThrough(texture: Identifier?) = RenderLayer.method_23030(texture)
    /**
     * method_29380
     */
    fun getTranslucentMovingBlock() = RenderLayer.method_29380()
    /**
     * method_62287
     */
    fun getMojangLogo() = RenderLayer.method_62287()
    /**
     * method_65231
     */
    fun getWeather(texture: Identifier?, allMask: Boolean) = RenderLayer.method_65231(texture, allMask)
    /**
     * method_49042
     */
    fun getDebugQuads() = RenderLayer.method_49042()
    /**
     * method_49043
     */
    fun getDebugLineStrip(lineWidth: Double) = RenderLayer.method_49043(lineWidth)
    /**
     * method_23591
     */
    fun getEntityGlint() = RenderLayer.method_23591()
    /**
     * method_23578
     */
    fun getEntityCutoutNoCull(texture: Identifier?) = RenderLayer.method_23578(texture)
    /**
     * method_23590
     */
    fun getGlint() = RenderLayer.method_23590()
    /**
     * method_23018
     */
    fun getEnergySwirl(texture: Identifier?, x: Float, y: Float) = RenderLayer.method_23018(texture, x, y)
    /**
     * method_55252
     */
    fun getEntityTranslucentEmissiveNoOutline(texture: Identifier?) = RenderLayer.method_55252(texture)
    /**
     * method_42599
     */
    fun getEntityTranslucentEmissive(texture: Identifier?, affectsOutline: Boolean) = RenderLayer.method_42599(texture, affectsOutline)
    /**
     * method_29379
     */
    fun getItemEntityTranslucentCull(texture: Identifier?) = RenderLayer.method_29379(texture)
    /**
     * method_23588
     */
    fun getEntityNoOutline(texture: Identifier?) = RenderLayer.method_23588(texture)
    /**
     * method_23576
     */
    fun getEntityCutout(texture: Identifier?) = RenderLayer.method_23576(texture)
    /**
     * method_51787
     */
    fun getGuiGhostRecipeOverlay() = RenderLayer.method_51787()
    /**
     * method_22720
     */
    fun getBlockLayers() = RenderLayer.method_22720()
    /**
     * method_62290
     */
    fun getEntitySolidZOffsetForward(texture: Identifier?) = RenderLayer.method_62290(texture)
    /**
     * method_24048
     */
    fun of(name: String?, vertexFormat: VertexFormat?, drawMode: net.minecraft.class_293.class_5596?, expectedBufferSize: Int, phaseData: net.minecraft.class_1921.class_4688?) = RenderLayer.method_24048(name, vertexFormat, drawMode, expectedBufferSize, phaseData)
    /**
     * method_51786
     */
    fun getGuiTextHighlight() = RenderLayer.method_51786()
    /**
     * method_23579
     */
    fun getCutoutMipped() = RenderLayer.method_23579()
    /**
     * method_55251
     */
    fun getBreezeWind(texture: Identifier?, x: Float, y: Float) = RenderLayer.method_55251(texture, x, y)
    /**
     * method_24469
     */
    fun getEntityShadow(texture: Identifier?) = RenderLayer.method_24469(texture)
    /**
     * method_23586
     */
    fun getEntityDecal(texture: Identifier?) = RenderLayer.method_23586(texture)
    /**
     * method_36434
     */
    fun getTextIntensity(texture: Identifier?) = RenderLayer.method_36434(texture)
    /**
     * method_23028
     */
    fun getText(texture: Identifier?) = RenderLayer.method_23028(texture)
    /**
     * method_51785
     */
    fun getGuiOverlay() = RenderLayer.method_51785()
    /**
     * method_24294
     */
    fun getEntityTranslucent(texture: Identifier?, affectsOutline: Boolean) = RenderLayer.method_24294(texture, affectsOutline)
    /**
     * method_56849
     */
    fun getFastClouds() = RenderLayer.method_56849()
    /**
     * method_28115
     */
    fun getEntityCutoutNoCullZOffset(texture: Identifier?, affectsOutline: Boolean) = RenderLayer.method_28115(texture, affectsOutline)
    /**
     * method_62280
     */
    fun getCrosshair(texture: Identifier?) = RenderLayer.method_62280(texture)
    /**
     * method_23573
     */
    fun getEntityAlpha(texture: Identifier?) = RenderLayer.method_23573(texture)
    /**
     * method_23577
     */
    fun getSolid() = RenderLayer.method_23577()
    /**
     * method_34569
     */
    fun of(program: net.minecraft.class_4668.class_5942?) = RenderLayer.method_34569(program)
    /**
     * method_53491
     */
    fun createArmorDecalCutoutNoCull(texture: Identifier?) = RenderLayer.method_53491(texture)
    /**
     * method_62284
     */
    fun getGuiNauseaOverlay() = RenderLayer.method_62284()
    /**
     * method_36435
     */
    fun getTextIntensitySeeThrough(texture: Identifier?) = RenderLayer.method_36435(texture)
    /**
     * method_51784
     */
    fun getGui() = RenderLayer.method_51784()
    /**
     * method_23589
     */
    fun getWaterMask() = RenderLayer.method_23589()
    /**
     * method_24293
     */
    fun getEntityCutoutNoCull(texture: Identifier?, affectsOutline: Boolean) = RenderLayer.method_24293(texture, affectsOutline)
    /**
     * method_30676
     */
    fun getGlintTranslucent() = RenderLayer.method_30676()
    /**
     * method_23584
     */
    fun getEntitySmoothCutout(texture: Identifier?) = RenderLayer.method_23584(texture)
    /**
     * method_23572
     */
    fun getEntitySolid(texture: Identifier?) = RenderLayer.method_23572(texture)
}