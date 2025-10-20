import me.hellrevenger.library.api.KtGlobals

abstract class MyLib1 {
    abstract fun test1(obj: Any)
}

interface MyLib2 {
    fun test2()
}

interface MyLib0 {
    fun test0(obj: Any)
}

KtGlobals.getWrappedVariable("MyLib0", MyLib0::class)?.test0("test0")
KtGlobals.getWrappedVariable("MyLib1", MyLib1::class)?.test1("test1")
KtGlobals.getWrappedVariable("MyLib2", MyLib2::class)?.test2()