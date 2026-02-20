


val titles = mutableSetOf<String>()
val subtitles = mutableSetOf<String>()
val unknown = mutableSetOf<String>()

var currentList = listOf<String>()
var index = 0
var currentMode = "title"

var replaying = false
var pressCooldown = 0L

val keys = listOf("key.keyboard.right", "key.keyboard.left")

EventListener(EventType.Title) {
    if (replaying) {
        return@EventListener
    }
    when(it.type.lowercase()) {
        "title" -> titles
        "subtitle" -> subtitles
        "actionbar" -> null
        else -> unknown
    }?.add(it.message!!.json)
}

EventListener(EventType.Key, true) {
    if (!replaying) return@EventListener
    if(it.action != 0)
        return@EventListener
    when (it.key) {
        "key.keyboard.left", "key.keyboard.right" -> {
            it.cancel()
        }
    }
}
fun printTitle(json: String) {
    Chat.log(Chat.createTextBuilder()
        .append("current index: $index - ")
        .append("[copy]").withColor(0, 255, 0)
        .withShowTextHover(Chat.createTextHelperFromString("copy"))
        .withClickEvent("copy_to_clipboard", json)
        .append(" - ")
        .append("[x]")
        .withShowTextHover(Chat.createTextHelperFromString("stop"))
        .withCustomClickEvent(JavaWrapper.methodToJava { ->
            replaying = false
            Chat.log("stopped")
        }).build()
    )
}
fun replay() {
    if (replaying) {
        return
    }
    if(currentList.isEmpty()) {
        Chat.log("No $currentMode found")
        return
    }
    index = 0
    replaying = true
    var flag = true
    while (replaying && currentList.size > index) {
        val json = currentList[index]
        val text = Chat.createTextHelperFromJSON(json)
        val (title, subtitle) = if (currentMode == "title") text to "" else "" to text
        Chat.title(title, subtitle, 0, 20, 0)
        if (flag) {
            flag = false
            printTitle(json)
        }
        for (i in 1..19) {
            Client.waitTick()
            pressCooldown--
            val key = keys.find { it in KeyBind.pressedKeys }
            if (key != null) {
                if (pressCooldown > 0)
                    continue
                index = when (key) {
                    "key.keyboard.right" -> {
                        flag = true
                        (index + 1) % currentList.size
                    }
                    "key.keyboard.left" -> {
                        flag = true
                        (index + currentList.size - 1) % currentList.size
                    }
                    else -> index
                }
                pressCooldown = 10
                break
            } else {
                pressCooldown = 0
            }
        }
    }
}

if (!World.isWorldLoaded) {
    JsMacros.waitForEvent(EventType.ChunkLoad.toString())
}

Chat.commandManager.unregisterCommand("/title")
Chat.commandManager.createCommandBuilder("/title")
    .literalArg("clear")
    .executes(JavaWrapper.methodToJava { ctx ->
        replaying = false
        titles.clear()
        subtitles.clear()
    }).or()
    .literalArg("title")
    .executes(JavaWrapper.methodToJavaAsync { ctx ->
        currentMode = "title"
        currentList = titles.toList()
        replay()
    }).or()
    .literalArg("subtitle")
    .executes(JavaWrapper.methodToJavaAsync { ctx ->
        currentMode = "subtitle"
        currentList = subtitles.toList()
        replay()
    }).register()

context.onContextClosed {
    Chat.commandManager.unregisterCommand("/title")
    replaying = false
}

if (World.isWorldLoaded)
    Chat.toast("Title Recorder", "enabled")