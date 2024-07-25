import xyz.wagyourtail.jsmacros.client.api.event.impl.EventTitle

if(event is EventTitle) {
    if((event as EventTitle).type == "ACTIONBAR") {
        Chat.log("receive actionbar")
        Chat.log((event as EventTitle).message)
    }
}



