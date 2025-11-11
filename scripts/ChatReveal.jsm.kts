

EventListener(EventType.ReceiveMessage, true) { event ->
    event.text = event.text?.let { text ->
        Chat.createTextBuilder().append(text).append(" ").append("[cp]")
            .withShowTextHover(Chat.createTextHelperFromString("copy"))
            .withClickEvent("copy_to_clipboard", text.json)
            .withColor(10)
            .build()
    }
}