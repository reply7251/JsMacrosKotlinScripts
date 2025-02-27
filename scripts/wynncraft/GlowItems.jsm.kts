
import me.hellrevenger.library.api.WorldPosWrapper
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventEntityLoad
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

var running = true
val queue = mutableListOf<EntityHelper<*>>()

val fabled = mapOf("purple glazed" to "Tangible Intangibility", "beacon" to "Golem Capacitor", "totem of" to "Relic of Shattering")
val legend = mapOf(
    "block of iron" to "Large Metal Chunk", "black stained glass" to "Black Prism",
    "clock" to "Luxury Timepiece", "mushroom s" to "Miracle Leftovers",
    "daylight d" to "History Textbook"
)
val legendDamage = mapOf(65 to "Small Ruby", 53 to "Precious Mineral")
val rare = mapOf(
    "paper" to "Almanac Page", "flower pot" to "Abandoned Pot",
    "iron trap" to "Metal Plate", "nether b" to "Packaged Brownie",
    "carrot on " to "Hobby Horse", "shulker sh" to "Void Carapace",
    "piston" to "Due Delivery",
    "brewing s" to "Lone Component", "end rod" to "Steel Rod",
    "glass bottle" to "Bottle of Yogurt", "grass b" to "Arable Chunk"
)
val rareDamages = mapOf(61 to "Missing Coinage", 66 to "Elestial Voidstone", 25 to "Frying pan")
val common = arrayOf(
    "clay", "sand", "slimeball", "chorus", "white glazed", "iron nug", "pink tulip", "flint", "brick",
    "stone button", "stick"
)
val commonDamage = arrayOf(96, 28)
val required = arrayOf("none none")

val d2d = Hud.createDraw2D()
d2d.register()

fun check(entity: EntityHelper<*>) {
    if(entity.type != "minecraft:item") return

    val item = entity.asItem().containedItemStack
    val origName = item.name ?: entity.name
    var name = origName


    if(common.any { item.name.stringStripFormatting.contains(it, true) }
        && !required.any { item.name.stringStripFormatting.contains(it, true) } || commonDamage.contains(item.damage)) {
        name = Chat.createTextBuilder().build()
    }

    rare.firstNotNullOfOrNull {
        if(origName.stringStripFormatting.contains(it.key, true)) {
            name = Chat.createTextBuilder().append("*").append(it.value).append("*").build()
            1
        }
        else null
    }
    rareDamages[item.damage]?.let {
        name = Chat.createTextBuilder().append("*").append(it).append("*").build()
    }

    legend.firstNotNullOfOrNull {
        if(origName.stringStripFormatting.contains(it.key, true)) {
            name = Chat.createTextBuilder().append("**").append(it.value).append("**").build()
            1
        }
        else null
    }
    legendDamage[item.damage]?.let {
        name = Chat.createTextBuilder().append("**").append(it).append("**").build()
    }

    fabled.firstNotNullOfOrNull {
        if(origName.stringStripFormatting.contains(it.key, true)) {
            name = Chat.createTextBuilder().append("***").append(it.value).append("***").build()
            1
        }
        else null
    }
    if(item.damage > 0 && origName == name) {
        name = Chat.createTextBuilder().append(name).append("/" + item.damage).build()
    }
    val d2d2 = Hud.createDraw2D()
    d2d2.lineBuilder().pos(0,0,8, -7).color(0xffffff, 0xBF).buildAndAdd()
    d2d2.textBuilder().pos(9, -16).text(name).shadow(true).buildAndAdd()
    WorldPosWrapper(d2d2).move(0.0, 0.7, 0.0).bind(entity).addToDraw2d(d2d)
}

thread {
    while(running) {
        while(queue.isNotEmpty())
            check(queue.removeFirst())
        Client.waitTick()
    }
}

EventListener(EventEntityLoad::class.java, {
    queue.add(it.entity)
}, true)



EventListener(EventKey::class.java, {
    if(it.action == 0 && it.key == "key.keyboard.left.shift") {
        Client.waitTick(2)
        KeyBind.pressKeyBind("key.jump")
        Client.waitTick()
        KeyBind.releaseKeyBind("key.jump")
    }
})

JsMacros.assertEvent(event, "Service")
val service = event as EventService
service.unregisterOnStop(true)

service.stopListener = JavaWrapper.methodToJava { ->
    running = false
    d2d.unregister()
}
World.entities?.forEach {
    check(it)
}

Chat.toast("Glowing", "enabled")