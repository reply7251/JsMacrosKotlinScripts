import me.hellrevenger.library.api.EventListener
import xyz.wagyourtail.jsmacros.client.api.event.impl.inventory.EventClickSlot
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

var spamming = false

//EventListener()

val updateTitle = "\uDAFF\uDFF8\uE01C"

fun getTitle() = Hud.openScreen?.titleText?.stringStripFormatting

EventListener(context, EventClickSlot::class.java, { e ->
    if(e.mode != 1 || e.button != 0) return@EventListener
    val inv = e.inventory
    val item = inv.getSlot(e.slot)


    val text = getTitle() ?: return@EventListener
    //Chat.log(Chat.createTextBuilder().append("copy: ").append(text).withClickEvent("copy_to_clipboard", text).build())
    if(!spamming && !item.isEmpty && text.contains(updateTitle)) {
        if(!item.name.stringStripFormatting.contains("Powder") || item.count < 4) return@EventListener
        e.cancel()
        thread {
            spamming = true
            for (i in 0..4) {
                inv.click(e.slot)
                Client.waitTick(4)
            }
            while (spamming && inv.getSlot(e.slot).count > 3 && getTitle()?.contains(updateTitle) == true) {
                inv.click(17)
                Client.waitTick(4)
            }
            spamming = false
        }
    }
})

val service = event as EventService
service.unregisterOnStop(true)

service.stopListener = JavaWrapper.methodToJava { ->
    spamming = false
}

Chat.toast("powder", "enabled")