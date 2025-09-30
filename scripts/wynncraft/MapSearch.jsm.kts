@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.screens.base.widgets.SearchWidget
import com.wynntils.screens.maps.AbstractMapScreen
import com.wynntils.screens.maps.GuildMapScreen
import com.wynntils.services.map.pois.IconPoi
import com.wynntils.services.map.pois.Poi
import com.wynntils.services.map.pois.PointerPoi
import com.wynntils.services.map.pois.ServicePoi
import com.wynntils.utils.mc.type.PoiLocation
import me.hellrevenger.library.api._invokePrivate
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CLocalVariable
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject

object MixinCallback {
    var searchWidget: SearchWidget? = null

    var lastPoiSize = 1

    var onInit: (instance: Any) -> Unit = {}

    var removePois: (List<Poi>) -> Unit = {}

    var onKeyPressed: (instance: Any, keyCode: Int, scanCode: Int, modifiers: Int,) -> Boolean = { _, _, _, _ -> false }
}

fun matchInput(input: String, name: String): Boolean {
    if (input.startsWith("*")) {
        var inputI = 1
        var nameI = 0
        while (inputI < input.length) {
            val find = name.indexOf(input[inputI], nameI, true)
            if (find == -1) {
                return false
            }
            inputI++
            nameI = find
        }
        return true
    } else {
        return name.contains(input, true)
    }
}

MixinCallback.removePois = removePois@ { pois ->
    val input = MixinCallback.searchWidget?.textBoxInput ?: return@removePois
    (pois as? MutableList<Poi>)?.apply {
        removeIf { !matchInput(input, it.name) }
    }
    MixinCallback.lastPoiSize = pois.filterNot { it is ServicePoi }.size
}
MixinCallback.onInit = { instance: Any ->
    val zhis = instance as AbstractMapScreen
    val width = zhis.field_22789
    MixinCallback.searchWidget = SearchWidget(width / 2 - 100, 30, 200, 20, { }, zhis)

    zhis._invokePrivate<Any>("method_37063", arrayOf(MixinCallback.searchWidget!!))
}
MixinCallback.onKeyPressed = onKeyPressed@ { instance, keyCode, scanCode, modifiers ->
    val zhis = instance as AbstractMapScreen
    zhis.focusedTextInput?.method_25404(keyCode, scanCode, modifiers) == true
}

@CTransformer(AbstractMapScreen::class)
class MixinAbstractMapScreen {
    @CInject(method = ["doInit"], target = [CTarget("TAIL")])
    fun onInit() {
        MixinCallback.onInit(this)
    }

    @CInject(method = ["method_25404"], target = [CTarget("HEAD")], cancellable = true)
    fun onKeyPressed(keyCode: Int, scanCode: Int, modifiers: Int, callback: InjectionCallback) {
        if (MixinCallback.onKeyPressed(this, keyCode, scanCode, modifiers)) {
            callback.returnValue = true
            callback.isCancelled = true
        }
    }
    @CInject(method = ["getRenderedPois"], target = [CTarget("HEAD")])
    fun onGetRenderedPois(@CLocalVariable(ordinal = 0) pois: List<Poi>) {
        MixinCallback.removePois(pois)
    }
}

@CTransformer(IconPoi::class)
class MixinIconPoi {
    @CInject(method = ["getIconAlpha"], target = [CTarget("HEAD")], cancellable = true)
    fun onGetIconAlpha(callback: InjectionCallback) {
        if(this !is ServicePoi && MixinCallback.lastPoiSize < 50) {
            callback.returnValue = 1f
            callback.isCancelled = true
        }
    }
}

if (!World.isWorldLoaded) {
    JsMacros.waitForEvent(EventType.ChunkLoad.toString())
}
GuildMapScreen.create()
PointerPoi { PoiLocation(0, 0, 0) }.isVisible(1f, 1f)

RuntimeTransform.init()
RuntimeTransform.addTransformer(MixinAbstractMapScreen::class)
RuntimeTransform.addTransformer(MixinIconPoi::class)
RuntimeTransform.transform()