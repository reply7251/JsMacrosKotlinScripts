import me.hellrevenger.jsmacroskotlinscript.script.library.api.KtGlobals


var something: Any? = null

class MyLib0 {
    fun test0(obj: Any) {
        Chat.log("This works, $obj!")
    }
}

abstract class MyLib1 {
    abstract fun test1(obj: Any)
}

interface MyLib2 {
    fun test2()
}

class MyLib1Impl : MyLib1() {
    override fun test1(obj: Any) {
        Chat.log("This also works, $obj!")
        something = obj
    }
}

class MyLib2Impl : MyLib2 {
    override fun test2() {
        Chat.log("This works too, $something!")
    }
}

KtGlobals.addVariable("MyLib1", MyLib1Impl())
KtGlobals.addVariable("MyLib2", MyLib2Impl())
KtGlobals.addVariable("MyLib0", MyLib0())

context.onContextClosed {
    KtGlobals.removeVariable("MyLib0")
    KtGlobals.removeVariable("MyLib1")
    KtGlobals.removeVariable("MyLib2")
}
Chat.log("lib enabled")