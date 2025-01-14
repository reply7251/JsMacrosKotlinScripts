import me.hellrevenger.library.api.KtGlobals

var a = 1

KtGlobals.addCallable("test", fun() {
    Chat.log("a: " + a++)
})

