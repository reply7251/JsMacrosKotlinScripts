@file:ImportJar("../libs/jars/tweakeroo.jar", "../libs/jars/malilib.jar")

import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.LivingEntityHelper
import fi.dy.masa.tweakeroo.config.FeatureToggle
import fi.dy.masa.tweakeroo.util.CameraEntity
import me.hellrevenger.generated.Map_Nameable.getCustomName
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.EntityHelper

fun getPlayer() =
    if(FeatureToggle.TWEAK_FREE_CAMERA.booleanValue)
        CameraEntity.getCamera()?.let { EntityHelper.create(it) }
    else
        Player.player


EventListener(EventKey::class.java, { e ->
    if(e.action == 1 && e.key == "key.mouse.middle") {
        getPlayer()?.let {
            it.rayTraceEntity(8)?.let {
                (it as? LivingEntityHelper)?.let {
                    val item = it.mainHand
                    Chat.log("entity type: ${it.type}, name: ${it.raw.getCustomName() ?: it.getName()}")
                    Chat.log("item id: ${item.itemId}, name: ${item.name}")
                }
            }
        }
    }
})
Chat.toast("Item Peeker", "enabled")