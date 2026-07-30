@file:ClassPath("test")

import me.hellrevenger.jsmacroskotlinscript.script.library.api.CTargetType
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.RemoveFinal
import me.hellrevenger.jsmacroskotlinscript.script.library.ctransform.ScriptStatic
import net.lenni0451.classtransform.annotations.CShadow
import net.lenni0451.classtransform.annotations.CShared
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.annotations.injection.CModifyExpressionValue
import net.lenni0451.classtransform.annotations.injection.CRedirect
import net.lenni0451.classtransform.annotations.injection.CWrapCondition
import net.minecraft.client.Minecraft
import net.minecraft.network.PacketProcessor
import net.minecraft.util.ModCheck
import xyz.wagyourtail.jsmacros.client.JsMacrosClient
import xyz.wagyourtail.jsmacros.client.config.ClientProfile
import xyz.wagyourtail.jsmacros.client.event.EventRegistry
import xyz.wagyourtail.jsmacros.client.gui.screens.MacroScreen
import xyz.wagyourtail.jsmacros.client.gui.screens.ServiceScreen
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.service.ServiceManager
import xyz.wagyourtail.jsmacros.util.NameUtil
import xyz.wagyourtail.wagyourgui.elements.Button
import java.util.regex.Pattern


@CTransformer(ServiceScreen::class)
class MixinServiceScreen {
    @CInject(method = ["onClose"], target = [CTarget(CTargetType.TAIL)])
    fun onClose() {
        Chat.log("Service Screen onClose END")
    }

    @CRedirect(method = ["onClose"], target = CTarget(CTargetType.SIMPLE_FIELD, "clientCore"))
    fun onGetClientCore(): Core<ClientProfile?, EventRegistry?>? {
        Chat.log("Service Screen onClose clientCore")
        return JsMacrosClient.clientCore
    }

    @CRedirect(method = ["onClose"], target = CTarget(CTargetType.SIMPLE_FIELD, "services"))
    fun onGetServices(core: Core<ClientProfile?, EventRegistry?>): ServiceManager? {
        Chat.log("Service Screen onClose services")
        return core.services
    }

    @CWrapCondition(method = ["onClose"], target = [CTarget(CTargetType.SIMPLE_INVOKE, "onClose")])
    fun onCallOnClose(): Boolean {
        Chat.log("Service Screen onClose calls super")
        return true
    }
}

@CTransformer(MacroScreen::class)
class MixinMacroScreen {
    @CShadow
    private lateinit var runningBtn: Button

    @CInject(method = ["removed"], target = [CTarget(CTargetType.TAIL)])
    fun onClose() {
        Chat.log("MacroScreen onClose END")

        Chat.log("runningBtn: $runningBtn")
    }
}

fun head() {
    Chat.log("guessNameAndRoles head")
}

@ScriptStatic
@CTransformer(NameUtil::class)
class TransformNameUtil {

    // most case just mark fields/methods with @ScriptStatic and don't use companion object
    // also here should only contain @CShadow fields/methods
    companion object {
        // private to prevent getter/setter
        @CShadow
        private lateinit var PATTERN_WHISPER: Pattern

        // sometimes you can also put here
//        @CShadow
//        fun getNameOrDefault(potentialName: CharSequence): String = ""
    }

    // private to prevent getter/setter
    @CShadow("PATTERN_WHISPER")
    private lateinit var PATTERN_WHISPER2: Pattern

    @CShadow // does not support rename @Shadow("getNameOrDefault"), idk why
    fun getNameOrDefault(potentialName: CharSequence): String = ""

    @CRedirect(method = ["guessNameAndRoles"], target = CTarget(CTargetType.SIMPLE_FIELD, "PATTERN_WHISPER"))
    fun onGetPattern(): Pattern {
        Chat.log("guessNameAndRoles onGetPattern $PATTERN_WHISPER")
        return PATTERN_WHISPER2
    }

    @CModifyExpressionValue(method = ["guessNameAndRoles"], target = CTarget(CTargetType.SIMPLE_INVOKE, "getNameOrDefault"))
    fun getNameOrDefault2(old: String): String {
        Chat.log("guessNameAndRoles getNameOrDefault CModifyExpressionValue")
        getNameOrDefault(old)
        return old
    }

    @CInject(method = ["guessNameAndRoles"], target = [CTarget(CTargetType.HEAD)])
    fun guessNameAndRolesHead(@RemoveFinal @CShared("test") test: String) {
        var a = test
        head()
        a = "test"
    }

    @CInject(method = ["guessNameAndRoles"], target = [CTarget(CTargetType.SIMPLE_INVOKE, "add")])
    fun guessNameAndRolesAdd(@RemoveFinal @CShared("test") test: String) {
        Chat.log("guessNameAndRoles simpleAdd: $test")
    }

    @CInject(method = ["guessNameAndRoles"], target = [CTarget(CTargetType.INVOKE, "java/util/List.add(ILjava/lang/Object;)V")])
    fun guessNameAndRolesComplexAdd(@RemoveFinal @CShared("test") test: String) {
        var a = test
        Chat.log("guessNameAndRoles complexAdd: $test")
        a = "test2"
    }
}

@CTransformer(Minecraft::class)
class MixinMinecraft {
    @CShadow
    @ScriptStatic
    private lateinit var instance: Minecraft

    @CShadow
    @ScriptStatic
    private fun checkModStatus() = Unit as ModCheck

    @ScriptStatic
    @CInject(method = ["getLauncherBrand"], target = [CTarget(CTargetType.HEAD)])
    fun getLauncherBrand() {
        Chat.log("getLauncherBrand: $instance")
    }

    @CInject(method = ["createWorldOpenFlows"], target = [CTarget(CTargetType.HEAD)])
    fun createWorldOpenFlows() {
        Chat.log("createWorldOpenFlows: $instance")

        checkModStatus()
    }
}

Minecraft.getInstance().createWorldOpenFlows()
Minecraft.getLauncherBrand()
Chat.log(NameUtil.guessNameAndRoles("<someone> im guessing name and roles"))

RuntimeTransform.transformInOneStep(true)

Minecraft.getInstance().createWorldOpenFlows()
Minecraft.getLauncherBrand()
Chat.log(NameUtil.guessNameAndRoles("<someone> im guessing name and roles"))